package Ka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f15439a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15440b;

    public b(String str, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f15439a = array;
        this.f15440b = str;
    }

    @NotNull
    public final byte[] a() {
        return this.f15439a;
    }

    public final int b() {
        return this.f15439a.length;
    }

    public final String c() {
        return this.f15440b;
    }
}
