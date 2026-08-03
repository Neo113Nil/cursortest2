package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
abstract class zzap implements com.google.android.gms.common.api.internal.RemoteCall<com.google.android.gms.internal.location.zzaz, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> {
    private boolean zza = true;

    protected zzap() {
    }

    protected final boolean zza() {
        return this.zza;
    }

    final void zzb(boolean z) {
        this.zza = false;
    }
}
