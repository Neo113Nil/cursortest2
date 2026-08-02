package Qa0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23209a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23210b;

    public a(@NotNull String name, @NotNull String domain) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f23209a = name;
        this.f23210b = domain;
    }

    @NotNull
    public final String a() {
        return this.f23210b;
    }

    @NotNull
    public final String b() {
        return this.f23209a;
    }
}
