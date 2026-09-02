package r;

import android.os.Parcel;
import android.os.Parcelable;
import f.C0025a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0025a f1142a;

    /* renamed from: b, reason: collision with root package name */
    public final C0025a f1143b;

    /* renamed from: c, reason: collision with root package name */
    public final C0025a f1144c;

    public b(C0025a c0025a, C0025a c0025a2, C0025a c0025a3) {
        this.f1142a = c0025a;
        this.f1143b = c0025a2;
        this.f1144c = c0025a3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0025a c0025a = this.f1144c;
        Class cls2 = (Class) c0025a.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0025a.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0025a c0025a = this.f1142a;
        Method method = (Method) c0025a.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        c0025a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0025a c0025a = this.f1143b;
        Method method = (Method) c0025a.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", cls, b.class);
        c0025a.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final Parcelable f(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((c) this).f1146e.readParcelable(c.class.getClassLoader());
    }

    public final d g() {
        String readString = ((c) this).f1146e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void h(int i2);

    public final void i(d dVar) {
        if (dVar == null) {
            ((c) this).f1146e.writeString(null);
            return;
        }
        try {
            ((c) this).f1146e.writeString(b(dVar.getClass()).getName());
            c a2 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a2);
                Parcel parcel = a2.f1146e;
                int i2 = a2.f1150i;
                if (i2 >= 0) {
                    int i3 = a2.f1145d.get(i2);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(dataPosition - i3);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
