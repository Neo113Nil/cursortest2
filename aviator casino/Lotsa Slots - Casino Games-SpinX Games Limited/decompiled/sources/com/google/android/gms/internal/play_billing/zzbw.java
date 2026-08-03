package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzbw extends java.io.IOException {
    zzbw() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzbw(java.lang.String str, java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.valueOf(str)), th);
    }

    zzbw(java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
