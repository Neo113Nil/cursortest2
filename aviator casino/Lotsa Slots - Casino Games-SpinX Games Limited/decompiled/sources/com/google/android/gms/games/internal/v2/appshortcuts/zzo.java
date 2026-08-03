package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzo extends com.google.android.gms.games.internal.v2.appshortcuts.zzq {
    zzo(com.google.android.gms.games.internal.v2.appshortcuts.zzr zzrVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.games.internal.v2.appshortcuts.zzq, com.google.android.gms.games.internal.v2.appshortcuts.zzy
    public final void zzb(com.google.android.gms.games.internal.v2.appshortcuts.zzh zzhVar) {
        if (zzhVar == null) {
            zzd(new com.google.android.gms.common.api.Status(17));
        } else {
            this.zza.trySetResult(zzhVar);
        }
    }
}
