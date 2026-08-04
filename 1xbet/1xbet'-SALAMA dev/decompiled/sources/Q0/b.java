package Q0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p122r.b f5747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p122r.b f5748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p122r.b f5749c;

    public b(p122r.b bVar, p122r.b bVar2, p122r.b bVar3) {
        this.f5747a = bVar;
        this.f5748b = bVar2;
        this.f5749c = bVar3;
    }

    public abstract c a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        p122r.b bVar = this.f5749c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(p150v0.a.o(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        p122r.b bVar = this.f5747a;
        Method method = (Method) bVar.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        p122r.b bVar = this.f5748b;
        Method method = (Method) bVar.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, b.class);
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
        String string = ((c) this).f5751e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (d) c(string).invoke(null, a());
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
            c cVarA = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, cVarA);
                int i7 = cVarA.f5755i;
                if (i7 >= 0) {
                    int i8 = cVarA.f5750d.get(i7);
                    Parcel parcel = cVarA.f5751e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(iDataPosition - i8);
                    parcel.setDataPosition(iDataPosition);
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
