package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class La extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final Yn f29396b;

    /* renamed from: c, reason: collision with root package name */
    public final Y9 f29397c;

    /* renamed from: d, reason: collision with root package name */
    public final Te f29398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public La(Yn fingerprintInteractor, Ib sPayStorage, Y9 sPaySdkReducer, Te metricUtil) {
        super(10);
        Intrinsics.checkNotNullParameter(fingerprintInteractor, "fingerprintInteractor");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(metricUtil, "metricUtil");
        this.f29396b = fingerprintInteractor;
        this.f29397c = sPaySdkReducer;
        this.f29398d = metricUtil;
    }
}
