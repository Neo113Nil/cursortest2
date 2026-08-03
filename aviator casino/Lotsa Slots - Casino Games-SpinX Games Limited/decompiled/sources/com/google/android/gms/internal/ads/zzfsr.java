package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfsr implements com.google.android.gms.internal.ads.zzbfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfss zza;

    zzfsr(com.google.android.gms.internal.ads.zzfss zzfssVar) {
        java.util.Objects.requireNonNull(zzfssVar);
        this.zza = zzfssVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzz)).booleanValue()) {
            this.zza.zzl(z);
        }
    }
}
