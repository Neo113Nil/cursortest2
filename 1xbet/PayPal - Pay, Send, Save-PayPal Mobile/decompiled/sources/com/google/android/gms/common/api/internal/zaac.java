package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zaac implements com.google.android.gms.tasks.OnCompleteListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaad zab;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        java.util.Map map;
        map = this.zab.zab;
        map.remove(this.zaa);
    }

    zaac(com.google.android.gms.common.api.internal.zaad zaadVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zab = zaadVar;
        this.zaa = taskCompletionSource;
    }
}
