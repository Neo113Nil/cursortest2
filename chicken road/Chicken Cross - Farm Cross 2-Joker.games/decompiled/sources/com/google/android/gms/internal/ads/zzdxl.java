package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdxl {

    @Nullable
    private volatile InputEvent zza;

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    @Nullable
    public final InputEvent zzb() {
        return this.zza;
    }
}
