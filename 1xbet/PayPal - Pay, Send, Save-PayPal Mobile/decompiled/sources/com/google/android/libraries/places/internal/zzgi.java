package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zzgi {
    private final com.google.android.libraries.places.internal.zzmq zza;

    protected final com.google.android.gms.tasks.CancellationToken zzb() {
        return this.zza.getCancellationToken();
    }

    protected abstract java.util.Map zzc();

    protected abstract java.lang.String zzd();

    protected final com.google.android.libraries.places.internal.zzmq zza() {
        return this.zza;
    }

    protected zzgi(com.google.android.libraries.places.internal.zzmq zzmqVar) {
        this.zza = zzmqVar;
    }
}
