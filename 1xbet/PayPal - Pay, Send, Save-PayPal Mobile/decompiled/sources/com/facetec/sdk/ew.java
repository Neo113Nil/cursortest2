package com.facetec.sdk;

/* loaded from: classes8.dex */
public class ew extends java.lang.RuntimeException {
    private static final byte[] $$d = null;
    private static final int $$e = 0;

    /* renamed from: a, reason: collision with root package name */
    private static int f3558a;
    private static int e;

    static void init$0() {
        $$d = new byte[]{35, -62, -43, -26, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, com.visa.cbp.getEncExpo.kernelVersion, -20};
        $$e = 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$d;
        int i2 = 20 - (b * 17);
        int i3 = 101 - (s * 2);
        int i4 = s2 * 17;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            i3 = i4;
            int i5 = i2;
            int i6 = 0;
            i3 = i3 + (-i2) + 3;
            i2 = i5;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i2 + 1;
            int i8 = i + 1;
            i5 = i7;
            i2 = bArr[i7];
            i6 = i8;
            i3 = i3 + (-i2) + 3;
            i2 = i5;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    public ew(java.lang.String str) {
        super(str);
    }

    public ew(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public ew(java.lang.Throwable th) {
        super(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0095, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        r7 = r6.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
    
        if (r7 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0015, code lost:
    
        r6 = r7 & 35;
        com.facetec.sdk.ew.f3558a = (r6 + ((r7 ^ 35) | r6)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0013, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r7 = com.facetec.sdk.by.e.class.getField("j").get(null);
        r0 = com.facetec.sdk.ew.f3558a;
        r1 = (r0 & 104) + (r0 | 104);
        com.facetec.sdk.ew.e = ((~r1) + (r1 << 1)) % 128;
        r1 = r0 & 65;
        r2 = ((r0 ^ 65) | r1) << 1;
        r0 = -((r0 | 65) & (~r1));
        com.facetec.sdk.ew.e = ((r2 & r0) + (r0 | r2)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        r6 = new java.lang.Object[]{r6, r7};
        r7 = com.facetec.sdk.ew.$$d;
        r1 = r7[9];
        r2 = r1;
        r5 = new java.lang.Object[1];
        k(r1, r2, r2, r5);
        r1 = java.lang.Class.forName((java.lang.String) r5[0]);
        r7 = (byte) (r7[9] - 1);
        r0 = r7;
        r4 = new java.lang.Object[1];
        k(r7, r0, r0, r4);
        r7 = r1.getMethod((java.lang.String) r4[0], android.content.Context.class, com.facetec.sdk.by.e.class);
        r7.setAccessible(true);
        r7.invoke(null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008c, code lost:
    
        com.facetec.sdk.ew.e = (com.facetec.sdk.ew.f3558a + 69) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0094, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(android.content.Context context, long j, long j2) {
        int i = e;
        int i2 = i + 85;
        f3558a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
    }

    static {
        init$0();
        e = 0;
        f3558a = 1;
    }
}
