package Bl0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final C2641b f3940a;

    /* renamed from: b, reason: collision with root package name */
    public final C2647h f3941b;

    /* renamed from: c, reason: collision with root package name */
    public final J f3942c;

    /* renamed from: d, reason: collision with root package name */
    public final C2651l f3943d;

    public P(C2641b userIdDataSource, C2647h packageNameDataSource, J remoteMetricsEventDataSource, C2651l versionNameDataSource) {
        Intrinsics.checkNotNullParameter(userIdDataSource, "userIdDataSource");
        Intrinsics.checkNotNullParameter(packageNameDataSource, "packageNameDataSource");
        Intrinsics.checkNotNullParameter(remoteMetricsEventDataSource, "remoteMetricsEventDataSource");
        Intrinsics.checkNotNullParameter(versionNameDataSource, "versionNameDataSource");
        this.f3940a = userIdDataSource;
        this.f3941b = packageNameDataSource;
        this.f3942c = remoteMetricsEventDataSource;
        this.f3943d = versionNameDataSource;
    }
}
