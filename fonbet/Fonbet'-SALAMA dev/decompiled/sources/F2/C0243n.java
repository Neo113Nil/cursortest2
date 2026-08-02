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
import o3.BinderC1507b;
import o3.C1508c;

/* renamed from: F2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243n extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2700b;

    /* renamed from: c, reason: collision with root package name */
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
        return interfaceC0220b0.i(new BinderC1507b(this.f2700b), 250930000);
    }

    @Override // F2.r
    public final Object c() {
        C0240l0 c0240l0;
        Context context = this.f2700b;
        zzbby.zza(context);
        boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue();
        C0247p c0247p = this.f2701c;
        if (!booleanValue) {
            Y0 y02 = (Y0) c0247p.f2708c;
            try {
                BinderC1507b binderC1507b = new BinderC1507b(context);
                C0240l0 c0240l02 = (C0240l0) y02.getRemoteCreatorInstance(context);
                Parcel zza = c0240l02.zza();
                zzaxp.zzf(zza, binderC1507b);
                zza.writeInt(250930000);
                Parcel zzcZ = c0240l02.zzcZ(1, zza);
                IBinder readStrongBinder = zzcZ.readStrongBinder();
                zzcZ.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof InterfaceC0238k0 ? (InterfaceC0238k0) queryLocalInterface : new C0234i0(readStrongBinder);
            } catch (RemoteException e7) {
                e = e7;
                J2.j.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (C1508c e8) {
                e = e8;
                J2.j.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            BinderC1507b binderC1507b2 = new BinderC1507b(context);
            try {
                IBinder b7 = Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (b7 == null) {
                    c0240l0 = null;
                } else {
                    IInterface queryLocalInterface2 = b7.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c0240l0 = queryLocalInterface2 instanceof C0240l0 ? (C0240l0) queryLocalInterface2 : new C0240l0(b7);
                }
                Parcel zza2 = c0240l0.zza();
                zzaxp.zzf(zza2, binderC1507b2);
                zza2.writeInt(250930000);
                Parcel zzcZ2 = c0240l0.zzcZ(1, zza2);
                IBinder readStrongBinder2 = zzcZ2.readStrongBinder();
                zzcZ2.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface3 instanceof InterfaceC0238k0 ? (InterfaceC0238k0) queryLocalInterface3 : new C0234i0(readStrongBinder2);
            } catch (Exception e9) {
                throw new J2.l(e9);
            }
        } catch (J2.l e10) {
            e = e10;
            zzbtn zza3 = zzbtl.zza(context);
            c0247p.f2711f = zza3;
            zza3.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (RemoteException e11) {
            e = e11;
            zzbtn zza32 = zzbtl.zza(context);
            c0247p.f2711f = zza32;
            zza32.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzbtn zza322 = zzbtl.zza(context);
            c0247p.f2711f = zza322;
            zza322.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
