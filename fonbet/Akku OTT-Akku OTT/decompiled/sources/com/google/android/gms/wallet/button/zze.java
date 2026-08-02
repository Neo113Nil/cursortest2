package com.google.android.gms.wallet.button;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.media3.common.C0338w;
import com.google.android.gms.dynamic.a;

/* loaded from: classes4.dex */
public final class zze extends com.google.android.gms.internal.wallet.zza implements IInterface {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final a zzd(a aVar, ButtonOptions buttonOptions) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wallet.zzc.zzd(zza, aVar);
        com.google.android.gms.internal.wallet.zzc.zzc(zza, buttonOptions);
        return C0338w.a(zzb(1, zza));
    }
}
