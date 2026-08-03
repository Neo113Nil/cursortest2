package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfu {
    public final java.lang.String zza;

    private zzfu(int i, int i2, java.lang.String str) {
        this.zza = str;
    }

    public static com.google.android.gms.internal.ads.zzfu zza(com.google.android.gms.internal.ads.zzet zzetVar) {
        java.lang.String str;
        zzetVar.zzk(2);
        int zzs = zzetVar.zzs();
        int i = zzs >> 1;
        int i2 = zzs & 1;
        int zzs2 = zzetVar.zzs() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i3 = zzs2 | (i2 << 5);
        java.lang.String str2 = i < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = java.lang.String.valueOf(i).length();
        int length3 = java.lang.String.valueOf(i3).length();
        java.lang.String str3 = i3 >= 10 ? "." : ".0";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length2 + str3.length() + length3);
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
        sb.append(i3);
        return new com.google.android.gms.internal.ads.zzfu(i, i3, sb.toString());
    }
}
