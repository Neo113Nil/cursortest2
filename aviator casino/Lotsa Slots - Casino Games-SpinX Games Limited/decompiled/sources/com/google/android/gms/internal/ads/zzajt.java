package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajt extends com.google.android.gms.internal.ads.zzajo {
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzgwm zzb;

    public zzajt(java.lang.String str, java.lang.String str2, java.util.List list) {
        super(str);
        com.google.android.gms.internal.ads.zzgtj.zza(!list.isEmpty());
        this.zza = str2;
        com.google.android.gms.internal.ads.zzgwm zzq = com.google.android.gms.internal.ads.zzgwm.zzq(list);
        this.zzb = zzq;
    }

    private static java.util.List zzb(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajt zzajtVar = (com.google.android.gms.internal.ads.zzajt) obj;
            if (java.util.Objects.equals(this.zzf, zzajtVar.zzf) && java.util.Objects.equals(this.zza, zzajtVar.zza) && this.zzb.equals(zzajtVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        java.lang.String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String str = this.zzf;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 14 + java.lang.String.valueOf(str2).length() + 9 + java.lang.String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": values=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzajo, com.google.android.gms.internal.ads.zzao
    public final void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        char c;
        java.lang.String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
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
            case 1:
                zzamVar.zza((java.lang.CharSequence) this.zzb.get(0));
                break;
            case 2:
            case 3:
                zzamVar.zzb((java.lang.CharSequence) this.zzb.get(0));
                break;
            case 4:
            case 5:
                zzamVar.zzd((java.lang.CharSequence) this.zzb.get(0));
                break;
            case 6:
            case 7:
                zzamVar.zzc((java.lang.CharSequence) this.zzb.get(0));
                break;
            case '\b':
            case '\t':
                java.lang.String str2 = (java.lang.String) this.zzb.get(0);
                java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                java.lang.String[] split = str2.split(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, -1);
                try {
                    int parseInt = java.lang.Integer.parseInt(split[0]);
                    java.lang.Integer valueOf = split.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(split[1])) : null;
                    zzamVar.zzg(java.lang.Integer.valueOf(parseInt));
                    zzamVar.zzh(valueOf);
                    break;
                } catch (java.lang.NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzamVar.zzi(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) this.zzb.get(0))));
                    break;
                } catch (java.lang.NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    java.lang.String str4 = (java.lang.String) this.zzb.get(0);
                    int parseInt2 = java.lang.Integer.parseInt(str4.substring(2, 4));
                    int parseInt3 = java.lang.Integer.parseInt(str4.substring(0, 2));
                    zzamVar.zzj(java.lang.Integer.valueOf(parseInt2));
                    zzamVar.zzk(java.lang.Integer.valueOf(parseInt3));
                    break;
                } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                java.util.List zzb = zzb((java.lang.String) this.zzb.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzamVar.zzk((java.lang.Integer) zzb.get(2));
                        }
                    }
                    zzamVar.zzj((java.lang.Integer) zzb.get(1));
                }
                zzamVar.zzi((java.lang.Integer) zzb.get(0));
                break;
            case 15:
                java.util.List zzb2 = zzb((java.lang.String) this.zzb.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzamVar.zzn((java.lang.Integer) zzb2.get(2));
                        }
                    }
                    zzamVar.zzm((java.lang.Integer) zzb2.get(1));
                }
                zzamVar.zzl((java.lang.Integer) zzb2.get(0));
                break;
            case 16:
            case 17:
                zzamVar.zzp((java.lang.CharSequence) this.zzb.get(0));
                break;
            case 18:
            case 19:
                zzamVar.zzq((java.lang.CharSequence) this.zzb.get(0));
                break;
            case 20:
            case 21:
                zzamVar.zzo((java.lang.CharSequence) this.zzb.get(0));
                break;
            case 22:
                com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zzb;
                java.lang.Integer zzh = com.google.android.gms.internal.ads.zzhah.zzh((java.lang.String) zzgwmVar.get(0), 10);
                if (zzh != null) {
                    java.lang.String zza = com.google.android.gms.internal.ads.zzajp.zza(zzh.intValue());
                    if (zza != null) {
                        zzamVar.zzt(zza);
                        break;
                    }
                } else {
                    zzamVar.zzt((java.lang.CharSequence) zzgwmVar.get(0));
                    break;
                }
                break;
        }
    }
}
