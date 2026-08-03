package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfc {
    private final com.google.android.gms.internal.ads.zzbb zza;
    private final com.google.android.gms.internal.ads.zzaz zzb;
    private final com.google.android.gms.internal.ads.zzew zzc;
    private final com.google.android.gms.internal.ads.zzbd zzd = new com.google.android.gms.internal.ads.zzbd();
    private final com.google.android.gms.internal.ads.zzdz zze;
    private final com.google.android.gms.internal.ads.zzex zzf;
    private final com.google.android.gms.internal.ads.zzez zzg;
    private final com.google.android.gms.internal.ads.zzfa zzh;
    private final com.google.android.gms.internal.ads.zzfb zzi;

    public zzfc(com.google.android.gms.internal.ads.zzbb zzbbVar, com.google.android.gms.internal.ads.zzew zzewVar, com.google.android.gms.internal.ads.zzdo zzdoVar, int i, int i2, int i3, int i4) {
        this.zza = zzbbVar;
        this.zzc = zzewVar;
        this.zze = zzdoVar.zzd(zzbbVar.zzd(), new android.os.Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzey
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(android.os.Message message) {
                return com.google.android.gms.internal.ads.zzfc.this.zzb(message);
            }
        });
        this.zzf = new com.google.android.gms.internal.ads.zzex(this, i);
        this.zzg = new com.google.android.gms.internal.ads.zzez(this, i2);
        this.zzh = new com.google.android.gms.internal.ads.zzfa(this, i3);
        this.zzi = new com.google.android.gms.internal.ads.zzfb(this, i4);
        com.google.android.gms.internal.ads.zzev zzevVar = new com.google.android.gms.internal.ads.zzev(this);
        this.zzb = zzevVar;
        zzbbVar.zze(zzevVar);
    }

    public final void zza() {
        this.zze.zzl(null);
        this.zza.zzf(this.zzb);
    }

    final /* synthetic */ boolean zzb(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            this.zzf.zza();
            return true;
        }
        if (i == 2) {
            this.zzg.zza();
            return true;
        }
        if (i == 3) {
            this.zzh.zza();
            return true;
        }
        if (i != 4) {
            return false;
        }
        this.zzi.zza();
        return true;
    }

    final /* synthetic */ void zzc() {
        this.zzf.zza();
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbb zzd() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzew zze() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbd zzf() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdz zzg() {
        return this.zze;
    }
}
