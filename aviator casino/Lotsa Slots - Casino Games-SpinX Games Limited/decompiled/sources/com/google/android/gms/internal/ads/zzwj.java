package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzwj implements com.google.android.gms.internal.ads.zzxm {
    private final java.util.ArrayList zza = new java.util.ArrayList(1);
    private final java.util.HashSet zzb = new java.util.HashSet(1);
    private final com.google.android.gms.internal.ads.zzxu zzc = new com.google.android.gms.internal.ads.zzxu();
    private final com.google.android.gms.internal.ads.zzui zzd = new com.google.android.gms.internal.ads.zzui();
    private android.os.Looper zze;
    private com.google.android.gms.internal.ads.zzbf zzf;
    private com.google.android.gms.internal.ads.zzqf zzg;

    @Override // com.google.android.gms.internal.ads.zzxm
    public /* synthetic */ void zzA(com.google.android.gms.internal.ads.zzak zzakVar) {
        com.google.android.gms.internal.ads.zzxm.CC.$default$zzA(this, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public /* synthetic */ com.google.android.gms.internal.ads.zzbf zzH() {
        return com.google.android.gms.internal.ads.zzxm.CC.$default$zzH(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public /* synthetic */ boolean zzI() {
        return com.google.android.gms.internal.ads.zzxm.CC.$default$zzI(this);
    }

    protected void zzM() {
    }

    protected abstract void zza(com.google.android.gms.internal.ads.zzin zzinVar);

    protected void zzc() {
    }

    protected abstract void zzd();

    protected final void zze(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        this.zzf = zzbfVar;
        java.util.ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.internal.ads.zzxl) arrayList.get(i)).zza(this, zzbfVar);
        }
    }

    protected final com.google.android.gms.internal.ads.zzxu zzf(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return this.zzc.zza(0, zzxkVar);
    }

    protected final com.google.android.gms.internal.ads.zzxu zzg(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return this.zzc.zza(0, zzxkVar);
    }

    protected final com.google.android.gms.internal.ads.zzui zzh(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return this.zzd.zza(0, zzxkVar);
    }

    protected final com.google.android.gms.internal.ads.zzui zzi(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return this.zzd.zza(0, zzxkVar);
    }

    protected final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzl(android.os.Handler handler, com.google.android.gms.internal.ads.zzxv zzxvVar) {
        this.zzc.zzb(handler, zzxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm(com.google.android.gms.internal.ads.zzxv zzxvVar) {
        this.zzc.zzc(zzxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzn(android.os.Handler handler, com.google.android.gms.internal.ads.zzuj zzujVar) {
        this.zzd.zzb(handler, zzujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzo(com.google.android.gms.internal.ads.zzuj zzujVar) {
        this.zzd.zzc(zzujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzp(com.google.android.gms.internal.ads.zzxl zzxlVar, com.google.android.gms.internal.ads.zzin zzinVar, com.google.android.gms.internal.ads.zzqf zzqfVar) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzg = zzqfVar;
        com.google.android.gms.internal.ads.zzbf zzbfVar = this.zzf;
        this.zza.add(zzxlVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzxlVar);
            zza(zzinVar);
        } else if (zzbfVar != null) {
            zzq(zzxlVar);
            zzxlVar.zza(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(com.google.android.gms.internal.ads.zzxl zzxlVar) {
        this.zze.getClass();
        java.util.HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzxlVar);
        if (isEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzr(com.google.android.gms.internal.ads.zzxl zzxlVar) {
        java.util.HashSet hashSet = this.zzb;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(zzxlVar);
        if (z && hashSet.isEmpty()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzs(com.google.android.gms.internal.ads.zzxl zzxlVar) {
        java.util.ArrayList arrayList = this.zza;
        arrayList.remove(zzxlVar);
        if (!arrayList.isEmpty()) {
            zzr(zzxlVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }

    protected final com.google.android.gms.internal.ads.zzqf zzk() {
        com.google.android.gms.internal.ads.zzqf zzqfVar = this.zzg;
        zzqfVar.getClass();
        return zzqfVar;
    }
}
