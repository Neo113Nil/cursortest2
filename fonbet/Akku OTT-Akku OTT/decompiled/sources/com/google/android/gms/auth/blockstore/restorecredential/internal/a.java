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
public abstract class a extends zzb {
    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        boolean zzd = zzc.zzd(parcel);
        enforceNoDataAvail(parcel);
        Intrinsics.checkNotNullParameter(status, "status");
        C0848w.a(status, Boolean.valueOf(zzd), ((i) this).a);
        return true;
    }
}
