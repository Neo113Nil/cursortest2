package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhw implements com.google.android.gms.internal.ads.zzho {
    private com.google.android.gms.internal.ads.zzin zzb;
    private java.lang.String zzc;
    private boolean zzf;
    private final com.google.android.gms.internal.ads.zzih zza = new com.google.android.gms.internal.ads.zzih();
    private int zzd = 8000;
    private int zze = 8000;

    public final com.google.android.gms.internal.ads.zzhw zzb(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhw zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhw zzd(int i) {
        this.zze = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhw zze(boolean z) {
        this.zzf = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhw zzf(com.google.android.gms.internal.ads.zzin zzinVar) {
        this.zzb = zzinVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzho
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzia zza() {
        com.google.android.gms.internal.ads.zzia zziaVar = new com.google.android.gms.internal.ads.zzia(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        com.google.android.gms.internal.ads.zzin zzinVar = this.zzb;
        if (zzinVar != null) {
            zziaVar.zze(zzinVar);
        }
        return zziaVar;
    }
}
