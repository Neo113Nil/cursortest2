package T2;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f26519a = new AtomicBoolean(false);

    public final boolean a() {
        return this.f26519a.get();
    }

    public final void b() {
        this.f26519a.set(true);
    }
}
