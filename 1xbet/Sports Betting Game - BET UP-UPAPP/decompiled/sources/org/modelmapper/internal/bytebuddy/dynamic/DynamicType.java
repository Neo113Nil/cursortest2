package org.modelmapper.internal.bytebuddy.dynamic;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.modifier.FieldManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.MethodManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.Ownership;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.description.type.TypeVariableToken;
import org.modelmapper.internal.bytebuddy.dynamic.Transformer;
import org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldRegistry;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.implementation.EqualsMethod;
import org.modelmapper.internal.bytebuddy.implementation.FieldAccessor;
import org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.ToStringMethod;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationRetention;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter;
import org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;

/* loaded from: classes4.dex */
public interface DynamicType {

    public interface Loaded<T> extends DynamicType {
        Class<? extends T> getLoaded();

        Map<TypeDescription, Class<?>> getLoadedAuxiliaryTypes();
    }

    public interface Unloaded<T> extends DynamicType {
        Unloaded<T> include(List<? extends DynamicType> list);

        Unloaded<T> include(DynamicType... dynamicTypeArr);

        Loaded<T> load(ClassLoader classLoader);

        <S extends ClassLoader> Loaded<T> load(S s, ClassLoadingStrategy<? super S> classLoadingStrategy);
    }

    Map<TypeDescription, byte[]> getAllTypes();

    Map<TypeDescription, byte[]> getAuxiliaryTypes();

    byte[] getBytes();

    Map<TypeDescription, LoadedTypeInitializer> getLoadedTypeInitializers();

    TypeDescription getTypeDescription();

    boolean hasAliveLoadedTypeInitializers();

    File inject(File file) throws IOException;

    File inject(File file, File file2) throws IOException;

    Map<TypeDescription, File> saveIn(File file) throws IOException;

    File toJar(File file) throws IOException;

    File toJar(File file, Manifest manifest) throws IOException;

    public interface Builder<T> {

        public interface InnerTypeDefinition<S> extends Builder<S> {

            public interface ForType<U> extends InnerTypeDefinition<U> {
                Builder<U> asMemberType();
            }

            Builder<S> asAnonymousType();
        }

        Builder<T> annotateType(Collection<? extends AnnotationDescription> collection);

        Builder<T> annotateType(List<? extends Annotation> list);

        Builder<T> annotateType(Annotation... annotationArr);

        Builder<T> annotateType(AnnotationDescription... annotationDescriptionArr);

        Builder<T> attribute(TypeAttributeAppender typeAttributeAppender);

        MethodDefinition.ImplementationDefinition<T> constructor(ElementMatcher<? super MethodDescription> elementMatcher);

        Builder<T> declaredTypes(Collection<? extends TypeDescription> collection);

        Builder<T> declaredTypes(List<? extends Class<?>> list);

        Builder<T> declaredTypes(Class<?>... clsArr);

        Builder<T> declaredTypes(TypeDescription... typeDescriptionArr);

        FieldDefinition.Optional.Valuable<T> define(Field field);

        FieldDefinition.Optional.Valuable<T> define(FieldDescription fieldDescription);

        MethodDefinition.ImplementationDefinition<T> define(Constructor<?> constructor);

        MethodDefinition.ImplementationDefinition<T> define(Method method);

        MethodDefinition.ImplementationDefinition<T> define(MethodDescription methodDescription);

        MethodDefinition.ParameterDefinition.Initial<T> defineConstructor(int i);

        MethodDefinition.ParameterDefinition.Initial<T> defineConstructor(Collection<? extends ModifierContributor.ForMethod> collection);

        MethodDefinition.ParameterDefinition.Initial<T> defineConstructor(ModifierContributor.ForMethod... forMethodArr);

        FieldDefinition.Optional.Valuable<T> defineField(String str, Type type, int i);

        FieldDefinition.Optional.Valuable<T> defineField(String str, Type type, Collection<? extends ModifierContributor.ForField> collection);

        FieldDefinition.Optional.Valuable<T> defineField(String str, Type type, ModifierContributor.ForField... forFieldArr);

        FieldDefinition.Optional.Valuable<T> defineField(String str, TypeDefinition typeDefinition, int i);

        FieldDefinition.Optional.Valuable<T> defineField(String str, TypeDefinition typeDefinition, Collection<? extends ModifierContributor.ForField> collection);

        FieldDefinition.Optional.Valuable<T> defineField(String str, TypeDefinition typeDefinition, ModifierContributor.ForField... forFieldArr);

        MethodDefinition.ParameterDefinition.Initial<T> defineMethod(String str, Type type, int i);

        MethodDefinition.ParameterDefinition.Initial<T> defineMethod(String str, Type type, Collection<? extends ModifierContributor.ForMethod> collection);

        MethodDefinition.ParameterDefinition.Initial<T> defineMethod(String str, Type type, ModifierContributor.ForMethod... forMethodArr);

        MethodDefinition.ParameterDefinition.Initial<T> defineMethod(String str, TypeDefinition typeDefinition, int i);

        MethodDefinition.ParameterDefinition.Initial<T> defineMethod(String str, TypeDefinition typeDefinition, Collection<? extends ModifierContributor.ForMethod> collection);

        MethodDefinition.ParameterDefinition.Initial<T> defineMethod(String str, TypeDefinition typeDefinition, ModifierContributor.ForMethod... forMethodArr);

        FieldDefinition.Optional<T> defineProperty(String str, Type type);

        FieldDefinition.Optional<T> defineProperty(String str, Type type, boolean z);

        FieldDefinition.Optional<T> defineProperty(String str, TypeDefinition typeDefinition);

        FieldDefinition.Optional<T> defineProperty(String str, TypeDefinition typeDefinition, boolean z);

        FieldDefinition.Valuable<T> field(ElementMatcher<? super FieldDescription> elementMatcher);

        FieldDefinition.Valuable<T> field(LatentMatcher<? super FieldDescription> latentMatcher);

        Builder<T> ignoreAlso(ElementMatcher<? super MethodDescription> elementMatcher);

        Builder<T> ignoreAlso(LatentMatcher<? super MethodDescription> latentMatcher);

        MethodDefinition.ImplementationDefinition.Optional<T> implement(Collection<? extends TypeDefinition> collection);

        MethodDefinition.ImplementationDefinition.Optional<T> implement(List<? extends Type> list);

        MethodDefinition.ImplementationDefinition.Optional<T> implement(Type... typeArr);

        MethodDefinition.ImplementationDefinition.Optional<T> implement(TypeDefinition... typeDefinitionArr);

        Builder<T> initializer(LoadedTypeInitializer loadedTypeInitializer);

        Builder<T> initializer(ByteCodeAppender byteCodeAppender);

        InnerTypeDefinition.ForType<T> innerTypeOf(Class<?> cls);

        InnerTypeDefinition.ForType<T> innerTypeOf(TypeDescription typeDescription);

        InnerTypeDefinition<T> innerTypeOf(Constructor<?> constructor);

        InnerTypeDefinition<T> innerTypeOf(Method method);

        InnerTypeDefinition<T> innerTypeOf(MethodDescription.InDefinedShape inDefinedShape);

        MethodDefinition.ImplementationDefinition<T> invokable(ElementMatcher<? super MethodDescription> elementMatcher);

        MethodDefinition.ImplementationDefinition<T> invokable(LatentMatcher<? super MethodDescription> latentMatcher);

        Unloaded<T> make();

        Unloaded<T> make(TypeResolutionStrategy typeResolutionStrategy);

        Unloaded<T> make(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool);

        Unloaded<T> make(TypePool typePool);

        Builder<T> merge(Collection<? extends ModifierContributor.ForType> collection);

        Builder<T> merge(ModifierContributor.ForType... forTypeArr);

        MethodDefinition.ImplementationDefinition<T> method(ElementMatcher<? super MethodDescription> elementMatcher);

        Builder<T> modifiers(int i);

        Builder<T> modifiers(Collection<? extends ModifierContributor.ForType> collection);

        Builder<T> modifiers(ModifierContributor.ForType... forTypeArr);

        Builder<T> name(String str);

        Builder<T> nestHost(Class<?> cls);

        Builder<T> nestHost(TypeDescription typeDescription);

        Builder<T> nestMembers(Collection<? extends TypeDescription> collection);

        Builder<T> nestMembers(List<? extends Class<?>> list);

        Builder<T> nestMembers(Class<?>... clsArr);

        Builder<T> nestMembers(TypeDescription... typeDescriptionArr);

        Builder<T> noNestMate();

        Builder<T> require(Collection<DynamicType> collection);

        Builder<T> require(TypeDescription typeDescription, byte[] bArr);

        Builder<T> require(TypeDescription typeDescription, byte[] bArr, LoadedTypeInitializer loadedTypeInitializer);

        Builder<T> require(DynamicType... dynamicTypeArr);

        FieldDefinition.Optional<T> serialVersionUid(long j);

        Builder<T> topLevelType();

        Builder<T> transform(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer);

        TypeVariableDefinition<T> typeVariable(String str);

        TypeVariableDefinition<T> typeVariable(String str, Collection<? extends TypeDefinition> collection);

        TypeVariableDefinition<T> typeVariable(String str, List<? extends Type> list);

        TypeVariableDefinition<T> typeVariable(String str, Type... typeArr);

        TypeVariableDefinition<T> typeVariable(String str, TypeDefinition... typeDefinitionArr);

        Builder<T> visit(AsmVisitorWrapper asmVisitorWrapper);

        Builder<T> withHashCodeEquals();

        Builder<T> withToString();

        public interface TypeVariableDefinition<S> extends Builder<S> {
            TypeVariableDefinition<S> annotateTypeVariable(Collection<? extends AnnotationDescription> collection);

            TypeVariableDefinition<S> annotateTypeVariable(List<? extends Annotation> list);

            TypeVariableDefinition<S> annotateTypeVariable(Annotation... annotationArr);

            TypeVariableDefinition<S> annotateTypeVariable(AnnotationDescription... annotationDescriptionArr);

