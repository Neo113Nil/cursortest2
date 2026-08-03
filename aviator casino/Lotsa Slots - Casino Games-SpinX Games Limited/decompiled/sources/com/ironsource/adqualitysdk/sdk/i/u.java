package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class u<K, T> implements com.ironsource.adqualitysdk.sdk.i.t<K, T> {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f3201 = 37536;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3202 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3203 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f3204 = 55970;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f3205 = 51213;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f3206 = -7908161712958246690L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f3207 = 31722;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.t<K, T> f3208 = new com.ironsource.adqualitysdk.sdk.i.t<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.u.1
        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﻐ */
        public final void mo5817(org.json.JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﻐ */
        public final void mo5818(org.json.JSONObject jSONObject, K k, java.lang.Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﻛ */
        public final void mo5819(org.json.JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ｋ */
        public final void mo5820(org.json.JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ｋ */
        public final void mo5821(org.json.JSONObject jSONObject, K k, java.lang.Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﾇ */
        public final void mo5822(org.json.JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﾒ */
        public final void mo5823(org.json.JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﾒ */
        public final void mo5824(org.json.JSONObject jSONObject, K k, java.lang.Object obj, T t) {
        }
    };

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.t<K, T> f3209;

    /* renamed from: ﾒ */
    protected abstract java.lang.String mo5815(T t);

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8628(com.ironsource.adqualitysdk.sdk.i.t<K, T> tVar) {
        int i = 2 % 2;
        int i2 = f3203 + 51;
        f3202 = i2 % 128;
        int i3 = i2 % 2;
        this.f3209 = tVar;
        if (i3 == 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.t<K, T> m8626() {
        int i = 2 % 2;
        int i2 = f3203;
        int i3 = i2 + 83;
        f3202 = i3 % 128;
        if (i3 % 2 == 0) {
            com.ironsource.adqualitysdk.sdk.i.t<K, T> tVar = this.f3209;
            if (tVar != null) {
                int i4 = i2 + 11;
                f3202 = i4 % 128;
                if (i4 % 2 == 0) {
                    return tVar;
                }
                throw null;
            }
            return this.f3208;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ｋ */
    public void mo5820(org.json.JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f3203 + 33;
        f3202 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8623 = m8623(jSONObject, (org.json.JSONObject) t);
        m8624(m8627("炟\ueb71䝨ꏛᾛ穚홬㈿껧\u0a84敕섃㵠", 39883 - android.text.TextUtils.getTrimmedLength("")).intern(), m8623);
        m8626().mo5820(m8623, k, t);
        int i4 = f3203 + 31;
        f3202 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﻐ */
    public void mo5817(org.json.JSONObject jSONObject, K k, T t) {
        org.json.JSONObject m8623;
        int i;
        int i2 = 2 % 2;
        int i3 = f3202 + 53;
        f3203 = i3 % 128;
        if (i3 % 2 == 0) {
            m8623 = m8623(jSONObject, (org.json.JSONObject) t);
            i = 60588 >> (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1));
        } else {
            m8623 = m8623(jSONObject, (org.json.JSONObject) t);
            i = 60588 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        }
        m8624(m8627("炟鰗ꦤ뚽숃\uefccﲠࠉᗗ⊲乹寕棢瑲臐꺉멼쟂퓎", i).intern(), m8623);
        m8626().mo5817(m8623, k, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﻐ */
    public final void mo5818(org.json.JSONObject jSONObject, K k, java.lang.Object obj, T t) {
        int i = 2 % 2;
        int i2 = f3202 + 63;
        f3203 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8623 = m8623(jSONObject, (org.json.JSONObject) t);
        m8624(m8625("벂ㇽ篘涻㱛䨺⌉䃾韛⣹뾤椿", 11 - android.view.View.resolveSize(0, 0)).intern(), m8623);
        m8626().mo5818(m8623, k, obj, t);
        int i4 = f3203 + 25;
        f3202 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ｋ */
    public final void mo5821(org.json.JSONObject jSONObject, K k, java.lang.Object obj, T t) {
        int i = 2 % 2;
        int i2 = f3202 + 71;
        f3203 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8623 = m8623(jSONObject, (org.json.JSONObject) t);
        m8624(m8627("炟櫷䑤㹚ᦆ\uf336\ued73좮ꋓ鰏矼凷䬰╘\u0085墳푤쾰ꦎ", 6732 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')).intern(), m8623);
        m8626().mo5821(m8623, k, obj, t);
        int i4 = f3203 + 79;
        f3202 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﻛ */
    public final void mo5819(org.json.JSONObject jSONObject, K k, T t) {
        org.json.JSONObject m8623;
        int indexOf;
        int i = 2 % 2;
        int i2 = f3202 + 123;
        f3203 = i2 % 128;
        if (i2 % 2 == 0) {
            m8623 = m8623(jSONObject, (org.json.JSONObject) t);
            indexOf = 115 >> android.text.TextUtils.indexOf("", "");
        } else {
            m8623 = m8623(jSONObject, (org.json.JSONObject) t);
            indexOf = android.text.TextUtils.indexOf("", "") + 9;
        }
        m8624(m8625("벂ㇽ篘涻ﰐ땥ည싹ꇒⶱ", indexOf).intern(), m8623);
        m8626().mo5819(m8623, k, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﾇ */
    public final void mo5822(org.json.JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f3203 + 69;
        f3202 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8623 = m8623(jSONObject, (org.json.JSONObject) t);
        m8624(m8625("\uf7dd塵郇䅎늟\uedb1엪┾ꏢ\ud8d3ት酞竫瘪", 14 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m8623);
        m8626().mo5822(m8623, k, t);
        int i4 = f3202 + 125;
        f3203 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﾒ */
    public final void mo5824(org.json.JSONObject jSONObject, K k, java.lang.Object obj, T t) {
        org.json.JSONObject m8623;
        int rgb;
        int i = 2 % 2;
        int i2 = f3203 + 57;
        f3202 = i2 % 128;
        if (i2 % 2 != 0) {
            m8623 = m8623(jSONObject, (org.json.JSONObject) t);
            rgb = (-16729359) << android.graphics.Color.rgb(0, 1, 1);
        } else {
            m8623 = m8623(jSONObject, (org.json.JSONObject) t);
            rgb = (-16729359) - android.graphics.Color.rgb(0, 0, 0);
        }
        m8624(m8627("炉쩌՟䀭魿혝ᄝ氧Ꜣ\ue29d", rgb).intern(), m8623);
        m8626().mo5824(m8623, k, obj, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﾒ */
    public final void mo5823(org.json.JSONObject jSONObject, K k, T t) {
        org.json.JSONObject m8623;
        java.lang.String m8627;
        int i = 2 % 2;
        int i2 = f3202 + 57;
        f3203 = i2 % 128;
        if (i2 % 2 == 0) {
            m8623 = m8623(jSONObject, (org.json.JSONObject) t);
            m8627 = m8627("炝뿆\uee77ử䴅綒거\udb40ீ㩮櫲餅째", android.view.View.MeasureSpec.getSize(1) * 53101);
        } else {
            m8623 = m8623(jSONObject, (org.json.JSONObject) t);
            m8627 = m8627("炝뿆\uee77ử䴅綒거\udb40ீ㩮櫲餅째", 53101 - android.view.View.MeasureSpec.getSize(0));
        }
        m8624(m8627.intern(), m8623);
        m8626().mo5823(m8623, k, t);
        int i3 = f3202 + 25;
        f3203 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8624(java.lang.String str, org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        java.lang.String intern = m8625("벂ㇽ\u07bcᆭ\u0fdb\ue9df\ufb09モ겂鄰ǅ뮢\uf1f7㩘", 15 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(m8625("淧墅ᇸ侑", 3 - android.text.TextUtils.getOffsetBefore("", 0)).intern());
        sb.append(str);
        com.ironsource.adqualitysdk.sdk.i.m.m8521(intern, sb.toString(), jSONObject);
        int i2 = f3202 + 5;
        f3203 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private org.json.JSONObject m8623(org.json.JSONObject jSONObject, T t) {
        int i = 2 % 2;
        int i2 = f3202 + 17;
        f3203 = i2 % 128;
        try {
        } catch (org.json.JSONException e) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8625("벂ㇽ\u07bcᆭ\u0fdb\ue9df\ufb09モ겂鄰ǅ뮢\uf1f7㩘", android.view.KeyEvent.normalizeMetaState(0) + 14).intern(), m8625("膍￨ǅ뮢슛坊转㱗躻⍪דᴲᦄ蒫旝㮌뭾ࢯ〥ۤथꃲ텵淁鑎饵", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25).intern(), e);
        }
        if (i2 % 2 == 0) {
            jSONObject.has(com.ironsource.adqualitysdk.sdk.i.is.f2646);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!jSONObject.has(com.ironsource.adqualitysdk.sdk.i.is.f2646)) {
            jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2646, mo5815(t));
        }
        if (!jSONObject.has(com.ironsource.adqualitysdk.sdk.i.is.f2639)) {
            int i3 = f3203 + 103;
            f3202 = i3 % 128;
            if (i3 % 2 != 0) {
                jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2639, com.ironsource.adqualitysdk.sdk.i.ke.m8354());
                int i4 = 70 / 0;
            } else {
                jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2639, com.ironsource.adqualitysdk.sdk.i.ke.m8354());
            }
        }
        int i5 = f3203 + 17;
        f3202 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8627(java.lang.String str, int i) {
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
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f3206);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m8625(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
            char[] cArr4 = new char[2];
            while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3204)) ^ ((c2 >>> 5) + f3201)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3205) ^ ((c3 + i2) ^ ((c3 << 4) + f3207))));
                    i2 -= 40503;
                }
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
            }
            str2 = new java.lang.String(cArr3, 0, i);
        }
        return str2;
    }
}
