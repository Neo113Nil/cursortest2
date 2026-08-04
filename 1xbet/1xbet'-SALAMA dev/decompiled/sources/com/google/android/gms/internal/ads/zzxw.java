package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes.dex */
final class zzxw implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzyf zza;

    public zzxw(zzxx zzxxVar, zzyf zzyfVar) {
        this.zza = zzyfVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        this.zza.zzu();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        this.zza.zzu();
    }
}
