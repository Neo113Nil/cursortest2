package T10;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f26511a;

    /* renamed from: b, reason: collision with root package name */
    private long f26512b;

    /* renamed from: c, reason: collision with root package name */
    private long f26513c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26514d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26515e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26516f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a f26517g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final b f26518h;

    public c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f26511a = view;
        this.f26512b = 300L;
        this.f26513c = -1L;
        this.f26517g = new a(this, 0);
        this.f26518h = new b(this, 0);
    }

    public static void a(c cVar) {
        cVar.f26515e = false;
        if (cVar.f26516f) {
            return;
        }
        cVar.f26513c = System.currentTimeMillis();
        cVar.f26511a.setVisibility(0);
    }

    public static void b(c cVar) {
        cVar.f26514d = false;
        cVar.f26513c = -1L;
        cVar.f26511a.setVisibility(8);
    }

    public final synchronized void c() {
        try {
            this.f26516f = true;
            this.f26511a.removeCallbacks(this.f26518h);
            this.f26515e = false;
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.f26513c;
            long j12 = currentTimeMillis - j11;
            if (j12 < 0 && j11 != -1) {
                if (!this.f26514d) {
                    this.f26511a.postDelayed(this.f26517g, 0 - j12);
                    this.f26514d = true;
                }
            }
            this.f26511a.setVisibility(8);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d(long j11) {
        this.f26512b = j11;
    }

    public final synchronized void e() {
        this.f26513c = -1L;
        this.f26516f = false;
        this.f26511a.removeCallbacks(this.f26517g);
        this.f26514d = false;
        if (!this.f26515e) {
            this.f26511a.postDelayed(this.f26518h, this.f26512b);
            this.f26515e = true;
        }
    }
}
