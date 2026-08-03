package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhu implements com.google.android.gms.internal.ads.zzho {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzho zzb;

    public zzhu(android.content.Context context) {
        com.google.android.gms.internal.ads.zzhw zzhwVar = new com.google.android.gms.internal.ads.zzhw();
        this.zza = context.getApplicationContext();
        this.zzb = zzhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhp zza() {
        return new com.google.android.gms.internal.ads.zzhv(this.zza, this.zzb.zza());
    }
}
