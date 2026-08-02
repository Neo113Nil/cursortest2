package He;

import B3.D;
import org.jetbrains.annotations.NotNull;
import xe.Q;

/* loaded from: classes.dex */
final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Runnable f10886c;

    public i(@NotNull Runnable runnable, long j11, boolean z11) {
        super(j11, z11);
        this.f10886c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10886c.run();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f10886c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(Q.a(runnable));
        sb2.append(", ");
        sb2.append(this.f10884a);
        sb2.append(", ");
        return D.c(sb2, this.f10885b ? "Blocking" : "Non-blocking", ']');
    }
}
