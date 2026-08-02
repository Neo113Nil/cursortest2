package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final /* synthetic */ class zzii implements com.google.android.gms.tasks.SuccessContinuation {
    static final /* synthetic */ com.google.android.libraries.places.internal.zzii zza = new com.google.android.libraries.places.internal.zzii();

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        taskCompletionSource.setResult(com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse.newInstance(android.net.Uri.parse(((com.google.android.libraries.places.internal.zzayo) obj).zza())));
        return taskCompletionSource.getTask();
    }

    private /* synthetic */ zzii() {
    }
}
