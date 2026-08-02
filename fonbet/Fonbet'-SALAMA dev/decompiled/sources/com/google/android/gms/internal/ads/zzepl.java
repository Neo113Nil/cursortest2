package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepl implements zzesh {
    private final Context zza;
    private final zzgbn zzb;

    public zzepl(zzgbn zzgbnVar, Context context) {
        this.zzb = zzgbnVar;
        this.zza = context;
    }

    public static zzepm zzc(zzepl zzeplVar) {
        P p5 = o.f1952C.f1957c;
        Object systemService = zzeplVar.zza.getSystemService("display");
        return new zzepm(systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepl.zzc(zzepl.this);
            }
        });
    }
}
