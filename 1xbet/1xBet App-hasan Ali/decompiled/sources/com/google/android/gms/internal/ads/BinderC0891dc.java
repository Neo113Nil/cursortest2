package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0891dc extends E5 {
    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        P2.o.f4767B.f4774g.i("FlagsAccessedBeforeInitialized", new C1650ua("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
