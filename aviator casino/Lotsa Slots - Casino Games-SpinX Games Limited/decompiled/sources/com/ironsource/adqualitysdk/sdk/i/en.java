package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class en extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2001 = 186;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2002 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2003 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2004;

    public en(com.ironsource.adqualitysdk.sdk.i.ef efVar) {
        this.f2004 = efVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2003 + 115;
        f2002 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ea m7718 = this.f2004.m7718(eeVar, clVar);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return m7718;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7734(-android.text.TextUtils.lastIndexOf("", '0', 0), true, 225 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), "\u0000", -android.widget.ExpandableListView.getPackedPositionChild(0L)).intern());
        sb.append(this.f2004);
        sb.append(m7734((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, "\u0000", 1 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        java.lang.String obj = sb.toString();
        int i2 = f2003 + 59;
        f2002 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2002 + 1;
            f2003 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.ironsource.adqualitysdk.sdk.i.en enVar = (com.ironsource.adqualitysdk.sdk.i.en) obj;
            com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2004;
            if (efVar != null) {
                int i4 = f2003 + 111;
                f2002 = i4 % 128;
                int i5 = i4 % 2;
                return efVar.equals(enVar.f2004);
            }
            if (enVar.f2004 == null) {
                int i6 = f2002 + 43;
                f2003 = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f2003 + 117;
        int i3 = i2 % 128;
        f2002 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2004;
        if (efVar != null) {
            return efVar.hashCode();
        }
        int i4 = i3 + 47;
        f2003 = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7734(int i, boolean z, int i2, java.lang.String str, int i3) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                cArr3[i4] = (char) (cArr3[i4] - f2001);
                com.ironsource.adqualitysdk.sdk.i.d.f1651++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                cArr3 = cArr5;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
