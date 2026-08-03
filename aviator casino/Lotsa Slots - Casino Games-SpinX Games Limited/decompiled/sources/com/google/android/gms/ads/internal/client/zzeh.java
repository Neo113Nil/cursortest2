package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzeh {
    private final java.lang.String zza;
    private final java.util.List zzb;
    private final java.util.Set zzc;
    private final android.os.Bundle zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final int zzg;
    private final java.util.Set zzh;
    private final android.os.Bundle zzi;
    private final java.util.Set zzj;
    private final boolean zzk;
    private final java.lang.String zzl;
    private final int zzm;
    private long zzn = 0;
    private long zzo;

    public zzeh(com.google.android.gms.ads.internal.client.zzeg zzegVar) {
        this.zzo = 0L;
        this.zza = zzegVar.zzx();
        this.zzb = zzegVar.zzy();
        this.zzc = java.util.Collections.unmodifiableSet(zzegVar.zzr());
        this.zzd = zzegVar.zzs();
        java.util.Collections.unmodifiableMap(zzegVar.zzt());
        this.zze = zzegVar.zzz();
        this.zzf = zzegVar.zzA();
        this.zzg = zzegVar.zzB();
        this.zzh = java.util.Collections.unmodifiableSet(zzegVar.zzu());
        this.zzi = zzegVar.zzv();
        this.zzj = java.util.Collections.unmodifiableSet(zzegVar.zzw());
        this.zzk = zzegVar.zzC();
        this.zzl = zzegVar.zzD();
        this.zzm = zzegVar.zzE();
        this.zzo = zzegVar.zzF();
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.util.List zzb() {
        return new java.util.ArrayList(this.zzb);
    }

    public final java.util.Set zzc() {
        return this.zzc;
    }

    public final android.os.Bundle zzd(java.lang.Class cls) {
        return this.zzd.getBundle(cls.getName());
    }

    public final android.os.Bundle zze(java.lang.Class cls) {
        android.os.Bundle bundle = this.zzd.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final java.lang.String zzf() {
        return this.zze;
    }

    public final java.lang.String zzg() {
        return this.zzf;
    }

    public final boolean zzh(android.content.Context context) {
        com.google.android.gms.ads.RequestConfiguration zzp = com.google.android.gms.ads.internal.client.zzeu.zzb().zzp();
        com.google.android.gms.ads.internal.client.zzay.zza();
        java.util.Set set = this.zzh;
        java.lang.String zzF = com.google.android.gms.ads.internal.util.client.zzf.zzF(context);
        return set.contains(zzF) || zzp.getTestDeviceIds().contains(zzF);
    }

    public final android.os.Bundle zzi() {
        return this.zzd;
    }

    public final int zzj() {
        return this.zzg;
    }

    public final android.os.Bundle zzk() {
        return this.zzi;
    }

    public final java.util.Set zzl() {
        return this.zzj;
    }

    @java.lang.Deprecated
    public final boolean zzm() {
        return this.zzk;
    }

    public final java.lang.String zzn() {
        return this.zzl;
    }

    public final int zzo() {
        return this.zzm;
    }

    public final void zzp(long j) {
        this.zzn = j;
    }

    public final long zzq() {
        return this.zzn;
    }

    public final long zzr() {
        return this.zzo;
    }
}
