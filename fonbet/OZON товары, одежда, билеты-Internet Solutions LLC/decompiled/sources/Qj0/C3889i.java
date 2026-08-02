package Qj0;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3889i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23653a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23654b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f23655c;

    public C3889i(@NotNull String url, @NotNull String traceKey, @NotNull Map headers, @NotNull String method) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(traceKey, "traceKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f23653a = url;
        this.f23654b = traceKey;
        this.f23655c = headers;
    }

    @NotNull
    public final Map<String, List<String>> a() {
        return this.f23655c;
    }

    @NotNull
    public final String b() {
        return this.f23654b;
    }

    @NotNull
    public final String c() {
        return this.f23653a;
    }
}
