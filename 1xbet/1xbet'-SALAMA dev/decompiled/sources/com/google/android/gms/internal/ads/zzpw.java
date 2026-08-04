package com.google.android.gms.internal.ads;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzpw extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzz zzc;

    public zzpw(int i7, zzz zzzVar, boolean z4) {
        super(k.d(i7, "AudioTrack write failed: "));
        this.zzb = z4;
        this.zza = i7;
        this.zzc = zzzVar;
    }
}
