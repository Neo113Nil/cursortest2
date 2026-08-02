package com.google.android.gms.internal.ads;

import J2.j;
import J2.k;
import J2.l;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class zzbwf {
    public static final zzbvt zza(Context context, String str, zzboo zzbooVar) {
        try {
            IBinder zze = ((zzbvx) Q0.a.h0(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new k() { // from class: com.google.android.gms.internal.ads.zzbwe
                @Override // J2.k
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzbvx ? (zzbvx) queryLocalInterface : new zzbvx(iBinder);
                }
            })).zze(new BinderC1507b(context), str, zzbooVar, 250930000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbvt ? (zzbvt) queryLocalInterface : new zzbvr(zze);
        } catch (l e7) {
            e = e7;
            j.i("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e8) {
            e = e8;
            j.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
