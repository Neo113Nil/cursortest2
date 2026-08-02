package Wg;

import Wg.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private a f33854a = a.C0600a.a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Ej.b f33855b = g.a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Ej.b f33856c = b.a();

    @NotNull
    public final d a() {
        return new d(this.f33854a, this.f33855b, this.f33856c);
    }

    @NotNull
    public final void b(@NotNull a composerRecyclerViewProvider) {
        Intrinsics.checkNotNullParameter(composerRecyclerViewProvider, "composerRecyclerViewProvider");
        this.f33854a = composerRecyclerViewProvider;
    }
}
