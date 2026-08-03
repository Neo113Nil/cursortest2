package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class eg extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f1963 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1964 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1965 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f1966 = {-117, -117};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1967 = 118;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1968 = -104521376;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1969 = -544748679;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef[] f1970;

    public eg(java.util.List<com.ironsource.adqualitysdk.sdk.i.ef> list) {
        com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = new com.ironsource.adqualitysdk.sdk.i.ef[list.size()];
        this.f1970 = efVarArr;
        list.toArray(efVarArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = this.f1970;
        int length = efVarArr.length;
        int i2 = f1965 + 111;
        f1964 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f1964 + 95;
            f1965 = i5 % 128;
            if (i5 % 2 == 0) {
                arrayList.add(efVarArr[i4].m7718(eeVar, clVar).m7681());
                i4 += 66;
            } else {
                arrayList.add(efVarArr[i4].m7718(eeVar, clVar).m7681());
                i4++;
            }
        }
        return new com.ironsource.adqualitysdk.sdk.i.ea(arrayList);
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7720((short) android.text.TextUtils.getCapsMode("", 0, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 104521467, (-120) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.graphics.Color.alpha(0) + 544748679, (byte) ((-29) - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern());
        sb.append(m7717(this.f1970));
        sb.append(m7720((short) android.text.TextUtils.getTrimmedLength(""), 104521470 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.text.AndroidCharacter.getMirror('0') - 167, 544748680 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 64)).intern());
        java.lang.String obj = sb.toString();
        int i2 = f1964 + 13;
        f1965 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f1964;
        int i3 = i2 + 11;
        f1965 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i4 = i2 + 73;
        f1965 = i4 % 128;
        if (i4 % 2 == 0) {
            obj.getClass();
            throw null;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f1970, ((com.ironsource.adqualitysdk.sdk.i.eg) obj).f1970);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1964 + 1;
        f1965 = i2 % 128;
        int i3 = i2 % 2;
        int hashCode = java.util.Arrays.hashCode(this.f1970);
        int i4 = f1964 + 51;
        f1965 = i4 % 128;
        int i5 = i4 % 2;
        return hashCode;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7720(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f1967;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1966;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1969 + i3] + i4);
                } else {
                    i5 = (short) (f1963[f1969 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f1969 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f1968);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f1966;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f1963;
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
