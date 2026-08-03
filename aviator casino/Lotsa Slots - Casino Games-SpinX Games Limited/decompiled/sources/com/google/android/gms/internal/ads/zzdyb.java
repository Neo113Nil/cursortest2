package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdyb implements com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzdcu, com.google.android.gms.internal.ads.zzddl, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdii {
    private final com.google.android.gms.internal.ads.zzbhp zza;
    private boolean zzb = false;

    public zzdyb(com.google.android.gms.internal.ads.zzbhp zzbhpVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzfia zzfiaVar) {
        this.zza = zzbhpVar;
        zzbhpVar.zzc(2);
        if (zzfiaVar != null) {
            zzbhpVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
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

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(final com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        this.zza.zzb(new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzdya
            @Override // com.google.android.gms.internal.ads.zzbho
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar) {
                com.google.android.gms.internal.ads.zzbhv.zza.zzb zzcc = zzaVar.zzY().zzcc();
                com.google.android.gms.internal.ads.zzbhv.zzi.zza zzcc2 = zzaVar.zzY().zzp().zzcc();
                zzcc2.zzd(com.google.android.gms.internal.ads.zzfkq.this.zzb.zzb.zzb);
                zzcc.zzr(zzcc2);
                zzaVar.zzaa(zzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzj(final com.google.android.gms.internal.ads.zzbhv.zzb zzbVar) {
        com.google.android.gms.internal.ads.zzbho zzbhoVar = new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // com.google.android.gms.internal.ads.zzbho
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar) {
                zzaVar.zzar(com.google.android.gms.internal.ads.zzbhv.zzb.this);
            }
        };
        com.google.android.gms.internal.ads.zzbhp zzbhpVar = this.zza;
        zzbhpVar.zzb(zzbhoVar);
        zzbhpVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzk(final com.google.android.gms.internal.ads.zzbhv.zzb zzbVar) {
        com.google.android.gms.internal.ads.zzbho zzbhoVar = new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzdxy
            @Override // com.google.android.gms.internal.ads.zzbho
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar) {
                zzaVar.zzar(com.google.android.gms.internal.ads.zzbhv.zzb.this);
            }
        };
        com.google.android.gms.internal.ads.zzbhp zzbhpVar = this.zza;
        zzbhpVar.zzb(zzbhoVar);
        zzbhpVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzl(final com.google.android.gms.internal.ads.zzbhv.zzb zzbVar) {
        com.google.android.gms.internal.ads.zzbho zzbhoVar = new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzbho
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar) {
                zzaVar.zzar(com.google.android.gms.internal.ads.zzbhv.zzb.this);
            }
        };
        com.google.android.gms.internal.ads.zzbhp zzbhpVar = this.zza;
        zzbhpVar.zzb(zzbhoVar);
        zzbhpVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzm(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzo() {
        this.zza.zzc(1109);
    }
}
