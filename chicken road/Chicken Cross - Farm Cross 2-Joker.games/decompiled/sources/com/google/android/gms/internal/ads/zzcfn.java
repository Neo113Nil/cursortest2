package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcfn {
    public final ListenableFuture zza(Context context, int i) {
        zzcgo zzcgoVar = new zzcgo();
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
            zzcgj.zza.execute(new zzcfm(this, context, zzcgoVar));
        }
        return zzcgoVar;
    }
}
