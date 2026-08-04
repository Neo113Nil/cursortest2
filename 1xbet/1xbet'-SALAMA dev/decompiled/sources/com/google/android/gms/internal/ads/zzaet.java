package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
final class zzaet implements zzaej {
    public final String zza;

    private zzaet(String str) {
        this.zza = str;
    }

    public static zzaet zzb(zzed zzedVar) {
        return new zzaet(zzedVar.zzB(zzedVar.zzb(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int zza() {
        return 1852994675;
    }
}
