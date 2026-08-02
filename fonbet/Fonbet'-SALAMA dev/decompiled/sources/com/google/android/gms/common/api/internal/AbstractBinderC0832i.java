package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0832i extends zab implements InterfaceC0833j {
    public AbstractBinderC0832i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public static InterfaceC0833j asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        return queryLocalInterface instanceof InterfaceC0833j ? (InterfaceC0833j) queryLocalInterface : new H(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zac.zaa(parcel, Status.CREATOR);
        zac.zab(parcel);
        onResult(status);
        return true;
    }
}
