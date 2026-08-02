package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final /* synthetic */ class zzdc implements com.google.android.gms.common.api.internal.RemoteCall {
    static final /* synthetic */ com.google.android.gms.internal.identity.zzdc zza = new com.google.android.gms.internal.identity.zzdc();

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.gms.internal.identity.zzv) ((com.google.android.gms.internal.identity.zzdz) obj).getService()).zzE(new com.google.android.gms.internal.identity.zzdm((com.google.android.gms.tasks.TaskCompletionSource) obj2));
    }

    private /* synthetic */ zzdc() {
    }
}
