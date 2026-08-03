package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gd extends com.ironsource.adqualitysdk.sdk.i.gb {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2182 = {1697331583, -1311653986, 952616796, 572417804, 340931791, -293053782, 1406183284, 1029199421, -1442316609, 11608158, -65815775, -323984906, -61604264, 1342996131, -1240516853, 1125413944, -870703791, -543701660};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2183 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2184 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final java.util.List<com.ironsource.adqualitysdk.sdk.i.ef> f2185;

    public gd(java.util.List<com.ironsource.adqualitysdk.sdk.i.ef> list) {
        this.f2185 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        java.util.List<java.lang.String> asList;
        int i = 2 % 2;
        java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.ef> it = this.f2185.iterator();
        int i2 = f2183 + 91;
        f2184 = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            com.ironsource.adqualitysdk.sdk.i.eq eqVar = null;
            if (!it.hasNext()) {
                return new com.ironsource.adqualitysdk.sdk.i.ea(null);
            }
            com.ironsource.adqualitysdk.sdk.i.ef next = it.next();
            if (next instanceof com.ironsource.adqualitysdk.sdk.i.eq) {
                eqVar = (com.ironsource.adqualitysdk.sdk.i.eq) next;
                int i4 = f2183 + 107;
                f2184 = i4 % 128;
                int i5 = i4 % 2;
            } else if (next instanceof com.ironsource.adqualitysdk.sdk.i.ej) {
                eqVar = ((com.ironsource.adqualitysdk.sdk.i.ej) next).m7724();
            }
            if (eqVar != null) {
                int i6 = f2184 + 29;
                f2183 = i6 % 128;
                if (i6 % 2 != 0) {
                    java.lang.String[] strArr = new java.lang.String[0];
                    strArr[0] = eqVar.m7743();
                    asList = java.util.Arrays.asList(strArr);
                } else {
                    asList = java.util.Arrays.asList(eqVar.m7743());
                }
                eeVar.m7714(asList);
            }
            next.mo7719(eeVar, clVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append(m7790(new int[]{-699068608, -66970291}, 3 - android.os.Process.getGidForName("")).intern());
        r1.append(android.text.TextUtils.join(m7790(new int[]{-1184852722, 1831500684}, android.view.View.combineMeasuredStates(0, 0) + 2).intern(), r8.f2185));
        r1.append(m7790(new int[]{1790102112, -1862692858}, android.graphics.Color.argb(0, 0, 0, 0) + 1).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r8.f2185 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r8.f2185 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007d, code lost:
    
        r1 = m7790(new int[]{-699068608, -66970291, 1790102112, -1862692858}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6).intern();
        r2 = com.ironsource.adqualitysdk.sdk.i.gd.f2183 + 17;
        com.ironsource.adqualitysdk.sdk.i.gd.f2184 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0099, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        r0 = null;
        super.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f2183 + 67;
        f2184 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7790(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2182.clone();
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
