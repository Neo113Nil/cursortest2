package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jh1 {

    /* JADX INFO: renamed from: a */
    public final C0089c8 f3929a;

    /* JADX INFO: renamed from: b */
    public final C0089c8 f3930b;

    /* JADX INFO: renamed from: c */
    public final C0089c8 f3931c;

    public jh1(C0089c8 c0089c8, C0089c8 c0089c9, C0089c8 c0089c10) {
        this.f3929a = c0089c8;
        this.f3930b = c0089c9;
        this.f3931c = c0089c10;
    }

    /* JADX INFO: renamed from: a */
    public abstract kh1 mo2859a();

    /* JADX INFO: renamed from: b */
    public final Class m2860b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0089c8 c0089c8 = this.f3931c;
        Class cls2 = (Class) c0089c8.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0089c8.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m2861c(String str) throws NoSuchMethodException {
        C0089c8 c0089c8 = this.f3929a;
        Method method = (Method) c0089c8.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, jh1.class.getClassLoader()).getDeclaredMethod("read", jh1.class);
        c0089c8.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m2862d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0089c8 c0089c8 = this.f3930b;
        Method method = (Method) c0089c8.get(name);
        if (method != null) {
            return method;
        }
        Class clsM2860b = m2860b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2860b.getDeclaredMethod("write", cls, jh1.class);
        c0089c8.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2863e(int i);

    /* JADX INFO: renamed from: f */
    public final int m2864f(int i, int i2) {
        return !mo2863e(i2) ? i : ((kh1) this).f4376e.readInt();
    }

    /* JADX INFO: renamed from: g */
    public final Parcelable m2865g(Parcelable parcelable, int i) {
        if (!mo2863e(i)) {
            return parcelable;
        }
        return ((kh1) this).f4376e.readParcelable(kh1.class.getClassLoader());
    }

    /* JADX INFO: renamed from: h */
    public final lh1 m2866h() {
        String string = ((kh1) this).f4376e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (lh1) m2861c(string).invoke(null, mo2859a());
        } catch (ClassNotFoundException e) {
            C0270h1.m2189e("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            C0270h1.m2189e("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C0270h1.m2189e("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            C0270h1.m2189e("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo2867i(int i);

    /* JADX INFO: renamed from: j */
    public final void m2868j(int i, int i2) {
        mo2867i(i2);
        ((kh1) this).f4376e.writeInt(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m2869k(lh1 lh1Var) {
        if (lh1Var == null) {
            ((kh1) this).f4376e.writeString(null);
            return;
        }
        try {
            ((kh1) this).f4376e.writeString(m2860b(lh1Var.getClass()).getName());
            kh1 kh1VarMo2859a = mo2859a();
            try {
                m2862d(lh1Var.getClass()).invoke(null, lh1Var, kh1VarMo2859a);
                Parcel parcel = kh1VarMo2859a.f4376e;
                int i = kh1VarMo2859a.f4380i;
                if (i >= 0) {
                    int i2 = kh1VarMo2859a.f4375d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                C0270h1.m2189e("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                C0270h1.m2189e("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                C0270h1.m2189e("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                C0270h1.m2189e("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            C0270h1.m2189e(lh1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
