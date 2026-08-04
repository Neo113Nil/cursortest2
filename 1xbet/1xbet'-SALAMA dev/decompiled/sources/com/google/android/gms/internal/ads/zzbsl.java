package com.google.android.gms.internal.ads;

import J2.j;
import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p105o3.c;
import p105o3.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzbsl extends d {
    public zzbsl() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // p105o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzbsr ? (zzbsr) iInterfaceQueryLocalInterface : new zzbsp(iBinder);
    }

    public final zzbso zza(Activity activity) {
        try {
            IBinder iBinderZze = ((zzbsr) getRemoteCreatorInstance(activity)).zze(new p105o3.b(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzbso ? (zzbso) iInterfaceQueryLocalInterface : new zzbsm(iBinderZze);
        } catch (RemoteException e7) {
            j.h("Could not create remote AdOverlay.", e7);
            return null;
        } catch (c e8) {
            j.h("Could not create remote AdOverlay.", e8);
            return null;
        }
    }
}
