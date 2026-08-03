package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzftf implements com.google.android.gms.internal.ads.zzbfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfth zza;

    zzftf(com.google.android.gms.internal.ads.zzfth zzfthVar) {
        java.util.Objects.requireNonNull(zzfthVar);
        this.zza = zzfthVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzz)).booleanValue()) {
            this.zza.zzj(z);
        }
    }
}
