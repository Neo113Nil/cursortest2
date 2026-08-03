package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gx extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2285 = 6126857728165377889L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2286 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2287 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2287 + 89;
        f2286 = i2 % 128;
        int i3 = i2 % 2;
        return m7818("眂뼓\ue736⼘坸龟잣࿅㟪縋ꙭ\uee2dᙙ平蛙캢\uf6c4㻮攇괯핖ᵨ䕺趈뗷ﷹ◼氂鐢\udc4bѨ", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51228).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2286;
        int i3 = i2 + 61;
        f2287 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 123;
        f2287 = i4 % 128;
        if (i4 % 2 != 0) {
            return com.moloco.sdk.publisher.Moloco.class;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bv bvVar = new com.ironsource.adqualitysdk.sdk.i.bv(mo7794());
        int i2 = f2287 + 11;
        f2286 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return bvVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2286 + 115;
        f2287 = i2 % 128;
        return (i2 % 2 == 0 ? m7818("県\ufb37潿펥䟦쨓", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) * 35897) : m7818("県\ufb37潿펥䟦쨓", 35897 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7818(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
            com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f2285);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
