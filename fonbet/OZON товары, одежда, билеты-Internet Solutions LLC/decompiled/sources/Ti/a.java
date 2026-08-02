package Ti;

import Bi.k;
import Hi.l;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class a implements k {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Ci.k, Unit> f27181b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Function1<? super List<? extends l>, Unit>, Unit> f27182c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Function1<? super Hi.g, Unit>, Unit> f27183d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super Ci.k, Unit> doLaunch, @NotNull Function1<? super Function1<? super List<? extends l>, Unit>, Unit> setLegacyListener, @NotNull Function1<? super Function1<? super Hi.g, Unit>, Unit> setListener) {
        Intrinsics.checkNotNullParameter(doLaunch, "doLaunch");
        Intrinsics.checkNotNullParameter(setLegacyListener, "setLegacyListener");
        Intrinsics.checkNotNullParameter(setListener, "setListener");
        this.f27181b = doLaunch;
        this.f27182c = setLegacyListener;
        this.f27183d = setListener;
    }

    @Override // Bi.k
    public final void a(@NotNull Ci.k config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f27181b.invoke(config);
    }

    @Override // Bi.k
    public final void b(@NotNull Ci.k config, @NotNull Function1<? super Hi.g, Unit> onResult) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.f27183d.invoke(onResult);
        this.f27181b.invoke(config);
    }
}
