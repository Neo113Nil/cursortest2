package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class D8 extends E5 implements E8 {
    public static E8 u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof E8 ? (E8) queryLocalInterface : new C8(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((BinderC1775x8) this).f16231k);
            return true;
        }
        if (i != 3) {
            return false;
        }
        ArrayList arrayList = ((BinderC1775x8) this).f16233m;
        parcel2.writeNoException();
        parcel2.writeList(arrayList);
        return true;
    }
}
