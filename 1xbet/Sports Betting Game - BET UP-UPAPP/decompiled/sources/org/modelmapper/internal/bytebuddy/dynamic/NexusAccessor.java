package org.modelmapper.internal.bytebuddy.dynamic;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Collections;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Removal;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.ClassConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.NullConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class NexusAccessor {
    private static final Dispatcher DISPATCHER = (Dispatcher) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);

    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final ReferenceQueue<? super ClassLoader> referenceQueue;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[RETURN] */
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
        ReferenceQueue<? super ClassLoader> referenceQueue = this.referenceQueue;
        ReferenceQueue<? super ClassLoader> referenceQueue2 = ((NexusAccessor) obj).referenceQueue;
        if (referenceQueue2 != null) {
            return referenceQueue != null && referenceQueue.equals(referenceQueue2);
        }
        if (referenceQueue != null) {
            return false;
        }
    }

    public int hashCode() {
        ReferenceQueue<? super ClassLoader> referenceQueue = this.referenceQueue;
        return referenceQueue != null ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE + referenceQueue.hashCode() : IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public NexusAccessor() {
        this(Nexus.NO_QUEUE);
    }

    public NexusAccessor(ReferenceQueue<? super ClassLoader> referenceQueue) {
        this.referenceQueue = referenceQueue;
    }

    public static boolean isAlive() {
        return DISPATCHER.isAlive();
    }

    public static void clean(Reference<? extends ClassLoader> reference) {
        DISPATCHER.clean(reference);
    }

    public void register(String str, ClassLoader classLoader, int i, LoadedTypeInitializer loadedTypeInitializer) {
        if (loadedTypeInitializer.isAlive()) {
            DISPATCHER.register(str, classLoader, this.referenceQueue, i, loadedTypeInitializer);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class InitializationAppender implements ByteCodeAppender {
        private final int identification;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.identification == ((InitializationAppender) obj).identification;
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.identification;
        }

        public InitializationAppender(int i) {
            this.identification = i;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            try {
                StackManipulation[] stackManipulationArr = new StackManipulation[1];
                StackManipulation[] stackManipulationArr2 = new StackManipulation[10];
                stackManipulationArr2[0] = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(ClassLoader.class.getMethod("getSystemClassLoader", new Class[0])));
                stackManipulationArr2[1] = new TextConstant(Nexus.class.getName());
                stackManipulationArr2[2] = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(ClassLoader.class.getMethod("loadClass", String.class)));
                stackManipulationArr2[3] = new TextConstant("initialize");
                stackManipulationArr2[4] = ArrayFactory.forType(TypeDescription.Generic.CLASS).withValues(Arrays.asList(ClassConstant.of(TypeDescription.CLASS), ClassConstant.of(TypeDescription.ForLoadedType.of(Integer.TYPE))));
                stackManipulationArr2[5] = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(Class.class.getMethod("getMethod", String.class, Class[].class)));
                stackManipulationArr2[6] = NullConstant.INSTANCE;
                ArrayFactory forType = ArrayFactory.forType(TypeDescription.Generic.OBJECT);
                StackManipulation[] stackManipulationArr3 = new StackManipulation[2];
                stackManipulationArr3[0] = ClassConstant.of(methodDescription.getDeclaringType().asErasure());
                StackManipulation[] stackManipulationArr4 = new StackManipulation[2];
                try {
                    stackManipulationArr4[0] = IntegerConstant.forValue(this.identification);
                    stackManipulationArr4[1] = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(Integer.class.getMethod("valueOf", Integer.TYPE)));
                    stackManipulationArr3[1] = new StackManipulation.Compound(stackManipulationArr4);
                    stackManipulationArr2[7] = forType.withValues(Arrays.asList(stackManipulationArr3));
                    stackManipulationArr2[8] = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(Method.class.getMethod("invoke", Object.class, Object[].class)));
                    stackManipulationArr2[9] = Removal.SINGLE;
                    stackManipulationArr[0] = new StackManipulation.Compound(stackManipulationArr2);
                    return new ByteCodeAppender.Simple(stackManipulationArr).apply(methodVisitor, context, methodDescription);
                } catch (NoSuchMethodException e) {
                    e = e;
                    throw new IllegalStateException("Cannot locate method", e);
                }
            } catch (NoSuchMethodException e2) {
                e = e2;
            }
        }
    }

    protected interface Dispatcher {
        void clean(Reference<? extends ClassLoader> reference);

        boolean isAlive();

        void register(String str, ClassLoader classLoader, ReferenceQueue<? super ClassLoader> referenceQueue, int i, LoadedTypeInitializer loadedTypeInitializer);

        public enum CreationAction implements PrivilegedAction<Dispatcher> {
            INSTANCE;

            @Override // java.security.PrivilegedAction
            public Dispatcher run() {
                if (Boolean.getBoolean(Nexus.PROPERTY)) {
                    return new Unavailable("Nexus injection was explicitly disabled");
                }
                try {
                    Class<?> cls = new ClassInjector.UsingReflection(ClassLoader.getSystemClassLoader(), ClassLoadingStrategy.NO_PROTECTION_DOMAIN).inject(Collections.singletonMap(TypeDescription.ForLoadedType.of(Nexus.class), ClassFileLocator.ForClassLoader.read(Nexus.class).resolve())).get(TypeDescription.ForLoadedType.of(Nexus.class));
                    return new Available(cls.getMethod("register", String.class, ClassLoader.class, ReferenceQueue.class, Integer.TYPE, Object.class), cls.getMethod("clean", Reference.class));
                } catch (Exception e) {
                    try {
                        Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass(Nexus.class.getName());
                        return new Available(loadClass.getMethod("register", String.class, ClassLoader.class, ReferenceQueue.class, Integer.TYPE, Object.class), loadClass.getMethod("clean", Reference.class));
                    } catch (Exception unused) {
                        return new Unavailable(e.toString());
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Available implements Dispatcher {
            private static final Object STATIC_METHOD = null;
            private final Method clean;
            private final Method register;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Available available = (Available) obj;
                return this.register.equals(available.register) && this.clean.equals(available.clean);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.register.hashCode()) * 31) + this.clean.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public boolean isAlive() {
                return true;
            }

            protected Available(Method method, Method method2) {
                this.register = method;
                this.clean = method2;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void clean(Reference<? extends ClassLoader> reference) {
                try {
                    this.clean.invoke(STATIC_METHOD, reference);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access: " + this.clean, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke: " + this.clean, e2.getCause());
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void register(String str, ClassLoader classLoader, ReferenceQueue<? super ClassLoader> referenceQueue, int i, LoadedTypeInitializer loadedTypeInitializer) {
                try {
                    this.register.invoke(STATIC_METHOD, str, classLoader, referenceQueue, Integer.valueOf(i), loadedTypeInitializer);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access: " + this.register, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke: " + this.register, e2.getCause());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Unavailable implements Dispatcher {
            private final String message;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.message.equals(((Unavailable) obj).message);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.message.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public boolean isAlive() {
                return false;
            }

            protected Unavailable(String str) {
                this.message = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void clean(Reference<? extends ClassLoader> reference) {
                throw new IllegalStateException("Could not initialize Nexus accessor: " + this.message);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void register(String str, ClassLoader classLoader, ReferenceQueue<? super ClassLoader> referenceQueue, int i, LoadedTypeInitializer loadedTypeInitializer) {
                throw new IllegalStateException("Could not initialize Nexus accessor: " + this.message);
            }
        }
    }
}
