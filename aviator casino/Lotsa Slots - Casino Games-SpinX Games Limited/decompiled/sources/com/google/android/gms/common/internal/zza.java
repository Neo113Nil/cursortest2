package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
abstract class zza extends com.google.android.gms.common.internal.zzc {
    public final int zza;
    public final android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected zza(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i, android.os.Bundle bundle) {
        super(baseGmsClient, true);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzc = baseGmsClient;
        this.zza = i;
        this.zzb = bundle;
    }

    protected abstract boolean zza();

    protected abstract void zzb(com.google.android.gms.common.ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void zzc(java.lang.Object obj) {
        int i = this.zza;
        if (i != 0) {
            this.zzc.zzd(1, null);
            android.os.Bundle bundle = this.zzb;
            zzb(new com.google.android.gms.common.ConnectionResult(i, bundle != null ? (android.app.PendingIntent) bundle.getParcelable(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else {
            if (zza()) {
                return;
            }
            this.zzc.zzd(1, null);
            zzb(new com.google.android.gms.common.ConnectionResult(8, null));
        }
    }
}
