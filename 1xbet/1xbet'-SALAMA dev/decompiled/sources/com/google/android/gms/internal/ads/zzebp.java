package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzebp {
    private final Context zza;

    public zzebp(Context context) {
        this.zza = context;
    }

    public final I3.b zza(boolean z4) {
        try {
            p170z0.a aVar = new p170z0.a(z4);
            p161x0.b bVarA = p161x0.b.a(this.zza);
            return bVarA != null ? bVarA.b(aVar) : zzgbc.zzg(new IllegalStateException());
        } catch (Exception e7) {
            return zzgbc.zzg(e7);
        }
    }
}
