package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaoa {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzaoa(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.internal.ads.zzaoa zza(java.lang.String str) {
        char c;
        com.google.android.gms.internal.ads.zzgtj.zza(str.startsWith("Format:"));
        java.lang.String[] split = android.text.TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new com.google.android.gms.internal.ads.zzaoa(i2, i3, i4, i5, i6, length);
            }
            java.lang.String zza = com.google.android.gms.internal.ads.zzgss.zza(split[i].trim());
            switch (zza.hashCode()) {
                case 100571:
                    if (zza.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (zza.equals("text")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 102749521:
                    if (zza.equals("layer")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (zza.equals("start")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (zza.equals("style")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i2 = i;
            } else if (c == 1) {
                i3 = i;
            } else if (c == 2) {
                i4 = i;
            } else if (c == 3) {
                i5 = i;
            } else if (c == 4) {
                i6 = i;
            }
            i++;
        }
    }
}
