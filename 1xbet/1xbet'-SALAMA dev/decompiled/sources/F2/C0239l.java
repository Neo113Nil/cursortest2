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

/* JADX INFO: renamed from: F2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0239l extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbok f2695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0247p f2696e;

    public C0239l(C0247p c0247p, Context context, String str, zzbok zzbokVar) {
        this.f2693b = context;
        this.f2694c = str;
        this.f2695d = zzbokVar;
        this.f2696e = c0247p;
    }

    @Override // F2.r
    public final Object a() {
        C0247p.b(this.f2693b, "native_ad");
        return new a1();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.j0(new p105o3.b(this.f2693b), this.f2694c, this.f2695d, 250930000);
    }

    @Override // F2.r
    public final Object c() {
        J j;
        Context context = this.f2693b;
        zzbby.zza(context);
        boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue();
        zzbok zzbokVar = this.f2695d;
        String str = this.f2694c;
        C0247p c0247p = this.f2696e;
        if (!zBooleanValue) {
            Y0 y4 = (Y0) c0247p.f2707b;
            try {
                p105o3.b bVar = new p105o3.b(context);
                J j3 = (J) y4.getRemoteCreatorInstance(context);
                Parcel parcelZza = j3.zza();
                zzaxp.zzf(parcelZza, bVar);
                parcelZza.writeString(str);
                zzaxp.zzf(parcelZza, zzbokVar);
                parcelZza.writeInt(250930000);
                Parcel parcelZzcZ = j3.zzcZ(1, parcelZza);
                IBinder strongBinder = parcelZzcZ.readStrongBinder();
                parcelZzcZ.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new G(strongBinder);
            } catch (RemoteException e7) {
                e = e7;
                J2.j.h("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (p105o3.c e8) {
                e = e8;
                J2.j.h("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            p105o3.b bVar2 = new p105o3.b(context);
            try {
                IBinder iBinderB = Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    j = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    j = iInterfaceQueryLocalInterface2 instanceof J ? (J) iInterfaceQueryLocalInterface2 : new J(iBinderB);
                }
                Parcel parcelZza2 = j.zza();
                zzaxp.zzf(parcelZza2, bVar2);
                parcelZza2.writeString(str);
                zzaxp.zzf(parcelZza2, zzbokVar);
                parcelZza2.writeInt(250930000);
                Parcel parcelZzcZ2 = j.zzcZ(1, parcelZza2);
                IBinder strongBinder2 = parcelZzcZ2.readStrongBinder();
                parcelZzcZ2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof I ? (I) iInterfaceQueryLocalInterface3 : new G(strongBinder2);
            } catch (Exception e9) {
                throw new J2.l(e9);
            }
        } catch (J2.l e10) {
            e = e10;
            zzbtn zzbtnVarZza = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza;
            zzbtnVarZza.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (RemoteException e11) {
            e = e11;
            zzbtn zzbtnVarZza2 = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza2;
            zzbtnVarZza2.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzbtn zzbtnVarZza3 = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza3;
            zzbtnVarZza3.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
