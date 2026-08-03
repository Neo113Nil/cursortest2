package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class aj {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f324 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f325 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f326 = -5791257903350168093L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ai f327;

    public aj(com.ironsource.adqualitysdk.sdk.i.ai aiVar) {
        this.f327 = aiVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5982(com.ironsource.adqualitysdk.sdk.ISAdQualitySegment iSAdQualitySegment) {
        com.ironsource.adqualitysdk.sdk.i.ai aiVar;
        java.lang.String m5980;
        int i = 2 % 2;
        int i2 = f324 + 23;
        f325 = i2 % 128;
        if (i2 % 2 == 0) {
            aiVar = this.f327;
            m5980 = m5980("얐䫍\udb01桝\uf8bcৱ鹆⺃뿞찮嵹", 36684 % android.text.TextUtils.lastIndexOf("", 'I', 0));
        } else {
            aiVar = this.f327;
            m5980 = m5980("얐䫍\udb01桝\uf8bcৱ鹆⺃뿞찮嵹", android.text.TextUtils.lastIndexOf("", '0', 0) + 36684);
        }
        aiVar.m5956(m5980.intern(), m5981(iSAdQualitySegment));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static org.json.JSONObject m5981(com.ironsource.adqualitysdk.sdk.ISAdQualitySegment iSAdQualitySegment) {
        int i = 2 % 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!android.text.TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                jSONObject.put(m5980("얐戗誫㌷", 42899 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                jSONObject.put(m5980("얐\ue295讪냃", 10007 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), iSAdQualitySegment.getAge());
            }
            if (!android.text.TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m5980("얐\uf4c7꜀噄", 12611 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                jSONObject.put(m5980("얐讒妯\u2fd8", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 19997).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                int i2 = f325 + 91;
                f324 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(m5980("얐느⮄ꂓ", (-16746749) - android.graphics.Color.rgb(0, 0, 0)).intern(), iSAdQualitySegment.getIsPaying().get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                int i4 = f324 + 47;
                f325 = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.put(m5980("얐ؗ䊸轄쯣", android.graphics.Color.argb(0, 0, 0, 0) + 50077).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
                int i6 = f325 + 87;
                f324 = i6 % 128;
                int i7 = i6 % 2;
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                jSONObject.put(m5980("얐\udcef\uf772觬", 6521 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), iSAdQualitySegment.getUserCreationDate());
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m5980(java.lang.String str, int i) {
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
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f326);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
