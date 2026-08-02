package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0848w;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c extends zzb {
    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        com.google.android.gms.auth.blockstore.restorecredential.i response = (com.google.android.gms.auth.blockstore.restorecredential.i) zzc.zza(parcel, com.google.android.gms.auth.blockstore.restorecredential.i.CREATOR);
        enforceNoDataAvail(parcel);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(response, "response");
        C0848w.a(status, response, ((k) this).a);
        return true;
    }
}
