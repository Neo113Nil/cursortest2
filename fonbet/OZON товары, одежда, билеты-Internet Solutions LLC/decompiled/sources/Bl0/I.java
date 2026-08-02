package Bl0;

import Bl0.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final V f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final C2649j f3922b;

    /* renamed from: c, reason: collision with root package name */
    public final X f3923c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f3924d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.b f3925e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3926f;

    public I(V sendMetricsEventInteractor, C2649j enqueueMetricsEventUseCase, X sendMetricsEventJobScheduler, h0 singleThreadDispatcher, b0.b logger) {
        Intrinsics.checkNotNullParameter(sendMetricsEventInteractor, "sendMetricsEventInteractor");
        Intrinsics.checkNotNullParameter(enqueueMetricsEventUseCase, "enqueueMetricsEventUseCase");
        Intrinsics.checkNotNullParameter(sendMetricsEventJobScheduler, "sendMetricsEventJobScheduler");
        Intrinsics.checkNotNullParameter(singleThreadDispatcher, "singleThreadDispatcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f3921a = sendMetricsEventInteractor;
        this.f3922b = enqueueMetricsEventUseCase;
        this.f3923c = sendMetricsEventJobScheduler;
        this.f3924d = singleThreadDispatcher;
        this.f3925e = logger;
    }
}
