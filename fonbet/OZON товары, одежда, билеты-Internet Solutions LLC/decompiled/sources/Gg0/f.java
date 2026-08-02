package Gg0;

import Qj0.A0;
import Qj0.C3882b;
import Qj0.C3884d;
import Qj0.F;
import Qj0.L;
import Qj0.Q;
import Qj0.U;
import Qj0.x0;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTrackingInfo;
import ru.ozon.tracker.performance.MetricType;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PerformanceTrackerDelegate f10239a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PikazonPerformanceAvailabilityChecker f10240b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f10241c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Sg.a f10242d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9067a f10243e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Fg0.a f10244f;

    public f(@NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker, @NotNull PerformanceTrackerDelegate tracker, @NotNull c mediaNamesHolder, @NotNull Fg0.a traceModifiedListener, @NotNull Sg.a analyticsScreenStorage, @NotNull C9067a networkInfoProvider) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
        Intrinsics.checkNotNullParameter(mediaNamesHolder, "mediaNamesHolder");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(traceModifiedListener, "traceModifiedListener");
        this.f10239a = tracker;
        this.f10240b = performanceAvailabilityChecker;
        this.f10241c = mediaNamesHolder;
        this.f10242d = analyticsScreenStorage;
        this.f10243e = networkInfoProvider;
        this.f10244f = traceModifiedListener;
    }

    private final void f(U u11, a aVar) {
        aVar.b(u11);
        Rg.a a11 = this.f10242d.a();
        if (a11 != null) {
            F f7 = new F(a11.g());
            int i11 = U.f23535i;
            u11.n(f7, true);
            String f11 = a11.f();
            if (f11 != null) {
                u11.n(new C3884d(f11), true);
            }
            String l11 = a11.l();
            if (l11 != null) {
                u11.n(new x0(l11), true);
            }
            String i12 = a11.i();
            if (i12 != null) {
                u11.n(new L(i12), true);
            }
        }
    }

    private final void g(U u11, String str, View view, boolean z11) {
        Long mediaLoadingFinished;
        String b11;
        if (this.f10240b.isImagePlaceholderAnalyticsEnabled()) {
            Pikazon.Companion companion = Pikazon.INSTANCE;
            PlaceholderTrackingInfo placeholderTrackingInfo = companion.getInstance().getPlaceholderTracker().placeholderTrackingInfo(str);
            u11.o(MetricType.PLACEHOLDER_TIME, placeholderTrackingInfo != null ? placeholderTrackingInfo.getTime() : (view == null || (mediaLoadingFinished = companion.getInstance().getPlaceholderTracker().mediaLoadingFinished(view)) == null) ? 0L : mediaLoadingFinished.longValue(), z11);
            if (placeholderTrackingInfo == null || (b11 = placeholderTrackingInfo.getName()) == null) {
                b11 = this.f10241c.b(str);
            }
            if (b11 != null) {
                u11.n(new A0(b11), true);
            }
        }
    }

    public final void a(View view, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (view != null) {
            this.f10241c.c(view, uuid);
        }
    }

    public final void b(View view, @NotNull a data, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        PikazonPerformanceAvailabilityChecker pikazonPerformanceAvailabilityChecker = this.f10240b;
        if (pikazonPerformanceAvailabilityChecker.isPerformanceAnalyticsEnabled()) {
            boolean isImagePlaceholderAnalyticsEnabled = pikazonPerformanceAvailabilityChecker.isImagePlaceholderAnalyticsEnabled();
            PerformanceTrackerDelegate performanceTrackerDelegate = this.f10239a;
            if (!isImagePlaceholderAnalyticsEnabled && Intrinsics.d(data.a(), Boolean.FALSE)) {
                performanceTrackerDelegate.removeTrace(uuid);
                return;
            }
            U beginTrace = performanceTrackerDelegate.beginTrace(uuid);
            f(beginTrace, data);
            g(beginTrace, uuid, view, false);
            if (Intrinsics.d(data.a(), Boolean.FALSE)) {
                Q q11 = new Q(999);
                int i11 = U.f23535i;
                beginTrace.n(q11, true);
                beginTrace.n(new C3882b(C9067a.g(this.f10243e)), false);
            }
            U.p(beginTrace, MetricType.TOTAL_TIME_END, 0L, false, 6);
            performanceTrackerDelegate.endTrace(uuid, kotlin.collections.U.c());
        }
    }

    public final void c(ImageView imageView, @NotNull String uuid, @NotNull b mediaData) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(mediaData, "mediaData");
        if (this.f10240b.isPerformanceAnalyticsEnabled()) {
            U beginTrace = this.f10239a.beginTrace(uuid);
            f(beginTrace, mediaData);
            g(beginTrace, uuid, imageView, true);
            this.f10244f.a(uuid);
        }
    }

    public final void d(View view, @NotNull a data, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (this.f10240b.isPerformanceAnalyticsEnabled()) {
            U beginTrace = this.f10239a.beginTrace(uuid);
            f(beginTrace, data);
            g(beginTrace, uuid, view, true);
            this.f10244f.a(uuid);
        }
    }

    public final void e(ImageView imageView, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (this.f10240b.isImagePlaceholderAnalyticsEnabled()) {
            g(this.f10239a.beginTrace(uuid), uuid, imageView, false);
        }
    }
}
