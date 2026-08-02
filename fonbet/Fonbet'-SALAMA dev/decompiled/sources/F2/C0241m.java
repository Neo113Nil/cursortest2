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

/* renamed from: F2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241m extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbok f2698c;

    /* renamed from: d, reason: collision with root package name */
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
        BinderC1507b binderC1507b = new BinderC1507b(this.f2697b);
        zzbok zzbokVar = this.f2698c;
        V n02 = interfaceC0220b0.n0(binderC1507b, zzbokVar, 250930000);
        n02.zzh(zzbokVar);
        return n02;
    }

    @Override // F2.r
    public final Object c() {
        V t7;
        W w7;
        Context context = this.f2697b;
        BinderC1507b binderC1507b = new BinderC1507b(context);
        zzbby.zza(context);
        boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue();
        zzbok zzbokVar = this.f2698c;
        C0247p c0247p = this.f2699d;
        if (booleanValue) {
            try {
                try {
                    IBinder b7 = Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                    if (b7 == null) {
                        w7 = null;
                    } else {
                        IInterface queryLocalInterface = b7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                        w7 = queryLocalInterface instanceof W ? (W) queryLocalInterface : new W(b7);
                    }
                    Parcel zza = w7.zza();
                    zzaxp.zzf(zza, binderC1507b);
                    zzaxp.zzf(zza, zzbokVar);
                    zza.writeInt(250930000);
                    Parcel zzcZ = w7.zzcZ(1, zza);
                    IBinder readStrongBinder = zzcZ.readStrongBinder();
                    zzcZ.recycle();
                    if (readStrongBinder == null) {
                        t7 = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                        t7 = queryLocalInterface2 instanceof V ? (V) queryLocalInterface2 : new T(readStrongBinder);
                    }
                    t7.zzh(zzbokVar);
                } catch (Exception e7) {
                    throw new J2.l(e7);
                }
            } catch (J2.l e8) {
                e = e8;
                zzbtn zza2 = zzbtl.zza(context);
                c0247p.f2711f = zza2;
                zza2.zzh(e, "ClientApiBroker.getAdPreloader");
                return null;
            } catch (RemoteException e9) {
                e = e9;
                zzbtn zza22 = zzbtl.zza(context);
                c0247p.f2711f = zza22;
                zza22.zzh(e, "ClientApiBroker.getAdPreloader");
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                zzbtn zza222 = zzbtl.zza(context);
                c0247p.f2711f = zza222;
                zza222.zzh(e, "ClientApiBroker.getAdPreloader");
                return null;
            }
        } else {
            Y0 y02 = (Y0) c0247p.f2712g;
            try {
                BinderC1507b binderC1507b2 = new BinderC1507b(context);
                W w8 = (W) y02.getRemoteCreatorInstance(context);
                Parcel zza3 = w8.zza();
                zzaxp.zzf(zza3, binderC1507b2);
                zzaxp.zzf(zza3, zzbokVar);
                zza3.writeInt(250930000);
                Parcel zzcZ2 = w8.zzcZ(1, zza3);
                IBinder readStrongBinder2 = zzcZ2.readStrongBinder();
                zzcZ2.recycle();
                if (readStrongBinder2 == null) {
                    t7 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    t7 = queryLocalInterface3 instanceof V ? (V) queryLocalInterface3 : new T(readStrongBinder2);
                }
                t7.zzh(zzbokVar);
            } catch (RemoteException e11) {
                e = e11;
                J2.j.h("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (C1508c e12) {
                e = e12;
                J2.j.h("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        return t7;
    }
}
