package Ih0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ch0.a f12535a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ch0.b f12536b;

    public g(@NotNull Ch0.a pushStatusRepository, @NotNull Ch0.b deviceStatsRepository) {
        Intrinsics.checkNotNullParameter(pushStatusRepository, "pushStatusRepository");
        Intrinsics.checkNotNullParameter(deviceStatsRepository, "deviceStatsRepository");
        this.f12535a = pushStatusRepository;
        this.f12536b = deviceStatsRepository;
    }
}
