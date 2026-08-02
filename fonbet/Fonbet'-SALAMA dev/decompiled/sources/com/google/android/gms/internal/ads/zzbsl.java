package com.google.android.gms.internal.ads;

import J2.j;
import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import o3.BinderC1507b;
import o3.C1508c;
import o3.d;

/* loaded from: classes.dex */
public final class zzbsl extends d {
    public zzbsl() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbsr ? (zzbsr) queryLocalInterface : new zzbsp(iBinder);
    }

    public final zzbso zza(Activity activity) {
        try {
            IBinder zze = ((zzbsr) getRemoteCreatorInstance(activity)).zze(new BinderC1507b(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbso ? (zzbso) queryLocalInterface : new zzbsm(zze);
        } catch (RemoteException e7) {
            j.h("Could not create remote AdOverlay.", e7);
            return null;
        } catch (C1508c e8) {
            j.h("Could not create remote AdOverlay.", e8);
            return null;
        }
    }
}
