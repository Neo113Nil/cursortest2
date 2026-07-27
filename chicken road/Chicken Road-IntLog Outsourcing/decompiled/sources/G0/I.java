package G0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractBinderC0332g;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C0329f;
import com.google.android.gms.internal.play_billing.InterfaceC0335h;
import com.google.android.gms.internal.play_billing.S1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class I implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f759a;

    public /* synthetic */ I(J j2) {
        this.f759a = j2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0335h c0329f;
        AbstractC0357o0.f("BillingClientTesting", "Billing Override Service connected.");
        J j2 = this.f759a;
        int i2 = AbstractBinderC0332g.f5184e;
        if (iBinder == null) {
            c0329f = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            c0329f = queryLocalInterface instanceof InterfaceC0335h ? (InterfaceC0335h) queryLocalInterface : new C0329f(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
        }
        j2.f762H = c0329f;
        this.f759a.f761G = 2;
        J j6 = this.f759a;
        j6.getClass();
        S1 d6 = M.d(26);
        Objects.requireNonNull(d6, "ApiSuccess should not be null");
        j6.f830g.k(d6);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0357o0.g("BillingClientTesting", "Billing Override Service disconnected.");
        this.f759a.f762H = null;
        this.f759a.f761G = 0;
    }
}
