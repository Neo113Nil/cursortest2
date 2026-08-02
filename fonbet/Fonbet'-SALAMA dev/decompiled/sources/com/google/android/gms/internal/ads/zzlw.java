package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
final class zzlw {
    private boolean zza;

    public zzlw(Context context, Looper looper, zzcz zzczVar) {
        context.getApplicationContext();
        zzczVar.zzd(looper, null);
    }

    public final void zza(boolean z4) {
        if (this.zza == z4) {
            return;
        }
        this.zza = z4;
    }
}
