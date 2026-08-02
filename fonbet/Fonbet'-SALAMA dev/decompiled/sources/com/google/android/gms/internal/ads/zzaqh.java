package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
final class zzaqh implements zzapw {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzaqh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
