package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.location.AbstractC0927f;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes4.dex */
final class zzap implements C0838l.b<AbstractC0927f> {
    final /* synthetic */ LocationResult zza;

    public zzap(zzar zzarVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.C0838l.b
    public final /* bridge */ /* synthetic */ void notifyListener(AbstractC0927f abstractC0927f) {
        abstractC0927f.getClass();
    }

    @Override // com.google.android.gms.common.api.internal.C0838l.b
    public final void onNotifyListenerFailed() {
    }
}
