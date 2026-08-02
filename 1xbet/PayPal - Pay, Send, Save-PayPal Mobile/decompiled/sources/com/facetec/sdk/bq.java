package com.facetec.sdk;

/* loaded from: classes8.dex */
public class bq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int e;
    private static int j;
    private boolean b = true;
    boolean d = false;

    /* renamed from: a, reason: collision with root package name */
    com.facetec.sdk.cb f3434a = com.facetec.sdk.cb.FRONT_AND_BACK;
    com.facetec.sdk.bw.c c = com.facetec.sdk.bw.c.FRONT;

    public static /* synthetic */ java.lang.Object c(int i, int i2, int i3, java.lang.Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i6 | i7 | (~i);
        int i9 = ~i6;
        int i10 = (~(i | i7)) | (~(i7 | i9));
        int i11 = i3 + i6 + i5 + ((-92689393) * i4) + (1942122663 * i2);
        int i12 = i11 * i11;
        int i13 = (1048061654 * i3) + 1366922925 + (1048062268 * i6) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (1048061961 * i5) + (439444615 * i4) + ((-1279783457) * i2) + (173867008 * i12);
        return ((((((((((i3 * (-665130586)) - 357761024) + (i6 * (-674687396))) + (i8 * 4778405)) + (i9 * (-4778405))) + (i10 * (-4778405))) + (i5 * (-669908992))) + (i4 * (-1056047104))) + (i2 * (-742522880))) + (i12 * (-592117760))) + ((i13 * i13) * (-1898250240)) != 1 ? e(objArr) : c(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = (b * 2) + 99;
        int i3 = s * 17;
        byte[] bArr = $$a;
        int i4 = (b2 * 17) + 4;
        byte[] bArr2 = new byte[18 - i3];
        int i5 = 17 - i3;
        if (bArr == null) {
            i2 = i4;
            int i6 = i5;
            i = 0;
            i4++;
            i2 = i2 + i6 + 3;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i4];
            i4++;
            i2 = i2 + i6 + 3;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{94, -24, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 108, 9, -5, -66, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -8, -1, -1, com.google.common.base.Ascii.FF, -18, -5, -56, 66, -18, 4, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.DC4};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    static com.facetec.sdk.bq e(boolean z, com.facetec.sdk.cb cbVar, com.facetec.sdk.bw.c cVar) {
        com.facetec.sdk.bq bqVar = new com.facetec.sdk.bq();
        bqVar.b = false;
        bqVar.d = z;
        bqVar.f3434a = cbVar;
        bqVar.c = cVar;
        return bqVar;
    }

    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        ((java.lang.Number) objArr[0]).longValue();
        ((java.lang.Number) objArr[1]).longValue();
        int i = j;
        int i2 = i & 41;
        int i3 = i2 + ((i ^ 41) | i2);
        e = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            com.facetec.sdk.by.e.class.getField("c").get(null);
            obj.hashCode();
            throw null;
        }
        java.lang.Object obj2 = com.facetec.sdk.by.e.class.getField("c").get(null);
        int i4 = e;
        j = ((-2) - (~(((i4 | 62) << 1) - (i4 ^ 62)))) % 128;
        try {
            byte[] bArr = $$a;
            byte b = (byte) (bArr[9] + 1);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f(b, b, b, objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            byte b2 = (byte) (-bArr[9]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            f(b2, b2, b2, objArr3);
            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr3[0], android.content.Context.class, com.facetec.sdk.by.e.class);
            method.setAccessible(true);
            method.invoke(null, null, obj2);
            int i5 = e;
            j = ((i5 & 75) + (i5 | 75)) % 128;
            return null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        e = ((-2) - (~(j + 82))) % 128;
        java.lang.Object obj = com.facetec.sdk.by.e.class.getField(util.h.xy.cb.b.f1091).get(null);
        int i = j;
        int i2 = i & 9;
        int i3 = -(-((i ^ 9) | i2));
        e = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        e = (i + 21) % 128;
        try {
            byte[] bArr = $$a;
            byte b = (byte) (bArr[9] + 1);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f(b, b, b, objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            byte b2 = (byte) (-bArr[9]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            f(b2, b2, b2, objArr3);
            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr3[0], android.content.Context.class, com.facetec.sdk.by.e.class);
            method.setAccessible(true);
            method.invoke(null, null, obj);
            int i4 = e;
            int i5 = ((i4 ^ 79) | (i4 & 79)) << 1;
            int i6 = -((i4 & (-80)) | ((~i4) & 79));
            int i7 = (i5 & i6) + (i6 | i5);
            j = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 42 / 0;
            }
            return null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void d(long j2, long j3) {
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)};
        int b = com.facetec.sdk.my.b();
        int b2 = com.facetec.sdk.my.b();
        c(b, com.facetec.sdk.my.b(), 435624059, objArr, com.facetec.sdk.my.b(), b2, -435624058);
    }

    static {
        init$0();
        e = 0;
        j = 1;
    }

    private static void d() {
        int b = com.facetec.sdk.my.b();
        int b2 = com.facetec.sdk.my.b();
        int b3 = com.facetec.sdk.my.b();
        c(b, com.facetec.sdk.my.b(), 439428543, new java.lang.Object[0], b3, b2, -439428543);
    }
}
