package Je0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f14693a;

    /* renamed from: b, reason: collision with root package name */
    private Thread f14694b;

    public r(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f14693a = action;
    }

    public static void a(r rVar) {
        try {
            Thread.sleep(500L);
            ((p) rVar.f14693a).invoke();
        } catch (InterruptedException unused) {
        }
    }

    public final void b() {
        Thread thread = this.f14694b;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public final void c() {
        Thread thread = new Thread(new Runnable() { // from class: Je0.q
            @Override // java.lang.Runnable
            public final void run() {
                r.a(r.this);
            }
        });
        this.f14694b = thread;
        thread.start();
    }
}
