package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class be extends com.ironsource.adqualitysdk.sdk.i.cw implements com.ironsource.adqualitysdk.sdk.i.ch {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f789 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f791 = 0;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f793 = -1834722567;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f795 = null;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f797 = 105;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f798 = 2054949276;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String f799;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.be.c> f800;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String f801;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String f802;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f796 = {-88, -29, 108, -36, 105, 117, 115, -49, 107, 121, -53, 106, -37, -109, -72, 115, -40, -86, 108, Byte.MAX_VALUE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, 115, 35, 114, 110, 108, 8, 116, -126, com.google.common.base.Ascii.DC4, 113, 36, 76, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 103, -98, com.google.common.base.Ascii.VT, 17, 0, 9, com.google.common.base.Ascii.ETB, 1, -83, -90, -26, 2, -14, -20, 17, -19, -38, com.google.common.base.Ascii.DLE, 66, -88, -26, 0, -2, -18, 84, -99, 0, -22, -1, com.google.common.base.Ascii.SUB, -104, -101, 108, 102, 82, -100, -1, -2, -6, -88, -99, 57, -106, -120, -31, -67, -95, com.google.common.base.Ascii.ESC, 34, -53, -46, -117, 117, -50, -54, -109, -96, 72, -103, -35, 68, -105, -111, -106, -63};

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f790 = true;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f792 = true;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f788 = 98;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f794 = {201, 199, 214, 165, 206, 195, 213, 130, 137, 144, 203, 208, 209, 198, kotlin.text.Typography.times, 196, 200, 197, 202, 212, 216};

    interface c {
        /* renamed from: ﻐ */
        java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar);
    }

    /* renamed from: ﻐ */
    abstract java.lang.Class mo6353(java.lang.String str);

    /* renamed from: ﻛ */
    abstract java.lang.String mo6354();

    /* renamed from: ﾇ */
    abstract java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.be.c> mo6355();

    /* renamed from: ᓮ, reason: contains not printable characters */
    static /* synthetic */ java.lang.Object m6368(java.util.List list, java.lang.Class cls) {
        int i = 2 % 2;
        int i2 = f791 + 31;
        f789 = i2 % 128;
        return m7362(list, i2 % 2 == 0 ? 1 : 0, cls);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ java.lang.Class m6372(com.ironsource.adqualitysdk.sdk.i.be beVar, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f791 + 73;
        f789 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Class m6369 = beVar.m6369(str, false);
        int i4 = f791 + 23;
        f789 = i4 % 128;
        int i5 = i4 % 2;
        return m6369;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ java.lang.String m6373(com.ironsource.adqualitysdk.sdk.i.be beVar) {
        int i = 2 % 2;
        int i2 = f791;
        int i3 = i2 + 59;
        f789 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = beVar.f802;
        int i5 = i2 + 79;
        f789 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public be(java.lang.String str) {
        this.f801 = str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6383() {
        int i = 2 % 2;
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.be.c> mo6355 = mo6355();
        this.f800 = mo6355;
        mo6355.put(m6371((short) (90 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.view.KeyEvent.normalizeMetaState(0) + 1834722682, (-106) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.View.MeasureSpec.getSize(0) - 2054949276, (byte) ((-61) - android.view.View.resolveSize(0, 0))).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                com.ironsource.adqualitysdk.sdk.i.be.this.m6382((java.lang.String) com.ironsource.adqualitysdk.sdk.i.be.m6368(list, java.lang.String.class));
                return com.ironsource.adqualitysdk.sdk.i.be.m6373(com.ironsource.adqualitysdk.sdk.i.be.this);
            }
        });
        this.f800.put(m6371((short) (57 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1834722672, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + androidx.media3.common.PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION, (-2054949259) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) ((-86) - (android.view.ViewConfiguration.getScrollBarSize() >> 8))).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return java.lang.Boolean.valueOf(com.ironsource.adqualitysdk.sdk.i.be.this.m6374());
            }
        });
        this.f800.put(m6370((java.lang.String) null, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, (int[]) null, "\u0087\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.be.m6372(com.ironsource.adqualitysdk.sdk.i.be.this, (java.lang.String) list.get(0));
            }
        });
        int i2 = f791 + 121;
        f789 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r11.f799.equals(m6371((short) (117 - android.view.View.MeasureSpec.getSize(0)), 1834722637 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 65478 - android.text.AndroidCharacter.getMirror('0'), android.view.Gravity.getAbsoluteGravity(0, 0) - 2054949240, (byte) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 128)).intern()) != false) goto L9;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized java.lang.String m6376() {
        int i = 2 % 2;
        int i2 = f789 + 93;
        f791 = i2 % 128;
        int i3 = i2 % 2;
        if (!android.text.TextUtils.isEmpty(this.f799)) {
            int i4 = f791 + 41;
            f789 = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f799 = mo6354();
        int i6 = 2 % 2;
        java.lang.String str = this.f799;
        int i7 = f789 + 51;
        f791 = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        int i8 = 87 / 0;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public java.lang.String mo6381() {
        int i = 2 % 2;
        int i2 = f791 + 71;
        int i3 = i2 % 128;
        f789 = i3;
        int i4 = i2 % 2;
        java.lang.String str = this.f802;
        if (str == null) {
            return m6376();
        }
        int i5 = i3 + 47;
        f791 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 19;
        f791 = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m6382(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f791;
        int i3 = i2 + 79;
        f789 = i3 % 128;
        int i4 = i3 % 2;
        this.f802 = str;
        if (i4 == 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 61;
        f789 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m6374() {
        int i = 2 % 2;
        int i2 = f789;
        int i3 = i2 + 101;
        int i4 = i3 % 128;
        f791 = i4;
        if (i3 % 2 != 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        if (this.f802 != null) {
            int i5 = i4 + 31;
            f789 = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = i2 + 33;
        f791 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.Object mo6378(com.ironsource.adqualitysdk.sdk.i.cl clVar, java.lang.String str, java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        int i = 2 % 2;
        int i2 = f791 + 103;
        f789 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.be.c cVar = this.f800.get(str);
        try {
        } catch (java.lang.Exception e) {
            java.lang.String str2 = this.f801;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m6371((short) (android.graphics.Color.red(0) - 118), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1834722635, (-106) - android.graphics.Color.alpha(0), (-2054949234) - android.text.TextUtils.lastIndexOf("", '0'), (byte) (android.text.AndroidCharacter.getMirror('0') - 167)).intern());
            sb.append(this.f801);
            sb.append(m6370((java.lang.String) null, 126 - android.os.Process.getGidForName(""), (int[]) null, "\u0089\u0088").intern());
            sb.append(str);
            sb.append(m6371((short) (android.text.TextUtils.indexOf("", "", 0, 0) + 124), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1834722606, android.graphics.Color.rgb(0, 0, 0) + 16777110, (-2054949211) - android.view.KeyEvent.normalizeMetaState(0), (byte) (47 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern());
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(str2, sb.toString(), e);
        }
        if (cVar == null) {
            new com.ironsource.adqualitysdk.sdk.i.ds(clVar, eeVar, this.f801, str).m7590(this.f801);
            return null;
        }
        int i4 = f789 + 57;
        f791 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
            return cVar.mo6356(list, ckVar);
        }
        return cVar.mo6356(list, ckVar);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.Class m6377(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f791 + 73;
        f789 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (!com.ironsource.adqualitysdk.sdk.i.Prode.m5769()) {
                java.lang.Class m6369 = m6369(str, false);
                int i4 = f789 + 35;
                f791 = i4 % 128;
                if (i4 % 2 == 0) {
                    return m6369;
                }
                throw null;
            }
            return mo6353(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.Class m6380(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f789 + 107;
        f791 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Class m6369 = m6369(str, true);
        int i4 = f791 + 87;
        f789 = i4 % 128;
        int i5 = i4 % 2;
        return m6369;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.Class m6369(java.lang.String str, boolean z) {
        int i = 2 % 2;
        int i2 = f789 + 27;
        f791 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object obj = null;
        try {
            if (!(!str.contains(m6370((java.lang.String) null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (int[]) null, "\u008a").intern()))) {
                return com.ironsource.adqualitysdk.sdk.i.kk.m8430(str, z);
            }
            char c2 = 5;
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals(m6370((java.lang.String) null, 126 - android.widget.ExpandableListView.getPackedPositionChild(0L), (int[]) null, "\u0082\u0085\u0090\u008f\u008d\u008e").intern())) {
                        int i4 = f791 + 5;
                        f789 = i4 % 128;
                        int i5 = i4 % 2;
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 104431:
                    if (str.equals(m6370((java.lang.String) null, android.view.View.getDefaultSize(0, 0) + 127, (int[]) null, "\u0083\u008c\u008b").intern())) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3029738:
                    if (!(!str.equals(m6370((java.lang.String) null, android.graphics.Color.rgb(0, 0, 0) + 16777343, (int[]) null, "\u0085\u008d\u008d\u0090").intern()))) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3039496:
                    if (str.equals(m6371((short) (android.view.View.MeasureSpec.getSize(0) - 84), android.view.View.combineMeasuredStates(0, 0) + 1834722665, (-106) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 2054949210, (byte) (android.text.TextUtils.indexOf("", "", 0) - 23)).intern())) {
                        int i6 = f791 + 65;
                        f789 = i6 % 128;
                        if (i6 % 2 != 0) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 'p';
                            break;
                        }
                    }
                    c2 = 65535;
                    break;
                case 3052374:
                    if (str.equals(m6370((java.lang.String) null, android.os.Process.getGidForName("") + 128, (int[]) null, "\u0094\u0086\u0093\u0092").intern())) {
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3327612:
                    if (str.equals(m6370((java.lang.String) null, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 128, (int[]) null, "\u0081\u008c\u008d\u0085").intern())) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3625364:
                    if (str.equals(m6370((java.lang.String) null, 127 - android.graphics.Color.argb(0, 0, 0, 0), (int[]) null, "\u008e\u008b\u008d\u0095").intern())) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 97526364:
                    if (str.equals(m6370((java.lang.String) null, 127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (int[]) null, "\u0083\u0086\u008d\u0085\u0091").intern())) {
                        int i7 = f791 + 29;
                        f789 = i7 % 128;
                        int i8 = i7 % 2;
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109413500:
                    if (str.equals(m6371((short) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40), 1834722681 - android.view.MotionEvent.axisFromString(""), (-106) - android.view.View.getDefaultSize(0, 0), (-2054949207) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (37 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).intern())) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return java.lang.Integer.TYPE;
                case 1:
                    return java.lang.Long.TYPE;
                case 2:
                    java.lang.Class cls = java.lang.Double.TYPE;
                    int i9 = f791 + 33;
                    f789 = i9 % 128;
                    int i10 = i9 % 2;
                    return cls;
                case 3:
                    return java.lang.Float.TYPE;
                case 4:
                    return java.lang.Boolean.TYPE;
                case 5:
                    return java.lang.Character.TYPE;
                case 6:
                    return java.lang.Byte.TYPE;
                case 7:
                    java.lang.Class cls2 = java.lang.Void.TYPE;
                    int i11 = f789 + 1;
                    f791 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return cls2;
                    }
                    super.hashCode();
                    throw null;
                case '\b':
                    return java.lang.Short.TYPE;
                default:
                    return mo6353(str);
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.String str2 = this.f801;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m6371((short) (63 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1834722634, (-106) - android.view.View.resolveSizeAndState(0, 0, 0), android.text.TextUtils.getOffsetAfter("", 0) - 2054949201, (byte) (android.os.Process.getGidForName("") - 42)).intern());
                sb.append(str);
                sb.append(m6371((short) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 119), 1834722599 - android.view.View.resolveSizeAndState(0, 0, 0), (-106) - android.graphics.Color.alpha(0), (-2054949194) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 82)).intern());
                com.ironsource.adqualitysdk.sdk.i.cn.m7265(str2, sb.toString(), th);
            }
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m6379(com.ironsource.adqualitysdk.sdk.i.hj hjVar, com.ironsource.adqualitysdk.sdk.i.ck ckVar, java.lang.String str, java.lang.Object... objArr) {
        int i = 2 % 2;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(objArr));
            arrayList.add(0, hjVar);
            ckVar.mo7152(str, arrayList);
            int i2 = f789 + 89;
            f791 = i2 % 128;
            int i3 = i2 % 2;
        } catch (java.lang.Throwable th) {
            java.lang.String str2 = this.f801;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m6371((short) (android.view.View.MeasureSpec.getMode(0) - 21), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1834722636, (-106) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 2054949185, (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 127)).intern());
            sb.append(this);
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(str2, sb.toString(), th);
        }
    }

    /* renamed from: ﻏ */
    public boolean mo6367() {
        int i = 2 % 2;
        int i2 = f791;
        int i3 = i2 + 35;
        f789 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        f789 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean mo6375() {
        int i = 2 % 2;
        int i2 = f789;
        int i3 = i2 + 21;
        f791 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        f791 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m6371(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f797;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f796;
                if (bArr != null) {
                    i5 = (byte) (bArr[f798 + i3] + i4);
                } else {
                    i5 = (short) (f795[f798 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f798 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f793);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f796;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f795;
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m6370(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
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
            char[] cArr3 = f794;
            int i2 = f788;
            if (f792) {
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
            if (f790) {
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
