package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617Ja extends D5 implements InterfaceC0624Ka {
    @Override // com.google.android.gms.internal.ads.InterfaceC0624Ka
    public final InterfaceC1427pb C(String str) {
        InterfaceC1427pb c1382ob;
        Parcel N5 = N();
        N5.writeString(str);
        Parcel Y4 = Y(N5, 3);
        IBinder readStrongBinder = Y4.readStrongBinder();
        int i = BinderC1606tb.f15686l;
        if (readStrongBinder == null) {
            c1382ob = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c1382ob = queryLocalInterface instanceof InterfaceC1427pb ? (InterfaceC1427pb) queryLocalInterface : new C1382ob(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 0);
        }
        Y4.recycle();
        return c1382ob;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0624Ka
    public final InterfaceC0638Ma E(String str) {
        InterfaceC0638Ma c0631La;
        Parcel N5 = N();
        N5.writeString(str);
        Parcel Y4 = Y(N5, 1);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0631La = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c0631La = queryLocalInterface instanceof InterfaceC0638Ma ? (InterfaceC0638Ma) queryLocalInterface : new C0631La(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 0);
        }
        Y4.recycle();
        return c0631La;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0624Ka
    public final boolean H(String str) {
        Parcel N5 = N();
        N5.writeString(str);
        Parcel Y4 = Y(N5, 4);
        ClassLoader classLoader = F5.f8654a;
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0624Ka
    public final boolean W(String str) {
        Parcel N5 = N();
        N5.writeString(str);
        Parcel Y4 = Y(N5, 2);
        ClassLoader classLoader = F5.f8654a;
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }
}
