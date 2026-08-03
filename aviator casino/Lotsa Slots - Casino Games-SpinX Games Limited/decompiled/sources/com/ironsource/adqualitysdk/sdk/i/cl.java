package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class cl {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1371 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1372 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ju f1373;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.cp f1374;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.w f1375;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.js f1376 = null;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private org.json.JSONObject f1377;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.dc f1378;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ee f1379;

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ic f1380;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ck f1381;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.be f1382;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f1370 = {1860317039, -1330722908, -322560091, 1444913596, -948547386, -416898581, -2004718925, -1526744215, 1446232069, 1496849647, 692336720, -878766901, 913135857, -386068479, -1129967580, -249245921, 537887988, 149874144};

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f1369 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m7166(com.ironsource.adqualitysdk.sdk.i.cl clVar, com.ironsource.adqualitysdk.sdk.i.iy iyVar, boolean z) {
        int i = 2 % 2;
        int i2 = f1371 + 49;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        clVar.m7192(iyVar, z);
        int i4 = f1372 + 47;
        f1371 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ com.ironsource.adqualitysdk.sdk.i.ee m7171(com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f1372;
        int i3 = i2 + 45;
        f1371 = i3 % 128;
        int i4 = i3 % 2;
        com.ironsource.adqualitysdk.sdk.i.ee eeVar = clVar.f1379;
        int i5 = i2 + 111;
        f1371 = i5 % 128;
        if (i5 % 2 == 0) {
            return eeVar;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7173(com.ironsource.adqualitysdk.sdk.i.cl clVar, java.lang.String str, boolean z, boolean z2, java.util.List list) {
        int i = 2 % 2;
        int i2 = f1371 + 11;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        clVar.m7195(str, z, z2, (java.util.List<java.lang.Object>) list);
        int i4 = f1372 + 49;
        f1371 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m7184(android.app.Activity activity, java.util.List list) {
        int i = 2 % 2;
        int i2 = f1371 + 65;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        boolean m7169 = m7169(activity, (java.util.List<java.lang.String>) list);
        int i4 = f1371 + 33;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
        return m7169;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ org.json.JSONObject m7190(com.ironsource.adqualitysdk.sdk.i.cl clVar, android.app.Activity activity, android.os.Bundle bundle) {
        int i = 2 % 2;
        int i2 = f1371 + 79;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m7180 = clVar.m7180(activity, bundle);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return m7180;
    }

    protected cl(com.ironsource.adqualitysdk.sdk.i.cp cpVar, com.ironsource.adqualitysdk.sdk.i.dc dcVar, com.ironsource.adqualitysdk.sdk.i.be beVar, com.ironsource.adqualitysdk.sdk.i.ic icVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        this.f1380 = icVar;
        com.ironsource.adqualitysdk.sdk.i.ee eeVar2 = new com.ironsource.adqualitysdk.sdk.i.ee(new java.util.HashMap(), eeVar, true);
        this.f1379 = eeVar2;
        eeVar2.m7714(m7207().m7929());
        eeVar.m7710(icVar.m7925(), this);
        this.f1378 = dcVar;
        this.f1382 = beVar;
        this.f1381 = m7153();
        this.f1374 = cpVar;
        this.f1375 = new com.ironsource.adqualitysdk.sdk.i.w();
        m7194(m7164(new int[]{1708820623, 1001152392, 1938309327, -962546325, -1009309914, 1480401082, 1325773384, 281166181, -1166893187, 1763790414, -1131240364, 1624549410, -224986543, 1191355930}, 26 - android.os.Process.getGidForName("")).intern(), new java.util.ArrayList());
        m7158();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.cp m7205() {
        int i = 2 % 2;
        int i2 = f1372;
        int i3 = i2 + 45;
        f1371 = i3 % 128;
        int i4 = i3 % 2;
        com.ironsource.adqualitysdk.sdk.i.cp cpVar = this.f1374;
        int i5 = i2 + 37;
        f1371 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return cpVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final android.content.Context m7211() {
        int i = 2 % 2;
        int i2 = f1371 + 3;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        android.content.Context m7286 = m7205().m7286();
        int i4 = f1371 + 65;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
        return m7286;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m7212(com.ironsource.adqualitysdk.sdk.i.iv ivVar) {
        int i = 2 % 2;
        int i2 = f1372 + 11;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        this.f1374.m7289().m6286(ivVar);
        int i4 = f1371 + 9;
        f1372 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m7204(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1371 + 67;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        this.f1377 = com.ironsource.adqualitysdk.sdk.i.kj.m8415(jSONObject, true);
        int i4 = f1371 + 69;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.dp m7159() {
        int i = 2 % 2;
        int i2 = f1372 + 113;
        f1371 = i2 % 128;
        if (i2 % 2 != 0) {
            m7205().m7288();
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.dp m7288 = m7205().m7288();
        int i3 = f1371 + 45;
        f1372 = i3 % 128;
        int i4 = i3 % 2;
        return m7288;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final org.json.JSONObject m7209() {
        int i = 2 % 2;
        int i2 = f1371;
        int i3 = i2 + 39;
        f1372 = i3 % 128;
        if (i3 % 2 == 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        org.json.JSONObject jSONObject = this.f1377;
        int i4 = i2 + 103;
        f1372 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ic m7207() {
        int i = 2 % 2;
        int i2 = f1371 + 77;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ic icVar = this.f1380;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return icVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.be m7203() {
        int i = 2 % 2;
        int i2 = f1372 + 19;
        int i3 = i2 % 128;
        f1371 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.be beVar = this.f1382;
        int i4 = i3 + 113;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
        return beVar;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.dc m7198() {
        int i = 2 % 2;
        int i2 = f1372 + 1;
        int i3 = i2 % 128;
        f1371 = i3;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.dc dcVar = this.f1378;
        int i4 = i3 + 81;
        f1372 = i4 % 128;
        if (i4 % 2 != 0) {
            return dcVar;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ck m7202() {
        int i = 2 % 2;
        int i2 = f1372 + 79;
        f1371 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1381;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ee m7199() {
        int i = 2 % 2;
        int i2 = f1372 + 113;
        f1371 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1379;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final java.lang.String m7200() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7205().m7300());
        sb.append(m7164(new int[]{-217390633, -1850455822}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1).intern());
        sb.append(m7207().m7925());
        java.lang.String obj = sb.toString();
        int i2 = f1371 + 13;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.dz m7206(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f1372 + 69;
        int i3 = i2 % 128;
        f1371 = i3;
        int i4 = i2 % 2;
        if (str == null) {
            return null;
        }
        int i5 = i3 + 109;
        f1372 = i5 % 128;
        if (i5 % 2 != 0) {
            return m7207().m7930(str);
        }
        m7207().m7930(str);
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private void m7158() {
        int i = 2 % 2;
        int i2 = f1372 + 117;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.dm> it = m7207().m7927().iterator();
        while (!(!it.hasNext())) {
            com.ironsource.adqualitysdk.sdk.i.dm next = it.next();
            if (m7175(next)) {
                int i4 = f1372 + 63;
                f1371 = i4 % 128;
                int i5 = i4 % 2;
                m7182(next);
            }
            int i6 = f1372 + 109;
            f1371 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private org.json.JSONObject m7165(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1371 + 27;
        f1372 = i2 % 128;
        if (i2 % 2 != 0) {
            org.json.JSONObject m7201 = m7201();
            com.ironsource.adqualitysdk.sdk.i.kj.m8422(m7201, jSONObject);
            int i3 = f1372 + 87;
            f1371 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 0;
            }
            return m7201;
        }
        com.ironsource.adqualitysdk.sdk.i.kj.m8422(m7201(), jSONObject);
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final org.json.JSONObject m7201() {
        int i = 2 % 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2647, m7205().m7299());
            jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2602, m7205().m7293());
            jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2598, m7205().m7295());
        } catch (org.json.JSONException e2) {
            java.lang.String intern = m7164(new int[]{1708820623, 1001152392, 1938309327, -962546325, -1009309914, 1480401082, 1325773384, 281166181}, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 17).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m7179(android.view.Gravity.getAbsoluteGravity(0, 0) + 27, true, 225 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), "\u0007\u0018\u0007ￂ\t\u0010\u000b\u0016\u0003\u0007\u0014\u0005ￂ\u0014\u0011\u0014\u0014\uffe7ￂￜ\u0010\u0011\u0015\fￂ\u0016\u0010", android.graphics.Color.alpha(0) + 18).intern());
            sb.append(e2.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
        }
        int i2 = f1372 + 63;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7182(com.ironsource.adqualitysdk.sdk.i.dm dmVar) {
        char c2;
        int i = 2 % 2;
        java.lang.String m7586 = dmVar.m7586();
        switch (m7586.hashCode()) {
            case -1825565413:
                if (m7586.equals(m7164(new int[]{1989079607, -53043683, 629314644, 412616326, 221114825, 964774119, 1364080971, 1117982860, -293436301, -618362377}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17).intern())) {
                    int i2 = f1372 + 41;
                    f1371 = i2 % 128;
                    if (i2 % 2 == 0) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                }
                c2 = 65535;
                break;
            case -1655966961:
                if (m7586.equals(m7179(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 9, true, 241 - android.text.TextUtils.getTrimmedLength(""), "￼\u0007\ufff6\ufff4\f\u0007￼\t", 4 - android.graphics.Color.red(0)).intern())) {
                    int i3 = f1371 + 79;
                    int i4 = i3 % 128;
                    f1372 = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 7;
                    f1371 = i6 % 128;
                    int i7 = i6 % 2;
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -787751952:
                if (m7586.equals(m7179(6 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 242, "\ufffb\u0000\ufff6\u0001\t\t", 4 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())).intern())) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3619493:
                if (m7586.equals(m7164(new int[]{-1750295589, 9689975}, 4 - android.view.KeyEvent.getDeadChar(0, 0)).intern())) {
                    int i8 = f1372;
                    int i9 = i8 + 99;
                    f1371 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i8 + 15;
                    f1371 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 2 / 2;
                    }
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1144592183:
                if (m7586.equals(m7164(new int[]{-910707418, 973586255, 1822206439, 823999236}, 8 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    int i13 = f1371 + 55;
                    f1372 = i13 % 128;
                    int i14 = i13 % 2;
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            m7191(dmVar);
            m7193(m7179((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 8, true, 289 - android.text.AndroidCharacter.getMirror('0'), "￼\u0007\ufff6\ufff4\f\u0007￼\t", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4).intern(), dmVar);
            int i15 = f1371 + 93;
            f1372 = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (c2 == 1) {
            m7161(dmVar);
            m7193(m7164(new int[]{-1750295589, 9689975}, android.graphics.Color.rgb(0, 0, 0) + 16777220).intern(), dmVar);
            return;
        }
        if (c2 == 2) {
            m7167(dmVar);
            m7193(m7179((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 6, false, 242 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\ufffb\u0000\ufff6\u0001\t\t", 5 - android.text.TextUtils.indexOf("", "", 0, 0)).intern(), dmVar);
            return;
        }
        if (c2 == 3) {
            if (this.f1376 == null) {
                this.f1376 = m7162(m7160(dmVar.m7587()));
                com.ironsource.adqualitysdk.sdk.i.jt.m8287().m8292(this.f1376);
                return;
            }
            return;
        }
        if (c2 != 4) {
            return;
        }
        this.f1373 = new com.ironsource.adqualitysdk.sdk.i.ju(m7185(m7160(dmVar.m7587())));
        int i16 = f1371 + 91;
        f1372 = i16 % 128;
        int i17 = i16 % 2;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    protected final void m7197() {
        int i = 2 % 2;
        m7155();
        m7157();
        m7156();
        if (this.f1376 != null) {
            com.ironsource.adqualitysdk.sdk.i.jt.m8287().m8288(this.f1376);
            this.f1376 = null;
            int i2 = f1371 + 23;
            f1372 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 3;
            }
        }
        com.ironsource.adqualitysdk.sdk.i.ju juVar = this.f1373;
        if (juVar != null) {
            int i4 = f1372 + 57;
            f1371 = i4 % 128;
            int i5 = i4 % 2;
            juVar.m8304();
            this.f1373 = null;
        }
        this.f1381 = null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7191(com.ironsource.adqualitysdk.sdk.i.dm dmVar) {
        com.ironsource.adqualitysdk.sdk.i.ja jaVar;
        int i = 2 % 2;
        org.json.JSONObject m7181 = m7181(dmVar.m7584());
        if (m7181 != null) {
            final java.lang.String m7582 = dmVar.m7582();
            if (!android.text.TextUtils.isEmpty(m7582)) {
                final com.ironsource.adqualitysdk.sdk.i.dz m7206 = m7206(m7582);
                if (m7206 != null) {
                    jaVar = new com.ironsource.adqualitysdk.sdk.i.ja() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.1

                        /* renamed from: ﮐ, reason: contains not printable characters */
                        private static int f1383 = 1;

                        /* renamed from: ﱡ, reason: contains not printable characters */
                        private static char f1384 = 39076;

                        /* renamed from: ﺙ, reason: contains not printable characters */
                        private static int f1385 = 0;

                        /* renamed from: ﻏ, reason: contains not printable characters */
                        private static char f1386 = 31488;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static char f1387 = 9466;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static char f1388 = 64344;

                        @Override // com.ironsource.adqualitysdk.sdk.i.ja
                        /* renamed from: ﾇ, reason: contains not printable characters */
                        public final java.util.List<android.webkit.WebView> mo7214(java.lang.Object obj) {
                            int i2 = 2 % 2;
                            int i3 = f1383 + 7;
                            f1385 = i3 % 128;
                            try {
                                if (i3 % 2 == 0) {
                                    java.util.List<android.webkit.WebView> list = (java.util.List) m7206.m7668(com.ironsource.adqualitysdk.sdk.i.cl.m7171(com.ironsource.adqualitysdk.sdk.i.cl.this), com.ironsource.adqualitysdk.sdk.i.cl.this, java.util.Collections.singletonList(obj)).m7681();
                                    int i4 = f1383 + 81;
                                    f1385 = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        return list;
                                    }
                                    throw null;
                                }
                                throw null;
                            } catch (java.lang.Exception unused) {
                                java.lang.String intern = m7213("睲ꎮ⟻\uf110嚫持胸䰌西偛\ue91cꕔ裝\ue3aeᵗ瘱", android.graphics.Color.blue(0) + 16).intern();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(m7213("鋐촎潹喚盏ቐꚜ叅쎳㈜蹩偪ꨴ噦ѵ\uf1ef\uf8ecᬔ\ud896쌑鰴禱\ud9ceꐃ潹喚ዺ䙽", (-16777188) - android.graphics.Color.rgb(0, 0, 0)).intern());
                                sb.append(m7582);
                                com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
                                return null;
                            }
                        }

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static java.lang.String m7213(java.lang.String str, int i2) {
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
                                    int i3 = 58224;
                                    for (int i4 = 0; i4 < 16; i4++) {
                                        char c2 = cArr4[1];
                                        char c3 = cArr4[0];
                                        char c4 = (char) (c2 - (((c3 + i3) ^ ((c3 << 4) + f1384)) ^ ((c3 >>> 5) + f1386)));
                                        cArr4[1] = c4;
                                        cArr4[0] = (char) (c3 - (((c4 >>> 5) + f1387) ^ ((c4 + i3) ^ ((c4 << 4) + f1388))));
                                        i3 -= 40503;
                                    }
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                                    com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
                                }
                                str2 = new java.lang.String(cArr3, 0, i2);
                            }
                            return str2;
                        }
                    };
                    m7183(m7181, m7178(false), m7178(true), jaVar);
                    int i2 = f1372 + 97;
                    f1371 = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    java.lang.String m7200 = m7200();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m7179((android.view.KeyEvent.getMaxKeyCode() >> 16) + 22, true, 226 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0006\u0005\uffc1\u0005\u0010\t\u0015\u0006￮\uffc1\u0013\u0010\u0007\uffc1\u000f\u0010\n\u0015\n\u000f\n\u0007", android.text.AndroidCharacter.getMirror('0') - '\'').intern());
                    sb.append(m7582);
                    sb.append(m7164(new int[]{-1087524044, -2062297587, 1512150997, -217056271, -283034133, 357507171}, 10 - android.view.View.MeasureSpec.getSize(0)).intern());
                    com.ironsource.adqualitysdk.sdk.i.cn.m7270(m7200, sb.toString());
                }
            }
            jaVar = null;
            m7183(m7181, m7178(false), m7178(true), jaVar);
            int i22 = f1372 + 97;
            f1371 = i22 % 128;
            int i32 = i22 % 2;
        }
        int i4 = f1371 + 45;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7183(org.json.JSONObject jSONObject, com.ironsource.adqualitysdk.sdk.i.l lVar, com.ironsource.adqualitysdk.sdk.i.l lVar2, com.ironsource.adqualitysdk.sdk.i.ja jaVar) {
        int i = 2 % 2;
        int i2 = f1371 + 11;
        f1372 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1375.m8640(jSONObject, m7177(lVar, lVar2), m7154(), jaVar);
            throw null;
        }
        this.f1375.m8640(jSONObject, m7177(lVar, lVar2), m7154(), jaVar);
        int i3 = f1371 + 21;
        f1372 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7161(com.ironsource.adqualitysdk.sdk.i.dm dmVar) {
        int i = 2 % 2;
        org.json.JSONObject m7181 = m7181(dmVar.m7584());
        if (m7181 != null) {
            int i2 = f1372 + 47;
            f1371 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String m7583 = dmVar.m7583();
            com.ironsource.adqualitysdk.sdk.i.q m7172 = m7172(true);
            com.ironsource.adqualitysdk.sdk.i.q m71722 = m7172(false);
            if (android.text.TextUtils.isEmpty(m7583)) {
                m7168(m7181, m71722, m7172);
                int i4 = f1372 + 9;
                f1371 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            final com.ironsource.adqualitysdk.sdk.i.dz m7206 = m7206(m7583);
            if (m7206 != null) {
                m7196(m7181, m71722, m7172, new com.ironsource.adqualitysdk.sdk.i.jc() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.jc
                    /* renamed from: ｋ, reason: contains not printable characters */
                    public final boolean mo7215(android.view.View view) {
                        return m7206.m7668(com.ironsource.adqualitysdk.sdk.i.cl.m7171(com.ironsource.adqualitysdk.sdk.i.cl.this), com.ironsource.adqualitysdk.sdk.i.cl.this, java.util.Collections.singletonList(view)).m7679();
                    }
                });
                int i6 = f1371 + 53;
                f1372 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                return;
            }
            java.lang.String m7200 = m7200();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m7179((android.view.ViewConfiguration.getTouchSlop() >> 8) + 22, true, 227 - android.graphics.Color.green(0), "\u0006\u0005\uffc1\u0005\u0010\t\u0015\u0006￮\uffc1\u0013\u0010\u0007\uffc1\u000f\u0010\n\u0015\n\u000f\n\u0007", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 9).intern());
            sb.append(m7583);
            sb.append(m7164(new int[]{-1087524044, -2062297587, 1512150997, -217056271, -283034133, 357507171}, android.graphics.Color.argb(0, 0, 0, 0) + 10).intern());
            com.ironsource.adqualitysdk.sdk.i.cn.m7270(m7200, sb.toString());
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7167(com.ironsource.adqualitysdk.sdk.i.dm dmVar) {
        int i = 2 % 2;
        org.json.JSONObject m7181 = m7181(dmVar.m7584());
        if (m7181 != null) {
            int i2 = f1372 + 57;
            f1371 = i2 % 128;
            int i3 = i2 % 2;
            m7174(m7181, m7163(false), m7163(true));
            int i4 = f1371 + 121;
            f1372 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f1372 + 101;
        f1371 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 12 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7193(java.lang.String str, com.ironsource.adqualitysdk.sdk.i.dm dmVar) {
        int i = 2 % 2;
        int i2 = f1372 + 121;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m7181 = m7181(dmVar.m7584());
        if (m7181 == null || !m7181.has(m7179(android.graphics.Color.red(0) + 18, true, android.text.TextUtils.lastIndexOf("", '0', 0) + 238, "￫\u0005\u0006\u0000\u000b\ufffa￼\u000b￼ￛ\uffff\ufffa\f\u0006\u000b￼\u0007\u0010", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 15).intern())) {
            return;
        }
        int i4 = f1371 + 87;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
        com.ironsource.adqualitysdk.sdk.i.jw.e m8314 = com.ironsource.adqualitysdk.sdk.i.jw.e.m8314(m7181.optString(m7179(18 - (android.os.Process.myTid() >> 22), true, 237 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "￫\u0005\u0006\u0000\u000b\ufffa￼\u000b￼ￛ\uffff\ufffa\f\u0006\u000b￼\u0007\u0010", 15 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)).intern(), null));
        java.lang.String m7189 = m7189(str, m7181);
        if (m8314 != null) {
            int i6 = f1371 + 113;
            f1372 = i6 % 128;
            if (i6 % 2 != 0) {
                com.ironsource.adqualitysdk.sdk.i.jw.m8305().m8312(m7189, m8314);
            } else {
                com.ironsource.adqualitysdk.sdk.i.jw.m8305().m8312(m7189, m8314);
                throw null;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7174(org.json.JSONObject jSONObject, com.ironsource.adqualitysdk.sdk.i.v vVar, com.ironsource.adqualitysdk.sdk.i.v vVar2) {
        int i = 2 % 2;
        int i2 = f1372 + 73;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        this.f1375.m8638(jSONObject, m7187(vVar, vVar2));
        int i4 = f1371 + 45;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private void m7156() {
        int i = 2 % 2;
        int i2 = f1371 + 61;
        f1372 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1375.m8637();
            int i3 = 61 / 0;
        } else {
            this.f1375.m8637();
        }
        int i4 = f1372 + 35;
        f1371 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7168(org.json.JSONObject jSONObject, com.ironsource.adqualitysdk.sdk.i.q qVar, com.ironsource.adqualitysdk.sdk.i.q qVar2) {
        int i = 2 % 2;
        int i2 = f1371 + 113;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        this.f1375.m8636(jSONObject, m7186(qVar, qVar2));
        int i4 = f1372 + 97;
        f1371 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7196(org.json.JSONObject jSONObject, com.ironsource.adqualitysdk.sdk.i.q qVar, com.ironsource.adqualitysdk.sdk.i.q qVar2, com.ironsource.adqualitysdk.sdk.i.jc jcVar) {
        int i = 2 % 2;
        int i2 = f1371 + 67;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        this.f1375.m8641(jSONObject, m7186(qVar, qVar2), jcVar);
        int i4 = f1372 + 83;
        f1371 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6 != com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.UNKNOWN) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r6 != com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.UNKNOWN) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r1.contains(r6) == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        return true;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m7175(com.ironsource.adqualitysdk.sdk.i.dm dmVar) {
        int i = 2 % 2;
        int i2 = f1371 + 115;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List mo6039 = com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6039();
        com.ironsource.adqualitysdk.sdk.ISAdQualityAdType m7585 = dmVar.m7585();
        if (mo6039 != null) {
            int i4 = f1372 + 105;
            f1371 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
        }
        int i6 = f1372 + 27;
        f1371 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private void m7157() {
        int i = 2 % 2;
        int i2 = f1371 + 85;
        f1372 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1375.m8639();
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f1375.m8639();
        int i3 = f1371 + 85;
        f1372 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7189(java.lang.String str, org.json.JSONObject jSONObject) {
        char c2;
        int i = 2 % 2;
        int hashCode = str.hashCode();
        if (hashCode == -1655966961) {
            if (str.equals(m7179(8 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), true, android.view.View.MeasureSpec.getSize(0) + 241, "￼\u0007\ufff6\ufff4\f\u0007￼\t", 3 - android.os.Process.getGidForName("")).intern())) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != -787751952) {
            if (hashCode == 3619493 && str.equals(m7164(new int[]{-1750295589, 9689975}, 4 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                int i2 = f1371 + 49;
                f1372 = i2 % 128;
                int i3 = i2 % 2;
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals(m7179((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6, false, 242 - (android.os.Process.myTid() >> 22), "\ufffb\u0000\ufff6\u0001\t\t", 4 - android.graphics.ImageFormat.getBitsPerPixel(0)).intern())) {
                int i4 = f1372 + 89;
                f1371 = i4 % 128;
                int i5 = i4 % 2;
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            return jSONObject.optString(m7164(new int[]{-1622968713, -1357284248, -536694828, -468983844, -2027944240, -8801527, 493075085, -18242798}, 13 - android.text.TextUtils.lastIndexOf("", '0', 0, 0)).intern(), null);
        }
        if (c2 == 1) {
            return jSONObject.optString(m7179((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, false, 231 - android.view.KeyEvent.keyCodeFromString(""), "\n\u0002\ufffe\u0001\ufff3\u0006\u0002\u0014￠\t\ufffe\u0010\u0010￫\ufffe", android.text.TextUtils.getOffsetBefore("", 0) + 2).intern(), null);
        }
        if (c2 != 2) {
            return null;
        }
        return jSONObject.optString(m7164(new int[]{-1750295589, 9689975, -1173875190, 450753665, 1107441653, 195144600, -293436301, -618362377}, 12 - android.view.MotionEvent.axisFromString("")).intern(), null);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.js m7162(final java.util.List<java.lang.String> list) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.js jsVar = new com.ironsource.adqualitysdk.sdk.i.js() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.8

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f1440 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f1441 = 1384324612079449931L;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f1442 = 0;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static long f1443 = 4240266721058687362L;

            /* renamed from: ﻛ, reason: contains not printable characters */
            static /* synthetic */ void m7249(com.ironsource.adqualitysdk.sdk.i.cl.AnonymousClass8 anonymousClass8, java.lang.String str, java.util.List list2) {
                int i2 = 2 % 2;
                int i3 = f1440 + 67;
                f1442 = i3 % 128;
                int i4 = i3 % 2;
                anonymousClass8.m7252(str, false, list2);
                int i5 = f1442 + 47;
                f1440 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* renamed from: ﾇ */
            public final void mo5967(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1440 + 103;
                f1442 = i3 % 128;
                int i4 = i3 % 2;
                m7250(m7248("ꉮꈁℌ䗪\u0fee⣠嚯ጘ萖໕粃䴎\uee0a瓊᪑机퀗嫵삝脗㨼胁\ueebb묦ᰢ", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16).intern(), activity);
                int i5 = f1442 + 123;
                f1440 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 42 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* renamed from: ﾒ */
            public final void mo5968(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1442 + 83;
                f1440 = i3 % 128;
                int i4 = i3 % 2;
                m7250(m7248("彎弡\u2ef8룻鿭✔ꮾ茛礶Ġ膒\udd17ጫ笘\ue781\uf71eⴲ唶㶈ᄵ윁輨Ꮊ⬬\ue114\ue93d榢䔭묚", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), activity);
                int i5 = f1440 + 59;
                f1442 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = f1442 + 103;
                f1440 = i3 % 128;
                int i4 = i3 % 2;
                if (com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list)) {
                    int i5 = f1440 + 121;
                    f1442 = i5 % 128;
                    m7254((i5 % 2 != 0 ? m7253("眤ᤖ\uab6c㶱쿳凝\ue20f瑇ڧ꣹㫶쬈嵊\uefbd燵ϓ鐟", 16823 / (android.view.ViewConfiguration.getEdgeSlop() / 37)) : m7253("眤ᤖ\uab6c㶱쿳凝\ue20f瑇ڧ꣹㫶쬈嵊\uefbd燵ϓ鐟", 28211 - (android.view.ViewConfiguration.getEdgeSlop() >> 16))).intern(), activity, bundle);
                }
                int i6 = f1440 + 23;
                f1442 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 37 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1440 + 65;
                f1442 = i3 % 128;
                int i4 = i3 % 2;
                if (com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list)) {
                    m7250(m7253("眤ᴘꍰ䦟\udfcb搓\u0a53邉⛗쬗兺\ue7a0跶ሠ롩亽퓿", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27197).intern(), activity);
                }
                int i5 = f1442 + 79;
                f1440 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1440 + 91;
                f1442 = i3 % 128;
                int i4 = i3 % 2;
                if (!(!com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list))) {
                    m7250(m7248("絋紤꺿퇀\uf395ꝓ슅\uef70嬷腜\ue8ba녲ㄯﭔ躆魦༠핐咱絮\ue50f", android.view.ViewConfiguration.getLongPressTimeout() >> 16).intern(), activity);
                }
                int i5 = f1442 + 65;
                f1440 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1440 + 15;
                f1442 = i3 % 128;
                int i4 = i3 % 2;
                if (!(!com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list))) {
                    int i5 = f1442 + 77;
                    f1440 = i5 % 128;
                    int i6 = i5 % 2;
                    m7250(m7248("⑁\u242e똾㈉赀뿒⅌醥Ƚ駝୳쾧栥\ue3d5浍\ue5b7嘬췗띰κ", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), activity);
                    int i7 = f1442 + 107;
                    f1440 = i7 % 128;
                    int i8 = i7 % 2;
                }
                int i9 = f1440 + 89;
                f1442 = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1440 + 7;
                f1442 = i3 % 128;
                java.lang.Object obj = null;
                if (i3 % 2 == 0) {
                    if (com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list)) {
                        m7250(m7253("眤뜒\uf764㞍矣똱\uf677㚣皇뛝\uf53e㕢疰뗰\uf439㐗瑟", 49255 - android.text.AndroidCharacter.getMirror('0')).intern(), activity);
                    }
                    int i4 = f1440 + 119;
                    f1442 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    super.hashCode();
                    throw null;
                }
                com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list);
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = f1440 + 93;
                f1442 = i3 % 128;
                if (i3 % 2 == 0) {
                    if (com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list)) {
                        m7254(m7248("蠞衱◃\ud7ffᜯⰯ쒺ொ깢ਠ\uee85嗈쑺瀨袸翘並帼努駟၍萕粺ꏧ㙕\ue20cڀ췵汏젅₮", android.view.View.resolveSizeAndState(0, 0, 0)).intern(), activity, bundle);
                        int i4 = f1442 + 97;
                        f1440 = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                    return;
                }
                com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list);
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1442 + 3;
                f1440 = i3 % 128;
                int i4 = i3 % 2;
                if (com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list)) {
                    int i5 = f1440 + 33;
                    f1442 = i5 % 128;
                    int i6 = i5 % 2;
                    m7250(m7248("ﰔﱻ\uf3beฬ휾禍ᵩ쯛\uaa05d㝖闙끰ꙕ兼뿍蹿衐譂姏摍剹ꕬ", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), activity);
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private void m7250(java.lang.String str, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1440 + 57;
                f1442 = i3 % 128;
                int i4 = i3 % 2;
                m7251(str, java.util.Collections.singletonList(activity));
                if (i4 != 0) {
                    int i5 = 91 / 0;
                }
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private void m7254(java.lang.String str, android.app.Activity activity, android.os.Bundle bundle) {
                java.util.List<java.lang.Object> asList;
                int i2 = 2 % 2;
                int i3 = f1440 + 31;
                f1442 = i3 % 128;
                java.lang.Object[] objArr = new java.lang.Object[2];
                if (i3 % 2 != 0) {
                    objArr[1] = activity;
                    objArr[1] = bundle;
                    asList = java.util.Arrays.asList(objArr);
                } else {
                    objArr[0] = activity;
                    objArr[1] = bundle;
                    asList = java.util.Arrays.asList(objArr);
                }
                m7251(str, asList);
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private void m7251(final java.lang.String str, final java.util.List<java.lang.Object> list2) {
                int i2 = 2 % 2;
                m7252(str, true, list2);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.8.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5825() {
                        com.ironsource.adqualitysdk.sdk.i.cl.AnonymousClass8.m7249(com.ironsource.adqualitysdk.sdk.i.cl.AnonymousClass8.this, str, list2);
                    }
                });
                int i3 = f1442 + 23;
                f1440 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private void m7252(java.lang.String str, boolean z, java.util.List<java.lang.Object> list2) {
                int i2 = 2 % 2;
                com.ironsource.adqualitysdk.sdk.i.cl clVar = com.ironsource.adqualitysdk.sdk.i.cl.this;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7248("\uf82a\uf86b슦쮶㒐쭇\ud8c6⡿\ude54\ued45\uf2ce癧둶靝铄屣詑륅仉멢息挪", android.text.TextUtils.getTrimmedLength("")).intern());
                sb.append(str);
                com.ironsource.adqualitysdk.sdk.i.cl.m7173(clVar, sb.toString(), z, false, list2);
                int i3 = f1440 + 59;
                f1442 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static java.lang.String m7248(java.lang.String str, int i2) {
                java.lang.String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
                    char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f1443, cArr2, i2);
                    com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
                    while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                        com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                        m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f1443));
                        com.ironsource.adqualitysdk.sdk.i.g.f2167++;
                    }
                    str2 = new java.lang.String(m7782, 4, m7782.length - 4);
                }
                return str2;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static java.lang.String m7253(java.lang.String str, int i2) {
                java.lang.String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
                    com.ironsource.adqualitysdk.sdk.i.i.f2465 = i2;
                    char[] cArr3 = new char[cArr2.length];
                    com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                        cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f1441);
                        com.ironsource.adqualitysdk.sdk.i.i.f2463++;
                    }
                    str2 = new java.lang.String(cArr3);
                }
                return str2;
            }
        };
        int i2 = f1371 + 43;
        f1372 = i2 % 128;
        if (i2 % 2 != 0) {
            return jsVar;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m7169(android.app.Activity activity, java.util.List<java.lang.String> list) {
        int i = 2 % 2;
        int i2 = f1371 + 105;
        f1372 = i2 % 128;
        if (i2 % 2 == 0) {
            list.isEmpty();
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!list.isEmpty()) {
            int i3 = f1371 + 71;
            f1372 = i3 % 128;
            int i4 = i3 % 2;
            if (!list.contains(activity.getClass().getName())) {
                return false;
            }
        }
        int i5 = f1371 + 107;
        f1372 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private org.json.JSONObject m7181(org.json.JSONObject jSONObject) {
        com.ironsource.adqualitysdk.sdk.i.dp m7159;
        int i = 2 % 2;
        int i2 = f1371 + 119;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String optString = jSONObject.optString(m7164(new int[]{-351458919, 1379877152, 1710041998, 2053221501}, 8 - (android.os.Process.myPid() >> 22)).intern());
        jSONObject.remove(m7164(new int[]{-351458919, 1379877152, 1710041998, 2053221501}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8).intern());
        if (jSONObject.optBoolean(m7164(new int[]{-2106335768, 544960815, -520832964, 803362800}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 8).intern()) && (m7159 = m7159()) != null) {
            if (!android.text.TextUtils.isEmpty(m7159.m7593())) {
                jSONObject.remove(m7164(new int[]{-2106335768, 544960815, -520832964, 803362800}, 7 - android.text.TextUtils.lastIndexOf("", '0')).intern());
                try {
                    java.lang.String intern = m7179(10 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 234, "\u0004\u000e�\uffff\u0004\b￣\t￮\r", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1).intern();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(optString);
                    sb.append(m7159.m7593());
                    jSONObject.put(intern, sb.toString());
                } catch (org.json.JSONException unused) {
                }
            }
            if (m7159.m7596()) {
                int i4 = f1372 + 101;
                f1371 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    jSONObject.put(m7164(new int[]{-350757570, -965237085, -945804904, -224094103, -1631001599, -413038060}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10).intern(), true);
                    int i6 = f1372 + 19;
                    f1371 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (org.json.JSONException unused2) {
                }
            }
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            if (!m7170(jSONObject, keys.next())) {
                return null;
            }
        }
        return jSONObject;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m7170(org.json.JSONObject jSONObject, java.lang.String str) {
        int i = 2 % 2;
        java.lang.Object opt = jSONObject.opt(str);
        try {
            if (!(opt instanceof java.lang.String)) {
                if (!(opt instanceof org.json.JSONArray)) {
                    return true;
                }
                jSONObject.put(str, new org.json.JSONArray((java.util.Collection) m7160(com.ironsource.adqualitysdk.sdk.i.kj.m8406((org.json.JSONArray) opt))));
            } else {
                int i2 = f1371 + 39;
                f1372 = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.String str2 = (java.lang.String) opt;
                    if (!m7176(str2)) {
                        return true;
                    }
                    java.lang.String m7188 = m7188(str2);
                    if (m7188 != null) {
                        jSONObject.put(str, m7188);
                    } else {
                        java.lang.String m7200 = m7200();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(m7164(new int[]{-1173875190, 450753665, -767548341, 550604511}, 6 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
                        sb.append(str2);
                        sb.append(m7164(new int[]{-1087524044, -2062297587, 1512150997, -217056271, -331715480, 1226089477, -831609404, -2096967992, 797587097, 997234958, -1645165983, -1643683666, -1412580647, 548486877, 68730649, 274581715, 392681614, -1816707418}, 36 - android.view.KeyEvent.getDeadChar(0, 0)).intern());
                        com.ironsource.adqualitysdk.sdk.i.cn.m7268(m7200, sb.toString());
                        int i3 = f1371 + 77;
                        f1372 = i3 % 128;
                        int i4 = i3 % 2;
                        return false;
                    }
                } else {
                    m7176((java.lang.String) opt);
                    java.lang.Object obj = null;
                    super.hashCode();
                    throw null;
                }
            }
            return true;
        } catch (org.json.JSONException unused) {
            return true;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.util.List<java.lang.String> m7160(java.util.List<java.lang.String> list) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = f1371 + 85;
            f1372 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String next = it.next();
            if (m7176(next)) {
                java.lang.String m7188 = m7188(next);
                if (m7188 != null) {
                    int i4 = f1372 + 89;
                    f1371 = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add(m7188);
                }
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String m7188(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f1372 + 83;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Class m6377 = m7203().m6377(com.ironsource.adqualitysdk.sdk.i.kn.m8470(str, m7179(android.view.MotionEvent.axisFromString("") + 7, false, android.text.TextUtils.lastIndexOf("", '0', 0) + 229, "\u0013ￎ\u0003\f\u0001\u0013", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()));
        if (m6377 == null) {
            return null;
        }
        java.lang.String name = m6377.getName();
        int i4 = f1372 + 91;
        f1371 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return name;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m7176(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f1371 + 99;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        boolean endsWith = str.endsWith(m7179(6 - (android.os.Process.myPid() >> 22), false, android.view.KeyEvent.getDeadChar(0, 0) + 228, "\u0013ￎ\u0003\f\u0001\u0013", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern());
        int i4 = f1371 + 53;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
        return endsWith;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.l m7178(final boolean z) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.l lVar = new com.ironsource.adqualitysdk.sdk.i.l() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.14

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f1408 = 0;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f1409 = -6396935853194111139L;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f1410 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5817(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1410 + 15;
                f1408 = i3 % 128;
                int i4 = i3 % 2;
                mo5817(jSONObject, webView, activity);
                int i5 = f1410 + 117;
                f1408 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5818(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1410 + 23;
                f1408 = i3 % 128;
                int i4 = i3 % 2;
                mo5818(jSONObject, webView, obj, activity);
                if (i4 != 0) {
                    java.lang.Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
                int i5 = f1408 + 37;
                f1410 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 91 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5819(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1410 + 119;
                f1408 = i3 % 128;
                int i4 = i3 % 2;
                mo5819(jSONObject, webView, activity);
                int i5 = f1410 + 125;
                f1408 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5820(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1408 + 45;
                f1410 = i3 % 128;
                int i4 = i3 % 2;
                mo5820(jSONObject, webView, activity);
                if (i4 == 0) {
                    java.lang.Object obj = null;
                    super.hashCode();
                    throw null;
                }
                int i5 = f1410 + 111;
                f1408 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5821(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1410 + 37;
                f1408 = i3 % 128;
                int i4 = i3 % 2;
                mo5821(jSONObject, webView, obj, activity);
                if (i4 != 0) {
                    int i5 = 38 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5822(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1408 + 19;
                f1410 = i3 % 128;
                int i4 = i3 % 2;
                mo5822(jSONObject, webView, activity);
                if (i4 != 0) {
                    return;
                }
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5823(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1408 + 59;
                f1410 = i3 % 128;
                int i4 = i3 % 2;
                mo5823(jSONObject, webView, activity);
                int i5 = f1408 + 115;
                f1410 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5824(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1410 + 71;
                f1408 = i3 % 128;
                int i4 = i3 % 2;
                mo5824(jSONObject, webView, obj, activity);
                int i5 = f1408 + 61;
                f1410 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                java.lang.Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾇ */
            public final void mo5820(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1410 + 67;
                f1408 = i3 % 128;
                m7244(m7245("ᶿᷞꥣ\ue84b戦㹚욵ꑘ䂸巂搉䇌Ꜯףּƍ", (android.os.Process.getElapsedCpuTime() > (i3 % 2 != 0 ? 1L : 0L) ? 1 : (android.os.Process.getElapsedCpuTime() == (i3 % 2 != 0 ? 1L : 0L) ? 0 : -1))).intern(), jSONObject, webView, null, activity);
                int i4 = f1410 + 83;
                f1408 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ */
            public final void mo5817(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1408 + 69;
                f1410 = i3 % 128;
                int i4 = i3 % 2;
                m7244(m7245("檹櫘\ue4d4ꄎﮏ班述㷱㞾ၵⵌ\ud865퀨뛴䣈笵犝䬙\ue66a▝", 1 - android.view.KeyEvent.keyCodeFromString("")).intern(), jSONObject, webView, null, activity);
                int i5 = f1408 + 15;
                f1410 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ */
            public final void mo5821(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                int trimmedLength;
                int i2 = 2 % 2;
                int i3 = f1408 + 33;
                f1410 = i3 % 128;
                if (i3 % 2 == 0) {
                    android.text.TextUtils.getTrimmedLength("");
                    trimmedLength = 0;
                } else {
                    trimmedLength = android.text.TextUtils.getTrimmedLength("") + 1;
                }
                m7244(m7245("희휍䉰ᆠⅣ핉㽙\ue718話뛂鷥ʍ淠", trimmedLength).intern(), jSONObject, webView, obj, activity);
                int i4 = f1410 + 55;
                f1408 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ */
            public final void mo5818(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1408 + 121;
                f1410 = i3 % 128;
                m7244(m7245("ﵾﴟ\ue95e끯い繧麖\uf63fꁣᷬ㰪Ꭺ䟲뭝妿냔\ue54f䚭\uf70a", i3 % 2 == 0 ? 1 << android.view.View.resolveSizeAndState(0, 1, 1) : android.view.View.resolveSizeAndState(0, 0, 0) + 1).intern(), jSONObject, webView, obj, activity);
                int i4 = f1410 + 27;
                f1408 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ */
            public final void mo5819(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1410 + 101;
                f1408 = i3 % 128;
                int i4 = i3 % 2;
                m7244(m7245("搃摢퍁닭㘸䑸鰔\uf043㤘⟣㺦ᗗ", 1 - android.text.TextUtils.getOffsetBefore("", 0)).intern(), jSONObject, webView, null, activity);
                int i5 = f1410 + 125;
                f1408 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾒ */
            public final void mo5822(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1410 + 125;
                f1408 = i3 % 128;
                m7244(m7245("ℹ⅏ܪ镬픖逞뮳፶簌\uf38fᤶ\uf6fc鮲唇粫喍", ((i3 % 2 != 0 ? android.util.TypedValue.complexToFloat(1) : android.util.TypedValue.complexToFloat(0)) > 0.0f ? 1 : ((i3 % 2 != 0 ? android.util.TypedValue.complexToFloat(1) : android.util.TypedValue.complexToFloat(0)) == 0.0f ? 0 : -1)) + 1).intern(), jSONObject, webView, null, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ */
            public final void mo5824(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1408 + 35;
                f1410 = i3 % 128;
                m7244(m7245("ꇻꆌ臜ꙙ轱ᛤ袁䤥ﳧ畿⨘겗᭶폚侗\u0fe7맂⸋\ue13b兇푝貔ʽ듢", i3 % 2 == 0 ? 0 % android.view.KeyEvent.keyCodeFromString("") : 1 - android.view.KeyEvent.keyCodeFromString("")).intern(), jSONObject, webView, obj, activity);
                int i4 = f1408 + 49;
                f1410 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ */
            public final void mo5823(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                java.lang.String m7245;
                int i2 = 2 % 2;
                int i3 = f1408 + 17;
                f1410 = i3 % 128;
                if (i3 % 2 == 0) {
                    android.os.Process.getThreadPriority(0);
                    m7245 = m7245("紷絔ꦸ堻춻㺐盲\u0bd8\u202c崄푐\uee46잺ﮓ뇭", 0);
                } else {
                    m7245 = m7245("紷絔ꦸ堻춻㺐盲\u0bd8\u202c崄푐\uee46잺ﮓ뇭", 1 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                }
                m7244(m7245.intern(), jSONObject, webView, null, activity);
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private void m7244(java.lang.String str, org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                com.ironsource.adqualitysdk.sdk.i.cl clVar = com.ironsource.adqualitysdk.sdk.i.cl.this;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7245("좼죽ﾑꗣ㫱梯謭ﲏ閾\u0b29⦹ᤃ爕궰䰍멧킓停\ue290\ue4ec봉\uf2ceŇ", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                sb.append(str);
                com.ironsource.adqualitysdk.sdk.i.cl.m7173(clVar, sb.toString(), z, false, java.util.Arrays.asList(jSONObject, webView, obj, activity));
                int i3 = f1410 + 19;
                f1408 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static java.lang.String m7245(java.lang.String str, int i2) {
                java.lang.String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
                    char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f1409, cArr2, i2);
                    com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
                    while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                        com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                        m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f1409));
                        com.ironsource.adqualitysdk.sdk.i.g.f2167++;
                    }
                    str2 = new java.lang.String(m7782, 4, m7782.length - 4);
                }
                return str2;
            }
        };
        int i2 = f1371 + 73;
        f1372 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return lVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.q m7172(final boolean z) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.q qVar = new com.ironsource.adqualitysdk.sdk.i.q() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.13

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f1403 = -8128729215004909133L;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f1404 = 0;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f1405 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5817(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1404 + 89;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo5817(jSONObject, view, activity);
                if (i4 == 0) {
                    int i5 = 2 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5818(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1404 + 121;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo5818(jSONObject, view, obj, activity);
                int i5 = f1404 + 31;
                f1405 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 16 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5819(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 67;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
                mo5819(jSONObject, view, activity);
                if (i4 != 0) {
                    java.lang.Object obj = null;
                    super.hashCode();
                    throw null;
                }
                int i5 = f1405 + 13;
                f1404 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5820(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 7;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
                mo5820(jSONObject, view, activity);
                if (i4 != 0) {
                    int i5 = 43 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5821(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1404 + 83;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo5821(jSONObject, view, obj, activity);
                int i5 = f1405 + 95;
                f1404 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5822(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 45;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
                mo5822(jSONObject, view, activity);
                if (i4 != 0) {
                    int i5 = 42 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5823(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 21;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
                mo5823(jSONObject, view, activity);
                int i5 = f1404 + 65;
                f1405 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5824(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1404 + 31;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo5824(jSONObject, view, obj, activity);
                if (i4 != 0) {
                    return;
                }
                java.lang.Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5820(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 67;
                f1404 = i3 % 128;
                m7235(m7234("\ue1d2葄⫑텣瞌\u1a1c肭⛗쵒珽ᙩ", i3 % 2 != 0 ? 32158 >> android.text.TextUtils.getOffsetBefore("", 1) : 26003 - android.text.TextUtils.getOffsetBefore("", 0)).intern(), jSONObject, view, null, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5817(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1404 + 43;
                f1405 = i3 % 128;
                m7235((i3 % 2 == 0 ? m7234("\ue1d2㈪䘍騭긴숲ᘱ⨹縢鈳\ua635﨩ท∞瘗訁", (android.view.ViewConfiguration.getKeyRepeatTimeout() % 14) * 54269) : m7234("\ue1d2㈪䘍騭긴숲ᘱ⨹縢鈳\ua635﨩ท∞瘗訁", 54269 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern(), jSONObject, view, null, activity);
                int i4 = f1405 + 47;
                f1404 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5821(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 85;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
                m7235(m7234("\ue1d2ꅾ悢․\ue37eꊝ戮╉\ue49f", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 16553).intern(), jSONObject, view, obj, activity);
                int i5 = f1405 + 125;
                f1404 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5818(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 77;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
                m7235(m7234("\ue1d2뚐佾\ue40a볆喳\uea72茧寯\uf08a複⇑\uf68a轢␢", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22342).intern(), jSONObject, view, obj, activity);
                int i5 = f1405 + 123;
                f1404 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5819(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 53;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
                m7235(m7234("\ue1d2쥀냞頚䎀⬳ቜﷶ", android.view.Gravity.getAbsoluteGravity(0, 0) + 10391).intern(), jSONObject, view, null, activity);
                int i5 = f1405 + 113;
                f1404 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5822(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 101;
                f1404 = i3 % 128;
                m7235(m7234("\ue1c5ⓓ毄껟\uf5d6㣪翱苭즘ಊ厌隴", i3 % 2 != 0 ? 50440 / android.widget.ExpandableListView.getPackedPositionChild(1L) : 50440 - android.widget.ExpandableListView.getPackedPositionChild(0L)).intern(), jSONObject, view, null, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5824(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1404 + 89;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                m7235(m7234("\ue1c4㹵店缙齗뿮\udc0eﲫ\u1cce㵋嶁緛驲몚\udb2dﭻ\u1bf5㠅墫磞", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 57251).intern(), jSONObject, view, obj, activity);
                int i5 = f1405 + 95;
                f1404 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                java.lang.Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5823(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1405 + 5;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
                m7235(m7234("\ue1d0ꄝ恶⍖\ue2b0ꖙ擔\u2438\ue70eꙮ楉", 16603 - android.text.TextUtils.getOffsetBefore("", 0)).intern(), jSONObject, view, null, activity);
                int i5 = f1405 + 37;
                f1404 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private void m7235(java.lang.String str, org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                int i2 = 2 % 2;
                com.ironsource.adqualitysdk.sdk.i.cl clVar = com.ironsource.adqualitysdk.sdk.i.cl.this;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7234("\ue1e5ꫝ矘Ñ췮雴⏕\ueceb맸䋸ྐ\ud890斂\u2e9aﯿ", android.os.Process.getGidForName("") + 19208).intern());
                sb.append(str);
                com.ironsource.adqualitysdk.sdk.i.cl.m7173(clVar, sb.toString(), z, false, java.util.Arrays.asList(jSONObject, view, obj, activity));
                int i3 = f1405 + 47;
                f1404 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static java.lang.String m7234(java.lang.String str, int i2) {
                java.lang.String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
                    com.ironsource.adqualitysdk.sdk.i.i.f2465 = i2;
                    char[] cArr3 = new char[cArr2.length];
                    com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                        cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f1403);
                        com.ironsource.adqualitysdk.sdk.i.i.f2463++;
                    }
                    str2 = new java.lang.String(cArr3);
                }
                return str2;
            }
        };
        int i2 = f1372 + 21;
        f1371 = i2 % 128;
        if (i2 % 2 == 0) {
            return qVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.v m7163(final boolean z) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.v vVar = new com.ironsource.adqualitysdk.sdk.i.v() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.11

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f1394 = 1;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f1395 = {'a', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'D', 'i', io.ktor.util.date.GMTDateParser.SECONDS, 'p', 'l', 'y', 'e', 'E', 'x', 't', 'r', 'C', 'c', 'k', 'F', 'o', io.ktor.util.date.GMTDateParser.MINUTES, 'J', 'v', 'w', 'A', io.ktor.util.date.GMTDateParser.HOURS, 'b', 'n', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'W', 'L', '.', 'f', 'g', 'j', 'q', io.ktor.util.date.GMTDateParser.ZONE, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ};

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static char f1396 = 6;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f1397;

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5817(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1394 + 57;
                f1397 = i3 % 128;
                int i4 = i3 % 2;
                mo5817(jSONObject, webView, view);
                int i5 = f1394 + 121;
                f1397 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 60 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5818(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1394 + 111;
                f1397 = i3 % 128;
                int i4 = i3 % 2;
                mo5818(jSONObject, webView, obj, view);
                int i5 = f1397 + 5;
                f1394 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                java.lang.Object obj2 = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5819(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1394 + 79;
                f1397 = i3 % 128;
                int i4 = i3 % 2;
                mo5819(jSONObject, webView, view);
                int i5 = f1397 + 99;
                f1394 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo5820(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1394 + 67;
                f1397 = i3 % 128;
                int i4 = i3 % 2;
                mo5820(jSONObject, webView, view);
                int i5 = f1394 + 89;
                f1397 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5821(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1397 + 87;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                mo5821(jSONObject, webView, obj, view);
                int i5 = f1394 + 99;
                f1397 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                java.lang.Object obj2 = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5822(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1397 + 23;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                mo5822(jSONObject, webView, view);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = f1397 + 29;
                f1394 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 92 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5823(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1397 + 91;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                mo5823(jSONObject, webView, view);
                int i5 = f1394 + 51;
                f1397 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5824(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1394 + 17;
                f1397 = i3 % 128;
                int i4 = i3 % 2;
                mo5824(jSONObject, webView, obj, view);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = f1394 + 69;
                f1397 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5820(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1397 + 109;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                m7216(m7217((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 11, "\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\tÕ", (byte) (113 - android.view.KeyEvent.normalizeMetaState(0))).intern(), jSONObject, webView, null, view);
                int i5 = f1397 + 109;
                f1394 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5817(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1397 + 23;
                f1394 = i3 % 128;
                m7216((i3 % 2 == 0 ? m7217(61 / android.text.TextUtils.indexOf((java.lang.CharSequence) "", (char) 27), "\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\t\u0003\u0007\u000b\u0006\u0012\u0006", (byte) ((-1) / (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))) : m7217(15 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), "\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\t\u0003\u0007\u000b\u0006\u0012\u0006", (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).intern(), jSONObject, webView, null, view);
                int i4 = f1394 + 59;
                f1397 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5821(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                int maximumFlingVelocity;
                byte myPid;
                int i2 = 2 % 2;
                int i3 = f1397 + 71;
                f1394 = i3 % 128;
                if (i3 % 2 == 0) {
                    maximumFlingVelocity = 50 >>> (android.view.ViewConfiguration.getMaximumFlingVelocity() / 75);
                    myPid = (byte) (17 / (android.os.Process.myPid() % 117));
                } else {
                    maximumFlingVelocity = (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9;
                    myPid = (byte) (119 - (android.os.Process.myPid() >> 22));
                }
                m7216(m7217(maximumFlingVelocity, "\u0001\u0002\f\u0007\u0002\u000f\u000e\tÛ", myPid).intern(), jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5818(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1394 + 85;
                f1397 = i3 % 128;
                m7216((i3 % 2 != 0 ? m7217(12 % android.graphics.ImageFormat.getBitsPerPixel(1), "\u0001\u0002\f\u0007\u0002\u000f\u000e\t\u0004\r\r\f\u0013\u0014\u0080", (byte) (46 - (android.view.ViewConfiguration.getWindowTouchSlop() - 56))) : m7217(14 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0001\u0002\f\u0007\u0002\u000f\u000e\t\u0004\r\r\f\u0013\u0014\u0080", (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 13))).intern(), jSONObject, webView, obj, view);
                int i4 = f1397 + 9;
                f1394 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5819(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1394 + 27;
                f1397 = i3 % 128;
                m7216((i3 % 2 != 0 ? m7217(9 - (android.widget.ExpandableListView.getPackedPositionForChild(1, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(1, 0) == 0L ? 0 : -1)), "\u0001\u0002\f\u0007\u0010\u0005\u0007\u0002", (byte) (71 / android.view.View.resolveSizeAndState(1, 1, 1))) : m7217(7 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0001\u0002\f\u0007\u0010\u0005\u0007\u0002", (byte) (120 - android.view.View.resolveSizeAndState(0, 0, 0)))).intern(), jSONObject, webView, null, view);
                int i4 = f1394 + 123;
                f1397 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5822(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int capsMode;
                int deadChar;
                int i2 = 2 % 2;
                int i3 = f1394 + 89;
                f1397 = i3 % 128;
                if (i3 % 2 != 0) {
                    capsMode = 102 - android.text.TextUtils.getCapsMode("", 0, 0);
                    deadChar = android.view.KeyEvent.getDeadChar(1, 0) + 2;
                } else {
                    capsMode = 12 - android.text.TextUtils.getCapsMode("", 0, 0);
                    deadChar = 5 - android.view.KeyEvent.getDeadChar(0, 0);
                }
                m7216(m7217(capsMode, "\u0015\u0002\t\u0014\u0017\n\u0006\u0005\u0011\u0014\u0007\u0002", (byte) deadChar).intern(), jSONObject, webView, null, view);
                int i4 = f1397 + 59;
                f1394 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5824(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1394 + 49;
                f1397 = i3 % 128;
                int i4 = i3 % 2;
                m7216(m7217(20 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0014\t\u0019\f\u0012\u0011\f\u0017\u0007\u000e\t\u0000\u0007\u001a\u0006\n\u001a\u000e\u001d\u0007", (byte) (25 - android.graphics.Color.alpha(0))).intern(), jSONObject, webView, obj, view);
                int i5 = f1397 + 79;
                f1394 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 41 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5823(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                int i2 = 2 % 2;
                int i3 = f1397 + 81;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                m7216(m7217((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, "\u0014 \u0005\n\f\u0017\b\u0015\u0007\u001a½", (byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 73)).intern(), jSONObject, webView, null, view);
                int i5 = f1394 + 101;
                f1397 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 28 / 0;
                }
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private void m7216(java.lang.String str, org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                int i2 = 2 % 2;
                com.ironsource.adqualitysdk.sdk.i.cl clVar = com.ironsource.adqualitysdk.sdk.i.cl.this;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7217((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 17, "!\t\u001f\u0007\u000f\u0017\u0013\u0004\u001b\u0004\u0005\n\u0007\u001a\u0006\u000e\u0097", (byte) (105 - android.view.View.getDefaultSize(0, 0))).intern());
                sb.append(str);
                com.ironsource.adqualitysdk.sdk.i.cl.m7173(clVar, sb.toString(), z, false, java.util.Arrays.asList(jSONObject, webView, obj, view));
                int i3 = f1397 + 81;
                f1394 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                java.lang.Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static java.lang.String m7217(int i2, java.lang.String str, byte b2) {
                java.lang.String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
                    char[] cArr3 = f1395;
                    char c2 = f1396;
                    char[] cArr4 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr4[i2] = (char) (cArr2[i2] - b2);
                    }
                    if (i2 > 1) {
                        com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i2) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                            com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                            if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b2);
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b2);
                            } else {
                                com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c2;
                                com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c2;
                                com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c2;
                                com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c2;
                                if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                                    com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c2) - 1) % c2;
                                    com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c2) - 1) % c2;
                                    int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c2) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                    int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c2) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                    cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i3];
                                    cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i4];
                                } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                                    com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c2) - 1) % c2;
                                    com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c2) - 1) % c2;
                                    int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c2) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                    int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c2) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                    cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i5];
                                    cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i6];
                                } else {
                                    int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c2) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                    int i8 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c2) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                    cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i7];
                                    cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i8];
                                }
                            }
                            com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                        }
                    }
                    str2 = new java.lang.String(cArr4);
                }
                return str2;
            }
        };
        int i2 = f1371 + 21;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        return vVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.l m7177(final com.ironsource.adqualitysdk.sdk.i.l lVar, final com.ironsource.adqualitysdk.sdk.i.l lVar2) {
        int i = 2 % 2;
        int i2 = f1372 + 105;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        if (lVar == null) {
            lVar = new com.ironsource.adqualitysdk.sdk.i.l();
        }
        if (lVar2 == null) {
            lVar2 = new com.ironsource.adqualitysdk.sdk.i.l();
            int i4 = f1371 + 25;
            f1372 = i4 % 128;
            int i5 = i4 % 2;
        }
        return new com.ironsource.adqualitysdk.sdk.i.l() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5817(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                mo5817(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5818(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                mo5818(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5819(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                mo5819(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5820(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                mo5820(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5821(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                mo5821(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5822(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                mo5822(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5823(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                mo5823(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5824(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                mo5824(jSONObject, webView, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5820(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                lVar2.mo5820(jSONObject, webView, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.c.AnonymousClass5(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5817(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                lVar2.mo5817(jSONObject, webView, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.e.AnonymousClass5(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5821(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                lVar2.mo5821(jSONObject, webView, obj, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.b.AnonymousClass2(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5818(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                lVar2.mo5818(jSONObject, webView, obj, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.d.AnonymousClass2(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5819(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                lVar2.mo5819(jSONObject, webView, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.a.AnonymousClass4(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5822(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                lVar2.mo5822(jSONObject, webView, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.g.AnonymousClass4(lVar, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5824(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.app.Activity activity) {
                lVar2.mo5824(jSONObject, webView, obj, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.f.AnonymousClass5(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5823(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.app.Activity activity) {
                lVar2.mo5823(jSONObject, webView, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.h.AnonymousClass1(lVar, jSONObject, webView, activity));
            }
        };
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.v m7187(final com.ironsource.adqualitysdk.sdk.i.v vVar, final com.ironsource.adqualitysdk.sdk.i.v vVar2) {
        int i = 2 % 2;
        int i2 = f1372 + 107;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        if (vVar == null) {
            vVar = new com.ironsource.adqualitysdk.sdk.i.v();
        }
        if (vVar2 == null) {
            vVar2 = new com.ironsource.adqualitysdk.sdk.i.v();
        }
        com.ironsource.adqualitysdk.sdk.i.v vVar3 = new com.ironsource.adqualitysdk.sdk.i.v() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5817(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                mo5817(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5818(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                mo5818(jSONObject, webView, obj, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5819(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                mo5819(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo5820(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                mo5820(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5821(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                mo5821(jSONObject, webView, obj, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5822(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                mo5822(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5823(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                mo5823(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5824(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                mo5824(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ｋ */
            public final void mo5820(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                vVar2.mo5820(jSONObject, webView, view);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.c.AnonymousClass5(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾇ */
            public final void mo5817(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                vVar2.mo5817(jSONObject, webView, view);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.e.AnonymousClass5(vVar, jSONObject, webView, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾇ */
            public final void mo5821(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                vVar2.mo5821(jSONObject, webView, obj, view);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.b.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾒ */
            public final void mo5818(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                vVar2.mo5818(jSONObject, webView, obj, view);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.d.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﻐ */
            public final void mo5819(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                vVar2.mo5819(jSONObject, webView, view);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.a.AnonymousClass4(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾒ */
            public final void mo5822(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                vVar2.mo5822(jSONObject, webView, view);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.g.AnonymousClass4(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ｋ */
            public final void mo5824(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.Object obj, android.view.View view) {
                vVar2.mo5824(jSONObject, webView, obj, view);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.f.AnonymousClass5(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﻛ */
            public final void mo5823(org.json.JSONObject jSONObject, android.webkit.WebView webView, android.view.View view) {
                vVar2.mo5823(jSONObject, webView, view);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.h.AnonymousClass1(vVar, jSONObject, webView, view));
            }
        };
        int i4 = f1371 + 77;
        f1372 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return vVar3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.q m7186(final com.ironsource.adqualitysdk.sdk.i.q qVar, final com.ironsource.adqualitysdk.sdk.i.q qVar2) {
        int i = 2 % 2;
        int i2 = f1371 + 79;
        f1372 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (qVar == null) {
            qVar = new com.ironsource.adqualitysdk.sdk.i.q();
        }
        if (qVar2 == null) {
            qVar2 = new com.ironsource.adqualitysdk.sdk.i.q();
            int i3 = f1371 + 63;
            f1372 = i3 % 128;
            int i4 = i3 % 2;
        }
        return new com.ironsource.adqualitysdk.sdk.i.q() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5817(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                mo5817(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5818(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                mo5818(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5819(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                mo5819(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5820(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                mo5820(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5821(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                mo5821(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5822(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                mo5822(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5823(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                mo5823(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5824(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                mo5824(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾒ */
            public final void mo5820(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                qVar2.mo5820(jSONObject, view, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.c.AnonymousClass5(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ｋ */
            public final void mo5817(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                qVar2.mo5817(jSONObject, view, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.e.AnonymousClass5(qVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻛ */
            public final void mo5821(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                qVar2.mo5821(jSONObject, view, obj, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.b.AnonymousClass2(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ｋ */
            public final void mo5818(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                qVar2.mo5818(jSONObject, view, obj, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.d.AnonymousClass2(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻐ */
            public final void mo5819(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                qVar2.mo5819(jSONObject, view, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.a.AnonymousClass4(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻛ */
            public final void mo5822(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                qVar2.mo5822(jSONObject, view, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.g.AnonymousClass4(qVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾇ */
            public final void mo5824(org.json.JSONObject jSONObject, android.view.View view, java.lang.Object obj, android.app.Activity activity) {
                qVar2.mo5824(jSONObject, view, obj, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.f.AnonymousClass5(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾇ */
            public final void mo5823(org.json.JSONObject jSONObject, android.view.View view, android.app.Activity activity) {
                qVar2.mo5823(jSONObject, view, activity);
                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.cl.h.AnonymousClass1(qVar, jSONObject, view, activity));
            }
        };
    }

    /* renamed from: סּ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.js m7154() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.js jsVar = new com.ironsource.adqualitysdk.sdk.i.js() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(android.app.Activity activity) {
                com.ironsource.adqualitysdk.sdk.i.cl.this.m7208(com.ironsource.adqualitysdk.sdk.i.is.f2612, com.ironsource.adqualitysdk.sdk.i.cl.m7190(com.ironsource.adqualitysdk.sdk.i.cl.this, activity, null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(android.app.Activity activity) {
                com.ironsource.adqualitysdk.sdk.i.cl.this.m7208(com.ironsource.adqualitysdk.sdk.i.is.f2610, com.ironsource.adqualitysdk.sdk.i.cl.m7190(com.ironsource.adqualitysdk.sdk.i.cl.this, activity, null));
            }
        };
        int i2 = f1372 + 79;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        return jsVar;
    }

    class c<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$c$5, reason: invalid class name */
        final class AnonymousClass5 extends com.ironsource.adqualitysdk.sdk.i.je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.t f1461;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ org.json.JSONObject f1462;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1463;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1464;

            AnonymousClass5(com.ironsource.adqualitysdk.sdk.i.t tVar, org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2) {
                this.f1461 = tVar;
                this.f1462 = jSONObject;
                this.f1463 = obj;
                this.f1464 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                this.f1461.mo5820(this.f1462, this.f1463, this.f1464);
            }
        }
    }

    class e<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$e$5, reason: invalid class name */
        final class AnonymousClass5 extends com.ironsource.adqualitysdk.sdk.i.je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1470;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.t f1471;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1472;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ org.json.JSONObject f1473;

            AnonymousClass5(com.ironsource.adqualitysdk.sdk.i.t tVar, org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2) {
                this.f1471 = tVar;
                this.f1473 = jSONObject;
                this.f1472 = obj;
                this.f1470 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                this.f1471.mo5817(this.f1473, this.f1472, this.f1470);
            }
        }
    }

    class b<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$b$2, reason: invalid class name */
        final class AnonymousClass2 extends com.ironsource.adqualitysdk.sdk.i.je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.t f1456;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ org.json.JSONObject f1457;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1458;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1459;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1460;

            AnonymousClass2(com.ironsource.adqualitysdk.sdk.i.t tVar, org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                this.f1456 = tVar;
                this.f1457 = jSONObject;
                this.f1459 = obj;
                this.f1460 = obj2;
                this.f1458 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                this.f1456.mo5821(this.f1457, this.f1459, this.f1460, this.f1458);
            }
        }
    }

    class d<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$d$2, reason: invalid class name */
        final class AnonymousClass2 extends com.ironsource.adqualitysdk.sdk.i.je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.t f1465;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1466;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ org.json.JSONObject f1467;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1468;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1469;

            AnonymousClass2(com.ironsource.adqualitysdk.sdk.i.t tVar, org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                this.f1465 = tVar;
                this.f1467 = jSONObject;
                this.f1466 = obj;
                this.f1469 = obj2;
                this.f1468 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                this.f1465.mo5818(this.f1467, this.f1466, this.f1469, this.f1468);
            }
        }
    }

    class a<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$a$4, reason: invalid class name */
        final class AnonymousClass4 extends com.ironsource.adqualitysdk.sdk.i.je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.t f1452;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ org.json.JSONObject f1453;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1454;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1455;

            AnonymousClass4(com.ironsource.adqualitysdk.sdk.i.t tVar, org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2) {
                this.f1452 = tVar;
                this.f1453 = jSONObject;
                this.f1454 = obj;
                this.f1455 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                this.f1452.mo5819(this.f1453, this.f1454, this.f1455);
            }
        }
    }

    class g<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$g$4, reason: invalid class name */
        final class AnonymousClass4 extends com.ironsource.adqualitysdk.sdk.i.je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1479;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ org.json.JSONObject f1480;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1481;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.t f1482;

            AnonymousClass4(com.ironsource.adqualitysdk.sdk.i.t tVar, org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2) {
                this.f1482 = tVar;
                this.f1480 = jSONObject;
                this.f1481 = obj;
                this.f1479 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                this.f1482.mo5822(this.f1480, this.f1481, this.f1479);
            }
        }
    }

    class f<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$f$5, reason: invalid class name */
        final class AnonymousClass5 extends com.ironsource.adqualitysdk.sdk.i.je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1474;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ org.json.JSONObject f1475;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.t f1476;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1477;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1478;

            AnonymousClass5(com.ironsource.adqualitysdk.sdk.i.t tVar, org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                this.f1476 = tVar;
                this.f1475 = jSONObject;
                this.f1477 = obj;
                this.f1474 = obj2;
                this.f1478 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                this.f1476.mo5824(this.f1475, this.f1477, this.f1474, this.f1478);
            }
        }
    }

    class h<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$h$1, reason: invalid class name */
        final class AnonymousClass1 extends com.ironsource.adqualitysdk.sdk.i.je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1483;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.t f1484;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ java.lang.Object f1485;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ org.json.JSONObject f1486;

            AnonymousClass1(com.ironsource.adqualitysdk.sdk.i.t tVar, org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2) {
                this.f1484 = tVar;
                this.f1486 = jSONObject;
                this.f1485 = obj;
                this.f1483 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                this.f1484.mo5823(this.f1486, this.f1485, this.f1483);
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private org.json.JSONObject m7180(android.app.Activity activity, android.os.Bundle bundle) {
        int i = 2 % 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2647, m7205().m7299());
            jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2598, m7205().m7295());
            jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2602, m7205().m7293());
            jSONObject.put(m7164(new int[]{-1289404514, -593432372, -294402696, 2141141873}, 7 - android.view.KeyEvent.keyCodeFromString("")).intern(), activity.getClass().getName());
            if (bundle != null) {
                int i2 = f1372 + 51;
                f1371 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(m7164(new int[]{1916185296, 1293179582, -139890724, -759972298}, '8' - android.text.AndroidCharacter.getMirror('0')).intern(), true);
            }
        } catch (org.json.JSONException unused) {
            com.ironsource.adqualitysdk.sdk.i.m.m8524(m7164(new int[]{1708820623, 1001152392, 1938309327, -962546325, -1009309914, 1480401082, 1325773384, 281166181}, 16 - android.view.View.getDefaultSize(0, 0)).intern(), m7179('N' - android.text.AndroidCharacter.getMirror('0'), false, android.view.View.getDefaultSize(0, 0) + 228, "\u0003\u0014\uffc0\n\u0013\u000f\u000e\uffc0\u000f\u0002\n\u0005\u0003\u0014￥\u0012\u0012\u000f\u0012\uffc0\u0003\u0012\u0005\u0001\u0014\t\u000e\u0007\uffc0\u0001", android.view.View.resolveSizeAndState(0, 0, 0) + 14).intern());
        }
        int i4 = f1371 + 51;
        f1372 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.jx m7185(final java.util.List<java.lang.String> list) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.jx jxVar = new com.ironsource.adqualitysdk.sdk.i.jx() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.4

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f1427 = 0;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static char[] f1428 = {kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, io.ktor.util.date.GMTDateParser.SECONDS, 'q', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, '_', 't', 'l', 'i', 'Z', 'Z', 'n', 148, 295, 275, 275, 290, 293, 301, 283, 276, 293, 300, 298, 297, 292, 285, kotlin.text.Typography.amp, 'n', 137, 135, 135, 138, 145, 140, 'x', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, 146, 138, 135, 'x', 'y', 142, 'v'};

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f1429 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* renamed from: ｋ */
            public final void mo5964(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1427 + 103;
                f1429 = i3 % 128;
                int i4 = i3 % 2;
                m7246(m7247("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", new int[]{0, 11, 0, 0}, true).intern(), activity, list);
                int i5 = f1427 + 35;
                f1429 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 6 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* renamed from: ﻐ */
            public final void mo5963(android.app.Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1427 + 41;
                f1429 = i3 % 128;
                int[] iArr = {11, 15, 185, 0};
                m7246((i3 % 2 == 0 ? m7247("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", iArr, false) : m7247("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", iArr, false)).intern(), activity, list);
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private void m7246(java.lang.String str, final android.app.Activity activity, java.util.List<java.lang.String> list2) {
                int i2 = 2 % 2;
                int i3 = f1427 + 117;
                f1429 = i3 % 128;
                if (i3 % 2 == 0) {
                    com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list2);
                    throw null;
                }
                if (com.ironsource.adqualitysdk.sdk.i.cl.m7184(activity, list2)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m7247("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{26, 17, 30, 0}, true).intern());
                    sb.append(str);
                    final java.lang.String obj = sb.toString();
                    com.ironsource.adqualitysdk.sdk.i.cl.m7173(com.ironsource.adqualitysdk.sdk.i.cl.this, obj, true, false, java.util.Collections.singletonList(activity));
                    com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5825() {
                            com.ironsource.adqualitysdk.sdk.i.cl.m7173(com.ironsource.adqualitysdk.sdk.i.cl.this, obj, false, false, java.util.Collections.singletonList(activity));
                        }
                    });
                }
                int i4 = f1429 + 103;
                f1427 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static java.lang.String m7247(java.lang.String str, int[] iArr, boolean z) {
                java.lang.String str2;
                byte[] bArr = str;
                if (str != null) {
                    bArr = str.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
                }
                byte[] bArr2 = bArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2296) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    java.lang.System.arraycopy(f1428, i2, cArr, 0, i3);
                    if (bArr2 != null) {
                        char[] cArr2 = new char[i3];
                        com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                        char c2 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i3) {
                            if (bArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] == 1) {
                                cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) + 1) - c2);
                            } else {
                                cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) ((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) - c2);
                            }
                            c2 = cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297];
                            com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        java.lang.System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i6 = i3 - i5;
                        java.lang.System.arraycopy(cArr3, 0, cArr, i6, i5);
                        java.lang.System.arraycopy(cArr3, i5, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i3];
                        com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i3) {
                            cArr4[com.ironsource.adqualitysdk.sdk.i.h.f2297] = cArr[(i3 - com.ironsource.adqualitysdk.sdk.i.h.f2297) - 1];
                            com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i3) {
                            cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] - iArr[2]);
                            com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                        }
                    }
                    str2 = new java.lang.String(cArr);
                }
                return str2;
            }
        };
        int i2 = f1371 + 35;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        return jxVar;
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ck m7153() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ck ckVar = new com.ironsource.adqualitysdk.sdk.i.ck() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ck
            /* renamed from: ﻐ */
            public final void mo7152(final java.lang.String str, final java.util.List<java.lang.Object> list) {
                final boolean z = true;
                final boolean z2 = false;
                com.ironsource.adqualitysdk.sdk.i.cl.m7173(com.ironsource.adqualitysdk.sdk.i.cl.this, str, true, false, list);
                com.ironsource.adqualitysdk.sdk.i.cl.m7166(com.ironsource.adqualitysdk.sdk.i.cl.this, new com.ironsource.adqualitysdk.sdk.i.iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5825() {
                        com.ironsource.adqualitysdk.sdk.i.cl.m7173(com.ironsource.adqualitysdk.sdk.i.cl.this, str, false, z2, list);
                    }
                }, false);
                com.ironsource.adqualitysdk.sdk.i.cl.m7166(com.ironsource.adqualitysdk.sdk.i.cl.this, new com.ironsource.adqualitysdk.sdk.i.iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5825() {
                        com.ironsource.adqualitysdk.sdk.i.cl.m7173(com.ironsource.adqualitysdk.sdk.i.cl.this, str, false, z, list);
                    }
                }, true);
            }
        };
        int i2 = f1371 + 95;
        f1372 = i2 % 128;
        int i3 = i2 % 2;
        return ckVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    protected final void m7210(java.lang.String str, java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7179(15 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), true, 230 - android.view.KeyEvent.normalizeMetaState(0), "\u0012\u0011\uffff\u0001\u0002\uffff\r\u0010￠\uffff\n\u000b\r\r\ufff1ￌ", (android.os.Process.myPid() >> 22) + 15).intern());
        sb.append(str);
        m7194(sb.toString(), list);
        int i2 = f1372 + 47;
        f1371 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7194(final java.lang.String str, final java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                com.ironsource.adqualitysdk.sdk.i.cl.m7173(com.ironsource.adqualitysdk.sdk.i.cl.this, str, false, false, list);
            }
        });
        com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                com.ironsource.adqualitysdk.sdk.i.cl.m7173(com.ironsource.adqualitysdk.sdk.i.cl.this, str, true, false, list);
            }
        });
        m7192(new com.ironsource.adqualitysdk.sdk.i.iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                com.ironsource.adqualitysdk.sdk.i.cl.m7173(com.ironsource.adqualitysdk.sdk.i.cl.this, str, false, true, list);
            }
        }, true);
        int i2 = f1371 + 13;
        f1372 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7195(java.lang.String str, boolean z, boolean z2, java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        try {
            com.ironsource.adqualitysdk.sdk.i.dh m7926 = this.f1380.m7926(str);
            if (m7926 != null) {
                java.lang.String m7487 = m7926.m7487();
                com.ironsource.adqualitysdk.sdk.i.dz m7930 = this.f1380.m7930(m7926.m7487());
                if (m7930 == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m7164(new int[]{1726650501, -220222271, -1972317907, 1697089025, 861502119, 928597312, -170788052, -2061117520, -1110104530, 393790835, -994150204, 1971244113}, android.view.KeyEvent.getDeadChar(0, 0) + 21).intern());
                    sb.append(str);
                    new com.ironsource.adqualitysdk.sdk.i.dt(this, m7487, sb.toString()).m7590(m7200());
                    return;
                }
                int i2 = f1371 + 33;
                f1372 = i2 % 128;
                int i3 = i2 % 2;
                if (z == m7926.m7486() && z2 == m7926.m7485()) {
                    if (com.ironsource.adqualitysdk.sdk.i.s.m8589().m8612()) {
                        int i4 = f1372 + 93;
                        f1371 = i4 % 128;
                        int i5 = i4 % 2;
                        com.ironsource.adqualitysdk.sdk.i.cn.m7268(m7200(), str);
                    }
                    m7930.m7668(this.f1379, this, list);
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.String m7200 = m7200();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(m7164(new int[]{1726650501, -220222271, -1972317907, 1697089025, 861502119, 928597312, -170788052, -2061117520, -1110104530, 393790835, -994150204, 1971244113}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21).intern());
            sb2.append(str);
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(m7200, sb2.toString(), th);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m7208(java.lang.String str, org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1371 + 23;
        f1372 = i2 % 128;
        if (i2 % 2 != 0 ? str.equals(m7179(12 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), false, 236 - android.text.TextUtils.getCapsMode("", 0, 0), "�￼\ufff9￼\ufff7￼\u0001\u000b\b\u0004\ufff9\u0011", android.text.TextUtils.indexOf("", "", 0, 0) + 2).intern()) : str.equals(m7179(34 - android.graphics.drawable.Drawable.resolveOpacity(1, 1), true, 11878 << android.text.TextUtils.getCapsMode("", 1, 0), "�￼\ufff9￼\ufff7￼\u0001\u000b\b\u0004\ufff9\u0011", android.text.TextUtils.indexOf("", "", 1, 0) * 4).intern())) {
            this.f1374.m7289().m6288(jSONObject);
        } else if (str.equals(m7179(10 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, 234 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\ufffe\ufff9�\u0006\t\r\uffff\ufffe\ufffb", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9).intern())) {
            int i3 = f1372 + 45;
            f1371 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f1374.m7289().m6287(jSONObject);
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            this.f1374.m7289().m6287(jSONObject);
        }
        org.json.JSONObject m8414 = com.ironsource.adqualitysdk.sdk.i.kj.m8414(m7165(jSONObject));
        if (str.equals(com.ironsource.adqualitysdk.sdk.i.is.f2603)) {
            this.f1374.m7289().m6285(m8414);
            return;
        }
        if (str.equals(com.ironsource.adqualitysdk.sdk.i.is.f2606)) {
            this.f1374.m7289().m6291(m8414);
            return;
        }
        if (str.equals(com.ironsource.adqualitysdk.sdk.i.is.f2612)) {
            int i4 = f1372 + 95;
            f1371 = i4 % 128;
            if (i4 % 2 == 0) {
                this.f1374.m7289().m6283(m8414);
                return;
            } else {
                this.f1374.m7289().m6283(m8414);
                int i5 = 56 / 0;
                return;
            }
        }
        if (!str.equals(com.ironsource.adqualitysdk.sdk.i.is.f2610)) {
            if (str.equals(com.ironsource.adqualitysdk.sdk.i.is.f2605)) {
                int i6 = f1371 + 59;
                f1372 = i6 % 128;
                if (i6 % 2 != 0) {
                    this.f1374.m7289().m6281(m8414);
                    return;
                } else {
                    this.f1374.m7289().m6281(m8414);
                    int i7 = 85 / 0;
                    return;
                }
            }
            if (str.equals(com.ironsource.adqualitysdk.sdk.i.is.f2604)) {
                this.f1374.m7289().m6280(m8414);
                return;
            } else if (!(!str.equals(com.ironsource.adqualitysdk.sdk.i.is.f2607))) {
                this.f1374.m7289().m6278(m8414);
                return;
            } else {
                this.f1374.m7289().m6284(str, jSONObject);
                return;
            }
        }
        int i8 = f1372 + 17;
        f1371 = i8 % 128;
        int i9 = i8 % 2;
        this.f1374.m7289().m6279(m8414);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7192(final com.ironsource.adqualitysdk.sdk.i.iy iyVar, boolean z) {
        int i = 2 % 2;
        int i2 = f1372 + 9;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (z) {
                com.ironsource.adqualitysdk.sdk.i.p.m8546(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.6
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5825() {
                        com.ironsource.adqualitysdk.sdk.i.p.m8549(com.ironsource.adqualitysdk.sdk.i.iy.this);
                    }
                });
                return;
            }
            com.ironsource.adqualitysdk.sdk.i.p.m8549(iyVar);
            int i4 = f1372 + 123;
            f1371 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    private void m7155() {
        int i = 2 % 2;
        int i2 = f1372 + 55;
        f1371 = i2 % 128;
        int i3 = i2 % 2;
        this.f1375.m8635();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7164(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1370.clone();
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7179(int i, boolean z, int i2, java.lang.String str, int i3) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                cArr3[i4] = (char) (cArr3[i4] - f1369);
                com.ironsource.adqualitysdk.sdk.i.d.f1651++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                cArr3 = cArr5;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
