package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ki {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f3027 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f3028;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static java.lang.reflect.Field f3031;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.reflect.Field f3035;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.Object f3036;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.reflect.Field f3037;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.Class f3038;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.reflect.Field f3039;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f3032 = {-1992325352, 1955015455, 517313671, 186703828, -727561490, -1177086777, 668105904, -565761342, 286158588, 1557318925, 486972505, 1423793213, 270630203, -1519595010, 130838156, 1539989123, -571200845, -582562086};

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f3030 = 58088;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f3034 = 41687;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char f3029 = 52505;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f3033 = 2450;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ki.f3038 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ki.f3036 == null) goto L11;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.List<android.view.View> m8402() {
        int i = 2 % 2;
        int i2 = f3028 + 45;
        f3027 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                int i3 = 86 / 0;
                if (f3038 != null) {
                }
                java.lang.Class<?> cls = java.lang.Class.forName(m8401("䩋瘹\ude00㲚ꥯ\uf8ab㋳捔\uda76툎ㄯ蝯ፙ娂뺘풙唧食쎬劙䩋瘹呁Ჟ蛶뵶䟛蟨쒕딵びᘚ", 33 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                f3038 = cls;
                f3036 = cls.getMethod(m8401("危褧ͯ뙚瘵萎ᶖҵﭧ屼ळ\uf1e0", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern(), new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                int i4 = f3027 + 67;
                f3028 = i4 % 128;
                int i5 = i4 % 2;
            }
            return m8403(f3038, f3036);
        } catch (java.lang.Throwable th) {
            java.lang.String intern = m8401("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8395(new int[]{90898600, 367940862, -910603565, 209217793, -1783790534, -111845852, -1227209940, 1534421294, -464523105, 1882906361, -1376161245, -682914033, 192408266, 940389713, -990802492, 2055557116, 1669599085, -1982536227}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 35).intern());
            sb.append(th.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb.toString());
            return new java.util.ArrayList();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static android.view.View.OnClickListener m8400(android.view.View view) {
        try {
            java.lang.Object m8399 = m8399(view);
            if (m8399 == null) {
                return null;
            }
            java.lang.Class<?> cls = m8399.getClass();
            synchronized (com.ironsource.adqualitysdk.sdk.i.ke.class) {
                if (f3037 == null) {
                    f3037 = m8391(cls, m8395(new int[]{-1997946794, 540414940, -969712809, -297731321, -341774595, -976532191, -1796063354, 598865851}, 16 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                }
            }
            return (android.view.View.OnClickListener) f3037.get(m8399);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8396(android.view.View view, com.ironsource.adqualitysdk.sdk.i.hp.b bVar) {
        android.view.View.OnClickListener m8400;
        int i = 2 % 2;
        int i2 = f3027 + 23;
        f3028 = i2 % 128;
        if (i2 % 2 != 0) {
            m8400 = m8400(view);
            int i3 = 22 / 0;
            if (m8400 instanceof com.ironsource.adqualitysdk.sdk.i.hp) {
                return;
            }
        } else {
            m8400 = m8400(view);
            if (m8400 instanceof com.ironsource.adqualitysdk.sdk.i.hp) {
                return;
            }
        }
        view.setOnClickListener(new com.ironsource.adqualitysdk.sdk.i.hp(m8400, bVar));
        int i4 = f3028 + 35;
        f3027 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static android.view.View.OnTouchListener m8390(android.view.View view) {
        try {
            java.lang.Object m8399 = m8399(view);
            if (m8399 == null) {
                return null;
            }
            java.lang.Class<?> cls = m8399.getClass();
            synchronized (com.ironsource.adqualitysdk.sdk.i.ke.class) {
                if (f3031 == null) {
                    f3031 = m8391(cls, m8401("䜤嬖յꝲ䮐汾嗂똦䤡⿈覅\u31ecᆙ\udef4蛶뵶", (-16777200) - android.graphics.Color.rgb(0, 0, 0)).intern());
                }
            }
            return (android.view.View.OnTouchListener) f3031.get(m8399);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static android.media.MediaPlayer m8394(android.widget.VideoView videoView) {
        java.lang.reflect.Field m8391;
        int i = 2 % 2;
        java.lang.Object obj = null;
        try {
            m8391 = m8391(android.widget.VideoView.class, m8395(new int[]{-1600987765, -1706321381, -1373456830, -1349126350, -1583703354, -252218446}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11).intern());
        } catch (java.lang.Exception e) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8401("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - android.graphics.Color.argb(0, 0, 0, 0)).intern(), m8401("蛶뵶쎧㕹픺ꗾ뺘풙囫Ǚ趥\uda4eꆦ騈ꨖ娱\u0dc8隇律滲䩬泭賷\ufafd", android.text.TextUtils.indexOf("", "", 0, 0) + 23).intern(), (java.lang.Throwable) e, false);
        }
        if (m8391 == null) {
            int i2 = f3028 + 19;
            f3027 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f3027 + 113;
        f3028 = i4 % 128;
        if (i4 % 2 == 0) {
            return (android.media.MediaPlayer) m8391.get(videoView);
        }
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((r2 instanceof com.ironsource.adqualitysdk.sdk.i.hm) == false) goto L11;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8404(android.media.MediaPlayer mediaPlayer, com.ironsource.adqualitysdk.sdk.i.hm.e eVar) {
        java.lang.reflect.Field m8391;
        android.media.MediaPlayer.OnInfoListener onInfoListener;
        int i = 2 % 2;
        int i2 = f3028 + 11;
        f3027 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8391 = m8391(android.media.MediaPlayer.class, m8401("䜤嬖篴\uf37a谊ⱬ턐\ue73f\u0017铌䴌邟䍊\udc3a賷\ufafd", 2 - android.widget.ExpandableListView.getPackedPositionGroup(0L)).intern());
                onInfoListener = (android.media.MediaPlayer.OnInfoListener) m8391.get(mediaPlayer);
                if (!(onInfoListener instanceof com.ironsource.adqualitysdk.sdk.i.hm)) {
                    m8391.set(mediaPlayer, new com.ironsource.adqualitysdk.sdk.i.hm(onInfoListener, eVar));
                }
                int i3 = f3027 + 81;
                f3028 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            m8391 = m8391(android.media.MediaPlayer.class, m8401("䜤嬖篴\uf37a谊ⱬ턐\ue73f\u0017铌䴌邟䍊\udc3a賷\ufafd", 15 - android.widget.ExpandableListView.getPackedPositionGroup(0L)).intern());
            onInfoListener = (android.media.MediaPlayer.OnInfoListener) m8391.get(mediaPlayer);
        } catch (java.lang.Exception e) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8401("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m8395(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, 1909068952, -1594885795, 1185079797, 1125987709, 1727475890, -245698141, 1731508964, -1812778425, -1396581402, -1465590378}, 34 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)).intern(), (java.lang.Throwable) e, false);
        }
        com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8401("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m8395(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, 1909068952, -1594885795, 1185079797, 1125987709, 1727475890, -245698141, 1731508964, -1812778425, -1396581402, -1465590378}, 34 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)).intern(), (java.lang.Throwable) e, false);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8392(android.media.MediaPlayer mediaPlayer, com.ironsource.adqualitysdk.sdk.i.hn.a aVar) {
        int i = 2 % 2;
        int i2 = f3027 + 101;
        f3028 = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.lang.reflect.Field m8391 = m8391(android.media.MediaPlayer.class, m8401("䜤嬖䱪敲媢\ud832暕ứ趥\uda4e쨂ऄ뒩툟\u0017铌䴌邟䍊\udc3a賷\ufafd", 21 - android.view.View.combineMeasuredStates(0, 0)).intern());
            android.media.MediaPlayer.OnCompletionListener onCompletionListener = (android.media.MediaPlayer.OnCompletionListener) m8391.get(mediaPlayer);
            if (!(onCompletionListener instanceof com.ironsource.adqualitysdk.sdk.i.hn)) {
                m8391.set(mediaPlayer, new com.ironsource.adqualitysdk.sdk.i.hn(onCompletionListener, aVar));
            }
            int i4 = f3027 + 87;
            f3028 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Exception e) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8401("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern(), m8395(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, 1909068952, -1594885795, 1798546964, 349251406, 1087173771, -982365766, -97215694, 1122355777, -1457440469, 948447810, 1129695400, -327164504, 650717817, -1398024481}, android.text.TextUtils.indexOf("", "", 0) + 41).intern(), (java.lang.Throwable) e, false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8393(android.media.MediaPlayer mediaPlayer, com.ironsource.adqualitysdk.sdk.i.ho.c cVar) {
        java.lang.reflect.Field m8391;
        android.media.MediaPlayer.OnPreparedListener onPreparedListener;
        int i = 2 % 2;
        int i2 = f3028 + 55;
        f3027 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8391 = m8391(android.media.MediaPlayer.class, m8401("䜤嬖鬚\uf3eb\ue094読\ue2e7䢿\ue094読ꘄ똉\u0017铌䴌邟䍊\udc3a賷\ufafd", 62 % (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                onPreparedListener = (android.media.MediaPlayer.OnPreparedListener) m8391.get(mediaPlayer);
                if (onPreparedListener instanceof com.ironsource.adqualitysdk.sdk.i.ho) {
                    return;
                }
            } else {
                m8391 = m8391(android.media.MediaPlayer.class, m8401("䜤嬖鬚\uf3eb\ue094読\ue2e7䢿\ue094読ꘄ똉\u0017铌䴌邟䍊\udc3a賷\ufafd", 20 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                onPreparedListener = (android.media.MediaPlayer.OnPreparedListener) m8391.get(mediaPlayer);
                if (onPreparedListener instanceof com.ironsource.adqualitysdk.sdk.i.ho) {
                    return;
                }
            }
            m8391.set(mediaPlayer, new com.ironsource.adqualitysdk.sdk.i.ho(onPreparedListener, cVar));
            int i3 = f3028 + 99;
            f3027 = i3 % 128;
            int i4 = i3 % 2;
        } catch (java.lang.Exception e) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8401("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m8395(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, 1909068952, -1594885795, -763171310, 77049864, -630464497, 1560284414, -492789928, -925220098, 1731508964, -1812778425, -1396581402, -1465590378}, android.graphics.Color.argb(0, 0, 0, 0) + 39).intern(), (java.lang.Throwable) e, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8398(android.media.MediaPlayer mediaPlayer, com.ironsource.adqualitysdk.sdk.i.hq.d dVar) {
        java.lang.reflect.Field m8391;
        android.media.MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
        int i = 2 % 2;
        int i2 = f3028 + 35;
        f3027 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8391 = m8391(android.media.MediaPlayer.class, m8395(new int[]{1825893091, 2022772609, 584643109, 441189094, 1087173771, -982365766, 1820630565, 1534501520, 1731508964, -1812778425, -1396581402, -1465590378}, 28 << android.text.TextUtils.indexOf("", "", 0)).intern());
                onSeekCompleteListener = (android.media.MediaPlayer.OnSeekCompleteListener) m8391.get(mediaPlayer);
                if (onSeekCompleteListener instanceof com.ironsource.adqualitysdk.sdk.i.hq) {
                    return;
                }
            } else {
                m8391 = m8391(android.media.MediaPlayer.class, m8395(new int[]{1825893091, 2022772609, 584643109, 441189094, 1087173771, -982365766, 1820630565, 1534501520, 1731508964, -1812778425, -1396581402, -1465590378}, 23 - android.text.TextUtils.indexOf("", "", 0)).intern());
                onSeekCompleteListener = (android.media.MediaPlayer.OnSeekCompleteListener) m8391.get(mediaPlayer);
                if (onSeekCompleteListener instanceof com.ironsource.adqualitysdk.sdk.i.hq) {
                    return;
                }
            }
            m8391.set(mediaPlayer, new com.ironsource.adqualitysdk.sdk.i.hq(onSeekCompleteListener, dVar));
            int i3 = f3028 + 123;
            f3027 = i3 % 128;
            int i4 = i3 % 2;
        } catch (java.lang.Exception e) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8401("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", android.text.TextUtils.indexOf("", "", 0, 0) + 12).intern(), m8395(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, -1791020118, 1696785005, 1167105306, 82217076, 1911452360, -2018121482, 1644123070, -861872277, -838826380, 216104538, -587967512, 1619786021}, 38 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern(), (java.lang.Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.util.List<android.view.View> m8403(java.lang.Class cls, java.lang.Object obj) throws java.lang.Exception {
        int i = 2 % 2;
        int i2 = f3028 + 121;
        f3027 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (f3035 == null) {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(m8401("핥끇▊\uf79f曐ﷵ", 6 - android.view.View.combineMeasuredStates(0, 0)).intern());
            f3035 = declaredField;
            declaredField.setAccessible(true);
        }
        java.lang.Object obj2 = f3035.get(obj);
        if (obj2 instanceof java.util.List) {
            java.util.List<android.view.View> list = (java.util.List) f3035.get(obj);
            int i3 = f3028 + 65;
            f3027 = i3 % 128;
            if (i3 % 2 != 0) {
                return list;
            }
            throw null;
        }
        if (!(obj2 instanceof android.view.View[])) {
            return new java.util.ArrayList();
        }
        int i4 = f3028 + 93;
        f3027 = i4 % 128;
        int i5 = i4 % 2;
        return java.util.Arrays.asList((android.view.View[]) f3035.get(obj));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.Object m8399(android.view.View view) {
        try {
            synchronized (com.ironsource.adqualitysdk.sdk.i.ke.class) {
                if (f3039 == null) {
                    f3039 = m8391(android.view.View.class, m8395(new int[]{-886547505, -2003627932, 1129695400, -327164504, 1275087097, 1883371378, 1822636583, -1224507547}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 13).intern());
                }
            }
            return f3039.get(view);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.reflect.Field m8391(java.lang.Class cls, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f3027 + 51;
        f3028 = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i4 = f3028 + 55;
            f3027 = i4 % 128;
            if (i4 % 2 != 0) {
                return declaredField;
            }
            throw null;
        } catch (java.lang.Exception e) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8401("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", android.text.TextUtils.indexOf("", "", 0, 0) + 12).intern(), m8395(new int[]{112299620, 1222218481, 1368270589, -1686330218, 483371233, 334762748, -645491791, 2088852701, 983619548, -1682816402, 765674498, -467291543, 1714441902, 969006227}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 25).intern(), (java.lang.Throwable) e, false);
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8397(android.view.View view, com.ironsource.adqualitysdk.sdk.i.ht.e eVar) {
        int i = 2 % 2;
        int i2 = f3028 + 1;
        f3027 = i2 % 128;
        if (i2 % 2 != 0) {
            android.view.View.OnTouchListener m8390 = m8390(view);
            if (!(m8390 instanceof com.ironsource.adqualitysdk.sdk.i.ht)) {
                view.setOnTouchListener(new com.ironsource.adqualitysdk.sdk.i.ht(m8390, eVar));
            }
            int i3 = f3027 + 39;
            f3028 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 98 / 0;
                return;
            }
            return;
        }
        boolean z = m8390(view) instanceof com.ironsource.adqualitysdk.sdk.i.ht;
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m8395(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f3032.clone();
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8401(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3030)) ^ ((c2 >>> 5) + f3029)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3034) ^ ((c3 + i2) ^ ((c3 << 4) + f3033))));
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
