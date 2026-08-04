package com.google.android.gms.internal.ads;

import J2.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import p105o3.c;
import p105o3.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzbhg extends d {
    public zzbhg() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // p105o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(iBinder);
    }

    public final zzbft zza(View view, HashMap map, HashMap map2) {
        try {
            IBinder iBinderZze = ((zzbfw) getRemoteCreatorInstance(view.getContext())).zze(new p105o3.b(view), new p105o3.b(map), new p105o3.b(map2));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbft ? (zzbft) iInterfaceQueryLocalInterface : new zzbfr(iBinderZze);
        } catch (RemoteException e7) {
            e = e7;
            j.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (c e8) {
            e = e8;
            j.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
