package androidx.versionedparcelable;

import T7.Z;
import android.os.Parcelable;
import androidx.collection.C5132a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final C5132a<String, Method> f45136a;

    /* renamed from: b, reason: collision with root package name */
    protected final C5132a<String, Method> f45137b;

    /* renamed from: c, reason: collision with root package name */
    protected final C5132a<String, Class> f45138c;

    public a(C5132a<String, Method> c5132a, C5132a<String, Method> c5132a2, C5132a<String, Class> c5132a3) {
        this.f45136a = c5132a;
        this.f45137b = c5132a2;
        this.f45138c = c5132a3;
    }

    private Class c(Class<? extends W4.a> cls) throws ClassNotFoundException {
        String name = cls.getName();
        C5132a<String, Class> c5132a = this.f45138c;
        Class cls2 = c5132a.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(Z.a(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        c5132a.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        C5132a<String, Method> c5132a = this.f45136a;
        Method method = c5132a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        c5132a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C5132a<String, Method> c5132a = this.f45137b;
        Method method = c5132a.get(name);
        if (method != null) {
            return method;
        }
        Class c11 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c11.getDeclaredMethod("write", cls, a.class);
        c5132a.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(CharSequence charSequence);

    protected abstract void B(int i11);

    public final void C(int i11, int i12) {
        u(i12);
        B(i11);
    }

    protected abstract void D(Parcelable parcelable);

    public final void E(Parcelable parcelable, int i11) {
        u(i11);
        D(parcelable);
    }

    public final void F(int i11, String str) {
        u(i11);
        G(str);
    }

    protected abstract void G(String str);

    public final void H(W4.a aVar) {
        u(1);
        I(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void I(W4.a aVar) {
        if (aVar == null) {
            G(null);
            return;
        }
        try {
            G(c(aVar.getClass()).getName());
            a b11 = b();
            try {
                e(aVar.getClass()).invoke(null, aVar, b11);
                b11.a();
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
            } catch (NoSuchMethodException e13) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
            } catch (InvocationTargetException e14) {
                if (!(e14.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
                }
                throw ((RuntimeException) e14.getCause());
            }
        } catch (ClassNotFoundException e15) {
            throw new RuntimeException(aVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e15);
        }
    }

    protected abstract void a();

    protected abstract a b();

    protected abstract boolean f();

    public final boolean g(int i11, boolean z11) {
        return !l(i11) ? z11 : f();
    }

    protected abstract byte[] h();

    public final byte[] i(byte[] bArr) {
        return !l(2) ? bArr : h();
    }

    protected abstract CharSequence j();

    public final CharSequence k(int i11, CharSequence charSequence) {
        return !l(i11) ? charSequence : j();
    }

    protected abstract boolean l(int i11);

    protected abstract int m();

    public final int n(int i11, int i12) {
        return !l(i12) ? i11 : m();
    }

    protected abstract <T extends Parcelable> T o();

    public final <T extends Parcelable> T p(T t2, int i11) {
        return !l(i11) ? t2 : (T) o();
    }

    protected abstract String q();

    public final String r(int i11, String str) {
        return !l(i11) ? str : q();
    }

    protected final <T extends W4.a> T s() {
        String q11 = q();
        if (q11 == null) {
            return null;
        }
        try {
            return (T) d(q11).invoke(null, b());
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (e14.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e14.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
        }
    }

    public final W4.a t(W4.a aVar) {
        return !l(1) ? aVar : s();
    }

    protected abstract void u(int i11);

    public final void v(int i11, boolean z11) {
        u(i11);
        w(z11);
    }

    protected abstract void w(boolean z11);

    protected abstract void x(byte[] bArr);

    public final void y(byte[] bArr) {
        u(2);
        x(bArr);
    }

    public final void z(int i11, CharSequence charSequence) {
        u(i11);
        A(charSequence);
    }
}
