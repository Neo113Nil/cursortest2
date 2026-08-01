package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺛ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1226 {

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3461;

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3462;

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3463;

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3464;

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3465;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3466;

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3467;

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3468;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f3469;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final C1111 f3475;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public JSONObject f3476;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final C0969 f3477;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public C0909 f3478;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public C0598 f3479 = null;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public C0807 f3480;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0557 f3481;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0430 f3482;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1074 f3483;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0327 f3484;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f3474 = StringFog.decrypt("VAWBbQEPrIxKCZ92EASImg==\n", "BmDsAnVq7eg=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f3473 = StringFog.decrypt("T02oeTsVtIk=\n", "Li7cEE18wPA=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f3472 = StringFog.decrypt("i7qWag==\n", "/dPzHT3zKDo=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f3471 = StringFog.decrypt("HQbbuYUW\n", "am+13ephuaE=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3470 = StringFog.decrypt("XpCOxGwEvyBzmpzIeRSoNVo=\n", "P/P6rRpty1k=\n");

    static {
        StringFog.decrypt("JUhE4vwfAus7RFr57RQm/Vk=\n", "dy0pjYh6Q48=\n");
        f3469 = StringFog.decrypt("AL/VLy0VjL48sd4hIAe64g==\n", "U9C6QkF0zsw=\n");
        StringFog.decrypt("WRSWEj36wttZE64SOOfTzH0FzA==\n", "GHfie0uTtqI=\n");
        StringFog.decrypt("tz/7MAKVE+eSIvspJoNx\n", "4VaeR0PxX44=\n");
        StringFog.decrypt("MoDaTSELhCwpgMddKxKgOks=\n", "Zem0KU58xUg=\n");
        StringFog.decrypt("FIkFNqUS8+AZgxc6sALk9TDE\n", "VepxX9N7h5k=\n");
        StringFog.decrypt("0D+pqqi0ioHDNA==\n", "uVHA3sHV5ug=\n");
        StringFog.decrypt("yBY96yk0jlPQFx0=\n", "qXJ5glpE4jI=\n");
        StringFog.decrypt("W+jyQns1RPdD6dJucDFa9w==\n", "Ooy2KwhFKJY=\n");
        StringFog.decrypt("vpPjx+s7tqi7\n", "3/egq4JY3c0=\n");
        StringFog.decrypt("BV0UePiRM8AAfyV7/Lgr\n", "ZDlXFJHyWKU=\n");
        StringFog.decrypt("xyF465t8IuM=\n", "pkU7h/QPR4c=\n");
        StringFog.decrypt("kpaL7asoU72Hl4v+\n", "5P/umupcJ9w=\n");
        StringFog.decrypt("j08FhqLb2eGdaQusr8fCyY5PCbE=\n", "+Cpnxcqptow=\n");
        StringFog.decrypt("FpadhSn8IXAQjZo=\n", "dePu8UaRZAY=\n");
        StringFog.decrypt("Ncu3F5kiof4u8ZkliBKv9yjKgwmN\n", "WqX2Z+lxxJA=\n");
        StringFog.decrypt("jnH8qqnQlHWUbdO/vdaeR45t2L2r7YRvhQ==\n", "4R+92tmC8QE=\n");
        StringFog.decrypt("YLP207muydZ7pPTCqKbL2ms=\n", "D923sM3Hv78=\n");
        StringFog.decrypt("ysAuEjR0n0PR1zwFIW+dT8E=\n", "pa5vcUAd6So=\n");
        StringFog.decrypt("7IOQ/Yg58Ov3lIP7jyXr5+c=\n", "g+3RnvxQhoI=\n");
        StringFog.decrypt("xLja3f3VSOXfr8vf/M9b6A==\n", "q9abvom8Pow=\n");
        StringFog.decrypt("0i4/nzqCG1zJOS2IIZsdUNk=\n", "vUB+/E7rbTU=\n");
        StringFog.decrypt("tbrhL4trQ4eurfMtiWd8gKmgwSKcZ2aau6DF\n", "2tSgTP8CNe4=\n");
        StringFog.decrypt("PbawUJLub0QmobVWlfNrQiu9lQ==\n", "UtjxM+aHGS0=\n");
        f3468 = StringFog.decrypt("3wMTE1n6Gzo=\n", "tm15djqOUUk=\n");
        f3467 = StringFog.decrypt("qbDJajf76Qegtw==\n", "w8OdBX6Vg2I=\n");
        f3466 = StringFog.decrypt("LqKJv3mkbs0=\n", "RNHZzRzCB7U=\n");
        f3465 = StringFog.decrypt("Klfb8VKAVmEVVw==\n", "XyS+tCr0JAA=\n");
        f3464 = StringFog.decrypt("6zuwSxN+Z9k=\n", "ikvADXwdEqo=\n");
        StringFog.decrypt("RBzBQxSa079JBcJxHpfDvis=\n", "BWyxBXv5psw=\n");
        StringFog.decrypt("xXoc+aNcVVjFZy4=\n", "qhRalsApJhQ=\n");
        StringFog.decrypt("+PYuhrCQf8vy6xyGoYBo\n", "l5ho6dPlDJk=\n");
        f3463 = StringFog.decrypt("ibHgy32X5n6crO/JZJs=\n", "6NWhqAn+kBc=\n");
        f3462 = StringFog.decrypt("bqq/GBykDXluvZo/GL4r\n", "D87pcXnTThU=\n");
        f3461 = StringFog.decrypt("b8hk7oQyXNdq72D0og==\n", "GaEBmcdePaQ=\n");
    }

    public C1226(C0969 c0969, C0430 c0430, AbstractC0557 abstractC0557, C0327 c0327, C1074 c1074) {
        this.f3484 = c0327;
        C1074 c10742 = new C1074(new HashMap(), c1074, true);
        this.f3483 = c10742;
        Iterator it = c0327.m5383().iterator();
        while (it.hasNext()) {
            c10742.f3185.put((String) it.next(), null);
        }
        c1074.m5838(c0327.f314.f3776, this);
        this.f3482 = c0430;
        this.f3481 = abstractC0557;
        this.f3480 = new C0807(this);
        this.f3477 = c0969;
        this.f3475 = new C1111();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5928() {
        JSONObject jSONObject;
        ArrayList arrayList;
        Iterator it = this.f3484.m5385().iterator();
        while (it.hasNext()) {
            C1306 c1306 = (C1306) it.next();
            C0470 c0470 = (C0470) AbstractC0398.m5397();
            if (c0470.f877 == null) {
                synchronized (c0470) {
                    jSONObject = c0470.f3224;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(c0470.f906);
                if (optJSONArray != null) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        ISAdQualityAdType fromInt = ISAdQualityAdType.fromInt(optJSONArray.optInt(i));
                        if (fromInt != null) {
                            arrayList.add(fromInt);
                        }
                    }
                } else {
                    arrayList = null;
                }
                c0470.f877 = arrayList;
            }
            ArrayList arrayList2 = c0470.f877;
            ISAdQualityAdType iSAdQualityAdType = c1306.f3768;
            boolean z = true;
            if (arrayList2 != null && iSAdQualityAdType != ISAdQualityAdType.UNKNOWN) {
                z = true ^ arrayList2.contains(iSAdQualityAdType);
            }
            if (z) {
                m5934(c1306);
            }
        }
        String decrypt = StringFog.decrypt("SjLCaeigFbBUPtxy+asxpjY+wW/orDW4cS3K\n", "GFevBpzFVNQ=\n");
        ArrayList arrayList3 = new ArrayList();
        AbstractC1145.m5892(new C0803(this, decrypt, arrayList3));
        AbstractC1145.m5891(new C0768(this, decrypt, arrayList3));
        try {
            AbstractC1145.m5893(new C0706(new C0750(this, decrypt, arrayList3)));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m5929() {
        return this.f3477.f2812.f3103 + StringFog.decrypt("Tw==\n", "YFwJWHFe04o=\n") + this.f3484.f314.f3776;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5934(C1306 c1306) {
        char c;
        String str = c1306.f3769;
        switch (str.hashCode()) {
            case -1825565413:
                if (str.equals(f3470)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1655966961:
                if (str.equals(f3473)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -787751952:
                if (str.equals(f3471)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3619493:
                if (str.equals(f3472)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1144592183:
                if (str.equals(f3464)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        C0691 c0691 = null;
        if (c == 0) {
            JSONObject m5933 = m5933(c1306.f3767);
            if (m5933 != null) {
                String str2 = c1306.f3764;
                if (!TextUtils.isEmpty(str2)) {
                    C0623 m5382 = str2 != null ? this.f3484.m5382(str2) : null;
                    if (m5382 != null) {
                        c0691 = new C0691(this, m5382, str2);
                    } else {
                        AbstractC1086.m5875(m5929(), AbstractC1257.m5940("xezBfPBzO96L5g==\n", "5YKuCNAVVKs=\n", AbstractC1196.m5920("MPRR4AS7qZcY90zmAqvgnBOxQ+cZ/w==\n", "fZEliGvfifM=\n", new StringBuilder(), str2)), null, null);
                    }
                }
                C0691 c06912 = c0691;
                C0509 c0509 = new C0509(this, false);
                C0509 c05092 = new C0509(this, true);
                C1111 c1111 = this.f3475;
                C0425 c0425 = new C0425(this, c05092, c0509);
                C0939 c0939 = new C0939(this);
                c1111.getClass();
                AbstractC1145.m5891(new C1144(c1111, m5933, c06912, c0425, c0939));
            }
            m5935(f3473, c1306);
            return;
        }
        if (c == 1) {
            JSONObject m59332 = m5933(c1306.f3767);
            if (m59332 != null) {
                String str3 = c1306.f3765;
                C0502 c0502 = new C0502(this, true);
                C0502 c05022 = new C0502(this, false);
                if (TextUtils.isEmpty(str3)) {
                    C1111 c11112 = this.f3475;
                    C0406 c0406 = new C0406(this, c0502, c05022);
                    c11112.getClass();
                    AbstractC1145.m5891(new C1118(c11112, m59332, null, c0406));
                } else {
                    C0623 m53822 = str3 != null ? this.f3484.m5382(str3) : null;
                    if (m53822 != null) {
                        C0650 c0650 = new C0650(this, m53822);
                        C1111 c11113 = this.f3475;
                        C0406 c04062 = new C0406(this, c0502, c05022);
                        c11113.getClass();
                        AbstractC1145.m5891(new C1118(c11113, m59332, c0650, c04062));
                    } else {
                        AbstractC1086.m5875(m5929(), AbstractC1257.m5940("4JRosNEV1B6ung==\n", "wPoHxPFzu2s=\n", AbstractC1196.m5920("/NQN0VLRIfzU1xDXVMFo99+RH9ZPlQ==\n", "sbF5uT21AZg=\n", new StringBuilder(), str3)), null, null);
                    }
                }
            }
            m5935(f3472, c1306);
            return;
        }
        if (c == 2) {
            JSONObject m59333 = m5933(c1306.f3767);
            if (m59333 != null) {
                C0472 c0472 = new C0472(this, false);
                C0472 c04722 = new C0472(this, true);
                C1111 c11114 = this.f3475;
                C0421 c0421 = new C0421(this, c04722, c0472);
                c11114.getClass();
                AbstractC1145.m5891(new C1131(c11114, m59333, c0421));
            }
            m5935(f3471, c1306);
            return;
        }
        if (c != 3) {
            if (c != 4) {
                return;
            }
            this.f3478 = new C0909(new C0923(this, m5931(c1306.f3766)));
        } else if (this.f3479 == null) {
            this.f3479 = new C0598(this, m5931(c1306.f3766));
            AbstractC0554 m5521 = AbstractC0554.m5521();
            C0598 c0598 = this.f3479;
            synchronized (m5521) {
                m5521.f1253.add(c0598);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5935(String str, C1306 c1306) {
        char c;
        JSONObject m5933 = m5933(c1306.f3767);
        if (m5933 == null || !m5933.has(StringFog.decrypt("YyHjV+1JAhZyLeJd6mMzG2cr\n", "F06WNIUNZ2I=\n"))) {
            return;
        }
        String str2 = null;
        EnumC0753 m5654 = EnumC0753.m5654(m5933.optString(StringFog.decrypt("iClRgj/82dKZJVCIONbo34wj\n", "/EYk4Ve4vKY=\n"), null));
        int hashCode = str.hashCode();
        if (hashCode == -1655966961) {
            if (str.equals(f3473)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -787751952) {
            if (hashCode == 3619493 && str.equals(f3472)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(f3471)) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            str2 = m5933.optString(f3463, null);
        } else if (c == 1) {
            str2 = m5933.optString(f3462, null);
        } else if (c == 2) {
            str2 = m5933.optString(f3461, null);
        }
        if (m5654 != null) {
            C0747 m5649 = C0747.m5649();
            synchronized (m5649) {
                m5649.f2081.post(new C0764(m5649, str2, m5654));
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5927(C1226 c1226, Activity activity, ArrayList arrayList) {
        c1226.getClass();
        return arrayList.isEmpty() || arrayList.contains(activity.getClass().getName());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5925(C1226 c1226, Activity activity) {
        c1226.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC0739.f2066, c1226.f3477.f2812.f3104);
            jSONObject.put(AbstractC0739.f2020, c1226.f3477.f2812.f3102);
            jSONObject.put(AbstractC0739.f2019, c1226.f3477.f2809.mo5371());
            jSONObject.put(StringFog.decrypt("66wOQU7H+w==\n", "is96Dy+qnrM=\n"), activity.getClass().getName());
        } catch (JSONException unused) {
            AbstractC0544.m5502(f3474, StringFog.decrypt("p13lEADMMpWHTuMWHItxhoFbtxUBgz/HjU39GhGY\n", "4i+Xf3LsUec=\n"));
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5926(C1226 c1226, String str, boolean z, boolean z2, List list) {
        boolean z3;
        c1226.getClass();
        try {
            C0476 m5384 = c1226.f3484.m5384(str);
            if (m5384 != null) {
                String str2 = m5384.f922;
                C0623 m5382 = c1226.f3484.m5382(str2);
                if (m5382 != null) {
                    if (z == m5384.f924 && z2 == m5384.f923) {
                        C0932 m5751 = C0932.m5751();
                        synchronized (m5751) {
                            z3 = m5751.f2617;
                        }
                        if (z3) {
                            String m5929 = c1226.m5929();
                            int i = AbstractC1086.f3200;
                            String str3 = StringFog.decrypt("GIsmEQ==\n", "S9lqMeoC170=\n") + m5929;
                            AbstractC0544.m5512(str3, str3, str, false);
                        }
                        m5382.m5583(c1226.f3483, c1226, list);
                        return;
                    }
                    return;
                }
                new C0456(c1226, str2, StringFog.decrypt("KjcoFM1w4xcBITYS0TerExkgNA+f\n", "b0Vae79Qi3Y=\n") + str).m5536(c1226.m5929());
            }
        } catch (Throwable th) {
            AbstractC1086.m5875(c1226.m5929(), AbstractC0548.m5514("HamwUaEWgkY2v65XvVHKQi6+rErz\n", "WNvCPtM26ic=\n", new StringBuilder(), str), th, null);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5930(String str) {
        Class cls;
        AbstractC0557 abstractC0557 = this.f3481;
        String substring = str.substring(0, str.length() - StringFog.decrypt("MpGktAFg\n", "HPLI1XITsvU=\n").length());
        abstractC0557.getClass();
        try {
            if (Prode.class.getName().equals("com.ironsource.adqualitysdk.sdk.i.Prode")) {
                cls = abstractC0557.m5528(substring, false);
            } else {
                cls = abstractC0557.mo5370(substring);
            }
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            return cls.getName();
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m5932() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC0739.f2066, this.f3477.f2812.f3104);
            jSONObject.put(AbstractC0739.f2019, this.f3477.f2809.mo5371());
            jSONObject.put(AbstractC0739.f2020, this.f3477.f2812.f3102);
        } catch (JSONException e) {
            AbstractC0544.m5502(f3474, StringFog.decrypt("auGgpA2F5bNK8qaiEcKmpFn2vL9fz/WuQany\n", "L5PSy3+lhsE=\n") + e.getLocalizedMessage());
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m5933(JSONObject jSONObject) {
        E e;
        String str = f3466;
        String optString = jSONObject.optString(str);
        jSONObject.remove(str);
        String str2 = f3468;
        if (jSONObject.optBoolean(str2)) {
            C0969 c0969 = this.f3477;
            synchronized (c0969) {
                e = c0969.f2806;
            }
            if (e != null) {
                if (!TextUtils.isEmpty(e.f105)) {
                    jSONObject.remove(str2);
                    try {
                        jSONObject.put(f3467, optString + e.f105);
                    } catch (JSONException unused) {
                    }
                }
                if (e.f104) {
                    try {
                        jSONObject.put(f3465, true);
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof String) {
                String str3 = (String) opt;
                if (str3.endsWith(StringFog.decrypt("43PTekZj\n", "zRC/GzUQ2A8=\n"))) {
                    String m5930 = m5930(str3);
                    if (m5930 != null) {
                        try {
                            jSONObject.put(next, m5930);
                        } catch (JSONException unused3) {
                        }
                    } else {
                        String m5929 = m5929();
                        String m5940 = AbstractC1257.m5940("9BMhtN3rl3K6GW7t3eyaaKYJJ66arZRupwkrrpj/2HSxCTuw\n", "1H1OwP2N+Ac=\n", AbstractC1196.m5920("wAwf4HIa\n", "g2B+kwE6Jeo=\n", new StringBuilder(), str3));
                        int i = AbstractC1086.f3200;
                        String m5514 = AbstractC0548.m5514("GIsmEQ==\n", "S9lqMeoC170=\n", new StringBuilder(), m5929);
                        AbstractC0544.m5512(m5514, m5514, m5940, false);
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (opt instanceof JSONArray) {
                jSONObject.put(next, new JSONArray((Collection) m5931(AbstractC0647.m5604((JSONArray) opt))));
            }
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m5931(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.endsWith(StringFog.decrypt("43PTekZj\n", "zRC/GzUQ2A8=\n"))) {
                String m5930 = m5930(str);
                if (m5930 != null) {
                    arrayList.add(m5930);
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5936(String str, JSONObject jSONObject) {
        C1095 c1095;
        if (str.equals(StringFog.decrypt("/UCjwZbo9RH9XZnB\n", "nCT8pf+bhX0=\n"))) {
            C0422 c0422 = this.f3477.f2811;
            c0422.getClass();
            int optInt = jSONObject.optInt(AbstractC0739.f2063);
            C1095 c10952 = c0422.f566;
            if (c10952 != null) {
                c10952.adDisplayed(jSONObject.optString(AbstractC0739.f2066), ISAdQualityAdType.fromInt(optInt));
            }
        } else if (str.equals(StringFog.decrypt("Weqk0Qd7z95c\n", "OI77smsUvLs=\n")) && (c1095 = this.f3477.f2811.f566) != null) {
            c1095.adClosed(jSONObject.optString(AbstractC0739.f2066), ISAdQualityAdType.fromInt(jSONObject.optInt(AbstractC0739.f2063)));
        }
        JSONObject m5932 = m5932();
        AbstractC0647.m5608(m5932, jSONObject, false);
        JSONObject m5606 = AbstractC0647.m5606(m5932, false);
        if (str.equals(AbstractC0739.f2026)) {
            C0422 c04222 = this.f3477.f2811;
            c04222.f565.post(new C0475(c04222, C0422.f558, m5606));
            return;
        }
        if (str.equals(AbstractC0739.f2025)) {
            C0422 c04223 = this.f3477.f2811;
            c04223.f565.post(new C0475(c04223, C0422.f557, m5606));
            return;
        }
        if (str.equals(AbstractC0739.f2027)) {
            C0422 c04224 = this.f3477.f2811;
            c04224.f565.post(new C0475(c04224, C0422.f559, m5606));
            return;
        }
        if (str.equals(AbstractC0739.f2028)) {
            C0422 c04225 = this.f3477.f2811;
            c04225.f565.post(new C0475(c04225, C0422.f560, m5606));
            return;
        }
        if (str.equals(AbstractC0739.f2024)) {
            C0422 c04226 = this.f3477.f2811;
            c04226.f565.post(new C0475(c04226, C0422.f556, m5606));
        } else if (str.equals(AbstractC0739.f2022)) {
            C0422 c04227 = this.f3477.f2811;
            c04227.f565.post(new C0475(c04227, C0422.f554, m5606));
        } else if (str.equals(AbstractC0739.f2023)) {
            C0422 c04228 = this.f3477.f2811;
            c04228.f565.post(new C0475(c04228, C0422.f555, m5606));
        } else {
            C0422 c04229 = this.f3477.f2811;
            c04229.f565.post(new C0475(c04229, str, jSONObject));
        }
    }
}
