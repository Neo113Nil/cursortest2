package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;

/* loaded from: classes4.dex */
public final class zzg {
    public final i<Status> removeActivityUpdates(h hVar, PendingIntent pendingIntent) {
        return hVar.b(new zze(this, hVar, pendingIntent));
    }

    public final i<Status> requestActivityUpdates(h hVar, long j, PendingIntent pendingIntent) {
        return hVar.b(new zzd(this, hVar, j, pendingIntent));
    }
}
