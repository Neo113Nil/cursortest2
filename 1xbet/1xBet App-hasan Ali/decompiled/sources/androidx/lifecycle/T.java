package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class T extends G1.q {

    /* renamed from: d, reason: collision with root package name */
    public static T f7038d;

    /* renamed from: e, reason: collision with root package name */
    public static final Q1.j f7039e = new Q1.j(22);

    /* renamed from: c, reason: collision with root package name */
    public final Application f7040c;

    public T(Application application) {
        super(2);
        this.f7040c = application;
    }

    public final S a(Class cls, Application application) {
        if (!AbstractC0472a.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            S s2 = (S) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.l.c(s2);
            return s2;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        }
    }

    @Override // G1.q, androidx.lifecycle.U
    public final S create(Class cls, D1.b bVar) {
        kotlin.jvm.internal.l.f("extras", bVar);
        if (this.f7040c != null) {
            return create(cls);
        }
        Application application = (Application) bVar.a(f7039e);
        if (application != null) {
            return a(cls, application);
        }
        if (AbstractC0472a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return N4.b.q(cls);
    }

    @Override // G1.q, androidx.lifecycle.U
    public final S create(Class cls) {
        kotlin.jvm.internal.l.f("modelClass", cls);
        Application application = this.f7040c;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
