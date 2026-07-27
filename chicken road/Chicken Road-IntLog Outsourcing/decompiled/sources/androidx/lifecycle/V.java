package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class V extends X {

    /* renamed from: c, reason: collision with root package name */
    public static V f4560c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f4561b;

    public V(Application application) {
        this.f4561b = application;
    }

    @Override // androidx.lifecycle.W
    public final T a(Class cls, S.c cVar) {
        if (this.f4561b != null) {
            return b(cls);
        }
        Application application = (Application) cVar.f2736a.get(U.f4558a);
        if (application != null) {
            return c(cls, application);
        }
        if (AbstractC0231a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.b(cls);
    }

    @Override // androidx.lifecycle.X, androidx.lifecycle.W
    public final T b(Class cls) {
        Application application = this.f4561b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final T c(Class cls, Application application) {
        if (!AbstractC0231a.class.isAssignableFrom(cls)) {
            return super.b(cls);
        }
        try {
            T t5 = (T) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.i.d(t5, "{\n                try {\n…          }\n            }");
            return t5;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }
}
