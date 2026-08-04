package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgwi extends IOException {
    public zzgwi() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgwi(long j, long j3, int i7, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbJ = k.j("Pos: ", ", limit: ", j);
        sbJ.append(j3);
        sbJ.append(", len: ");
        sbJ.append(i7);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbJ.toString()), th);
    }

    public zzgwi(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
