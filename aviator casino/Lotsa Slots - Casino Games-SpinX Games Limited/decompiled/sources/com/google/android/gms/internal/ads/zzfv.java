package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfv implements com.google.android.gms.internal.ads.zzao {
    public final java.lang.String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzfv(java.lang.String str, byte[] bArr, int i, int i2) {
        char c;
        byte b;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
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
            if (i2 == 23) {
                if (bArr.length == 4) {
                    i2 = 23;
                    com.google.android.gms.internal.ads.zzgtj.zza(r4);
                } else {
                    i2 = 23;
                }
            }
            r4 = false;
            com.google.android.gms.internal.ads.zzgtj.zza(r4);
        } else if (c == 1 || c == 2) {
            if (i2 == 78) {
                if (bArr.length == 8) {
                    i2 = 78;
                    com.google.android.gms.internal.ads.zzgtj.zza(r4);
                } else {
                    i2 = 78;
                }
            }
            r4 = false;
            com.google.android.gms.internal.ads.zzgtj.zza(r4);
        } else if (c == 3) {
            com.google.android.gms.internal.ads.zzgtj.zza(i2 == 0);
        } else if (c == 4) {
            if (i2 == 75) {
                if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    i2 = 75;
                    com.google.android.gms.internal.ads.zzgtj.zza(r4);
                } else {
                    i2 = 75;
                }
            }
            r4 = false;
            com.google.android.gms.internal.ads.zzgtj.zza(r4);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzfv zzfvVar = (com.google.android.gms.internal.ads.zzfv) obj;
            if (this.zza.equals(zzfvVar.zza) && java.util.Arrays.equals(this.zzb, zzfvVar.zzb) && this.zzc == zzfvVar.zzc && this.zzd == zzfvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }

    public final java.util.List zzb() {
        com.google.android.gms.internal.ads.zzgtj.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(java.lang.Integer.valueOf(bArr[i + 2] & 255));
        }
        return arrayList;
    }

    public final java.lang.String toString() {
        java.lang.String sb;
        int i = this.zzd;
        if (i == 0) {
            if (this.zza.equals("auxiliary.tracks.map")) {
                java.util.List zzb = zzb();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("track types = ");
                com.google.android.gms.internal.ads.zzgtd.zzb(sb2, zzb, ",");
                sb = sb2.toString();
            }
            byte[] bArr = this.zzb;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            sb = com.google.android.gms.internal.ads.zzgzh.zzn().zzi().zzj(bArr, 0, bArr.length);
        } else if (i == 1) {
            sb = com.google.android.gms.internal.ads.zzfl.zzj(this.zzb);
        } else if (i == 23) {
            sb = java.lang.String.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzhah.zzd(this.zzb)));
        } else if (i == 67) {
            sb = java.lang.String.valueOf(com.google.android.gms.internal.ads.zzhah.zzd(this.zzb));
        } else if (i != 75) {
            if (i == 78) {
                sb = java.lang.String.valueOf(new com.google.android.gms.internal.ads.zzet(this.zzb).zzJ());
            }
            byte[] bArr2 = this.zzb;
            java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
            sb = com.google.android.gms.internal.ads.zzgzh.zzn().zzi().zzj(bArr2, 0, bArr2.length);
        } else {
            sb = java.lang.String.valueOf(com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(this.zzb[0]));
        }
        java.lang.String str3 = this.zza;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 18 + java.lang.String.valueOf(sb).length());
        sb3.append("mdta: key=");
        sb3.append(str3);
        sb3.append(", value=");
        sb3.append(sb);
        return sb3.toString();
    }
}
