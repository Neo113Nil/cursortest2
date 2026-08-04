package com.google.android.gms.internal.ads;

import J2.j;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import p105o3.c;
import p105o3.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzbhf extends d {
    public zzbhf() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // p105o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbfq ? (zzbfq) iInterfaceQueryLocalInterface : new zzbfo(iBinder);
    }

    public final zzbfn zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderZze = ((zzbfq) getRemoteCreatorInstance(context)).zze(new p105o3.b(context), new p105o3.b(frameLayout), new p105o3.b(frameLayout2), 250930000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface : new zzbfl(iBinderZze);
        } catch (RemoteException e7) {
            e = e7;
            j.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (c e8) {
            e = e8;
            j.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
