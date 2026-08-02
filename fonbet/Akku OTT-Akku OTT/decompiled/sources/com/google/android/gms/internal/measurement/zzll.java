package com.google.android.gms.internal.measurement;

import androidx.compose.runtime.snapshots.m;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzll extends IOException {
    public zzll() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzll(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder b = m.b(j, "Pos: ", ", limit: ");
        b.append(j2);
        b.append(", len: ");
        b.append(i);
    }

    public zzll(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
