package com.google.android.gms.common.internal;

import com.google.android.gms.common.C0852b;

/* loaded from: classes4.dex */
public final class X extends Exception {
    public final C0852b a;

    public X(C0852b c0852b) {
        C0875q.b(c0852b.l(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = c0852b;
    }
}
