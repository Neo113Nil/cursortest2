package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class zzepw implements zzesh {
    private final Context zza;
    private final Intent zzb;

    public zzepw(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        J.k("HsdpMigrationSignal.produce");
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmL)).booleanValue()) {
            return zzgbc.zzh(new zzepx(null));
        }
        boolean z4 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                J.k("HSDP intent is supported");
                z4 = true;
            }
        } catch (Exception e7) {
            o.f1952C.f1961g.zzw(e7, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgbc.zzh(new zzepx(Boolean.valueOf(z4)));
    }
}
