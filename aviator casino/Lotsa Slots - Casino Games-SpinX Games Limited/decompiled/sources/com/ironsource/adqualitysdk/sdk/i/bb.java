package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class bb {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f680 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f681 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f682 = 5584418390694236519L;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int[] f683 = {1302521272, 1328578204, -305951023, -1426252163, 1527490970, 984547986, 348708330, 707422475, -814732127, -64878030, 1714697240, 629694034, -574248288, 376575334, 1120734284, 246271334, 1856105617, 1804700826};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private android.os.Handler f685;

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ai f686;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener f688;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.util.Set<com.ironsource.adqualitysdk.sdk.i.iv> f687 = new java.util.HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.util.Set<java.lang.String> f684 = new java.util.HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ com.ironsource.adqualitysdk.sdk.i.ai m6271(com.ironsource.adqualitysdk.sdk.i.bb bbVar) {
        int i = 2 % 2;
        int i2 = f681 + 51;
        int i3 = i2 % 128;
        f680 = i3;
        int i4 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ai aiVar = bbVar.f686;
        int i5 = i3 + 25;
        f681 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return aiVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6272(com.ironsource.adqualitysdk.sdk.i.bb bbVar, java.lang.String str, org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f680 + 79;
        f681 = i2 % 128;
        int i3 = i2 % 2;
        bbVar.m6275(str, jSONObject);
        int i4 = f680 + 103;
        f681 = i4 % 128;
        int i5 = i4 % 2;
    }

    public bb(android.os.Handler handler, com.ironsource.adqualitysdk.sdk.i.ai aiVar) {
        this.f686 = aiVar;
        this.f685 = handler;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6289(com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f680;
        int i3 = i2 + 87;
        f681 = i3 % 128;
        int i4 = i3 % 2;
        this.f688 = iSAdQualityAdListener;
        if (i4 == 0) {
            int i5 = 56 / 0;
        }
        int i6 = i2 + 87;
        f681 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m6288(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f681 + 93;
        f680 = i2 % 128;
        if (i2 % 2 == 0) {
            int optInt = jSONObject.optInt(com.ironsource.adqualitysdk.sdk.i.is.f2644);
            com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener iSAdQualityAdListener = this.f688;
            if (iSAdQualityAdListener != null) {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(com.ironsource.adqualitysdk.sdk.i.is.f2647), com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.fromInt(optInt));
            }
            int i3 = f681 + 123;
            f680 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        jSONObject.optInt(com.ironsource.adqualitysdk.sdk.i.is.f2644);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m6287(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f681 + 13;
        int i3 = i2 % 128;
        f680 = i3;
        if (i2 % 2 == 0) {
            com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener iSAdQualityAdListener = this.f688;
            if (iSAdQualityAdListener != null) {
                int i4 = i3 + 33;
                f681 = i4 % 128;
                int i5 = i4 % 2;
                iSAdQualityAdListener.adClosed(jSONObject.optString(com.ironsource.adqualitysdk.sdk.i.is.f2647), com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.fromInt(jSONObject.optInt(com.ironsource.adqualitysdk.sdk.i.is.f2644)));
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m6285(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f681 + 11;
        f680 = i2 % 128;
        int i3 = i2 % 2;
        m6284(m6276("ᄆ\udcbf詥砉⟨ᖲ썠넛糋⪑ᡍ", 52667 - (android.view.ViewConfiguration.getTouchSlop() >> 8)).intern(), jSONObject);
        int i4 = f681 + 71;
        f680 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6291(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f680 + 5;
        f681 = i2 % 128;
        m6284((i2 % 2 == 0 ? m6276("ᄆ䊋똍\ueb95弨냘\ue45c姼赫\ue105劕", 31529 % (android.view.ViewConfiguration.getJumpTapTimeout() * 126)) : m6276("ᄆ䊋똍\ueb95弨냘\ue45c姼赫\ue105劕", 21391 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).intern(), jSONObject);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m6283(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f680 + 107;
        f681 = i2 % 128;
        int i3 = i2 % 2;
        m6284(m6277(new int[]{1463691676, -1433123454, 1515867932, -941772575, -21102536, -1019882919}, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 11).intern(), jSONObject);
        int i4 = f680 + 55;
        f681 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final void m6279(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f681 + 65;
        f680 = i2 % 128;
        int i3 = i2 % 2;
        m6284(m6276("ᄆ褭⅁\ud943熳\ue9cb臤㠋큊䡲", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 38953).intern(), jSONObject);
        int i4 = f680 + 53;
        f681 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final void m6281(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f680 + 41;
        f681 = i2 % 128;
        m6284((i2 % 2 == 0 ? m6277(new int[]{1463691676, -1433123454, 1573067451, 194623582, 1921680150, -1693854297}, 7 >>> (android.view.ViewConfiguration.getDoubleTapTimeout() + 34)) : m6277(new int[]{1463691676, -1433123454, 1573067451, 194623582, 1921680150, -1693854297}, 11 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).intern(), jSONObject);
        int i3 = f680 + 121;
        f681 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final void m6280(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f680 + 77;
        f681 = i2 % 128;
        m6284((i2 % 2 == 0 ? m6276("ᄆ맹䃩\uebcf닠巷\ue4ff迩囫\ue1dd裶双\ufada藊Ⳕ", android.text.TextUtils.indexOf("", "", 0, 1) * 43261) : m6276("ᄆ맹䃩\uebcf닠巷\ue4ff迩囫\ue1dd裶双\ufada藊Ⳕ", 43261 - android.text.TextUtils.indexOf("", "", 0, 0))).intern(), jSONObject);
        int i3 = f680 + 123;
        f681 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final void m6278(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f681 + 85;
        f680 = i2 % 128;
        int i3 = i2 % 2;
        m6284(m6277(new int[]{1463691676, -1433123454, 1518705358, 1721844485, 1207824468, 1423158039, 27542611, -2053500104}, 13 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), jSONObject);
        int i4 = f680 + 41;
        f681 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m6284(final java.lang.String str, final org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        this.f685.post(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                com.ironsource.adqualitysdk.sdk.i.bb.m6272(com.ironsource.adqualitysdk.sdk.i.bb.this, str, jSONObject);
            }
        });
        int i2 = f681 + 3;
        f680 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m6275(final java.lang.String str, org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        m6274(str, jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(com.ironsource.adqualitysdk.sdk.i.is.f2647, jSONObject.remove(com.ironsource.adqualitysdk.sdk.i.is.f2647));
            jSONObject2.put(com.ironsource.adqualitysdk.sdk.i.is.f2598, jSONObject.remove(com.ironsource.adqualitysdk.sdk.i.is.f2598));
            int i2 = f681 + 35;
            f680 = i2 % 128;
            int i3 = i2 % 2;
        } catch (org.json.JSONException unused) {
        }
        this.f686.m5952(str, jSONObject, jSONObject2, new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                if (com.ironsource.adqualitysdk.sdk.i.is.f2588.contains(str)) {
                    com.ironsource.adqualitysdk.sdk.i.p.m8546(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5825() {
                            com.ironsource.adqualitysdk.sdk.i.bb.m6271(com.ironsource.adqualitysdk.sdk.i.bb.this).m5957();
                        }
                    });
                }
            }
        });
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6290(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i = 2 % 2;
        int i2 = f681 + 91;
        f680 = i2 % 128;
        if (i2 % 2 != 0) {
            m6282(str, str2, str3, str4, null, false);
        } else {
            m6282(str, str2, str3, str4, null, false);
        }
        int i3 = f681 + 49;
        f680 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m6282(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, org.json.JSONObject jSONObject, boolean z) {
        synchronized (this.f684) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str3);
            sb.append(m6277(new int[]{674719476, 1327972638}, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern());
            sb.append(str2);
            java.lang.String obj = sb.toString();
            if (!this.f684.contains(obj) || z || com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6071()) {
                this.f684.add(obj);
                if (java.lang.Math.random() * 100.0d < m6273()) {
                    org.json.JSONObject m5925 = com.ironsource.adqualitysdk.sdk.i.ai.m5925(str, str2, str3, str4, jSONObject);
                    m6274(m6277(new int[]{-1251734152, 2009335512, -323863104, -2083360039}, 8 - android.view.View.resolveSizeAndState(0, 0, 0)).intern(), m5925);
                    this.f686.m5956(m6277(new int[]{-1251734152, 2009335512, -323863104, -2083360039}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7).intern(), m5925);
                    return;
                }
                com.ironsource.adqualitysdk.sdk.i.m.m8517(m6277(new int[]{-2085424400, 1115481503, 398542901, -313391963, 1626122443, -481508219}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11).intern(), m6276("ᄣ甛\ud93e㴻腒\ue57c䥽궝ㆡ閽秊巴ꇫЩ栤찮偅둭ᡯ糈삦⒨裌\uecea烫흊㭨齰\ue34f䝯ꭵྂ鏠\uf7a6宍뿈ϲ昝쨊\u2e74뉛ᙒ穧\ude85⊈蚾\ueace仐틳", 25621 - android.view.KeyEvent.getDeadChar(0, 0)).intern());
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m6274(java.lang.String str, org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        java.util.Iterator it = new java.util.HashSet(this.f687).iterator();
        while (!(!it.hasNext())) {
            int i2 = f680 + 25;
            f681 = i2 % 128;
            int i3 = i2 % 2;
            org.json.JSONObject mo6217 = ((com.ironsource.adqualitysdk.sdk.i.iv) it.next()).mo6217(str, jSONObject);
            if (mo6217 != null) {
                int i4 = f680 + 99;
                f681 = i4 % 128;
                int i5 = i4 % 2;
                com.ironsource.adqualitysdk.sdk.i.kj.m8422(jSONObject, mo6217);
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m6286(com.ironsource.adqualitysdk.sdk.i.iv ivVar) {
        int i = 2 % 2;
        int i2 = f681 + 3;
        f680 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f687.add(ivVar);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f687.add(ivVar);
        int i3 = f680 + 85;
        f681 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static double m6273() {
        int i = 2 % 2;
        if (!com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6056()) {
            int i2 = f681 + 19;
            f680 = i2 % 128;
            int i3 = i2 % 2;
            return com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6058();
        }
        int i4 = f680 + 87;
        f681 = i4 % 128;
        int i5 = i4 % 2;
        return 100.0d;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m6276(java.lang.String str, int i) {
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
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f682);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m6277(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f683.clone();
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
