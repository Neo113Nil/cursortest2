package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o3.BinderC1507b;
import p3.d;

/* loaded from: classes.dex */
public final class zzfoc {
    final zzfof zza;
    final boolean zzb;

    private zzfoc(zzfof zzfofVar) {
        this.zza = zzfofVar;
        this.zzb = zzfofVar != null;
    }

    public static zzfoc zzb(Context context, String str, String str2) {
        zzfof zzfodVar;
        try {
            try {
                try {
                    IBinder b7 = d.c(context, d.f15677b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b7 == null) {
                        zzfodVar = null;
                    } else {
                        IInterface queryLocalInterface = b7.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfodVar = queryLocalInterface instanceof zzfof ? (zzfof) queryLocalInterface : new zzfod(b7);
                    }
                    zzfodVar.zze(new BinderC1507b(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfoc(zzfodVar);
                } catch (Exception e7) {
                    throw new zzfne(e7);
                }
            } catch (RemoteException | zzfne | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfoc(new zzfog());
            }
        } catch (Exception e8) {
            throw new zzfne(e8);
        }
    }

    public static zzfoc zzc() {
        zzfog zzfogVar = new zzfog();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfoc(zzfogVar);
    }

    public final zzfoa zza(byte[] bArr) {
        return new zzfoa(this, bArr, null);
    }
}
