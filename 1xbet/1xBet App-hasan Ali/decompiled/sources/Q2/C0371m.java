package Q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0846cc;
import com.google.android.gms.internal.ads.K8;
import com.google.android.gms.internal.ads.L8;
import com.google.android.gms.internal.ads.N8;
import com.google.android.gms.internal.ads.O8;
import com.google.android.gms.internal.ads.P8;
import com.google.android.gms.internal.ads.Q8;
import s3.BinderC2361b;
import s3.C2362c;

/* renamed from: Q2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371m extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z2.e f5036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f5037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f5038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0375o f5039e;

    public C0371m(C0375o c0375o, Z2.e eVar, FrameLayout frameLayout, Context context) {
        this.f5036b = eVar;
        this.f5037c = frameLayout;
        this.f5038d = context;
        this.f5039e = c0375o;
    }

    @Override // Q2.AbstractC0377p
    public final Object a() {
        C0375o.U(this.f5038d, "native_ad_view_delegate");
        return new O0();
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.k2(new BinderC2361b(this.f5036b), new BinderC2361b(this.f5037c));
    }

    @Override // Q2.AbstractC0377p
    public final Object c() {
        Q8 o8;
        Context context = this.f5038d;
        F7.a(context);
        boolean booleanValue = ((Boolean) r.f5053d.f5056c.a(F7.la)).booleanValue();
        FrameLayout frameLayout = this.f5037c;
        Z2.e eVar = this.f5036b;
        C0375o c0375o = this.f5039e;
        if (!booleanValue) {
            J0 j02 = (J0) c0375o.f5045o;
            try {
                BinderC2361b binderC2361b = new BinderC2361b(context);
                BinderC2361b binderC2361b2 = new BinderC2361b(eVar);
                BinderC2361b binderC2361b3 = new BinderC2361b(frameLayout);
                O8 o82 = (O8) ((Q8) j02.d(context));
                Parcel N5 = o82.N();
                F5.e(N5, binderC2361b);
                F5.e(N5, binderC2361b2);
                F5.e(N5, binderC2361b3);
                N5.writeInt(244410000);
                Parcel Y4 = o82.Y(N5, 1);
                IBinder readStrongBinder = Y4.readStrongBinder();
                Y4.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface instanceof N8 ? (N8) queryLocalInterface : new K8(readStrongBinder);
            } catch (RemoteException e3) {
                e = e3;
                U2.j.j("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (C2362c e5) {
                e = e5;
                U2.j.j("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            BinderC2361b binderC2361b4 = new BinderC2361b(context);
            BinderC2361b binderC2361b5 = new BinderC2361b(eVar);
            BinderC2361b binderC2361b6 = new BinderC2361b(frameLayout);
            try {
                IBinder b3 = U2.j.b(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i = P8.f11070k;
                if (b3 == null) {
                    o8 = null;
                } else {
                    IInterface queryLocalInterface2 = b3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    o8 = queryLocalInterface2 instanceof Q8 ? (Q8) queryLocalInterface2 : new O8(b3);
                }
                O8 o83 = (O8) o8;
                Parcel N6 = o83.N();
                F5.e(N6, binderC2361b4);
                F5.e(N6, binderC2361b5);
                F5.e(N6, binderC2361b6);
                N6.writeInt(244410000);
                Parcel Y5 = o83.Y(N6, 1);
                IBinder readStrongBinder2 = Y5.readStrongBinder();
                Y5.recycle();
                int i5 = L8.f10326k;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface3 instanceof N8 ? (N8) queryLocalInterface3 : new K8(readStrongBinder2);
            } catch (Exception e6) {
                throw new U2.k(e6);
            }
        } catch (U2.k | RemoteException | NullPointerException e7) {
            InterfaceC0846cc a5 = C0802bc.a(context);
            c0375o.getClass();
            a5.b("ClientApiBroker.createNativeAdViewDelegate", e7);
            return null;
        }
    }
}