            public static abstract class AbstractBase<U> extends AbstractBase.Delegator<U> implements TypeVariableDefinition<U> {
                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition
                public TypeVariableDefinition<U> annotateTypeVariable(Annotation... annotationArr) {
                    return annotateTypeVariable(Arrays.asList(annotationArr));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition
                public TypeVariableDefinition<U> annotateTypeVariable(List<? extends Annotation> list) {
                    return annotateTypeVariable((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition
                public TypeVariableDefinition<U> annotateTypeVariable(AnnotationDescription... annotationDescriptionArr) {
                    return annotateTypeVariable((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
                }
            }
        }

        public interface FieldDefinition<S> {

            public interface Valuable<U> extends FieldDefinition<U> {
                Optional<U> value(double d);

                Optional<U> value(float f);

                Optional<U> value(int i);

                Optional<U> value(long j);

                Optional<U> value(String str);

                Optional<U> value(boolean z);
            }

            Optional<S> annotateField(Collection<? extends AnnotationDescription> collection);

            Optional<S> annotateField(List<? extends Annotation> list);

            Optional<S> annotateField(Annotation... annotationArr);

            Optional<S> annotateField(AnnotationDescription... annotationDescriptionArr);

            Optional<S> attribute(FieldAttributeAppender.Factory factory);

            Optional<S> transform(Transformer<FieldDescription> transformer);

            public interface Optional<U> extends FieldDefinition<U>, Builder<U> {

                public interface Valuable<V> extends Valuable<V>, Optional<V> {

                    public static abstract class AbstractBase<U> extends AbstractBase<U> implements Valuable<U> {
                        protected abstract Optional<U> defaultValue(Object obj);

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public Optional<U> value(boolean z) {
                            return defaultValue(Integer.valueOf(z ? 1 : 0));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public Optional<U> value(int i) {
                            return defaultValue(Integer.valueOf(i));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public Optional<U> value(long j) {
                            return defaultValue(Long.valueOf(j));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public Optional<U> value(float f) {
                            return defaultValue(Float.valueOf(f));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public Optional<U> value(double d) {
                            return defaultValue(Double.valueOf(d));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public Optional<U> value(String str) {
                            if (str == null) {
                                throw new IllegalArgumentException("Cannot set null as a default value");
                            }
                            return defaultValue(str);
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        private static abstract class Adapter<V> extends AbstractBase<V> {

                            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            protected final Object defaultValue;
                            protected final FieldAttributeAppender.Factory fieldAttributeAppenderFactory;
                            protected final Transformer<FieldDescription> transformer;

                            /* JADX WARN: Removed duplicated region for block: B:23:0x003d A[RETURN] */
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
                                Adapter adapter = (Adapter) obj;
                                if (!this.fieldAttributeAppenderFactory.equals(adapter.fieldAttributeAppenderFactory) || !this.transformer.equals(adapter.transformer)) {
                                    return false;
                                }
                                Object obj2 = this.defaultValue;
                                Object obj3 = adapter.defaultValue;
                                if (obj3 != null) {
                                    return obj2 != null && obj2.equals(obj3);
                                }
                                if (obj2 != null) {
                                    return false;
                                }
                            }

                            public int hashCode() {
                                int hashCode = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldAttributeAppenderFactory.hashCode()) * 31) + this.transformer.hashCode()) * 31;
                                Object obj = this.defaultValue;
                                return obj != null ? hashCode + obj.hashCode() : hashCode;
                            }

                            protected abstract Optional<V> materialize(FieldAttributeAppender.Factory factory, Transformer<FieldDescription> transformer, Object obj);

                            protected Adapter(FieldAttributeAppender.Factory factory, Transformer<FieldDescription> transformer, Object obj) {
                                this.fieldAttributeAppenderFactory = factory;
                                this.transformer = transformer;
                                this.defaultValue = obj;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                            public Optional<V> attribute(FieldAttributeAppender.Factory factory) {
                                return materialize(new FieldAttributeAppender.Factory.Compound(this.fieldAttributeAppenderFactory, factory), this.transformer, this.defaultValue);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                            public Optional<V> transform(Transformer<FieldDescription> transformer) {
                                return materialize(this.fieldAttributeAppenderFactory, new Transformer.Compound(this.transformer, transformer), this.defaultValue);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase
                            protected Optional<V> defaultValue(Object obj) {
                                return materialize(this.fieldAttributeAppenderFactory, this.transformer, obj);
                            }
                        }
                    }
                }

                public static abstract class AbstractBase<U> extends AbstractBase.Delegator<U> implements Optional<U> {
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public Optional<U> annotateField(Annotation... annotationArr) {
                        return annotateField(Arrays.asList(annotationArr));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public Optional<U> annotateField(List<? extends Annotation> list) {
                        return annotateField((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public Optional<U> annotateField(AnnotationDescription... annotationDescriptionArr) {
                        return annotateField((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
                    }
                }
            }
        }

        public interface MethodDefinition<S> extends Builder<S> {
            MethodDefinition<S> annotateMethod(Collection<? extends AnnotationDescription> collection);

            MethodDefinition<S> annotateMethod(List<? extends Annotation> list);

            MethodDefinition<S> annotateMethod(Annotation... annotationArr);

            MethodDefinition<S> annotateMethod(AnnotationDescription... annotationDescriptionArr);

            MethodDefinition<S> annotateParameter(int i, Collection<? extends AnnotationDescription> collection);

            MethodDefinition<S> annotateParameter(int i, List<? extends Annotation> list);

            MethodDefinition<S> annotateParameter(int i, Annotation... annotationArr);

            MethodDefinition<S> annotateParameter(int i, AnnotationDescription... annotationDescriptionArr);

            MethodDefinition<S> attribute(MethodAttributeAppender.Factory factory);

            MethodDefinition<S> transform(Transformer<MethodDescription> transformer);

            public interface ReceiverTypeDefinition<U> extends MethodDefinition<U> {
                MethodDefinition<U> receiverType(AnnotatedElement annotatedElement);

                MethodDefinition<U> receiverType(TypeDescription.Generic generic);

                public static abstract class AbstractBase<V> extends AbstractBase<V> implements ReceiverTypeDefinition<V> {
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition
                    public MethodDefinition<V> receiverType(AnnotatedElement annotatedElement) {
                        return receiverType(TypeDescription.Generic.AnnotationReader.DISPATCHER.resolve(annotatedElement));
                    }
                }
            }

            public interface ImplementationDefinition<U> {

                public interface Optional<V> extends ImplementationDefinition<V>, Builder<V> {
                }

                <W> ReceiverTypeDefinition<U> defaultValue(W w, Class<? extends W> cls);

                ReceiverTypeDefinition<U> defaultValue(AnnotationValue<?, ?> annotationValue);

                ReceiverTypeDefinition<U> intercept(Implementation implementation);

                ReceiverTypeDefinition<U> withoutCode();

                public static abstract class AbstractBase<V> implements ImplementationDefinition<V> {
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public <W> ReceiverTypeDefinition<V> defaultValue(W w, Class<? extends W> cls) {
                        return defaultValue(AnnotationDescription.ForLoadedAnnotation.asValue(w, cls));
                    }
                }
            }

            public interface TypeVariableDefinition<U> extends ImplementationDefinition<U> {
                Annotatable<U> typeVariable(String str);

                Annotatable<U> typeVariable(String str, Collection<? extends TypeDefinition> collection);

                Annotatable<U> typeVariable(String str, List<? extends Type> list);

                Annotatable<U> typeVariable(String str, Type... typeArr);

                Annotatable<U> typeVariable(String str, TypeDefinition... typeDefinitionArr);

                public interface Annotatable<V> extends TypeVariableDefinition<V> {
                    Annotatable<V> annotateTypeVariable(Collection<? extends AnnotationDescription> collection);

                    Annotatable<V> annotateTypeVariable(List<? extends Annotation> list);

                    Annotatable<V> annotateTypeVariable(Annotation... annotationArr);

                    Annotatable<V> annotateTypeVariable(AnnotationDescription... annotationDescriptionArr);

                    public static abstract class AbstractBase<W> extends AbstractBase<W> implements Annotatable<W> {
                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable
                        public Annotatable<W> annotateTypeVariable(Annotation... annotationArr) {
                            return annotateTypeVariable(Arrays.asList(annotationArr));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable
                        public Annotatable<W> annotateTypeVariable(List<? extends Annotation> list) {
                            return annotateTypeVariable((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable
                        public Annotatable<W> annotateTypeVariable(AnnotationDescription... annotationDescriptionArr) {
                            return annotateTypeVariable((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
                        }

                        protected static abstract class Adapter<X> extends AbstractBase<X> {
                            protected abstract ParameterDefinition<X> materialize();

                            protected Adapter() {
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                            public Annotatable<X> typeVariable(String str, Collection<? extends TypeDefinition> collection) {
                                return materialize().typeVariable(str, collection);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public ReceiverTypeDefinition<X> intercept(Implementation implementation) {
                                return materialize().intercept(implementation);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public ReceiverTypeDefinition<X> withoutCode() {
                                return materialize().withoutCode();
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public ReceiverTypeDefinition<X> defaultValue(AnnotationValue<?, ?> annotationValue) {
                                return materialize().defaultValue(annotationValue);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.AbstractBase, org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public <V> ReceiverTypeDefinition<X> defaultValue(V v, Class<? extends V> cls) {
                                return materialize().defaultValue(v, cls);
                            }
                        }
                    }
                }

                public static abstract class AbstractBase<V> extends ImplementationDefinition.AbstractBase<V> implements TypeVariableDefinition<V> {
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public Annotatable<V> typeVariable(String str) {
                        return typeVariable(str, Collections.singletonList(Object.class));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public Annotatable<V> typeVariable(String str, Type... typeArr) {
                        return typeVariable(str, Arrays.asList(typeArr));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public Annotatable<V> typeVariable(String str, List<? extends Type> list) {
                        return typeVariable(str, (Collection<? extends TypeDefinition>) new TypeList.Generic.ForLoadedTypes(list));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public Annotatable<V> typeVariable(String str, TypeDefinition... typeDefinitionArr) {
                        return typeVariable(str, (Collection<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
                    }
                }
            }

            public interface ExceptionDefinition<U> extends TypeVariableDefinition<U> {
                ExceptionDefinition<U> throwing(Collection<? extends TypeDefinition> collection);

                ExceptionDefinition<U> throwing(List<? extends Type> list);

                ExceptionDefinition<U> throwing(Type... typeArr);

                ExceptionDefinition<U> throwing(TypeDefinition... typeDefinitionArr);

                public static abstract class AbstractBase<V> extends TypeVariableDefinition.AbstractBase<V> implements ExceptionDefinition<V> {
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                    public ExceptionDefinition<V> throwing(Type... typeArr) {
                        return throwing(Arrays.asList(typeArr));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                    public ExceptionDefinition<V> throwing(List<? extends Type> list) {
                        return throwing((Collection<? extends TypeDefinition>) new TypeList.Generic.ForLoadedTypes(list));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                    public ExceptionDefinition<V> throwing(TypeDefinition... typeDefinitionArr) {
                        return throwing((Collection<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
                    }
                }
            }

            public interface ParameterDefinition<U> extends ExceptionDefinition<U> {
                Annotatable<U> withParameter(Type type, String str, int i);

                Annotatable<U> withParameter(Type type, String str, Collection<? extends ModifierContributor.ForParameter> collection);

                Annotatable<U> withParameter(Type type, String str, ModifierContributor.ForParameter... forParameterArr);

                Annotatable<U> withParameter(TypeDefinition typeDefinition, String str, int i);

                Annotatable<U> withParameter(TypeDefinition typeDefinition, String str, Collection<? extends ModifierContributor.ForParameter> collection);

                Annotatable<U> withParameter(TypeDefinition typeDefinition, String str, ModifierContributor.ForParameter... forParameterArr);

                public interface Annotatable<V> extends ParameterDefinition<V> {
                    Annotatable<V> annotateParameter(Collection<? extends AnnotationDescription> collection);

                    Annotatable<V> annotateParameter(List<? extends Annotation> list);

                    Annotatable<V> annotateParameter(Annotation... annotationArr);

                    Annotatable<V> annotateParameter(AnnotationDescription... annotationDescriptionArr);

                    public static abstract class AbstractBase<W> extends AbstractBase<W> implements Annotatable<W> {
                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable
                        public Annotatable<W> annotateParameter(Annotation... annotationArr) {
                            return annotateParameter(Arrays.asList(annotationArr));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable
                        public Annotatable<W> annotateParameter(List<? extends Annotation> list) {
                            return annotateParameter((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable
                        public Annotatable<W> annotateParameter(AnnotationDescription... annotationDescriptionArr) {
                            return annotateParameter((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
                        }

                        protected static abstract class Adapter<X> extends AbstractBase<X> {
                            protected abstract ParameterDefinition<X> materialize();

                            protected Adapter() {
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                            public Annotatable<X> withParameter(TypeDefinition typeDefinition, String str, int i) {
                                return materialize().withParameter(typeDefinition, str, i);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                            public ExceptionDefinition<X> throwing(Collection<? extends TypeDefinition> collection) {
                                return materialize().throwing(collection);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                            public TypeVariableDefinition.Annotatable<X> typeVariable(String str, Collection<? extends TypeDefinition> collection) {
                                return materialize().typeVariable(str, collection);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public ReceiverTypeDefinition<X> intercept(Implementation implementation) {
                                return materialize().intercept(implementation);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public ReceiverTypeDefinition<X> withoutCode() {
                                return materialize().withoutCode();
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public ReceiverTypeDefinition<X> defaultValue(AnnotationValue<?, ?> annotationValue) {
                                return materialize().defaultValue(annotationValue);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.AbstractBase, org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public <V> ReceiverTypeDefinition<X> defaultValue(V v, Class<? extends V> cls) {
                                return materialize().defaultValue(v, cls);
                            }
                        }
                    }
                }

                public interface Simple<V> extends ExceptionDefinition<V> {
                    Annotatable<V> withParameter(Type type);

                    Annotatable<V> withParameter(TypeDefinition typeDefinition);

                    public interface Annotatable<V> extends Simple<V> {
                        Annotatable<V> annotateParameter(Collection<? extends AnnotationDescription> collection);

                        Annotatable<V> annotateParameter(List<? extends Annotation> list);

                        Annotatable<V> annotateParameter(Annotation... annotationArr);

                        Annotatable<V> annotateParameter(AnnotationDescription... annotationDescriptionArr);

                        public static abstract class AbstractBase<W> extends AbstractBase<W> implements Annotatable<W> {
                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable
                            public Annotatable<W> annotateParameter(Annotation... annotationArr) {
                                return annotateParameter(Arrays.asList(annotationArr));
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable
                            public Annotatable<W> annotateParameter(List<? extends Annotation> list) {
                                return annotateParameter((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable
                            public Annotatable<W> annotateParameter(AnnotationDescription... annotationDescriptionArr) {
                                return annotateParameter((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
                            }

                            protected static abstract class Adapter<X> extends AbstractBase<X> {
                                protected abstract Simple<X> materialize();

                                protected Adapter() {
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple
                                public Annotatable<X> withParameter(TypeDefinition typeDefinition) {
                                    return materialize().withParameter(typeDefinition);
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                                public ExceptionDefinition<X> throwing(Collection<? extends TypeDefinition> collection) {
                                    return materialize().throwing(collection);
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                                public TypeVariableDefinition.Annotatable<X> typeVariable(String str, Collection<? extends TypeDefinition> collection) {
                                    return materialize().typeVariable(str, collection);
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                                public ReceiverTypeDefinition<X> intercept(Implementation implementation) {
                                    return materialize().intercept(implementation);
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                                public ReceiverTypeDefinition<X> withoutCode() {
                                    return materialize().withoutCode();
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                                public ReceiverTypeDefinition<X> defaultValue(AnnotationValue<?, ?> annotationValue) {
                                    return materialize().defaultValue(annotationValue);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.AbstractBase, org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                                public <V> ReceiverTypeDefinition<X> defaultValue(V v, Class<? extends V> cls) {
                                    return materialize().defaultValue(v, cls);
                                }
                            }
                        }
                    }

                    public static abstract class AbstractBase<W> extends ExceptionDefinition.AbstractBase<W> implements Simple<W> {
                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple
                        public Annotatable<W> withParameter(Type type) {
                            return withParameter(TypeDefinition.Sort.describe(type));
                        }
                    }
                }

                public interface Initial<V> extends ParameterDefinition<V>, Simple<V> {
                    ExceptionDefinition<V> withParameters(Collection<? extends TypeDefinition> collection);

                    ExceptionDefinition<V> withParameters(List<? extends Type> list);

                    ExceptionDefinition<V> withParameters(Type... typeArr);

                    ExceptionDefinition<V> withParameters(TypeDefinition... typeDefinitionArr);

                    public static abstract class AbstractBase<W> extends AbstractBase<W> implements Initial<W> {
                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple
                        public Simple.Annotatable<W> withParameter(Type type) {
                            return withParameter(TypeDefinition.Sort.describe(type));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial
                        public ExceptionDefinition<W> withParameters(Type... typeArr) {
                            return withParameters(Arrays.asList(typeArr));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial
                        public ExceptionDefinition<W> withParameters(List<? extends Type> list) {
                            return withParameters((Collection<? extends TypeDefinition>) new TypeList.Generic.ForLoadedTypes(list));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial
                        public ExceptionDefinition<W> withParameters(TypeDefinition... typeDefinitionArr) {
                            return withParameters((Collection<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial
                        public ExceptionDefinition<W> withParameters(Collection<? extends TypeDefinition> collection) {
                            Iterator<? extends TypeDefinition> it = collection.iterator();
                            Simple simple = this;
                            while (it.hasNext()) {
                                simple = simple.withParameter(it.next());
                            }
                            return simple;
                        }
                    }
                }

                public static abstract class AbstractBase<V> extends ExceptionDefinition.AbstractBase<V> implements ParameterDefinition<V> {
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public Annotatable<V> withParameter(Type type, String str, ModifierContributor.ForParameter... forParameterArr) {
                        return withParameter(type, str, Arrays.asList(forParameterArr));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public Annotatable<V> withParameter(Type type, String str, Collection<? extends ModifierContributor.ForParameter> collection) {
                        return withParameter(type, str, ModifierContributor.Resolver.of(collection).resolve());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public Annotatable<V> withParameter(Type type, String str, int i) {
                        return withParameter(TypeDefinition.Sort.describe(type), str, i);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public Annotatable<V> withParameter(TypeDefinition typeDefinition, String str, ModifierContributor.ForParameter... forParameterArr) {
                        return withParameter(typeDefinition, str, Arrays.asList(forParameterArr));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public Annotatable<V> withParameter(TypeDefinition typeDefinition, String str, Collection<? extends ModifierContributor.ForParameter> collection) {
                        return withParameter(typeDefinition, str, ModifierContributor.Resolver.of(collection).resolve());
                    }
                }
            }

            public static abstract class AbstractBase<U> extends AbstractBase.Delegator<U> implements MethodDefinition<U> {
                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public MethodDefinition<U> annotateMethod(Annotation... annotationArr) {
                    return annotateMethod(Arrays.asList(annotationArr));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public MethodDefinition<U> annotateMethod(List<? extends Annotation> list) {
                    return annotateMethod((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public MethodDefinition<U> annotateMethod(AnnotationDescription... annotationDescriptionArr) {
                    return annotateMethod((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public MethodDefinition<U> annotateParameter(int i, Annotation... annotationArr) {
                    return annotateParameter(i, Arrays.asList(annotationArr));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public MethodDefinition<U> annotateParameter(int i, List<? extends Annotation> list) {
                    return annotateParameter(i, (Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public MethodDefinition<U> annotateParameter(int i, AnnotationDescription... annotationDescriptionArr) {
                    return annotateParameter(i, (Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static abstract class Adapter<V> extends ReceiverTypeDefinition.AbstractBase<V> {
                    protected final MethodRegistry.Handler handler;
                    protected final MethodAttributeAppender.Factory methodAttributeAppenderFactory;
                    protected final Transformer<MethodDescription> transformer;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Adapter adapter = (Adapter) obj;
                        return this.handler.equals(adapter.handler) && this.methodAttributeAppenderFactory.equals(adapter.methodAttributeAppenderFactory) && this.transformer.equals(adapter.transformer);
                    }

                    public int hashCode() {
                        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.handler.hashCode()) * 31) + this.methodAttributeAppenderFactory.hashCode()) * 31) + this.transformer.hashCode();
                    }

                    protected abstract MethodDefinition<V> materialize(MethodRegistry.Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer);

                    protected Adapter(MethodRegistry.Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer) {
                        this.handler = handler;
                        this.methodAttributeAppenderFactory = factory;
                        this.transformer = transformer;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                    public MethodDefinition<V> attribute(MethodAttributeAppender.Factory factory) {
                        return materialize(this.handler, new MethodAttributeAppender.Factory.Compound(this.methodAttributeAppenderFactory, factory), this.transformer);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                    public MethodDefinition<V> transform(Transformer<MethodDescription> transformer) {
                        return materialize(this.handler, this.methodAttributeAppenderFactory, new Transformer.Compound(this.transformer, transformer));
                    }
                }
            }
        }

        public static abstract class AbstractBase<S> implements Builder<S> {
            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public InnerTypeDefinition.ForType<S> innerTypeOf(Class<?> cls) {
                return innerTypeOf(TypeDescription.ForLoadedType.of(cls));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public InnerTypeDefinition<S> innerTypeOf(Method method) {
                return innerTypeOf(new MethodDescription.ForLoadedMethod(method));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public InnerTypeDefinition<S> innerTypeOf(Constructor<?> constructor) {
                return innerTypeOf(new MethodDescription.ForLoadedConstructor(constructor));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> declaredTypes(Class<?>... clsArr) {
                return declaredTypes(Arrays.asList(clsArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> declaredTypes(TypeDescription... typeDescriptionArr) {
                return declaredTypes((Collection<? extends TypeDescription>) Arrays.asList(typeDescriptionArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> declaredTypes(List<? extends Class<?>> list) {
                return declaredTypes((Collection<? extends TypeDescription>) new TypeList.ForLoadedTypes(list));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> noNestMate() {
                return nestHost(TargetType.DESCRIPTION);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> nestHost(Class<?> cls) {
                return nestHost(TypeDescription.ForLoadedType.of(cls));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> nestMembers(Class<?>... clsArr) {
                return nestMembers(Arrays.asList(clsArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> nestMembers(TypeDescription... typeDescriptionArr) {
                return nestMembers((Collection<? extends TypeDescription>) Arrays.asList(typeDescriptionArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> nestMembers(List<? extends Class<?>> list) {
                return nestMembers((Collection<? extends TypeDescription>) new TypeList.ForLoadedTypes(list));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> annotateType(Annotation... annotationArr) {
                return annotateType(Arrays.asList(annotationArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> annotateType(List<? extends Annotation> list) {
                return annotateType((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> annotateType(AnnotationDescription... annotationDescriptionArr) {
                return annotateType((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> modifiers(ModifierContributor.ForType... forTypeArr) {
                return modifiers(Arrays.asList(forTypeArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> modifiers(Collection<? extends ModifierContributor.ForType> collection) {
                return modifiers(ModifierContributor.Resolver.of(collection).resolve());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> merge(ModifierContributor.ForType... forTypeArr) {
                return merge(Arrays.asList(forTypeArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition.Optional<S> implement(Type... typeArr) {
                return implement(Arrays.asList(typeArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition.Optional<S> implement(List<? extends Type> list) {
                return implement((Collection<? extends TypeDefinition>) new TypeList.Generic.ForLoadedTypes(list));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition.Optional<S> implement(TypeDefinition... typeDefinitionArr) {
                return implement((Collection<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public TypeVariableDefinition<S> typeVariable(String str) {
                return typeVariable(str, TypeDescription.Generic.OBJECT);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public TypeVariableDefinition<S> typeVariable(String str, Type... typeArr) {
                return typeVariable(str, Arrays.asList(typeArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public TypeVariableDefinition<S> typeVariable(String str, List<? extends Type> list) {
                return typeVariable(str, (Collection<? extends TypeDefinition>) new TypeList.Generic.ForLoadedTypes(list));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public TypeVariableDefinition<S> typeVariable(String str, TypeDefinition... typeDefinitionArr) {
                return typeVariable(str, (Collection<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional.Valuable<S> defineField(String str, Type type, ModifierContributor.ForField... forFieldArr) {
                return defineField(str, type, Arrays.asList(forFieldArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional.Valuable<S> defineField(String str, Type type, Collection<? extends ModifierContributor.ForField> collection) {
                return defineField(str, type, ModifierContributor.Resolver.of(collection).resolve());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional.Valuable<S> defineField(String str, Type type, int i) {
                return defineField(str, TypeDefinition.Sort.describe(type), i);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional.Valuable<S> defineField(String str, TypeDefinition typeDefinition, ModifierContributor.ForField... forFieldArr) {
                return defineField(str, typeDefinition, Arrays.asList(forFieldArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional.Valuable<S> defineField(String str, TypeDefinition typeDefinition, Collection<? extends ModifierContributor.ForField> collection) {
                return defineField(str, typeDefinition, ModifierContributor.Resolver.of(collection).resolve());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional.Valuable<S> define(Field field) {
                return define(new FieldDescription.ForLoadedField(field));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional.Valuable<S> define(FieldDescription fieldDescription) {
                return defineField(fieldDescription.getName(), fieldDescription.getType(), fieldDescription.getModifiers());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional<S> serialVersionUid(long j) {
                return defineField("serialVersionUID", Long.TYPE, Visibility.PRIVATE, FieldManifestation.FINAL, Ownership.STATIC).value(j);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Valuable<S> field(ElementMatcher<? super FieldDescription> elementMatcher) {
                return field(new LatentMatcher.Resolved(elementMatcher));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> ignoreAlso(ElementMatcher<? super MethodDescription> elementMatcher) {
                return ignoreAlso(new LatentMatcher.Resolved(elementMatcher));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ParameterDefinition.Initial<S> defineMethod(String str, Type type, ModifierContributor.ForMethod... forMethodArr) {
                return defineMethod(str, type, Arrays.asList(forMethodArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ParameterDefinition.Initial<S> defineMethod(String str, Type type, Collection<? extends ModifierContributor.ForMethod> collection) {
                return defineMethod(str, type, ModifierContributor.Resolver.of(collection).resolve());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ParameterDefinition.Initial<S> defineMethod(String str, Type type, int i) {
                return defineMethod(str, TypeDefinition.Sort.describe(type), i);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ParameterDefinition.Initial<S> defineMethod(String str, TypeDefinition typeDefinition, ModifierContributor.ForMethod... forMethodArr) {
                return defineMethod(str, typeDefinition, Arrays.asList(forMethodArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ParameterDefinition.Initial<S> defineMethod(String str, TypeDefinition typeDefinition, Collection<? extends ModifierContributor.ForMethod> collection) {
                return defineMethod(str, typeDefinition, ModifierContributor.Resolver.of(collection).resolve());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ParameterDefinition.Initial<S> defineConstructor(ModifierContributor.ForMethod... forMethodArr) {
                return defineConstructor(Arrays.asList(forMethodArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ParameterDefinition.Initial<S> defineConstructor(Collection<? extends ModifierContributor.ForMethod> collection) {
                return defineConstructor(ModifierContributor.Resolver.of(collection).resolve());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition<S> define(Method method) {
                return define(new MethodDescription.ForLoadedMethod(method));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition<S> define(Constructor<?> constructor) {
                return define(new MethodDescription.ForLoadedConstructor(constructor));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v17 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v4, types: [org.modelmapper.internal.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition] */
            /* JADX WARN: Type inference failed for: r0v5, types: [org.modelmapper.internal.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition] */
            /* JADX WARN: Type inference failed for: r0v9, types: [org.modelmapper.internal.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition] */
            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition<S> define(MethodDescription methodDescription) {
                MethodDefinition.ParameterDefinition.Initial initial;
                ?? withParameters;
                if (methodDescription.isConstructor()) {
                    initial = defineConstructor(methodDescription.getModifiers());
                } else {
                    initial = defineMethod(methodDescription.getInternalName(), methodDescription.getReturnType(), methodDescription.getModifiers());
                }
                ParameterList<?> parameters = methodDescription.getParameters();
                if (parameters.hasExplicitMetaData()) {
                    Iterator it = parameters.iterator();
                    withParameters = initial;
                    while (it.hasNext()) {
                        ParameterDescription parameterDescription = (ParameterDescription) it.next();
                        withParameters = withParameters.withParameter(parameterDescription.getType(), parameterDescription.getName(), parameterDescription.getModifiers());
                    }
                } else {
                    withParameters = initial.withParameters((Collection<? extends TypeDefinition>) parameters.asTypeList());
                }
                MethodDefinition.TypeVariableDefinition throwing = withParameters.throwing(methodDescription.getExceptionTypes());
                for (TypeDescription.Generic generic : methodDescription.getTypeVariables()) {
                    throwing = throwing.typeVariable(generic.getSymbol(), (Collection<? extends TypeDefinition>) generic.getUpperBounds());
                }
                return throwing;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional<S> defineProperty(String str, Type type) {
                return defineProperty(str, TypeDefinition.Sort.describe(type));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional<S> defineProperty(String str, Type type, boolean z) {
                return defineProperty(str, TypeDefinition.Sort.describe(type), z);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional<S> defineProperty(String str, TypeDefinition typeDefinition) {
                return defineProperty(str, typeDefinition, false);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public FieldDefinition.Optional<S> defineProperty(String str, TypeDefinition typeDefinition, boolean z) {
                FieldManifestation fieldManifestation;
                Builder builder;
                if (str.isEmpty()) {
                    throw new IllegalArgumentException("A bean property cannot have an empty name");
                }
                if (typeDefinition.represents(Void.TYPE)) {
                    throw new IllegalArgumentException("A bean property cannot have a void type");
                }
                if (!z) {
                    builder = defineMethod("set" + Character.toUpperCase(str.charAt(0)) + str.substring(1), Void.TYPE, Visibility.PUBLIC).withParameters(typeDefinition).intercept(FieldAccessor.ofField(str));
                    fieldManifestation = FieldManifestation.PLAIN;
                } else {
                    fieldManifestation = FieldManifestation.FINAL;
                    builder = this;
                }
                return builder.defineMethod(((typeDefinition.represents(Boolean.TYPE) || typeDefinition.represents(Boolean.class)) ? "is" : "get") + Character.toUpperCase(str.charAt(0)) + str.substring(1), typeDefinition, Visibility.PUBLIC).intercept(FieldAccessor.ofField(str)).defineField(str, typeDefinition, Visibility.PRIVATE, fieldManifestation);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition<S> method(ElementMatcher<? super MethodDescription> elementMatcher) {
                return invokable(ElementMatchers.isMethod().and(elementMatcher));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition<S> constructor(ElementMatcher<? super MethodDescription> elementMatcher) {
                return invokable(ElementMatchers.isConstructor().and(elementMatcher));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public MethodDefinition.ImplementationDefinition<S> invokable(ElementMatcher<? super MethodDescription> elementMatcher) {
                return invokable(new LatentMatcher.Resolved(elementMatcher));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> withHashCodeEquals() {
                return method(ElementMatchers.isHashCode()).intercept(HashCodeMethod.usingDefaultOffset().withIgnoredFields(ElementMatchers.isSynthetic())).method(ElementMatchers.isEquals()).intercept(EqualsMethod.isolated().withIgnoredFields(ElementMatchers.isSynthetic()));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> withToString() {
                return method(ElementMatchers.isToString()).intercept(ToStringMethod.prefixedBySimpleClassName());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> require(TypeDescription typeDescription, byte[] bArr) {
                return require(typeDescription, bArr, LoadedTypeInitializer.NoOp.INSTANCE);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> require(TypeDescription typeDescription, byte[] bArr, LoadedTypeInitializer loadedTypeInitializer) {
                return require(new Default(typeDescription, bArr, loadedTypeInitializer, Collections.emptyList()));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Builder<S> require(DynamicType... dynamicTypeArr) {
                return require(Arrays.asList(dynamicTypeArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Unloaded<S> make(TypePool typePool) {
                return make(TypeResolutionStrategy.Passive.INSTANCE, typePool);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
            public Unloaded<S> make() {
                return make(TypeResolutionStrategy.Passive.INSTANCE);
            }

            public static abstract class Delegator<U> extends AbstractBase<U> {
                protected abstract Builder<U> materialize();

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> visit(AsmVisitorWrapper asmVisitorWrapper) {
                    return materialize().visit(asmVisitorWrapper);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> initializer(LoadedTypeInitializer loadedTypeInitializer) {
                    return materialize().initializer(loadedTypeInitializer);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> annotateType(Collection<? extends AnnotationDescription> collection) {
                    return materialize().annotateType(collection);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> attribute(TypeAttributeAppender typeAttributeAppender) {
                    return materialize().attribute(typeAttributeAppender);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> modifiers(int i) {
                    return materialize().modifiers(i);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> merge(Collection<? extends ModifierContributor.ForType> collection) {
                    return materialize().merge(collection);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> name(String str) {
                    return materialize().name(str);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> topLevelType() {
                    return materialize().topLevelType();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public InnerTypeDefinition.ForType<U> innerTypeOf(TypeDescription typeDescription) {
                    return materialize().innerTypeOf(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public InnerTypeDefinition<U> innerTypeOf(MethodDescription.InDefinedShape inDefinedShape) {
                    return materialize().innerTypeOf(inDefinedShape);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> declaredTypes(Collection<? extends TypeDescription> collection) {
                    return materialize().declaredTypes(collection);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> nestHost(TypeDescription typeDescription) {
                    return materialize().nestHost(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> nestMembers(Collection<? extends TypeDescription> collection) {
                    return materialize().nestMembers(collection);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public MethodDefinition.ImplementationDefinition.Optional<U> implement(Collection<? extends TypeDefinition> collection) {
                    return materialize().implement(collection);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> initializer(ByteCodeAppender byteCodeAppender) {
                    return materialize().initializer(byteCodeAppender);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase, org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> ignoreAlso(ElementMatcher<? super MethodDescription> elementMatcher) {
                    return materialize().ignoreAlso(elementMatcher);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> ignoreAlso(LatentMatcher<? super MethodDescription> latentMatcher) {
                    return materialize().ignoreAlso(latentMatcher);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public TypeVariableDefinition<U> typeVariable(String str, Collection<? extends TypeDefinition> collection) {
                    return materialize().typeVariable(str, collection);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> transform(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer) {
                    return materialize().transform(elementMatcher, transformer);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public FieldDefinition.Optional.Valuable<U> defineField(String str, TypeDefinition typeDefinition, int i) {
                    return materialize().defineField(str, typeDefinition, i);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public FieldDefinition.Valuable<U> field(LatentMatcher<? super FieldDescription> latentMatcher) {
                    return materialize().field(latentMatcher);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public MethodDefinition.ParameterDefinition.Initial<U> defineMethod(String str, TypeDefinition typeDefinition, int i) {
                    return materialize().defineMethod(str, typeDefinition, i);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public MethodDefinition.ParameterDefinition.Initial<U> defineConstructor(int i) {
                    return materialize().defineConstructor(i);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public MethodDefinition.ImplementationDefinition<U> invokable(LatentMatcher<? super MethodDescription> latentMatcher) {
                    return materialize().invokable(latentMatcher);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> require(Collection<DynamicType> collection) {
                    return materialize().require(collection);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase, org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Unloaded<U> make() {
                    return materialize().make();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Unloaded<U> make(TypeResolutionStrategy typeResolutionStrategy) {
                    return materialize().make(typeResolutionStrategy);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase, org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Unloaded<U> make(TypePool typePool) {
                    return materialize().make(typePool);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Unloaded<U> make(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool) {
                    return materialize().make(typeResolutionStrategy, typePool);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class Adapter<U> extends AbstractBase<U> {
                protected final AnnotationRetention annotationRetention;
                protected final AnnotationValueFilter.Factory annotationValueFilterFactory;
                protected final AsmVisitorWrapper asmVisitorWrapper;
                protected final AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
                protected final List<? extends DynamicType> auxiliaryTypes;
                protected final ClassFileVersion classFileVersion;
                protected final ClassWriterStrategy classWriterStrategy;
                protected final FieldRegistry fieldRegistry;
                protected final LatentMatcher<? super MethodDescription> ignoredMethods;
                protected final Implementation.Context.Factory implementationContextFactory;
                protected final InstrumentedType.WithFlexibleName instrumentedType;
                protected final MethodGraph.Compiler methodGraphCompiler;
                protected final MethodRegistry methodRegistry;
                protected final TypeAttributeAppender typeAttributeAppender;
                protected final TypeValidation typeValidation;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Adapter adapter = (Adapter) obj;
                    return this.instrumentedType.equals(adapter.instrumentedType) && this.fieldRegistry.equals(adapter.fieldRegistry) && this.methodRegistry.equals(adapter.methodRegistry) && this.typeAttributeAppender.equals(adapter.typeAttributeAppender) && this.asmVisitorWrapper.equals(adapter.asmVisitorWrapper) && this.classFileVersion.equals(adapter.classFileVersion) && this.auxiliaryTypeNamingStrategy.equals(adapter.auxiliaryTypeNamingStrategy) && this.annotationValueFilterFactory.equals(adapter.annotationValueFilterFactory) && this.annotationRetention.equals(adapter.annotationRetention) && this.implementationContextFactory.equals(adapter.implementationContextFactory) && this.methodGraphCompiler.equals(adapter.methodGraphCompiler) && this.typeValidation.equals(adapter.typeValidation) && this.classWriterStrategy.equals(adapter.classWriterStrategy) && this.ignoredMethods.equals(adapter.ignoredMethods) && this.auxiliaryTypes.equals(adapter.auxiliaryTypes);
                }

                public int hashCode() {
                    return ((((((((((((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.fieldRegistry.hashCode()) * 31) + this.methodRegistry.hashCode()) * 31) + this.typeAttributeAppender.hashCode()) * 31) + this.asmVisitorWrapper.hashCode()) * 31) + this.classFileVersion.hashCode()) * 31) + this.auxiliaryTypeNamingStrategy.hashCode()) * 31) + this.annotationValueFilterFactory.hashCode()) * 31) + this.annotationRetention.hashCode()) * 31) + this.implementationContextFactory.hashCode()) * 31) + this.methodGraphCompiler.hashCode()) * 31) + this.typeValidation.hashCode()) * 31) + this.classWriterStrategy.hashCode()) * 31) + this.ignoredMethods.hashCode()) * 31) + this.auxiliaryTypes.hashCode();
                }

                protected abstract Builder<U> materialize(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list);

                protected Adapter(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list) {
                    this.instrumentedType = withFlexibleName;
                    this.fieldRegistry = fieldRegistry;
                    this.methodRegistry = methodRegistry;
                    this.typeAttributeAppender = typeAttributeAppender;
                    this.asmVisitorWrapper = asmVisitorWrapper;
                    this.classFileVersion = classFileVersion;
                    this.auxiliaryTypeNamingStrategy = namingStrategy;
                    this.annotationValueFilterFactory = factory;
                    this.annotationRetention = annotationRetention;
                    this.implementationContextFactory = factory2;
                    this.methodGraphCompiler = compiler;
                    this.typeValidation = typeValidation;
                    this.classWriterStrategy = classWriterStrategy;
                    this.ignoredMethods = latentMatcher;
                    this.auxiliaryTypes = list;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public FieldDefinition.Optional.Valuable<U> defineField(String str, TypeDefinition typeDefinition, int i) {
                    return new FieldDefinitionAdapter(this, new FieldDescription.Token(str, i, typeDefinition.asGenericType()));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public FieldDefinition.Valuable<U> field(LatentMatcher<? super FieldDescription> latentMatcher) {
                    return new FieldMatchAdapter(this, latentMatcher);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public MethodDefinition.ParameterDefinition.Initial<U> defineMethod(String str, TypeDefinition typeDefinition, int i) {
                    return new MethodDefinitionAdapter(new MethodDescription.Token(str, i, typeDefinition.asGenericType()));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public MethodDefinition.ParameterDefinition.Initial<U> defineConstructor(int i) {
                    return new MethodDefinitionAdapter(new MethodDescription.Token(i));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public MethodDefinition.ImplementationDefinition<U> invokable(LatentMatcher<? super MethodDescription> latentMatcher) {
                    return new MethodMatchAdapter(latentMatcher);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public MethodDefinition.ImplementationDefinition.Optional<U> implement(Collection<? extends TypeDefinition> collection) {
                    return new OptionalMethodMatchAdapter(new TypeList.Generic.Explicit(new ArrayList(collection)));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> ignoreAlso(LatentMatcher<? super MethodDescription> latentMatcher) {
                    return materialize(this.instrumentedType, this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, new LatentMatcher.Disjunction(this.ignoredMethods, latentMatcher), this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> initializer(ByteCodeAppender byteCodeAppender) {
                    return materialize(this.instrumentedType.withInitializer(byteCodeAppender), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> initializer(LoadedTypeInitializer loadedTypeInitializer) {
                    return materialize(this.instrumentedType.withInitializer(loadedTypeInitializer), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> name(String str) {
                    return materialize(this.instrumentedType.withName(str), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> modifiers(int i) {
                    return materialize(this.instrumentedType.withModifiers(i), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> merge(Collection<? extends ModifierContributor.ForType> collection) {
                    return materialize(this.instrumentedType.withModifiers(ModifierContributor.Resolver.of(collection).resolve(this.instrumentedType.getModifiers())), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> topLevelType() {
                    return materialize(this.instrumentedType.withDeclaringType(TypeDescription.UNDEFINED).withEnclosingType(TypeDescription.UNDEFINED).withLocalClass(false), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public InnerTypeDefinition.ForType<U> innerTypeOf(TypeDescription typeDescription) {
                    return new InnerTypeDefinitionForTypeAdapter(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public InnerTypeDefinition<U> innerTypeOf(MethodDescription.InDefinedShape inDefinedShape) {
                    return inDefinedShape.isTypeInitializer() ? new InnerTypeDefinitionForTypeAdapter(inDefinedShape.getDeclaringType()) : new InnerTypeDefinitionForMethodAdapter(inDefinedShape);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> declaredTypes(Collection<? extends TypeDescription> collection) {
                    return materialize(this.instrumentedType.withDeclaredTypes((TypeList) new TypeList.Explicit(new ArrayList(collection))), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> nestHost(TypeDescription typeDescription) {
                    return materialize(this.instrumentedType.withNestHost(typeDescription), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> nestMembers(Collection<? extends TypeDescription> collection) {
                    return materialize(this.instrumentedType.withNestMembers((TypeList) new TypeList.Explicit(new ArrayList(collection))), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public TypeVariableDefinition<U> typeVariable(String str, Collection<? extends TypeDefinition> collection) {
                    return new TypeVariableDefinitionAdapter(new TypeVariableToken(str, new TypeList.Generic.Explicit(new ArrayList(collection))));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> transform(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer) {
                    return materialize(this.instrumentedType.withTypeVariables(elementMatcher, transformer), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> attribute(TypeAttributeAppender typeAttributeAppender) {
                    return materialize(this.instrumentedType, this.fieldRegistry, this.methodRegistry, new TypeAttributeAppender.Compound(this.typeAttributeAppender, typeAttributeAppender), this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> annotateType(Collection<? extends AnnotationDescription> collection) {
                    return materialize(this.instrumentedType.withAnnotations((List<? extends AnnotationDescription>) new ArrayList(collection)), this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> visit(AsmVisitorWrapper asmVisitorWrapper) {
                    return materialize(this.instrumentedType, this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, new AsmVisitorWrapper.Compound(this.asmVisitorWrapper, asmVisitorWrapper), this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, this.auxiliaryTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
                public Builder<U> require(Collection<DynamicType> collection) {
                    return materialize(this.instrumentedType, this.fieldRegistry, this.methodRegistry, this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.annotationValueFilterFactory, this.annotationRetention, this.implementationContextFactory, this.methodGraphCompiler, this.typeValidation, this.classWriterStrategy, this.ignoredMethods, CompoundList.of((List) this.auxiliaryTypes, (List) new ArrayList(collection)));
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class InnerTypeDefinitionForTypeAdapter extends Delegator<U> implements InnerTypeDefinition.ForType<U> {
                    private final TypeDescription typeDescription;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        InnerTypeDefinitionForTypeAdapter innerTypeDefinitionForTypeAdapter = (InnerTypeDefinitionForTypeAdapter) obj;
                        return this.typeDescription.equals(innerTypeDefinitionForTypeAdapter.typeDescription) && Adapter.this.equals(Adapter.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode()) * 31) + Adapter.this.hashCode();
                    }

                    protected InnerTypeDefinitionForTypeAdapter(TypeDescription typeDescription) {
                        this.typeDescription = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition
                    public Builder<U> asAnonymousType() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType.withDeclaringType(TypeDescription.UNDEFINED).withEnclosingType(this.typeDescription).withAnonymousClass(true), Adapter.this.fieldRegistry, Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType
                    public Builder<U> asMemberType() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType.withDeclaringType(this.typeDescription).withEnclosingType(this.typeDescription).withAnonymousClass(false).withLocalClass(false), Adapter.this.fieldRegistry, Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    protected Builder<U> materialize() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType.withDeclaringType(TypeDescription.UNDEFINED).withEnclosingType(this.typeDescription).withLocalClass(true), Adapter.this.fieldRegistry, Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class InnerTypeDefinitionForMethodAdapter extends Delegator<U> implements InnerTypeDefinition<U> {
                    private final MethodDescription.InDefinedShape methodDescription;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        InnerTypeDefinitionForMethodAdapter innerTypeDefinitionForMethodAdapter = (InnerTypeDefinitionForMethodAdapter) obj;
                        return this.methodDescription.equals(innerTypeDefinitionForMethodAdapter.methodDescription) && Adapter.this.equals(Adapter.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode()) * 31) + Adapter.this.hashCode();
                    }

                    protected InnerTypeDefinitionForMethodAdapter(MethodDescription.InDefinedShape inDefinedShape) {
                        this.methodDescription = inDefinedShape;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition
                    public Builder<U> asAnonymousType() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType.withDeclaringType(TypeDescription.UNDEFINED).withEnclosingMethod(this.methodDescription).withAnonymousClass(true), Adapter.this.fieldRegistry, Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    protected Builder<U> materialize() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType.withDeclaringType(TypeDescription.UNDEFINED).withEnclosingMethod(this.methodDescription).withLocalClass(true), Adapter.this.fieldRegistry, Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class TypeVariableDefinitionAdapter extends TypeVariableDefinition.AbstractBase<U> {
                    private final TypeVariableToken token;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        TypeVariableDefinitionAdapter typeVariableDefinitionAdapter = (TypeVariableDefinitionAdapter) obj;
                        return this.token.equals(typeVariableDefinitionAdapter.token) && Adapter.this.equals(Adapter.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode()) * 31) + Adapter.this.hashCode();
                    }

                    protected TypeVariableDefinitionAdapter(TypeVariableToken typeVariableToken) {
                        this.token = typeVariableToken;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition
                    public TypeVariableDefinition<U> annotateTypeVariable(Collection<? extends AnnotationDescription> collection) {
                        return new TypeVariableDefinitionAdapter(new TypeVariableToken(this.token.getSymbol(), this.token.getBounds(), CompoundList.of((List) this.token.getAnnotations(), (List) new ArrayList(collection))));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    protected Builder<U> materialize() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType.withTypeVariable(this.token), Adapter.this.fieldRegistry, Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class FieldDefinitionAdapter extends FieldDefinition.Optional.Valuable.AbstractBase.Adapter<U> {
                    private final FieldDescription.Token token;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
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
                        FieldDefinitionAdapter fieldDefinitionAdapter = (FieldDefinitionAdapter) obj;
                        return this.token.equals(fieldDefinitionAdapter.token) && Adapter.this.equals(Adapter.this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
                    public int hashCode() {
                        return (((super.hashCode() * 31) + this.token.hashCode()) * 31) + Adapter.this.hashCode();
                    }

                    protected FieldDefinitionAdapter(Adapter adapter, FieldDescription.Token token) {
                        this(FieldAttributeAppender.ForInstrumentedField.INSTANCE, Transformer.NoOp.make(), FieldDescription.NO_DEFAULT_VALUE, token);
                    }

                    protected FieldDefinitionAdapter(FieldAttributeAppender.Factory factory, Transformer<FieldDescription> transformer, Object obj, FieldDescription.Token token) {
                        super(factory, transformer, obj);
                        this.token = token;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public FieldDefinition.Optional<U> annotateField(Collection<? extends AnnotationDescription> collection) {
                        return new FieldDefinitionAdapter(this.fieldAttributeAppenderFactory, this.transformer, this.defaultValue, new FieldDescription.Token(this.token.getName(), this.token.getModifiers(), this.token.getType(), CompoundList.of((List) this.token.getAnnotations(), (List) new ArrayList(collection))));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    protected Builder<U> materialize() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType.withField(this.token), Adapter.this.fieldRegistry.prepend(new LatentMatcher.ForFieldToken(this.token), this.fieldAttributeAppenderFactory, this.defaultValue, this.transformer), Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
                    protected FieldDefinition.Optional<U> materialize(FieldAttributeAppender.Factory factory, Transformer<FieldDescription> transformer, Object obj) {
                        return new FieldDefinitionAdapter(factory, transformer, obj, this.token);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class FieldMatchAdapter extends FieldDefinition.Optional.Valuable.AbstractBase.Adapter<U> {
                    private final LatentMatcher<? super FieldDescription> matcher;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
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
                        FieldMatchAdapter fieldMatchAdapter = (FieldMatchAdapter) obj;
                        return this.matcher.equals(fieldMatchAdapter.matcher) && Adapter.this.equals(Adapter.this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
                    public int hashCode() {
                        return (((super.hashCode() * 31) + this.matcher.hashCode()) * 31) + Adapter.this.hashCode();
                    }

                    protected FieldMatchAdapter(Adapter adapter, LatentMatcher<? super FieldDescription> latentMatcher) {
                        this(FieldAttributeAppender.NoOp.INSTANCE, Transformer.NoOp.make(), FieldDescription.NO_DEFAULT_VALUE, latentMatcher);
                    }

                    protected FieldMatchAdapter(FieldAttributeAppender.Factory factory, Transformer<FieldDescription> transformer, Object obj, LatentMatcher<? super FieldDescription> latentMatcher) {
                        super(factory, transformer, obj);
                        this.matcher = latentMatcher;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public FieldDefinition.Optional<U> annotateField(Collection<? extends AnnotationDescription> collection) {
                        return attribute(new FieldAttributeAppender.Explicit(new ArrayList(collection)));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    protected Builder<U> materialize() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType, Adapter.this.fieldRegistry.prepend(this.matcher, this.fieldAttributeAppenderFactory, this.defaultValue, this.transformer), Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
                    protected FieldDefinition.Optional<U> materialize(FieldAttributeAppender.Factory factory, Transformer<FieldDescription> transformer, Object obj) {
                        return new FieldMatchAdapter(factory, transformer, obj, this.matcher);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class MethodDefinitionAdapter extends MethodDefinition.ParameterDefinition.Initial.AbstractBase<U> {
                    private final MethodDescription.Token token;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        MethodDefinitionAdapter methodDefinitionAdapter = (MethodDefinitionAdapter) obj;
                        return this.token.equals(methodDefinitionAdapter.token) && Adapter.this.equals(Adapter.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode()) * 31) + Adapter.this.hashCode();
                    }

                    protected MethodDefinitionAdapter(MethodDescription.Token token) {
                        this.token = token;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public MethodDefinition.ParameterDefinition.Annotatable<U> withParameter(TypeDefinition typeDefinition, String str, int i) {
                        return new ParameterAnnotationAdapter(new ParameterDescription.Token(typeDefinition.asGenericType(), str, Integer.valueOf(i)));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple
                    public MethodDefinition.ParameterDefinition.Simple.Annotatable<U> withParameter(TypeDefinition typeDefinition) {
                        return new SimpleParameterAnnotationAdapter(new ParameterDescription.Token(typeDefinition.asGenericType()));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                    public MethodDefinition.ExceptionDefinition<U> throwing(Collection<? extends TypeDefinition> collection) {
                        return new MethodDefinitionAdapter(new MethodDescription.Token(this.token.getName(), this.token.getModifiers(), this.token.getTypeVariableTokens(), this.token.getReturnType(), this.token.getParameterTokens(), CompoundList.of((List) this.token.getExceptionTypes(), (List) new TypeList.Generic.Explicit(new ArrayList(collection))), this.token.getAnnotations(), this.token.getDefaultValue(), this.token.getReceiverType()));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public MethodDefinition.TypeVariableDefinition.Annotatable<U> typeVariable(String str, Collection<? extends TypeDefinition> collection) {
                        return new TypeVariableAnnotationAdapter(new TypeVariableToken(str, new TypeList.Generic.Explicit(new ArrayList(collection))));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> intercept(Implementation implementation) {
                        return materialize(new MethodRegistry.Handler.ForImplementation(implementation));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> withoutCode() {
                        return new MethodDefinitionAdapter(new MethodDescription.Token(this.token.getName(), ModifierContributor.Resolver.of(MethodManifestation.ABSTRACT).resolve(this.token.getModifiers()), this.token.getTypeVariableTokens(), this.token.getReturnType(), this.token.getParameterTokens(), this.token.getExceptionTypes(), this.token.getAnnotations(), this.token.getDefaultValue(), this.token.getReceiverType())).materialize(MethodRegistry.Handler.ForAbstractMethod.INSTANCE);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> defaultValue(AnnotationValue<?, ?> annotationValue) {
                        return new MethodDefinitionAdapter(new MethodDescription.Token(this.token.getName(), ModifierContributor.Resolver.of(MethodManifestation.ABSTRACT).resolve(this.token.getModifiers()), this.token.getTypeVariableTokens(), this.token.getReturnType(), this.token.getParameterTokens(), this.token.getExceptionTypes(), this.token.getAnnotations(), annotationValue, this.token.getReceiverType())).materialize(new MethodRegistry.Handler.ForAnnotationValue(annotationValue));
                    }

                    private MethodDefinition.ReceiverTypeDefinition<U> materialize(MethodRegistry.Handler handler) {
                        return new AnnotationAdapter(this, handler);
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class TypeVariableAnnotationAdapter extends MethodDefinition.TypeVariableDefinition.Annotatable.AbstractBase.Adapter<U> {
                        private final TypeVariableToken token;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            TypeVariableAnnotationAdapter typeVariableAnnotationAdapter = (TypeVariableAnnotationAdapter) obj;
                            return this.token.equals(typeVariableAnnotationAdapter.token) && MethodDefinitionAdapter.this.equals(MethodDefinitionAdapter.this);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode()) * 31) + MethodDefinitionAdapter.this.hashCode();
                        }

                        protected TypeVariableAnnotationAdapter(TypeVariableToken typeVariableToken) {
                            this.token = typeVariableToken;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable.AbstractBase.Adapter
                        protected MethodDefinition.ParameterDefinition<U> materialize() {
                            return new MethodDefinitionAdapter(new MethodDescription.Token(MethodDefinitionAdapter.this.token.getName(), MethodDefinitionAdapter.this.token.getModifiers(), CompoundList.of(MethodDefinitionAdapter.this.token.getTypeVariableTokens(), this.token), MethodDefinitionAdapter.this.token.getReturnType(), MethodDefinitionAdapter.this.token.getParameterTokens(), MethodDefinitionAdapter.this.token.getExceptionTypes(), MethodDefinitionAdapter.this.token.getAnnotations(), MethodDefinitionAdapter.this.token.getDefaultValue(), MethodDefinitionAdapter.this.token.getReceiverType()));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable
                        public MethodDefinition.TypeVariableDefinition.Annotatable<U> annotateTypeVariable(Collection<? extends AnnotationDescription> collection) {
                            return MethodDefinitionAdapter.this.new TypeVariableAnnotationAdapter(new TypeVariableToken(this.token.getSymbol(), this.token.getBounds(), CompoundList.of((List) this.token.getAnnotations(), (List) new ArrayList(collection))));
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class ParameterAnnotationAdapter extends MethodDefinition.ParameterDefinition.Annotatable.AbstractBase.Adapter<U> {
                        private final ParameterDescription.Token token;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            ParameterAnnotationAdapter parameterAnnotationAdapter = (ParameterAnnotationAdapter) obj;
                            return this.token.equals(parameterAnnotationAdapter.token) && MethodDefinitionAdapter.this.equals(MethodDefinitionAdapter.this);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode()) * 31) + MethodDefinitionAdapter.this.hashCode();
                        }

                        protected ParameterAnnotationAdapter(ParameterDescription.Token token) {
                            this.token = token;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable
                        public MethodDefinition.ParameterDefinition.Annotatable<U> annotateParameter(Collection<? extends AnnotationDescription> collection) {
                            return MethodDefinitionAdapter.this.new ParameterAnnotationAdapter(new ParameterDescription.Token(this.token.getType(), CompoundList.of((List) this.token.getAnnotations(), (List) new ArrayList(collection)), this.token.getName(), this.token.getModifiers()));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable.AbstractBase.Adapter
                        protected MethodDefinition.ParameterDefinition<U> materialize() {
                            return new MethodDefinitionAdapter(new MethodDescription.Token(MethodDefinitionAdapter.this.token.getName(), MethodDefinitionAdapter.this.token.getModifiers(), MethodDefinitionAdapter.this.token.getTypeVariableTokens(), MethodDefinitionAdapter.this.token.getReturnType(), CompoundList.of(MethodDefinitionAdapter.this.token.getParameterTokens(), this.token), MethodDefinitionAdapter.this.token.getExceptionTypes(), MethodDefinitionAdapter.this.token.getAnnotations(), MethodDefinitionAdapter.this.token.getDefaultValue(), MethodDefinitionAdapter.this.token.getReceiverType()));
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class SimpleParameterAnnotationAdapter extends MethodDefinition.ParameterDefinition.Simple.Annotatable.AbstractBase.Adapter<U> {
                        private final ParameterDescription.Token token;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            SimpleParameterAnnotationAdapter simpleParameterAnnotationAdapter = (SimpleParameterAnnotationAdapter) obj;
                            return this.token.equals(simpleParameterAnnotationAdapter.token) && MethodDefinitionAdapter.this.equals(MethodDefinitionAdapter.this);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode()) * 31) + MethodDefinitionAdapter.this.hashCode();
                        }

                        protected SimpleParameterAnnotationAdapter(ParameterDescription.Token token) {
                            this.token = token;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable
                        public MethodDefinition.ParameterDefinition.Simple.Annotatable<U> annotateParameter(Collection<? extends AnnotationDescription> collection) {
                            return MethodDefinitionAdapter.this.new SimpleParameterAnnotationAdapter(new ParameterDescription.Token(this.token.getType(), CompoundList.of((List) this.token.getAnnotations(), (List) new ArrayList(collection)), this.token.getName(), this.token.getModifiers()));
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable.AbstractBase.Adapter
                        protected MethodDefinition.ParameterDefinition.Simple<U> materialize() {
                            return new MethodDefinitionAdapter(new MethodDescription.Token(MethodDefinitionAdapter.this.token.getName(), MethodDefinitionAdapter.this.token.getModifiers(), MethodDefinitionAdapter.this.token.getTypeVariableTokens(), MethodDefinitionAdapter.this.token.getReturnType(), CompoundList.of(MethodDefinitionAdapter.this.token.getParameterTokens(), this.token), MethodDefinitionAdapter.this.token.getExceptionTypes(), MethodDefinitionAdapter.this.token.getAnnotations(), MethodDefinitionAdapter.this.token.getDefaultValue(), MethodDefinitionAdapter.this.token.getReceiverType()));
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class AnnotationAdapter extends MethodDefinition.AbstractBase.Adapter<U> {
                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        public boolean equals(Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && MethodDefinitionAdapter.this.equals(MethodDefinitionAdapter.this);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        public int hashCode() {
                            return (super.hashCode() * 31) + MethodDefinitionAdapter.this.hashCode();
                        }

                        protected AnnotationAdapter(MethodDefinitionAdapter methodDefinitionAdapter, MethodRegistry.Handler handler) {
                            this(handler, MethodAttributeAppender.ForInstrumentedMethod.INCLUDING_RECEIVER, Transformer.NoOp.make());
                        }

                        protected AnnotationAdapter(MethodRegistry.Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer) {
                            super(handler, factory, transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition
                        public MethodDefinition<U> receiverType(TypeDescription.Generic generic) {
                            return new MethodDefinitionAdapter(new MethodDescription.Token(MethodDefinitionAdapter.this.token.getName(), MethodDefinitionAdapter.this.token.getModifiers(), MethodDefinitionAdapter.this.token.getTypeVariableTokens(), MethodDefinitionAdapter.this.token.getReturnType(), MethodDefinitionAdapter.this.token.getParameterTokens(), MethodDefinitionAdapter.this.token.getExceptionTypes(), MethodDefinitionAdapter.this.token.getAnnotations(), MethodDefinitionAdapter.this.token.getDefaultValue(), generic)).new AnnotationAdapter(this.handler, this.methodAttributeAppenderFactory, this.transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                        public MethodDefinition<U> annotateMethod(Collection<? extends AnnotationDescription> collection) {
                            return new MethodDefinitionAdapter(new MethodDescription.Token(MethodDefinitionAdapter.this.token.getName(), MethodDefinitionAdapter.this.token.getModifiers(), MethodDefinitionAdapter.this.token.getTypeVariableTokens(), MethodDefinitionAdapter.this.token.getReturnType(), MethodDefinitionAdapter.this.token.getParameterTokens(), MethodDefinitionAdapter.this.token.getExceptionTypes(), CompoundList.of((List) MethodDefinitionAdapter.this.token.getAnnotations(), (List) new ArrayList(collection)), MethodDefinitionAdapter.this.token.getDefaultValue(), MethodDefinitionAdapter.this.token.getReceiverType())).new AnnotationAdapter(this.handler, this.methodAttributeAppenderFactory, this.transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                        public MethodDefinition<U> annotateParameter(int i, Collection<? extends AnnotationDescription> collection) {
                            ArrayList arrayList = new ArrayList(MethodDefinitionAdapter.this.token.getParameterTokens());
                            arrayList.set(i, new ParameterDescription.Token(MethodDefinitionAdapter.this.token.getParameterTokens().get(i).getType(), CompoundList.of((List) MethodDefinitionAdapter.this.token.getParameterTokens().get(i).getAnnotations(), (List) new ArrayList(collection)), MethodDefinitionAdapter.this.token.getParameterTokens().get(i).getName(), MethodDefinitionAdapter.this.token.getParameterTokens().get(i).getModifiers()));
                            return new MethodDefinitionAdapter(new MethodDescription.Token(MethodDefinitionAdapter.this.token.getName(), MethodDefinitionAdapter.this.token.getModifiers(), MethodDefinitionAdapter.this.token.getTypeVariableTokens(), MethodDefinitionAdapter.this.token.getReturnType(), arrayList, MethodDefinitionAdapter.this.token.getExceptionTypes(), MethodDefinitionAdapter.this.token.getAnnotations(), MethodDefinitionAdapter.this.token.getDefaultValue(), MethodDefinitionAdapter.this.token.getReceiverType())).new AnnotationAdapter(this.handler, this.methodAttributeAppenderFactory, this.transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        protected MethodDefinition<U> materialize(MethodRegistry.Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer) {
                            return MethodDefinitionAdapter.this.new AnnotationAdapter(handler, factory, transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                        protected Builder<U> materialize() {
                            return Adapter.this.materialize(Adapter.this.instrumentedType.withMethod(MethodDefinitionAdapter.this.token), Adapter.this.fieldRegistry, Adapter.this.methodRegistry.prepend(new LatentMatcher.ForMethodToken(MethodDefinitionAdapter.this.token), this.handler, this.methodAttributeAppenderFactory, this.transformer), Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class MethodMatchAdapter extends MethodDefinition.ImplementationDefinition.AbstractBase<U> {
                    private final LatentMatcher<? super MethodDescription> matcher;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        MethodMatchAdapter methodMatchAdapter = (MethodMatchAdapter) obj;
                        return this.matcher.equals(methodMatchAdapter.matcher) && Adapter.this.equals(Adapter.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + Adapter.this.hashCode();
                    }

                    protected MethodMatchAdapter(LatentMatcher<? super MethodDescription> latentMatcher) {
                        this.matcher = latentMatcher;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> intercept(Implementation implementation) {
                        return materialize(new MethodRegistry.Handler.ForImplementation(implementation));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> withoutCode() {
                        return materialize(MethodRegistry.Handler.ForAbstractMethod.INSTANCE);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> defaultValue(AnnotationValue<?, ?> annotationValue) {
                        return materialize(new MethodRegistry.Handler.ForAnnotationValue(annotationValue));
                    }

                    private MethodDefinition.ReceiverTypeDefinition<U> materialize(MethodRegistry.Handler handler) {
                        return new AnnotationAdapter(this, handler);
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class AnnotationAdapter extends MethodDefinition.AbstractBase.Adapter<U> {
                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        public boolean equals(Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && MethodMatchAdapter.this.equals(MethodMatchAdapter.this);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        public int hashCode() {
                            return (super.hashCode() * 31) + MethodMatchAdapter.this.hashCode();
                        }

                        protected AnnotationAdapter(MethodMatchAdapter methodMatchAdapter, MethodRegistry.Handler handler) {
                            this(handler, MethodAttributeAppender.NoOp.INSTANCE, Transformer.NoOp.make());
                        }

                        protected AnnotationAdapter(MethodRegistry.Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer) {
                            super(handler, factory, transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition
                        public MethodDefinition<U> receiverType(TypeDescription.Generic generic) {
                            return MethodMatchAdapter.this.new AnnotationAdapter(this.handler, new MethodAttributeAppender.Factory.Compound(this.methodAttributeAppenderFactory, new MethodAttributeAppender.ForReceiverType(generic)), this.transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                        public MethodDefinition<U> annotateMethod(Collection<? extends AnnotationDescription> collection) {
                            return MethodMatchAdapter.this.new AnnotationAdapter(this.handler, new MethodAttributeAppender.Factory.Compound(this.methodAttributeAppenderFactory, new MethodAttributeAppender.Explicit(new ArrayList(collection))), this.transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                        public MethodDefinition<U> annotateParameter(int i, Collection<? extends AnnotationDescription> collection) {
                            return MethodMatchAdapter.this.new AnnotationAdapter(this.handler, new MethodAttributeAppender.Factory.Compound(this.methodAttributeAppenderFactory, new MethodAttributeAppender.Explicit(i, new ArrayList(collection))), this.transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        protected MethodDefinition<U> materialize(MethodRegistry.Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer) {
                            return MethodMatchAdapter.this.new AnnotationAdapter(handler, factory, transformer);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                        protected Builder<U> materialize() {
                            return Adapter.this.materialize(Adapter.this.instrumentedType, Adapter.this.fieldRegistry, Adapter.this.methodRegistry.prepend(MethodMatchAdapter.this.matcher, this.handler, this.methodAttributeAppenderFactory, this.transformer), Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class OptionalMethodMatchAdapter extends Delegator<U> implements MethodDefinition.ImplementationDefinition.Optional<U> {
                    private final TypeList.Generic interfaces;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        OptionalMethodMatchAdapter optionalMethodMatchAdapter = (OptionalMethodMatchAdapter) obj;
                        return this.interfaces.equals(optionalMethodMatchAdapter.interfaces) && Adapter.this.equals(Adapter.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.interfaces.hashCode()) * 31) + Adapter.this.hashCode();
                    }

                    protected OptionalMethodMatchAdapter(TypeList.Generic generic) {
                        this.interfaces = generic;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    protected Builder<U> materialize() {
                        Adapter adapter = Adapter.this;
                        return adapter.materialize(adapter.instrumentedType.withInterfaces(this.interfaces), Adapter.this.fieldRegistry, Adapter.this.methodRegistry, Adapter.this.typeAttributeAppender, Adapter.this.asmVisitorWrapper, Adapter.this.classFileVersion, Adapter.this.auxiliaryTypeNamingStrategy, Adapter.this.annotationValueFilterFactory, Adapter.this.annotationRetention, Adapter.this.implementationContextFactory, Adapter.this.methodGraphCompiler, Adapter.this.typeValidation, Adapter.this.classWriterStrategy, Adapter.this.ignoredMethods, Adapter.this.auxiliaryTypes);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> intercept(Implementation implementation) {
                        return interfaceType().intercept(implementation);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> withoutCode() {
                        return interfaceType().withoutCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public MethodDefinition.ReceiverTypeDefinition<U> defaultValue(AnnotationValue<?, ?> annotationValue) {
                        return interfaceType().defaultValue(annotationValue);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public <V> MethodDefinition.ReceiverTypeDefinition<U> defaultValue(V v, Class<? extends V> cls) {
                        return interfaceType().defaultValue(v, cls);
                    }

                    private MethodDefinition.ImplementationDefinition<U> interfaceType() {
                        ElementMatcher.Junction none = ElementMatchers.none();
                        Iterator it = this.interfaces.asErasures().iterator();
                        while (it.hasNext()) {
                            none = none.or(ElementMatchers.isSuperTypeOf((TypeDescription) it.next()));
                        }
                        return materialize().invokable(ElementMatchers.isDeclaredBy(ElementMatchers.isInterface().and(none)));
                    }
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements DynamicType {
        private static final int BUFFER_SIZE = 1024;
        private static final String CLASS_FILE_EXTENSION = ".class";
        private static final int END_OF_FILE = -1;
        private static final int FROM_BEGINNING = 0;
        private static final String MANIFEST_VERSION = "1.0";
        private static final String TEMP_SUFFIX = "tmp";
        protected final List<? extends DynamicType> auxiliaryTypes;
        protected final byte[] binaryRepresentation;
        protected final LoadedTypeInitializer loadedTypeInitializer;
        protected final TypeDescription typeDescription;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r5 = (Default) obj;
            return this.typeDescription.equals(r5.typeDescription) && Arrays.equals(this.binaryRepresentation, r5.binaryRepresentation) && this.loadedTypeInitializer.equals(r5.loadedTypeInitializer) && this.auxiliaryTypes.equals(r5.auxiliaryTypes);
        }

        public int hashCode() {
            return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode()) * 31) + Arrays.hashCode(this.binaryRepresentation)) * 31) + this.loadedTypeInitializer.hashCode()) * 31) + this.auxiliaryTypes.hashCode();
        }

        public Default(TypeDescription typeDescription, byte[] bArr, LoadedTypeInitializer loadedTypeInitializer, List<? extends DynamicType> list) {
            this.typeDescription = typeDescription;
            this.binaryRepresentation = bArr;
            this.loadedTypeInitializer = loadedTypeInitializer;
            this.auxiliaryTypes = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public TypeDescription getTypeDescription() {
            return this.typeDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public Map<TypeDescription, byte[]> getAllTypes() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(this.typeDescription, this.binaryRepresentation);
            Iterator<? extends DynamicType> it = this.auxiliaryTypes.iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(it.next().getAllTypes());
            }
            return linkedHashMap;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public Map<TypeDescription, LoadedTypeInitializer> getLoadedTypeInitializers() {
            HashMap hashMap = new HashMap();
            Iterator<? extends DynamicType> it = this.auxiliaryTypes.iterator();
            while (it.hasNext()) {
                hashMap.putAll(it.next().getLoadedTypeInitializers());
            }
            hashMap.put(this.typeDescription, this.loadedTypeInitializer);
            return hashMap;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public boolean hasAliveLoadedTypeInitializers() {
            Iterator<LoadedTypeInitializer> it = getLoadedTypeInitializers().values().iterator();
            while (it.hasNext()) {
                if (it.next().isAlive()) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public byte[] getBytes() {
            return this.binaryRepresentation;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public Map<TypeDescription, byte[]> getAuxiliaryTypes() {
            HashMap hashMap = new HashMap();
            for (DynamicType dynamicType : this.auxiliaryTypes) {
                hashMap.put(dynamicType.getTypeDescription(), dynamicType.getBytes());
                hashMap.putAll(dynamicType.getAuxiliaryTypes());
            }
            return hashMap;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public Map<TypeDescription, File> saveIn(File file) throws IOException {
            HashMap hashMap = new HashMap();
            File file2 = new File(file, this.typeDescription.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, File.separatorChar) + ".class");
            if (file2.getParentFile() != null && !file2.getParentFile().isDirectory() && !file2.getParentFile().mkdirs()) {
                throw new IllegalArgumentException("Could not create directory: " + file2.getParentFile());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(this.binaryRepresentation);
                fileOutputStream.close();
                hashMap.put(this.typeDescription, file2);
                Iterator<? extends DynamicType> it = this.auxiliaryTypes.iterator();
                while (it.hasNext()) {
                    hashMap.putAll(it.next().saveIn(file));
                }
                return hashMap;
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public File inject(File file, File file2) throws IOException {
            JarInputStream jarInputStream = new JarInputStream(new BufferedInputStream(new FileInputStream(file)));
            try {
                if (!file2.isFile() && !file2.createNewFile()) {
                    throw new IllegalArgumentException("Could not create file: " + file2);
                }
                Manifest manifest = jarInputStream.getManifest();
                JarOutputStream jarOutputStream = manifest == null ? new JarOutputStream(new FileOutputStream(file2)) : new JarOutputStream(new FileOutputStream(file2), manifest);
                try {
                    Map<TypeDescription, byte[]> auxiliaryTypes = getAuxiliaryTypes();
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<TypeDescription, byte[]> entry : auxiliaryTypes.entrySet()) {
                        hashMap.put(entry.getKey().getInternalName() + ".class", entry.getValue());
                    }
                    hashMap.put(this.typeDescription.getInternalName() + ".class", this.binaryRepresentation);
                    while (true) {
                        JarEntry nextJarEntry = jarInputStream.getNextJarEntry();
                        if (nextJarEntry == null) {
                            break;
                        }
                        byte[] bArr = (byte[]) hashMap.remove(nextJarEntry.getName());
                        if (bArr == null) {
                            jarOutputStream.putNextEntry(nextJarEntry);
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = jarInputStream.read(bArr2);
                                if (read != -1) {
                                    jarOutputStream.write(bArr2, 0, read);
                                }
                            }
                        } else {
                            jarOutputStream.putNextEntry(new JarEntry(nextJarEntry.getName()));
                            jarOutputStream.write(bArr);
                        }
                        jarInputStream.closeEntry();
                        jarOutputStream.closeEntry();
                    }
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        jarOutputStream.putNextEntry(new JarEntry((String) entry2.getKey()));
                        jarOutputStream.write((byte[]) entry2.getValue());
                        jarOutputStream.closeEntry();
                    }
                    return file2;
                } finally {
                    jarOutputStream.close();
                }
            } finally {
                jarInputStream.close();
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public File inject(File file) throws IOException {
            File inject = inject(file, File.createTempFile(file.getName(), TEMP_SUFFIX));
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inject));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        return file;
                    } finally {
                        bufferedOutputStream.close();
                    }
                } finally {
                    bufferedInputStream.close();
                }
            } finally {
                if (!inject.delete()) {
                    inject.deleteOnExit();
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public File toJar(File file) throws IOException {
            Manifest manifest = new Manifest();
            manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
            return toJar(file, manifest);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType
        public File toJar(File file, Manifest manifest) throws IOException {
            if (!file.isFile() && !file.createNewFile()) {
                throw new IllegalArgumentException("Could not create file: " + file);
            }
            JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(file), manifest);
            try {
                for (Map.Entry<TypeDescription, byte[]> entry : getAuxiliaryTypes().entrySet()) {
                    jarOutputStream.putNextEntry(new JarEntry(entry.getKey().getInternalName() + ".class"));
                    jarOutputStream.write(entry.getValue());
                    jarOutputStream.closeEntry();
                }
                jarOutputStream.putNextEntry(new JarEntry(this.typeDescription.getInternalName() + ".class"));
                jarOutputStream.write(this.binaryRepresentation);
                jarOutputStream.closeEntry();
                return file;
            } finally {
                jarOutputStream.close();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Unloaded<T> extends Default implements Unloaded<T> {
            private final TypeResolutionStrategy.Resolved typeResolutionStrategy;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Default
            public boolean equals(Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeResolutionStrategy.equals(((Unloaded) obj).typeResolutionStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Default
            public int hashCode() {
                return (super.hashCode() * 31) + this.typeResolutionStrategy.hashCode();
            }

            public Unloaded(TypeDescription typeDescription, byte[] bArr, LoadedTypeInitializer loadedTypeInitializer, List<? extends DynamicType> list, TypeResolutionStrategy.Resolved resolved) {
                super(typeDescription, bArr, loadedTypeInitializer, list);
                this.typeResolutionStrategy = resolved;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Unloaded
            public Loaded<T> load(ClassLoader classLoader) {
                if (classLoader instanceof InjectionClassLoader) {
                    InjectionClassLoader injectionClassLoader = (InjectionClassLoader) classLoader;
                    if (!injectionClassLoader.isSealed()) {
                        return load(injectionClassLoader, InjectionClassLoader.Strategy.INSTANCE);
                    }
                }
                return load(classLoader, ClassLoadingStrategy.Default.WRAPPER);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Unloaded
            public <S extends ClassLoader> Loaded<T> load(S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
                return new Loaded(this.typeDescription, this.binaryRepresentation, this.loadedTypeInitializer, this.auxiliaryTypes, this.typeResolutionStrategy.initialize(this, s, classLoadingStrategy));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Unloaded
            public Unloaded<T> include(DynamicType... dynamicTypeArr) {
                return include(Arrays.asList(dynamicTypeArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Unloaded
            public Unloaded<T> include(List<? extends DynamicType> list) {
                return new Unloaded(this.typeDescription, this.binaryRepresentation, this.loadedTypeInitializer, CompoundList.of((List) this.auxiliaryTypes, (List) list), this.typeResolutionStrategy);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Loaded<T> extends Default implements Loaded<T> {
            private final Map<TypeDescription, Class<?>> loadedTypes;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Default
            public boolean equals(Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.loadedTypes.equals(((Loaded) obj).loadedTypes);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Default
            public int hashCode() {
                return (super.hashCode() * 31) + this.loadedTypes.hashCode();
            }

            protected Loaded(TypeDescription typeDescription, byte[] bArr, LoadedTypeInitializer loadedTypeInitializer, List<? extends DynamicType> list, Map<TypeDescription, Class<?>> map) {
                super(typeDescription, bArr, loadedTypeInitializer, list);
                this.loadedTypes = map;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Loaded
            public Class<? extends T> getLoaded() {
                return (Class) this.loadedTypes.get(this.typeDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Loaded
            public Map<TypeDescription, Class<?>> getLoadedAuxiliaryTypes() {
                HashMap hashMap = new HashMap(this.loadedTypes);
                hashMap.remove(this.typeDescription);
                return hashMap;
            }
        }
    }
}
