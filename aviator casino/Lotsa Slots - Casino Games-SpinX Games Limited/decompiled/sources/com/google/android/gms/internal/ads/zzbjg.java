package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbjg extends com.google.android.gms.internal.ads.zzbjh {
    private final com.google.android.gms.ads.internal.zzg zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    public zzbjg(com.google.android.gms.ads.internal.zzg zzgVar, java.lang.String str, java.lang.String str2) {
        this.zza = zzgVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    public final java.lang.String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    public final java.lang.String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    public final void zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.zza.zza((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    public final void zzf() {
        this.zza.zzc();
    }
}
