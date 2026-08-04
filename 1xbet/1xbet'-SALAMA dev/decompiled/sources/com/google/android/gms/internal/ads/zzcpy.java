package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzcpy implements zzcpz {
    private final Map zza;

    public zzcpy(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final zzebr zza(int i7, String str) {
        return (zzebr) this.zza.get(str);
    }
}
