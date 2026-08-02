package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class Z9 extends D5 implements InterfaceC0755aa {
    @Override // com.google.android.gms.internal.ads.InterfaceC0755aa
    public final void c() {
        d1(N(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0755aa
    public final void x(int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        d1(N5, 2);
    }
}
