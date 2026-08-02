package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.F7;
import s3.BinderC2361b;

/* renamed from: Q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353d extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f5006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0610Ia f5007c;

    public C0353d(OutOfContextTestingActivity outOfContextTestingActivity, BinderC0610Ia binderC0610Ia) {
        this.f5006b = outOfContextTestingActivity;
        this.f5007c = binderC0610Ia;
    }

    @Override // Q2.AbstractC0377p
    public final /* bridge */ /* synthetic */ Object a() {
        C0375o.U(this.f5006b, "out_of_context_tester");
        return null;
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f5006b;
        BinderC2361b binderC2361b = new BinderC2361b(outOfContextTestingActivity);
        F7.a(outOfContextTestingActivity);
        if (((Boolean) r.f5053d.f5056c.a(F7.Y8)).booleanValue()) {
            return t5.N1(binderC2361b, this.f5007c, 244410000);
        }
        return null;
    }

    @Override // Q2.AbstractC0377p
    public final Object c() {
        C0380q0 c0380q0;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f5006b;
        BinderC2361b binderC2361b = new BinderC2361b(outOfContextTestingActivity);
        F7.a(outOfContextTestingActivity);
        if (((Boolean) r.f5053d.f5056c.a(F7.Y8)).booleanValue()) {
            try {
                try {
                    IBinder b3 = U2.j.b(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (b3 == null) {
                        c0380q0 = null;
                    } else {
                        IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        c0380q0 = queryLocalInterface instanceof C0380q0 ? (C0380q0) queryLocalInterface : new C0380q0(b3, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 0);
                    }
                    return c0380q0.t1(binderC2361b, this.f5007c);
                } catch (Exception e3) {
                    throw new U2.k(e3);
                }
            } catch (U2.k e5) {
                e = e5;
                C0802bc.a(outOfContextTestingActivity).b("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (RemoteException e6) {
                e = e6;
                C0802bc.a(outOfContextTestingActivity).b("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e7) {
                e = e7;
                C0802bc.a(outOfContextTestingActivity).b("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }
}
