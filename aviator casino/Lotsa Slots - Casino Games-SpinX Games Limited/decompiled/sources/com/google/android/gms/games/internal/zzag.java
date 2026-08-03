package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
class zzag extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;

    zzag(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        this.zza = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "Holder must not be null");
    }

    final void zzs(java.lang.Object obj) {
        this.zza.setResult(obj);
    }
}
