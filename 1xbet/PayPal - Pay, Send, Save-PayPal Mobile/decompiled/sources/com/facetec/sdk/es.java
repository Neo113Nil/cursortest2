package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class es {
    private static final byte[] $$d = {111, -119, 0, 123, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, -52, com.visa.cbp.getEncExpo.onUnminimized};
    private static final int $$e = 48;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void l(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i2 * 3) + 99;
        int i5 = i * 4;
        int i6 = 3 - (b * 4);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[18 - i5];
        int i7 = 17 - i5;
        if (bArr == null) {
            int i8 = i4;
            i3 = 0;
            i4 = i7;
            i4 = i4 + (-i8) + 3;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6++;
            i8 = bArr[i6];
            i3++;
            i4 = i4 + (-i8) + 3;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    @java.lang.Deprecated
    public es() {
    }

    public final boolean j() {
        return this instanceof com.facetec.sdk.en;
    }

    public final boolean f() {
        return this instanceof com.facetec.sdk.ep;
    }

    public final boolean g() {
        byte b = $$d[2];
        java.lang.Object[] objArr = new java.lang.Object[1];
        l(b, b, b, objArr);
        return java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(this);
    }

    public final boolean i() {
        return this instanceof com.facetec.sdk.eq;
    }

    public final com.facetec.sdk.ex n() {
        if (g()) {
            return (com.facetec.sdk.ex) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Primitive: ".concat(java.lang.String.valueOf(this)));
    }

    public boolean h() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.Number b() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.String c() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public double d() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public long a() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.String toString() {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            com.facetec.sdk.gu guVar = new com.facetec.sdk.gu(stringWriter);
            guVar.e(true);
            com.facetec.sdk.fv.c(this, guVar);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
