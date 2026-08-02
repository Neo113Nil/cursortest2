package Q0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f5747a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f5748b;

    /* renamed from: c, reason: collision with root package name */
    public final r.b f5749c;

    public b(r.b bVar, r.b bVar2, r.b bVar3) {
        this.f5747a = bVar;
        this.f5748b = bVar2;
        this.f5749c = bVar3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        r.b bVar = this.f5749c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(AbstractC1663a.o(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        r.b bVar = this.f5747a;
        Method method = (Method) bVar.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        r.b bVar = this.f5748b;
        Method method = (Method) bVar.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b7 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b7.getDeclaredMethod("write", cls, b.class);
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i7);

    public final int f(int i7, int i8) {
        return !e(i8) ? i7 : ((c) this).f5751e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((c) this).f5751e.readParcelable(c.class.getClassLoader());
    }

    public final d h() {
        String readString = ((c) this).f5751e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    public abstract void i(int i7);

    public final void j(int i7, int i8) {
        i(i8);
        ((c) this).f5751e.writeInt(i7);
    }

    public final void k(Parcelable parcelable, int i7) {
        i(i7);
        ((c) this).f5751e.writeParcelable(parcelable, 0);
    }

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).f5751e.writeString(null);
            return;
        }
        try {
            ((c) this).f5751e.writeString(b(dVar.getClass()).getName());
            c a2 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a2);
                int i7 = a2.f5755i;
                if (i7 >= 0) {
                    int i8 = a2.f5750d.get(i7);
                    Parcel parcel = a2.f5751e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (InvocationTargetException e10) {
                if (!(e10.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
                }
                throw ((RuntimeException) e10.getCause());
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
