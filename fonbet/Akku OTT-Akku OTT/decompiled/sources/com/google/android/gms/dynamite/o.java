package com.google.android.gms.dynamite;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.media3.common.C0338w;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes4.dex */
public final class o extends zza {
    public final com.google.android.gms.dynamic.a C(com.google.android.gms.dynamic.b bVar, String str, int i, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i);
        zzc.zze(zza, bVar2);
        return C0338w.a(zzB(2, zza));
    }

    public final com.google.android.gms.dynamic.a D(com.google.android.gms.dynamic.b bVar, String str, int i, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i);
        zzc.zze(zza, bVar2);
        return C0338w.a(zzB(3, zza));
    }
}
