package com.google.android.gms.internal.ads;

import J2.j;
import J2.k;
import J2.l;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzber {
    private final Context zza;

    public zzber(Context context) {
        this.zza = context;
    }

    public final void zza(zzbts zzbtsVar) {
        try {
            ((zzbes) Q0.a.h0(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new k() { // from class: com.google.android.gms.internal.ads.zzbeq
                @Override // J2.k
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof zzbes ? (zzbes) iInterfaceQueryLocalInterface : new zzbes(iBinder);
                }
            })).zze(zzbtsVar);
        } catch (l e7) {
            j.g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e7.getMessage())));
        } catch (RemoteException e8) {
            j.g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
