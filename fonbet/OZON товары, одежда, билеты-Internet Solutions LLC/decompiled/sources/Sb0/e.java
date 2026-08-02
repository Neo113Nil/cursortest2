package Sb0;

import Od0.a;
import dc0.C6178x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.f;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Wb0.c f26088a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6178x f26089b;

    public e(@NotNull Wb0.c ozonIdEventsLogger, @NotNull C6178x currentUserRepository) {
        Intrinsics.checkNotNullParameter(ozonIdEventsLogger, "ozonIdEventsLogger");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f26088a = ozonIdEventsLogger;
        this.f26089b = currentUserRepository;
    }

    @NotNull
    public final a.C0408a c() {
        C10727i.c(f.a(), null, null, new d(this, null), 3);
        return new a.C0408a();
    }
}
