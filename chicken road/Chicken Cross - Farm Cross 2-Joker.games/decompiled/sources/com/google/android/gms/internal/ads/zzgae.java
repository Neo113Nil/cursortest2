package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgae {
    final zzgah zza;
    final boolean zzb;

    private zzgae(zzgah zzgahVar) {
        this.zza = zzgahVar;
        this.zzb = zzgahVar != null;
    }

    public static zzgae zzb(Context context, String str, String str2) {
        zzgah zzgafVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    IBinder iBinder = instantiate;
                    if (instantiate == null) {
                        zzgafVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzgafVar = queryLocalInterface instanceof zzgah ? (zzgah) queryLocalInterface : new zzgaf(instantiate);
                    }
                    zzgah zzgahVar = zzgafVar;
                    zzgafVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzgae(zzgafVar);
                } catch (Exception e) {
                    throw new zzfzh(e);
                }
            } catch (Exception e2) {
                throw new zzfzh(e2);
            }
        } catch (RemoteException | zzfzh | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzgae(new zzgai());
        }
    }

    public static zzgae zzc() {
        zzgai zzgaiVar = new zzgai();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzgae(zzgaiVar);
    }

    public final zzgad zza(byte[] bArr) {
        return new zzgad(this, bArr, null);
    }
}
