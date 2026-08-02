package a10;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a10.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4915c {

    /* renamed from: a, reason: collision with root package name */
    private final String f36192a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f36193b;

    public C4915c(String str, @NotNull String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f36192a = str;
        this.f36193b = location;
    }

    public final String a() {
        return this.f36192a;
    }

    @NotNull
    public final String b() {
        return this.f36193b;
    }
}
