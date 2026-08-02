package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0654Oc extends E5 implements InterfaceC0661Pc {
    public AbstractBinderC0654Oc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            f();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            F5.b(parcel);
            x(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
            F5.b(parcel);
            q(c0387u0);
        }
        parcel2.writeNoException();
        return true;
    }
}
