package Fg0;

import Qj0.B;
import Qj0.C3893m;
import Qj0.C3895o;
import Qj0.U;
import Qj0.t0;
import ei0.InterfaceC6369b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.loaders.PerformanceListener;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;

/* loaded from: classes7.dex */
public final class b implements PerformanceListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f9464a;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function1<U, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9465b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9466c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, String str) {
            super(1);
            this.f9465b = j11;
            this.f9466c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(U u11) {
            U withTrace = u11;
            Intrinsics.checkNotNullParameter(withTrace, "$this$withTrace");
            withTrace.o(MetricType.TOTAL_TIME_START, kotlin.time.b.i(this.f9465b), false);
            withTrace.n(new t0(this.f9466c), false);
            withTrace.n(new B(ObjectTypes.IMAGE), true);
            return Unit.f71690a;
        }
    }

    /* renamed from: Fg0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0198b extends AbstractC7737t implements Function1<U, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9468c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0198b(int i11, int i12) {
            super(1);
            this.f9467b = i11;
            this.f9468c = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(U u11) {
            U withTrace = u11;
            Intrinsics.checkNotNullParameter(withTrace, "$this$withTrace");
            C3895o c3895o = new C3895o(this.f9467b);
            int i11 = U.f23535i;
            withTrace.n(c3895o, true);
            withTrace.n(new C3893m(this.f9468c), true);
            return Unit.f71690a;
        }
    }

    public b(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.f9464a = ozonTracker;
    }

    @Override // ru.ozon.app.android.pikazon.glide.loaders.PerformanceListener
    /* renamed from: onLoadStarted-SxA4cEA, reason: not valid java name */
    public final void mo5onLoadStartedSxA4cEA(@NotNull String url, @NotNull String uuid, long j11) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        new a(j11, url).invoke(this.f9464a.beginTrace(uuid));
    }

    @Override // ru.ozon.app.android.pikazon.glide.loaders.PerformanceListener
    public final void onResponse(@NotNull String url, @NotNull String uuid, int i11, int i12) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        new C0198b(i11, i12).invoke(this.f9464a.beginTrace(uuid));
    }
}
