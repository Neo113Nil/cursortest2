package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbgu implements com.google.android.gms.internal.ads.zzbfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbgx zza;

    zzbgu(com.google.android.gms.internal.ads.zzbgx zzbgxVar) {
        java.util.Objects.requireNonNull(zzbgxVar);
        this.zza = zzbgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
