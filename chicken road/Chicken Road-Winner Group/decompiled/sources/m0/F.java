package m0;

import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f9947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f9948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f9949c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9950d;

    public F(J j3, int i3, Consumer consumer, Runnable runnable) {
        this.f9950d = i3;
        this.f9947a = consumer;
        this.f9948b = runnable;
        this.f9949c = j3;
    }

    public final void a(Throwable th) {
        boolean z3 = th instanceof TimeoutException;
        J j3 = this.f9949c;
        if (z3) {
            j3.Q(114, 28, O.f9967E);
            AbstractC0213o0.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            j3.Q(107, 28, O.f9967E);
            AbstractC0213o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f9948b.run();
    }
}
