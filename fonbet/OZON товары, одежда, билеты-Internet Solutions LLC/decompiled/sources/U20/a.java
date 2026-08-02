package U20;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27289a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f27290b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<b> f27291c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull String id2, @NotNull String title, @NotNull List<? extends b> list) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f27289a = id2;
        this.f27290b = title;
        this.f27291c = list;
    }

    @NotNull
    public final String a() {
        return this.f27289a;
    }

    @NotNull
    public final List<b> b() {
        return this.f27291c;
    }

    @NotNull
    public final String c() {
        return this.f27290b;
    }
}
