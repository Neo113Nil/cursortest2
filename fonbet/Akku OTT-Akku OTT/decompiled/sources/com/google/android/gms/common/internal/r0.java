package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.media3.common.C0338w;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes4.dex */
public final class r0 extends zza implements P {
    @Override // com.google.android.gms.common.internal.P
    public final int zzc() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.P
    public final com.google.android.gms.dynamic.a zzd() throws RemoteException {
        return C0338w.a(zzB(1, zza()));
    }
}
