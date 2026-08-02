package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzats {
    private static final com.google.android.libraries.places.internal.zzats zza = new com.google.android.libraries.places.internal.zzats(com.google.android.libraries.places.internal.zzatq.PROCEED, null, null, null, null);
    private final com.google.android.libraries.places.internal.zzatq zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;

    static {
        new com.google.android.libraries.places.internal.zzats(com.google.android.libraries.places.internal.zzatq.DELAY_START, null, null, null, null);
    }

    private zzats(com.google.android.libraries.places.internal.zzatq zzatqVar, com.google.android.libraries.places.internal.zzatr zzatrVar, com.google.android.libraries.places.internal.zzatn zzatnVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        this.zzb = (com.google.android.libraries.places.internal.zzatq) com.google.common.base.Preconditions.checkNotNull(zzatqVar);
        this.zzc = listenableFuture;
    }

    public static com.google.android.libraries.places.internal.zzats zzb(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        com.google.common.base.Preconditions.checkNotNull(listenableFuture);
        return new com.google.android.libraries.places.internal.zzats(com.google.android.libraries.places.internal.zzatq.CONTINUE_AFTER, null, null, listenableFuture, null);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd() {
        com.google.common.base.Preconditions.checkState(this.zzb == com.google.android.libraries.places.internal.zzatq.CONTINUE_AFTER);
        return this.zzc;
    }

    public final com.google.android.libraries.places.internal.zzatq zzc() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzats zza() {
        return zza;
    }
}
