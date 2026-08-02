package Yh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35081a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35082b;

    public b(String name, long j11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f35081a = name;
        this.f35082b = j11;
    }

    @NotNull
    public final String a() {
        return this.f35081a;
    }

    public final long b() {
        return this.f35082b;
    }
}
