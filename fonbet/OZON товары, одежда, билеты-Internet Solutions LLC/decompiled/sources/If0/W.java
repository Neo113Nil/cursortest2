package If0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class W implements I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f12412a;

    public W(@NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f12412a = domain;
    }

    @NotNull
    public final String a() {
        return this.f12412a;
    }
}
