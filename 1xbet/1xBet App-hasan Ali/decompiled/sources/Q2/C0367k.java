package Q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0846cc;
import s3.BinderC2361b;
import s3.C2362c;

/* renamed from: Q2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367k extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC0610Ia f5032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0375o f5033e;

    public C0367k(C0375o c0375o, Context context, String str, BinderC0610Ia binderC0610Ia) {
        this.f5030b = context;
        this.f5031c = str;
        this.f5032d = binderC0610Ia;
        this.f5033e = c0375o;
    }

    @Override // Q2.AbstractC0377p
    public final Object a() {
        C0375o.U(this.f5030b, "native_ad");
        return new L0();
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.B0(new BinderC2361b(this.f5030b), this.f5031c, this.f5032d, 244410000);
    }

    @Override // Q2.AbstractC0377p
    public final Object c() {
        H h3;
        Context context = this.f5030b;
        F7.a(context);
        boolean booleanValue = ((Boolean) r.f5053d.f5056c.a(F7.la)).booleanValue();
        BinderC0610Ia binderC0610Ia = this.f5032d;
        String str = this.f5031c;
        C0375o c0375o = this.f5033e;
        if (!booleanValue) {
            J0 j02 = (J0) c0375o.f5043m;
            try {
                BinderC2361b binderC2361b = new BinderC2361b(context);
                H h4 = (H) j02.d(context);
                Parcel N5 = h4.N();
                F5.e(N5, binderC2361b);
                N5.writeString(str);
                F5.e(N5, binderC0610Ia);
                N5.writeInt(244410000);
                Parcel Y4 = h4.Y(N5, 1);
                IBinder readStrongBinder = Y4.readStrongBinder();
                Y4.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof G ? (G) queryLocalInterface : new E(readStrongBinder);
            } catch (RemoteException e3) {
                e = e3;
                U2.j.j("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (C2362c e5) {
                e = e5;
                U2.j.j("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            BinderC2361b binderC2361b2 = new BinderC2361b(context);
            try {
                IBinder b3 = U2.j.b(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (b3 == null) {
                    h3 = null;
                } else {
                    IInterface queryLocalInterface2 = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    h3 = queryLocalInterface2 instanceof H ? (H) queryLocalInterface2 : new H(b3);
                }
                Parcel N6 = h3.N();
                F5.e(N6, binderC2361b2);
                N6.writeString(str);
                F5.e(N6, binderC0610Ia);
                N6.writeInt(244410000);
                Parcel Y5 = h3.Y(N6, 1);
                IBinder readStrongBinder2 = Y5.readStrongBinder();
                Y5.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface3 instanceof G ? (G) queryLocalInterface3 : new E(readStrongBinder2);
            } catch (Exception e6) {
                throw new U2.k(e6);
            }
        } catch (U2.k e7) {
            e = e7;
            InterfaceC0846cc a5 = C0802bc.a(context);
            c0375o.getClass();
            a5.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (RemoteException e8) {
            e = e8;
            InterfaceC0846cc a52 = C0802bc.a(context);
            c0375o.getClass();
            a52.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e9) {
            e = e9;
            InterfaceC0846cc a522 = C0802bc.a(context);
            c0375o.getClass();
            a522.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }
}
