package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class h0 extends androidx.datastore.preferences.protobuf.i0 {
    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(long j2, java.lang.Object obj) {
        return this.f2321a.getBoolean(obj, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(long j2, java.lang.Object obj) {
        return this.f2321a.getDouble(obj, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(long j2, java.lang.Object obj) {
        return this.f2321a.getFloat(obj, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(java.lang.Object obj, long j2, boolean z2) {
        this.f2321a.putBoolean(obj, j2, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(java.lang.Object obj, long j2, byte b2) {
        this.f2321a.putByte(obj, j2, b2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(java.lang.Object obj, long j2, double d2) {
        this.f2321a.putDouble(obj, j2, d2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(java.lang.Object obj, long j2, float f2) {
        this.f2321a.putFloat(obj, j2, f2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = this.f2321a.getClass();
            java.lang.Class cls2 = java.lang.Long.TYPE;
            cls.getMethod("getByte", java.lang.Object.class, cls2);
            cls.getMethod("putByte", java.lang.Object.class, cls2, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, cls2);
            cls.getMethod("putBoolean", java.lang.Object.class, cls2, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, cls2);
            cls.getMethod("putFloat", java.lang.Object.class, cls2, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, cls2);
            cls.getMethod("putDouble", java.lang.Object.class, cls2, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            androidx.datastore.preferences.protobuf.j0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        sun.misc.Unsafe unsafe = this.f2321a;
        if (unsafe != null) {
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                java.lang.Class cls2 = java.lang.Long.TYPE;
                cls.getMethod("getLong", java.lang.Object.class, cls2);
                if (androidx.datastore.preferences.protobuf.j0.g() != null) {
                    try {
                        java.lang.Class<?> cls3 = this.f2321a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, java.lang.Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, java.lang.Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", java.lang.Object.class, cls2, java.lang.Object.class, cls2, cls2);
                        return true;
                    } catch (java.lang.Throwable th) {
                        androidx.datastore.preferences.protobuf.j0.a(th);
                        return false;
                    }
                }
            } catch (java.lang.Throwable th2) {
                androidx.datastore.preferences.protobuf.j0.a(th2);
            }
        }
        return false;
    }
}
