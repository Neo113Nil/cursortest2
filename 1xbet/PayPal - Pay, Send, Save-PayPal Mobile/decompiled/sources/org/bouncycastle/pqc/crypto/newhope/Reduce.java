package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
class Reduce {
    static short Camera2StreamConfigurationMap(short s) {
        int i = s & kotlin.UShort.MAX_VALUE;
        return (short) (i - (((i * 5) >>> 16) * 12289));
    }

    static short getHighResolutionOutputSizeshNQ4ISI(int i) {
        return (short) (((((i * 12287) & 262143) * 12289) + i) >>> 18);
    }

    Reduce() {
    }
}
