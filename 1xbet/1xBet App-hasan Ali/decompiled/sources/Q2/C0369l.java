package Q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0846cc;
import s3.BinderC2361b;
import s3.C2362c;

/* renamed from: Q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369l extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0375o f5035c;

    public C0369l(C0375o c0375o, Context context) {
        this.f5034b = context;
        this.f5035c = c0375o;
    }

    @Override // Q2.AbstractC0377p
    public final Object a() {
        C0375o.U(this.f5034b, "mobile_ads_settings");
        return new N0();
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.E0(new BinderC2361b(this.f5034b), 244410000);
    }

    @Override // Q2.AbstractC0377p
    public final Object c() {
        C0356e0 c0356e0;
        Context context = this.f5034b;
        F7.a(context);
        boolean booleanValue = ((Boolean) r.f5053d.f5056c.a(F7.la)).booleanValue();
        C0375o c0375o = this.f5035c;
        if (!booleanValue) {
            J0 j02 = (J0) c0375o.f5044n;
            try {
                BinderC2361b binderC2361b = new BinderC2361b(context);
                C0356e0 c0356e02 = (C0356e0) j02.d(context);
                Parcel N5 = c0356e02.N();
                F5.e(N5, binderC2361b);
                N5.writeInt(244410000);
                Parcel Y4 = c0356e02.Y(N5, 1);
                IBinder readStrongBinder = Y4.readStrongBinder();
                Y4.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof InterfaceC0352c0 ? (InterfaceC0352c0) queryLocalInterface : new C0348a0(readStrongBinder);
            } catch (RemoteException e3) {
                e = e3;
                U2.j.j("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (C2362c e5) {
                e = e5;
                U2.j.j("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            BinderC2361b binderC2361b2 = new BinderC2361b(context);
            try {
                IBinder b3 = U2.j.b(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (b3 == null) {
                    c0356e0 = null;
                } else {
                    IInterface queryLocalInterface2 = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c0356e0 = queryLocalInterface2 instanceof C0356e0 ? (C0356e0) queryLocalInterface2 : new C0356e0(b3);
                }
                Parcel N6 = c0356e0.N();
                F5.e(N6, binderC2361b2);
                N6.writeInt(244410000);
                Parcel Y5 = c0356e0.Y(N6, 1);
                IBinder readStrongBinder2 = Y5.readStrongBinder();
                Y5.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface3 instanceof InterfaceC0352c0 ? (InterfaceC0352c0) queryLocalInterface3 : new C0348a0(readStrongBinder2);
            } catch (Exception e6) {
                throw new U2.k(e6);
            }
        } catch (U2.k e7) {
            e = e7;
            InterfaceC0846cc a5 = C0802bc.a(context);
            c0375o.getClass();
            a5.b("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (RemoteException e8) {
            e = e8;
            InterfaceC0846cc a52 = C0802bc.a(context);
            c0375o.getClass();
            a52.b("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e9) {
            e = e9;
            InterfaceC0846cc a522 = C0802bc.a(context);
            c0375o.getClass();
            a522.b("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }
}
