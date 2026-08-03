package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3210 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3211 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f3212 = 15605;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3213;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f3214;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.y> f3215 = new java.util.HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ac> f3217 = new java.util.HashMap();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ad> f3216 = new java.util.HashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ java.util.Map m8630(com.ironsource.adqualitysdk.sdk.i.w wVar) {
        int i = 2 % 2;
        int i2 = f3210 + 121;
        f3211 = i2 % 128;
        int i3 = i2 % 2;
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ac> map = wVar.f3217;
        if (i3 != 0) {
            return map;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ java.lang.String m8631(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3210 + 93;
        f3211 = i2 % 128;
        if (i2 % 2 != 0) {
            return m8629(jSONObject);
        }
        m8629(jSONObject);
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ java.util.Map m8632(com.ironsource.adqualitysdk.sdk.i.w wVar) {
        int i = 2 % 2;
        int i2 = f3210 + 53;
        int i3 = i2 % 128;
        f3211 = i3;
        int i4 = i2 % 2;
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.y> map = wVar.f3215;
        int i5 = i3 + 73;
        f3210 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ java.util.Map m8634(com.ironsource.adqualitysdk.sdk.i.w wVar) {
        int i = 2 % 2;
        int i2 = f3210 + 19;
        f3211 = i2 % 128;
        int i3 = i2 % 2;
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ad> map = wVar.f3216;
        if (i3 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8640(final org.json.JSONObject jSONObject, final com.ironsource.adqualitysdk.sdk.i.l lVar, final com.ironsource.adqualitysdk.sdk.i.js jsVar, final com.ironsource.adqualitysdk.sdk.i.ja jaVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                java.lang.String m8631 = com.ironsource.adqualitysdk.sdk.i.w.m8631(jSONObject);
                com.ironsource.adqualitysdk.sdk.i.y yVar = (com.ironsource.adqualitysdk.sdk.i.y) com.ironsource.adqualitysdk.sdk.i.w.m8632(com.ironsource.adqualitysdk.sdk.i.w.this).get(m8631);
                if (yVar == null) {
                    yVar = new com.ironsource.adqualitysdk.sdk.i.y(jSONObject, jaVar);
                    com.ironsource.adqualitysdk.sdk.i.w.m8632(com.ironsource.adqualitysdk.sdk.i.w.this).put(m8631, yVar);
                } else {
                    yVar.m8646(jaVar);
                    yVar.m8700(jSONObject);
                }
                yVar.m8628((com.ironsource.adqualitysdk.sdk.i.t) lVar);
                yVar.m8701((com.ironsource.adqualitysdk.sdk.i.jr) jsVar);
            }
        });
        int i2 = f3210 + 47;
        f3211 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8635() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                java.util.ArrayList arrayList = new java.util.ArrayList(com.ironsource.adqualitysdk.sdk.i.w.m8632(com.ironsource.adqualitysdk.sdk.i.w.this).values());
                com.ironsource.adqualitysdk.sdk.i.w.m8632(com.ironsource.adqualitysdk.sdk.i.w.this).clear();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.ironsource.adqualitysdk.sdk.i.y) it.next()).m8699();
                }
            }
        });
        int i2 = f3210 + 75;
        f3211 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8638(final org.json.JSONObject jSONObject, final com.ironsource.adqualitysdk.sdk.i.v vVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                java.lang.String m8631 = com.ironsource.adqualitysdk.sdk.i.w.m8631(jSONObject);
                com.ironsource.adqualitysdk.sdk.i.ac acVar = (com.ironsource.adqualitysdk.sdk.i.ac) com.ironsource.adqualitysdk.sdk.i.w.m8630(com.ironsource.adqualitysdk.sdk.i.w.this).get(m8631);
                if (acVar == null) {
                    acVar = new com.ironsource.adqualitysdk.sdk.i.ac(jSONObject);
                    com.ironsource.adqualitysdk.sdk.i.w.m8630(com.ironsource.adqualitysdk.sdk.i.w.this).put(m8631, acVar);
                } else {
                    acVar.m5782(jSONObject);
                }
                acVar.m8628((com.ironsource.adqualitysdk.sdk.i.t) vVar);
            }
        });
        int i2 = f3210 + 41;
        f3211 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8637() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                java.util.ArrayList arrayList = new java.util.ArrayList(com.ironsource.adqualitysdk.sdk.i.w.m8630(com.ironsource.adqualitysdk.sdk.i.w.this).values());
                com.ironsource.adqualitysdk.sdk.i.w.m8630(com.ironsource.adqualitysdk.sdk.i.w.this).clear();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.ironsource.adqualitysdk.sdk.i.ac) it.next()).m5783();
                }
            }
        });
        int i2 = f3210 + 107;
        f3211 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8636(org.json.JSONObject jSONObject, com.ironsource.adqualitysdk.sdk.i.q qVar) {
        int i = 2 % 2;
        int i2 = f3211 + 91;
        f3210 = i2 % 128;
        int i3 = i2 % 2;
        m8641(jSONObject, qVar, null);
        int i4 = f3210 + 9;
        f3211 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8641(final org.json.JSONObject jSONObject, final com.ironsource.adqualitysdk.sdk.i.q qVar, final com.ironsource.adqualitysdk.sdk.i.jc jcVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                java.lang.String m8631 = com.ironsource.adqualitysdk.sdk.i.w.m8631(jSONObject);
                com.ironsource.adqualitysdk.sdk.i.ad adVar = (com.ironsource.adqualitysdk.sdk.i.ad) com.ironsource.adqualitysdk.sdk.i.w.m8634(com.ironsource.adqualitysdk.sdk.i.w.this).get(m8631);
                if (adVar == null) {
                    adVar = new com.ironsource.adqualitysdk.sdk.i.ad(jSONObject, jcVar);
                    com.ironsource.adqualitysdk.sdk.i.w.m8634(com.ironsource.adqualitysdk.sdk.i.w.this).put(m8631, adVar);
                } else {
                    adVar.m5814(jSONObject, jcVar);
                }
                adVar.m8628(qVar);
            }
        });
        int i2 = f3210 + 105;
        f3211 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8639() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.10
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                java.util.ArrayList arrayList = new java.util.ArrayList(com.ironsource.adqualitysdk.sdk.i.w.m8634(com.ironsource.adqualitysdk.sdk.i.w.this).values());
                com.ironsource.adqualitysdk.sdk.i.w.m8634(com.ironsource.adqualitysdk.sdk.i.w.this).clear();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.ironsource.adqualitysdk.sdk.i.ad) it.next()).m5816();
                }
            }
        });
        int i2 = f3210 + 37;
        f3211 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m8629(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(jSONObject.optString(m8633((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, "\u181bꞤ턻䂫荄☐\uf494戨ꕑ輅̝ᨦ콰㣟", "\u0000\u0000\u0000\u0000", "ꒌᣄ襽쪣", (char) ((android.os.Process.myTid() >> 22) + 41865)).intern()));
        sb.append(m8633((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1928956701, "◣", "\u0000\u0000\u0000\u0000", "ᴃ曆\ue072\uf419", (char) (android.view.View.getDefaultSize(0, 0) + 6624)).intern());
        sb.append(jSONObject.optString(m8633((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "ḫ霞ꪞ⎎厨㒀滿烩䊛磹蟦ﮚ嗦룄", "\u0000\u0000\u0000\u0000", "杋깞㛸옉", (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2358)).intern()));
        sb.append(jSONObject.optString(m8633(android.view.KeyEvent.getDeadChar(0, 0) + 2088367807, "锠깙횧팿䉓뙸劘圈→쭉䗟ꬔ碧", "\u0000\u0000\u0000\u0000", "뼊秶쁼俻", (char) (64448 - ((android.os.Process.getThreadPriority(0) + 20) >> 6))).intern()));
        sb.append(jSONObject.optString(m8633((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1143083916, "듒懄ᙛ⦴귀즉⯮샇ᐫ濾酾阋奡䱚嶡", "\u0000\u0000\u0000\u0000", "畤\uddec㪻赹", (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 31034)).intern()));
        java.lang.String obj = sb.toString();
        int i2 = f3211 + 59;
        f3210 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8633(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, char c) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr2.clone();
            char[] cArr8 = (char[]) cArr4.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr6.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr6[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f3214) ^ f3213) ^ f3212);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
