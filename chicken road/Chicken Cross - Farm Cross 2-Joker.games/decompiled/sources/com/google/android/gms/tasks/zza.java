package com.google.android.gms.tasks;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-tasks@@18.3.2 */
/* loaded from: classes8.dex */
final class zza implements OnSuccessListener {
    final /* synthetic */ OnTokenCanceledListener zza;

    zza(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = onTokenCanceledListener;
        Objects.requireNonNull(zzbVar);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.zza.onCanceled();
    }
}
