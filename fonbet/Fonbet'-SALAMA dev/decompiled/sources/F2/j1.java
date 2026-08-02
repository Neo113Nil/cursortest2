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
import o3.BinderC1507b;
import o3.C1508c;

/* loaded from: classes.dex */
public final class j1 extends o3.d {

    /* renamed from: a, reason: collision with root package name */
    public zzbtn f2686a;

    public final M a(Context context, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        N n2;
        zzbby.zza(context);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue()) {
            try {
                IBinder Z6 = ((N) getRemoteCreatorInstance(context)).Z(new BinderC1507b(context), zzrVar, str, zzbooVar, i7);
                if (Z6 == null) {
                    return null;
                }
                IInterface queryLocalInterface = Z6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof M ? (M) queryLocalInterface : new K(Z6);
            } catch (RemoteException e7) {
                e = e7;
                J2.j.c("Could not create remote AdManager.", e);
                return null;
            } catch (C1508c e8) {
                e = e8;
                J2.j.c("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            BinderC1507b binderC1507b = new BinderC1507b(context);
            try {
                IBinder b7 = Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                if (b7 == null) {
                    n2 = null;
                } else {
                    IInterface queryLocalInterface2 = b7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    n2 = queryLocalInterface2 instanceof N ? (N) queryLocalInterface2 : new N(b7);
                }
                IBinder Z7 = n2.Z(binderC1507b, zzrVar, str, zzbooVar, i7);
                if (Z7 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = Z7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface3 instanceof M ? (M) queryLocalInterface3 : new K(Z7);
            } catch (Exception e9) {
                throw new J2.l(e9);
            }
        } catch (J2.l e10) {
            e = e10;
            zzbtn zza = zzbtl.zza(context);
            this.f2686a = zza;
            zza.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            J2.j.i("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e11) {
            e = e11;
            zzbtn zza2 = zzbtl.zza(context);
            this.f2686a = zza2;
            zza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            J2.j.i("#007 Could not call remote method.", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzbtn zza22 = zzbtl.zza(context);
            this.f2686a = zza22;
            zza22.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            J2.j.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof N ? (N) queryLocalInterface : new N(iBinder);
    }
}
