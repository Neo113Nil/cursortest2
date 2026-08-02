package Q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.C0598Gc;
import com.google.android.gms.internal.ads.C0640Mc;
import com.google.android.gms.internal.ads.InterfaceC0612Ic;
import s3.BinderC2361b;

/* renamed from: Q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349b extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4990c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC0610Ia f4991d;

    public C0349b(Context context, String str, BinderC0610Ia binderC0610Ia) {
        this.f4989b = context;
        this.f4990c = str;
        this.f4991d = binderC0610Ia;
    }

    @Override // Q2.AbstractC0377p
    public final Object a() {
        C0375o.U(this.f4989b, "rewarded");
        return new P0();
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.q1(new BinderC2361b(this.f4989b), this.f4990c, this.f4991d, 244410000);
    }

    @Override // Q2.AbstractC0377p
    public final Object c() {
        C0640Mc c0640Mc;
        IBinder t12;
        String str = this.f4990c;
        BinderC0610Ia binderC0610Ia = this.f4991d;
        Context context = this.f4989b;
        BinderC2361b binderC2361b = new BinderC2361b(context);
        try {
            try {
                IBinder b3 = U2.j.b(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (b3 == null) {
                    c0640Mc = null;
                } else {
                    IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    c0640Mc = queryLocalInterface instanceof C0640Mc ? (C0640Mc) queryLocalInterface : new C0640Mc(b3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 0);
                }
                t12 = c0640Mc.t1(binderC2361b, str, binderC0610Ia);
            } catch (Exception e3) {
                throw new U2.k(e3);
            }
        } catch (U2.k e5) {
            e = e5;
            U2.j.k("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e6) {
            e = e6;
            U2.j.k("#007 Could not call remote method.", e);
            return null;
        }
        if (t12 == null) {
            return null;
        }
        IInterface queryLocalInterface2 = t12.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface2 instanceof InterfaceC0612Ic ? (InterfaceC0612Ic) queryLocalInterface2 : new C0598Gc(t12);
    }
}
