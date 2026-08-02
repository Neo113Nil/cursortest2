package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384od extends D5 implements InterfaceC1429pd {
    @Override // com.google.android.gms.internal.ads.InterfaceC1429pd
    public final void E(String str) {
        Parcel N5 = N();
        N5.writeString(str);
        d1(N5, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1429pd
    public final void s1(String str, String str2, Bundle bundle) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, bundle);
        d1(N5, 3);
    }
}
