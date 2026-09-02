package U;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final l.C0924b f1717a;

    /* renamed from: b, reason: collision with root package name */
    public final l.C0924b f1718b;

    /* renamed from: c, reason: collision with root package name */
    public final l.C0924b f1719c;

    public a(l.C0924b c0924b, l.C0924b c0924b2, l.C0924b c0924b3) {
        this.f1717a = c0924b;
        this.f1718b = c0924b2;
        this.f1719c = c0924b3;
    }

    public abstract U.b a();

    public final java.lang.Class b(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        l.C0924b c0924b = this.f1719c;
        java.lang.Class cls2 = (java.lang.Class) c0924b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0924b.put(cls.getName(), cls3);
        return cls3;
    }

    public final java.lang.reflect.Method c(java.lang.String str) {
        l.C0924b c0924b = this.f1717a;
        java.lang.reflect.Method method = (java.lang.reflect.Method) c0924b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, U.a.class.getClassLoader()).getDeclaredMethod("read", U.a.class);
        c0924b.put(str, declaredMethod);
        return declaredMethod;
    }

    public final java.lang.reflect.Method d(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        l.C0924b c0924b = this.f1718b;
        java.lang.reflect.Method method = (java.lang.reflect.Method) c0924b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        java.lang.Class b2 = b(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = b2.getDeclaredMethod("write", cls, U.a.class);
        c0924b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final android.os.Parcelable f(android.os.Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((U.b) this).f1721e.readParcelable(U.b.class.getClassLoader());
    }

    public final U.c g() {
        java.lang.String readString = ((U.b) this).f1721e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (U.c) c(readString).invoke(null, a());
        } catch (java.lang.ClassNotFoundException e2) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (java.lang.IllegalAccessException e3) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (java.lang.NoSuchMethodException e4) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (java.lang.reflect.InvocationTargetException e5) {
            if (e5.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e5.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void h(int i2);

    public final void i(U.c cVar) {
        if (cVar == null) {
            ((U.b) this).f1721e.writeString(null);
            return;
        }
        try {
            ((U.b) this).f1721e.writeString(b(cVar.getClass()).getName());
            U.b a2 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a2);
                int i2 = a2.f1725i;
                if (i2 >= 0) {
                    int i3 = a2.f1720d.get(i2);
                    android.os.Parcel parcel = a2.f1721e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(dataPosition - i3);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (java.lang.NoSuchMethodException e4) {
                throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (java.lang.reflect.InvocationTargetException e5) {
                if (!(e5.getCause() instanceof java.lang.RuntimeException)) {
                    throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((java.lang.RuntimeException) e5.getCause());
            }
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
