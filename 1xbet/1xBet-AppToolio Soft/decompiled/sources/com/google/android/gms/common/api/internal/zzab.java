package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
final class zzab implements PendingResult.StatusListener {
    private final /* synthetic */ BasePendingResult zzgy;
    private final /* synthetic */ zzaa zzgz;

    zzab(zzaa zzaaVar, BasePendingResult basePendingResult) {
        this.zzgz = zzaaVar;
        this.zzgy = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Map map;
        map = this.zzgz.zzgw;
        map.remove(this.zzgy);
    }
}
