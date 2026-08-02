package com.google.android.gms.internal.ads;

import F2.C0252s;
import J2.d;
import android.content.Context;
import com.google.android.gms.common.g;

/* loaded from: classes.dex */
public final class zzbyh {
    public final I3.b zza(Context context, int i7) {
        zzbzf zzbzfVar = new zzbzf();
        d dVar = C0252s.f2717f.f2718a;
        int d7 = com.google.android.gms.common.d.f11217b.d(context, g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (d7 == 0 || d7 == 2) {
            zzbza.zza.execute(new zzbyg(this, context, zzbzfVar));
        }
        return zzbzfVar;
    }
}
