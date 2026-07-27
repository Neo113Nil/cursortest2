package B3;

import B1.g;
import C0.s;
import D0.k;
import E.C0028c;
import N1.n;
import U.h;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.internal.OneSignalImp;
import com.onesignal.user.internal.LoginHelper;
import com.onesignal.user.internal.LogoutHelper;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.impl.p;
import io.appmetrica.analytics.idsync.impl.y;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0745jd;
import io.appmetrica.analytics.impl.C0793l9;
import io.appmetrica.analytics.impl.C0826mg;
import io.appmetrica.analytics.impl.C0852ng;
import io.appmetrica.analytics.impl.InterfaceC1111xg;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.impl.Kb;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.i;
import s0.o;
import t0.q;
import y0.AbstractC1552b;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f274c;

    public /* synthetic */ c(Object obj, int i2, Object obj2) {
        this.f272a = i2;
        this.f273b = obj;
        this.f274c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0028c c0028c;
        int i2 = 0;
        switch (this.f272a) {
            case 0:
                d dVar = (d) this.f273b;
                dVar.getClass();
                e eVar = (e) this.f274c;
                eVar.e();
                ((ConcurrentLinkedDeque) dVar.f277c).add(eVar);
                return;
            case 1:
                s sVar = (s) this.f273b;
                k kVar = (k) this.f274c;
                if (sVar.f356a.f428a instanceof D0.a) {
                    kVar.cancel(true);
                    return;
                } else {
                    kVar.m(sVar.f359d.getForegroundInfoAsync());
                    return;
                }
            case 2:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f273b;
                J1.a aVar = (J1.a) this.f274c;
                i.e(this$0, "this$0");
                synchronized (this$0.f4753b) {
                    try {
                        if (this$0.f4754c) {
                            k future = this$0.f4755d;
                            i.d(future, "future");
                            String str = F0.a.f672a;
                            future.k(new o());
                        } else {
                            this$0.f4755d.m(aVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                N1.o oVar = (N1.o) this.f273b;
                Y1.a aVar2 = (Y1.a) this.f274c;
                if (oVar.f2033b != N1.o.f2031d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    c0028c = oVar.f2032a;
                    oVar.f2032a = null;
                    oVar.f2033b = aVar2;
                }
                c0028c.getClass();
                return;
            case 4:
                n nVar = (n) this.f273b;
                Y1.a aVar3 = (Y1.a) this.f274c;
                synchronized (nVar) {
                    try {
                        if (nVar.f2029b == null) {
                            nVar.f2028a.add(aVar3);
                        } else {
                            nVar.f2029b.add(aVar3.get());
                        }
                    } finally {
                    }
                }
                return;
            case 5:
                O1.a aVar4 = (O1.a) this.f273b;
                Process.setThreadPriority(aVar4.f2229c);
                StrictMode.ThreadPolicy threadPolicy = aVar4.f2230d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f274c).run();
                return;
            case 6:
                Callable callable = (Callable) this.f273b;
                g gVar = (g) this.f274c;
                try {
                    Object call = callable.call();
                    O1.i iVar = (O1.i) gVar.f215b;
                    iVar.getClass();
                    if (call == null) {
                        call = s.g.f11744g;
                    }
                    if (s.g.f11743f.H(iVar, null, call)) {
                        s.g.e(iVar);
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    gVar.m(e3);
                    return;
                }
            case 7:
                ((P3.a) this.f273b).accept((Y3.e) this.f274c);
                return;
            case 8:
                ((ProfileInstallerInitializer) this.f273b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? U.k.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h((Context) this.f274c, i2), new Random().nextInt(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                return;
            case 9:
                int i3 = JobInfoSchedulerService.f4950a;
                ((JobInfoSchedulerService) this.f273b).jobFinished((JobParameters) this.f274c, false);
                return;
            case 10:
                OneSignalImp.logout$lambda$5((OneSignalImp) this.f273b, (LogoutHelper.LogoutEnqueueContext) this.f274c);
                return;
            case 11:
                OneSignalImp.login$lambda$4((OneSignalImp) this.f273b, (LoginHelper.LoginEnqueueContext) this.f274c);
                return;
            case 12:
                Intent intent = (Intent) this.f274c;
                ((f2.k) this.f273b).getClass();
                f2.k.a(intent);
                return;
            case 13:
                I1.h hVar = (I1.h) this.f274c;
                U.e eVar2 = FirebaseMessaging.f5319k;
                try {
                    hVar.b(((FirebaseMessaging) this.f273b).a());
                    return;
                } catch (Exception e6) {
                    hVar.a(e6);
                    return;
                }
            case 14:
                I1.h hVar2 = (I1.h) this.f274c;
                try {
                    hVar2.b(((f2.n) this.f273b).a());
                    return;
                } catch (Exception e7) {
                    hVar2.a(e7);
                    return;
                }
            case 15:
                J0.a((J0) this.f273b, (PluginErrorDetails) this.f274c);
                return;
            case 16:
                Kb.a((Kb) this.f273b, (V) this.f274c);
                return;
            case 17:
                C0745jd.a((C0745jd) this.f273b, (ArrayList) this.f274c);
                return;
            case 18:
                C0826mg.a((C0852ng) this.f273b, (InterfaceC1111xg) this.f274c);
                return;
            case C0793l9.f8681C /* 19 */:
                C0852ng.b((InterfaceC1111xg) this.f273b, (Throwable) this.f274c);
                return;
            case C0793l9.f8682D /* 20 */:
                B.a((B) this.f273b, (OnFetchCompleteListener) this.f274c);
                return;
            case C0793l9.f8683E /* 21 */:
                j.a((j) this.f273b, (ProductInfo) this.f274c);
                return;
            case 22:
                p.a((p) this.f273b, (RequestConfig) this.f274c);
                return;
            case 23:
                p.a((y) this.f273b, (p) this.f274c);
                return;
            case 24:
                ((t0.f) this.f273b).d((B0.j) this.f274c, false);
                return;
            case C0793l9.f8684F /* 25 */:
                q qVar = (q) this.f273b;
                k kVar2 = (k) this.f274c;
                if (qVar.f11918q.f428a instanceof D0.a) {
                    kVar2.cancel(true);
                    return;
                }
                return;
            case 26:
                ((G2.f) this.f273b).c((Typeface) this.f274c);
                return;
            default:
                List<AbstractC1552b> list = (List) this.f273b;
                z0.e this$02 = (z0.e) this.f274c;
                i.e(this$02, "this$0");
                for (AbstractC1552b abstractC1552b : list) {
                    Object obj = this$02.f12456e;
                    abstractC1552b.f12336d = obj;
                    abstractC1552b.d(abstractC1552b.f12337e, obj);
                }
                return;
        }
    }
}
