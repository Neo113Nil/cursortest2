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
import o3.BinderC1507b;
import o3.C1508c;

/* renamed from: F2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239l extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2694c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbok f2695d;

    /* renamed from: e, reason: collision with root package name */
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
        return interfaceC0220b0.j0(new BinderC1507b(this.f2693b), this.f2694c, this.f2695d, 250930000);
    }

    @Override // F2.r
    public final Object c() {
        J j;
        Context context = this.f2693b;
        zzbby.zza(context);
        boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue();
        zzbok zzbokVar = this.f2695d;
        String str = this.f2694c;
        C0247p c0247p = this.f2696e;
        if (!booleanValue) {
            Y0 y02 = (Y0) c0247p.f2707b;
            try {
                BinderC1507b binderC1507b = new BinderC1507b(context);
                J j3 = (J) y02.getRemoteCreatorInstance(context);
                Parcel zza = j3.zza();
                zzaxp.zzf(zza, binderC1507b);
                zza.writeString(str);
                zzaxp.zzf(zza, zzbokVar);
                zza.writeInt(250930000);
                Parcel zzcZ = j3.zzcZ(1, zza);
                IBinder readStrongBinder = zzcZ.readStrongBinder();
                zzcZ.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof I ? (I) queryLocalInterface : new G(readStrongBinder);
            } catch (RemoteException e7) {
                e = e7;
                J2.j.h("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (C1508c e8) {
                e = e8;
                J2.j.h("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            BinderC1507b binderC1507b2 = new BinderC1507b(context);
            try {
                IBinder b7 = Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (b7 == null) {
                    j = null;
                } else {
                    IInterface queryLocalInterface2 = b7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    j = queryLocalInterface2 instanceof J ? (J) queryLocalInterface2 : new J(b7);
                }
                Parcel zza2 = j.zza();
                zzaxp.zzf(zza2, binderC1507b2);
                zza2.writeString(str);
                zzaxp.zzf(zza2, zzbokVar);
                zza2.writeInt(250930000);
                Parcel zzcZ2 = j.zzcZ(1, zza2);
                IBinder readStrongBinder2 = zzcZ2.readStrongBinder();
                zzcZ2.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface3 instanceof I ? (I) queryLocalInterface3 : new G(readStrongBinder2);
            } catch (Exception e9) {
                throw new J2.l(e9);
            }
        } catch (J2.l e10) {
            e = e10;
            zzbtn zza3 = zzbtl.zza(context);
            c0247p.f2711f = zza3;
            zza3.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (RemoteException e11) {
            e = e11;
            zzbtn zza32 = zzbtl.zza(context);
            c0247p.f2711f = zza32;
            zza32.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzbtn zza322 = zzbtl.zza(context);
            c0247p.f2711f = zza322;
            zza322.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
