package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class eo extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2005 = {-1950274443, 260841018, -1308905395, -2019037849, 1359289274, 1808404289, -1482803707, -1433526023, 370191769, 466910818, -74858936, 244814092, 1686132250, -1397659285, -500863803, -782780702, -452616171, 1892221877};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2006 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2007 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final java.lang.String f2008;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef[] f2009;

    public eo(java.lang.String str, java.util.List<com.ironsource.adqualitysdk.sdk.i.ef> list) {
        this.f2008 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(str);
        com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = new com.ironsource.adqualitysdk.sdk.i.ef[list.size()];
        this.f2009 = efVarArr;
        list.toArray(efVarArr);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final java.lang.String m7737() {
        int i = 2 % 2;
        int i2 = f2007 + 109;
        int i3 = i2 % 128;
        f2006 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.f2008;
        int i4 = i3 + 69;
        f2007 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final com.ironsource.adqualitysdk.sdk.i.ef[] m7736() {
        int i = 2 % 2;
        int i2 = f2006;
        int i3 = i2 + 11;
        f2007 = i3 % 128;
        int i4 = i3 % 2;
        com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = this.f2009;
        int i5 = i2 + 123;
        f2007 = i5 % 128;
        if (i5 % 2 != 0) {
            return efVarArr;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2006 + 91;
        f2007 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List<java.lang.Object> m7738 = m7738(eeVar, clVar);
        if (m7737().equals(m7735(new int[]{1317854043, 294719011}, android.text.TextUtils.indexOf("", "", 0) + 3).intern())) {
            java.lang.String intern = m7735(new int[]{-138726707, -1647842024, -278252784, -1886572812}, 7 - android.view.View.MeasureSpec.getMode(0)).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(clVar.m7200());
            sb.append(m7735(new int[]{-909841598, -786800315}, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 3).intern());
            sb.append(m7738.get(0));
            com.ironsource.adqualitysdk.sdk.i.cn.m7270(intern, sb.toString());
            return new com.ironsource.adqualitysdk.sdk.i.ea(null);
        }
        try {
            com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(((com.ironsource.adqualitysdk.sdk.i.dz) eeVar.m7707(m7737())).m7668(eeVar, clVar, m7738));
            int i4 = f2007 + 51;
            f2006 = i4 % 128;
            int i5 = i4 % 2;
            return eaVar;
        } catch (java.lang.Exception unused) {
            if (clVar.m7207().m7930(m7737()) != null) {
                return clVar.m7207().m7930(m7737()).m7668(eeVar, clVar, m7738).m7678(false);
            }
            return new com.ironsource.adqualitysdk.sdk.i.ea(clVar.m7198().mo6378(clVar, m7737(), m7738, clVar.m7202(), eeVar));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final java.util.List<java.lang.Object> m7738(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = this.f2009;
        int length = efVarArr.length;
        int i2 = f2007 + 7;
        f2006 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f2006 + 65;
            f2007 = i5 % 128;
            if (i5 % 2 == 0) {
                arrayList.add(efVarArr[i4].m7718(eeVar, clVar).m7681());
                i4 += 126;
            } else {
                arrayList.add(efVarArr[i4].m7718(eeVar, clVar).m7681());
                i4++;
            }
        }
        return arrayList;
    }

    public java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f2006 + 47;
        f2007 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String mo7729 = mo7729(this.f2009);
        int i4 = f2007 + 69;
        f2006 = i4 % 128;
        int i5 = i4 % 2;
        return mo7729;
    }

    /* renamed from: ﻐ */
    java.lang.String mo7729(java.lang.Object[] objArr) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f2008);
        sb.append(m7735(new int[]{85573933, -119711068}, 1 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)).intern());
        sb.append(m7717(objArr));
        sb.append(m7735(new int[]{538786288, -1910047425}, android.view.View.resolveSize(0, 0) + 1).intern());
        java.lang.String obj = sb.toString();
        int i2 = f2007 + 5;
        f2006 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return java.util.Arrays.equals(r5.f2009, r6.f2009);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.eo.f2006 + 1;
        com.ironsource.adqualitysdk.sdk.i.eo.f2007 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if ((r6 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r6 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (getClass() == r6.getClass()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r6 = (com.ironsource.adqualitysdk.sdk.i.eo) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r5.f2008.equals(r6.f2008) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f2006 + 115;
        f2007 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    public int hashCode() {
        int hashCode;
        int i = 2 % 2;
        int i2 = f2006;
        int i3 = i2 + 45;
        f2007 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.f2008;
        int i5 = 0;
        if (str != null) {
            int i6 = i2 + 21;
            f2007 = i6 % 128;
            if (i6 % 2 == 0) {
                hashCode = str.hashCode();
                int i7 = 96 / 0;
            } else {
                hashCode = str.hashCode();
            }
            i5 = hashCode;
        }
        return (i5 * 31) + java.util.Arrays.hashCode(this.f2009);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7735(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2005.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f93 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f93 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f94 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f95 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f94 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = com.ironsource.adqualitysdk.sdk.i.a.m5771(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f95;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f94 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f94 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f94;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f95 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f93 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f93 += 2;
            }
            str = new java.lang.String(cArr2, 0, i);
        }
        return str;
    }
}
