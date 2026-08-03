package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ia {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static boolean f2466 = true;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f2467 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f2468 = true;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2469 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2470 = 242;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f2471 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f2472 = {286, 335, 300, 276, 302, 342, 359, 354, 304, 334, 252, 352, 358, 365, 337, 341, 350, 339, 357, 308, 343};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f2473 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2474 = -1464328076;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final java.util.List<java.lang.String> f2476;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final int f2479;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final java.util.Set<java.lang.Object> f2477 = new java.util.HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final java.util.Set<java.lang.String> f2475 = new java.util.HashSet();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int f2478 = 0;

    public ia(java.util.List<java.lang.String> list, int i) {
        this.f2476 = list;
        this.f2479 = i;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.String m7914(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f2467 + 101;
        f2469 = i2 % 128;
        java.lang.Object obj2 = null;
        if (i2 % 2 == 0) {
            m7900(obj);
            super.hashCode();
            throw null;
        }
        java.lang.Object m7900 = m7900(obj);
        if (m7900 == null) {
            return m7911((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 55186), "\u0000\u0000\u0000\u0000", "篁띸錌\uf7d7", "踙⇥윁ᗺ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        }
        if (m7900 instanceof java.lang.String) {
            return m7905((java.lang.String) m7900);
        }
        if ((m7900 instanceof java.lang.Number) || (m7900 instanceof java.lang.Boolean)) {
            java.lang.String valueOf = java.lang.String.valueOf(m7900);
            int i3 = f2469 + 125;
            f2467 = i3 % 128;
            if (i3 % 2 == 0) {
                return valueOf;
            }
            super.hashCode();
            throw null;
        }
        if (!(!(m7900 instanceof java.lang.Character))) {
            int i4 = f2467 + 69;
            f2469 = i4 % 128;
            int i5 = i4 % 2;
            return m7909(java.lang.String.valueOf(m7900));
        }
        if (m7900 instanceof org.json.JSONArray) {
            return m7902((java.util.Collection<?>) com.ironsource.adqualitysdk.sdk.i.kj.m8408((org.json.JSONArray) m7900));
        }
        if (m7900 instanceof org.json.JSONObject) {
            int i6 = f2469 + 83;
            f2467 = i6 % 128;
            int i7 = i6 % 2;
            return m7903((java.util.Map<?, ?>) com.ironsource.adqualitysdk.sdk.i.kj.m8410((org.json.JSONObject) m7900));
        }
        if (m7900 instanceof java.util.Map) {
            return m7903((java.util.Map<?, ?>) m7900);
        }
        if (m7900 instanceof java.util.Collection) {
            return m7902((java.util.Collection<?>) m7900);
        }
        if (!(!m7900.getClass().isArray())) {
            return m7902((java.util.Collection<?>) m7899(m7900));
        }
        if (m7900 instanceof android.os.Bundle) {
            return m7912((android.os.Bundle) m7900);
        }
        if (m7900 instanceof android.content.SharedPreferences) {
            return m7901((android.content.SharedPreferences) m7900);
        }
        if (m7898(m7900)) {
            return m7913(m7900);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7900.getClass().getSimpleName());
        sb.append(m7911((char) (android.text.TextUtils.lastIndexOf("", '0', 0) + 62449), "\u0000\u0000\u0000\u0000", "\ue131\ue202\uf055쫳", "슿", android.text.TextUtils.lastIndexOf("", '0', 0) + 1440875234).intern());
        sb.append(java.lang.Integer.toHexString(m7900.hashCode()));
        return m7909(sb.toString());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String m7913(java.lang.Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        if (this.f2478 > this.f2479 || this.f2477.contains(obj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj.getClass().getSimpleName());
            sb.append(m7911((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62447), "\u0000\u0000\u0000\u0000", "\ue131\ue202\uf055쫳", "슿", 1440875233 - android.text.TextUtils.indexOf("", "")).intern());
            sb.append(java.lang.Integer.toHexString(obj.hashCode()));
            return m7909(sb.toString());
        }
        this.f2477.add(obj);
        this.f2478++;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(m7911((char) (android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 1), "\u0000\u0000\u0000\u0000", "흠阡\u0083틘", "竉솒\uf21a鶏碷⢺\ue7aa\ue30f႙ぢ", android.text.AndroidCharacter.getMirror('0') - '0').intern());
        sb2.append(m7909(obj.getClass().getSimpleName()));
        java.lang.String m7908 = m7908(obj);
        if (!android.text.TextUtils.isEmpty(m7908)) {
            sb2.append(m7911((char) (52799 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "穷\u13fe䁑ᓎ", "藭ಔ䩩彛墋\ue6c5혦씚\ueaa6莽㘧\ue7c5洶", android.view.View.MeasureSpec.getMode(0) + 1360264826).intern());
            sb2.append(m7905(m7908));
        }
        try {
            java.lang.reflect.Field[] m7907 = m7907(obj.getClass());
            int length = m7907.length;
            int i3 = 0;
            while (i3 < length) {
                java.lang.reflect.Field field = m7907[i3];
                if (!m7904(field)) {
                    int i4 = f2467 + 77;
                    f2469 = i4 % 128;
                    int i5 = i4 % i;
                    field.setAccessible(true);
                    java.lang.Object m7900 = m7900(field.get(obj));
                    if (!m7906(m7900)) {
                        sb2.append(m7911((char) (23710 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "㙝ね麖\u1f5c", "ﭮዜ", android.view.KeyEvent.keyCodeFromString("")).intern());
                        sb2.append(field.getName());
                        sb2.append(m7911((char) (24068 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", "େ뒿ղ䍞", "ꏺ軁", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                        sb2.append(m7914(m7900));
                    }
                }
                i3++;
                i = 2;
            }
        } catch (java.lang.Throwable unused) {
        }
        this.f2478--;
        sb2.append(m7911((char) (android.view.MotionEvent.axisFromString("") + 45577), "\u0000\u0000\u0000\u0000", "⺿ྔࢧ쎲", "\ue6a4", (-1492151250) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        java.lang.String obj2 = sb2.toString();
        int i6 = f2467 + 49;
        f2469 = i6 % 128;
        if (i6 % 2 != 0) {
            return obj2;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String m7902(java.util.Collection<?> collection) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(m7911((char) (android.os.Process.getGidForName("") + 29307), "\u0000\u0000\u0000\u0000", "䃲坻章祲", "闅", (-531137728) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        int i2 = f2469 + 123;
        f2467 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 5;
        }
        boolean z = true;
        for (java.lang.Object obj : collection) {
            int i4 = f2469 + 67;
            f2467 = i4 % 128;
            int i5 = i4 % 2;
            if (!m7906(obj)) {
                int i6 = f2467 + 83;
                f2469 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                if (!z) {
                    sb.append(m7910(null, android.view.View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0081").intern());
                }
                sb.append(m7914(obj));
                z = false;
            }
        }
        sb.append(m7910(null, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 127, null, "\u0082").intern());
        return sb.toString();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String m7903(java.util.Map<?, ?> map) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(m7911((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 53931), "\u0000\u0000\u0000\u0000", "\udd03㵡ꨳ껒", "画", android.widget.ExpandableListView.getPackedPositionChild(0L) + 859660766).intern());
        int i2 = f2467 + 65;
        f2469 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        for (java.util.Map.Entry<?, ?> entry : map.entrySet()) {
            if (!m7906(entry.getValue())) {
                if (!z) {
                    int i4 = f2469 + 7;
                    f2467 = i4 % 128;
                    sb.append(m7910(null, i4 % 2 != 0 ? 15 % android.graphics.Color.blue(1) : android.graphics.Color.blue(0) + 127, null, "\u0081").intern());
                }
                sb.append(m7909(java.lang.String.valueOf(entry.getKey())));
                sb.append(m7910(null, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, "\u0083").intern());
                sb.append(m7914(entry.getValue()));
                z = false;
            }
        }
        sb.append(m7911((char) (45575 - android.text.TextUtils.lastIndexOf("", '0', 0)), "\u0000\u0000\u0000\u0000", "⺿ྔࢧ쎲", "\ue6a4", android.os.Process.getGidForName("") - 1492151249).intern());
        return sb.toString();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.String m7905(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2469 + 77;
        f2467 = i2 % 128;
        if (i2 % 2 == 0 ? str.length() > 30 : str.length() > 15) {
            if (!this.f2475.contains(str)) {
                this.f2475.add(str);
            } else {
                int i3 = f2469 + 81;
                f2467 = i3 % 128;
                return (i3 % 2 != 0 ? m7910(null, 76 / (android.view.ViewConfiguration.getScrollDefaultDelay() - 21), null, "\u0084\u0089\u0088\u0087\u0086\u0085\u0084") : m7910(null, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u0084\u0089\u0088\u0087\u0086\u0085\u0084")).intern();
            }
        }
        return m7909(str);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7909(java.lang.String str) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7910(null, android.view.MotionEvent.axisFromString("") + 128, null, "\u0084").intern());
        sb.append(str.replace(m7911((char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 63935), "\u0000\u0000\u0000\u0000", "ኢ\uecb3뼩藹", "鳡", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 703378194).intern(), m7910(null, android.text.TextUtils.getCapsMode("", 0, 0) + 127, null, "\u008a\u008a").intern()).replace(m7910(null, 126 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), null, "\u0084").intern(), m7910(null, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, null, "\u0084\u008a").intern()).replace(m7910(null, android.graphics.ImageFormat.getBitsPerPixel(0) + 128, null, "\u008b").intern(), m7910(null, (android.os.Process.myPid() >> 22) + 127, null, "\u008c\u008a").intern()).replace(m7911((char) (36240 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), "\u0000\u0000\u0000\u0000", "髲說邭ﶍ", "쩛", (-1376161894) - android.text.TextUtils.indexOf("", "")).intern(), m7911((char) (61228 - android.view.MotionEvent.axisFromString("")), "\u0000\u0000\u0000\u0000", "爛鄱ⷭ迯", "ᔷ铃", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()).replace(m7911((char) (40413 - android.graphics.ImageFormat.getBitsPerPixel(0)), "\u0000\u0000\u0000\u0000", "魔眚\udea8\udf9d", "\uf697", android.view.View.resolveSizeAndState(0, 0, 0) - 1468589413).intern(), m7910(null, 127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, "\u008d\u008a").intern()));
        sb.append(m7910(null, 127 - android.view.View.resolveSizeAndState(0, 0, 0), null, "\u0084").intern());
        java.lang.String obj = sb.toString();
        int i2 = f2469 + 41;
        f2467 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String m7912(android.os.Bundle bundle) {
        int i = 2 % 2;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
        int i2 = f2469 + 35;
        f2467 = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                break;
            }
            int i4 = f2469 + 79;
            f2467 = i4 % 128;
            int i5 = i4 % 2;
            java.lang.String next = it.next();
            hashMap.put(next, bundle.get(next));
            i2 = f2467 + 117;
            f2469 = i2 % 128;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object obj = null;
        sb.append(m7910(null, 127 - android.text.TextUtils.indexOf("", "", 0, 0), null, "\u0083\u0084\u0092\u008d\u0092\u0086\u008f\u0084\u0081\u0084\u0095\u0091\u0086\u008c\u0087\u0094\u0084\u0083\u0084\u0093\u0093\u0092\u0091\u0090\u008f\u0084\u008e").intern());
        sb.append(m7903((java.util.Map<?, ?>) hashMap));
        sb.append(m7911((char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 45576), "\u0000\u0000\u0000\u0000", "⺿ྔࢧ쎲", "\ue6a4", (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 1492151250).intern());
        java.lang.String obj2 = sb.toString();
        int i6 = f2469 + 103;
        f2467 = i6 % 128;
        if (i6 % 2 == 0) {
            return obj2;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String m7901(android.content.SharedPreferences sharedPreferences) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7911((char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "᭥蔦슬\ued8d", "ᏼ音䥮雥纽\u1f16\udbc7䞓豢ꄡ㠕ᆧ貺Ӫ蹒觳兰胵ᤢ䫳鱕ఈ薇ᒹ\u0e64ﵺ읬甽\ue9dd\uf405펕\udb21멷\ue22f･㺿캡몭", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        sb.append(m7903((java.util.Map<?, ?>) sharedPreferences.getAll()));
        sb.append(m7911((char) (45575 - android.text.TextUtils.lastIndexOf("", '0')), "\u0000\u0000\u0000\u0000", "⺿ྔࢧ쎲", "\ue6a4", ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 1492151250).intern());
        java.lang.String obj = sb.toString();
        int i2 = f2467 + 49;
        f2469 = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.Object m7900(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f2467;
        int i3 = i2 + 25;
        f2469 = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof java.lang.ref.WeakReference)) {
            return obj instanceof java.util.concurrent.atomic.AtomicReference ? ((java.util.concurrent.atomic.AtomicReference) obj).get() : obj;
        }
        int i5 = i2 + 113;
        f2469 = i5 % 128;
        if (i5 % 2 != 0) {
            return ((java.lang.ref.WeakReference) obj).get();
        }
        int i6 = 13 / 0;
        return ((java.lang.ref.WeakReference) obj).get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.ia.f2469 + 77;
        com.ironsource.adqualitysdk.sdk.i.ia.f2467 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L22;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m7906(java.lang.Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            return true;
        }
        if (!(!(obj instanceof java.lang.String))) {
            return ((java.lang.String) obj).isEmpty();
        }
        if (obj instanceof java.lang.Number) {
            return ((java.lang.Number) obj).doubleValue() == 0.0d;
        }
        if (!(obj instanceof java.lang.Boolean)) {
            if (!(obj instanceof java.util.Collection)) {
                java.lang.Object obj2 = null;
                if (obj instanceof java.util.Map) {
                    int i2 = f2469 + 97;
                    f2467 = i2 % 128;
                    if (i2 % 2 == 0) {
                        boolean isEmpty = ((java.util.Map) obj).isEmpty();
                        int i3 = f2467 + 61;
                        f2469 = i3 % 128;
                        int i4 = i3 % 2;
                        return isEmpty;
                    }
                    ((java.util.Map) obj).isEmpty();
                    super.hashCode();
                    throw null;
                }
                if (!obj.getClass().isArray()) {
                    return false;
                }
                int i5 = f2467 + 3;
                f2469 = i5 % 128;
                if (i5 % 2 != 0) {
                    return java.lang.reflect.Array.getLength(obj) == 0;
                }
                java.lang.reflect.Array.getLength(obj);
                throw null;
            }
            int i6 = f2469 + 85;
            f2467 = i6 % 128;
            int i7 = i6 % 2;
            return ((java.util.Collection) obj).isEmpty();
        }
        int i8 = f2467 + 23;
        f2469 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 15 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7908(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f2467 + 43;
        f2469 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                java.lang.String obj2 = obj.toString();
                if (android.text.TextUtils.isEmpty(obj2)) {
                    return null;
                }
                java.lang.String hexString = java.lang.Integer.toHexString(obj.hashCode());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(obj.getClass().getName());
                sb.append(m7911((char) (62448 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), "\u0000\u0000\u0000\u0000", "\ue131\ue202\uf055쫳", "슿", android.view.View.getDefaultSize(0, 0) + 1440875233).intern());
                sb.append(hexString);
                if (!obj2.equals(sb.toString())) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(obj.getClass().getSimpleName());
                    sb2.append(m7911((char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 62448), "\u0000\u0000\u0000\u0000", "\ue131\ue202\uf055쫳", "슿", android.text.TextUtils.indexOf("", "", 0, 0) + 1440875233).intern());
                    sb2.append(hexString);
                    if (!obj2.equals(sb2.toString())) {
                        int i3 = f2469 + 85;
                        f2467 = i3 % 128;
                        int i4 = i3 % 2;
                        return obj2;
                    }
                }
                return null;
            }
            android.text.TextUtils.isEmpty(obj.toString());
            throw null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private boolean m7898(java.lang.Object obj) {
        int i = 2 % 2;
        if (obj != null) {
            int i2 = f2467 + 61;
            f2469 = i2 % 128;
            int i3 = i2 % 2;
            if (com.ironsource.adqualitysdk.sdk.i.kk.m8429(obj.getClass(), this.f2476)) {
                int i4 = f2469 + 65;
                f2467 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = f2467 + 101;
        f2469 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 29 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r6 != java.lang.String.class) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r1 = r1 + 93;
        com.ironsource.adqualitysdk.sdk.i.ia.f2467 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((!java.lang.reflect.Modifier.isStatic(r6.getModifiers())) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r6.getModifiers()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        r6 = r6.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if ((!r6.isPrimitive()) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ia.f2469;
        r4 = r1 + 83;
        com.ironsource.adqualitysdk.sdk.i.ia.f2467 = r4 % 128;
        r4 = r4 % 2;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m7904(java.lang.reflect.Field field) {
        int i = 2 % 2;
        int i2 = f2469 + 25;
        f2467 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.reflect.Field[] m7907(java.lang.Class<?> cls) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = f2467 + 17;
        f2469 = i2 % 128;
        int i3 = i2 % 2;
        while (cls != null) {
            int i4 = f2467 + 83;
            f2469 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
                if (!com.ironsource.adqualitysdk.sdk.i.kk.m8429(cls, this.f2476)) {
                    break;
                }
                arrayList.addAll(java.util.Arrays.asList(cls.getDeclaredFields()));
                cls = cls.getSuperclass();
            } else {
                if (!com.ironsource.adqualitysdk.sdk.i.kk.m8429(cls, this.f2476)) {
                    break;
                }
                arrayList.addAll(java.util.Arrays.asList(cls.getDeclaredFields()));
                cls = cls.getSuperclass();
            }
        }
        return (java.lang.reflect.Field[]) arrayList.toArray(new java.lang.reflect.Field[0]);
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static java.util.List<java.lang.Object> m7899(java.lang.Object obj) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = f2469 + 17;
        f2467 = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < java.lang.reflect.Array.getLength(obj); i4++) {
            int i5 = f2469 + 61;
            f2467 = i5 % 128;
            int i6 = i5 % 2;
            arrayList.add(java.lang.reflect.Array.get(obj, i4));
        }
        int i7 = f2467 + 3;
        f2469 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 45 / 0;
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7911(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
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
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2473) ^ f2474) ^ f2471);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7910(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
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
            char[] cArr3 = f2472;
            int i2 = f2470;
            if (f2468) {
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
            if (f2466) {
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
