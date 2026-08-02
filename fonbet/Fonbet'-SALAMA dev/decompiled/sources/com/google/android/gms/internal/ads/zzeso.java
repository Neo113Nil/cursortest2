package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeso implements zzesg {
    private final int zza;
    private final int zzb;

    public zzeso(int i7, int i8) {
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        int i7 = this.zza;
        if (i7 == -1 || this.zzb == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i7);
        bundle.putInt("crashes_without_flags", this.zzb);
        C0252s c0252s = C0252s.f2717f;
        if (C0254t.f2723d.f2726c.zze()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
