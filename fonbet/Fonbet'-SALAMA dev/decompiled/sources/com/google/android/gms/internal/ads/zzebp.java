package com.google.android.gms.internal.ads;

import android.content.Context;
import x0.C1786b;
import z0.C1808a;

/* loaded from: classes.dex */
public final class zzebp {
    private final Context zza;

    public zzebp(Context context) {
        this.zza = context;
    }

    public final I3.b zza(boolean z4) {
        try {
            C1808a c1808a = new C1808a(z4);
            C1786b a2 = C1786b.a(this.zza);
            return a2 != null ? a2.b(c1808a) : zzgbc.zzg(new IllegalStateException());
        } catch (Exception e7) {
            return zzgbc.zzg(e7);
        }
    }
}
