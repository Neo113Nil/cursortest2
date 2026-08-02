package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ng {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static int f3677a;
    private static int d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b * 17;
        int i4 = 101 - (b2 * 2);
        byte[] bArr = $$a;
        ?? r6 = 21 - (s * 17);
        byte[] bArr2 = new byte[18 - i3];
        if (bArr == null) {
            byte b3 = r6;
            i = 0;
            int i5 = r6;
            i4 = i4 + b3 + 3;
            i2 = i5 + 1;
            bArr2[i] = (byte) i4;
            if (i == 17 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            b3 = bArr[i2];
            i5 = i2;
            i4 = i4 + b3 + 3;
            i2 = i5 + 1;
            bArr2[i] = (byte) i4;
            if (i == 17 - i3) {
            }
        } else {
            i = 0;
            i2 = r6;
            bArr2[i] = (byte) i4;
            if (i == 17 - i3) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{43, 4, 36, -84, 9, -5, -66, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -8, -1, -1, com.google.common.base.Ascii.FF, -18, -5, -56, 66, -18, 4, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.DC4};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE;
    }

    public static java.lang.String a() {
        return "okhttp/3.12.13";
    }

    public static void e(long j, long j2) {
        int i = d;
        f3677a = (((i | 21) << 1) - (i ^ 21)) % 128;
        java.lang.Object obj = com.facetec.sdk.by.e.class.getField("a").get(null);
        int i2 = (d + 93) % 128;
        f3677a = i2;
        int i3 = (i2 | 97) << 1;
        int i4 = -((i2 & (-98)) | ((~i2) & 97));
        d = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        try {
            byte[] bArr = $$a;
            byte b = bArr[9];
            byte b2 = (byte) (b + 1);
            byte b3 = (byte) (-b);
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(b2, b3, b3, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            byte b4 = (byte) (-bArr[9]);
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(b4, b5, b5, objArr2);
            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.facetec.sdk.by.e.class);
            method.setAccessible(true);
            method.invoke(null, null, obj);
            f3677a = (d + 79) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$0();
        f3677a = 0;
        d = 1;
    }
}
