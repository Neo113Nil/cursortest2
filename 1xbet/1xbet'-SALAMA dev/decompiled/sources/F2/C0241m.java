package F2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtn;

/* JADX INFO: renamed from: F2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0241m extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbok f2698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0247p f2699d;

    public C0241m(C0247p c0247p, Context context, zzbok zzbokVar) {
        this.f2697b = context;
        this.f2698c = zzbokVar;
        this.f2699d = c0247p;
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object a() {
        C0247p.b(this.f2697b, "ads_preloader");
        return null;
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        p105o3.b bVar = new p105o3.b(this.f2697b);
        zzbok zzbokVar = this.f2698c;
        V vN0 = interfaceC0220b0.n0(bVar, zzbokVar, 250930000);
        vN0.zzh(zzbokVar);
        return vN0;
    }

    @Override // F2.r
    public final Object c() {
        V t7;
        W w7;
        Context context = this.f2697b;
        p105o3.b bVar = new p105o3.b(context);
        zzbby.zza(context);
        boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue();
        zzbok zzbokVar = this.f2698c;
        C0247p c0247p = this.f2699d;
        if (zBooleanValue) {
            try {
                try {
                    IBinder iBinderB = Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                    if (iBinderB == null) {
                        w7 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                        w7 = iInterfaceQueryLocalInterface instanceof W ? (W) iInterfaceQueryLocalInterface : new W(iBinderB);
                    }
                    Parcel parcelZza = w7.zza();
                    zzaxp.zzf(parcelZza, bVar);
                    zzaxp.zzf(parcelZza, zzbokVar);
                    parcelZza.writeInt(250930000);
                    Parcel parcelZzcZ = w7.zzcZ(1, parcelZza);
                    IBinder strongBinder = parcelZzcZ.readStrongBinder();
                    parcelZzcZ.recycle();
                    if (strongBinder == null) {
                        t7 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                        t7 = iInterfaceQueryLocalInterface2 instanceof V ? (V) iInterfaceQueryLocalInterface2 : new T(strongBinder);
                    }
                    t7.zzh(zzbokVar);
                } catch (Exception e7) {
                    throw new J2.l(e7);
                }
            } catch (J2.l e8) {
                e = e8;
                zzbtn zzbtnVarZza = zzbtl.zza(context);
                c0247p.f2711f = zzbtnVarZza;
                zzbtnVarZza.zzh(e, "ClientApiBroker.getAdPreloader");
                return null;
            } catch (RemoteException e9) {
                e = e9;
                zzbtn zzbtnVarZza2 = zzbtl.zza(context);
                c0247p.f2711f = zzbtnVarZza2;
                zzbtnVarZza2.zzh(e, "ClientApiBroker.getAdPreloader");
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                zzbtn zzbtnVarZza3 = zzbtl.zza(context);
                c0247p.f2711f = zzbtnVarZza3;
                zzbtnVarZza3.zzh(e, "ClientApiBroker.getAdPreloader");
                return null;
            }
        } else {
            Y0 y4 = (Y0) c0247p.f2712g;
            try {
                p105o3.b bVar2 = new p105o3.b(context);
                W w8 = (W) y4.getRemoteCreatorInstance(context);
                Parcel parcelZza2 = w8.zza();
                zzaxp.zzf(parcelZza2, bVar2);
                zzaxp.zzf(parcelZza2, zzbokVar);
                parcelZza2.writeInt(250930000);
                Parcel parcelZzcZ2 = w8.zzcZ(1, parcelZza2);
                IBinder strongBinder2 = parcelZzcZ2.readStrongBinder();
                parcelZzcZ2.recycle();
                if (strongBinder2 == null) {
                    t7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    t7 = iInterfaceQueryLocalInterface3 instanceof V ? (V) iInterfaceQueryLocalInterface3 : new T(strongBinder2);
                }
                t7.zzh(zzbokVar);
            } catch (RemoteException e11) {
                e = e11;
                J2.j.h("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (p105o3.c e12) {
                e = e12;
                J2.j.h("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        return t7;
    }
}
