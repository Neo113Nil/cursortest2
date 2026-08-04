package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class G extends zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0810f f11241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11242b;

    public G(AbstractC0810f abstractC0810f, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f11241a = abstractC0810f;
        this.f11242b = i7;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        int i9 = this.f11242b;
        if (i7 == 1) {
            int i10 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            D.j(this.f11241a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f11241a.onPostInitHandler(i10, strongBinder, bundle, i9);
            this.f11241a = null;
        } else if (i7 == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i7 != 3) {
                return false;
            }
            int i11 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) zzc.zza(parcel, zzk.CREATOR);
            zzc.zzb(parcel);
            AbstractC0810f abstractC0810f = this.f11241a;
            D.j(abstractC0810f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            D.i(zzkVar);
            AbstractC0810f.zzj(abstractC0810f, zzkVar);
            Bundle bundle2 = zzkVar.f11353a;
            D.j(this.f11241a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f11241a.onPostInitHandler(i11, strongBinder2, bundle2, i9);
            this.f11241a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
