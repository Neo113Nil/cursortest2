package m0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractBinderC0188g;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.C0185f;
import com.google.android.gms.internal.play_billing.InterfaceC0191h;
import com.google.android.gms.internal.play_billing.S1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class I implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f9955a;

    public /* synthetic */ I(J j3) {
        this.f9955a = j3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0191h c0185f;
        AbstractC0213o0.f("BillingClientTesting", "Billing Override Service connected.");
        J j3 = this.f9955a;
        int i3 = AbstractBinderC0188g.f2753d;
        if (iBinder == null) {
            c0185f = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            c0185f = queryLocalInterface instanceof InterfaceC0191h ? (InterfaceC0191h) queryLocalInterface : new C0185f(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
        }
        j3.f9958H = c0185f;
        this.f9955a.f9957G = 2;
        J j4 = this.f9955a;
        j4.getClass();
        S1 d3 = M.d(26);
        Objects.requireNonNull(d3, "ApiSuccess should not be null");
        j4.f10022g.x(d3);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0213o0.g("BillingClientTesting", "Billing Override Service disconnected.");
        this.f9955a.f9958H = null;
        this.f9955a.f9957G = 0;
    }
}
