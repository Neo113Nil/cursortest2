package com.google.android.gms.internal.ads;

import e1.k;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzgwi extends IOException {
    public zzgwi() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgwi(long j, long j3, int i7, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder j7 = k.j("Pos: ", ", limit: ", j);
        j7.append(j3);
        j7.append(", len: ");
        j7.append(i7);
    }

    public zzgwi(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
