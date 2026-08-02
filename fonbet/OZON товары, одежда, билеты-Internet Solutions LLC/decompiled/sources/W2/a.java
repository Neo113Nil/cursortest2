package W2;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f33200a;

    public a(boolean z11) {
        this.f33200a = new AtomicBoolean(z11);
    }

    public final boolean a() {
        return this.f33200a.get();
    }

    public final void b() {
        this.f33200a.set(true);
    }
}
