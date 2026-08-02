package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zaab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaad zab;

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        java.util.Map map;
        map = this.zab.zaa;
        map.remove(this.zaa);
    }

    zaab(com.google.android.gms.common.api.internal.zaad zaadVar, com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.zab = zaadVar;
        this.zaa = basePendingResult;
    }
}
