package com.google.android.gms.internal.ads;

import J2.j;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import o3.BinderC1507b;
import o3.C1508c;
import o3.d;

/* loaded from: classes.dex */
public final class zzbhf extends d {
    public zzbhf() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbfq ? (zzbfq) queryLocalInterface : new zzbfo(iBinder);
    }

    public final zzbfn zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zze = ((zzbfq) getRemoteCreatorInstance(context)).zze(new BinderC1507b(context), new BinderC1507b(frameLayout), new BinderC1507b(frameLayout2), 250930000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbfn ? (zzbfn) queryLocalInterface : new zzbfl(zze);
        } catch (RemoteException e7) {
            e = e7;
            j.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (C1508c e8) {
            e = e8;
            j.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
