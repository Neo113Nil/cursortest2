package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcfi implements com.google.android.gms.internal.ads.zzbfk {
    final com.google.android.gms.internal.ads.zzcff zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final java.lang.Object zzd = new java.lang.Object();
    final java.util.HashSet zzb = new java.util.HashSet();
    final java.util.HashSet zzc = new java.util.HashSet();
    private boolean zzg = false;
    private final com.google.android.gms.internal.ads.zzcfg zzf = new com.google.android.gms.internal.ads.zzcfg();

    public zzcfi(java.lang.String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new com.google.android.gms.internal.ads.zzcff(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(boolean z) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (!z) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zze;
            zzgVar.zzl(currentTimeMillis);
            zzgVar.zzn(this.zza.zzd);
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.zze;
        if (currentTimeMillis - zzgVar2.zzm() > ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbG)).longValue()) {
            this.zza.zzd = -1;
        } else {
            this.zza.zzd = zzgVar2.zzo();
        }
        this.zzg = true;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcexVar);
        }
    }

    public final void zzc(java.util.HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zza();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        synchronized (this.zzd) {
            this.zza.zze(zzmVar, j);
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zzg();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final int zzj() {
        int zzd;
        synchronized (this.zzd) {
            zzd = this.zza.zzd();
        }
        return zzd;
    }

    public final com.google.android.gms.internal.ads.zzcex zzk(com.google.android.gms.common.util.Clock clock, java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzcex(clock, this, this.zzf.zza(), str);
    }

    public final boolean zzl() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.ads.zzcfe zzm(java.util.Set set, java.lang.String str) {
        return this.zza.zzi(set, str);
    }

    public final android.os.Bundle zzn(android.content.Context context, com.google.android.gms.internal.ads.zzfmg zzfmgVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        synchronized (this.zzd) {
            java.util.HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBundle("app", this.zza.zzh(context, this.zzf.zzb()));
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.util.Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((com.google.android.gms.internal.ads.zzcex) it2.next()).zzi());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfmgVar.zzb(hashSet);
        return bundle;
    }
}
