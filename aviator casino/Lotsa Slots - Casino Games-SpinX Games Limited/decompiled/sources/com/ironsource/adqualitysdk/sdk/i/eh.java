package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class eh extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1971 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1972 = -7037457903574574647L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1973 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ef> f1974 = new java.util.HashMap();

    public eh(java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ef> map) {
        for (java.lang.String str : map.keySet()) {
            this.f1974.put(com.ironsource.adqualitysdk.sdk.i.eb.m7682(str), map.get(str));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String str : this.f1974.keySet()) {
            int i2 = f1973 + 7;
            f1971 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.ea m7718 = this.f1974.get(str).m7718(eeVar, clVar);
            try {
                jSONObject.put(str, m7718.m7681());
                int i4 = f1971 + 31;
                f1973 = i4 % 128;
                int i5 = i4 % 2;
            } catch (org.json.JSONException unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7721("ᦌ銶ྡ뢁㖏꺨寴퓷䇕靖眢\ue028鴲ᙀ茕㱹ꥶ≺\udf03䡈쒬熴\ueaa2枇ბ", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35597).intern());
                sb.append(m7718.m7681());
                sb.append(m7721("᧩꾆痴㯀셍靯嵚\ue2afꢡ", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46633).intern());
                sb.append(str);
                new com.ironsource.adqualitysdk.sdk.i.dr(clVar, eeVar, sb.toString()).m7590(clVar.m7200());
            }
        }
        return new com.ironsource.adqualitysdk.sdk.i.ea(jSONObject);
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        if (this.f1974.isEmpty()) {
            return m7721("ᦲ蜉", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40637).intern();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7721("ᦲ㔖", 11519 - android.text.TextUtils.getOffsetBefore("", 0)).intern());
        java.util.Iterator<java.lang.String> it = this.f1974.keySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            int i2 = f1973 + 9;
            f1971 = i2 % 128;
            if (i2 % 2 == 0) {
                java.lang.String next = it.next();
                if (!z) {
                    int i3 = f1973 + 107;
                    f1971 = i3 % 128;
                    sb.append(m7721("᧥嫶", i3 % 2 != 0 ? 10056 << (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) : (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17183).intern());
                }
                sb.append(m7721("᧫", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45523).intern());
                sb.append(next);
                sb.append(m7721("᧫鑶ˣ", android.text.TextUtils.lastIndexOf("", '0', 0) + 36230).intern());
                sb.append(this.f1974.get(next));
                z = false;
            } else {
                it.next();
                throw null;
            }
        }
        sb.append(m7721("᧩詣", android.graphics.Color.rgb(0, 0, 0) + 16815063).intern());
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f1973;
        int i3 = i2 + 39;
        int i4 = i3 % 128;
        f1971 = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 47;
            f1971 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj != null) {
            int i8 = i4 + 25;
            f1973 = i8 % 128;
            int i9 = i8 % 2;
            if (getClass() == obj.getClass()) {
                com.ironsource.adqualitysdk.sdk.i.eh ehVar = (com.ironsource.adqualitysdk.sdk.i.eh) obj;
                java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ef> map = this.f1974;
                if (map != null) {
                    int i10 = f1971 + 95;
                    f1973 = i10 % 128;
                    int i11 = i10 % 2;
                    boolean equals = map.equals(ehVar.f1974);
                    if (i11 == 0) {
                        int i12 = 78 / 0;
                    }
                    return equals;
                }
                if (ehVar.f1974 == null) {
                    int i13 = f1971 + 55;
                    f1973 = i13 % 128;
                    int i14 = i13 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1971;
        int i3 = i2 + 113;
        f1973 = i3 % 128;
        int i4 = i3 % 2;
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ef> map = this.f1974;
        if (map != null) {
            return map.hashCode();
        }
        int i5 = i2 + 105;
        f1973 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7721(java.lang.String str, int i) {
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
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f1972);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
