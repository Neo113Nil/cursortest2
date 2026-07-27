package io.appmetrica.analytics.billingv6.internal;

import G0.C0052b;
import G0.C0054d;
import G0.C0062l;
import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.b;
import io.appmetrica.analytics.billingv6.impl.c;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.l;
import io.appmetrica.analytics.billingv6.impl.n;
import io.appmetrica.analytics.billingv6.impl.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6095a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f6096b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6097c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f6098d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f6099e;

    /* renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f6100f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f6101g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6102h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f6095a = context;
        this.f6096b = executor;
        this.f6097c = executor2;
        this.f6098d = billingInfoSender;
        this.f6099e = billingInfoManager;
        this.f6100f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (i.a(this.f6101g, billingConfig)) {
            return;
        }
        this.f6101g = billingConfig;
        if (billingConfig != null && !this.f6102h) {
            this.f6102h = true;
            C0052b c0052b = new C0052b(this.f6095a);
            c0052b.f816c = new l();
            c0052b.f814a = new C0062l(false);
            C0054d a6 = c0052b.a();
            a6.l(new b(billingConfig, a6, new BillingLibraryMonitor$updateBilling$1(this), new d(a6), this));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f6101g;
            if (billingConfig != null && !this.f6102h) {
                this.f6102h = true;
                C0052b c0052b = new C0052b(this.f6095a);
                c0052b.f816c = new l();
                c0052b.f814a = new C0062l(false);
                C0054d a6 = c0052b.a();
                a6.l(new b(billingConfig, a6, new BillingLibraryMonitor$updateBilling$1(this), new d(a6), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv6.impl.n
    public synchronized void onUpdateFinished() {
        this.f6102h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i2, e eVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i2 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i2 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
