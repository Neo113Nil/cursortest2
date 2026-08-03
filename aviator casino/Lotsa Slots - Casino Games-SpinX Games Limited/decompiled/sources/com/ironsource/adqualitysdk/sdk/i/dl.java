package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class dl {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static boolean f1777 = true;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f1778 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1779 = 0;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1780 = {193, 195, 190, 179, 192, 175, kotlin.text.Typography.degree, 194, kotlin.text.Typography.plusMinus, 187, 196, 188, kotlin.text.Typography.paragraph, kotlin.text.Typography.half, 178, 'X'};

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1781 = 78;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1782 = true;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.dz> f1783;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.dh> f1784;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String f1785;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.String f1786;

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.util.List<com.ironsource.adqualitysdk.sdk.i.dm> f1787;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1788;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.util.List<java.lang.String> f1789;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ java.lang.String m7573(com.ironsource.adqualitysdk.sdk.i.dl dlVar) {
        int i = 2 % 2;
        int i2 = f1778 + 81;
        int i3 = i2 % 128;
        f1779 = i3;
        int i4 = i2 % 2;
        java.lang.String str = dlVar.f1785;
        int i5 = i3 + 39;
        f1778 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public dl(final java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        this.f1785 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(str2);
        this.f1786 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(jSONObject.optString(m7570(null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u0085\u0084\u0083\u0082\u0081").intern()));
        this.f1788 = jSONObject.optBoolean(m7570(null, 127 - android.graphics.Color.red(0), null, "\u0088\u0089\u0086\u0085\u0088\u0081\u0087\u0086").intern());
        this.f1789 = m7572(com.ironsource.adqualitysdk.sdk.i.kj.m8420(jSONObject.optJSONArray(m7570(null, 128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, "\u0081\u0085\u0084\u0087\u008a\u0084\u008a").intern()), new com.ironsource.adqualitysdk.sdk.i.kj.e<java.lang.String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* renamed from: ｋ */
            public final /* synthetic */ java.lang.String mo6107(org.json.JSONArray jSONArray, int i) {
                return com.ironsource.adqualitysdk.sdk.i.eb.m7682(jSONArray.optString(i));
            }
        }));
        this.f1787 = m7572(com.ironsource.adqualitysdk.sdk.i.kj.m8420(jSONObject.optJSONArray(m7570(null, android.view.View.combineMeasuredStates(0, 0) + 127, null, "\u0083\u0082\u0088\u0084\u0081").intern()), new com.ironsource.adqualitysdk.sdk.i.kj.e<com.ironsource.adqualitysdk.sdk.i.dm>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* renamed from: ｋ */
            public final /* synthetic */ com.ironsource.adqualitysdk.sdk.i.dm mo6107(org.json.JSONArray jSONArray, int i) {
                return new com.ironsource.adqualitysdk.sdk.i.dm(jSONArray.optJSONObject(i));
            }
        }));
        this.f1784 = m7571(com.ironsource.adqualitysdk.sdk.i.kj.m8421(jSONObject.optJSONObject(m7570(null, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u0081\u0088\u008c\u0084\u008b\u0084").intern()), new com.ironsource.adqualitysdk.sdk.i.kj.a<com.ironsource.adqualitysdk.sdk.i.dh>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* renamed from: ﻛ */
            public final /* synthetic */ com.ironsource.adqualitysdk.sdk.i.dh mo6106(org.json.JSONObject jSONObject2, java.lang.String str3) {
                return new com.ironsource.adqualitysdk.sdk.i.dh(jSONObject2.optJSONObject(str3));
            }
        }));
        final com.ironsource.adqualitysdk.sdk.i.dz[] dzVarArr = {null};
        this.f1783 = m7571(com.ironsource.adqualitysdk.sdk.i.kj.m8421(jSONObject.optJSONObject(m7570(null, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 128, null, "\u0081\u008f\u008e\u008d\u0088\u0084\u008a").intern()), new com.ironsource.adqualitysdk.sdk.i.kj.a<com.ironsource.adqualitysdk.sdk.i.dz>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* renamed from: ﻛ */
            public final /* synthetic */ com.ironsource.adqualitysdk.sdk.i.dz mo6106(org.json.JSONObject jSONObject2, java.lang.String str3) {
                com.ironsource.adqualitysdk.sdk.i.dz dzVar = new com.ironsource.adqualitysdk.sdk.i.dz(str, com.ironsource.adqualitysdk.sdk.i.dl.m7573(com.ironsource.adqualitysdk.sdk.i.dl.this), str3, jSONObject2.optJSONObject(str3), dzVarArr[0]);
                dzVarArr[0] = dzVar;
                return dzVar;
            }
        }));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> java.util.List<T> m7572(java.util.List<T> list) {
        int i = 2 % 2;
        int i2 = f1778 + 21;
        f1779 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = f1778 + 119;
        f1779 = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <K, V> java.util.Map<K, V> m7571(java.util.Map<K, V> map) {
        int i = 2 % 2;
        int i2 = f1778 + 5;
        int i3 = i2 % 128;
        f1779 = i3;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (map != null) {
            int i4 = i3 + 83;
            f1778 = i4 % 128;
            int i5 = i4 % 2;
            return map;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int i6 = f1779 + 15;
        f1778 = i6 % 128;
        if (i6 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.String m7577() {
        int i = 2 % 2;
        int i2 = f1778;
        int i3 = i2 + 29;
        f1779 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.f1785;
        int i5 = i2 + 33;
        f1779 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.lang.String m7576() {
        int i = 2 % 2;
        int i2 = f1778 + 109;
        int i3 = i2 % 128;
        f1779 = i3;
        int i4 = i2 % 2;
        java.lang.String str = this.f1786;
        int i5 = i3 + 117;
        f1778 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7579() {
        int i = 2 % 2;
        int i2 = f1779 + 105;
        f1778 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1788;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m7578() {
        java.util.List<java.lang.String> list;
        int i = 2 % 2;
        int i2 = f1778 + 101;
        int i3 = i2 % 128;
        f1779 = i3;
        if (i2 % 2 != 0) {
            list = this.f1789;
            int i4 = 79 / 0;
        } else {
            list = this.f1789;
        }
        int i5 = i3 + 117;
        f1778 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.dz> m7580() {
        int i = 2 % 2;
        int i2 = f1778 + 105;
        int i3 = i2 % 128;
        f1779 = i3;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.dz> map = this.f1783;
        int i4 = i3 + 97;
        f1778 = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final java.util.List<com.ironsource.adqualitysdk.sdk.i.dm> m7575() {
        int i = 2 % 2;
        int i2 = f1779 + 57;
        f1778 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1787;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.dh> m7574() {
        int i = 2 % 2;
        int i2 = f1778 + 21;
        int i3 = i2 % 128;
        f1779 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.dh> map = this.f1784;
        int i4 = i3 + 9;
        f1778 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return map;
    }

    public final java.lang.String toString() {
        int lastIndexOf;
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f1783.values());
        java.util.Collections.sort(arrayList, new java.util.Comparator<com.ironsource.adqualitysdk.sdk.i.dz>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.3
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(com.ironsource.adqualitysdk.sdk.i.dz dzVar, com.ironsource.adqualitysdk.sdk.i.dz dzVar2) {
                return dzVar.m7667() - dzVar2.m7667();
            }
        });
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = f1779 + 7;
            f1778 = i2 % 128;
            if (i2 % 2 == 0) {
                sb.append(((com.ironsource.adqualitysdk.sdk.i.dz) it.next()).toString());
                lastIndexOf = 15957 >> android.text.TextUtils.lastIndexOf("", (char) 31);
            } else {
                sb.append(((com.ironsource.adqualitysdk.sdk.i.dz) it.next()).toString());
                lastIndexOf = android.text.TextUtils.lastIndexOf("", '0') + 128;
            }
            sb.append(m7570(null, lastIndexOf, null, "\u0090\u0090").intern());
            int i3 = f1778 + 115;
            f1779 = i3 % 128;
            int i4 = i3 % 2;
        }
        return sb.toString();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7570(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.k.f2966) {
            char[] cArr3 = f1780;
            int i2 = f1781;
            if (f1777) {
                int length = bArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length;
                char[] cArr4 = new char[length];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr4[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[bArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] + i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr4);
            }
            if (f1782) {
                int length2 = cArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length2;
                char[] cArr5 = new char[length2];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[cArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr5);
            }
            int length3 = iArr.length;
            com.ironsource.adqualitysdk.sdk.i.k.f2965 = length3;
            char[] cArr6 = new char[length3];
            com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                cArr6[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[iArr[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                com.ironsource.adqualitysdk.sdk.i.k.f2967++;
            }
            return new java.lang.String(cArr6);
        }
    }
}
