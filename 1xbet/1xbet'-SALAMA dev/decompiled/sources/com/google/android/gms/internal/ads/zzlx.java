package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class zzlx {
    private boolean zza;

    public zzlx(Context context, Looper looper, zzcz zzczVar) {
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
