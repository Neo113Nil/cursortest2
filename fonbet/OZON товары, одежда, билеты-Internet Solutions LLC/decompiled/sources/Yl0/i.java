package Yl0;

import De.C2862e;
import bb.InterfaceC5614a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Nl0.a f35166a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Nl0.k f35167b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC5614a f35168c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final C2862e f35169d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Za.d f35170e;

    public i(@NotNull Nl0.a activityLifecycleRepository, @NotNull Nl0.k notificationIdRepository, @NotNull InterfaceC5614a analyticsSender, @NotNull C2862e coroutineScope, @NotNull Za.d rootLogger) {
        Intrinsics.checkNotNullParameter(activityLifecycleRepository, "activityLifecycleRepository");
        Intrinsics.checkNotNullParameter(notificationIdRepository, "notificationIdRepository");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(rootLogger, "rootLogger");
        this.f35166a = activityLifecycleRepository;
        this.f35167b = notificationIdRepository;
        this.f35168c = analyticsSender;
        this.f35169d = coroutineScope;
        this.f35170e = rootLogger.a(this);
    }
}
