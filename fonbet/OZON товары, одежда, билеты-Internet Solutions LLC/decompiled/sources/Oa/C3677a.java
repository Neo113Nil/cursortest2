package Oa;

import Ja.k;
import Wa.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oa.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3677a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f20171a;

    public C3677a(int i11, int i12) {
        this.f20171a = new f(i11, i12);
    }

    public final void a(@NotNull k uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f20171a.c(uri.b());
    }

    public final void b(@NotNull k uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f20171a.a(uri.b());
    }
}
