package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzw implements com.google.android.gms.common.api.internal.RemoteCall {
    static final com.google.android.gms.common.api.internal.RemoteCall zza = new com.google.android.gms.location.zzw();

    private zzw() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.gms.internal.location.zzaz) obj).zzK(new com.google.android.gms.location.zzao((com.google.android.gms.tasks.TaskCompletionSource) obj2));
    }
}
