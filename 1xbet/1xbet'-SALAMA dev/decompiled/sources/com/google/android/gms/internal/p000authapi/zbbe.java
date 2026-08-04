package com.google.android.gms.internal.p000authapi;

import Y4.D;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbbe extends zbag {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbe(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbah
    public final void zbb(Status status, PendingIntent pendingIntent) {
        D.U(status, pendingIntent, this.zba);
    }
}
