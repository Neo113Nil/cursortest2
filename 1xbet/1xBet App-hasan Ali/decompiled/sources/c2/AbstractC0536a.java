package c2;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r.C2327e;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0536a {

    /* renamed from: a, reason: collision with root package name */
    public final C2327e f7397a;

    /* renamed from: b, reason: collision with root package name */
    public final C2327e f7398b;

    /* renamed from: c, reason: collision with root package name */
    public final C2327e f7399c;

    public AbstractC0536a(C2327e c2327e, C2327e c2327e2, C2327e c2327e3) {
        this.f7397a = c2327e;
        this.f7398b = c2327e2;
        this.f7399c = c2327e3;
    }

    public abstract C0537b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C2327e c2327e = this.f7399c;
        Class cls2 = (Class) c2327e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2327e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C2327e c2327e = this.f7397a;
        Method method = (Method) c2327e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0536a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0536a.class);
        c2327e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        C2327e c2327e = this.f7398b;
        Method method = (Method) c2327e.get(name);
        if (method != null) {
            return method;
        }
        Class b3 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b3.getDeclaredMethod("write", cls, AbstractC0536a.class);
        c2327e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((C0537b) this).f7401e.readParcelable(C0537b.class.getClassLoader());
    }

    public final InterfaceC0538c g() {
        String readString = ((C0537b) this).f7401e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC0538c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    public abstract void h(int i);

    public final void i(InterfaceC0538c interfaceC0538c) {
        if (interfaceC0538c == null) {
            ((C0537b) this).f7401e.writeString(null);
            return;
        }
        try {
            ((C0537b) this).f7401e.writeString(b(interfaceC0538c.getClass()).getName());
            C0537b a5 = a();
            try {
                d(interfaceC0538c.getClass()).invoke(null, interfaceC0538c, a5);
                int i = a5.i;
                if (i >= 0) {
                    int i5 = a5.f7400d.get(i);
                    Parcel parcel = a5.f7401e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(dataPosition - i5);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
            } catch (InvocationTargetException e7) {
                if (!(e7.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
                }
                throw ((RuntimeException) e7.getCause());
            }
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(interfaceC0538c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e8);
        }
    }
}
