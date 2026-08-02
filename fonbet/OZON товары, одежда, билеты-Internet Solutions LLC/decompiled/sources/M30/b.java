package M30;

import Cm.d;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f17370a;

    /* renamed from: b, reason: collision with root package name */
    private long f17371b;

    /* renamed from: c, reason: collision with root package name */
    private long f17372c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17373d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17374e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17375f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final d f17376g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final a f17377h;

    public b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f17370a = view;
        this.f17371b = 300L;
        this.f17372c = -1L;
        this.f17376g = new d(this, 1);
        this.f17377h = new a(this, 0);
    }

    public static void a(b bVar) {
        bVar.f17373d = false;
        bVar.f17372c = -1L;
        bVar.f17370a.setVisibility(8);
    }

    public static void b(b bVar) {
        bVar.f17374e = false;
        if (bVar.f17375f) {
            return;
        }
        bVar.f17372c = System.currentTimeMillis();
        bVar.f17370a.setVisibility(0);
    }

    public final void c() {
        this.f17372c = -1L;
        this.f17373d = false;
        this.f17374e = false;
        this.f17375f = false;
        a aVar = this.f17377h;
        View view = this.f17370a;
        view.removeCallbacks(aVar);
        view.removeCallbacks(this.f17376g);
    }

    public final synchronized void d() {
        try {
            this.f17375f = true;
            this.f17370a.removeCallbacks(this.f17377h);
            this.f17374e = false;
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.f17372c;
            long j12 = currentTimeMillis - j11;
            if (j12 < 0 && j11 != -1) {
                if (!this.f17373d) {
                    this.f17370a.postDelayed(this.f17376g, 0 - j12);
                    this.f17373d = true;
                }
            }
            this.f17370a.setVisibility(8);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e(long j11) {
        this.f17371b = j11;
    }

    public final synchronized void f() {
        this.f17372c = -1L;
        this.f17375f = false;
        this.f17370a.removeCallbacks(this.f17376g);
        this.f17373d = false;
        if (!this.f17374e) {
            this.f17370a.postDelayed(this.f17377h, this.f17371b);
            this.f17374e = true;
        }
    }
}
