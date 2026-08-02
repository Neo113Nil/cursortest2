package com.google.android.gms.internal.ads;

import F2.Y;
import z2.e;

/* loaded from: classes.dex */
public final class zzayl extends Y {
    private final e zza;

    public zzayl(e eVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.zza = eVar;
    }

    public final e zzb() {
        return this.zza;
    }

    @Override // F2.Z
    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
