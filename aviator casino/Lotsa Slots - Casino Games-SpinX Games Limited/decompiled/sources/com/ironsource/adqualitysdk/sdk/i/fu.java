package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fu extends com.ironsource.adqualitysdk.sdk.i.gc {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2131 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f2132 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2133 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2134 = -548604956;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] f2135 = {-111, -108, -20, -98, -31, -110, -49, -111, -107, 118, -83, -62, -62};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2136 = -559498971;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2137 = 112;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.gb f2138;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2139;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.gb f2140;

    public fu(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.gb gbVar, com.ironsource.adqualitysdk.sdk.i.gb gbVar2, byte b) {
        super(b);
        this.f2139 = efVar;
        this.f2140 = gbVar;
        this.f2138 = gbVar2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2131 + 75;
        f2133 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.f2139.m7718(eeVar, clVar).m7679()) {
            if (this.f2138 != null) {
                eeVar.m7709(this);
                return this.f2138.m7785(eeVar, clVar);
            }
            return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Boolean.FALSE);
        }
        int i4 = f2133 + 101;
        f2131 = i4 % 128;
        int i5 = i4 % 2;
        return this.f2140.m7785(eeVar, clVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﻛ */
    public final int mo7772(com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        int i = 2 % 2;
        int i2 = f2131 + 13;
        f2133 = i2 % 128;
        int i3 = i2 % 2;
        if (!eeVar.m7715(this)) {
            int length = this.f2140.toString().split(m7774((short) (android.graphics.Color.argb(0, 0, 0, 0) - 128), 548604966 - android.view.View.getDefaultSize(0, 0), (-113) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.graphics.Color.red(0) + 559498971, (byte) (android.text.TextUtils.lastIndexOf("", '0', 0) + 1)).intern()).length;
            if (!(this.f2138 instanceof com.ironsource.adqualitysdk.sdk.i.ft)) {
                return length - 1;
            }
            int i4 = f2131 + 69;
            f2133 = i4 % 128;
            int i5 = i4 % 2;
            return length;
        }
        int i6 = f2133 + 11;
        int i7 = i6 % 128;
        f2131 = i7;
        if (i6 % 2 != 0) {
            if (!(this.f2140 instanceof com.ironsource.adqualitysdk.sdk.i.ft)) {
                return 0;
            }
            int i8 = i7 + 97;
            f2133 = i8 % 128;
            int i9 = i8 % 2;
            return 1;
        }
        boolean z = this.f2140 instanceof com.ironsource.adqualitysdk.sdk.i.ft;
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7774((short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 28), 548605061 - (android.os.Process.myPid() >> 22), (-113) - android.text.TextUtils.getOffsetAfter("", 0), 559498973 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", '0'))).intern());
        sb.append(this.f2139);
        sb.append(m7774((short) (39 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)), 548604997 - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.indexOf("", "", 0, 0) - 113, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 559498976, (byte) android.widget.ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb.append(this.f2140);
        if (this.f2138 != null) {
            if (this.f2140 instanceof com.ironsource.adqualitysdk.sdk.i.ft) {
                int i2 = f2131 + 7;
                f2133 = i2 % 128;
                int i3 = i2 % 2;
                sb.append(m7774((short) (android.view.KeyEvent.keyCodeFromString("") + 77), 548604988 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (-113) - android.graphics.Color.blue(0), 559498978 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern());
            } else {
                sb.append(m7774((short) (android.view.Gravity.getAbsoluteGravity(0, 0) - 128), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 548604966, (-113) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 559498971, (byte) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()))).intern());
                m7788(sb);
                int i4 = f2131 + 39;
                f2133 = i4 % 128;
                int i5 = i4 % 2;
            }
            sb.append(m7774((short) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 68), android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 548605058, (-113) - android.text.TextUtils.getTrimmedLength(""), android.view.KeyEvent.normalizeMetaState(0) + 559498979, (byte) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0))).intern());
            sb.append(this.f2138);
        }
        java.lang.String obj = sb.toString();
        int i6 = f2131 + 73;
        f2133 = i6 % 128;
        int i7 = i6 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r3.equals(r7.f2139) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r3 = r6.f2140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r3.equals(r7.f2140) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.fu.f2131 + 1;
        com.ironsource.adqualitysdk.sdk.i.fu.f2133 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r3 = r6.f2138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.fu.f2133 + 13;
        com.ironsource.adqualitysdk.sdk.i.fu.f2131 = r1 % 128;
        r1 = r1 % 2;
        r7 = r7.f2138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r1 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        return r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r7.f2138 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.fu.f2133 + 3;
        com.ironsource.adqualitysdk.sdk.i.fu.f2131 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.fu.f2133 + 23;
        com.ironsource.adqualitysdk.sdk.i.fu.f2131 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if ((r7 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        if (r7.f2140 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0042, code lost:
    
        if (r3.equals(r7.f2139) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0047, code lost:
    
        if (r7.f2139 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2131 + 33;
            f2133 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.ironsource.adqualitysdk.sdk.i.fu fuVar = (com.ironsource.adqualitysdk.sdk.i.fu) obj;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2139;
        if (efVar != null) {
            int i4 = f2131 + 5;
            f2133 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
            }
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = f2133;
        int i5 = i4 + 23;
        int i6 = i5 % 128;
        f2131 = i6;
        int i7 = i5 % 2;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2139;
        if (efVar != null) {
            int i8 = i6 + 125;
            f2133 = i8 % 128;
            if (i8 % 2 != 0) {
                efVar.hashCode();
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            i = efVar.hashCode();
        } else {
            int i9 = i4 + 33;
            f2131 = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        }
        int i11 = i * 31;
        com.ironsource.adqualitysdk.sdk.i.gb gbVar = this.f2140;
        if (gbVar != null) {
            i2 = gbVar.hashCode();
            int i12 = f2131 + 55;
            f2133 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            i2 = 0;
        }
        int i14 = (i11 + i2) * 31;
        com.ironsource.adqualitysdk.sdk.i.gb gbVar2 = this.f2138;
        return i14 + (gbVar2 != null ? gbVar2.hashCode() : 0);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7774(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2137;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2135;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2136 + i3] + i4);
                } else {
                    i5 = (short) (f2132[f2136 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2136 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2134);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2135;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2132;
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
