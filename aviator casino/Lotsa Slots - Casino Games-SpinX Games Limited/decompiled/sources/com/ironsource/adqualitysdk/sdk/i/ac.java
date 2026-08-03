package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ac extends com.ironsource.adqualitysdk.sdk.i.x<android.view.View> implements android.view.View.OnLayoutChangeListener, com.ironsource.adqualitysdk.sdk.i.jv {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f97 = 333016517;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f98 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f99 = {com.google.common.base.Ascii.CR, -7, 8, -10, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.EM, -28, 35, -54, com.google.common.base.Ascii.DC2, -4, 19, -33, 8, com.google.common.base.Ascii.VT, -10, 5, com.google.common.base.Ascii.DC2, -77, -2, -3, com.google.common.base.Ascii.FF, 70, -83, -1, 6, 9, -17, 17, 69, -79, -5, 84, -71, -7, 5, -5, 9, -15, 1, 10, -3, 76, -82, 3, -3, 0, 45, -26, -2, -7, com.google.common.base.Ascii.CR, -7, 37, -49, -1, 6, -10, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, -34, -1, 79, -78, 5, 73, -82, 3, -3, 0, 45, 0, 0, 0, 0};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f100 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f101 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f102 = 237598775;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f103 = 110;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.Class f104;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ac.c f105;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.util.WeakHashMap<android.view.View, java.lang.Boolean> f106;

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﻐ, reason: contains not printable characters */
    final /* bridge */ /* synthetic */ android.view.View mo5780(android.view.View view) {
        int i = 2 % 2;
        int i2 = f101 + 97;
        f100 = i2 % 128;
        android.view.View view2 = view;
        if (i2 % 2 == 0) {
            return m5773(view2);
        }
        m5773(view2);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ, reason: contains not printable characters */
    final /* bridge */ /* synthetic */ void mo5786(android.view.View view, java.util.List list) {
        int i = 2 % 2;
        int i2 = f101 + 29;
        f100 = i2 % 128;
        int i3 = i2 % 2;
        m5778(view, (java.util.List<android.webkit.WebView>) list);
        int i4 = f100 + 71;
        f101 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    ac(org.json.JSONObject jSONObject) {
        super(null);
        this.f106 = new java.util.WeakHashMap<>();
        this.f105 = new com.ironsource.adqualitysdk.sdk.i.ac.c(this);
        m5782(jSONObject);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5782(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ac.c cVar = new com.ironsource.adqualitysdk.sdk.i.ac.c(this, jSONObject);
        m8648(cVar);
        this.f105 = cVar;
        try {
            this.f104 = java.lang.Class.forName(com.ironsource.adqualitysdk.sdk.i.ac.c.m5789(cVar));
            int i2 = f100;
            int i3 = i2 + 125;
            f101 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            f101 = i5 % 128;
            int i6 = i5 % 2;
            m5775();
        } catch (java.lang.ClassNotFoundException e) {
            java.lang.String intern = m5776((short) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.TextUtils.getOffsetBefore("", 0) - 333016430, android.view.View.MeasureSpec.getSize(0) - 91, (-237598775) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) android.view.KeyEvent.getDeadChar(0, 0)).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m5776((short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-333016448) - android.view.KeyEvent.getDeadChar(0, 0), android.graphics.Color.green(0) - 79, (-237598757) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
            sb.append(com.ironsource.adqualitysdk.sdk.i.ac.c.m5789(cVar));
            sb.append(m5776((short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-333016459) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + androidx.media3.common.PlaybackException.ERROR_CODE_SETUP_REQUIRED, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 237598728, (byte) ((-1) - android.text.TextUtils.lastIndexOf("", '0'))).intern());
            sb.append(e.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb.toString());
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m5775() {
        int i = 2 % 2;
        int i2 = f100 + 47;
        f101 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.jp.m8255().m8263(this);
        int i4 = f100 + 75;
        f101 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5783() {
        int i = 2 % 2;
        int i2 = f101 + 43;
        f100 = i2 % 128;
        if (i2 % 2 == 0) {
            m8628((com.ironsource.adqualitysdk.sdk.i.t) null);
            com.ironsource.adqualitysdk.sdk.i.jp.m8255().m8262(this);
        } else {
            m8628((com.ironsource.adqualitysdk.sdk.i.t) null);
            com.ironsource.adqualitysdk.sdk.i.jp.m8255().m8262(this);
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static android.view.View m5773(android.view.View view) {
        int i = 2 % 2;
        int i2 = f100 + 103;
        int i3 = i2 % 128;
        f101 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        f100 = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ, reason: contains not printable characters */
    final com.ironsource.adqualitysdk.sdk.i.t<android.webkit.WebView, android.view.View> mo5785() {
        int i = 2 % 2;
        int i2 = f100;
        int i3 = i2 + 115;
        f101 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 87;
        f101 = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾒ, reason: contains not printable characters */
    final com.ironsource.adqualitysdk.sdk.i.z mo5787() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.aa aaVar = new com.ironsource.adqualitysdk.sdk.i.aa();
        int i2 = f100 + 85;
        f101 = i2 % 128;
        if (i2 % 2 != 0) {
            return aaVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.ac.f100 + 3;
        com.ironsource.adqualitysdk.sdk.i.ac.f101 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        m5777(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(com.ironsource.adqualitysdk.sdk.i.ac.c.m5791(r3.f105)) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        r4 = m5779(r4, com.ironsource.adqualitysdk.sdk.i.ac.c.m5791(r3.f105));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ac.f101 + 41;
        com.ironsource.adqualitysdk.sdk.i.ac.f100 = r1 % 128;
        r1 = r1 % 2;
        r4.addOnLayoutChangeListener(r3);
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.jv
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5784(android.view.View view) {
        android.view.View m5774;
        int i = 2 % 2;
        int i2 = f101 + 19;
        f100 = i2 % 128;
        if (i2 % 2 != 0) {
            m5774 = m5774(view, this.f104);
            int i3 = 72 / 0;
        } else {
            m5774 = m5774(view, this.f104);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jv
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void mo5781(android.view.View view) {
        int i = 2 % 2;
        android.view.View m5774 = m5774(view, this.f104);
        if (m5774 != null) {
            int i2 = f101 + 55;
            f100 = i2 % 128;
            int i3 = i2 % 2;
            if (this.f106.remove(m5774) != null) {
                mo8649((com.ironsource.adqualitysdk.sdk.i.ac) view);
                int i4 = f101 + 67;
                f100 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        try {
            android.view.View m5774 = m5774(view, this.f104);
            if (m5774 != null) {
                int i10 = f101 + 25;
                f100 = i10 % 128;
                int i11 = i10 % 2;
                m5777(m5774);
                view.removeOnLayoutChangeListener(this);
            }
            int i12 = f100 + 119;
            f101 = i12 % 128;
            int i13 = i12 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m5776((short) (android.os.Process.myPid() >> 22), (-333016430) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-92) - android.os.Process.getGidForName(""), (-237598775) - android.text.TextUtils.getTrimmedLength(""), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0)).intern(), m5776((short) android.graphics.Color.red(0), android.view.KeyEvent.normalizeMetaState(0) - 333016448, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 87, android.text.AndroidCharacter.getMirror('0') - 30774, (byte) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0))).intern(), th, false);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m5777(android.view.View view) {
        int i = 2 % 2;
        int i2 = f100 + 37;
        f101 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f106.containsKey(view);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!this.f106.containsKey(view)) {
            this.f106.put(view, java.lang.Boolean.TRUE);
            mo8650((com.ironsource.adqualitysdk.sdk.i.ac) view, java.lang.Integer.toHexString(view.hashCode()));
            int i3 = f100 + 33;
            f101 = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = f100 + 1;
        f101 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private android.view.View m5774(android.view.View view, java.lang.Class cls) {
        int i = 2 % 2;
        int i2 = f101 + 95;
        f100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
            if (!(view instanceof android.view.ViewGroup)) {
                return null;
            }
        } else if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            android.view.View childAt = viewGroup.getChildAt(i4);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            android.view.View m5774 = m5774(childAt, cls);
            if (m5774 != null) {
                int i5 = f101 + 31;
                f100 = i5 % 128;
                int i6 = i5 % 2;
                return m5774;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private android.view.View m5779(android.view.View view, java.lang.String str) {
        int i = 2 % 2;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int i2 = 0;
            while (i2 < viewGroup.getChildCount()) {
                int i3 = f100 + 55;
                f101 = i3 % 128;
                int i4 = i3 % 2;
                android.view.View childAt = viewGroup.getChildAt(i2);
                if (childAt.getClass().getName().startsWith(str)) {
                    return childAt;
                }
                android.view.View m5779 = m5779(childAt, str);
                if (m5779 != null) {
                    int i5 = f101 + 23;
                    f100 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return m5779;
                    }
                    throw null;
                }
                i2++;
                int i6 = f100 + 7;
                f101 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return null;
    }

    /* renamed from: ﾇ, reason: avoid collision after fix types in other method and contains not printable characters */
    private void m5778(android.view.View view, java.util.List<android.webkit.WebView> list) {
        int i = 2 % 2;
        int i2 = f100 + 51;
        f101 = i2 % 128;
        if (i2 % 2 == 0) {
            com.ironsource.adqualitysdk.sdk.i.kq.m8505(view, android.webkit.WebView.class, com.ironsource.adqualitysdk.sdk.i.ac.c.m5794(this.f105), false, false, null, this.f105.f3254, list);
        } else {
            com.ironsource.adqualitysdk.sdk.i.kq.m8505(view, android.webkit.WebView.class, com.ironsource.adqualitysdk.sdk.i.ac.c.m5794(this.f105), true, false, null, this.f105.f3254, list);
        }
        int i3 = f101 + 25;
        f100 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public class c extends com.ironsource.adqualitysdk.sdk.i.x.a {

        /* renamed from: ﭴ, reason: contains not printable characters */
        private static int f107 = 0;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private static int f108 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static char f109 = 51382;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char f110 = 46248;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f111 = 8194;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char[] f112 = {18218, 62835, 9141, 20985, 36359, 15470, 27289, 39109, 54559, 868, 45441, 60979, 7281, 47276, 2811, 56354, 44651, 29098, 50166, 38190, 26463, 10889, 64733, 20016, 4524, 58353, 46388, 1889, 51902, 'j', 45621, 25816, 5821, 51537, 31536, 11726, 57231, 37459, 17410, kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 45621, 25833, 5783, 51552, 31530, 11734, 57227, 37498, 17413, kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 45621, 25833, 5784, 51577, 31528, 11717, 57241, 37459, 17412, 63189, 43378, 23356, 'i', 45611, 25852, 5789, 51574, 31502, 11723, 57241, 37444, 'v', 45615, 25833, 5797, 51563, 31498, 11723, 57251, 37463, 17432, 63187, 43376, 23341};

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static long f113 = 60374997389980230L;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f114 = 26653;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private java.lang.String f115;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private java.lang.String f116;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private java.lang.String f117;

        /* renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ java.lang.String m5789(com.ironsource.adqualitysdk.sdk.i.ac.c cVar) {
            int i = 2 % 2;
            int i2 = f107 + 1;
            int i3 = i2 % 128;
            f108 = i3;
            int i4 = i2 % 2;
            java.lang.String str = cVar.f115;
            int i5 = i3 + 63;
            f107 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ java.lang.String m5791(com.ironsource.adqualitysdk.sdk.i.ac.c cVar) {
            int i = 2 % 2;
            int i2 = f107 + 11;
            f108 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String str = cVar.f116;
            if (i3 != 0) {
                return str;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ java.lang.String m5794(com.ironsource.adqualitysdk.sdk.i.ac.c cVar) {
            int i = 2 % 2;
            int i2 = f108;
            int i3 = i2 + 61;
            f107 = i3 % 128;
            int i4 = i3 % 2;
            java.lang.String str = cVar.f117;
            if (i4 != 0) {
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            int i5 = i2 + 77;
            f107 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 16 / 0;
            }
            return str;
        }

        public c(com.ironsource.adqualitysdk.sdk.i.ac acVar) {
        }

        public c(com.ironsource.adqualitysdk.sdk.i.ac acVar, org.json.JSONObject jSONObject) {
            m5788(jSONObject.optString(m5792("\u2fe8ᔀ䦫狉\u0b00꫱ﺭ現묗츆艂\udba7\uda09\uaa38獊\ua633\ue838䘨걮딱高竦", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21).intern()));
            m5795(jSONObject.optString(m5790((char) (18269 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.getCapsMode("", 0, 0), android.view.View.resolveSize(0, 0) + 13).intern()));
            m5793(jSONObject.optString(m5790((char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 47324), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SO, 15 - android.widget.ExpandableListView.getPackedPositionChild(0L)).intern()));
            m8666(jSONObject.optString(m5790((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 1), 29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 10).intern()));
            m8669(false);
            m8665(!android.text.TextUtils.isEmpty(jSONObject.optString(m5790((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + (-1)), 30 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 10 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern())) || jSONObject.optBoolean(m5792("쿱ᇍ堓\ue698\uedceᆞ퓒騔ᛠ\ue20c䯱뇣\u0b00꫱⨙컵", android.text.TextUtils.lastIndexOf("", '0', 0) + 17).intern()) || jSONObject.optBoolean(m5792("쿱ᇍ堓\ue698\uedceᆞ\uf486\ud984䛠ྌ獊\ua633䯱뇣\u0b00꫱⨙컵", 18 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()));
            m8671(jSONObject.optBoolean(m5792("쿱ᇍ堓\ue698\uedceᆞ퓒騔ᛠ\ue20c䯱뇣\u0b00꫱⨙컵", 16 - android.view.KeyEvent.keyCodeFromString("")).intern()));
            m8662(jSONObject.optBoolean(m5790((char) android.text.TextUtils.getTrimmedLength(""), 39 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (-16777206) - android.graphics.Color.rgb(0, 0, 0)).intern()));
            m8670(android.text.TextUtils.isEmpty(jSONObject.optString(m5792("\ue87e\uea25焧ဋミ圈ԉ掗❳㐆", 9 - android.graphics.Color.blue(0)).intern())) ? null : java.util.Arrays.asList(jSONObject.optString(m5792("\ue87e\uea25焧ဋミ圈ԉ掗❳㐆", 9 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)).intern()).split(m5792("\udf0a딏", (android.os.Process.myTid() >> 22) + 1).intern())));
            m8668(jSONObject.optBoolean(m5790((char) android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 49, 13 - android.view.View.resolveSize(0, 0)).intern(), true));
            m8672(false);
            m8664(jSONObject.optBoolean(m5792("﨎⮵撬\udffa蟝㞴á\ue768\udf44쬎\udc2e㯒簷指ﻊ枿녞豙", 16 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)).intern()));
            m8663(jSONObject.optBoolean(m5790((char) android.view.View.combineMeasuredStates(0, 0), (android.os.Process.myTid() >> 22) + 62, android.widget.ExpandableListView.getPackedPositionChild(0L) + 10).intern()));
            m8667(com.ironsource.adqualitysdk.sdk.i.kj.m8408(jSONObject.optJSONArray(m5790((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 70 - android.text.TextUtils.lastIndexOf("", '0', 0), 12 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)).intern())));
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.i.ac.c m5788(java.lang.String str) {
            int i = 2 % 2;
            int i2 = f108;
            int i3 = i2 + 17;
            f107 = i3 % 128;
            int i4 = i3 % 2;
            this.f117 = str;
            int i5 = i2 + 13;
            f107 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.i.ac.c m5795(java.lang.String str) {
            int i = 2 % 2;
            int i2 = f108;
            int i3 = i2 + 3;
            f107 = i3 % 128;
            java.lang.Object obj = null;
            if (i3 % 2 == 0) {
                this.f115 = str;
                int i4 = i2 + 1;
                f107 = i4 % 128;
                if (i4 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.f115 = str;
            super.hashCode();
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.i.ac.c m5793(java.lang.String str) {
            int i = 2 % 2;
            int i2 = f107;
            int i3 = i2 + 35;
            f108 = i3 % 128;
            int i4 = i3 % 2;
            this.f116 = str;
            int i5 = i2 + 93;
            f108 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static java.lang.String m5792(java.lang.String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f111)) ^ ((c2 >>> 5) + f109)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f110) ^ ((c3 + i2) ^ ((c3 << 4) + f114))));
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

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static java.lang.String m5790(char c, int i, int i2) {
            java.lang.String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
                char[] cArr = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                    cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f112[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f113)) ^ c);
                    com.ironsource.adqualitysdk.sdk.i.c.f1208++;
                }
                str = new java.lang.String(cArr);
            }
            return str;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m5776(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f103;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f99;
                if (bArr != null) {
                    i5 = (byte) (bArr[f102 + i3] + i4);
                } else {
                    i5 = (short) (f98[f102 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f102 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f97);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f99;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f98;
                        int i8 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i8 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((short) (sArr[i8] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    }
                    sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                    com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                    com.ironsource.adqualitysdk.sdk.i.n.f3099++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
