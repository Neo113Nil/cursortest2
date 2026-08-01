package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfu {
    private boolean zza;

    public zzfu(Context context, Looper looper, zzdp zzdpVar) {
        context.getApplicationContext();
        zzdpVar.zzd(looper, null);
        zzdpVar.zzd(Looper.getMainLooper(), null);
    }

    public final void zza(boolean z) {
        if (this.zza == z) {
            return;
        }
        this.zza = z;
    }
}
