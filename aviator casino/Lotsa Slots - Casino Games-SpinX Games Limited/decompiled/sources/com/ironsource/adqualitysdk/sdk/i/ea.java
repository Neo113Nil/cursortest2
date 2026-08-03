package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ea {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1916 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1917 = -1091683929;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f1918 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f1919 = {0};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1920 = 78;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1921 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1922 = 1629295465;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1923;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1924;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1925;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.Object f1926;

    public ea(java.lang.Object obj) {
        this.f1926 = obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.lang.Object m7681() {
        int i = 2 % 2;
        int i2 = f1916;
        int i3 = i2 + 1;
        f1921 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.Object obj = this.f1926;
        int i5 = i2 + 99;
        f1921 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m7679() {
        int i = 2 % 2;
        java.lang.Object obj = this.f1926;
        if (obj == null) {
            return false;
        }
        if (obj instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) obj).booleanValue();
        }
        if (obj instanceof java.lang.Integer) {
            int i2 = f1916 + 85;
            f1921 = i2 % 128;
            int i3 = i2 % 2;
            return ((java.lang.Integer) obj).intValue() != 0;
        }
        if (obj instanceof java.lang.Long) {
            if (((java.lang.Long) obj).longValue() == 0) {
                return false;
            }
            int i4 = f1921 + 73;
            f1916 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof java.lang.Double) {
            if (((java.lang.Double) obj).doubleValue() == 0.0d) {
                return false;
            }
            int i6 = f1921 + 1;
            f1916 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof java.lang.String)) {
            return true;
        }
        if (!(!android.text.TextUtils.isEmpty((java.lang.String) obj))) {
            return false;
        }
        int i8 = f1916 + 105;
        f1921 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.Number m7677() {
        int i = 2 % 2;
        int i2 = f1916;
        int i3 = i2 + 79;
        int i4 = i3 % 128;
        f1921 = i4;
        java.lang.Object obj = null;
        if (i3 % 2 == 0) {
            java.lang.Object obj2 = this.f1926;
            if (obj2 instanceof java.lang.Integer) {
                return (java.lang.Integer) obj2;
            }
            if (!(obj2 instanceof java.lang.Long)) {
                if (!(obj2 instanceof java.lang.Double)) {
                    return null;
                }
                int i5 = i2 + 17;
                f1921 = i5 % 128;
                int i6 = i5 % 2;
                return (java.lang.Double) obj2;
            }
            int i7 = i4 + 7;
            f1916 = i7 % 128;
            if (i7 % 2 != 0) {
                return (java.lang.Long) obj2;
            }
            int i8 = 96 / 0;
            return (java.lang.Long) obj2;
        }
        boolean z = this.f1926 instanceof java.lang.Integer;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7680() {
        int i = 2 % 2;
        int i2 = f1916 + 61;
        int i3 = i2 % 128;
        f1921 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.f1923;
        int i4 = i3 + 55;
        f1916 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ea m7678(boolean z) {
        int i = 2 % 2;
        int i2 = f1916 + 105;
        f1921 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1923 = z;
            return this;
        }
        this.f1923 = z;
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m7676() {
        int i = 2 % 2;
        int i2 = f1916;
        int i3 = i2 + 53;
        f1921 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1924;
        int i5 = i2 + 107;
        f1921 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ea m7673() {
        int i = 2 % 2;
        int i2 = f1921;
        int i3 = i2 + 109;
        f1916 = i3 % 128;
        int i4 = i3 % 2;
        this.f1924 = true;
        int i5 = i2 + 43;
        f1916 = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m7675() {
        int i = 2 % 2;
        int i2 = f1916 + 77;
        int i3 = i2 % 128;
        f1921 = i3;
        int i4 = i2 % 2;
        boolean z = this.f1925;
        int i5 = i3 + 79;
        f1916 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return z;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ea m7674() {
        int i = 2 % 2;
        int i2 = f1916 + 9;
        int i3 = i2 % 128;
        f1921 = i3;
        int i4 = i2 % 2;
        this.f1925 = true;
        int i5 = i3 + 3;
        f1916 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f1921 + 45;
        f1916 = i2 % 128;
        int i3 = i2 % 2;
        if (!(this.f1926 instanceof java.lang.String)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.f1926);
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(m7672((short) android.text.TextUtils.indexOf("", "", 0), 1091683963 - android.view.View.resolveSizeAndState(0, 0, 0), (-78) - android.view.MotionEvent.axisFromString(""), (-1629295465) - android.widget.ExpandableListView.getPackedPositionGroup(0L), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) - 80)).intern());
        sb2.append(this.f1926);
        sb2.append(m7672((short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 1091683963 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 78, android.view.View.MeasureSpec.getSize(0) - 1629295465, (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 80)).intern());
        java.lang.String obj = sb2.toString();
        int i4 = f1916 + 63;
        f1921 = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7672(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f1920;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1919;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1922 + i3] + i4);
                } else {
                    i5 = (short) (f1918[f1922 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f1922 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f1917);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f1919;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f1918;
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
