package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.tH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1604tH extends IOException {
    public C1604tH(Throwable th) {
        super(L1.a.n("Unexpected ", th.getClass().getSimpleName(), th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
    }
}
