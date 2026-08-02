package org.modelmapper.internal.bytebuddy.utility;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.ConstantDynamic;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;

/* loaded from: classes4.dex */
public interface JavaConstant {
    Object asConstantPoolValue();

    TypeDescription getType();

    public static class MethodType implements JavaConstant {
        private static final Dispatcher DISPATCHER = (Dispatcher) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
        private final List<? extends TypeDescription> parameterTypes;
        private final TypeDescription returnType;

        protected MethodType(TypeDescription typeDescription, List<? extends TypeDescription> list) {
            this.returnType = typeDescription;
            this.parameterTypes = list;
        }

        public static MethodType ofLoaded(Object obj) {
            if (!JavaType.METHOD_TYPE.getTypeStub().isInstance(obj)) {
                throw new IllegalArgumentException("Expected method type object: " + obj);
            }
            Dispatcher dispatcher = DISPATCHER;
            return of(dispatcher.returnType(obj), dispatcher.parameterArray(obj));
        }

        public static MethodType of(Class<?> cls, Class<?>... clsArr) {
            return of(TypeDescription.ForLoadedType.of(cls), new TypeList.ForLoadedTypes(clsArr));
        }

        public static MethodType of(TypeDescription typeDescription, List<? extends TypeDescription> list) {
            return new MethodType(typeDescription, list);
        }

        public static MethodType of(Method method) {
            return of(new MethodDescription.ForLoadedMethod(method));
        }

        public static MethodType of(Constructor<?> constructor) {
            return of(new MethodDescription.ForLoadedConstructor(constructor));
        }

        public static MethodType of(MethodDescription methodDescription) {
            return new MethodType(methodDescription.getReturnType().asErasure(), methodDescription.getParameters().asTypeList().asErasures());
        }

        public static MethodType ofSetter(Field field) {
            return ofSetter(new FieldDescription.ForLoadedField(field));
        }

        public static MethodType ofSetter(FieldDescription fieldDescription) {
            return new MethodType(TypeDescription.VOID, Collections.singletonList(fieldDescription.getType().asErasure()));
        }

        public static MethodType ofGetter(Field field) {
            return ofGetter(new FieldDescription.ForLoadedField(field));
        }

        public static MethodType ofGetter(FieldDescription fieldDescription) {
            return new MethodType(fieldDescription.getType().asErasure(), Collections.emptyList());
        }

        public static MethodType ofConstant(Object obj) {
            return ofConstant(obj.getClass());
        }

        public static MethodType ofConstant(Class<?> cls) {
            return ofConstant(TypeDescription.ForLoadedType.of(cls));
        }

        public static MethodType ofConstant(TypeDescription typeDescription) {
            return new MethodType(typeDescription, Collections.emptyList());
        }

        public TypeDescription getReturnType() {
            return this.returnType;
        }

        public TypeList getParameterTypes() {
            return new TypeList.Explicit(this.parameterTypes);
        }

