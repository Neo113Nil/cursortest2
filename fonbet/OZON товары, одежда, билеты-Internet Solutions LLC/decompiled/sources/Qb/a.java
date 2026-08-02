package Qb;

import Nb.C3666a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f23211a;

    static {
        C3666a.i(new C3666a());
        C3666a.g(new C3666a());
    }

    public a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f23211a = data;
    }

    @NotNull
    public final byte[] a() {
        return this.f23211a;
    }
}
