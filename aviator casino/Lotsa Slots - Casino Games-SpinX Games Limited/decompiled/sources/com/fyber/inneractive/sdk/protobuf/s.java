package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class s implements java.lang.Iterable, java.io.Serializable {
    public static final com.fyber.inneractive.sdk.protobuf.q b = new com.fyber.inneractive.sdk.protobuf.q(com.fyber.inneractive.sdk.protobuf.l1.b);
    public static final com.fyber.inneractive.sdk.protobuf.o c;

    /* renamed from: a, reason: collision with root package name */
    public int f4217a = 0;

    static {
        c = com.fyber.inneractive.sdk.protobuf.d.a() ? new com.fyber.inneractive.sdk.protobuf.r() : new com.fyber.inneractive.sdk.protobuf.m();
    }

    public static com.fyber.inneractive.sdk.protobuf.q a(java.lang.String str) {
        return new com.fyber.inneractive.sdk.protobuf.q(str.getBytes(com.fyber.inneractive.sdk.protobuf.l1.f4203a));
    }

    public abstract int a(int i, int i2);

    public abstract void a(int i, byte[] bArr);

    public abstract void a(com.fyber.inneractive.sdk.protobuf.k kVar);

    public abstract byte c(int i);

    public abstract boolean c();

    public abstract byte d(int i);

    public abstract com.fyber.inneractive.sdk.protobuf.w d();

    public abstract com.fyber.inneractive.sdk.protobuf.s e(int i);

    public abstract java.lang.String e();

    public final java.lang.String f() {
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        return size() == 0 ? "" : e();
    }

    public final int hashCode() {
        int i = this.f4217a;
        if (i == 0) {
            int size = size();
            i = a(size, size);
            if (i == 0) {
                i = 1;
            }
            this.f4217a = i;
        }
        return i;
    }

    public abstract int size();

    public final java.lang.String toString() {
        java.lang.String str;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = com.fyber.inneractive.sdk.protobuf.h3.a(this);
        } else {
            str = com.fyber.inneractive.sdk.protobuf.h3.a(e(47)) + "...";
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + str + "\">";
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new java.lang.IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }
}
