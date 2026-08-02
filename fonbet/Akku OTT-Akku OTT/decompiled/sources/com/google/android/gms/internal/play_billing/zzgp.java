package com.google.android.gms.internal.play_billing;

import androidx.compose.runtime.snapshots.m;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzgp extends IOException {
    public zzgp() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgp(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder b = m.b(j, "Pos: ", ", limit: ");
        b.append(j2);
        b.append(", len: ");
        b.append(i);
    }

    public zzgp(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
