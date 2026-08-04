package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzblf implements D2.b {
    private final D2.a zza;
    private final String zzb;
    private final int zzc;

    public zzblf(D2.a aVar, String str, int i7) {
        this.zza = aVar;
        this.zzb = str;
        this.zzc = i7;
    }

    @Override // D2.b
    public final String getDescription() {
        return this.zzb;
    }

    @Override // D2.b
    public final D2.a getInitializationState() {
        return this.zza;
    }

    @Override // D2.b
    public final int getLatency() {
        return this.zzc;
    }
}
