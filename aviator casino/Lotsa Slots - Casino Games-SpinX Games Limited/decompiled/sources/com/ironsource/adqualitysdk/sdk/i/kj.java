package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kj {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f3040 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f3041 = 6;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3042 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f3043 = {'J', 'S', 'O', 'N', 'U', 't', 'i', 'l', io.ktor.util.date.GMTDateParser.SECONDS, 'E', 'r', 'o', ' ', 'v', 'a', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'n', 'g', 'j', '.', '(', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'c', 'e', ')', 'x', 'y', 'T', io.ktor.util.date.GMTDateParser.HOURS, 'K', 'L', io.ktor.util.date.GMTDateParser.MONTH, 'P', 'Q', 'R', 'V'};

    public interface a<T> {
        /* renamed from: ﻛ */
        T mo6106(org.json.JSONObject jSONObject, java.lang.String str);
    }

    public interface e<T> {
        /* renamed from: ｋ */
        T mo6107(org.json.JSONArray jSONArray, int i);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static org.json.JSONObject m8414(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3040 + 35;
        f3042 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8415 = m8415(jSONObject, false);
        int i4 = f3042 + 9;
        f3040 = i4 % 128;
        if (i4 % 2 == 0) {
            return m8415;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static org.json.JSONObject m8415(org.json.JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f3042 + 37;
        f3040 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.toString());
                if (z) {
                    int i4 = f3040 + 83;
                    f3042 = i4 % 128;
                    int i5 = i4 % 2;
                    jSONObject2.remove(com.ironsource.adqualitysdk.sdk.i.is.f2639);
                }
                return jSONObject2;
            } catch (org.json.JSONException unused) {
            }
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        int i6 = f3042 + 73;
        f3040 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 1 / 0;
        }
        return jSONObject3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8422(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        int i = 2 % 2;
        int i2 = f3040 + 105;
        f3042 = i2 % 128;
        int i3 = i2 % 2;
        m8409(jSONObject, jSONObject2, false);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8409(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, boolean z) {
        int i = 2 % 2;
        int i2 = f3040 + 3;
        f3042 = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (org.json.JSONException unused) {
            }
        }
        if (z) {
            jSONObject.remove(com.ironsource.adqualitysdk.sdk.i.is.f2639);
            int i3 = f3042 + 1;
            f3040 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m8406(org.json.JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = f3040 + 95;
        int i3 = i2 % 128;
        f3042 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (jSONArray != null) {
            return m8408(jSONArray);
        }
        int i4 = i3 + 83;
        f3040 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static <T> java.util.List<T> m8408(org.json.JSONArray jSONArray) {
        int i = 2 % 2;
        java.util.List<T> m8420 = m8420(jSONArray, new com.ironsource.adqualitysdk.sdk.i.kj.e<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.kj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* renamed from: ｋ */
            public final T mo6107(org.json.JSONArray jSONArray2, int i2) {
                return (T) jSONArray2.opt(i2);
            }
        });
        int i2 = f3040 + 111;
        f3042 = i2 % 128;
        if (i2 % 2 != 0) {
            return m8420;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> java.util.List<T> m8420(org.json.JSONArray jSONArray, com.ironsource.adqualitysdk.sdk.i.kj.e<T> eVar) {
        int i = 2 % 2;
        int i2 = f3040 + 113;
        f3042 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            T mo6107 = eVar.mo6107(jSONArray, i4);
            if (mo6107 != null) {
                int i5 = f3042 + 89;
                f3040 = i5 % 128;
                if (i5 % 2 != 0) {
                    arrayList.add(mo6107);
                    throw null;
                }
                arrayList.add(mo6107);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m8413(org.json.JSONObject jSONObject, java.lang.String str, java.util.List<java.lang.String> list) {
        int i = 2 % 2;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            int i2 = f3042 + 105;
            f3040 = i2 % 128;
            int i3 = i2 % 2;
            return list;
        }
        java.util.List<java.lang.String> m8406 = m8406(optJSONArray);
        int i4 = f3040 + 83;
        f3042 = i4 % 128;
        int i5 = i4 % 2;
        return m8406;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8417(org.json.JSONObject jSONObject, int i) {
        int i2 = 2 % 2;
        int i3 = f3042 + 63;
        f3040 = i3 % 128;
        int i4 = i3 % 2;
        m8418(jSONObject, i, (java.util.List<java.lang.String>) null);
        if (i4 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8418(org.json.JSONObject jSONObject, int i, java.util.List<java.lang.String> list) {
        int i2;
        int i3 = 2 % 2;
        try {
            org.json.JSONArray names = jSONObject.names();
            if (names != null) {
                while (i2 < names.length()) {
                    int i4 = f3040 + 9;
                    f3042 = i4 % 128;
                    int i5 = i4 % 2;
                    java.lang.String optString = names.optString(i2);
                    if (list != null) {
                        int i6 = f3040 + 77;
                        f3042 = i6 % 128;
                        int i7 = i6 % 2;
                        i2 = list.contains(optString) ? i2 + 1 : 0;
                    }
                    m8412(jSONObject, optString, i);
                }
            }
        } catch (org.json.JSONException e2) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8405(9 - android.text.TextUtils.getOffsetBefore("", 0), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\bÁ", (byte) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 79)).intern(), m8405(21 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), "\n\u000b\u000b\u0006\u0006\u0010\u000e\u000f\b\u0007\u0010\u000f\u0000\u000b\u0011\f\u0012\u0018\t\u0006\u008f", (byte) (32 - android.text.TextUtils.lastIndexOf("", '0', 0, 0))).intern(), e2);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m8412(org.json.JSONObject jSONObject, java.lang.String str, int i) throws org.json.JSONException {
        java.lang.String m8419;
        int i2 = 2 % 2;
        int i3 = f3040 + 79;
        f3042 = i3 % 128;
        if (i3 % 2 == 0) {
            m8419 = m8419(jSONObject.opt(str), i);
            int i4 = 8 / 0;
            if (m8419 == null) {
                return;
            }
        } else {
            m8419 = m8419(jSONObject.opt(str), i);
            if (m8419 == null) {
                return;
            }
        }
        int i5 = f3042 + 47;
        f3040 = i5 % 128;
        int i6 = i5 % 2;
        if (m8419.equals("")) {
            m8419 = null;
        }
        jSONObject.put(str, m8419);
        int i7 = f3042 + 91;
        f3040 = i7 % 128;
        int i8 = i7 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8416(org.json.JSONArray jSONArray, int i) throws org.json.JSONException {
        int i2 = 2 % 2;
        int i3 = f3042 + 45;
        f3040 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < jSONArray.length()) {
            int i6 = f3040 + 47;
            f3042 = i6 % 128;
            if (i6 % 2 == 0) {
                m8407(jSONArray, i5, i);
                i5 += 112;
            } else {
                m8407(jSONArray, i5, i);
                i5++;
            }
            int i7 = f3040 + 77;
            f3042 = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = f3042 + 83;
        f3040 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m8407(org.json.JSONArray jSONArray, int i, int i2) throws org.json.JSONException {
        int i3 = 2 % 2;
        int i4 = f3042 + 35;
        f3040 = i4 % 128;
        if (i4 % 2 == 0) {
            java.lang.String m8419 = m8419(jSONArray.opt(i), i2);
            if (m8419 != null) {
                jSONArray.put(i, m8419);
            }
            int i5 = f3042 + 31;
            f3040 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        m8419(jSONArray.opt(i), i2);
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8419(java.lang.Object obj, int i) throws org.json.JSONException {
        int i2 = 2 % 2;
        if (obj instanceof org.json.JSONObject) {
            m8417((org.json.JSONObject) obj, i);
            int i3 = f3042 + 1;
            f3040 = i3 % 128;
            int i4 = i3 % 2;
        } else if (obj instanceof org.json.JSONArray) {
            int i5 = f3042 + 31;
            f3040 = i5 % 128;
            if (i5 % 2 != 0) {
                m8416((org.json.JSONArray) obj, i);
                int i6 = 16 / 0;
            } else {
                m8416((org.json.JSONArray) obj, i);
            }
        } else if (obj instanceof java.lang.String) {
            int i7 = f3040 + 111;
            f3042 = i7 % 128;
            if (i7 % 2 == 0) {
                ((java.lang.String) obj).length();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            if (str.length() > i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str.substring(0, i));
                sb.append(m8405(14 - android.view.View.resolveSizeAndState(0, 0, 0), "\u008d\u008d\u0014\u0015\u0004\u000b\u0016\u000f\u0014\u0010\u000b\u001d\f\u001b", (byte) (96 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern());
                return sb.toString();
            }
            int i8 = f3042 + 65;
            f3040 = i8 % 128;
            int i9 = i8 % 2;
            return str;
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.util.Map<java.lang.String, java.lang.String> m8410(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        java.util.Map<java.lang.String, java.lang.String> m8421 = m8421(jSONObject, new com.ironsource.adqualitysdk.sdk.i.kj.a<java.lang.String>() { // from class: com.ironsource.adqualitysdk.sdk.i.kj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* renamed from: ﻛ */
            public final /* synthetic */ java.lang.String mo6106(org.json.JSONObject jSONObject2, java.lang.String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i2 = f3040 + 3;
        f3042 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return m8421;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> java.util.Map<java.lang.String, T> m8421(org.json.JSONObject jSONObject, com.ironsource.adqualitysdk.sdk.i.kj.a<T> aVar) {
        int i = 2 % 2;
        if (jSONObject == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        int i2 = f3042 + 7;
        f3040 = i2 % 128;
        int i3 = i2 % 2;
        while (!(!keys.hasNext())) {
            int i4 = f3042 + 99;
            f3040 = i4 % 128;
            if (i4 % 2 == 0) {
                java.lang.String next = keys.next();
                hashMap.put(next, aVar.mo6106(jSONObject, next));
            } else {
                java.lang.String next2 = keys.next();
                hashMap.put(next2, aVar.mo6106(jSONObject, next2));
                throw null;
            }
        }
        return hashMap;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static org.json.JSONObject m8411(int i, int i2, long j, long j2) {
        int i3 = 2 % 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (j <= -1) {
                jSONObject.put(m8405(android.text.TextUtils.getOffsetAfter("", 0) + 1, "½", (byte) (69 - android.graphics.Color.argb(0, 0, 0, 0))).intern(), -1);
                jSONObject.put(m8405(-android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), "ß", (byte) (101 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()))).intern(), -1);
                jSONObject.put(m8405(-android.text.TextUtils.lastIndexOf("", '0', 0, 0), "æ", (byte) (114 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).intern(), -1);
                jSONObject.put(m8405((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, "\u008a", (byte) (android.view.MotionEvent.axisFromString("") + 22)).intern(), -1);
            } else {
                int i4 = f3040 + 65;
                f3042 = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.put(m8405(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "½", (byte) (70 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), i);
                jSONObject.put(m8405(1 - android.text.TextUtils.indexOf("", "", 0), "ß", (byte) (android.os.Process.getGidForName("") + 103)).intern(), i2);
                jSONObject.put(m8405(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1, "æ", (byte) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 115)).intern(), j);
                jSONObject.put(m8405(1 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "\u008a", (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 21)).intern(), j2);
                int i6 = f3042 + 75;
                f3040 = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (org.json.JSONException e2) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8405((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\bÁ", (byte) (78 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).intern(), m8405(29 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\n\u000b\u000b\u0006\u0006\u0010\u001c\u0010\u0014\u0011\u0000\u000b\u0011\f\r\u0006\u0014\u000e\u0003\u001d\t\u0017\u001c\"\u0012\u0018\t\u0006À", (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 82)).intern(), e2);
        }
        return jSONObject;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m8405(int i, java.lang.String str, byte b) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f3043;
            char c = f3041;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                    com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                    if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b);
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b);
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                            int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                        } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                            int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                        } else {
                            int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                }
            }
            str2 = new java.lang.String(cArr4);
        }
        return str2;
    }
}
