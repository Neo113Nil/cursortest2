package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1795xk extends E5 implements InterfaceC0755aa {
    @Override // com.google.android.gms.internal.ads.InterfaceC0755aa
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            F5.b(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0755aa
    public final void x(int i) {
    }
}
