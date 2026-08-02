package com.google.android.gms.internal.ads;

import G.h;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzekb implements zzesh {
    private final Context zza;

    public zzekb(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return zzgbc.zzh(new zzekc(h.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
