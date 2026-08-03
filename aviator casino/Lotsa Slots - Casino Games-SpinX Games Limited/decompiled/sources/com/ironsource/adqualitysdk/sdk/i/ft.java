package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ft extends com.ironsource.adqualitysdk.sdk.i.gc {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2127 = -5534098131843656923L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2128 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2129 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.gb[] f2130;

    public ft(java.util.List<com.ironsource.adqualitysdk.sdk.i.gb> list, byte b) {
        super(b);
        com.ironsource.adqualitysdk.sdk.i.gb[] gbVarArr = new com.ironsource.adqualitysdk.sdk.i.gb[list.size()];
        this.f2130 = gbVarArr;
        list.toArray(gbVarArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(null);
        com.ironsource.adqualitysdk.sdk.i.ee eeVar2 = new com.ironsource.adqualitysdk.sdk.i.ee(eeVar);
        com.ironsource.adqualitysdk.sdk.i.gb[] gbVarArr = this.f2130;
        int length = gbVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f2129 + 103;
            f2128 = i3 % 128;
            int i4 = i3 % 2;
            eaVar = gbVarArr[i2].m7785(eeVar2, clVar);
            if (eaVar.m7680() || eaVar.m7676() || !(!eaVar.m7675())) {
                break;
            }
            eeVar.m7703();
            i2++;
            int i5 = f2128 + 69;
            f2129 = i5 % 128;
            int i6 = i5 % 2;
        }
        return eaVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int mo7772(com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        int i = 2 % 2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < eeVar.m7702()) {
            int i4 = f2128 + 15;
            f2129 = i4 % 128;
            int i5 = i4 % 2;
            i3 += this.f2130[i2].toString().split(m7771("匯", 46133 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()).length;
            i2++;
            int i6 = f2129 + 115;
            f2128 = i6 % 128;
            int i7 = i6 % 2;
        }
        return i3;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7771("卞䝪", 5189 - android.text.TextUtils.getOffsetBefore("", 0)).intern());
        com.ironsource.adqualitysdk.sdk.i.gb[] gbVarArr = this.f2130;
        int length = gbVarArr.length;
        int i2 = f2128 + 15;
        f2129 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f2128 + 29;
            f2129 = i5 % 128;
            if (i5 % 2 != 0) {
                com.ironsource.adqualitysdk.sdk.i.gb gbVar = gbVarArr[i4];
                m7788(sb);
                sb.append(gbVar.toString());
                sb.append(m7771("匯", android.text.TextUtils.lastIndexOf("", '0', 0) + 46134).intern());
                i4++;
            } else {
                com.ironsource.adqualitysdk.sdk.i.gb gbVar2 = gbVarArr[i4];
                m7788(sb);
                sb.append(gbVar2.toString());
                sb.append(m7771("匯", 46134 % android.text.TextUtils.lastIndexOf("", 'K', 0)).intern());
                i4 += 8;
            }
        }
        m7789(sb);
        sb.append(m7771("単", 51577 - android.graphics.Color.argb(0, 0, 0, 0)).intern());
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f2129 + 3;
        f2128 = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.ironsource.adqualitysdk.sdk.i.gb[] gbVarArr = this.f2130;
            com.ironsource.adqualitysdk.sdk.i.gb[] gbVarArr2 = ((com.ironsource.adqualitysdk.sdk.i.ft) obj).f2130;
            if (gbVarArr != null) {
                return gbVarArr.equals(gbVarArr2);
            }
            if (gbVarArr2 == null) {
                int i4 = f2129 + 73;
                f2128 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f2129 + 93;
        f2128 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.gb[] gbVarArr = this.f2130;
        if (gbVarArr == null) {
            return 0;
        }
        int hashCode = gbVarArr.hashCode();
        int i4 = f2129 + 91;
        f2128 = i4 % 128;
        int i5 = i4 % 2;
        return hashCode;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7771(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
            com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f2127);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
