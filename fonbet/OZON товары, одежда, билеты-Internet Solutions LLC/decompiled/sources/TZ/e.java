package TZ;

import Sq.CallableC4012a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RZ.a f26958a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final UZ.b f26959b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f26960c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final SZ.a f26961d;

    public e(@NotNull RZ.a analytics, @NotNull UZ.b eventController, @NotNull f errorEventFactory, @NotNull SZ.a analyticsEventExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(errorEventFactory, "errorEventFactory");
        Intrinsics.checkNotNullParameter(analyticsEventExecutor, "analyticsEventExecutor");
        this.f26958a = analytics;
        this.f26959b = eventController;
        this.f26960c = errorEventFactory;
        this.f26961d = analyticsEventExecutor;
    }

    public static Unit d(e eVar, String str, R00.f fVar) {
        eVar.f26959b.sendEvent(eVar.f26960c.c(str, fVar));
        return Unit.f71690a;
    }

    public static Unit e(e eVar, b bVar) {
        eVar.f26959b.sendEvent(bVar);
        return Unit.f71690a;
    }

    public static Unit f(e eVar, b bVar) {
        eVar.f26959b.sendEvent(bVar);
        return Unit.f71690a;
    }

    @Override // TZ.a
    public final void a(@NotNull String url, @NotNull R00.b incident) {
        final b b11;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(incident, "incident");
        if (this.f26958a.g() && (b11 = this.f26960c.b(url, incident)) != null) {
            this.f26961d.execute(new Callable() { // from class: TZ.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.f(e.this, b11);
                }
            });
        }
    }

    @Override // TZ.a
    public final void b(final String str, @NotNull List<? extends R00.f> incidents) {
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        if (this.f26958a.g()) {
            for (final R00.f fVar : incidents) {
                this.f26961d.execute(new Callable() { // from class: TZ.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return e.d(e.this, str, fVar);
                    }
                });
            }
        }
    }

    @Override // TZ.a
    public final void c(String str, @NotNull String url) {
        b a11;
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.f26958a.g() && (a11 = this.f26960c.a(str, url)) != null) {
            this.f26961d.execute(new CallableC4012a(1, this, a11));
        }
    }
}
