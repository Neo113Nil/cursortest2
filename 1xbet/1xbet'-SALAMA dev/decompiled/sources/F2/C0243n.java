package F2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtn;

/* JADX INFO: renamed from: F2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0243n extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0247p f2701c;

    public C0243n(C0247p c0247p, Context context) {
        this.f2700b = context;
        this.f2701c = c0247p;
    }

    @Override // F2.r
    public final Object a() {
        C0247p.b(this.f2700b, "mobile_ads_settings");
        return new c1();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.i(new p105o3.b(this.f2700b), 250930000);
    }

    @Override // F2.r
    public final Object c() {
        C0240l0 c0240l0;
        Context context = this.f2700b;
        zzbby.zza(context);
        boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue();
        C0247p c0247p = this.f2701c;
        if (!zBooleanValue) {
            Y0 y4 = (Y0) c0247p.f2708c;
            try {
                p105o3.b bVar = new p105o3.b(context);
                C0240l0 c0240l1 = (C0240l0) y4.getRemoteCreatorInstance(context);
                Parcel parcelZza = c0240l1.zza();
                zzaxp.zzf(parcelZza, bVar);
                parcelZza.writeInt(250930000);
                Parcel parcelZzcZ = c0240l1.zzcZ(1, parcelZza);
                IBinder strongBinder = parcelZzcZ.readStrongBinder();
                parcelZzcZ.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof InterfaceC0238k0 ? (InterfaceC0238k0) iInterfaceQueryLocalInterface : new C0234i0(strongBinder);
            } catch (RemoteException e7) {
                e = e7;
                J2.j.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (p105o3.c e8) {
                e = e8;
                J2.j.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            p105o3.b bVar2 = new p105o3.b(context);
            try {
                IBinder iBinderB = Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (iBinderB == null) {
                    c0240l0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c0240l0 = iInterfaceQueryLocalInterface2 instanceof C0240l0 ? (C0240l0) iInterfaceQueryLocalInterface2 : new C0240l0(iBinderB);
                }
                Parcel parcelZza2 = c0240l0.zza();
                zzaxp.zzf(parcelZza2, bVar2);
                parcelZza2.writeInt(250930000);
                Parcel parcelZzcZ2 = c0240l0.zzcZ(1, parcelZza2);
                IBinder strongBinder2 = parcelZzcZ2.readStrongBinder();
                parcelZzcZ2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface3 instanceof InterfaceC0238k0 ? (InterfaceC0238k0) iInterfaceQueryLocalInterface3 : new C0234i0(strongBinder2);
            } catch (Exception e9) {
                throw new J2.l(e9);
            }
        } catch (J2.l e10) {
            e = e10;
            zzbtn zzbtnVarZza = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza;
            zzbtnVarZza.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (RemoteException e11) {
            e = e11;
            zzbtn zzbtnVarZza2 = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza2;
            zzbtnVarZza2.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzbtn zzbtnVarZza3 = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza3;
            zzbtnVarZza3.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
