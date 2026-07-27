package io.appmetrica.analytics.billingv8.internal;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv8.impl.b;
import io.appmetrica.analytics.billingv8.impl.c;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.l;
import io.appmetrica.analytics.billingv8.impl.n;
import io.appmetrica.analytics.billingv8.impl.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import m0.C1114b;
import m0.C1116d;
import m0.C1122j;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5330a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5331b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5332c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f5333d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f5334e;
    private final UpdatePolicy f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f5335g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5336h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f5330a = context;
        this.f5331b = executor;
        this.f5332c = executor2;
        this.f5333d = billingInfoSender;
        this.f5334e = billingInfoManager;
        this.f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (j.a(this.f5335g, billingConfig)) {
            return;
        }
        this.f5335g = billingConfig;
        if (billingConfig != null && !this.f5336h) {
            this.f5336h = true;
            C1114b c1114b = new C1114b(this.f5330a);
            c1114b.f10009c = new l();
            c1114b.f10007a = new C1122j(false);
            C1116d a3 = c1114b.a();
            try {
                a3.l(new b(billingConfig, a3, new BillingLibraryMonitor$updateBilling$1(this), new d(a3), this));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f5335g;
            if (billingConfig != null && !this.f5336h) {
                this.f5336h = true;
                C1114b c1114b = new C1114b(this.f5330a);
                c1114b.f10009c = new l();
                c1114b.f10007a = new C1122j(false);
                C1116d a3 = c1114b.a();
                a3.l(new b(billingConfig, a3, new BillingLibraryMonitor$updateBilling$1(this), new d(a3), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv8.impl.n
    public synchronized void onUpdateFinished() {
        this.f5336h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i3, f fVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i3 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i3 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
