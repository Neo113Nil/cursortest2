package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzkm implements zzkf {
    private final zzkf zzul;
    private long zzum;

    public zzkm(zzkf zzkfVar, long j) {
        this.zzum = 0L;
        this.zzul = zzkfVar;
        this.zzum = 0L;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzkf
    public final long millis() {
        return this.zzul.millis() + this.zzum;
    }

    public final void zzn(long j) {
        this.zzum = j;
    }
}