        public String getDescriptor() {
            StringBuilder sb = new StringBuilder("(");
            Iterator<? extends TypeDescription> it = this.parameterTypes.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescriptor());
            }
            return sb.append(')').append(this.returnType.getDescriptor()).toString();
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant
        public Object asConstantPoolValue() {
            StringBuilder sb = new StringBuilder("(");
            Iterator it = getParameterTypes().iterator();
            while (it.hasNext()) {
                sb.append(((TypeDescription) it.next()).getDescriptor());
            }
            return Type.getMethodType(sb.append(')').append(getReturnType().getDescriptor()).toString());
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant
        public TypeDescription getType() {
            return JavaType.METHOD_TYPE.getTypeStub();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodType)) {
                return false;
            }
            MethodType methodType = (MethodType) obj;
            return this.parameterTypes.equals(methodType.parameterTypes) && this.returnType.equals(methodType.returnType);
        }

        public int hashCode() {
            return (this.returnType.hashCode() * 31) + this.parameterTypes.hashCode();
        }

        protected interface Dispatcher {
            Class<?>[] parameterArray(Object obj);

            Class<?> returnType(Object obj);

            public enum CreationAction implements PrivilegedAction<Dispatcher> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Dispatcher run() {
                    try {
                        Class<?> load = JavaType.METHOD_TYPE.load();
                        return new ForJava7CapableVm(load.getMethod("returnType", new Class[0]), load.getMethod("parameterArray", new Class[0]));
                    } catch (Exception unused) {
                        return ForLegacyVm.INSTANCE;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJava7CapableVm implements Dispatcher {
                private static final Object[] NO_ARGUMENTS = new Object[0];
                private final Method parameterArray;
                private final Method returnType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForJava7CapableVm forJava7CapableVm = (ForJava7CapableVm) obj;
                    return this.returnType.equals(forJava7CapableVm.returnType) && this.parameterArray.equals(forJava7CapableVm.parameterArray);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.returnType.hashCode()) * 31) + this.parameterArray.hashCode();
                }

                protected ForJava7CapableVm(Method method, Method method2) {
                    this.returnType = method;
                    this.parameterArray = method2;
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodType.Dispatcher
                public Class<?> returnType(Object obj) {
                    try {
                        return (Class) this.returnType.invoke(obj, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodType#returnType", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodType#returnType", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodType.Dispatcher
                public Class<?>[] parameterArray(Object obj) {
                    try {
                        return (Class[]) this.parameterArray.invoke(obj, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodType#parameterArray", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodType#parameterArray", e2.getCause());
                    }
                }
            }

            public enum ForLegacyVm implements Dispatcher {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodType.Dispatcher
                public Class<?> returnType(Object obj) {
                    throw new IllegalStateException("Unsupported type for the current JVM: java.lang.invoke.MethodType");
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodType.Dispatcher
                public Class<?>[] parameterArray(Object obj) {
                    throw new IllegalStateException("Unsupported type for the current JVM: java.lang.invoke.MethodType");
                }
            }
        }
    }

    public static class MethodHandle implements JavaConstant {
        private static final Dispatcher.Initializable DISPATCHER = (Dispatcher.Initializable) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
        private final HandleType handleType;
        private final String name;
        private final TypeDescription ownerType;
        private final List<? extends TypeDescription> parameterTypes;
        private final TypeDescription returnType;

        protected MethodHandle(HandleType handleType, TypeDescription typeDescription, String str, TypeDescription typeDescription2, List<? extends TypeDescription> list) {
            this.handleType = handleType;
            this.ownerType = typeDescription;
            this.name = str;
            this.returnType = typeDescription2;
            this.parameterTypes = list;
        }

        public static MethodHandle ofLoaded(Object obj) {
            return ofLoaded(obj, DISPATCHER.publicLookup());
        }

        public static MethodHandle ofLoaded(Object obj, Object obj2) {
            if (!JavaType.METHOD_HANDLE.getTypeStub().isInstance(obj)) {
                throw new IllegalArgumentException("Expected method handle object: " + obj);
            }
            if (!JavaType.METHOD_HANDLES_LOOKUP.getTypeStub().isInstance(obj2)) {
                throw new IllegalArgumentException("Expected method handle lookup object: " + obj2);
            }
            Dispatcher initialize = DISPATCHER.initialize();
            Object reveal = initialize.reveal(obj2, obj);
            Object methodType = initialize.getMethodType(reveal);
            return new MethodHandle(HandleType.of(initialize.getReferenceKind(reveal)), TypeDescription.ForLoadedType.of(initialize.getDeclaringClass(reveal)), initialize.getName(reveal), TypeDescription.ForLoadedType.of(initialize.returnType(methodType)), new TypeList.ForLoadedTypes(initialize.parameterArray(methodType)));
        }

        public static MethodHandle of(Method method) {
            return of(new MethodDescription.ForLoadedMethod(method));
        }

        public static MethodHandle of(Constructor<?> constructor) {
            return of(new MethodDescription.ForLoadedConstructor(constructor));
        }

        public static MethodHandle of(MethodDescription.InDefinedShape inDefinedShape) {
            return new MethodHandle(HandleType.of(inDefinedShape), inDefinedShape.getDeclaringType().asErasure(), inDefinedShape.getInternalName(), inDefinedShape.getReturnType().asErasure(), inDefinedShape.getParameters().asTypeList().asErasures());
        }

        public static MethodHandle ofSpecial(Method method, Class<?> cls) {
            return ofSpecial(new MethodDescription.ForLoadedMethod(method), TypeDescription.ForLoadedType.of(cls));
        }

        public static MethodHandle ofSpecial(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription) {
            if (!inDefinedShape.isSpecializableFor(typeDescription)) {
                throw new IllegalArgumentException("Cannot specialize " + inDefinedShape + " for " + typeDescription);
            }
            return new MethodHandle(HandleType.ofSpecial(inDefinedShape), typeDescription, inDefinedShape.getInternalName(), inDefinedShape.getReturnType().asErasure(), inDefinedShape.getParameters().asTypeList().asErasures());
        }

        public static MethodHandle ofGetter(Field field) {
            return ofGetter(new FieldDescription.ForLoadedField(field));
        }

        public static MethodHandle ofGetter(FieldDescription.InDefinedShape inDefinedShape) {
            return new MethodHandle(HandleType.ofGetter(inDefinedShape), inDefinedShape.getDeclaringType().asErasure(), inDefinedShape.getInternalName(), inDefinedShape.getType().asErasure(), Collections.emptyList());
        }

        public static MethodHandle ofSetter(Field field) {
            return ofSetter(new FieldDescription.ForLoadedField(field));
        }

        public static MethodHandle ofSetter(FieldDescription.InDefinedShape inDefinedShape) {
            return new MethodHandle(HandleType.ofSetter(inDefinedShape), inDefinedShape.getDeclaringType().asErasure(), inDefinedShape.getInternalName(), TypeDescription.VOID, Collections.singletonList(inDefinedShape.getType().asErasure()));
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant
        public Object asConstantPoolValue() {
            StringBuilder sb = new StringBuilder("(");
            Iterator it = getParameterTypes().iterator();
            while (it.hasNext()) {
                sb.append(((TypeDescription) it.next()).getDescriptor());
            }
            return new Handle(getHandleType().getIdentifier(), getOwnerType().getInternalName(), getName(), sb.append(')').append(getReturnType().getDescriptor()).toString(), getOwnerType().isInterface());
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant
        public TypeDescription getType() {
            return JavaType.METHOD_HANDLE.getTypeStub();
        }

        public HandleType getHandleType() {
            return this.handleType;
        }

        public TypeDescription getOwnerType() {
            return this.ownerType;
        }

        public String getName() {
            return this.name;
        }

        public TypeDescription getReturnType() {
            return this.returnType;
        }

        public TypeList getParameterTypes() {
            return new TypeList.Explicit(this.parameterTypes);
        }

        public String getDescriptor() {
            StringBuilder sb = new StringBuilder("(");
            Iterator<? extends TypeDescription> it = this.parameterTypes.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescriptor());
            }
            return sb.append(')').append(this.returnType.getDescriptor()).toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodHandle)) {
                return false;
            }
            MethodHandle methodHandle = (MethodHandle) obj;
            return this.handleType == methodHandle.handleType && this.name.equals(methodHandle.name) && this.ownerType.equals(methodHandle.ownerType) && this.parameterTypes.equals(methodHandle.parameterTypes) && this.returnType.equals(methodHandle.returnType);
        }

        public int hashCode() {
            return (((((((this.handleType.hashCode() * 31) + this.ownerType.hashCode()) * 31) + this.name.hashCode()) * 31) + this.returnType.hashCode()) * 31) + this.parameterTypes.hashCode();
        }

        public static Class<?> lookupType(Object obj) {
            return DISPATCHER.lookupType(obj);
        }

        protected interface Dispatcher {

            public interface Initializable {
                Dispatcher initialize();

                Class<?> lookupType(Object obj);

                Object publicLookup();
            }

            Class<?> getDeclaringClass(Object obj);

            Object getMethodType(Object obj);

            String getName(Object obj);

            int getReferenceKind(Object obj);

            List<? extends Class<?>> parameterArray(Object obj);

            Class<?> returnType(Object obj);

            Object reveal(Object obj, Object obj2);

            public enum CreationAction implements PrivilegedAction<Initializable> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Initializable run() {
                    String str;
                    try {
                        str = "lookupClass";
                        try {
                            return new ForJava8CapableVm(Class.forName("java.lang.invoke.MethodHandles").getMethod("publicLookup", new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getMethod("getName", new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getMethod("getDeclaringClass", new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getMethod("getReferenceKind", new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getMethod("getMethodType", new Class[0]), JavaType.METHOD_TYPE.load().getMethod("returnType", new Class[0]), JavaType.METHOD_TYPE.load().getMethod("parameterArray", new Class[0]), JavaType.METHOD_HANDLES_LOOKUP.load().getMethod("lookupClass", new Class[0]), JavaType.METHOD_HANDLES_LOOKUP.load().getMethod("revealDirect", JavaType.METHOD_HANDLE.load()));
                        } catch (Exception unused) {
                            try {
                                return new ForJava7CapableVm(Class.forName("java.lang.invoke.MethodHandles").getMethod("publicLookup", new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getMethod("getName", new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getMethod("getDeclaringClass", new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getMethod("getReferenceKind", new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getMethod("getMethodType", new Class[0]), JavaType.METHOD_TYPE.load().getMethod("returnType", new Class[0]), JavaType.METHOD_TYPE.load().getMethod("parameterArray", new Class[0]), JavaType.METHOD_HANDLES_LOOKUP.load().getMethod(str, new Class[0]), Class.forName("java.lang.invoke.MethodHandleInfo").getConstructor(JavaType.METHOD_HANDLE.load()));
                            } catch (Exception unused2) {
                                return ForLegacyVm.INSTANCE;
                            }
                        }
                    } catch (Exception unused3) {
                        str = "lookupClass";
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class AbstractBase implements Dispatcher, Initializable {
                private static final Object[] NO_ARGUMENTS = new Object[0];
                protected final Method getDeclaringClass;
                protected final Method getMethodType;
                protected final Method getName;
                protected final Method getReferenceKind;
                protected final Method lookupClass;
                protected final Method parameterArray;
                protected final Method publicLookup;
                protected final Method returnType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AbstractBase abstractBase = (AbstractBase) obj;
                    return this.publicLookup.equals(abstractBase.publicLookup) && this.getName.equals(abstractBase.getName) && this.getDeclaringClass.equals(abstractBase.getDeclaringClass) && this.getReferenceKind.equals(abstractBase.getReferenceKind) && this.getMethodType.equals(abstractBase.getMethodType) && this.returnType.equals(abstractBase.returnType) && this.parameterArray.equals(abstractBase.parameterArray) && this.lookupClass.equals(abstractBase.lookupClass);
                }

                public int hashCode() {
                    return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.publicLookup.hashCode()) * 31) + this.getName.hashCode()) * 31) + this.getDeclaringClass.hashCode()) * 31) + this.getReferenceKind.hashCode()) * 31) + this.getMethodType.hashCode()) * 31) + this.returnType.hashCode()) * 31) + this.parameterArray.hashCode()) * 31) + this.lookupClass.hashCode();
                }

                protected AbstractBase(Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8) {
                    this.publicLookup = method;
                    this.getName = method2;
                    this.getDeclaringClass = method3;
                    this.getReferenceKind = method4;
                    this.getMethodType = method5;
                    this.returnType = method6;
                    this.parameterArray = method7;
                    this.lookupClass = method8;
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.Initializable
                public Object publicLookup() {
                    try {
                        return this.publicLookup.invoke(null, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandles#publicLookup", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandles#publicLookup", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher
                public Object getMethodType(Object obj) {
                    try {
                        return this.getMethodType.invoke(obj, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandleInfo#getMethodType", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandleInfo#getMethodType", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher
                public int getReferenceKind(Object obj) {
                    try {
                        return ((Integer) this.getReferenceKind.invoke(obj, NO_ARGUMENTS)).intValue();
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandleInfo#getReferenceKind", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandleInfo#getReferenceKind", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher
                public Class<?> getDeclaringClass(Object obj) {
                    try {
                        return (Class) this.getDeclaringClass.invoke(obj, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandleInfo#getDeclaringClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandleInfo#getDeclaringClass", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher
                public String getName(Object obj) {
                    try {
                        return (String) this.getName.invoke(obj, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandleInfo#getName", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandleInfo#getName", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher
                public Class<?> returnType(Object obj) {
                    try {
                        return (Class) this.returnType.invoke(obj, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodType#returnType", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.MethodType#returnType", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher
                public List<? extends Class<?>> parameterArray(Object obj) {
                    try {
                        return Arrays.asList((Class[]) this.parameterArray.invoke(obj, NO_ARGUMENTS));
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.MethodType#parameterArray", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.MethodType#parameterArray", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.Initializable
                public Class<?> lookupType(Object obj) {
                    try {
                        return (Class) this.lookupClass.invoke(obj, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.MethodHandles.Lookup#lookupClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.MethodHandles.Lookup#lookupClass", e2.getCause());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJava8CapableVm extends AbstractBase {
                private final Method revealDirect;

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.AbstractBase
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.revealDirect.equals(((ForJava8CapableVm) obj).revealDirect);
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.AbstractBase
                public int hashCode() {
                    return (super.hashCode() * 31) + this.revealDirect.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.Initializable
                public Dispatcher initialize() {
                    return this;
                }

                protected ForJava8CapableVm(Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9) {
                    super(method, method2, method3, method4, method5, method6, method7, method8);
                    this.revealDirect = method9;
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher
                public Object reveal(Object obj, Object obj2) {
                    try {
                        return this.revealDirect.invoke(obj, obj2);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandles.Lookup#revealDirect", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandles.Lookup#revealDirect", e2.getCause());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJava7CapableVm extends AbstractBase implements PrivilegedAction<Dispatcher> {
                private final Constructor<?> methodInfo;

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.AbstractBase
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.methodInfo.equals(((ForJava7CapableVm) obj).methodInfo);
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.AbstractBase
                public int hashCode() {
                    return (super.hashCode() * 31) + this.methodInfo.hashCode();
                }

                protected ForJava7CapableVm(Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Constructor<?> constructor) {
                    super(method, method2, method3, method4, method5, method6, method7, method8);
                    this.methodInfo = constructor;
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.Initializable
                public Dispatcher initialize() {
                    return (Dispatcher) AccessController.doPrivileged(this);
                }

                @Override // java.security.PrivilegedAction
                public Dispatcher run() {
                    this.methodInfo.setAccessible(true);
                    this.getName.setAccessible(true);
                    this.getDeclaringClass.setAccessible(true);
                    this.getReferenceKind.setAccessible(true);
                    this.getMethodType.setAccessible(true);
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher
                public Object reveal(Object obj, Object obj2) {
                    try {
                        return this.methodInfo.newInstance(obj2);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodInfo()", e);
                    } catch (InstantiationException e2) {
                        throw new IllegalStateException("Error constructing java.lang.invoke.MethodInfo", e2);
                    } catch (InvocationTargetException e3) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodInfo()", e3.getCause());
                    }
                }
            }

            public enum ForLegacyVm implements Initializable {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.Initializable
                public Dispatcher initialize() {
                    throw new IllegalStateException("Unsupported type on current JVM: java.lang.invoke.MethodHandle");
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.Initializable
                public Object publicLookup() {
                    throw new IllegalStateException("Unsupported type on current JVM: java.lang.invoke.MethodHandle");
                }

                @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant.MethodHandle.Dispatcher.Initializable
                public Class<?> lookupType(Object obj) {
                    throw new IllegalStateException("Unsupported type on current JVM: java.lang.invoke.MethodHandle");
                }
            }
        }

        public enum HandleType {
            INVOKE_VIRTUAL(5),
            INVOKE_STATIC(6),
            INVOKE_SPECIAL(7),
            INVOKE_INTERFACE(9),
            INVOKE_SPECIAL_CONSTRUCTOR(8),
            PUT_FIELD(3),
            GET_FIELD(1),
            PUT_STATIC_FIELD(4),
            GET_STATIC_FIELD(2);

            private final int identifier;

            HandleType(int i) {
                this.identifier = i;
            }

            protected static HandleType of(MethodDescription.InDefinedShape inDefinedShape) {
                if (inDefinedShape.isStatic()) {
                    return INVOKE_STATIC;
                }
                if (inDefinedShape.isPrivate()) {
                    return INVOKE_SPECIAL;
                }
                if (inDefinedShape.isConstructor()) {
                    return INVOKE_SPECIAL_CONSTRUCTOR;
                }
                if (inDefinedShape.getDeclaringType().isInterface()) {
                    return INVOKE_INTERFACE;
                }
                return INVOKE_VIRTUAL;
            }

            protected static HandleType of(int i) {
                for (HandleType handleType : values()) {
                    if (handleType.getIdentifier() == i) {
                        return handleType;
                    }
                }
                throw new IllegalArgumentException("Unknown handle type: " + i);
            }

            protected static HandleType ofSpecial(MethodDescription.InDefinedShape inDefinedShape) {
                if (inDefinedShape.isStatic() || inDefinedShape.isAbstract()) {
                    throw new IllegalArgumentException("Cannot invoke " + inDefinedShape + " via invokespecial");
                }
                return inDefinedShape.isConstructor() ? INVOKE_SPECIAL_CONSTRUCTOR : INVOKE_SPECIAL;
            }

            protected static HandleType ofGetter(FieldDescription.InDefinedShape inDefinedShape) {
                return inDefinedShape.isStatic() ? GET_STATIC_FIELD : GET_FIELD;
            }

            protected static HandleType ofSetter(FieldDescription.InDefinedShape inDefinedShape) {
                return inDefinedShape.isStatic() ? PUT_STATIC_FIELD : PUT_FIELD;
            }

            public int getIdentifier() {
                return this.identifier;
            }
        }
    }

    public static class Dynamic implements JavaConstant {
        private static final String CONSTANT_BOOTSTRAPS = "java/lang/invoke/ConstantBootstraps";
        private final TypeDescription typeDescription;
        private final ConstantDynamic value;

        protected Dynamic(ConstantDynamic constantDynamic, TypeDescription typeDescription) {
            this.value = constantDynamic;
            this.typeDescription = typeDescription;
        }

        public static Dynamic ofNullConstant() {
            return new Dynamic(new ConstantDynamic("nullConstant", TypeDescription.OBJECT.getDescriptor(), new Handle(6, CONSTANT_BOOTSTRAPS, "nullConstant", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false), new Object[0]), TypeDescription.OBJECT);
        }

        public static JavaConstant ofPrimitiveType(Class<?> cls) {
            return ofPrimitiveType(TypeDescription.ForLoadedType.of(cls));
        }

        public static JavaConstant ofPrimitiveType(TypeDescription typeDescription) {
            if (!typeDescription.isPrimitive()) {
                throw new IllegalArgumentException("Not a primitive type: " + typeDescription);
            }
            return new Dynamic(new ConstantDynamic(typeDescription.getDescriptor(), TypeDescription.CLASS.getDescriptor(), new Handle(6, CONSTANT_BOOTSTRAPS, "primitiveClass", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;", false), new Object[0]), TypeDescription.CLASS);
        }

        public static JavaConstant ofEnumeration(Enum<?> r1) {
            return ofEnumeration(new EnumerationDescription.ForLoadedEnumeration(r1));
        }

        public static JavaConstant ofEnumeration(EnumerationDescription enumerationDescription) {
            return new Dynamic(new ConstantDynamic(enumerationDescription.getValue(), enumerationDescription.getEnumerationType().getDescriptor(), new Handle(6, CONSTANT_BOOTSTRAPS, "enumConstant", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;", false), new Object[0]), enumerationDescription.getEnumerationType());
        }

        public static Dynamic ofField(Field field) {
            return ofField(new FieldDescription.ForLoadedField(field));
        }

        public static Dynamic ofField(FieldDescription.InDefinedShape inDefinedShape) {
            boolean equals;
            if (!inDefinedShape.isStatic() || !inDefinedShape.isFinal()) {
                throw new IllegalArgumentException("Field must be static and final: " + inDefinedShape);
            }
            if (inDefinedShape.getType().isPrimitive()) {
                equals = inDefinedShape.getType().asErasure().asBoxed().equals(inDefinedShape.getType().asErasure());
            } else {
                equals = inDefinedShape.getDeclaringType().equals(inDefinedShape.getType().asErasure());
            }
            return new Dynamic(new ConstantDynamic(inDefinedShape.getInternalName(), inDefinedShape.getDescriptor(), new Handle(6, CONSTANT_BOOTSTRAPS, "getStaticFinal", equals ? "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;" : "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;", false), equals ? new Object[0] : new Object[]{Type.getType(inDefinedShape.getDeclaringType().getDescriptor())}), inDefinedShape.getType().asErasure());
        }

        public static Dynamic ofInvocation(Method method, Object... objArr) {
            return ofInvocation(method, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic ofInvocation(Method method, List<?> list) {
            return ofInvocation(new MethodDescription.ForLoadedMethod(method), list);
        }

        public static Dynamic ofInvocation(Constructor<?> constructor, Object... objArr) {
            return ofInvocation(constructor, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic ofInvocation(Constructor<?> constructor, List<?> list) {
            return ofInvocation(new MethodDescription.ForLoadedConstructor(constructor), list);
        }

        public static Dynamic ofInvocation(MethodDescription.InDefinedShape inDefinedShape, Object... objArr) {
            return ofInvocation(inDefinedShape, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic ofInvocation(MethodDescription.InDefinedShape inDefinedShape, List<?> list) {
            List asErasures;
            TypeDescription asErasure;
            TypeDescription of;
            if (!inDefinedShape.isConstructor() && inDefinedShape.getReturnType().represents(Void.TYPE)) {
                throw new IllegalArgumentException("Bootstrap method is no constructor or non-void static factory: " + inDefinedShape);
            }
            int i = 1;
            if (inDefinedShape.getParameters().size() + ((inDefinedShape.isStatic() || inDefinedShape.isConstructor()) ? 0 : 1) != list.size()) {
                throw new IllegalArgumentException("Cannot assign " + list + " to " + inDefinedShape);
            }
            if (inDefinedShape.isStatic() || inDefinedShape.isConstructor()) {
                asErasures = inDefinedShape.getParameters().asTypeList().asErasures();
            } else {
                asErasures = CompoundList.of(inDefinedShape.getDeclaringType(), inDefinedShape.getParameters().asTypeList().asErasures());
            }
            Iterator it = asErasures.iterator();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it2 = list.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next == null) {
                    next = ofNullConstant();
                } else if (next instanceof Class) {
                    Class cls = (Class) next;
                    if (cls.isPrimitive()) {
                        next = ofPrimitiveType((Class<?>) cls);
                    } else {
                        next = TypeDescription.ForLoadedType.of(cls);
                    }
                } else {
                    if (next instanceof TypeDescription) {
                        TypeDescription typeDescription = (TypeDescription) next;
                        if (typeDescription.isPrimitive()) {
                            next = ofPrimitiveType(typeDescription);
                        }
                    }
                    if (JavaType.METHOD_HANDLE.getTypeStub().isInstance(next)) {
                        next = MethodHandle.ofLoaded(next);
                    } else if (JavaType.METHOD_TYPE.getTypeStub().isInstance(next)) {
                        next = MethodType.ofLoaded(next);
                    }
                }
                if (next instanceof JavaConstant) {
                    of = ((JavaConstant) next).getType();
                } else if (next instanceof TypeDescription) {
                    of = TypeDescription.CLASS;
                } else {
                    of = TypeDescription.ForLoadedType.of(next.getClass());
                }
                if (!of.asBoxed().isAssignableTo(((TypeDescription) it.next()).asBoxed())) {
                    throw new IllegalArgumentException("Cannot assign argument of type " + of + " to " + inDefinedShape);
                }
                arrayList.add(next);
            }
            Object[] objArr = new Object[arrayList.size() + 1];
            objArr[0] = new Handle(inDefinedShape.isConstructor() ? 8 : 6, inDefinedShape.getDeclaringType().getInternalName(), inDefinedShape.getInternalName(), inDefinedShape.getDescriptor(), false);
            for (Object obj : arrayList) {
                if (obj instanceof TypeDescription) {
                    obj = Type.getType(((TypeDescription) obj).getDescriptor());
                } else if (obj instanceof JavaConstant) {
                    obj = ((JavaConstant) obj).asConstantPoolValue();
                }
                objArr[i] = obj;
                i++;
            }
            if (inDefinedShape.isConstructor()) {
                asErasure = inDefinedShape.getDeclaringType();
            } else {
                asErasure = inDefinedShape.getReturnType().asErasure();
            }
            return new Dynamic(new ConstantDynamic("invoke", asErasure.getDescriptor(), new Handle(6, CONSTANT_BOOTSTRAPS, "invoke", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/invoke/MethodHandle;[Ljava/lang/Object;)Ljava/lang/Object;", false), objArr), inDefinedShape.isConstructor() ? inDefinedShape.getDeclaringType() : inDefinedShape.getReturnType().asErasure());
        }

        public static JavaConstant ofVarHandle(Field field) {
            return ofVarHandle(new FieldDescription.ForLoadedField(field));
        }

        public static JavaConstant ofVarHandle(FieldDescription.InDefinedShape inDefinedShape) {
            return new Dynamic(new ConstantDynamic(inDefinedShape.getInternalName(), JavaType.VAR_HANDLE.getTypeStub().getDescriptor(), new Handle(6, CONSTANT_BOOTSTRAPS, inDefinedShape.isStatic() ? "staticFieldVarHandle" : "fieldVarHandle", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/VarHandle;", false), Type.getType(inDefinedShape.getDeclaringType().getDescriptor()), Type.getType(inDefinedShape.getType().asErasure().getDescriptor())), JavaType.VAR_HANDLE.getTypeStub());
        }

        public static JavaConstant ofArrayVarHandle(Class<?> cls) {
            return ofArrayVarHandle(TypeDescription.ForLoadedType.of(cls));
        }

        public static JavaConstant ofArrayVarHandle(TypeDescription typeDescription) {
            if (!typeDescription.isArray()) {
                throw new IllegalArgumentException("Not an array type: " + typeDescription);
            }
            return new Dynamic(new ConstantDynamic("arrayVarHandle", JavaType.VAR_HANDLE.getTypeStub().getDescriptor(), new Handle(6, CONSTANT_BOOTSTRAPS, "arrayVarHandle", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/VarHandle;", false), Type.getType(typeDescription.getDescriptor())), JavaType.VAR_HANDLE.getTypeStub());
        }

        public static Dynamic bootstrap(String str, Method method, Object... objArr) {
            return bootstrap(str, method, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic bootstrap(String str, Method method, List<?> list) {
            return bootstrap(str, new MethodDescription.ForLoadedMethod(method), list);
        }

        public static Dynamic bootstrap(String str, Constructor<?> constructor, Object... objArr) {
            return bootstrap(str, constructor, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic bootstrap(String str, Constructor<?> constructor, List<?> list) {
            return bootstrap(str, new MethodDescription.ForLoadedConstructor(constructor), list);
        }

        public static Dynamic bootstrap(String str, MethodDescription.InDefinedShape inDefinedShape, Object... objArr) {
            return bootstrap(str, inDefinedShape, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic bootstrap(String str, MethodDescription.InDefinedShape inDefinedShape, List<?> list) {
            TypeDescription asErasure;
            TypeDescription asErasure2;
            if (str.isEmpty() || str.contains(".")) {
                throw new IllegalArgumentException("Not a valid field name: " + str);
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj == null) {
                    obj = ofNullConstant();
                } else if (obj instanceof Class) {
                    Class cls = (Class) obj;
                    if (cls.isPrimitive()) {
                        obj = ofPrimitiveType((Class<?>) cls);
                    } else {
                        obj = TypeDescription.ForLoadedType.of(cls);
                    }
                } else {
                    if (obj instanceof TypeDescription) {
                        TypeDescription typeDescription = (TypeDescription) obj;
                        if (typeDescription.isPrimitive()) {
                            obj = ofPrimitiveType(typeDescription);
                        }
                    }
                    if (JavaType.METHOD_HANDLE.getTypeStub().isInstance(obj)) {
                        obj = MethodHandle.ofLoaded(obj);
                    } else if (JavaType.METHOD_TYPE.getTypeStub().isInstance(obj)) {
                        obj = MethodType.ofLoaded(obj);
                    }
                }
                arrayList.add(obj);
            }
            if (!inDefinedShape.isConstantBootstrap(arrayList)) {
                throw new IllegalArgumentException("Not a valid bootstrap method " + inDefinedShape + " for " + arrayList);
            }
            Object[] objArr = new Object[arrayList.size()];
            int i = 0;
            for (Object obj2 : arrayList) {
                if (obj2 instanceof TypeDescription) {
                    obj2 = Type.getType(((TypeDescription) obj2).getDescriptor());
                } else if (obj2 instanceof JavaConstant) {
                    obj2 = ((JavaConstant) obj2).asConstantPoolValue();
                }
                objArr[i] = obj2;
                i++;
            }
            if (inDefinedShape.isConstructor()) {
                asErasure = inDefinedShape.getDeclaringType();
            } else {
                asErasure = inDefinedShape.getReturnType().asErasure();
            }
            ConstantDynamic constantDynamic = new ConstantDynamic(str, asErasure.getDescriptor(), new Handle(inDefinedShape.isConstructor() ? 8 : 6, inDefinedShape.getDeclaringType().getInternalName(), inDefinedShape.getInternalName(), inDefinedShape.getDescriptor(), false), objArr);
            if (inDefinedShape.isConstructor()) {
                asErasure2 = inDefinedShape.getDeclaringType();
            } else {
                asErasure2 = inDefinedShape.getReturnType().asErasure();
            }
            return new Dynamic(constantDynamic, asErasure2);
        }

        public JavaConstant withType(Class<?> cls) {
            return withType(TypeDescription.ForLoadedType.of(cls));
        }

        public JavaConstant withType(TypeDescription typeDescription) {
            if (typeDescription.represents(Void.TYPE)) {
                throw new IllegalArgumentException("Constant value cannot represent void");
            }
            if (!this.value.getBootstrapMethod().getName().equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME) ? !typeDescription.asBoxed().isInHierarchyWith(this.typeDescription.asBoxed()) : !this.typeDescription.isAssignableTo(typeDescription)) {
                throw new IllegalArgumentException(typeDescription + " is not compatible with bootstrapped type " + this.typeDescription);
            }
            return new Dynamic(new ConstantDynamic(this.value.getName(), typeDescription.getDescriptor(), this.value.getBootstrapMethod(), this.value.getBootstrapMethodArguments()), typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant
        public Object asConstantPoolValue() {
            return this.value;
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.JavaConstant
        public TypeDescription getType() {
            return this.typeDescription;
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + this.typeDescription.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Dynamic dynamic = (Dynamic) obj;
            return this.value.equals(dynamic.value) && this.typeDescription.equals(dynamic.typeDescription);
        }
    }
}
