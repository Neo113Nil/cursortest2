package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgzv extends RuntimeException {
    public zzgzv(zzgyr zzgyrVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgxv zza() {
        return new zzgxv(getMessage());
    }
}
