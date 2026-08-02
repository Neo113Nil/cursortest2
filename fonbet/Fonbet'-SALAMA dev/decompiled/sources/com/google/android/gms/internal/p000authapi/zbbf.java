package com.google.android.gms.internal.p000authapi;

import Y4.D;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zbbf extends zbae {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbf(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbaf
    public final void zbb(Status status, PendingIntent pendingIntent) {
        D.U(status, pendingIntent, this.zba);
    }
}
