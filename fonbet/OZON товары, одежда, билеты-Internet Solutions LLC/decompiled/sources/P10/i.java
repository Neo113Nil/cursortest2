package P10;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f21651a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final N10.h f21652b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final l f21653c;

    public i(int i11, @NotNull N10.h config, @NotNull l data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f21651a = i11;
        this.f21652b = config;
        this.f21653c = data;
    }

    public final int a() {
        return this.f21651a;
    }

    @NotNull
    public final N10.h b() {
        return this.f21652b;
    }

    @NotNull
    public final l c() {
        return this.f21653c;
    }
}
