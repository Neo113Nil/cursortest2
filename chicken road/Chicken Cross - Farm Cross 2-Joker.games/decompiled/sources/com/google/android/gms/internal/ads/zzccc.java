package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzccc {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzcgj.zza.submit(new zzcca(this, context));
    }

    final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}
