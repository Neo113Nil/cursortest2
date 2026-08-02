package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1474qd extends D5 implements InterfaceC1563sd {
    public C1474qd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1563sd
    public final void s3(InterfaceC2360a interfaceC2360a, C1743wd c1743wd, InterfaceC1429pd interfaceC1429pd) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, c1743wd);
        F5.e(N5, interfaceC1429pd);
        d1(N5, 1);
    }
}
