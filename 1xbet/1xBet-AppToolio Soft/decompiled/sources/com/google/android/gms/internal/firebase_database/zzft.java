package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzft implements zzfq {
    private final long zzni;

    public zzft(long j) {
        this.zzni = j;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfq
    public final boolean zza(long j, long j2) {
        return j > this.zzni || j2 > 1000;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfq
    public final float zzde() {
        return 0.2f;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfq
    public final long zzdf() {
        return 1000L;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfq
    public final boolean zzm(long j) {
        return j > 1000;
    }
}
