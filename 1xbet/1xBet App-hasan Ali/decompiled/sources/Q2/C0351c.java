package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.AbstractBinderC0625Kb;
import com.google.android.gms.internal.ads.AbstractBinderC0646Nb;
import com.google.android.gms.internal.ads.C0618Jb;
import com.google.android.gms.internal.ads.C0639Mb;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0632Lb;
import com.google.android.gms.internal.ads.InterfaceC0653Ob;
import com.google.android.gms.internal.ads.InterfaceC0846cc;
import s3.BinderC2361b;
import s3.C2362c;

/* renamed from: Q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351c extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f4996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0375o f4997c;

    public C0351c(C0375o c0375o, AdActivity adActivity) {
        this.f4996b = adActivity;
        this.f4997c = c0375o;
    }

    @Override // Q2.AbstractC0377p
    public final /* bridge */ /* synthetic */ Object a() {
        C0375o.U(this.f4996b, "ad_overlay");
        return null;
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.Q(new BinderC2361b(this.f4996b));
    }

    @Override // Q2.AbstractC0377p
    public final Object c() {
        InterfaceC0653Ob c0639Mb;
        AdActivity adActivity = this.f4996b;
        F7.a(adActivity);
        boolean booleanValue = ((Boolean) r.f5053d.f5056c.a(F7.la)).booleanValue();
        C0375o c0375o = this.f4997c;
        if (!booleanValue) {
            J0 j02 = (J0) c0375o.f5046p;
            try {
                BinderC2361b binderC2361b = new BinderC2361b(adActivity);
                C0639Mb c0639Mb2 = (C0639Mb) ((InterfaceC0653Ob) j02.d(adActivity));
                Parcel N5 = c0639Mb2.N();
                F5.e(N5, binderC2361b);
                Parcel Y4 = c0639Mb2.Y(N5, 1);
                IBinder readStrongBinder = Y4.readStrongBinder();
                Y4.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface instanceof InterfaceC0632Lb ? (InterfaceC0632Lb) queryLocalInterface : new C0618Jb(readStrongBinder);
            } catch (RemoteException e3) {
                U2.j.j("Could not create remote AdOverlay.", e3);
                return null;
            } catch (C2362c e5) {
                U2.j.j("Could not create remote AdOverlay.", e5);
                return null;
            }
        }
        try {
            BinderC2361b binderC2361b2 = new BinderC2361b(adActivity);
            try {
                IBinder b3 = U2.j.b(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i = AbstractBinderC0646Nb.f10795k;
                if (b3 == null) {
                    c0639Mb = null;
                } else {
                    IInterface queryLocalInterface2 = b3.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    c0639Mb = queryLocalInterface2 instanceof InterfaceC0653Ob ? (InterfaceC0653Ob) queryLocalInterface2 : new C0639Mb(b3);
                }
                C0639Mb c0639Mb3 = (C0639Mb) c0639Mb;
                Parcel N6 = c0639Mb3.N();
                F5.e(N6, binderC2361b2);
                Parcel Y5 = c0639Mb3.Y(N6, 1);
                IBinder readStrongBinder2 = Y5.readStrongBinder();
                Y5.recycle();
                int i5 = AbstractBinderC0625Kb.f10151k;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface3 instanceof InterfaceC0632Lb ? (InterfaceC0632Lb) queryLocalInterface3 : new C0618Jb(readStrongBinder2);
            } catch (Exception e6) {
                throw new U2.k(e6);
            }
        } catch (U2.k | RemoteException | NullPointerException e7) {
            InterfaceC0846cc a5 = C0802bc.a(adActivity.getApplicationContext());
            c0375o.getClass();
            a5.b("ClientApiBroker.createAdOverlay", e7);
            return null;
        }
    }
}
