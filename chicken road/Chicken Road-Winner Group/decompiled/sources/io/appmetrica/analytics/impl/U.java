package io.appmetrica.analytics.impl;

import android.content.Context;
import b0.CallableC0160f;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class U implements Ha {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6689a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f6690b;

    /* renamed from: i, reason: collision with root package name */
    public FutureTask f6696i;

    /* renamed from: j, reason: collision with root package name */
    public final J f6697j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6700m;

    /* renamed from: c, reason: collision with root package name */
    public final String f6691c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final String f6692d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final String f6693e = "advertising identifiers collecting is forbidden by unknown reason";
    public final N f = new N(new Eg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final N f6694g = new N(new Eg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final N f6695h = new N(new Eg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f6698k = new AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public G f6699l = new G(4, 4, 4);

    public U(Context context, ICommonExecutor iCommonExecutor, C0605jm c0605jm) {
        this.f6689a = context;
        this.f6690b = iCommonExecutor;
        this.f6697j = new J(c0605jm);
    }

    public static final Void e(U u3) {
        u3.f6698k = new AdvertisingIdsHolder(u3.a(u3.f6699l.f5970a, new Q(u3)), u3.a(u3.f6699l.f5971b, new S(u3)), u3.a(u3.f6699l.f5972c, new T(u3, new C0468ee())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void init() {
        if (this.f6696i == null) {
            this.f6699l = this.f6697j.a();
            FutureTask futureTask = new FutureTask(new CallableC0160f(1, this));
            this.f6696i = futureTask;
            this.f6690b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha, io.appmetrica.analytics.impl.InterfaceC0735om
    public final synchronized void a(C0605jm c0605jm) {
        this.f6697j.a(c0605jm);
        a((Li) new C0468ee(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void b(boolean z3) {
        this.f6700m = true;
        this.f6697j.f6134b.update(z3);
        a((Li) new C0468ee(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void c(boolean z3) {
        if (!this.f6700m) {
            b(z3);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f6696i;
        if (futureTask == null) {
            kotlin.jvm.internal.j.g("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f6698k;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C0468ee());
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder a(Li li) {
        try {
            a(li, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f6698k;
    }

    public final FutureTask a(final Li li, final boolean z3) {
        final G a3 = this.f6697j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.Oo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z3, a3, this, li);
            }
        });
        this.f6696i = futureTask;
        this.f6690b.execute(futureTask);
        FutureTask futureTask2 = this.f6696i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        kotlin.jvm.internal.j.g("refresh");
        throw null;
    }

    public static final Void a(boolean z3, G g3, U u3, Li li) {
        if (!z3 && kotlin.jvm.internal.j.a(g3, u3.f6699l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u3.f6698k;
        AdTrackingInfoResult a3 = u3.a(g3.f5970a, new Q(u3));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a3.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a3 = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a3.mErrorExplanation);
        }
        AdTrackingInfoResult a4 = u3.a(g3.f5971b, new S(u3));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a4.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a4 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a4.mErrorExplanation);
        }
        AdTrackingInfoResult a5 = u3.a(g3.f5972c, new T(u3, li));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a5.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a5 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a5.mErrorExplanation);
        }
        u3.f6698k = new AdvertisingIdsHolder(a3, a4, a5);
        return null;
    }

    public final AdTrackingInfoResult a(int i3, o2.a aVar) {
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (AdTrackingInfoResult) aVar.invoke();
        }
        if (i4 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f6691c);
        }
        if (i4 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f6692d);
        }
        if (i4 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f6693e);
        }
        throw new T0.b();
    }
}
