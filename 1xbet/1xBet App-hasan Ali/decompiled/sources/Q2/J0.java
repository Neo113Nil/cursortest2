package Q2;

import A0.AbstractC0015c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0639Mb;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;
import com.google.android.gms.internal.ads.InterfaceC0653Ob;
import com.google.android.gms.internal.ads.O8;
import com.google.android.gms.internal.ads.Q8;
import s3.BinderC2361b;
import s3.C2362c;

/* loaded from: classes.dex */
public final class J0 extends AbstractC0015c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4928c;

    public J0(String str, int i) {
        this.f4928c = i;
        this.f474a = str;
    }

    @Override // A0.AbstractC0015c
    public final /* synthetic */ Object c(IBinder iBinder) {
        switch (this.f4928c) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return queryLocalInterface instanceof C0356e0 ? (C0356e0) queryLocalInterface : new C0356e0(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return queryLocalInterface2 instanceof H ? (H) queryLocalInterface2 : new H(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return queryLocalInterface3 instanceof L ? (L) queryLocalInterface3 : new L(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return queryLocalInterface4 instanceof Q8 ? (Q8) queryLocalInterface4 : new O8(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return queryLocalInterface5 instanceof InterfaceC0653Ob ? (InterfaceC0653Ob) queryLocalInterface5 : new C0639Mb(iBinder);
        }
    }

    public K q(Context context, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        L l5;
        a1 a1Var2;
        String str2;
        InterfaceC0624Ka interfaceC0624Ka2;
        int i5;
        F7.a(context);
        if (((Boolean) r.f5053d.f5056c.a(F7.la)).booleanValue()) {
            try {
                BinderC2361b binderC2361b = new BinderC2361b(context);
                try {
                    IBinder b3 = U2.j.b(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (b3 == null) {
                        a1Var2 = a1Var;
                        str2 = str;
                        interfaceC0624Ka2 = interfaceC0624Ka;
                        i5 = i;
                        l5 = null;
                    } else {
                        IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        l5 = queryLocalInterface instanceof L ? (L) queryLocalInterface : new L(b3);
                        a1Var2 = a1Var;
                        str2 = str;
                        interfaceC0624Ka2 = interfaceC0624Ka;
                        i5 = i;
                    }
                    IBinder t12 = l5.t1(binderC2361b, a1Var2, str2, interfaceC0624Ka2, i5);
                    if (t12 != null) {
                        IInterface queryLocalInterface2 = t12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return queryLocalInterface2 instanceof K ? (K) queryLocalInterface2 : new I(t12);
                    }
                } catch (Exception e3) {
                    throw new U2.k(e3);
                }
            } catch (U2.k e5) {
                e = e5;
                Exception exc = e;
                C0802bc.a(context).b("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                U2.j.k("#007 Could not call remote method.", exc);
                return null;
            } catch (RemoteException e6) {
                e = e6;
                Exception exc2 = e;
                C0802bc.a(context).b("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                U2.j.k("#007 Could not call remote method.", exc2);
                return null;
            } catch (NullPointerException e7) {
                e = e7;
                Exception exc22 = e;
                C0802bc.a(context).b("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                U2.j.k("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder t13 = ((L) d(context)).t1(new BinderC2361b(context), a1Var, str, interfaceC0624Ka, i);
                if (t13 != null) {
                    IInterface queryLocalInterface3 = t13.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return queryLocalInterface3 instanceof K ? (K) queryLocalInterface3 : new I(t13);
                }
            } catch (RemoteException e8) {
                e = e8;
                U2.j.e("Could not create remote AdManager.", e);
                return null;
            } catch (C2362c e9) {
                e = e9;
                U2.j.e("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
