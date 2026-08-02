package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbcs extends java.io.IOException {
    zzbcs() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzbcs(long j, long j2, int i, java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, "Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Integer.valueOf(i)))), th);
    }

    zzbcs(java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
