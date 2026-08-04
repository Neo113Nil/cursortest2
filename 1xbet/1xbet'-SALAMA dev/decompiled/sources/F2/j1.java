package F2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtn;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends p105o3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzbtn f2686a;

    public final M a(Context context, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        N n2;
        zzbby.zza(context);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue()) {
            try {
                IBinder iBinderZ = ((N) getRemoteCreatorInstance(context)).Z(new p105o3.b(context), zzrVar, str, zzbooVar, i7);
                if (iBinderZ == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZ.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new K(iBinderZ);
            } catch (RemoteException e7) {
                e = e7;
                J2.j.c("Could not create remote AdManager.", e);
                return null;
            } catch (p105o3.c e8) {
                e = e8;
                J2.j.c("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            p105o3.b bVar = new p105o3.b(context);
            try {
                IBinder iBinderB = Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                if (iBinderB == null) {
                    n2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    n2 = iInterfaceQueryLocalInterface2 instanceof N ? (N) iInterfaceQueryLocalInterface2 : new N(iBinderB);
                }
                IBinder iBinderZ2 = n2.Z(bVar, zzrVar, str, zzbooVar, i7);
                if (iBinderZ2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinderZ2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface3 instanceof M ? (M) iInterfaceQueryLocalInterface3 : new K(iBinderZ2);
            } catch (Exception e9) {
                throw new J2.l(e9);
            }
        } catch (J2.l e10) {
            e = e10;
            zzbtn zzbtnVarZza = zzbtl.zza(context);
            this.f2686a = zzbtnVarZza;
            zzbtnVarZza.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            J2.j.i("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e11) {
            e = e11;
            zzbtn zzbtnVarZza2 = zzbtl.zza(context);
            this.f2686a = zzbtnVarZza2;
            zzbtnVarZza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            J2.j.i("#007 Could not call remote method.", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzbtn zzbtnVarZza3 = zzbtl.zza(context);
            this.f2686a = zzbtnVarZza3;
            zzbtnVarZza3.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            J2.j.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // p105o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof N ? (N) iInterfaceQueryLocalInterface : new N(iBinder);
    }
}
