package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class v3 extends com.fyber.inneractive.sdk.protobuf.w3 {
    public v3(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = this.f4226a.getClass();
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
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
            com.fyber.inneractive.sdk.protobuf.x3.a(th);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r2.getType() == java.lang.Long.TYPE) goto L12;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        java.lang.reflect.Field field;
        sun.misc.Unsafe unsafe = this.f4226a;
        if (unsafe != null) {
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                java.lang.Class<?> cls2 = java.lang.Long.TYPE;
                cls.getMethod("getLong", java.lang.Object.class, cls2);
                java.lang.reflect.Field field2 = null;
                if (com.fyber.inneractive.sdk.protobuf.d.a()) {
                    try {
                        field = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (java.lang.Throwable unused) {
                        field = null;
                    }
                }
                try {
                    field = java.nio.Buffer.class.getDeclaredField(com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                } catch (java.lang.Throwable unused2) {
                    field = null;
                }
                if (field != null) {
                }
                if (field2 != null) {
                    try {
                        java.lang.Class<?> cls3 = this.f4226a.getClass();
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
                        com.fyber.inneractive.sdk.protobuf.x3.a(th);
                        return false;
                    }
                }
            } catch (java.lang.Throwable th2) {
                com.fyber.inneractive.sdk.protobuf.x3.a(th2);
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(java.lang.Object obj, long j) {
        return this.f4226a.getDouble(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(java.lang.Object obj, long j) {
        return this.f4226a.getFloat(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(java.lang.Object obj, long j, byte b) {
        this.f4226a.putByte(obj, j, b);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(java.lang.Object obj, long j) {
        return this.f4226a.getBoolean(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(java.lang.Object obj, long j, boolean z) {
        this.f4226a.putBoolean(obj, j, z);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(java.lang.Object obj, long j, float f) {
        this.f4226a.putFloat(obj, j, f);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(java.lang.Object obj, long j, double d) {
        this.f4226a.putDouble(obj, j, d);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j) {
        return this.f4226a.getByte(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j, byte[] bArr, long j2) {
        this.f4226a.copyMemory((java.lang.Object) null, j, bArr, com.fyber.inneractive.sdk.protobuf.x3.f, j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(java.lang.Object obj, long j) {
        return this.f4226a.getByte(obj, j);
    }
}
