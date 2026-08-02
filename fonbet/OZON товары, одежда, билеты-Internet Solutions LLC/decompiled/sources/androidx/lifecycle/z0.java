package androidx.lifecycle;

import android.app.Application;
import ed.C6345a;
import f3.AbstractC6409a;
import f3.C6414f;
import h3.C6789b;
import h3.C6790c;
import h3.C6792e;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6414f f43416a;

    public static class c implements b {

        @NotNull
        public static final a Companion = new a();

        @NotNull
        public static final AbstractC6409a.b<String> VIEW_MODEL_KEY = C6792e.f64740a;
        private static c _instance;

        public static final class a {
        }

        @Override // androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) C6790c.a(modelClass);
        }

        @Override // androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull Class<T> modelClass, @NotNull AbstractC6409a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull kotlin.reflect.d<T> modelClass, @NotNull AbstractC6409a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(C6345a.b(modelClass), extras);
        }
    }

    public static class d {
        public void a(@NotNull w0 viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(@NotNull A0 store, @NotNull b factory) {
        this(store, factory, 0);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    @NotNull
    public final <T extends w0> T a(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) d(C6345a.e(modelClass));
    }

    @NotNull
    public final w0 b(@NotNull Class modelClass, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        return this.f43416a.a(key, kotlin.jvm.internal.N.b(modelClass));
    }

    @NotNull
    public final <T extends w0> T c(@NotNull String key, @NotNull kotlin.reflect.d<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.f43416a.a(key, modelClass);
    }

    @NotNull
    public final <T extends w0> T d(@NotNull kotlin.reflect.d<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String u11 = modelClass.u();
        if (u11 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) this.f43416a.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(u11), modelClass);
    }

    public static class a extends c {

        /* renamed from: b, reason: collision with root package name */
        private static a f43417b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0800a f43418c = new C0800a();

        /* renamed from: a, reason: collision with root package name */
        private final Application f43419a;

        /* renamed from: androidx.lifecycle.z0$a$a, reason: collision with other inner class name */
        public static final class C0800a implements AbstractC6409a.b<Application> {
        }

        private a(Application application, int i11) {
            this.f43419a = application;
        }

        private final <T extends w0> T c(Class<T> cls, Application application) {
            if (!C5407b.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                T newInstance = cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(U7.m.a(cls, "Cannot create an instance of "), e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(U7.m.a(cls, "Cannot create an instance of "), e12);
            } catch (NoSuchMethodException e13) {
                throw new RuntimeException(U7.m.a(cls, "Cannot create an instance of "), e13);
            } catch (InvocationTargetException e14) {
                throw new RuntimeException(U7.m.a(cls, "Cannot create an instance of "), e14);
            }
        }

        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
        @NotNull
        public final <T extends w0> T create(@NotNull Class<T> modelClass, @NotNull AbstractC6409a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f43419a != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.a(f43418c);
            if (application != null) {
                return (T) c(modelClass, application);
            }
            if (C5407b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
        @NotNull
        public final <T extends w0> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f43419a;
            if (application != null) {
                return (T) c(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public /* synthetic */ z0(A0 a02, b bVar, int i11) {
        this(a02, bVar, AbstractC6409a.C0988a.f62496b);
    }

    public interface b {
        @NotNull
        default <T extends w0> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        @NotNull
        default <T extends w0> T create(@NotNull Class<T> modelClass, @NotNull AbstractC6409a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        @NotNull
        default <T extends w0> T create(@NotNull kotlin.reflect.d<T> modelClass, @NotNull AbstractC6409a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(C6345a.b(modelClass), extras);
        }
    }

    public z0(@NotNull A0 store, @NotNull b factory, @NotNull AbstractC6409a defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f43416a = new C6414f(store, factory, defaultCreationExtras);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0(@NotNull B0 owner) {
        this(r1, r3, r5);
        b bVar;
        AbstractC6409a abstractC6409a;
        Intrinsics.checkNotNullParameter(owner, "owner");
        A0 viewModelStore = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        boolean z11 = owner instanceof InterfaceC5431s;
        if (z11) {
            bVar = ((InterfaceC5431s) owner).getDefaultViewModelProviderFactory();
        } else {
            bVar = C6789b.f64735a;
        }
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (z11) {
            abstractC6409a = ((InterfaceC5431s) owner).getDefaultViewModelCreationExtras();
        } else {
            abstractC6409a = AbstractC6409a.C0988a.f62496b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0(@NotNull B0 owner, @NotNull b factory) {
        this(r1, factory, r3);
        AbstractC6409a abstractC6409a;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        A0 viewModelStore = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof InterfaceC5431s) {
            abstractC6409a = ((InterfaceC5431s) owner).getDefaultViewModelCreationExtras();
        } else {
            abstractC6409a = AbstractC6409a.C0988a.f62496b;
        }
    }
}
