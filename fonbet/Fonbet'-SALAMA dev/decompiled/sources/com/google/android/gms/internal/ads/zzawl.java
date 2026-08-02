package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzawl extends zzaxe {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzawl(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, Map map, View view, Context context) {
        super(zzavrVar, "W0Fet8GxcnKamBNZPK56yKE5tlEUkRkhJrfykhnxCthEGE3dgE5YcOONa3GOhJDD", "RFqgxDe56AlBv7LhYOQj7p8AeiYxusgi8LK0zEO/OSM=", zzarrVar, i7, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzb(int i7) {
        Map map = this.zzh;
        Integer valueOf = Integer.valueOf(i7);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzh.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        long[] jArr = {zzb(1), zzb(2)};
        Context context = this.zzj;
        if (context == null) {
            context = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, context, this.zzi);
        long j = jArr2[0];
        this.zzh.put(1, Long.valueOf(jArr2[1]));
        long j3 = jArr2[2];
        this.zzh.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zzd) {
            this.zzd.zzt(j);
            this.zzd.zzs(j3);
        }
    }
}
