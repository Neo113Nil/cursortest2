package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajy implements com.google.android.gms.internal.ads.zzao {
    public final java.lang.String zza;
    public final java.lang.String zzb;

    public zzajy(java.lang.String str, java.lang.String str2) {
        this.zza = com.google.android.gms.internal.ads.zzgss.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajy zzajyVar = (com.google.android.gms.internal.ads.zzajy) obj;
            if (this.zza.equals(zzajyVar.zza) && this.zzb.equals(zzajyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 5 + java.lang.String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append(com.ironsource.X3.j.b);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        char c;
        java.lang.String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                zzamVar.zza(this.zzb);
                break;
            case 1:
                zzamVar.zzb(this.zzb);
                break;
            case 2:
                zzamVar.zzc(this.zzb);
                break;
            case 3:
                zzamVar.zzd(this.zzb);
                break;
            case 4:
                java.lang.Integer zzh = com.google.android.gms.internal.ads.zzhah.zzh(this.zzb, 10);
                if (zzh != null) {
                    zzamVar.zzg(zzh);
                    break;
                }
                break;
            case 5:
                java.lang.Integer zzh2 = com.google.android.gms.internal.ads.zzhah.zzh(this.zzb, 10);
                if (zzh2 != null) {
                    zzamVar.zzh(zzh2);
                    break;
                }
                break;
            case 6:
                java.lang.Integer zzh3 = com.google.android.gms.internal.ads.zzhah.zzh(this.zzb, 10);
                if (zzh3 != null) {
                    zzamVar.zzr(zzh3);
                    break;
                }
                break;
            case 7:
                java.lang.Integer zzh4 = com.google.android.gms.internal.ads.zzhah.zzh(this.zzb, 10);
                if (zzh4 != null) {
                    zzamVar.zzs(zzh4);
                    break;
                }
                break;
            case '\b':
                zzamVar.zzt(this.zzb);
                break;
            case '\t':
                zzamVar.zze(this.zzb);
                break;
        }
    }
}
