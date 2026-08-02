package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class U extends W {

    /* renamed from: c, reason: collision with root package name */
    public static U f9610c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f9611b;

    public U(Application application) {
        this.f9611b = application;
    }

    public final S a(Class cls, Application application) {
        if (!AbstractC0727a.class.isAssignableFrom(cls)) {
            return super.b(cls);
        }
        try {
            S s7 = (S) cls.getConstructor(Application.class).newInstance(application);
            t6.h.d(s7, "{\n                try {\n…          }\n            }");
            return s7;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }

    @Override // androidx.lifecycle.W, androidx.lifecycle.V
    public final S b(Class cls) {
        Application application = this.f9611b;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.V
    public final S i(Class cls, m0.c cVar) {
        if (this.f9611b != null) {
            return b(cls);
        }
        Application application = (Application) cVar.f15202a.get(T.f9608a);
        if (application != null) {
            return a(cls, application);
        }
        if (AbstractC0727a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.b(cls);
    }
}
