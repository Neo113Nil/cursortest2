package org.modelmapper.internal.bytebuddy.pool;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericSignatureFormatError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.ClassReader;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.TypePath;
import org.modelmapper.internal.asm.TypeReference;
import org.modelmapper.internal.asm.signature.SignatureReader;
import org.modelmapper.internal.asm.signature.SignatureVisitor;
import org.modelmapper.internal.bytebuddy.build.CachedReturnPlugin;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.TypeVariableSource;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.type.PackageDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.implementation.MethodDelegation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;

/* loaded from: classes4.dex */
public interface TypePool {
    void clear();

    Resolution describe(String str);

    public interface Resolution {
        boolean isResolved();

        TypeDescription resolve();

        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements Resolution {
            private final TypeDescription typeDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((Simple) obj).typeDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
            public boolean isResolved() {
                return true;
            }

            public Simple(TypeDescription typeDescription) {
                this.typeDescription = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
            public TypeDescription resolve() {
                return this.typeDescription;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Illegal implements Resolution {
            private final String name;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.name.equals(((Illegal) obj).name);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
            public boolean isResolved() {
                return false;
            }

            public Illegal(String str) {
                this.name = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
            public TypeDescription resolve() {
                throw new IllegalStateException("Cannot resolve type description for " + this.name);
            }
        }
    }

    public interface CacheProvider {
        public static final Resolution UNRESOLVED = null;

        void clear();

        Resolution find(String str);

        Resolution register(String str, Resolution resolution);

        public enum NoOp implements CacheProvider {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.CacheProvider
            public void clear() {
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.CacheProvider
            public Resolution register(String str, Resolution resolution) {
                return resolution;
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.CacheProvider
            public Resolution find(String str) {
                return UNRESOLVED;
            }
        }

        public static class Simple implements CacheProvider {
            private final ConcurrentMap<String, Resolution> cache = new ConcurrentHashMap();

            public static CacheProvider withObjectType() {
                Simple simple = new Simple();
                simple.register(Object.class.getName(), new Resolution.Simple(TypeDescription.OBJECT));
                return simple;
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.CacheProvider
            public Resolution find(String str) {
                return this.cache.get(str);
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.CacheProvider
            public Resolution register(String str, Resolution resolution) {
                Resolution putIfAbsent = this.cache.putIfAbsent(str, resolution);
                return putIfAbsent == null ? resolution : putIfAbsent;
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.CacheProvider
            public void clear() {
                this.cache.clear();
            }
        }
    }

    public enum Empty implements TypePool {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool
        public void clear() {
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool
        public Resolution describe(String str) {
            return new Resolution.Illegal(str);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class AbstractBase implements TypePool {
        private static final String ARRAY_SYMBOL = "[";
        protected static final Map<String, String> PRIMITIVE_DESCRIPTORS;
        protected static final Map<String, TypeDescription> PRIMITIVE_TYPES;
        protected final CacheProvider cacheProvider;

        protected abstract Resolution doDescribe(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.cacheProvider.equals(((AbstractBase) obj).cacheProvider);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.cacheProvider.hashCode();
        }

        static {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Class[] clsArr = {Boolean.TYPE, Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
            for (int i = 0; i < 9; i++) {
                Class cls = clsArr[i];
                hashMap.put(cls.getName(), TypeDescription.ForLoadedType.of(cls));
                hashMap2.put(Type.getDescriptor(cls), cls.getName());
            }
            PRIMITIVE_TYPES = Collections.unmodifiableMap(hashMap);
            PRIMITIVE_DESCRIPTORS = Collections.unmodifiableMap(hashMap2);
        }

        protected AbstractBase(CacheProvider cacheProvider) {
            this.cacheProvider = cacheProvider;
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool
        public Resolution describe(String str) {
            if (str.contains("/")) {
                throw new IllegalArgumentException(str + " contains the illegal character '/'");
            }
            int i = 0;
            while (str.startsWith("[")) {
                i++;
                str = str.substring(1);
            }
            if (i > 0) {
                String str2 = PRIMITIVE_DESCRIPTORS.get(str);
                str = str2 == null ? str.substring(1, str.length() - 1) : str2;
            }
            TypeDescription typeDescription = PRIMITIVE_TYPES.get(str);
            Resolution find = typeDescription == null ? this.cacheProvider.find(str) : new Resolution.Simple(typeDescription);
            if (find == null) {
                find = doCache(str, doDescribe(str));
            }
            return ArrayTypeResolution.of(find, i);
        }

        protected Resolution doCache(String str, Resolution resolution) {
            return this.cacheProvider.register(str, resolution);
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool
        public void clear() {
            this.cacheProvider.clear();
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class Hierarchical extends AbstractBase {
            private final TypePool parent;

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
            public boolean equals(Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.parent.equals(((Hierarchical) obj).parent);
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
            public int hashCode() {
                return (super.hashCode() * 31) + this.parent.hashCode();
            }

            protected Hierarchical(CacheProvider cacheProvider, TypePool typePool) {
                super(cacheProvider);
                this.parent = typePool;
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase, org.modelmapper.internal.bytebuddy.pool.TypePool
            public Resolution describe(String str) {
                Resolution describe = this.parent.describe(str);
                return describe.isResolved() ? describe : super.describe(str);
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase, org.modelmapper.internal.bytebuddy.pool.TypePool
            public void clear() {
                try {
                    this.parent.clear();
                } finally {
                    super.clear();
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class ArrayTypeResolution implements Resolution {
            private final int arity;
            private final Resolution resolution;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ArrayTypeResolution arrayTypeResolution = (ArrayTypeResolution) obj;
                return this.resolution.equals(arrayTypeResolution.resolution) && this.arity == arrayTypeResolution.arity;
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.resolution.hashCode()) * 31) + this.arity;
            }

            protected ArrayTypeResolution(Resolution resolution, int i) {
                this.resolution = resolution;
                this.arity = i;
            }

            protected static Resolution of(Resolution resolution, int i) {
                return i == 0 ? resolution : new ArrayTypeResolution(resolution, i);
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
            public boolean isResolved() {
                return this.resolution.isResolved();
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
            public TypeDescription resolve() {
                return TypeDescription.ArrayProjection.of(this.resolution.resolve(), this.arity);
            }
        }

        protected static class RawAnnotationValue extends AnnotationValue.AbstractBase<AnnotationDescription, Annotation> {
            private final Default.LazyTypeDescription.AnnotationToken annotationToken;
            private final TypePool typePool;

            public RawAnnotationValue(TypePool typePool, Default.LazyTypeDescription.AnnotationToken annotationToken) {
                this.typePool = typePool;
                this.annotationToken = annotationToken;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
            public AnnotationDescription resolve() {
                return this.annotationToken.toAnnotationDescription(this.typePool).resolve();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
            public AnnotationValue.Loaded<Annotation> load(ClassLoader classLoader) throws ClassNotFoundException {
                Class<?> cls = Class.forName(this.annotationToken.getBinaryName(), false, classLoader);
                if (cls.isAnnotation()) {
                    return new AnnotationValue.ForAnnotationDescription.Loaded(AnnotationDescription.AnnotationInvocationHandler.of(classLoader, cls, this.annotationToken.getValues()));
                }
                return new AnnotationValue.ForAnnotationDescription.IncompatibleRuntimeType(cls);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof AnnotationValue) && resolve().equals(((AnnotationValue) obj).resolve()));
            }

            public int hashCode() {
                return resolve().hashCode();
            }

            public String toString() {
                return resolve().toString();
            }
        }

        protected static class RawEnumerationValue extends AnnotationValue.AbstractBase<EnumerationDescription, Enum<?>> {
            private final String descriptor;
            private final TypePool typePool;
            private final String value;

            public RawEnumerationValue(TypePool typePool, String str, String str2) {
                this.typePool = typePool;
                this.descriptor = str;
                this.value = str2;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
            public EnumerationDescription resolve() {
                return new LazyEnumerationDescription();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
            public AnnotationValue.Loaded<Enum<?>> load(ClassLoader classLoader) throws ClassNotFoundException {
                String str = this.descriptor;
                Class<?> cls = Class.forName(str.substring(1, str.length() - 1).replace('/', Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), false, classLoader);
                try {
                    return cls.isEnum() ? new AnnotationValue.ForEnumerationDescription.Loaded(Enum.valueOf(cls, this.value)) : new AnnotationValue.ForEnumerationDescription.IncompatibleRuntimeType(cls);
                } catch (IllegalArgumentException unused) {
                    return new AnnotationValue.ForEnumerationDescription.UnknownRuntimeEnumeration(cls, this.value);
                }
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof AnnotationValue) && resolve().equals(((AnnotationValue) obj).resolve()));
            }

            public int hashCode() {
                return resolve().hashCode();
            }

            public String toString() {
                return resolve().toString();
            }

            protected class LazyEnumerationDescription extends EnumerationDescription.AbstractBase {
                protected LazyEnumerationDescription() {
                }

                @Override // org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription
                public String getValue() {
                    return RawEnumerationValue.this.value;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription
                public TypeDescription getEnumerationType() {
                    return RawEnumerationValue.this.typePool.describe(RawEnumerationValue.this.descriptor.substring(1, RawEnumerationValue.this.descriptor.length() - 1).replace('/', Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)).resolve();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription
                public <T extends Enum<T>> T load(Class<T> cls) {
                    return (T) Enum.valueOf(cls, RawEnumerationValue.this.value);
                }
            }
        }

        protected static class RawTypeValue extends AnnotationValue.AbstractBase<TypeDescription, Class<?>> {
            private static final boolean NO_INITIALIZATION = false;
            private final String name;
            private final TypePool typePool;

            protected RawTypeValue(TypePool typePool, Type type) {
                String className;
                this.typePool = typePool;
                if (type.getSort() == 9) {
                    className = type.getInternalName().replace('/', Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                } else {
                    className = type.getClassName();
                }
                this.name = className;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
            public TypeDescription resolve() {
                return this.typePool.describe(this.name).resolve();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
            public AnnotationValue.Loaded<Class<?>> load(ClassLoader classLoader) throws ClassNotFoundException {
                return new Loaded(Class.forName(this.name, false, classLoader));
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof AnnotationValue) && resolve().equals(((AnnotationValue) obj).resolve()));
            }

            public int hashCode() {
                return resolve().hashCode();
            }

            public String toString() {
                return AnnotationValue.RenderingDispatcher.CURRENT.toSourceString(resolve());
            }

            protected static class Loaded extends AnnotationValue.Loaded.AbstractBase<Class<?>> {
                private final Class<?> type;

                public Loaded(Class<?> cls) {
                    this.type = cls;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue.Loaded
                public AnnotationValue.Loaded.State getState() {
                    return AnnotationValue.Loaded.State.RESOLVED;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue.Loaded, org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
                public Class<?> resolve() {
                    return this.type;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue.Loaded
                public boolean represents(Object obj) {
                    return this.type.equals(obj);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AnnotationValue.Loaded)) {
                        return false;
                    }
                    AnnotationValue.Loaded loaded = (AnnotationValue.Loaded) obj;
                    return loaded.getState().isResolved() && this.type.equals(loaded.resolve());
                }

                public int hashCode() {
                    return this.type.hashCode();
                }

                public String toString() {
                    return AnnotationValue.RenderingDispatcher.CURRENT.toSourceString(TypeDescription.ForLoadedType.of(this.type));
                }
            }
        }

        protected static class RawDescriptionArray extends AnnotationValue.AbstractBase<Object[], Object[]> {
            private final ComponentTypeReference componentTypeReference;
            private final TypePool typePool;
            private List<AnnotationValue<?, ?>> values;

            public interface ComponentTypeReference {
                String lookup();
            }

            public RawDescriptionArray(TypePool typePool, ComponentTypeReference componentTypeReference, List<AnnotationValue<?, ?>> list) {
                this.typePool = typePool;
                this.values = list;
                this.componentTypeReference = componentTypeReference;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
            public Object[] resolve() {
                Class cls;
                TypeDescription resolve = this.typePool.describe(this.componentTypeReference.lookup()).resolve();
                if (resolve.represents(Class.class)) {
                    cls = TypeDescription.class;
                } else if (resolve.isAssignableTo(Enum.class)) {
                    cls = EnumerationDescription.class;
                } else if (resolve.isAssignableTo(Annotation.class)) {
                    cls = AnnotationDescription.class;
                } else if (resolve.represents(String.class)) {
                    cls = String.class;
                } else {
                    throw new IllegalStateException("Unexpected complex array component type " + resolve);
                }
                Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, this.values.size());
                Iterator<AnnotationValue<?, ?>> it = this.values.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Array.set(objArr, i, it.next().resolve());
                    i++;
                }
                return objArr;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
            public AnnotationValue.Loaded<Object[]> load(ClassLoader classLoader) throws ClassNotFoundException {
                ArrayList arrayList = new ArrayList(this.values.size());
                Iterator<AnnotationValue<?, ?>> it = this.values.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().load(classLoader));
                }
                return new Loaded(Class.forName(this.componentTypeReference.lookup(), false, classLoader), arrayList);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnnotationValue)) {
                    return false;
                }
                Object resolve = ((AnnotationValue) obj).resolve();
                return (resolve instanceof Object[]) && Arrays.equals(resolve(), (Object[]) resolve);
            }

            public int hashCode() {
                return Arrays.hashCode(resolve());
            }

            public String toString() {
                return AnnotationValue.RenderingDispatcher.CURRENT.toSourceString(this.values);
            }

            protected static class Loaded extends AnnotationValue.Loaded.AbstractBase<Object[]> {
                private final Class<?> componentType;
                private final List<AnnotationValue.Loaded<?>> values;

                public Loaded(Class<?> cls, List<AnnotationValue.Loaded<?>> list) {
                    this.componentType = cls;
                    this.values = list;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue.Loaded
                public AnnotationValue.Loaded.State getState() {
                    Iterator<AnnotationValue.Loaded<?>> it = this.values.iterator();
                    while (it.hasNext()) {
                        if (!it.next().getState().isResolved()) {
                            return AnnotationValue.Loaded.State.UNRESOLVED;
                        }
                    }
                    return AnnotationValue.Loaded.State.RESOLVED;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue.Loaded, org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue
                public Object[] resolve() {
                    Object[] objArr = (Object[]) Array.newInstance(this.componentType, this.values.size());
                    Iterator<AnnotationValue.Loaded<?>> it = this.values.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Array.set(objArr, i, it.next().resolve());
                        i++;
                    }
                    return objArr;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue.Loaded
                public boolean represents(Object obj) {
                    if (!(obj instanceof Object[]) || obj.getClass().getComponentType() != this.componentType) {
                        return false;
                    }
                    Object[] objArr = (Object[]) obj;
                    if (this.values.size() != objArr.length) {
                        return false;
                    }
                    Iterator<AnnotationValue.Loaded<?>> it = this.values.iterator();
                    for (Object obj2 : objArr) {
                        AnnotationValue.Loaded<?> next = it.next();
                        if (!next.getState().isResolved() || !next.represents(obj2)) {
                            return false;
                        }
                    }
                    return true;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AnnotationValue.Loaded)) {
                        return false;
                    }
                    AnnotationValue.Loaded loaded = (AnnotationValue.Loaded) obj;
                    if (!loaded.getState().isResolved()) {
                        return false;
                    }
                    Object resolve = loaded.resolve();
                    if (!(resolve instanceof Object[])) {
                        return false;
                    }
                    Object[] objArr = (Object[]) resolve;
                    if (this.values.size() != objArr.length) {
                        return false;
                    }
                    Iterator<AnnotationValue.Loaded<?>> it = this.values.iterator();
                    for (Object obj2 : objArr) {
                        if (!it.next().resolve().equals(obj2)) {
                            return false;
                        }
                    }
                    return true;
                }

                public int hashCode() {
                    Iterator<AnnotationValue.Loaded<?>> it = this.values.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        i = (i * 31) + it.next().hashCode();
                    }
                    return i;
                }

                public String toString() {
                    return AnnotationValue.RenderingDispatcher.CURRENT.toSourceString(this.values);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default extends AbstractBase.Hierarchical {
        private static final MethodVisitor IGNORE_METHOD = null;
        protected final ClassFileLocator classFileLocator;
        protected final ReaderMode readerMode;

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r5 = (Default) obj;
            return this.classFileLocator.equals(r5.classFileLocator) && this.readerMode.equals(r5.readerMode);
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public int hashCode() {
            return (((super.hashCode() * 31) + this.classFileLocator.hashCode()) * 31) + this.readerMode.hashCode();
        }

        public Default(CacheProvider cacheProvider, ClassFileLocator classFileLocator, ReaderMode readerMode) {
            this(cacheProvider, classFileLocator, readerMode, Empty.INSTANCE);
        }

        public Default(CacheProvider cacheProvider, ClassFileLocator classFileLocator, ReaderMode readerMode, TypePool typePool) {
            super(cacheProvider, typePool);
            this.classFileLocator = classFileLocator;
            this.readerMode = readerMode;
        }

        public static TypePool ofClassPath() {
            return of(ClassFileLocator.ForClassLoader.ofClassPath());
        }

        public static TypePool of(ClassLoader classLoader) {
            return of(ClassFileLocator.ForClassLoader.of(classLoader));
        }

        public static TypePool of(ClassFileLocator classFileLocator) {
            return new Default(new CacheProvider.Simple(), classFileLocator, ReaderMode.FAST);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public Resolution doDescribe(String str) {
            try {
                ClassFileLocator.Resolution locate = this.classFileLocator.locate(str);
                return locate.isResolved() ? new Resolution.Simple(parse(locate.resolve())) : new Resolution.Illegal(str);
            } catch (IOException e) {
                throw new IllegalStateException("Error while reading class file", e);
            }
        }

        private TypeDescription parse(byte[] bArr) {
            ClassReader of = OpenedClassReader.of(bArr);
            TypeExtractor typeExtractor = new TypeExtractor();
            of.accept(typeExtractor, this.readerMode.getFlags());
            return typeExtractor.toTypeDescription();
        }

        public enum ReaderMode {
            EXTENDED(4),
            FAST(1);

            private final int flags;

            ReaderMode(int i) {
                this.flags = i;
            }

            protected int getFlags() {
                return this.flags;
            }

            public boolean isExtended() {
                return this == EXTENDED;
            }
        }

        public static class WithLazyResolution extends Default {
            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
            protected Resolution doCache(String str, Resolution resolution) {
                return resolution;
            }

            public WithLazyResolution(CacheProvider cacheProvider, ClassFileLocator classFileLocator, ReaderMode readerMode) {
                this(cacheProvider, classFileLocator, readerMode, Empty.INSTANCE);
            }

            public WithLazyResolution(CacheProvider cacheProvider, ClassFileLocator classFileLocator, ReaderMode readerMode, TypePool typePool) {
                super(cacheProvider, classFileLocator, readerMode, typePool);
            }

            public static TypePool ofClassPath() {
                return of(ClassFileLocator.ForClassLoader.ofClassPath());
            }

            public static TypePool of(ClassLoader classLoader) {
                return of(ClassFileLocator.ForClassLoader.of(classLoader));
            }

            public static TypePool of(ClassFileLocator classFileLocator) {
                return new WithLazyResolution(new CacheProvider.Simple(), classFileLocator, ReaderMode.FAST);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default, org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
            public Resolution doDescribe(String str) {
                return new LazyResolution(str);
            }

            protected Resolution doResolve(String str) {
                Resolution find = this.cacheProvider.find(str);
                return find == null ? this.cacheProvider.register(str, super.doDescribe(str)) : find;
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class LazyResolution implements Resolution {
                private final String name;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    LazyResolution lazyResolution = (LazyResolution) obj;
                    return this.name.equals(lazyResolution.name) && WithLazyResolution.this.equals(WithLazyResolution.this);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + WithLazyResolution.this.hashCode();
                }

                protected LazyResolution(String str) {
                    this.name = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
                public boolean isResolved() {
                    return WithLazyResolution.this.doResolve(this.name).isResolved();
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
                public TypeDescription resolve() {
                    return WithLazyResolution.this.new LazyTypeDescription(this.name);
                }
            }

            protected class LazyTypeDescription extends TypeDescription.AbstractBase.OfSimpleType.WithDelegation {
                private transient /* synthetic */ TypeDescription delegate;
                private final String name;

                protected LazyTypeDescription(String str) {
                    this.name = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getName() {
                    return this.name;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType.WithDelegation
                @CachedReturnPlugin.Enhance(MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX)
                protected TypeDescription delegate() {
                    TypeDescription resolve = this.delegate != null ? null : WithLazyResolution.this.doResolve(this.name).resolve();
                    if (resolve == null) {
                        return this.delegate;
                    }
                    this.delegate = resolve;
                    return resolve;
                }
            }
        }

        protected interface AnnotationRegistrant {
            void onComplete();

            void register(String str, AnnotationValue<?, ?> annotationValue);

            public static abstract class AbstractBase implements AnnotationRegistrant {
                private final String descriptor;
                private final Map<String, AnnotationValue<?, ?>> values = new HashMap();

                protected abstract List<LazyTypeDescription.AnnotationToken> getTokens();

                protected AbstractBase(String str) {
                    this.descriptor = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                public void register(String str, AnnotationValue<?, ?> annotationValue) {
                    this.values.put(str, annotationValue);
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                public void onComplete() {
                    getTokens().add(new LazyTypeDescription.AnnotationToken(this.descriptor, this.values));
                }

                protected static abstract class ForTypeVariable extends AbstractBase {
                    private final String typePath;

                    protected abstract Map<String, List<LazyTypeDescription.AnnotationToken>> getPathMap();

                    protected ForTypeVariable(String str, TypePath typePath) {
                        super(str);
                        String typePath2;
                        if (typePath == null) {
                            typePath2 = "";
                        } else {
                            typePath2 = typePath.toString();
                        }
                        this.typePath = typePath2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase
                    protected List<LazyTypeDescription.AnnotationToken> getTokens() {
                        Map<String, List<LazyTypeDescription.AnnotationToken>> pathMap = getPathMap();
                        List<LazyTypeDescription.AnnotationToken> list = pathMap.get(this.typePath);
                        if (list != null) {
                            return list;
                        }
                        ArrayList arrayList = new ArrayList();
                        pathMap.put(this.typePath, arrayList);
                        return arrayList;
                    }

                    protected static abstract class WithIndex extends ForTypeVariable {
                        private final int index;

                        protected abstract Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> getIndexedPathMap();

                        protected WithIndex(String str, TypePath typePath, int i) {
                            super(str, typePath);
                            this.index = i;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable
                        protected Map<String, List<LazyTypeDescription.AnnotationToken>> getPathMap() {
                            Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> indexedPathMap = getIndexedPathMap();
                            Map<String, List<LazyTypeDescription.AnnotationToken>> map = indexedPathMap.get(Integer.valueOf(this.index));
                            if (map != null) {
                                return map;
                            }
                            HashMap hashMap = new HashMap();
                            indexedPathMap.put(Integer.valueOf(this.index), hashMap);
                            return hashMap;
                        }

                        protected static abstract class DoubleIndexed extends WithIndex {
                            private final int preIndex;

                            protected abstract Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>>> getDoubleIndexedPathMap();

                            protected DoubleIndexed(String str, TypePath typePath, int i, int i2) {
                                super(str, typePath, i);
                                this.preIndex = i2;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex
                            protected Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> getIndexedPathMap() {
                                Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>>> doubleIndexedPathMap = getDoubleIndexedPathMap();
                                Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> map = doubleIndexedPathMap.get(Integer.valueOf(this.preIndex));
                                if (map != null) {
                                    return map;
                                }
                                HashMap hashMap = new HashMap();
                                doubleIndexedPathMap.put(Integer.valueOf(this.preIndex), hashMap);
                                return hashMap;
                            }
                        }
                    }
                }
            }

            public static class ForByteCodeElement extends AbstractBase {
                private final List<LazyTypeDescription.AnnotationToken> annotationTokens;

                protected ForByteCodeElement(String str, List<LazyTypeDescription.AnnotationToken> list) {
                    super(str);
                    this.annotationTokens = list;
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase
                protected List<LazyTypeDescription.AnnotationToken> getTokens() {
                    return this.annotationTokens;
                }

                public static class WithIndex extends AbstractBase {
                    private final Map<Integer, List<LazyTypeDescription.AnnotationToken>> annotationTokens;
                    private final int index;

                    protected WithIndex(String str, int i, Map<Integer, List<LazyTypeDescription.AnnotationToken>> map) {
                        super(str);
                        this.index = i;
                        this.annotationTokens = map;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase
                    protected List<LazyTypeDescription.AnnotationToken> getTokens() {
                        List<LazyTypeDescription.AnnotationToken> list = this.annotationTokens.get(Integer.valueOf(this.index));
                        if (list != null) {
                            return list;
                        }
                        ArrayList arrayList = new ArrayList();
                        this.annotationTokens.put(Integer.valueOf(this.index), arrayList);
                        return arrayList;
                    }
                }
            }

            public static class ForTypeVariable extends AbstractBase.ForTypeVariable {
                private final Map<String, List<LazyTypeDescription.AnnotationToken>> pathMap;

                protected ForTypeVariable(String str, TypePath typePath, Map<String, List<LazyTypeDescription.AnnotationToken>> map) {
                    super(str, typePath);
                    this.pathMap = map;
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable
                protected Map<String, List<LazyTypeDescription.AnnotationToken>> getPathMap() {
                    return this.pathMap;
                }

                public static class WithIndex extends AbstractBase.ForTypeVariable.WithIndex {
                    private final Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> indexedPathMap;

                    protected WithIndex(String str, TypePath typePath, int i, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> map) {
                        super(str, typePath, i);
                        this.indexedPathMap = map;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex
                    protected Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> getIndexedPathMap() {
                        return this.indexedPathMap;
                    }

                    public static class DoubleIndexed extends AbstractBase.ForTypeVariable.WithIndex.DoubleIndexed {
                        private final Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>>> doubleIndexedPathMap;

                        protected DoubleIndexed(String str, TypePath typePath, int i, int i2, Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>>> map) {
                            super(str, typePath, i, i2);
                            this.doubleIndexedPathMap = map;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex.DoubleIndexed
                        protected Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>>> getDoubleIndexedPathMap() {
                            return this.doubleIndexedPathMap;
                        }
                    }
                }
            }
        }

        protected interface ComponentTypeLocator {
            AbstractBase.RawDescriptionArray.ComponentTypeReference bind(String str);

            public enum Illegal implements ComponentTypeLocator {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public AbstractBase.RawDescriptionArray.ComponentTypeReference bind(String str) {
                    throw new IllegalStateException("Unexpected lookup of component type for " + str);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForAnnotationProperty implements ComponentTypeLocator {
                private final String annotationName;
                private final TypePool typePool;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForAnnotationProperty forAnnotationProperty = (ForAnnotationProperty) obj;
                    return this.typePool.equals(forAnnotationProperty.typePool) && this.annotationName.equals(forAnnotationProperty.annotationName);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typePool.hashCode()) * 31) + this.annotationName.hashCode();
                }

                public ForAnnotationProperty(TypePool typePool, String str) {
                    this.typePool = typePool;
                    this.annotationName = str.substring(1, str.length() - 1).replace('/', LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public AbstractBase.RawDescriptionArray.ComponentTypeReference bind(String str) {
                    return new Bound(str);
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class Bound implements AbstractBase.RawDescriptionArray.ComponentTypeReference {
                    private final String name;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Bound bound = (Bound) obj;
                        return this.name.equals(bound.name) && ForAnnotationProperty.this.equals(ForAnnotationProperty.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + ForAnnotationProperty.this.hashCode();
                    }

                    protected Bound(String str) {
                        this.name = str;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase.RawDescriptionArray.ComponentTypeReference
                    public String lookup() {
                        return ((MethodDescription.InDefinedShape) ForAnnotationProperty.this.typePool.describe(ForAnnotationProperty.this.annotationName).resolve().getDeclaredMethods().filter(ElementMatchers.named(this.name)).getOnly()).getReturnType().asErasure().getComponentType().getName();
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForArrayType implements ComponentTypeLocator, AbstractBase.RawDescriptionArray.ComponentTypeReference {
                private final String componentType;

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public AbstractBase.RawDescriptionArray.ComponentTypeReference bind(String str) {
                    return this;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.componentType.equals(((ForArrayType) obj).componentType);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.componentType.hashCode();
                }

                public ForArrayType(String str) {
                    this.componentType = Type.getMethodType(str).getReturnType().getClassName().substring(0, r3.length() - 2);
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase.RawDescriptionArray.ComponentTypeReference
                public String lookup() {
                    return this.componentType;
                }
            }
        }

        protected interface GenericTypeRegistrant {
            void register(LazyTypeDescription.GenericTypeToken genericTypeToken);

            public static class RejectingSignatureVisitor extends SignatureVisitor {
                private static final String MESSAGE = "Unexpected token in generic signature";

                public RejectingSignatureVisitor() {
                    super(OpenedClassReader.ASM_API);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public void visitFormalTypeParameter(String str) {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitClassBound() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitInterfaceBound() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitSuperclass() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitInterface() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitParameterType() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitReturnType() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitExceptionType() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public void visitBaseType(char c) {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public void visitTypeVariable(String str) {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitArrayType() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public void visitClassType(String str) {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public void visitInnerClassType(String str) {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public void visitTypeArgument() {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitTypeArgument(char c) {
                    throw new IllegalStateException(MESSAGE);
                }

                @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
                public void visitEnd() {
                    throw new IllegalStateException(MESSAGE);
                }
            }
        }

        protected static class ParameterBag {
            private final Map<Integer, String> parameterRegistry = new HashMap();
            private final Type[] parameterType;

            protected ParameterBag(Type[] typeArr) {
                this.parameterType = typeArr;
            }

            protected void register(int i, String str) {
                this.parameterRegistry.put(Integer.valueOf(i), str);
            }

            protected List<LazyTypeDescription.MethodToken.ParameterToken> resolve(boolean z) {
                int size;
                ArrayList arrayList = new ArrayList(this.parameterType.length);
                if (z) {
                    size = StackSize.ZERO.getSize();
                } else {
                    size = StackSize.SINGLE.getSize();
                }
                for (Type type : this.parameterType) {
                    String str = this.parameterRegistry.get(Integer.valueOf(size));
                    arrayList.add(str == null ? new LazyTypeDescription.MethodToken.ParameterToken() : new LazyTypeDescription.MethodToken.ParameterToken(str));
                    size += type.getSize();
                }
                return arrayList;
            }
        }

        protected static class GenericTypeExtractor extends GenericTypeRegistrant.RejectingSignatureVisitor implements GenericTypeRegistrant {
            private final GenericTypeRegistrant genericTypeRegistrant;
            private IncompleteToken incompleteToken;

            protected GenericTypeExtractor(GenericTypeRegistrant genericTypeRegistrant) {
                this.genericTypeRegistrant = genericTypeRegistrant;
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
            public void visitBaseType(char c) {
                this.genericTypeRegistrant.register(LazyTypeDescription.GenericTypeToken.ForPrimitiveType.of(c));
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
            public void visitTypeVariable(String str) {
                this.genericTypeRegistrant.register(new LazyTypeDescription.GenericTypeToken.ForTypeVariable(str));
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
            public SignatureVisitor visitArrayType() {
                return new GenericTypeExtractor(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
            public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                this.genericTypeRegistrant.register(new LazyTypeDescription.GenericTypeToken.ForGenericArray(genericTypeToken));
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
            public void visitClassType(String str) {
                this.incompleteToken = new IncompleteToken.ForTopLevelType(str);
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
            public void visitInnerClassType(String str) {
                this.incompleteToken = new IncompleteToken.ForInnerClass(str, this.incompleteToken);
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
            public void visitTypeArgument() {
                this.incompleteToken.appendPlaceholder();
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
            public SignatureVisitor visitTypeArgument(char c) {
                if (c == '+') {
                    return this.incompleteToken.appendUpperBound();
                }
                if (c == '-') {
                    return this.incompleteToken.appendLowerBound();
                }
                if (c == '=') {
                    return this.incompleteToken.appendDirectBound();
                }
                throw new IllegalArgumentException("Unknown wildcard: " + c);
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
            public void visitEnd() {
                this.genericTypeRegistrant.register(this.incompleteToken.toToken());
            }

            protected interface IncompleteToken {
                SignatureVisitor appendDirectBound();

                SignatureVisitor appendLowerBound();

                void appendPlaceholder();

                SignatureVisitor appendUpperBound();

                String getName();

                boolean isParameterized();

                LazyTypeDescription.GenericTypeToken toToken();

                public static abstract class AbstractBase implements IncompleteToken {
                    protected final List<LazyTypeDescription.GenericTypeToken> parameters = new ArrayList();

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public SignatureVisitor appendDirectBound() {
                        return new GenericTypeExtractor(new ForDirectBound());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public SignatureVisitor appendUpperBound() {
                        return new GenericTypeExtractor(new ForUpperBound());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public SignatureVisitor appendLowerBound() {
                        return new GenericTypeExtractor(new ForLowerBound());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public void appendPlaceholder() {
                        this.parameters.add(LazyTypeDescription.GenericTypeToken.ForUnboundWildcard.INSTANCE);
                    }

                    protected class ForDirectBound implements GenericTypeRegistrant {
                        protected ForDirectBound() {
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            AbstractBase.this.parameters.add(genericTypeToken);
                        }
                    }

                    protected class ForUpperBound implements GenericTypeRegistrant {
                        protected ForUpperBound() {
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            AbstractBase.this.parameters.add(new LazyTypeDescription.GenericTypeToken.ForUpperBoundWildcard(genericTypeToken));
                        }
                    }

                    protected class ForLowerBound implements GenericTypeRegistrant {
                        protected ForLowerBound() {
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            AbstractBase.this.parameters.add(new LazyTypeDescription.GenericTypeToken.ForLowerBoundWildcard(genericTypeToken));
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForTopLevelType extends AbstractBase {
                    private final String internalName;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.internalName.equals(((ForTopLevelType) obj).internalName);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.internalName.hashCode();
                    }

                    public ForTopLevelType(String str) {
                        this.internalName = str;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public LazyTypeDescription.GenericTypeToken toToken() {
                        if (isParameterized()) {
                            return new LazyTypeDescription.GenericTypeToken.ForParameterizedType(getName(), this.parameters);
                        }
                        return new LazyTypeDescription.GenericTypeToken.ForRawType(getName());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public boolean isParameterized() {
                        return !this.parameters.isEmpty();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public String getName() {
                        return this.internalName.replace('/', LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForInnerClass extends AbstractBase {
                    private static final char INNER_CLASS_SEPARATOR = '$';
                    private final String internalName;
                    private final IncompleteToken outerTypeToken;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForInnerClass forInnerClass = (ForInnerClass) obj;
                        return this.internalName.equals(forInnerClass.internalName) && this.outerTypeToken.equals(forInnerClass.outerTypeToken);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.internalName.hashCode()) * 31) + this.outerTypeToken.hashCode();
                    }

                    public ForInnerClass(String str, IncompleteToken incompleteToken) {
                        this.internalName = str;
                        this.outerTypeToken = incompleteToken;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public LazyTypeDescription.GenericTypeToken toToken() {
                        if (isParameterized() || this.outerTypeToken.isParameterized()) {
                            return new LazyTypeDescription.GenericTypeToken.ForParameterizedType.Nested(getName(), this.parameters, this.outerTypeToken.toToken());
                        }
                        return new LazyTypeDescription.GenericTypeToken.ForRawType(getName());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public boolean isParameterized() {
                        return (this.parameters.isEmpty() && this.outerTypeToken.isParameterized()) ? false : true;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public String getName() {
                        return this.outerTypeToken.getName() + '$' + this.internalName.replace('/', LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                    }
                }
            }

            protected static abstract class ForSignature<T extends LazyTypeDescription.GenericTypeToken.Resolution> extends GenericTypeRegistrant.RejectingSignatureVisitor implements GenericTypeRegistrant {
                protected List<LazyTypeDescription.GenericTypeToken> currentBounds;
                protected String currentTypeParameter;
                protected final List<LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable> typeVariableTokens = new ArrayList();

                public abstract T resolve();

                protected static <S extends LazyTypeDescription.GenericTypeToken.Resolution> S extract(String str, ForSignature<S> forSignature) {
                    new SignatureReader(str).accept(forSignature);
                    return forSignature.resolve();
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
                public void visitFormalTypeParameter(String str) {
                    collectTypeParameter();
                    this.currentTypeParameter = str;
                    this.currentBounds = new ArrayList();
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitClassBound() {
                    return new GenericTypeExtractor(this);
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
                public SignatureVisitor visitInterfaceBound() {
                    return new GenericTypeExtractor(this);
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                    List<LazyTypeDescription.GenericTypeToken> list = this.currentBounds;
                    if (list == null) {
                        throw new IllegalStateException("Did not expect " + genericTypeToken + " before finding formal parameter");
                    }
                    list.add(genericTypeToken);
                }

                protected void collectTypeParameter() {
                    if (this.currentTypeParameter != null) {
                        this.typeVariableTokens.add(new LazyTypeDescription.GenericTypeToken.ForTypeVariable.Formal(this.currentTypeParameter, this.currentBounds));
                    }
                }

                protected static class OfType extends ForSignature<LazyTypeDescription.GenericTypeToken.Resolution.ForType> {
                    private final List<LazyTypeDescription.GenericTypeToken> interfaceTypeTokens = new ArrayList();
                    private LazyTypeDescription.GenericTypeToken superClassToken;

                    protected OfType() {
                    }

                    public static LazyTypeDescription.GenericTypeToken.Resolution.ForType extract(String str) {
                        LazyTypeDescription.GenericTypeToken.Resolution.ForType forType;
                        try {
                            if (str == null) {
                                forType = LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE;
                            } else {
                                forType = (LazyTypeDescription.GenericTypeToken.Resolution.ForType) ForSignature.extract(str, new OfType());
                            }
                            return forType;
                        } catch (RuntimeException unused) {
                            return LazyTypeDescription.GenericTypeToken.Resolution.Malformed.INSTANCE;
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
                    public SignatureVisitor visitSuperclass() {
                        collectTypeParameter();
                        return new GenericTypeExtractor(new SuperClassRegistrant());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
                    public SignatureVisitor visitInterface() {
                        return new GenericTypeExtractor(new InterfaceTypeRegistrant());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature
                    public LazyTypeDescription.GenericTypeToken.Resolution.ForType resolve() {
                        return new LazyTypeDescription.GenericTypeToken.Resolution.ForType.Tokenized(this.superClassToken, this.interfaceTypeTokens, this.typeVariableTokens);
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class SuperClassRegistrant implements GenericTypeRegistrant {
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && OfType.this.equals(OfType.this);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + OfType.this.hashCode();
                        }

                        protected SuperClassRegistrant() {
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            OfType.this.superClassToken = genericTypeToken;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class InterfaceTypeRegistrant implements GenericTypeRegistrant {
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && OfType.this.equals(OfType.this);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + OfType.this.hashCode();
                        }

                        protected InterfaceTypeRegistrant() {
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            OfType.this.interfaceTypeTokens.add(genericTypeToken);
                        }
                    }
                }

                protected static class OfMethod extends ForSignature<LazyTypeDescription.GenericTypeToken.Resolution.ForMethod> {
                    private LazyTypeDescription.GenericTypeToken returnTypeToken;
                    private final List<LazyTypeDescription.GenericTypeToken> parameterTypeTokens = new ArrayList();
                    private final List<LazyTypeDescription.GenericTypeToken> exceptionTypeTokens = new ArrayList();

                    public static LazyTypeDescription.GenericTypeToken.Resolution.ForMethod extract(String str) {
                        LazyTypeDescription.GenericTypeToken.Resolution.ForMethod forMethod;
                        try {
                            if (str == null) {
                                forMethod = LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE;
                            } else {
                                forMethod = (LazyTypeDescription.GenericTypeToken.Resolution.ForMethod) ForSignature.extract(str, new OfMethod());
                            }
                            return forMethod;
                        } catch (RuntimeException unused) {
                            return LazyTypeDescription.GenericTypeToken.Resolution.Malformed.INSTANCE;
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
                    public SignatureVisitor visitParameterType() {
                        return new GenericTypeExtractor(new ParameterTypeRegistrant());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
                    public SignatureVisitor visitReturnType() {
                        collectTypeParameter();
                        return new GenericTypeExtractor(new ReturnTypeTypeRegistrant());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, org.modelmapper.internal.asm.signature.SignatureVisitor
                    public SignatureVisitor visitExceptionType() {
                        return new GenericTypeExtractor(new ExceptionTypeRegistrant());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature
                    public LazyTypeDescription.GenericTypeToken.Resolution.ForMethod resolve() {
                        return new LazyTypeDescription.GenericTypeToken.Resolution.ForMethod.Tokenized(this.returnTypeToken, this.parameterTypeTokens, this.exceptionTypeTokens, this.typeVariableTokens);
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class ParameterTypeRegistrant implements GenericTypeRegistrant {
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && OfMethod.this.equals(OfMethod.this);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + OfMethod.this.hashCode();
                        }

                        protected ParameterTypeRegistrant() {
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            OfMethod.this.parameterTypeTokens.add(genericTypeToken);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class ReturnTypeTypeRegistrant implements GenericTypeRegistrant {
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && OfMethod.this.equals(OfMethod.this);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + OfMethod.this.hashCode();
                        }

                        protected ReturnTypeTypeRegistrant() {
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            OfMethod.this.returnTypeToken = genericTypeToken;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class ExceptionTypeRegistrant implements GenericTypeRegistrant {
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && OfMethod.this.equals(OfMethod.this);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + OfMethod.this.hashCode();
                        }

                        protected ExceptionTypeRegistrant() {
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            OfMethod.this.exceptionTypeTokens.add(genericTypeToken);
                        }
                    }
                }

                protected static class OfField implements GenericTypeRegistrant {
                    private LazyTypeDescription.GenericTypeToken fieldTypeToken;

                    protected OfField() {
                    }

                    public static LazyTypeDescription.GenericTypeToken.Resolution.ForField extract(String str) {
                        if (str == null) {
                            return LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE;
                        }
                        SignatureReader signatureReader = new SignatureReader(str);
                        OfField ofField = new OfField();
                        try {
                            signatureReader.acceptType(new GenericTypeExtractor(ofField));
                            return ofField.resolve();
                        } catch (RuntimeException unused) {
                            return LazyTypeDescription.GenericTypeToken.Resolution.Malformed.INSTANCE;
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                    public void register(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                        this.fieldTypeToken = genericTypeToken;
                    }

                    protected LazyTypeDescription.GenericTypeToken.Resolution.ForField resolve() {
                        return new LazyTypeDescription.GenericTypeToken.Resolution.ForField.Tokenized(this.fieldTypeToken);
                    }
                }
            }
        }

        protected static class LazyTypeDescription extends TypeDescription.AbstractBase.OfSimpleType {
            private static final String NO_TYPE = null;
            private static final int SUPER_CLASS_INDEX = -1;
            private final int actualModifiers;
            private final List<AnnotationToken> annotationTokens;
            private final boolean anonymousType;
            private final List<String> declaredTypes;
            private final String declaringTypeName;
            private final List<FieldToken> fieldTokens;
            private final String genericSignature;
            private final List<String> interfaceTypeDescriptors;
            private final List<MethodToken> methodTokens;
            private final int modifiers;
            private final String name;
            private final String nestHost;
            private final List<String> nestMembers;
            private final GenericTypeToken.Resolution.ForType signatureResolution;
            private final String superClassDescriptor;
            private final Map<Integer, Map<String, List<AnnotationToken>>> superTypeAnnotationTokens;
            private final TypeContainment typeContainment;
            private final TypePool typePool;
            private final Map<Integer, Map<String, List<AnnotationToken>>> typeVariableAnnotationTokens;
            private final Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> typeVariableBoundsAnnotationTokens;

            protected LazyTypeDescription(TypePool typePool, int i, int i2, String str, String str2, String[] strArr, String str3, TypeContainment typeContainment, String str4, List<String> list, boolean z, String str5, List<String> list2, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<String, List<AnnotationToken>>> map2, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map3, List<AnnotationToken> list3, List<FieldToken> list4, List<MethodToken> list5) {
                String descriptor;
                String replace;
                String className;
                this.typePool = typePool;
                this.actualModifiers = i & (-33);
                this.modifiers = (-131105) & i2;
                this.name = Type.getObjectType(str).getClassName();
                if (str2 == null) {
                    descriptor = NO_TYPE;
                } else {
                    descriptor = Type.getObjectType(str2).getDescriptor();
                }
                this.superClassDescriptor = descriptor;
                this.genericSignature = str3;
                this.signatureResolution = RAW_TYPES ? GenericTypeToken.Resolution.Raw.INSTANCE : GenericTypeExtractor.ForSignature.OfType.extract(str3);
                if (strArr == null) {
                    this.interfaceTypeDescriptors = Collections.emptyList();
                } else {
                    this.interfaceTypeDescriptors = new ArrayList(strArr.length);
                    for (String str6 : strArr) {
                        this.interfaceTypeDescriptors.add(Type.getObjectType(str6).getDescriptor());
                    }
                }
                this.typeContainment = typeContainment;
                if (str4 == null) {
                    replace = NO_TYPE;
                } else {
                    replace = str4.replace('/', GenericTypeToken.INNER_CLASS_PATH);
                }
                this.declaringTypeName = replace;
                this.declaredTypes = list;
                this.anonymousType = z;
                if (str5 == null) {
                    className = NO_TYPE;
                } else {
                    className = Type.getObjectType(str5).getClassName();
                }
                this.nestHost = className;
                this.nestMembers = new ArrayList(list2.size());
                Iterator<String> it = list2.iterator();
                while (it.hasNext()) {
                    this.nestMembers.add(Type.getObjectType(it.next()).getClassName());
                }
                this.superTypeAnnotationTokens = map;
                this.typeVariableAnnotationTokens = map2;
                this.typeVariableBoundsAnnotationTokens = map3;
                this.annotationTokens = list3;
                this.fieldTokens = list4;
                this.methodTokens = list5;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDescription.Generic getSuperClass() {
                if (this.superClassDescriptor == null || isInterface()) {
                    return TypeDescription.Generic.UNDEFINED;
                }
                return this.signatureResolution.resolveSuperClass(this.superClassDescriptor, this.typePool, this.superTypeAnnotationTokens.get(-1), this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeList.Generic getInterfaces() {
                return this.signatureResolution.resolveInterfaceTypes(this.interfaceTypeDescriptors, this.typePool, this.superTypeAnnotationTokens, this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public MethodDescription.InDefinedShape getEnclosingMethod() {
                return this.typeContainment.getEnclosingMethod(this.typePool);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public TypeDescription getEnclosingType() {
                return this.typeContainment.getEnclosingType(this.typePool);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public TypeList getDeclaredTypes() {
                return new LazyTypeList(this.typePool, this.declaredTypes);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public boolean isAnonymousType() {
                return this.anonymousType;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public boolean isLocalType() {
                return !this.anonymousType && this.typeContainment.isLocalType();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public boolean isMemberType() {
                return this.typeContainment.isMemberClass();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
                return new FieldTokenList();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
                return new MethodTokenList();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public PackageDescription getPackage() {
                String name = getName();
                int lastIndexOf = name.lastIndexOf(46);
                return new LazyPackageDescription(this.typePool, lastIndexOf == -1 ? "" : name.substring(0, lastIndexOf));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
            public String getName() {
                return this.name;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
            public TypeDescription getDeclaringType() {
                String str = this.declaringTypeName;
                return str == null ? TypeDescription.UNDEFINED : this.typePool.describe(str).resolve();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                return this.modifiers;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public int getActualModifiers(boolean z) {
                return z ? this.actualModifiers | 32 : this.actualModifiers;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public TypeDescription getNestHost() {
                String str = this.nestHost;
                return str == null ? this : this.typePool.describe(str).resolve();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public TypeList getNestMembers() {
                String str = this.nestHost;
                return str == null ? new LazyNestMemberList(this, this.typePool, this.nestMembers) : this.typePool.describe(str).resolve().getNestMembers();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                return LazyAnnotationDescription.asList(this.typePool, this.annotationTokens);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
            public TypeList.Generic getTypeVariables() {
                return this.signatureResolution.resolveTypeVariables(this.typePool, this, this.typeVariableAnnotationTokens, this.typeVariableBoundsAnnotationTokens);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ByteCodeElement
            public String getGenericSignature() {
                return this.genericSignature;
            }

            protected class FieldTokenList extends FieldList.AbstractBase<FieldDescription.InDefinedShape> {
                protected FieldTokenList() {
                }

                @Override // java.util.AbstractList, java.util.List
                public FieldDescription.InDefinedShape get(int i) {
                    return ((FieldToken) LazyTypeDescription.this.fieldTokens.get(i)).toFieldDescription(LazyTypeDescription.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return LazyTypeDescription.this.fieldTokens.size();
                }
            }

            protected class MethodTokenList extends MethodList.AbstractBase<MethodDescription.InDefinedShape> {
                protected MethodTokenList() {
                }

                @Override // java.util.AbstractList, java.util.List
                public MethodDescription.InDefinedShape get(int i) {
                    return ((MethodToken) LazyTypeDescription.this.methodTokens.get(i)).toMethodDescription(LazyTypeDescription.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return LazyTypeDescription.this.methodTokens.size();
                }
            }

            protected interface TypeContainment {
                MethodDescription.InDefinedShape getEnclosingMethod(TypePool typePool);

                TypeDescription getEnclosingType(TypePool typePool);

                boolean isLocalType();

                boolean isMemberClass();

                boolean isSelfContained();

                public enum SelfContained implements TypeContainment {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isLocalType() {
                        return false;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isMemberClass() {
                        return false;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isSelfContained() {
                        return true;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public MethodDescription.InDefinedShape getEnclosingMethod(TypePool typePool) {
                        return MethodDescription.UNDEFINED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public TypeDescription getEnclosingType(TypePool typePool) {
                        return TypeDescription.UNDEFINED;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class WithinType implements TypeContainment {
                    private final boolean localType;
                    private final String name;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        WithinType withinType = (WithinType) obj;
                        return this.name.equals(withinType.name) && this.localType == withinType.localType;
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + (this.localType ? 1 : 0);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isSelfContained() {
                        return false;
                    }

                    protected WithinType(String str, boolean z) {
                        this.name = str.replace('/', GenericTypeToken.INNER_CLASS_PATH);
                        this.localType = z;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public MethodDescription.InDefinedShape getEnclosingMethod(TypePool typePool) {
                        return MethodDescription.UNDEFINED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public TypeDescription getEnclosingType(TypePool typePool) {
                        return typePool.describe(this.name).resolve();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isMemberClass() {
                        return !this.localType;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isLocalType() {
                        return this.localType;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class WithinMethod implements TypeContainment {
                    private final String methodDescriptor;
                    private final String methodName;
                    private final String name;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        WithinMethod withinMethod = (WithinMethod) obj;
                        return this.name.equals(withinMethod.name) && this.methodName.equals(withinMethod.methodName) && this.methodDescriptor.equals(withinMethod.methodDescriptor);
                    }

                    public int hashCode() {
                        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.methodName.hashCode()) * 31) + this.methodDescriptor.hashCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isLocalType() {
                        return true;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isMemberClass() {
                        return false;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isSelfContained() {
                        return false;
                    }

                    protected WithinMethod(String str, String str2, String str3) {
                        this.name = str.replace('/', GenericTypeToken.INNER_CLASS_PATH);
                        this.methodName = str2;
                        this.methodDescriptor = str3;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public MethodDescription.InDefinedShape getEnclosingMethod(TypePool typePool) {
                        TypeDescription enclosingType = getEnclosingType(typePool);
                        MethodList filter = enclosingType.getDeclaredMethods().filter(ElementMatchers.hasMethodName(this.methodName).and(ElementMatchers.hasDescriptor(this.methodDescriptor)));
                        if (filter.isEmpty()) {
                            throw new IllegalStateException(this.methodName + this.methodDescriptor + " not declared by " + enclosingType);
                        }
                        return (MethodDescription.InDefinedShape) filter.getOnly();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public TypeDescription getEnclosingType(TypePool typePool) {
                        return typePool.describe(this.name).resolve();
                    }
                }
            }

            protected interface GenericTypeToken {
                public static final char COMPONENT_TYPE_PATH = '[';
                public static final String EMPTY_TYPE_PATH = "";
                public static final char INDEXED_TYPE_DELIMITER = ';';
                public static final char INNER_CLASS_PATH = '.';
                public static final char WILDCARD_TYPE_PATH = '*';

                public interface OfFormalTypeVariable {
                    TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, Map<String, List<AnnotationToken>> map, Map<Integer, Map<String, List<AnnotationToken>>> map2);
                }

                String getTypePathPrefix();

                boolean isPrimaryBound(TypePool typePool);

                TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map);

                public enum ForPrimitiveType implements GenericTypeToken {
                    BOOLEAN(Boolean.TYPE),
                    BYTE(Byte.TYPE),
                    SHORT(Short.TYPE),
                    CHAR(Character.TYPE),
                    INTEGER(Integer.TYPE),
                    LONG(Long.TYPE),
                    FLOAT(Float.TYPE),
                    DOUBLE(Double.TYPE),
                    VOID(Void.TYPE);

                    private final TypeDescription typeDescription;

                    ForPrimitiveType(Class cls) {
                        this.typeDescription = TypeDescription.ForLoadedType.of(cls);
                    }

                    public static GenericTypeToken of(char c) {
                        if (c == 'F') {
                            return FLOAT;
                        }
                        if (c == 'S') {
                            return SHORT;
                        }
                        if (c == 'V') {
                            return VOID;
                        }
                        if (c == 'Z') {
                            return BOOLEAN;
                        }
                        if (c == 'I') {
                            return INTEGER;
                        }
                        if (c != 'J') {
                            switch (c) {
                                case 'B':
                                    return BYTE;
                                case 'C':
                                    return CHAR;
                                case 'D':
                                    return DOUBLE;
                                default:
                                    throw new IllegalArgumentException("Not a valid primitive type descriptor: " + c);
                            }
                        }
                        return LONG;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                        if (map == null) {
                            map = Collections.emptyMap();
                        }
                        return new LazyPrimitiveType(typePool, str, map, this.typeDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(TypePool typePool) {
                        throw new IllegalStateException("A primitive type cannot be a type variable bound: " + this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public String getTypePathPrefix() {
                        throw new IllegalStateException("A primitive type cannot be the owner of a nested type: " + this);
                    }

                    protected static class LazyPrimitiveType extends TypeDescription.Generic.OfNonGenericType {
                        private final Map<String, List<AnnotationToken>> annotationTokens;
                        private final TypeDescription typeDescription;
                        private final String typePath;
                        private final TypePool typePool;

                        protected LazyPrimitiveType(TypePool typePool, String str, Map<String, List<AnnotationToken>> map, TypeDescription typeDescription) {
                            this.typePool = typePool;
                            this.typePath = str;
                            this.annotationTokens = map;
                            this.typeDescription = typeDescription;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                        public TypeDescription asErasure() {
                            return this.typeDescription;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeDescription.Generic getOwnerType() {
                            return TypeDescription.Generic.UNDEFINED;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                        public TypeDescription.Generic getComponentType() {
                            return TypeDescription.Generic.UNDEFINED;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(this.typePath));
                        }
                    }
                }

                public enum ForUnboundWildcard implements GenericTypeToken {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                        if (map == null) {
                            map = Collections.emptyMap();
                        }
                        return new LazyUnboundWildcard(typePool, str, map);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(TypePool typePool) {
                        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public String getTypePathPrefix() {
                        throw new IllegalStateException("An unbound wildcard cannot be the owner of a nested type: " + this);
                    }

                    protected static class LazyUnboundWildcard extends TypeDescription.Generic.OfWildcardType {
                        private final Map<String, List<AnnotationToken>> annotationTokens;
                        private final String typePath;
                        private final TypePool typePool;

                        protected LazyUnboundWildcard(TypePool typePool, String str, Map<String, List<AnnotationToken>> map) {
                            this.typePool = typePool;
                            this.typePath = str;
                            this.annotationTokens = map;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getUpperBounds() {
                            return new TypeList.Generic.Explicit(TypeDescription.Generic.OBJECT);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getLowerBounds() {
                            return new TypeList.Generic.Empty();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(this.typePath));
                        }
                    }
                }

                public interface Resolution {
                    TypeList.Generic resolveTypeVariables(TypePool typePool, TypeVariableSource typeVariableSource, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map2);

                    public enum Raw implements ForType, ForMethod, ForField {
                        INSTANCE;

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField
                        public TypeDescription.Generic resolveFieldType(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, FieldDescription.InDefinedShape inDefinedShape) {
                            return RawAnnotatedType.of(typePool, map, str);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public TypeDescription.Generic resolveReturnType(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, MethodDescription.InDefinedShape inDefinedShape) {
                            return RawAnnotatedType.of(typePool, map, str);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public TypeList.Generic resolveParameterTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, MethodDescription.InDefinedShape inDefinedShape) {
                            return RawAnnotatedType.LazyRawAnnotatedTypeList.of(typePool, map, list);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public TypeList.Generic resolveExceptionTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, MethodDescription.InDefinedShape inDefinedShape) {
                            return RawAnnotatedType.LazyRawAnnotatedTypeList.of(typePool, map, list);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                        public TypeDescription.Generic resolveSuperClass(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, TypeDescription typeDescription) {
                            return RawAnnotatedType.of(typePool, map, str);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                        public TypeList.Generic resolveInterfaceTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, TypeDescription typeDescription) {
                            return RawAnnotatedType.LazyRawAnnotatedTypeList.of(typePool, map, list);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                        public TypeList.Generic resolveTypeVariables(TypePool typePool, TypeVariableSource typeVariableSource, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map2) {
                            return new TypeList.Generic.Empty();
                        }

                        protected static class RawAnnotatedType extends TypeDescription.Generic.OfNonGenericType {
                            private final Map<String, List<AnnotationToken>> annotationTokens;
                            private final TypeDescription typeDescription;
                            private final String typePath;
                            private final TypePool typePool;

                            protected RawAnnotatedType(TypePool typePool, String str, Map<String, List<AnnotationToken>> map, TypeDescription typeDescription) {
                                this.typePool = typePool;
                                this.typePath = str;
                                this.annotationTokens = map;
                                this.typeDescription = typeDescription;
                            }

                            protected static TypeDescription.Generic of(TypePool typePool, Map<String, List<AnnotationToken>> map, String str) {
                                if (map == null) {
                                    map = Collections.emptyMap();
                                }
                                return new RawAnnotatedType(typePool, "", map, TokenizedGenericType.toErasure(typePool, str));
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                            public TypeDescription asErasure() {
                                return this.typeDescription;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public TypeDescription.Generic getOwnerType() {
                                TypeDescription declaringType = this.typeDescription.getDeclaringType();
                                return declaringType == null ? TypeDescription.Generic.UNDEFINED : new RawAnnotatedType(this.typePool, this.typePath, this.annotationTokens, declaringType);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                            public TypeDescription.Generic getComponentType() {
                                TypeDescription componentType = this.typeDescription.getComponentType();
                                return componentType == null ? TypeDescription.Generic.UNDEFINED : new RawAnnotatedType(this.typePool, this.typePath + '[', this.annotationTokens, componentType);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                            public AnnotationList getDeclaredAnnotations() {
                                StringBuilder sb = new StringBuilder(this.typePath);
                                for (int i = 0; i < this.typeDescription.getInnerClassCount(); i++) {
                                    sb = sb.append(GenericTypeToken.INNER_CLASS_PATH);
                                }
                                return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(sb.toString()));
                            }

                            protected static class LazyRawAnnotatedTypeList extends TypeList.Generic.AbstractBase {
                                private final Map<Integer, Map<String, List<AnnotationToken>>> annotationTokens;
                                private final List<String> descriptors;
                                private final TypePool typePool;

                                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
                                public TypeList.Generic asRawTypes() {
                                    return this;
                                }

                                protected LazyRawAnnotatedTypeList(TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, List<String> list) {
                                    this.typePool = typePool;
                                    this.annotationTokens = map;
                                    this.descriptors = list;
                                }

                                protected static TypeList.Generic of(TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, List<String> list) {
                                    if (map == null) {
                                        map = Collections.emptyMap();
                                    }
                                    return new LazyRawAnnotatedTypeList(typePool, map, list);
                                }

                                @Override // java.util.AbstractList, java.util.List
                                public TypeDescription.Generic get(int i) {
                                    return RawAnnotatedType.of(this.typePool, this.annotationTokens.get(Integer.valueOf(i)), this.descriptors.get(i));
                                }

                                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                                public int size() {
                                    return this.descriptors.size();
                                }

                                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
                                public TypeList asErasures() {
                                    return new LazyTypeList(this.typePool, this.descriptors);
                                }

                                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
                                public int getStackSize() {
                                    Iterator<String> it = this.descriptors.iterator();
                                    int i = 0;
                                    while (it.hasNext()) {
                                        i += Type.getType(it.next()).getSize();
                                    }
                                    return i;
                                }
                            }
                        }
                    }

                    public enum Malformed implements ForType, ForMethod, ForField {
                        INSTANCE;

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField
                        public TypeDescription.Generic resolveFieldType(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, FieldDescription.InDefinedShape inDefinedShape) {
                            return new TokenizedGenericType.Malformed(typePool, str);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public TypeDescription.Generic resolveReturnType(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, MethodDescription.InDefinedShape inDefinedShape) {
                            return new TokenizedGenericType.Malformed(typePool, str);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public TypeList.Generic resolveParameterTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, MethodDescription.InDefinedShape inDefinedShape) {
                            return new TokenizedGenericType.Malformed.TokenList(typePool, list);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public TypeList.Generic resolveExceptionTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, MethodDescription.InDefinedShape inDefinedShape) {
                            return new TokenizedGenericType.Malformed.TokenList(typePool, list);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                        public TypeDescription.Generic resolveSuperClass(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, TypeDescription typeDescription) {
                            return new TokenizedGenericType.Malformed(typePool, str);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                        public TypeList.Generic resolveInterfaceTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, TypeDescription typeDescription) {
                            return new TokenizedGenericType.Malformed.TokenList(typePool, list);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                        public TypeList.Generic resolveTypeVariables(TypePool typePool, TypeVariableSource typeVariableSource, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map2) {
                            throw new GenericSignatureFormatError();
                        }
                    }

                    public interface ForType extends Resolution {
                        TypeList.Generic resolveInterfaceTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, TypeDescription typeDescription);

                        TypeDescription.Generic resolveSuperClass(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, TypeDescription typeDescription);

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class Tokenized implements ForType {
                            private final List<GenericTypeToken> interfaceTypeTokens;
                            private final GenericTypeToken superClassToken;
                            private final List<OfFormalTypeVariable> typeVariableTokens;

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                Tokenized tokenized = (Tokenized) obj;
                                return this.superClassToken.equals(tokenized.superClassToken) && this.interfaceTypeTokens.equals(tokenized.interfaceTypeTokens) && this.typeVariableTokens.equals(tokenized.typeVariableTokens);
                            }

                            public int hashCode() {
                                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.superClassToken.hashCode()) * 31) + this.interfaceTypeTokens.hashCode()) * 31) + this.typeVariableTokens.hashCode();
                            }

                            protected Tokenized(GenericTypeToken genericTypeToken, List<GenericTypeToken> list, List<OfFormalTypeVariable> list2) {
                                this.superClassToken = genericTypeToken;
                                this.interfaceTypeTokens = list;
                                this.typeVariableTokens = list2;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                            public TypeDescription.Generic resolveSuperClass(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, TypeDescription typeDescription) {
                                return TokenizedGenericType.of(typePool, this.superClassToken, str, map, typeDescription);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                            public TypeList.Generic resolveInterfaceTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, TypeDescription typeDescription) {
                                return new TokenizedGenericType.TokenList(typePool, this.interfaceTypeTokens, map, list, typeDescription);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                            public TypeList.Generic resolveTypeVariables(TypePool typePool, TypeVariableSource typeVariableSource, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map2) {
                                return new TokenizedGenericType.TypeVariableList(typePool, this.typeVariableTokens, typeVariableSource, map, map2);
                            }
                        }
                    }

                    public interface ForMethod extends Resolution {
                        TypeList.Generic resolveExceptionTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, MethodDescription.InDefinedShape inDefinedShape);

                        TypeList.Generic resolveParameterTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, MethodDescription.InDefinedShape inDefinedShape);

                        TypeDescription.Generic resolveReturnType(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, MethodDescription.InDefinedShape inDefinedShape);

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class Tokenized implements ForMethod {
                            private final List<GenericTypeToken> exceptionTypeTokens;
                            private final List<GenericTypeToken> parameterTypeTokens;
                            private final GenericTypeToken returnTypeToken;
                            private final List<OfFormalTypeVariable> typeVariableTokens;

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                Tokenized tokenized = (Tokenized) obj;
                                return this.returnTypeToken.equals(tokenized.returnTypeToken) && this.parameterTypeTokens.equals(tokenized.parameterTypeTokens) && this.exceptionTypeTokens.equals(tokenized.exceptionTypeTokens) && this.typeVariableTokens.equals(tokenized.typeVariableTokens);
                            }

                            public int hashCode() {
                                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.returnTypeToken.hashCode()) * 31) + this.parameterTypeTokens.hashCode()) * 31) + this.exceptionTypeTokens.hashCode()) * 31) + this.typeVariableTokens.hashCode();
                            }

                            protected Tokenized(GenericTypeToken genericTypeToken, List<GenericTypeToken> list, List<GenericTypeToken> list2, List<OfFormalTypeVariable> list3) {
                                this.returnTypeToken = genericTypeToken;
                                this.parameterTypeTokens = list;
                                this.exceptionTypeTokens = list2;
                                this.typeVariableTokens = list3;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                            public TypeDescription.Generic resolveReturnType(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, MethodDescription.InDefinedShape inDefinedShape) {
                                return TokenizedGenericType.of(typePool, this.returnTypeToken, str, map, inDefinedShape);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                            public TypeList.Generic resolveParameterTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, MethodDescription.InDefinedShape inDefinedShape) {
                                return new TokenizedGenericType.TokenList(typePool, this.parameterTypeTokens, map, list, inDefinedShape);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                            public TypeList.Generic resolveExceptionTypes(List<String> list, TypePool typePool, Map<Integer, Map<String, List<AnnotationToken>>> map, MethodDescription.InDefinedShape inDefinedShape) {
                                return this.exceptionTypeTokens.isEmpty() ? Raw.INSTANCE.resolveExceptionTypes(list, typePool, map, inDefinedShape) : new TokenizedGenericType.TokenList(typePool, this.exceptionTypeTokens, map, list, inDefinedShape);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                            public TypeList.Generic resolveTypeVariables(TypePool typePool, TypeVariableSource typeVariableSource, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map2) {
                                return new TokenizedGenericType.TypeVariableList(typePool, this.typeVariableTokens, typeVariableSource, map, map2);
                            }
                        }
                    }

                    public interface ForField {
                        TypeDescription.Generic resolveFieldType(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, FieldDescription.InDefinedShape inDefinedShape);

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class Tokenized implements ForField {
                            private final GenericTypeToken fieldTypeToken;

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return obj != null && getClass() == obj.getClass() && this.fieldTypeToken.equals(((Tokenized) obj).fieldTypeToken);
                            }

                            public int hashCode() {
                                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldTypeToken.hashCode();
                            }

                            protected Tokenized(GenericTypeToken genericTypeToken) {
                                this.fieldTypeToken = genericTypeToken;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField
                            public TypeDescription.Generic resolveFieldType(String str, TypePool typePool, Map<String, List<AnnotationToken>> map, FieldDescription.InDefinedShape inDefinedShape) {
                                return TokenizedGenericType.of(typePool, this.fieldTypeToken, str, map, inDefinedShape.getDeclaringType());
                            }
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForRawType implements GenericTypeToken {
                    private final String name;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.name.equals(((ForRawType) obj).name);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode();
                    }

                    protected ForRawType(String str) {
                        this.name = str;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                        if (map == null) {
                            map = Collections.emptyMap();
                        }
                        return new Resolution.Raw.RawAnnotatedType(typePool, str, map, typePool.describe(this.name).resolve());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(TypePool typePool) {
                        return !typePool.describe(this.name).resolve().isInterface();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public String getTypePathPrefix() {
                        throw new IllegalStateException("A non-generic type cannot be the owner of a nested type: " + this);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForTypeVariable implements GenericTypeToken {
                    private final String symbol;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.symbol.equals(((ForTypeVariable) obj).symbol);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.symbol.hashCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(TypePool typePool) {
                        return true;
                    }

                    protected ForTypeVariable(String str) {
                        this.symbol = str;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                        TypeDescription.Generic findVariable = typeVariableSource.findVariable(this.symbol);
                        if (findVariable == null) {
                            return new UnresolvedTypeVariable(typeVariableSource, typePool, this.symbol, map.get(str));
                        }
                        return new AnnotatedTypeVariable(typePool, map.get(str), findVariable);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public String getTypePathPrefix() {
                        throw new IllegalStateException("A type variable cannot be the owner of a nested type: " + this);
                    }

                    protected static class AnnotatedTypeVariable extends TypeDescription.Generic.OfTypeVariable {
                        private final List<AnnotationToken> annotationTokens;
                        private final TypePool typePool;
                        private final TypeDescription.Generic typeVariable;

                        protected AnnotatedTypeVariable(TypePool typePool, List<AnnotationToken> list, TypeDescription.Generic generic) {
                            this.typePool = typePool;
                            this.annotationTokens = list;
                            this.typeVariable = generic;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getUpperBounds() {
                            return this.typeVariable.getUpperBounds();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeVariableSource getTypeVariableSource() {
                            return this.typeVariable.getTypeVariableSource();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public String getSymbol() {
                            return this.typeVariable.getSymbol();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens);
                        }
                    }

                    protected static class UnresolvedTypeVariable extends TypeDescription.Generic.OfTypeVariable {
                        private final List<AnnotationToken> annotationTokens;
                        private final String symbol;
                        private final TypePool typePool;
                        private final TypeVariableSource typeVariableSource;

                        protected UnresolvedTypeVariable(TypeVariableSource typeVariableSource, TypePool typePool, String str, List<AnnotationToken> list) {
                            this.typeVariableSource = typeVariableSource;
                            this.typePool = typePool;
                            this.symbol = str;
                            this.annotationTokens = list;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getUpperBounds() {
                            throw new IllegalStateException("Cannot resolve bounds of unresolved type variable " + this + " by " + this.typeVariableSource);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeVariableSource getTypeVariableSource() {
                            return this.typeVariableSource;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public String getSymbol() {
                            return this.symbol;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class Formal implements OfFormalTypeVariable {
                        private final List<GenericTypeToken> boundTypeTokens;
                        private final String symbol;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            Formal formal = (Formal) obj;
                            return this.symbol.equals(formal.symbol) && this.boundTypeTokens.equals(formal.boundTypeTokens);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.symbol.hashCode()) * 31) + this.boundTypeTokens.hashCode();
                        }

                        protected Formal(String str, List<GenericTypeToken> list) {
                            this.symbol = str;
                            this.boundTypeTokens = list;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable
                        public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, Map<String, List<AnnotationToken>> map, Map<Integer, Map<String, List<AnnotationToken>>> map2) {
                            if (map == null) {
                                map = Collections.emptyMap();
                            }
                            Map<String, List<AnnotationToken>> map3 = map;
                            if (map2 == null) {
                                map2 = Collections.emptyMap();
                            }
                            return new LazyTypeVariable(typePool, typeVariableSource, map3, map2, this.symbol, this.boundTypeTokens);
                        }

                        protected static class LazyTypeVariable extends TypeDescription.Generic.OfTypeVariable {
                            private final Map<String, List<AnnotationToken>> annotationTokens;
                            private final List<GenericTypeToken> boundTypeTokens;
                            private final Map<Integer, Map<String, List<AnnotationToken>>> boundaryAnnotationTokens;
                            private final String symbol;
                            private final TypePool typePool;
                            private final TypeVariableSource typeVariableSource;

                            protected LazyTypeVariable(TypePool typePool, TypeVariableSource typeVariableSource, Map<String, List<AnnotationToken>> map, Map<Integer, Map<String, List<AnnotationToken>>> map2, String str, List<GenericTypeToken> list) {
                                this.typePool = typePool;
                                this.typeVariableSource = typeVariableSource;
                                this.annotationTokens = map;
                                this.boundaryAnnotationTokens = map2;
                                this.symbol = str;
                                this.boundTypeTokens = list;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public TypeList.Generic getUpperBounds() {
                                return new LazyBoundTokenList(this.typePool, this.typeVariableSource, this.boundaryAnnotationTokens, this.boundTypeTokens);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public TypeVariableSource getTypeVariableSource() {
                                return this.typeVariableSource;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public String getSymbol() {
                                return this.symbol;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                            public AnnotationList getDeclaredAnnotations() {
                                return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(""));
                            }

                            protected static class LazyBoundTokenList extends TypeList.Generic.AbstractBase {
                                private final Map<Integer, Map<String, List<AnnotationToken>>> annotationTokens;
                                private final List<GenericTypeToken> boundTypeTokens;
                                private final TypePool typePool;
                                private final TypeVariableSource typeVariableSource;

                                protected LazyBoundTokenList(TypePool typePool, TypeVariableSource typeVariableSource, Map<Integer, Map<String, List<AnnotationToken>>> map, List<GenericTypeToken> list) {
                                    this.typePool = typePool;
                                    this.typeVariableSource = typeVariableSource;
                                    this.annotationTokens = map;
                                    this.boundTypeTokens = list;
                                }

                                @Override // java.util.AbstractList, java.util.List
                                public TypeDescription.Generic get(int i) {
                                    Map<String, List<AnnotationToken>> map;
                                    if (this.annotationTokens.containsKey(Integer.valueOf(i)) || this.annotationTokens.containsKey(Integer.valueOf(i + 1))) {
                                        map = this.annotationTokens.get(Integer.valueOf((!this.boundTypeTokens.get(0).isPrimaryBound(this.typePool) ? 1 : 0) + i));
                                    } else {
                                        map = Collections.emptyMap();
                                    }
                                    GenericTypeToken genericTypeToken = this.boundTypeTokens.get(i);
                                    TypePool typePool = this.typePool;
                                    TypeVariableSource typeVariableSource = this.typeVariableSource;
                                    if (map == null) {
                                        map = Collections.emptyMap();
                                    }
                                    return genericTypeToken.toGenericType(typePool, typeVariableSource, "", map);
                                }

                                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                                public int size() {
                                    return this.boundTypeTokens.size();
                                }
                            }
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForGenericArray implements GenericTypeToken {
                    private final GenericTypeToken componentTypeToken;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.componentTypeToken.equals(((ForGenericArray) obj).componentTypeToken);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.componentTypeToken.hashCode();
                    }

                    protected ForGenericArray(GenericTypeToken genericTypeToken) {
                        this.componentTypeToken = genericTypeToken;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                        return new LazyGenericArray(typePool, typeVariableSource, str, map, this.componentTypeToken);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(TypePool typePool) {
                        throw new IllegalStateException("A generic array type cannot be a type variable bound: " + this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public String getTypePathPrefix() {
                        throw new IllegalStateException("A generic array type cannot be the owner of a nested type: " + this);
                    }

                    protected static class LazyGenericArray extends TypeDescription.Generic.OfGenericArray {
                        private final Map<String, List<AnnotationToken>> annotationTokens;
                        private final GenericTypeToken componentTypeToken;
                        private final String typePath;
                        private final TypePool typePool;
                        private final TypeVariableSource typeVariableSource;

                        protected LazyGenericArray(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map, GenericTypeToken genericTypeToken) {
                            this.typePool = typePool;
                            this.typeVariableSource = typeVariableSource;
                            this.typePath = str;
                            this.annotationTokens = map;
                            this.componentTypeToken = genericTypeToken;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                        public TypeDescription.Generic getComponentType() {
                            return this.componentTypeToken.toGenericType(this.typePool, this.typeVariableSource, this.typePath + '[', this.annotationTokens);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(this.typePath));
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForLowerBoundWildcard implements GenericTypeToken {
                    private final GenericTypeToken boundTypeToken;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.boundTypeToken.equals(((ForLowerBoundWildcard) obj).boundTypeToken);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.boundTypeToken.hashCode();
                    }

                    protected ForLowerBoundWildcard(GenericTypeToken genericTypeToken) {
                        this.boundTypeToken = genericTypeToken;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                        return new LazyLowerBoundWildcard(typePool, typeVariableSource, str, map, this.boundTypeToken);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(TypePool typePool) {
                        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public String getTypePathPrefix() {
                        throw new IllegalStateException("A lower bound wildcard cannot be the owner of a nested type: " + this);
                    }

                    protected static class LazyLowerBoundWildcard extends TypeDescription.Generic.OfWildcardType {
                        private final Map<String, List<AnnotationToken>> annotationTokens;
                        private final GenericTypeToken boundTypeToken;
                        private final String typePath;
                        private final TypePool typePool;
                        private final TypeVariableSource typeVariableSource;

                        protected LazyLowerBoundWildcard(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map, GenericTypeToken genericTypeToken) {
                            this.typePool = typePool;
                            this.typeVariableSource = typeVariableSource;
                            this.typePath = str;
                            this.annotationTokens = map;
                            this.boundTypeToken = genericTypeToken;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getUpperBounds() {
                            return new TypeList.Generic.Explicit(TypeDescription.Generic.OBJECT);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getLowerBounds() {
                            return new LazyTokenList.ForWildcardBound(this.typePool, this.typeVariableSource, this.typePath, this.annotationTokens, this.boundTypeToken);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(this.typePath));
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForUpperBoundWildcard implements GenericTypeToken {
                    private final GenericTypeToken boundTypeToken;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.boundTypeToken.equals(((ForUpperBoundWildcard) obj).boundTypeToken);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.boundTypeToken.hashCode();
                    }

                    protected ForUpperBoundWildcard(GenericTypeToken genericTypeToken) {
                        this.boundTypeToken = genericTypeToken;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                        return new LazyUpperBoundWildcard(typePool, typeVariableSource, str, map, this.boundTypeToken);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(TypePool typePool) {
                        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public String getTypePathPrefix() {
                        throw new IllegalStateException("An upper bound wildcard cannot be the owner of a nested type: " + this);
                    }

                    protected static class LazyUpperBoundWildcard extends TypeDescription.Generic.OfWildcardType {
                        private final Map<String, List<AnnotationToken>> annotationTokens;
                        private final GenericTypeToken boundTypeToken;
                        private final String typePath;
                        private final TypePool typePool;
                        private final TypeVariableSource typeVariableSource;

                        protected LazyUpperBoundWildcard(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map, GenericTypeToken genericTypeToken) {
                            this.typePool = typePool;
                            this.typeVariableSource = typeVariableSource;
                            this.typePath = str;
                            this.annotationTokens = map;
                            this.boundTypeToken = genericTypeToken;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getUpperBounds() {
                            return new LazyTokenList.ForWildcardBound(this.typePool, this.typeVariableSource, this.typePath, this.annotationTokens, this.boundTypeToken);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getLowerBounds() {
                            return new TypeList.Generic.Empty();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(this.typePath));
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForParameterizedType implements GenericTypeToken {
                    private final String name;
                    private final List<GenericTypeToken> parameterTypeTokens;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForParameterizedType forParameterizedType = (ForParameterizedType) obj;
                        return this.name.equals(forParameterizedType.name) && this.parameterTypeTokens.equals(forParameterizedType.parameterTypeTokens);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.parameterTypeTokens.hashCode();
                    }

                    protected ForParameterizedType(String str, List<GenericTypeToken> list) {
                        this.name = str;
                        this.parameterTypeTokens = list;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                        return new LazyParameterizedType(typePool, typeVariableSource, str, map, this.name, this.parameterTypeTokens);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(TypePool typePool) {
                        return !typePool.describe(this.name).resolve().isInterface();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public String getTypePathPrefix() {
                        return String.valueOf(GenericTypeToken.INNER_CLASS_PATH);
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Nested implements GenericTypeToken {
                        private final String name;
                        private final GenericTypeToken ownerTypeToken;
                        private final List<GenericTypeToken> parameterTypeTokens;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            Nested nested = (Nested) obj;
                            return this.name.equals(nested.name) && this.parameterTypeTokens.equals(nested.parameterTypeTokens) && this.ownerTypeToken.equals(nested.ownerTypeToken);
                        }

                        public int hashCode() {
                            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.parameterTypeTokens.hashCode()) * 31) + this.ownerTypeToken.hashCode();
                        }

                        protected Nested(String str, List<GenericTypeToken> list, GenericTypeToken genericTypeToken) {
                            this.name = str;
                            this.parameterTypeTokens = list;
                            this.ownerTypeToken = genericTypeToken;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public TypeDescription.Generic toGenericType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map) {
                            return new LazyParameterizedType(typePool, typeVariableSource, str, map, this.name, this.parameterTypeTokens, this.ownerTypeToken);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public String getTypePathPrefix() {
                            return this.ownerTypeToken.getTypePathPrefix() + GenericTypeToken.INNER_CLASS_PATH;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public boolean isPrimaryBound(TypePool typePool) {
                            return !typePool.describe(this.name).resolve().isInterface();
                        }

                        protected static class LazyParameterizedType extends TypeDescription.Generic.OfParameterizedType {
                            private final Map<String, List<AnnotationToken>> annotationTokens;
                            private final String name;
                            private final GenericTypeToken ownerTypeToken;
                            private final List<GenericTypeToken> parameterTypeTokens;
                            private final String typePath;
                            private final TypePool typePool;
                            private final TypeVariableSource typeVariableSource;

                            protected LazyParameterizedType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map, String str2, List<GenericTypeToken> list, GenericTypeToken genericTypeToken) {
                                this.typePool = typePool;
                                this.typeVariableSource = typeVariableSource;
                                this.typePath = str;
                                this.annotationTokens = map;
                                this.name = str2;
                                this.parameterTypeTokens = list;
                                this.ownerTypeToken = genericTypeToken;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                            public TypeDescription asErasure() {
                                return this.typePool.describe(this.name).resolve();
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public TypeList.Generic getTypeArguments() {
                                return new LazyTokenList(this.typePool, this.typeVariableSource, this.typePath + this.ownerTypeToken.getTypePathPrefix(), this.annotationTokens, this.parameterTypeTokens);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public TypeDescription.Generic getOwnerType() {
                                return this.ownerTypeToken.toGenericType(this.typePool, this.typeVariableSource, this.typePath, this.annotationTokens);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                            public AnnotationList getDeclaredAnnotations() {
                                return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(this.typePath + this.ownerTypeToken.getTypePathPrefix()));
                            }
                        }
                    }

                    protected static class LazyParameterizedType extends TypeDescription.Generic.OfParameterizedType {
                        private final Map<String, List<AnnotationToken>> annotationTokens;
                        private final String name;
                        private final List<GenericTypeToken> parameterTypeTokens;
                        private final String typePath;
                        private final TypePool typePool;
                        private final TypeVariableSource typeVariableSource;

                        protected LazyParameterizedType(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map, String str2, List<GenericTypeToken> list) {
                            this.typePool = typePool;
                            this.typeVariableSource = typeVariableSource;
                            this.typePath = str;
                            this.annotationTokens = map;
                            this.name = str2;
                            this.parameterTypeTokens = list;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                        public TypeDescription asErasure() {
                            return this.typePool.describe(this.name).resolve();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getTypeArguments() {
                            return new LazyTokenList(this.typePool, this.typeVariableSource, this.typePath, this.annotationTokens, this.parameterTypeTokens);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeDescription.Generic getOwnerType() {
                            TypeDescription enclosingType = this.typePool.describe(this.name).resolve().getEnclosingType();
                            if (enclosingType == null) {
                                return TypeDescription.Generic.UNDEFINED;
                            }
                            return enclosingType.asGenericType();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return LazyAnnotationDescription.asListOfNullable(this.typePool, this.annotationTokens.get(this.typePath));
                        }
                    }
                }

                public static class LazyTokenList extends TypeList.Generic.AbstractBase {
                    private final Map<String, List<AnnotationToken>> annotationTokens;
                    private final List<GenericTypeToken> genericTypeTokens;
                    private final String typePath;
                    private final TypePool typePool;
                    private final TypeVariableSource typeVariableSource;

                    protected LazyTokenList(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map, List<GenericTypeToken> list) {
                        this.typePool = typePool;
                        this.typeVariableSource = typeVariableSource;
                        this.typePath = str;
                        this.annotationTokens = map;
                        this.genericTypeTokens = list;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public TypeDescription.Generic get(int i) {
                        return this.genericTypeTokens.get(i).toGenericType(this.typePool, this.typeVariableSource, this.typePath + i + GenericTypeToken.INDEXED_TYPE_DELIMITER, this.annotationTokens);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.genericTypeTokens.size();
                    }

                    protected static class ForWildcardBound extends TypeList.Generic.AbstractBase {
                        private final Map<String, List<AnnotationToken>> annotationTokens;
                        private final GenericTypeToken genericTypeToken;
                        private final String typePath;
                        private final TypePool typePool;
                        private final TypeVariableSource typeVariableSource;

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                            return 1;
                        }

                        protected ForWildcardBound(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<AnnotationToken>> map, GenericTypeToken genericTypeToken) {
                            this.typePool = typePool;
                            this.typeVariableSource = typeVariableSource;
                            this.typePath = str;
                            this.annotationTokens = map;
                            this.genericTypeToken = genericTypeToken;
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public TypeDescription.Generic get(int i) {
                            if (i == 0) {
                                return this.genericTypeToken.toGenericType(this.typePool, this.typeVariableSource, this.typePath + GenericTypeToken.WILDCARD_TYPE_PATH, this.annotationTokens);
                            }
                            throw new IndexOutOfBoundsException("index = " + i);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class AnnotationToken {
                private final String descriptor;
                private final Map<String, AnnotationValue<?, ?>> values;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AnnotationToken annotationToken = (AnnotationToken) obj;
                    return this.descriptor.equals(annotationToken.descriptor) && this.values.equals(annotationToken.values);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.descriptor.hashCode()) * 31) + this.values.hashCode();
                }

                protected AnnotationToken(String str, Map<String, AnnotationValue<?, ?>> map) {
                    this.descriptor = str;
                    this.values = map;
                }

                protected Map<String, AnnotationValue<?, ?>> getValues() {
                    return this.values;
                }

                protected String getBinaryName() {
                    String str = this.descriptor;
                    return str.substring(1, str.length() - 1).replace('/', GenericTypeToken.INNER_CLASS_PATH);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public Resolution toAnnotationDescription(TypePool typePool) {
                    Resolution describe = typePool.describe(getBinaryName());
                    if (describe.isResolved()) {
                        return new Resolution.Simple(new LazyAnnotationDescription(typePool, describe.resolve(), this.values));
                    }
                    return new Resolution.Illegal(getBinaryName());
                }

                protected interface Resolution {
                    boolean isResolved();

                    AnnotationDescription resolve();

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Simple implements Resolution {
                        private final AnnotationDescription annotationDescription;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.annotationDescription.equals(((Simple) obj).annotationDescription);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationDescription.hashCode();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution
                        public boolean isResolved() {
                            return true;
                        }

                        protected Simple(AnnotationDescription annotationDescription) {
                            this.annotationDescription = annotationDescription;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution
                        public AnnotationDescription resolve() {
                            return this.annotationDescription;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Illegal implements Resolution {
                        private final String annotationType;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.annotationType.equals(((Illegal) obj).annotationType);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution
                        public boolean isResolved() {
                            return false;
                        }

                        public Illegal(String str) {
                            this.annotationType = str;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution
                        public AnnotationDescription resolve() {
                            throw new IllegalStateException("Annotation type is not available: " + this.annotationType);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class FieldToken {
                private final List<AnnotationToken> annotationTokens;
                private final String descriptor;
                private final String genericSignature;
                private final int modifiers;
                private final String name;
                private final GenericTypeToken.Resolution.ForField signatureResolution;
                private final Map<String, List<AnnotationToken>> typeAnnotationTokens;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    FieldToken fieldToken = (FieldToken) obj;
                    return this.name.equals(fieldToken.name) && this.modifiers == fieldToken.modifiers && this.descriptor.equals(fieldToken.descriptor) && this.genericSignature.equals(fieldToken.genericSignature) && this.signatureResolution.equals(fieldToken.signatureResolution) && this.typeAnnotationTokens.equals(fieldToken.typeAnnotationTokens) && this.annotationTokens.equals(fieldToken.annotationTokens);
                }

                public int hashCode() {
                    return ((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.modifiers) * 31) + this.descriptor.hashCode()) * 31) + this.genericSignature.hashCode()) * 31) + this.signatureResolution.hashCode()) * 31) + this.typeAnnotationTokens.hashCode()) * 31) + this.annotationTokens.hashCode();
                }

                protected FieldToken(String str, int i, String str2, String str3, Map<String, List<AnnotationToken>> map, List<AnnotationToken> list) {
                    this.modifiers = i & (-131073);
                    this.name = str;
                    this.descriptor = str2;
                    this.genericSignature = str3;
                    this.signatureResolution = TypeDescription.AbstractBase.RAW_TYPES ? GenericTypeToken.Resolution.Raw.INSTANCE : GenericTypeExtractor.ForSignature.OfField.extract(str3);
                    this.typeAnnotationTokens = map;
                    this.annotationTokens = list;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public LazyFieldDescription toFieldDescription(LazyTypeDescription lazyTypeDescription) {
                    lazyTypeDescription.getClass();
                    return new LazyFieldDescription(this.name, this.modifiers, this.descriptor, this.genericSignature, this.signatureResolution, this.typeAnnotationTokens, this.annotationTokens);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class MethodToken {
                private final List<AnnotationToken> annotationTokens;
                private final AnnotationValue<?, ?> defaultValue;
                private final String descriptor;
                private final String[] exceptionName;
                private final Map<Integer, Map<String, List<AnnotationToken>>> exceptionTypeAnnotationTokens;
                private final String genericSignature;
                private final int modifiers;
                private final String name;
                private final Map<Integer, List<AnnotationToken>> parameterAnnotationTokens;
                private final List<ParameterToken> parameterTokens;
                private final Map<Integer, Map<String, List<AnnotationToken>>> parameterTypeAnnotationTokens;
                private final Map<String, List<AnnotationToken>> receiverTypeAnnotationTokens;
                private final Map<String, List<AnnotationToken>> returnTypeAnnotationTokens;
                private final GenericTypeToken.Resolution.ForMethod signatureResolution;
                private final Map<Integer, Map<String, List<AnnotationToken>>> typeVariableAnnotationTokens;
                private final Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> typeVariableBoundAnnotationTokens;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    MethodToken methodToken = (MethodToken) obj;
                    return this.name.equals(methodToken.name) && this.modifiers == methodToken.modifiers && this.descriptor.equals(methodToken.descriptor) && this.genericSignature.equals(methodToken.genericSignature) && this.signatureResolution.equals(methodToken.signatureResolution) && Arrays.equals(this.exceptionName, methodToken.exceptionName) && this.typeVariableAnnotationTokens.equals(methodToken.typeVariableAnnotationTokens) && this.typeVariableBoundAnnotationTokens.equals(methodToken.typeVariableBoundAnnotationTokens) && this.returnTypeAnnotationTokens.equals(methodToken.returnTypeAnnotationTokens) && this.parameterTypeAnnotationTokens.equals(methodToken.parameterTypeAnnotationTokens) && this.exceptionTypeAnnotationTokens.equals(methodToken.exceptionTypeAnnotationTokens) && this.receiverTypeAnnotationTokens.equals(methodToken.receiverTypeAnnotationTokens) && this.annotationTokens.equals(methodToken.annotationTokens) && this.parameterAnnotationTokens.equals(methodToken.parameterAnnotationTokens) && this.parameterTokens.equals(methodToken.parameterTokens) && this.defaultValue.equals(methodToken.defaultValue);
                }

                public int hashCode() {
                    return ((((((((((((((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.modifiers) * 31) + this.descriptor.hashCode()) * 31) + this.genericSignature.hashCode()) * 31) + this.signatureResolution.hashCode()) * 31) + Arrays.hashCode(this.exceptionName)) * 31) + this.typeVariableAnnotationTokens.hashCode()) * 31) + this.typeVariableBoundAnnotationTokens.hashCode()) * 31) + this.returnTypeAnnotationTokens.hashCode()) * 31) + this.parameterTypeAnnotationTokens.hashCode()) * 31) + this.exceptionTypeAnnotationTokens.hashCode()) * 31) + this.receiverTypeAnnotationTokens.hashCode()) * 31) + this.annotationTokens.hashCode()) * 31) + this.parameterAnnotationTokens.hashCode()) * 31) + this.parameterTokens.hashCode()) * 31) + this.defaultValue.hashCode();
                }

                protected MethodToken(String str, int i, String str2, String str3, String[] strArr, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map2, Map<String, List<AnnotationToken>> map3, Map<Integer, Map<String, List<AnnotationToken>>> map4, Map<Integer, Map<String, List<AnnotationToken>>> map5, Map<String, List<AnnotationToken>> map6, List<AnnotationToken> list, Map<Integer, List<AnnotationToken>> map7, List<ParameterToken> list2, AnnotationValue<?, ?> annotationValue) {
                    this.modifiers = (-131073) & i;
                    this.name = str;
                    this.descriptor = str2;
                    this.genericSignature = str3;
                    this.signatureResolution = TypeDescription.AbstractBase.RAW_TYPES ? GenericTypeToken.Resolution.Raw.INSTANCE : GenericTypeExtractor.ForSignature.OfMethod.extract(str3);
                    this.exceptionName = strArr;
                    this.typeVariableAnnotationTokens = map;
                    this.typeVariableBoundAnnotationTokens = map2;
                    this.returnTypeAnnotationTokens = map3;
                    this.parameterTypeAnnotationTokens = map4;
                    this.exceptionTypeAnnotationTokens = map5;
                    this.receiverTypeAnnotationTokens = map6;
                    this.annotationTokens = list;
                    this.parameterAnnotationTokens = map7;
                    this.parameterTokens = list2;
                    this.defaultValue = annotationValue;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public MethodDescription.InDefinedShape toMethodDescription(LazyTypeDescription lazyTypeDescription) {
                    lazyTypeDescription.getClass();
                    return new LazyMethodDescription(this.name, this.modifiers, this.descriptor, this.genericSignature, this.signatureResolution, this.exceptionName, this.typeVariableAnnotationTokens, this.typeVariableBoundAnnotationTokens, this.returnTypeAnnotationTokens, this.parameterTypeAnnotationTokens, this.exceptionTypeAnnotationTokens, this.receiverTypeAnnotationTokens, this.annotationTokens, this.parameterAnnotationTokens, this.parameterTokens, this.defaultValue);
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ParameterToken {
                    protected static final Integer NO_MODIFIERS = null;
                    protected static final String NO_NAME = null;

                    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                    private final Integer modifiers;

                    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                    private final String name;

                    /* JADX WARN: Code restructure failed: missing block: B:27:0x0024, code lost:
                    
                        if (r2 != null) goto L18;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[RETURN] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        String str = this.name;
                        ParameterToken parameterToken = (ParameterToken) obj;
                        String str2 = parameterToken.name;
                        if (str2 != null) {
                            if (str == null || !str.equals(str2)) {
                                return false;
                            }
                            Integer num = this.modifiers;
                            Integer num2 = parameterToken.modifiers;
                            if (num2 != null) {
                                return num != null && num.equals(num2);
                            }
                            if (num != null) {
                                return false;
                            }
                        }
                    }

                    public int hashCode() {
                        String str = this.name;
                        int i = IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
                        if (str != null) {
                            i = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + str.hashCode();
                        }
                        int i2 = i * 31;
                        Integer num = this.modifiers;
                        return num != null ? i2 + num.hashCode() : i2;
                    }

                    protected ParameterToken() {
                        this(NO_NAME);
                    }

                    protected ParameterToken(String str) {
                        this(str, NO_MODIFIERS);
                    }

                    protected ParameterToken(String str, Integer num) {
                        this.name = str;
                        this.modifiers = num;
                    }

                    protected String getName() {
                        return this.name;
                    }

                    protected Integer getModifiers() {
                        return this.modifiers;
                    }
                }
            }

            private static class LazyAnnotationDescription extends AnnotationDescription.AbstractBase {
                private final TypeDescription annotationType;
                protected final TypePool typePool;
                protected final Map<String, AnnotationValue<?, ?>> values;

                private LazyAnnotationDescription(TypePool typePool, TypeDescription typeDescription, Map<String, AnnotationValue<?, ?>> map) {
                    this.typePool = typePool;
                    this.annotationType = typeDescription;
                    this.values = map;
                }

                protected static AnnotationList asListOfNullable(TypePool typePool, List<? extends AnnotationToken> list) {
                    if (list == null) {
                        return new AnnotationList.Empty();
                    }
                    return asList(typePool, list);
                }

                protected static AnnotationList asList(TypePool typePool, List<? extends AnnotationToken> list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator<? extends AnnotationToken> it = list.iterator();
                    while (it.hasNext()) {
                        AnnotationToken.Resolution annotationDescription = it.next().toAnnotationDescription(typePool);
                        if (annotationDescription.isResolved()) {
                            arrayList.add(annotationDescription.resolve());
                        }
                    }
                    return new AnnotationList.Explicit(arrayList);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription
                public AnnotationValue<?, ?> getValue(MethodDescription.InDefinedShape inDefinedShape) {
                    if (!inDefinedShape.getDeclaringType().asErasure().equals(this.annotationType)) {
                        throw new IllegalArgumentException(inDefinedShape + " is not declared by " + getAnnotationType());
                    }
                    AnnotationValue<?, ?> annotationValue = this.values.get(inDefinedShape.getName());
                    if (annotationValue == null) {
                        annotationValue = ((MethodDescription.InDefinedShape) getAnnotationType().getDeclaredMethods().filter(ElementMatchers.is(inDefinedShape)).getOnly()).getDefaultValue();
                    }
                    if (annotationValue != null) {
                        return annotationValue;
                    }
                    throw new IllegalStateException(inDefinedShape + " is not defined on annotation");
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription
                public TypeDescription getAnnotationType() {
                    return this.annotationType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription
                public <T extends Annotation> Loadable<T> prepare(Class<T> cls) {
                    if (!this.annotationType.represents(cls)) {
                        throw new IllegalArgumentException(cls + " does not represent " + this.annotationType);
                    }
                    return new Loadable<>(this.typePool, cls, this.values);
                }

                private static class Loadable<S extends Annotation> extends LazyAnnotationDescription implements AnnotationDescription.Loadable<S> {
                    private final Class<S> annotationType;

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription, org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription
                    public /* bridge */ /* synthetic */ AnnotationDescription.Loadable prepare(Class cls) {
                        return super.prepare(cls);
                    }

                    private Loadable(TypePool typePool, Class<S> cls, Map<String, AnnotationValue<?, ?>> map) {
                        super(typePool, TypeDescription.ForLoadedType.of(cls), map);
                        this.annotationType = cls;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription.Loadable
                    public S load() throws ClassNotFoundException {
                        return (S) AnnotationDescription.AnnotationInvocationHandler.of(this.annotationType.getClassLoader(), this.annotationType, this.values);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription.Loadable
                    public S loadSilent() {
                        try {
                            return load();
                        } catch (ClassNotFoundException e) {
                            throw new IllegalStateException("Could not load annotation type or referenced type", e);
                        }
                    }
                }
            }

            private static class LazyPackageDescription extends PackageDescription.AbstractBase {
                private final String name;
                private final TypePool typePool;

                private LazyPackageDescription(TypePool typePool, String str) {
                    this.typePool = typePool;
                    this.name = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    Resolution describe = this.typePool.describe(this.name + ".package-info");
                    return describe.isResolved() ? describe.resolve().getDeclaredAnnotations() : new AnnotationList.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getName() {
                    return this.name;
                }
            }

            protected static class LazyTypeList extends TypeList.AbstractBase {
                private final List<String> descriptors;
                private final TypePool typePool;

                protected LazyTypeList(TypePool typePool, List<String> list) {
                    this.typePool = typePool;
                    this.descriptors = list;
                }

                @Override // java.util.AbstractList, java.util.List
                public TypeDescription get(int i) {
                    return TokenizedGenericType.toErasure(this.typePool, this.descriptors.get(i));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return this.descriptors.size();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList
                public String[] toInternalNames() {
                    int size = this.descriptors.size();
                    String[] strArr = new String[size];
                    Iterator<String> it = this.descriptors.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        strArr[i] = Type.getType(it.next()).getInternalName();
                        i++;
                    }
                    return size == 0 ? NO_INTERFACES : strArr;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList
                public int getStackSize() {
                    Iterator<String> it = this.descriptors.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i += Type.getType(it.next()).getSize();
                    }
                    return i;
                }
            }

            protected static class LazyNestMemberList extends TypeList.AbstractBase {
                private final List<String> nestMembers;
                private final TypeDescription typeDescription;
                private final TypePool typePool;

                protected LazyNestMemberList(TypeDescription typeDescription, TypePool typePool, List<String> list) {
                    this.typeDescription = typeDescription;
                    this.typePool = typePool;
                    this.nestMembers = list;
                }

                @Override // java.util.AbstractList, java.util.List
                public TypeDescription get(int i) {
                    if (i == 0) {
                        return this.typeDescription;
                    }
                    return this.typePool.describe(this.nestMembers.get(i)).resolve();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return this.nestMembers.size() + 1;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList
                public String[] toInternalNames() {
                    int i = 1;
                    String[] strArr = new String[this.nestMembers.size() + 1];
                    strArr[0] = this.typeDescription.getInternalName();
                    Iterator<String> it = this.nestMembers.iterator();
                    while (it.hasNext()) {
                        strArr[i] = it.next().replace(GenericTypeToken.INNER_CLASS_PATH, '/');
                        i++;
                    }
                    return strArr;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList
                public int getStackSize() {
                    return this.nestMembers.size() + 1;
                }
            }

            protected static class TokenizedGenericType extends TypeDescription.Generic.LazyProjection.WithEagerNavigation {
                private final Map<String, List<AnnotationToken>> annotationTokens;
                private transient /* synthetic */ TypeDescription erasure;
                private final GenericTypeToken genericTypeToken;
                private final String rawTypeDescriptor;
                private transient /* synthetic */ TypeDescription.Generic resolved;
                private final TypePool typePool;
                private final TypeVariableSource typeVariableSource;

                protected TokenizedGenericType(TypePool typePool, GenericTypeToken genericTypeToken, String str, Map<String, List<AnnotationToken>> map, TypeVariableSource typeVariableSource) {
                    this.typePool = typePool;
                    this.genericTypeToken = genericTypeToken;
                    this.rawTypeDescriptor = str;
                    this.annotationTokens = map;
                    this.typeVariableSource = typeVariableSource;
                }

                protected static TypeDescription.Generic of(TypePool typePool, GenericTypeToken genericTypeToken, String str, Map<String, List<AnnotationToken>> map, TypeVariableSource typeVariableSource) {
                    if (map == null) {
                        map = Collections.emptyMap();
                    }
                    return new TokenizedGenericType(typePool, genericTypeToken, str, map, typeVariableSource);
                }

                protected static TypeDescription toErasure(TypePool typePool, String str) {
                    String className;
                    Type type = Type.getType(str);
                    if (type.getSort() == 9) {
                        className = type.getInternalName().replace('/', GenericTypeToken.INNER_CLASS_PATH);
                    } else {
                        className = type.getClassName();
                    }
                    return typePool.describe(className).resolve();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected TypeDescription.Generic resolve() {
                    TypeDescription.Generic genericType = this.resolved != null ? null : this.genericTypeToken.toGenericType(this.typePool, this.typeVariableSource, "", this.annotationTokens);
                    if (genericType == null) {
                        return this.resolved;
                    }
                    this.resolved = genericType;
                    return genericType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                @CachedReturnPlugin.Enhance("erasure")
                public TypeDescription asErasure() {
                    TypeDescription erasure = this.erasure != null ? null : toErasure(this.typePool, this.rawTypeDescriptor);
                    if (erasure == null) {
                        return this.erasure;
                    }
                    this.erasure = erasure;
                    return erasure;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return resolve().getDeclaredAnnotations();
                }

                protected static class TokenList extends TypeList.Generic.AbstractBase {
                    private final Map<Integer, Map<String, List<AnnotationToken>>> annotationTokens;
                    private final List<GenericTypeToken> genericTypeTokens;
                    private final List<String> rawTypeDescriptors;
                    private final TypePool typePool;
                    private final TypeVariableSource typeVariableSource;

                    private TokenList(TypePool typePool, List<GenericTypeToken> list, Map<Integer, Map<String, List<AnnotationToken>>> map, List<String> list2, TypeVariableSource typeVariableSource) {
                        this.typePool = typePool;
                        this.genericTypeTokens = list;
                        this.annotationTokens = map;
                        this.rawTypeDescriptors = list2;
                        this.typeVariableSource = typeVariableSource;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public TypeDescription.Generic get(int i) {
                        if (this.rawTypeDescriptors.size() == this.genericTypeTokens.size()) {
                            return TokenizedGenericType.of(this.typePool, this.genericTypeTokens.get(i), this.rawTypeDescriptors.get(i), this.annotationTokens.get(Integer.valueOf(i)), this.typeVariableSource);
                        }
                        return TokenizedGenericType.toErasure(this.typePool, this.rawTypeDescriptors.get(i)).asGenericType();
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.rawTypeDescriptors.size();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
                    public TypeList asErasures() {
                        return new LazyTypeList(this.typePool, this.rawTypeDescriptors);
                    }
                }

                protected static class TypeVariableList extends TypeList.Generic.AbstractBase {
                    private final Map<Integer, Map<String, List<AnnotationToken>>> annotationTokens;
                    private final Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> boundAnnotationTokens;
                    private final TypePool typePool;
                    private final TypeVariableSource typeVariableSource;
                    private final List<GenericTypeToken.OfFormalTypeVariable> typeVariables;

                    protected TypeVariableList(TypePool typePool, List<GenericTypeToken.OfFormalTypeVariable> list, TypeVariableSource typeVariableSource, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map2) {
                        this.typePool = typePool;
                        this.typeVariables = list;
                        this.typeVariableSource = typeVariableSource;
                        this.annotationTokens = map;
                        this.boundAnnotationTokens = map2;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public TypeDescription.Generic get(int i) {
                        return this.typeVariables.get(i).toGenericType(this.typePool, this.typeVariableSource, this.annotationTokens.get(Integer.valueOf(i)), this.boundAnnotationTokens.get(Integer.valueOf(i)));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.typeVariables.size();
                    }
                }

                protected static class Malformed extends TypeDescription.Generic.LazyProjection.WithEagerNavigation {
                    private final String rawTypeDescriptor;
                    private final TypePool typePool;

                    protected Malformed(TypePool typePool, String str) {
                        this.typePool = typePool;
                        this.rawTypeDescriptor = str;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                    protected TypeDescription.Generic resolve() {
                        throw new GenericSignatureFormatError();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public TypeDescription asErasure() {
                        return TokenizedGenericType.toErasure(this.typePool, this.rawTypeDescriptor);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        throw new GenericSignatureFormatError();
                    }

                    protected static class TokenList extends TypeList.Generic.AbstractBase {
                        private final List<String> rawTypeDescriptors;
                        private final TypePool typePool;

                        protected TokenList(TypePool typePool, List<String> list) {
                            this.typePool = typePool;
                            this.rawTypeDescriptors = list;
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public TypeDescription.Generic get(int i) {
                            return new Malformed(this.typePool, this.rawTypeDescriptors.get(i));
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                            return this.rawTypeDescriptors.size();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
                        public TypeList asErasures() {
                            return new LazyTypeList(this.typePool, this.rawTypeDescriptors);
                        }
                    }
                }
            }

            private class LazyFieldDescription extends FieldDescription.InDefinedShape.AbstractBase {
                private final List<AnnotationToken> annotationTokens;
                private final String descriptor;
                private final String genericSignature;
                private final int modifiers;
                private final String name;
                private final GenericTypeToken.Resolution.ForField signatureResolution;
                private final Map<String, List<AnnotationToken>> typeAnnotationTokens;

                private LazyFieldDescription(String str, int i, String str2, String str3, GenericTypeToken.Resolution.ForField forField, Map<String, List<AnnotationToken>> map, List<AnnotationToken> list) {
                    this.modifiers = i;
                    this.name = str;
                    this.descriptor = str2;
                    this.genericSignature = str3;
                    this.signatureResolution = forField;
                    this.typeAnnotationTokens = map;
                    this.annotationTokens = list;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription
                public TypeDescription.Generic getType() {
                    return this.signatureResolution.resolveFieldType(this.descriptor, LazyTypeDescription.this.typePool, this.typeAnnotationTokens, this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return LazyAnnotationDescription.asListOfNullable(LazyTypeDescription.this.typePool, this.annotationTokens);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getName() {
                    return this.name;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return LazyTypeDescription.this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                    return this.modifiers;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.field.FieldDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ByteCodeElement
                public String getGenericSignature() {
                    return this.genericSignature;
                }
            }

            private class LazyMethodDescription extends MethodDescription.InDefinedShape.AbstractBase {
                private final List<AnnotationToken> annotationTokens;
                private final AnnotationValue<?, ?> defaultValue;
                private final Map<Integer, Map<String, List<AnnotationToken>>> exceptionTypeAnnotationTokens;
                private final List<String> exceptionTypeDescriptors;
                private final String genericSignature;
                private final String internalName;
                private final int modifiers;
                private final Map<Integer, List<AnnotationToken>> parameterAnnotationTokens;
                private final Integer[] parameterModifiers;
                private final String[] parameterNames;
                private final Map<Integer, Map<String, List<AnnotationToken>>> parameterTypeAnnotationTokens;
                private final List<String> parameterTypeDescriptors;
                private final Map<String, List<AnnotationToken>> receiverTypeAnnotationTokens;
                private final Map<String, List<AnnotationToken>> returnTypeAnnotationTokens;
                private final String returnTypeDescriptor;
                private final GenericTypeToken.Resolution.ForMethod signatureResolution;
                private final Map<Integer, Map<String, List<AnnotationToken>>> typeVariableAnnotationTokens;
                private final Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> typeVariableBoundAnnotationTokens;

                private LazyMethodDescription(String str, int i, String str2, String str3, GenericTypeToken.Resolution.ForMethod forMethod, String[] strArr, Map<Integer, Map<String, List<AnnotationToken>>> map, Map<Integer, Map<Integer, Map<String, List<AnnotationToken>>>> map2, Map<String, List<AnnotationToken>> map3, Map<Integer, Map<String, List<AnnotationToken>>> map4, Map<Integer, Map<String, List<AnnotationToken>>> map5, Map<String, List<AnnotationToken>> map6, List<AnnotationToken> list, Map<Integer, List<AnnotationToken>> map7, List<MethodToken.ParameterToken> list2, AnnotationValue<?, ?> annotationValue) {
                    this.modifiers = i;
                    this.internalName = str;
                    Type methodType = Type.getMethodType(str2);
                    Type returnType = methodType.getReturnType();
                    Type[] argumentTypes = methodType.getArgumentTypes();
                    this.returnTypeDescriptor = returnType.getDescriptor();
                    this.parameterTypeDescriptors = new ArrayList(argumentTypes.length);
                    int i2 = 0;
                    for (Type type : argumentTypes) {
                        this.parameterTypeDescriptors.add(type.getDescriptor());
                    }
                    this.genericSignature = str3;
                    this.signatureResolution = forMethod;
                    if (strArr == null) {
                        this.exceptionTypeDescriptors = Collections.emptyList();
                    } else {
                        this.exceptionTypeDescriptors = new ArrayList(strArr.length);
                        for (String str4 : strArr) {
                            this.exceptionTypeDescriptors.add(Type.getObjectType(str4).getDescriptor());
                        }
                    }
                    this.typeVariableAnnotationTokens = map;
                    this.typeVariableBoundAnnotationTokens = map2;
                    this.returnTypeAnnotationTokens = map3;
                    this.parameterTypeAnnotationTokens = map4;
                    this.exceptionTypeAnnotationTokens = map5;
                    this.receiverTypeAnnotationTokens = map6;
                    this.annotationTokens = list;
                    this.parameterAnnotationTokens = map7;
                    this.parameterNames = new String[argumentTypes.length];
                    this.parameterModifiers = new Integer[argumentTypes.length];
                    if (list2.size() == argumentTypes.length) {
                        for (MethodToken.ParameterToken parameterToken : list2) {
                            this.parameterNames[i2] = parameterToken.getName();
                            this.parameterModifiers[i2] = parameterToken.getModifiers();
                            i2++;
                        }
                    }
                    this.defaultValue = annotationValue;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeDescription.Generic getReturnType() {
                    return this.signatureResolution.resolveReturnType(this.returnTypeDescriptor, LazyTypeDescription.this.typePool, this.returnTypeAnnotationTokens, this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeList.Generic getExceptionTypes() {
                    return this.signatureResolution.resolveExceptionTypes(this.exceptionTypeDescriptors, LazyTypeDescription.this.typePool, this.exceptionTypeAnnotationTokens, this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                    return new LazyParameterList();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return LazyAnnotationDescription.asList(LazyTypeDescription.this.typePool, this.annotationTokens);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getInternalName() {
                    return this.internalName;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return LazyTypeDescription.this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                    return this.modifiers;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
                public TypeList.Generic getTypeVariables() {
                    return this.signatureResolution.resolveTypeVariables(LazyTypeDescription.this.typePool, this, this.typeVariableAnnotationTokens, this.typeVariableBoundAnnotationTokens);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public AnnotationValue<?, ?> getDefaultValue() {
                    return this.defaultValue;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeDescription.Generic getReceiverType() {
                    if (isStatic()) {
                        return TypeDescription.Generic.UNDEFINED;
                    }
                    if (!isConstructor()) {
                        return LazyTypeDescription.this.isGenerified() ? new LazyParameterizedReceiverType(this) : new LazyNonGenericReceiverType(this);
                    }
                    TypeDescription declaringType = getDeclaringType();
                    TypeDescription enclosingType = declaringType.getEnclosingType();
                    return enclosingType == null ? declaringType.isGenerified() ? new LazyParameterizedReceiverType(declaringType) : new LazyNonGenericReceiverType(declaringType) : (declaringType.isStatic() || !declaringType.isGenerified()) ? new LazyNonGenericReceiverType(enclosingType) : new LazyParameterizedReceiverType(enclosingType);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ByteCodeElement
                public String getGenericSignature() {
                    return this.genericSignature;
                }

                private class LazyParameterList extends ParameterList.AbstractBase<ParameterDescription.InDefinedShape> {
                    private LazyParameterList() {
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public ParameterDescription.InDefinedShape get(int i) {
                        return LazyMethodDescription.this.new LazyParameterDescription(i);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.ParameterList
                    public boolean hasExplicitMetaData() {
                        for (int i = 0; i < size(); i++) {
                            if (LazyMethodDescription.this.parameterNames[i] == null || LazyMethodDescription.this.parameterModifiers[i] == null) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return LazyMethodDescription.this.parameterTypeDescriptors.size();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterList.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.ParameterList
                    public TypeList.Generic asTypeList() {
                        return LazyMethodDescription.this.signatureResolution.resolveParameterTypes(LazyMethodDescription.this.parameterTypeDescriptors, LazyTypeDescription.this.typePool, LazyMethodDescription.this.parameterTypeAnnotationTokens, LazyMethodDescription.this);
                    }
                }

                private class LazyParameterDescription extends ParameterDescription.InDefinedShape.AbstractBase {
                    private final int index;

                    protected LazyParameterDescription(int i) {
                        this.index = i;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription, org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.InDefinedShape
                    public MethodDescription.InDefinedShape getDeclaringMethod() {
                        return LazyMethodDescription.this;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
                    public int getIndex() {
                        return this.index;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithOptionalName
                    public boolean isNamed() {
                        return LazyMethodDescription.this.parameterNames[this.index] != null;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
                    public boolean hasModifiers() {
                        return LazyMethodDescription.this.parameterModifiers[this.index] != null;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                    public String getName() {
                        if (isNamed()) {
                            return LazyMethodDescription.this.parameterNames[this.index];
                        }
                        return super.getName();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                    public int getModifiers() {
                        if (hasModifiers()) {
                            return LazyMethodDescription.this.parameterModifiers[this.index].intValue();
                        }
                        return super.getModifiers();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription
                    public TypeDescription.Generic getType() {
                        return (TypeDescription.Generic) LazyMethodDescription.this.signatureResolution.resolveParameterTypes(LazyMethodDescription.this.parameterTypeDescriptors, LazyTypeDescription.this.typePool, LazyMethodDescription.this.parameterTypeAnnotationTokens, LazyMethodDescription.this).get(this.index);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        return LazyAnnotationDescription.asListOfNullable(LazyTypeDescription.this.typePool, (List) LazyMethodDescription.this.parameterAnnotationTokens.get(Integer.valueOf(this.index)));
                    }
                }

                private class LazyParameterizedReceiverType extends TypeDescription.Generic.OfParameterizedType {
                    private final TypeDescription typeDescription;

                    protected LazyParameterizedReceiverType(LazyMethodDescription lazyMethodDescription) {
                        this(LazyTypeDescription.this);
                    }

                    protected LazyParameterizedReceiverType(TypeDescription typeDescription) {
                        this.typeDescription = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public TypeList.Generic getTypeArguments() {
                        return new TypeArgumentList(this.typeDescription.getTypeVariables());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public TypeDescription.Generic getOwnerType() {
                        TypeDescription declaringType = this.typeDescription.getDeclaringType();
                        if (declaringType == null) {
                            return TypeDescription.Generic.UNDEFINED;
                        }
                        return (this.typeDescription.isStatic() || !declaringType.isGenerified()) ? LazyMethodDescription.this.new LazyNonGenericReceiverType(declaringType) : LazyMethodDescription.this.new LazyParameterizedReceiverType(declaringType);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        return LazyAnnotationDescription.asListOfNullable(LazyTypeDescription.this.typePool, (List) LazyMethodDescription.this.receiverTypeAnnotationTokens.get(getTypePath()));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public String getTypePath() {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < this.typeDescription.getInnerClassCount(); i++) {
                            sb = sb.append(GenericTypeToken.INNER_CLASS_PATH);
                        }
                        return sb.toString();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public TypeDescription asErasure() {
                        return this.typeDescription;
                    }

                    protected class TypeArgumentList extends TypeList.Generic.AbstractBase {
                        private final List<? extends TypeDescription.Generic> typeVariables;

                        protected TypeArgumentList(List<? extends TypeDescription.Generic> list) {
                            this.typeVariables = list;
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public TypeDescription.Generic get(int i) {
                            return new AnnotatedTypeVariable(this.typeVariables.get(i), i);
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                            return this.typeVariables.size();
                        }

                        protected class AnnotatedTypeVariable extends TypeDescription.Generic.OfTypeVariable {
                            private final int index;
                            private final TypeDescription.Generic typeVariable;

                            protected AnnotatedTypeVariable(TypeDescription.Generic generic, int i) {
                                this.typeVariable = generic;
                                this.index = i;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public TypeList.Generic getUpperBounds() {
                                return this.typeVariable.getUpperBounds();
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public TypeVariableSource getTypeVariableSource() {
                                return this.typeVariable.getTypeVariableSource();
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                            public String getSymbol() {
                                return this.typeVariable.getSymbol();
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                            public AnnotationList getDeclaredAnnotations() {
                                return LazyAnnotationDescription.asListOfNullable(LazyTypeDescription.this.typePool, (List) LazyMethodDescription.this.receiverTypeAnnotationTokens.get(LazyParameterizedReceiverType.this.getTypePath() + this.index + GenericTypeToken.INDEXED_TYPE_DELIMITER));
                            }
                        }
                    }
                }

                protected class LazyNonGenericReceiverType extends TypeDescription.Generic.OfNonGenericType {
                    private final TypeDescription typeDescription;

                    protected LazyNonGenericReceiverType(LazyMethodDescription lazyMethodDescription) {
                        this(LazyTypeDescription.this);
                    }

                    protected LazyNonGenericReceiverType(TypeDescription typeDescription) {
                        this.typeDescription = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public TypeDescription.Generic getOwnerType() {
                        TypeDescription declaringType = this.typeDescription.getDeclaringType();
                        return declaringType == null ? TypeDescription.Generic.UNDEFINED : LazyMethodDescription.this.new LazyNonGenericReceiverType(declaringType);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public TypeDescription.Generic getComponentType() {
                        return TypeDescription.Generic.UNDEFINED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < this.typeDescription.getInnerClassCount(); i++) {
                            sb = sb.append(GenericTypeToken.INNER_CLASS_PATH);
                        }
                        return LazyAnnotationDescription.asListOfNullable(LazyTypeDescription.this.typePool, (List) LazyMethodDescription.this.receiverTypeAnnotationTokens.get(sb.toString()));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public TypeDescription asErasure() {
                        return this.typeDescription;
                    }
                }
            }
        }

        protected class TypeExtractor extends ClassVisitor {
            private static final int REAL_MODIFIER_MASK = 65535;
            private int actualModifiers;
            private final List<LazyTypeDescription.AnnotationToken> annotationTokens;
            private boolean anonymousType;
            private final List<String> declaredTypes;
            private String declaringTypeName;
            private final List<LazyTypeDescription.FieldToken> fieldTokens;
            private String genericSignature;
            private String[] interfaceName;
            private String internalName;
            private final List<LazyTypeDescription.MethodToken> methodTokens;
            private int modifiers;
            private String nestHost;
            private final List<String> nestMembers;
            private String superClassName;
            private final Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> superTypeAnnotationTokens;
            private LazyTypeDescription.TypeContainment typeContainment;
            private final Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> typeVariableAnnotationTokens;
            private final Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>>> typeVariableBoundsAnnotationTokens;

            protected TypeExtractor() {
                super(OpenedClassReader.ASM_API);
                this.superTypeAnnotationTokens = new HashMap();
                this.typeVariableAnnotationTokens = new HashMap();
                this.typeVariableBoundsAnnotationTokens = new HashMap();
                this.annotationTokens = new ArrayList();
                this.fieldTokens = new ArrayList();
                this.methodTokens = new ArrayList();
                this.anonymousType = false;
                this.typeContainment = LazyTypeDescription.TypeContainment.SelfContained.INSTANCE;
                this.nestMembers = new ArrayList();
                this.declaredTypes = new ArrayList();
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
                this.modifiers = 65535 & i2;
                this.actualModifiers = i2;
                this.internalName = str;
                this.genericSignature = str2;
                this.superClassName = str3;
                this.interfaceName = strArr;
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public void visitOuterClass(String str, String str2, String str3) {
                if (str2 != null) {
                    this.typeContainment = new LazyTypeDescription.TypeContainment.WithinMethod(str, str2, str3);
                } else if (str != null) {
                    this.typeContainment = new LazyTypeDescription.TypeContainment.WithinType(str, true);
                }
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public void visitInnerClass(String str, String str2, String str3, int i) {
                if (str.equals(this.internalName)) {
                    this.modifiers = 65535 & i;
                    if (str3 == null) {
                        this.anonymousType = true;
                    }
                    if (str2 != null) {
                        this.declaringTypeName = str2;
                        if (this.typeContainment.isSelfContained()) {
                            this.typeContainment = new LazyTypeDescription.TypeContainment.WithinType(str2, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (str2 == null || str3 == null || !str2.equals(this.internalName)) {
                    return;
                }
                this.declaredTypes.add("L" + str + ";");
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                AnnotationRegistrant withIndex;
                TypeReference typeReference = new TypeReference(i);
                int sort = typeReference.getSort();
                if (sort == 0) {
                    withIndex = new AnnotationRegistrant.ForTypeVariable.WithIndex(str, typePath, typeReference.getTypeParameterIndex(), this.typeVariableAnnotationTokens);
                } else if (sort == 16) {
                    withIndex = new AnnotationRegistrant.ForTypeVariable.WithIndex(str, typePath, typeReference.getSuperTypeIndex(), this.superTypeAnnotationTokens);
                } else if (sort == 17) {
                    withIndex = new AnnotationRegistrant.ForTypeVariable.WithIndex.DoubleIndexed(str, typePath, typeReference.getTypeParameterBoundIndex(), typeReference.getTypeParameterIndex(), this.typeVariableBoundsAnnotationTokens);
                } else {
                    throw new IllegalArgumentException("Unexpected type reference: " + typeReference.getSort());
                }
                return new AnnotationExtractor(withIndex, new ComponentTypeLocator.ForAnnotationProperty(Default.this, str));
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public AnnotationVisitor visitAnnotation(String str, boolean z) {
                return new AnnotationExtractor(this, str, this.annotationTokens, new ComponentTypeLocator.ForAnnotationProperty(Default.this, str));
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
                return new FieldExtractor(i & 65535, str, str2, str3);
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
                return str.equals(MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) ? Default.IGNORE_METHOD : new MethodExtractor(i & 65535, str, str2, str3, strArr);
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public void visitNestHostExperimental(String str) {
                this.nestHost = str;
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public void visitNestMemberExperimental(String str) {
                this.nestMembers.add(str);
            }

            protected TypeDescription toTypeDescription() {
                return new LazyTypeDescription(Default.this, this.actualModifiers, this.modifiers, this.internalName, this.superClassName, this.interfaceName, this.genericSignature, this.typeContainment, this.declaringTypeName, this.declaredTypes, this.anonymousType, this.nestHost, this.nestMembers, this.superTypeAnnotationTokens, this.typeVariableAnnotationTokens, this.typeVariableBoundsAnnotationTokens, this.annotationTokens, this.fieldTokens, this.methodTokens);
            }

            protected class AnnotationExtractor extends AnnotationVisitor {
                private final AnnotationRegistrant annotationRegistrant;
                private final ComponentTypeLocator componentTypeLocator;

                protected AnnotationExtractor(TypeExtractor typeExtractor, String str, List<LazyTypeDescription.AnnotationToken> list, ComponentTypeLocator componentTypeLocator) {
                    this(new AnnotationRegistrant.ForByteCodeElement(str, list), componentTypeLocator);
                }

                protected AnnotationExtractor(TypeExtractor typeExtractor, String str, int i, Map<Integer, List<LazyTypeDescription.AnnotationToken>> map, ComponentTypeLocator componentTypeLocator) {
                    this(new AnnotationRegistrant.ForByteCodeElement.WithIndex(str, i, map), componentTypeLocator);
                }

                protected AnnotationExtractor(AnnotationRegistrant annotationRegistrant, ComponentTypeLocator componentTypeLocator) {
                    super(OpenedClassReader.ASM_API);
                    this.annotationRegistrant = annotationRegistrant;
                    this.componentTypeLocator = componentTypeLocator;
                }

                @Override // org.modelmapper.internal.asm.AnnotationVisitor
                public void visit(String str, Object obj) {
                    this.annotationRegistrant.register(str, obj instanceof Type ? new AbstractBase.RawTypeValue(Default.this, (Type) obj) : AnnotationValue.ForConstant.of(obj));
                }

                @Override // org.modelmapper.internal.asm.AnnotationVisitor
                public void visitEnum(String str, String str2, String str3) {
                    this.annotationRegistrant.register(str, new AbstractBase.RawEnumerationValue(Default.this, str2, str3));
                }

                @Override // org.modelmapper.internal.asm.AnnotationVisitor
                public AnnotationVisitor visitAnnotation(String str, String str2) {
                    return TypeExtractor.this.new AnnotationExtractor(new AnnotationLookup(str2, str), new ComponentTypeLocator.ForAnnotationProperty(Default.this, str2));
                }

                @Override // org.modelmapper.internal.asm.AnnotationVisitor
                public AnnotationVisitor visitArray(String str) {
                    return TypeExtractor.this.new AnnotationExtractor(new ArrayLookup(str, this.componentTypeLocator.bind(str)), ComponentTypeLocator.Illegal.INSTANCE);
                }

                @Override // org.modelmapper.internal.asm.AnnotationVisitor
                public void visitEnd() {
                    this.annotationRegistrant.onComplete();
                }

                protected class ArrayLookup implements AnnotationRegistrant {
                    private final AbstractBase.RawDescriptionArray.ComponentTypeReference componentTypeReference;
                    private final String name;
                    private final List<AnnotationValue<?, ?>> values = new ArrayList();

                    protected ArrayLookup(String str, AbstractBase.RawDescriptionArray.ComponentTypeReference componentTypeReference) {
                        this.name = str;
                        this.componentTypeReference = componentTypeReference;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                    public void register(String str, AnnotationValue<?, ?> annotationValue) {
                        this.values.add(annotationValue);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                    public void onComplete() {
                        AnnotationExtractor.this.annotationRegistrant.register(this.name, new AbstractBase.RawDescriptionArray(Default.this, this.componentTypeReference, this.values));
                    }
                }

                protected class AnnotationLookup implements AnnotationRegistrant {
                    private final String descriptor;
                    private final String name;
                    private final Map<String, AnnotationValue<?, ?>> values = new HashMap();

                    protected AnnotationLookup(String str, String str2) {
                        this.descriptor = str;
                        this.name = str2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                    public void register(String str, AnnotationValue<?, ?> annotationValue) {
                        this.values.put(str, annotationValue);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                    public void onComplete() {
                        AnnotationExtractor.this.annotationRegistrant.register(this.name, new AbstractBase.RawAnnotationValue(Default.this, new LazyTypeDescription.AnnotationToken(this.descriptor, this.values)));
                    }
                }
            }

            protected class FieldExtractor extends FieldVisitor {
                private final List<LazyTypeDescription.AnnotationToken> annotationTokens;
                private final String descriptor;
                private final String genericSignature;
                private final String internalName;
                private final int modifiers;
                private final Map<String, List<LazyTypeDescription.AnnotationToken>> typeAnnotationTokens;

                protected FieldExtractor(int i, String str, String str2, String str3) {
                    super(OpenedClassReader.ASM_API);
                    this.modifiers = i;
                    this.internalName = str;
                    this.descriptor = str2;
                    this.genericSignature = str3;
                    this.typeAnnotationTokens = new HashMap();
                    this.annotationTokens = new ArrayList();
                }

                @Override // org.modelmapper.internal.asm.FieldVisitor
                public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                    TypeReference typeReference = new TypeReference(i);
                    if (typeReference.getSort() == 19) {
                        return TypeExtractor.this.new AnnotationExtractor(new AnnotationRegistrant.ForTypeVariable(str, typePath, this.typeAnnotationTokens), new ComponentTypeLocator.ForAnnotationProperty(Default.this, str));
                    }
                    throw new IllegalStateException("Unexpected type reference on field: " + typeReference.getSort());
                }

                @Override // org.modelmapper.internal.asm.FieldVisitor
                public AnnotationVisitor visitAnnotation(String str, boolean z) {
                    return new AnnotationExtractor(TypeExtractor.this, str, this.annotationTokens, new ComponentTypeLocator.ForAnnotationProperty(Default.this, str));
                }

                @Override // org.modelmapper.internal.asm.FieldVisitor
                public void visitEnd() {
                    TypeExtractor.this.fieldTokens.add(new LazyTypeDescription.FieldToken(this.internalName, this.modifiers, this.descriptor, this.genericSignature, this.typeAnnotationTokens, this.annotationTokens));
                }
            }

            protected class MethodExtractor extends MethodVisitor implements AnnotationRegistrant {
                private final List<LazyTypeDescription.AnnotationToken> annotationTokens;
                private AnnotationValue<?, ?> defaultValue;
                private final String descriptor;
                private final String[] exceptionName;
                private final Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> exceptionTypeAnnotationTokens;
                private Label firstLabel;
                private final String genericSignature;
                private final String internalName;
                private int invisibleParameterShift;
                private final ParameterBag legacyParameterBag;
                private final int modifiers;
                private final Map<Integer, List<LazyTypeDescription.AnnotationToken>> parameterAnnotationTokens;
                private final List<LazyTypeDescription.MethodToken.ParameterToken> parameterTokens;
                private final Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> parameterTypeAnnotationTokens;
                private final Map<String, List<LazyTypeDescription.AnnotationToken>> receiverTypeAnnotationTokens;
                private final Map<String, List<LazyTypeDescription.AnnotationToken>> returnTypeAnnotationTokens;
                private final Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> typeVariableAnnotationTokens;
                private final Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>>> typeVariableBoundAnnotationTokens;
                private int visibleParameterShift;

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                public void onComplete() {
                }

                protected MethodExtractor(int i, String str, String str2, String str3, String[] strArr) {
                    super(OpenedClassReader.ASM_API);
                    this.modifiers = i;
                    this.internalName = str;
                    this.descriptor = str2;
                    this.genericSignature = str3;
                    this.exceptionName = strArr;
                    this.typeVariableAnnotationTokens = new HashMap();
                    this.typeVariableBoundAnnotationTokens = new HashMap();
                    this.returnTypeAnnotationTokens = new HashMap();
                    this.parameterTypeAnnotationTokens = new HashMap();
                    this.exceptionTypeAnnotationTokens = new HashMap();
                    this.receiverTypeAnnotationTokens = new HashMap();
                    this.annotationTokens = new ArrayList();
                    this.parameterAnnotationTokens = new HashMap();
                    this.parameterTokens = new ArrayList();
                    this.legacyParameterBag = new ParameterBag(Type.getMethodType(str2).getArgumentTypes());
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                    AnnotationRegistrant withIndex;
                    TypeReference typeReference = new TypeReference(i);
                    int sort = typeReference.getSort();
                    if (sort == 1) {
                        withIndex = new AnnotationRegistrant.ForTypeVariable.WithIndex(str, typePath, typeReference.getTypeParameterIndex(), this.typeVariableAnnotationTokens);
                    } else if (sort == 18) {
                        withIndex = new AnnotationRegistrant.ForTypeVariable.WithIndex.DoubleIndexed(str, typePath, typeReference.getTypeParameterBoundIndex(), typeReference.getTypeParameterIndex(), this.typeVariableBoundAnnotationTokens);
                    } else {
                        switch (sort) {
                            case 20:
                                withIndex = new AnnotationRegistrant.ForTypeVariable(str, typePath, this.returnTypeAnnotationTokens);
                                break;
                            case 21:
                                withIndex = new AnnotationRegistrant.ForTypeVariable(str, typePath, this.receiverTypeAnnotationTokens);
                                break;
                            case 22:
                                withIndex = new AnnotationRegistrant.ForTypeVariable.WithIndex(str, typePath, typeReference.getFormalParameterIndex(), this.parameterTypeAnnotationTokens);
                                break;
                            case 23:
                                withIndex = new AnnotationRegistrant.ForTypeVariable.WithIndex(str, typePath, typeReference.getExceptionIndex(), this.exceptionTypeAnnotationTokens);
                                break;
                            default:
                                throw new IllegalStateException("Unexpected type reference on method: " + typeReference.getSort());
                        }
                    }
                    return TypeExtractor.this.new AnnotationExtractor(withIndex, new ComponentTypeLocator.ForAnnotationProperty(Default.this, str));
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitAnnotation(String str, boolean z) {
                    return new AnnotationExtractor(TypeExtractor.this, str, this.annotationTokens, new ComponentTypeLocator.ForAnnotationProperty(Default.this, str));
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitAnnotableParameterCount(int i, boolean z) {
                    if (z) {
                        this.visibleParameterShift = Type.getMethodType(this.descriptor).getArgumentTypes().length - i;
                    } else {
                        this.invisibleParameterShift = Type.getMethodType(this.descriptor).getArgumentTypes().length - i;
                    }
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
                    return new AnnotationExtractor(TypeExtractor.this, str, i + (z ? this.visibleParameterShift : this.invisibleParameterShift), this.parameterAnnotationTokens, new ComponentTypeLocator.ForAnnotationProperty(Default.this, str));
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitLabel(Label label) {
                    if (Default.this.readerMode.isExtended() && this.firstLabel == null) {
                        this.firstLabel = label;
                    }
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
                    if (Default.this.readerMode.isExtended() && label == this.firstLabel) {
                        this.legacyParameterBag.register(i, str);
                    }
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitParameter(String str, int i) {
                    this.parameterTokens.add(new LazyTypeDescription.MethodToken.ParameterToken(str, Integer.valueOf(i)));
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitAnnotationDefault() {
                    return TypeExtractor.this.new AnnotationExtractor(this, new ComponentTypeLocator.ForArrayType(this.descriptor));
                }

                @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                public void register(String str, AnnotationValue<?, ?> annotationValue) {
                    this.defaultValue = annotationValue;
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitEnd() {
                    List list;
                    List<LazyTypeDescription.MethodToken.ParameterToken> list2;
                    List list3 = TypeExtractor.this.methodTokens;
                    String str = this.internalName;
                    int i = this.modifiers;
                    String str2 = this.descriptor;
                    String str3 = this.genericSignature;
                    String[] strArr = this.exceptionName;
                    Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> map = this.typeVariableAnnotationTokens;
                    Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>>> map2 = this.typeVariableBoundAnnotationTokens;
                    Map<String, List<LazyTypeDescription.AnnotationToken>> map3 = this.returnTypeAnnotationTokens;
                    Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> map4 = this.parameterTypeAnnotationTokens;
                    Map<Integer, Map<String, List<LazyTypeDescription.AnnotationToken>>> map5 = this.exceptionTypeAnnotationTokens;
                    Map<String, List<LazyTypeDescription.AnnotationToken>> map6 = this.receiverTypeAnnotationTokens;
                    List<LazyTypeDescription.AnnotationToken> list4 = this.annotationTokens;
                    Map<Integer, List<LazyTypeDescription.AnnotationToken>> map7 = this.parameterAnnotationTokens;
                    if (this.parameterTokens.isEmpty()) {
                        list = list3;
                        list2 = this.legacyParameterBag.resolve((this.modifiers & 8) != 0);
                    } else {
                        list = list3;
                        list2 = this.parameterTokens;
                    }
                    list.add(new LazyTypeDescription.MethodToken(str, i, str2, str3, strArr, map, map2, map3, map4, map5, map6, list4, map7, list2, this.defaultValue));
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class LazyFacade extends AbstractBase {
        private final TypePool typePool;

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.typePool.equals(((LazyFacade) obj).typePool);
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public int hashCode() {
            return (super.hashCode() * 31) + this.typePool.hashCode();
        }

        public LazyFacade(TypePool typePool) {
            super(CacheProvider.NoOp.INSTANCE);
            this.typePool = typePool;
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        protected Resolution doDescribe(String str) {
            return new LazyResolution(this.typePool, str);
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase, org.modelmapper.internal.bytebuddy.pool.TypePool
        public void clear() {
            this.typePool.clear();
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class LazyResolution implements Resolution {
            private final String name;
            private final TypePool typePool;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                LazyResolution lazyResolution = (LazyResolution) obj;
                return this.typePool.equals(lazyResolution.typePool) && this.name.equals(lazyResolution.name);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typePool.hashCode()) * 31) + this.name.hashCode();
            }

            protected LazyResolution(TypePool typePool, String str) {
                this.typePool = typePool;
                this.name = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
            public boolean isResolved() {
                return this.typePool.describe(this.name).isResolved();
            }

            @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.Resolution
            public TypeDescription resolve() {
                return new LazyTypeDescription(this.typePool, this.name);
            }
        }

        protected static class LazyTypeDescription extends TypeDescription.AbstractBase.OfSimpleType.WithDelegation {
            private transient /* synthetic */ TypeDescription delegate;
            private final String name;
            private final TypePool typePool;

            protected LazyTypeDescription(TypePool typePool, String str) {
                this.typePool = typePool;
                this.name = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
            public String getName() {
                return this.name;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType.WithDelegation
            @CachedReturnPlugin.Enhance(MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX)
            protected TypeDescription delegate() {
                TypeDescription resolve = this.delegate != null ? null : this.typePool.describe(this.name).resolve();
                if (resolve == null) {
                    return this.delegate;
                }
                this.delegate = resolve;
                return resolve;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ClassLoading extends AbstractBase.Hierarchical {
        private static final ClassLoader BOOTSTRAP_CLASS_LOADER = null;
        private final ClassLoader classLoader;

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classLoader.equals(((ClassLoading) obj).classLoader);
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public int hashCode() {
            return (super.hashCode() * 31) + this.classLoader.hashCode();
        }

        public ClassLoading(CacheProvider cacheProvider, TypePool typePool, ClassLoader classLoader) {
            super(cacheProvider, typePool);
            this.classLoader = classLoader;
        }

        public static TypePool of(ClassLoader classLoader) {
            return of(classLoader, Empty.INSTANCE);
        }

        public static TypePool of(ClassLoader classLoader, TypePool typePool) {
            return new ClassLoading(CacheProvider.NoOp.INSTANCE, typePool, classLoader);
        }

        public static TypePool ofBootPath() {
            return of(BOOTSTRAP_CLASS_LOADER);
        }

        public static TypePool ofClassPath() {
            return of(ClassLoader.getSystemClassLoader());
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public Resolution doDescribe(String str) {
            try {
                return new Resolution.Simple(TypeDescription.ForLoadedType.of(Class.forName(str, false, this.classLoader)));
            } catch (ClassNotFoundException unused) {
                return new Resolution.Illegal(str);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit extends AbstractBase.Hierarchical {
        private final Map<String, TypeDescription> types;

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.types.equals(((Explicit) obj).types);
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        public int hashCode() {
            return (super.hashCode() * 31) + this.types.hashCode();
        }

        public Explicit(Map<String, TypeDescription> map) {
            this(Empty.INSTANCE, map);
        }

        public Explicit(TypePool typePool, Map<String, TypeDescription> map) {
            super(CacheProvider.NoOp.INSTANCE, typePool);
            this.types = map;
        }

        @Override // org.modelmapper.internal.bytebuddy.pool.TypePool.AbstractBase
        protected Resolution doDescribe(String str) {
            TypeDescription typeDescription = this.types.get(str);
            return typeDescription == null ? new Resolution.Illegal(str) : new Resolution.Simple(typeDescription);
        }
    }
}
