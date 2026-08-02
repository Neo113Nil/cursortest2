package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzyl implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzyu zza;

    zzyl(zzym zzymVar, zzyu zzyuVar) {
        this.zza = zzyuVar;
        Objects.requireNonNull(zzymVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }
}
