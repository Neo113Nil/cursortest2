package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final /* synthetic */ class zzby implements com.google.android.gms.common.api.internal.RemoteCall {
    static final /* synthetic */ com.google.android.gms.internal.identity.zzby zza = new com.google.android.gms.internal.identity.zzby();

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.gms.internal.identity.zzdz) obj).zzq(new com.google.android.gms.location.LastLocationRequest.Builder().build(), (com.google.android.gms.tasks.TaskCompletionSource) obj2);
    }

    private /* synthetic */ zzby() {
    }
}
