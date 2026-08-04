package com.google.android.gms.internal.ads;

import J2.j;
import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzbyg implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbzf zzb;

    public zzbyg(zzbyh zzbyhVar, Context context, zzbzf zzbzfVar) {
        this.zza = context;
        this.zzb = zzbzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (e | f | IOException | IllegalStateException e7) {
            this.zzb.zzd(e7);
            j.e("Exception while getting advertising Id info", e7);
        }
    }
}
