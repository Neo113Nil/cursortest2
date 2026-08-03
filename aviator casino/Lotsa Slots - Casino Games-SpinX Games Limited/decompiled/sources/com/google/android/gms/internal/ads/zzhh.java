package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzhh implements com.google.android.gms.internal.ads.zzhp {
    private final boolean zza;
    private final java.util.ArrayList zzb = new java.util.ArrayList(1);
    private int zzc;
    private com.google.android.gms.internal.ads.zzht zzd;

    protected zzhh(boolean z) {
        this.zza = z;
    }

    protected final void zzf(com.google.android.gms.internal.ads.zzht zzhtVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((com.google.android.gms.internal.ads.zzin) this.zzb.get(i)).zza(this, zzhtVar, this.zza);
        }
    }

    protected final void zzg(com.google.android.gms.internal.ads.zzht zzhtVar) {
        this.zzd = zzhtVar;
        for (int i = 0; i < this.zzc; i++) {
            ((com.google.android.gms.internal.ads.zzin) this.zzb.get(i)).zzb(this, zzhtVar, this.zza);
        }
    }

    protected final void zzh(int i) {
        com.google.android.gms.internal.ads.zzht zzhtVar = this.zzd;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((com.google.android.gms.internal.ads.zzin) this.zzb.get(i2)).zzc(this, zzhtVar, this.zza, i);
        }
    }

    protected final void zzi() {
        com.google.android.gms.internal.ads.zzht zzhtVar = this.zzd;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        for (int i = 0; i < this.zzc; i++) {
            ((com.google.android.gms.internal.ads.zzin) this.zzb.get(i)).zzd(this, zzhtVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public /* synthetic */ java.util.Map zzj() {
        java.util.Map emptyMap;
        emptyMap = java.util.Collections.emptyMap();
        return emptyMap;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zze(com.google.android.gms.internal.ads.zzin zzinVar) {
        zzinVar.getClass();
        java.util.ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzinVar)) {
            return;
        }
        arrayList.add(zzinVar);
        this.zzc++;
    }
}
