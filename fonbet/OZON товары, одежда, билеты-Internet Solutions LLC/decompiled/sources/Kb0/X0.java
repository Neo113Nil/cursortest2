package Kb0;

import f3.C6410b;
import f3.C6411c;
import jd0.AbstractC7348a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f15594a;

    /* renamed from: b, reason: collision with root package name */
    private Bc0.a f15595b;

    public X0(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f15594a = di;
    }

    public final Bc0.a c() {
        return this.f15595b;
    }

    @NotNull
    public final C6410b d(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        C6411c c6411c = new C6411c();
        c6411c.a(kotlin.jvm.internal.N.b(AbstractC7348a.class), new V0(this, link));
        return c6411c.b();
    }

    @NotNull
    public final W0 e(@NotNull M4.e owner, String str, boolean z11, String str2, boolean z12, String str3, boolean z13, Ib0.c cVar) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return new W0(owner, z11, this, str, z12, z13, str3, cVar, str2);
    }
}
