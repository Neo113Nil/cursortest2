package org.modelmapper.internal.bytebuddy.utility;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.NamedElement;

/* loaded from: classes4.dex */
public class JavaModule implements NamedElement.WithOptionalName {
    private static final Dispatcher DISPATCHER = (Dispatcher) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
    public static final JavaModule UNSUPPORTED = null;
    private final Object module;

    protected JavaModule(Object obj) {
        this.module = obj;
    }

    public static JavaModule ofType(Class<?> cls) {
        return DISPATCHER.moduleOf(cls);
    }

    public static JavaModule of(Object obj) {
        if (!JavaType.MODULE.getTypeStub().isInstance(obj)) {
            throw new IllegalArgumentException("Not a Java module: " + obj);
        }
        return new JavaModule(obj);
    }

    public static boolean isSupported() {
        return DISPATCHER.isAlive();
    }

    @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithOptionalName
    public boolean isNamed() {
        return DISPATCHER.isNamed(this.module);
    }

    @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
    public String getActualName() {
        return DISPATCHER.getName(this.module);
    }

    public InputStream getResourceAsStream(String str) {
        return DISPATCHER.getResourceAsStream(this.module, str);
    }

    public ClassLoader getClassLoader() {
        return DISPATCHER.getClassLoader(this.module);
    }

    public Object unwrap() {
        return this.module;
    }

    public boolean canRead(JavaModule javaModule) {
        return DISPATCHER.canRead(this.module, javaModule.unwrap());
    }

    public void addReads(Instrumentation instrumentation, JavaModule javaModule) {
        DISPATCHER.addReads(instrumentation, this.module, javaModule.unwrap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JavaModule) {
            return this.module.equals(((JavaModule) obj).module);
        }
        return false;
    }

    public int hashCode() {
        return this.module.hashCode();
    }

    public String toString() {
        return this.module.toString();
    }

    protected interface Dispatcher {
        void addReads(Instrumentation instrumentation, Object obj, Object obj2);

        boolean canRead(Object obj, Object obj2);

        ClassLoader getClassLoader(Object obj);

        String getName(Object obj);

        InputStream getResourceAsStream(Object obj, String str);

        boolean isAlive();

        boolean isNamed(Object obj);

        JavaModule moduleOf(Class<?> cls);

        public enum CreationAction implements PrivilegedAction<Dispatcher> {
            INSTANCE;

            @Override // java.security.PrivilegedAction
            public Dispatcher run() {
                try {
                    Class<?> cls = Class.forName("java.lang.Module");
                    return new Enabled(Class.class.getMethod("getModule", new Class[0]), cls.getMethod("getClassLoader", new Class[0]), cls.getMethod("isNamed", new Class[0]), cls.getMethod("getName", new Class[0]), cls.getMethod("getResourceAsStream", String.class), cls.getMethod("canRead", cls), Instrumentation.class.getMethod("isModifiableModule", cls), Instrumentation.class.getMethod("redefineModule", cls, Set.class, Map.class, Map.class, Set.class, Map.class));
                } catch (Exception unused) {
                    return Disabled.INSTANCE;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Enabled implements Dispatcher {
            private static final Object[] NO_ARGUMENTS = new Object[0];
            private final Method canRead;
            private final Method getClassLoader;
            private final Method getModule;
            private final Method getName;
            private final Method getResourceAsStream;
            private final Method isModifiableModule;
            private final Method isNamed;
            private final Method redefineModule;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Enabled enabled = (Enabled) obj;
                return this.getModule.equals(enabled.getModule) && this.getClassLoader.equals(enabled.getClassLoader) && this.isNamed.equals(enabled.isNamed) && this.getName.equals(enabled.getName) && this.getResourceAsStream.equals(enabled.getResourceAsStream) && this.canRead.equals(enabled.canRead) && this.isModifiableModule.equals(enabled.isModifiableModule) && this.redefineModule.equals(enabled.redefineModule);
            }

            public int hashCode() {
                return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.getModule.hashCode()) * 31) + this.getClassLoader.hashCode()) * 31) + this.isNamed.hashCode()) * 31) + this.getName.hashCode()) * 31) + this.getResourceAsStream.hashCode()) * 31) + this.canRead.hashCode()) * 31) + this.isModifiableModule.hashCode()) * 31) + this.redefineModule.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public boolean isAlive() {
                return true;
            }

            protected Enabled(Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8) {
                this.getModule = method;
                this.getClassLoader = method2;
                this.isNamed = method3;
                this.getName = method4;
                this.getResourceAsStream = method5;
                this.canRead = method6;
                this.isModifiableModule = method7;
                this.redefineModule = method8;
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public JavaModule moduleOf(Class<?> cls) {
                try {
                    return new JavaModule(this.getModule.invoke(cls, NO_ARGUMENTS));
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access " + this.getModule, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke " + this.getModule, e2.getCause());
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public InputStream getResourceAsStream(Object obj, String str) {
                try {
                    return (InputStream) this.getResourceAsStream.invoke(obj, str);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access " + this.getResourceAsStream, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke " + this.getResourceAsStream, e2.getCause());
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public ClassLoader getClassLoader(Object obj) {
                try {
                    return (ClassLoader) this.getClassLoader.invoke(obj, NO_ARGUMENTS);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access " + this.getClassLoader, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke " + this.getClassLoader, e2.getCause());
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public boolean isNamed(Object obj) {
                try {
                    return ((Boolean) this.isNamed.invoke(obj, NO_ARGUMENTS)).booleanValue();
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access " + this.isNamed, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke " + this.isNamed, e2.getCause());
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public String getName(Object obj) {
                try {
                    return (String) this.getName.invoke(obj, NO_ARGUMENTS);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access " + this.getName, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke " + this.getName, e2.getCause());
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public boolean canRead(Object obj, Object obj2) {
                try {
                    return ((Boolean) this.canRead.invoke(obj, obj2)).booleanValue();
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access " + this.canRead, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke " + this.canRead, e2.getCause());
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public void addReads(Instrumentation instrumentation, Object obj, Object obj2) {
                try {
                    if (!((Boolean) this.isModifiableModule.invoke(instrumentation, obj)).booleanValue()) {
                        throw new IllegalStateException(obj + " is not modifiable");
                    }
                    try {
                        this.redefineModule.invoke(instrumentation, obj, Collections.singleton(obj2), Collections.emptyMap(), Collections.emptyMap(), Collections.emptySet(), Collections.emptyMap());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access " + this.redefineModule, e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Cannot invoke " + this.redefineModule, e2.getCause());
                    }
                } catch (IllegalAccessException e3) {
                    throw new IllegalStateException("Cannot access " + this.redefineModule, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException("Cannot invoke " + this.redefineModule, e4.getCause());
                }
            }
        }

        public enum Disabled implements Dispatcher {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public boolean isAlive() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public JavaModule moduleOf(Class<?> cls) {
                return JavaModule.UNSUPPORTED;
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public ClassLoader getClassLoader(Object obj) {
                throw new IllegalStateException("Current VM does not support modules");
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public boolean isNamed(Object obj) {
                throw new IllegalStateException("Current VM does not support modules");
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public String getName(Object obj) {
                throw new IllegalStateException("Current VM does not support modules");
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public InputStream getResourceAsStream(Object obj, String str) {
                throw new IllegalStateException("Current VM does not support modules");
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public boolean canRead(Object obj, Object obj2) {
                throw new IllegalStateException("Current VM does not support modules");
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.JavaModule.Dispatcher
            public void addReads(Instrumentation instrumentation, Object obj, Object obj2) {
                throw new IllegalStateException("Current VM does not support modules");
            }
        }
    }
}
