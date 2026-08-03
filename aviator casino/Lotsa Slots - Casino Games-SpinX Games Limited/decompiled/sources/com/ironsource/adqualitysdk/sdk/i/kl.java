package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kl {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3055 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3056 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f3057 = 15535;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.ref.WeakReference<com.ironsource.adqualitysdk.sdk.i.bb> f3058 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f3059 = 65328;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f3060 = 45700;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f3061 = 22612;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8451(com.ironsource.adqualitysdk.sdk.i.bb bbVar) {
        int i = 2 % 2;
        f3058 = new java.lang.ref.WeakReference<>(bbVar);
        int i2 = f3055 + 115;
        f3056 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.Throwable m8446(java.lang.Throwable th) {
        int i = 2 % 2;
        while (th.getCause() != null) {
            int i2 = f3055 + 117;
            f3056 = i2 % 128;
            int i3 = i2 % 2;
            th = th.getCause();
        }
        int i4 = f3056 + 7;
        f3055 = i4 % 128;
        int i5 = i4 % 2;
        return th;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8455(java.lang.String str, java.lang.String str2, java.lang.Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f3056 + 63;
        f3055 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8445(str, str2, th, z, true);
            } else {
                m8445(str, str2, th, z, false);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8445(java.lang.String str, java.lang.String str2, java.lang.Throwable th, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = f3056 + 69;
        f3055 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8456(str, str2, th, z, z2, false);
            } else {
                m8456(str, str2, th, z, z2, false);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8456(java.lang.String str, java.lang.String str2, java.lang.Throwable th, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = f3056 + 109;
        int i3 = i2 % 128;
        f3055 = i3;
        int i4 = i2 % 2;
        try {
            if (z) {
                int i5 = i3 + 49;
                f3056 = i5 % 128;
                int i6 = i5 % 2;
                com.ironsource.adqualitysdk.sdk.i.m.m8528(str, str2, z3);
                if (th != null) {
                    int i7 = f3055 + 69;
                    f3056 = i7 % 128;
                    com.ironsource.adqualitysdk.sdk.i.m.m8523(str, (i7 % 2 == 0 ? m8452("\u1249麷Ⲃ騬吏⡋稱迂", 78 % (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))) : m8452("\u1249麷Ⲃ騬吏⡋稱迂", 9 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), th, z3);
                }
            } else {
                com.ironsource.adqualitysdk.sdk.i.m.m8523(str, str2, th, z3);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8452("⅟⸊\ud918戳銟ꎋ\ud918戳°䊂", 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
            sb.append(str);
            m8448(str, str2, sb.toString(), th, null, null, false, z2, z3);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8444(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th, com.ironsource.adqualitysdk.sdk.i.dn dnVar, org.json.JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f3055 + 111;
        f3056 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m8448(str, str2, str3, th, dnVar, jSONObject, true, false, false);
            int i4 = f3056 + 21;
            f3055 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8454(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th, org.json.JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f3056 + 123;
        f3055 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8448(str, str2, str3, th, null, jSONObject, true, false, z);
            } else {
                m8448(str, str2, str3, th, null, jSONObject, true, false, z);
            }
            int i3 = f3056 + 5;
            f3055 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8447(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th) {
        int i = 2 % 2;
        int i2 = f3055 + 11;
        f3056 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m8449(str, str2, str3, th, false);
            int i4 = f3055 + 21;
            f3056 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m8449(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f3056 + 33;
        f3055 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8448(str, str2, str3, th, null, null, true, false, false);
            } else {
                m8448(str, str2, str3, th, null, null, false, false, false);
            }
            int i3 = f3056 + 71;
            f3055 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 54 / 0;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m8448(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th, com.ironsource.adqualitysdk.sdk.i.dn dnVar, org.json.JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        java.lang.String str4;
        int i = 2 % 2;
        int i2 = f3055 + 21;
        f3056 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                throw null;
            }
            if (z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str3);
                sb.append(m8452("呌庡", android.text.TextUtils.getOffsetAfter("", 0) + 1).intern());
                sb.append(str);
                java.lang.String obj = sb.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(m8452("艂ᑞ㨢\ud8feܙ턏䪷\ue66b", 7 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern());
                sb2.append(obj);
                sb2.append(m8452("㘌䲟", android.text.TextUtils.getTrimmedLength("") + 1).intern());
                com.ironsource.adqualitysdk.sdk.i.m.m8533(str, sb2.toString(), th, dnVar, z3);
                str4 = obj;
            } else {
                str4 = str3;
            }
            com.ironsource.adqualitysdk.sdk.i.bb bbVar = f3058.get();
            if (bbVar != null) {
                int i3 = f3055 + 11;
                f3056 = i3 % 128;
                if (i3 % 2 == 0) {
                    bbVar.m6282(str, str2, str4, m8450(th, dnVar), jSONObject, z2);
                    int i4 = 49 / 0;
                } else {
                    bbVar.m6282(str, str2, str4, m8450(th, dnVar), jSONObject, z2);
                }
                int i5 = f3056 + 125;
                f3055 = i5 % 128;
                int i6 = i5 % 2;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m8450(java.lang.Throwable th, com.ironsource.adqualitysdk.sdk.i.dn dnVar) {
        int i = 2 % 2;
        int i2 = f3056;
        int i3 = i2 + 71;
        f3055 = i3 % 128;
        int i4 = i3 % 2;
        if (dnVar != null) {
            int i5 = i2 + 27;
            f3055 = i5 % 128;
            int i6 = i5 % 2;
            java.lang.String obj = dnVar.toString();
            int i7 = f3056 + 83;
            f3055 = i7 % 128;
            if (i7 % 2 == 0) {
                return obj;
            }
            java.lang.Object obj2 = null;
            super.hashCode();
            throw null;
        }
        if (!(!(th instanceof com.ironsource.adqualitysdk.sdk.i.dn))) {
            return th.toString();
        }
        return android.util.Log.getStackTraceString(th);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8453(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i = 2 % 2;
        int i2 = f3056 + 99;
        f3055 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m8443(str, str2, str3, str4);
            int i4 = f3055 + 51;
            f3056 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m8443(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i = 2 % 2;
        try {
            if (android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str3);
            sb.append(m8452("呌庡", android.widget.ExpandableListView.getPackedPositionType(0L) + 1).intern());
            sb.append(str);
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(m8452("虒礢䋋༻ﾻ㒝勲\ue990枷\uf101䪷\ue66b", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10).intern());
            sb2.append(obj);
            sb2.append(m8452("ᙉ嘝훟ᬳ\ue244맘ਇ䊶䑁Ⳇ殿뒠䋡Ს", 13 - android.view.View.MeasureSpec.getMode(0)).intern());
            com.ironsource.adqualitysdk.sdk.i.m.m8528(str, sb2.toString(), false);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str2);
            java.lang.String str5 = "";
            if (str4 != null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(m8452("\uf1c3\udd63", android.text.TextUtils.getOffsetBefore("", 0) + 1).intern());
                sb4.append(str4);
                str5 = sb4.toString();
            }
            sb3.append(str5);
            com.ironsource.adqualitysdk.sdk.i.m.m8528(str, sb3.toString(), false);
            com.ironsource.adqualitysdk.sdk.i.bb bbVar = f3058.get();
            if (bbVar != null) {
                int i2 = f3055 + 103;
                f3056 = i2 % 128;
                if (i2 % 2 == 0) {
                    bbVar.m6290(str, str2, obj, str4);
                    java.lang.Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
                bbVar.m6290(str, str2, obj, str4);
            }
            int i3 = f3056 + 113;
            f3055 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8452(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3059)) ^ ((c2 >>> 5) + f3057)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3061) ^ ((c3 + i2) ^ ((c3 << 4) + f3060))));
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
