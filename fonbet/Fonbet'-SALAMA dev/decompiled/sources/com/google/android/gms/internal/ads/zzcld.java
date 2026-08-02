package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzcld implements zzcvl {
    private final zzfby zza;

    public zzcld(zzfby zzfbyVar) {
        this.zza = zzfbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdh(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfbh e7) {
            int i7 = J.f3546b;
            j.h("Cannot invoke onDestroy for the mediation adapter.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdj(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfbh e7) {
            int i7 = J.f3546b;
            j.h("Cannot invoke onPause for the mediation adapter.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdk(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfbh e7) {
            int i7 = J.f3546b;
            j.h("Cannot invoke onResume for the mediation adapter.", e7);
        }
    }
}
