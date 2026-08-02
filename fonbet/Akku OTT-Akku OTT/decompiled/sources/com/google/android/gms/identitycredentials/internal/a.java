package com.google.android.gms.identitycredentials.internal;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0848w;
import com.google.android.gms.identitycredentials.l;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a extends zzb {
    @Override // com.google.android.gms.internal.identity_credentials.zzb
    public final boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            l lVar = (l) zzc.zza(parcel, l.CREATOR);
            enforceNoDataAvail(parcel);
            Intrinsics.checkNotNullParameter(status, "status");
            C0848w.a(status, lVar, ((e) this).a);
            return true;
        }
        if (i == 2) {
            Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
            enforceNoDataAvail(parcel);
            Intrinsics.checkNotNullParameter(status2, "status");
            throw new UnsupportedOperationException();
        }
        if (i == 3) {
            Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
            enforceNoDataAvail(parcel);
            Intrinsics.checkNotNullParameter(status3, "status");
            throw new UnsupportedOperationException();
        }
        if (i == 4) {
            Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
            enforceNoDataAvail(parcel);
            Intrinsics.checkNotNullParameter(status4, "status");
            throw new UnsupportedOperationException();
        }
        if (i != 5) {
            return false;
        }
        Status status5 = (Status) zzc.zza(parcel, Status.CREATOR);
        enforceNoDataAvail(parcel);
        Intrinsics.checkNotNullParameter(status5, "status");
        throw new UnsupportedOperationException();
    }
}
