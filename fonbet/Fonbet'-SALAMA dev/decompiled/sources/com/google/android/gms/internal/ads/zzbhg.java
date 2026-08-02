package com.google.android.gms.internal.ads;

import J2.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import o3.BinderC1507b;
import o3.C1508c;
import o3.d;

/* loaded from: classes.dex */
public final class zzbhg extends d {
    public zzbhg() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbfw ? (zzbfw) queryLocalInterface : new zzbfu(iBinder);
    }

    public final zzbft zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzbfw) getRemoteCreatorInstance(view.getContext())).zze(new BinderC1507b(view), new BinderC1507b(hashMap), new BinderC1507b(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbft ? (zzbft) queryLocalInterface : new zzbfr(zze);
        } catch (RemoteException e7) {
            e = e7;
            j.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (C1508c e8) {
            e = e8;
            j.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
