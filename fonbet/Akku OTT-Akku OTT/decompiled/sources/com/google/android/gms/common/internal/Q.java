package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes4.dex */
public abstract class Q extends zzb {
    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            b0 b0Var = (b0) this;
            C0875q.h(b0Var.a, "onPostInitComplete can be called only once per call to getRemoteService");
            b0Var.a.onPostInitHandler(readInt, readStrongBinder, bundle, b0Var.b);
            b0Var.a = null;
        } else if (i == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            f0 f0Var = (f0) zzc.zza(parcel, f0.CREATOR);
            zzc.zzb(parcel);
            b0 b0Var2 = (b0) this;
            AbstractC0861c abstractC0861c = b0Var2.a;
            C0875q.h(abstractC0861c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C0875q.g(f0Var);
            AbstractC0861c.zzj(abstractC0861c, f0Var);
            Bundle bundle2 = f0Var.a;
            C0875q.h(b0Var2.a, "onPostInitComplete can be called only once per call to getRemoteService");
            b0Var2.a.onPostInitHandler(readInt2, readStrongBinder2, bundle2, b0Var2.b);
            b0Var2.a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
