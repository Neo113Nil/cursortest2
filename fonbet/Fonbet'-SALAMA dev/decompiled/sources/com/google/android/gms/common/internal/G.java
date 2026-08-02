package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class G extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0854f f11241a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11242b;

    public G(AbstractC0854f abstractC0854f, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f11241a = abstractC0854f;
        this.f11242b = i7;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        int i9 = this.f11242b;
        if (i7 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            D.j(this.f11241a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f11241a.onPostInitHandler(readInt, readStrongBinder, bundle, i9);
            this.f11241a = null;
        } else if (i7 == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i7 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) zzc.zza(parcel, zzk.CREATOR);
            zzc.zzb(parcel);
            AbstractC0854f abstractC0854f = this.f11241a;
            D.j(abstractC0854f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            D.i(zzkVar);
            AbstractC0854f.zzj(abstractC0854f, zzkVar);
            Bundle bundle2 = zzkVar.f11353a;
            D.j(this.f11241a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f11241a.onPostInitHandler(readInt2, readStrongBinder2, bundle2, i9);
            this.f11241a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
