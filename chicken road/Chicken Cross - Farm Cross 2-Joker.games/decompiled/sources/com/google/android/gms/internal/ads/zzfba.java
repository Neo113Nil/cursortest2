package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzfba implements Callable {
    static final /* synthetic */ zzfba zza = new zzfba();

    private /* synthetic */ zzfba() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzt.zzh().zzm());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqg)).booleanValue()) {
            ActivityManager.MemoryInfo zzx = com.google.android.gms.ads.internal.zzt.zzh().zzx();
            if (zzx != null) {
                if (PlatformVersion.isAtLeastU()) {
                    bundle.putLong("a_ad_mem", zzx.advertisedMem);
                }
                bundle.putLong("a_total", zzx.totalMem);
                bundle.putLong("a_avai", zzx.availMem);
                bundle.putLong("a_threshold", zzx.threshold);
                bundle.putBoolean("a_is_low_mem", zzx.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new zzfbc(bundle);
    }
}
