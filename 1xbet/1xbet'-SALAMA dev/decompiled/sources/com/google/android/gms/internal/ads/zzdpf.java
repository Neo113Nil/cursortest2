package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;

/* JADX INFO: loaded from: classes.dex */
public final class zzdpf implements zzcxn, zzcwe, zzcut, zzcvk, InterfaceC0217a, zzczz {
    private final zzbaw zza;
    private boolean zzb = false;

    public zzdpf(zzbaw zzbawVar, zzeya zzeyaVar) {
        this.zza = zzbawVar;
        zzbawVar.zzc(2);
        if (zzeyaVar != null) {
            zzbawVar.zzc(1101);
        }
    }

    @Override // F2.InterfaceC0217a
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(final zzfar zzfarVar) {
        this.zza.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdpb
            @Override // com.google.android.gms.internal.ads.zzbav
            public final void zza(zzbbd.zzt.zza zzaVar) {
                zzbbd.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbbd.zzi.zza zzaVarZzbM = zzaVar.zze().zzad().zzbM();
                zzaVarZzbM.zzo(zzfarVar.zzb.zzb.zzb);
                zzbVarZzbM.zzT(zzaVarZzbM);
                zzaVar.zzG(zzbVarZzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.f10720a) {
            case 1:
                this.zza.zzc(ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzi(final zzbbd.zzb zzbVar) {
        this.zza.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // com.google.android.gms.internal.ads.zzbav
            public final void zza(zzbbd.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzj(final zzbbd.zzb zzbVar) {
        this.zza.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdpc
            @Override // com.google.android.gms.internal.ads.zzbav
            public final void zza(zzbbd.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzl(boolean z4) {
        this.zza.zzc(true != z4 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzm(final zzbbd.zzb zzbVar) {
        this.zza.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdpd
            @Override // com.google.android.gms.internal.ads.zzbav
            public final void zza(zzbbd.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzn(boolean z4) {
        this.zza.zzc(true != z4 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        this.zza.zzc(3);
    }
}
