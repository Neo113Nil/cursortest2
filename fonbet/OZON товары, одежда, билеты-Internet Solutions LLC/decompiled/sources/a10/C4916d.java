package a10;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a10.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4916d extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final String f36194a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f36195b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final k f36196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4916d(String str, @NotNull String location, @NotNull k type) {
        super(Sh.b.c("Redirect ", type.name(), " on ", location));
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f36194a = str;
        this.f36195b = location;
        this.f36196c = type;
    }

    public final String a() {
        return this.f36194a;
    }

    @NotNull
    public final String b() {
        return this.f36195b;
    }

    @NotNull
    public final k d() {
        return this.f36196c;
    }
}
