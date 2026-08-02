package Tl0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f27200a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f27201b;

    public a(String str, @NotNull String from, @NotNull Map data) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f27200a = str;
        this.f27201b = data;
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f27201b;
    }

    public final String b() {
        return this.f27200a;
    }
}
