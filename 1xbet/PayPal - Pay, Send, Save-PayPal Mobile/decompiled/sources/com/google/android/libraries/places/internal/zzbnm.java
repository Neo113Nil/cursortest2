package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzbnm {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int zzr;
    private final byte[] zzs;

    zzbnm(int i) {
        this.zzr = i;
        this.zzs = java.lang.Integer.toString(i).getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    }

    public final com.google.android.libraries.places.internal.zzbnp zzb() {
        java.util.List list;
        list = com.google.android.libraries.places.internal.zzbnp.zzl;
        return (com.google.android.libraries.places.internal.zzbnp) list.get(this.zzr);
    }

    final /* synthetic */ byte[] zzc() {
        return this.zzs;
    }

    public final int zza() {
        return this.zzr;
    }
}
