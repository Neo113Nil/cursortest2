package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5436x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC5434v f43400a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC5434v.b f43401b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5425l f43402c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C5435w f43403d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.I, androidx.lifecycle.w] */
    public C5436x(@NotNull AbstractC5434v lifecycle, @NotNull AbstractC5434v.b minState, @NotNull C5425l dispatchQueue, @NotNull final xe.B0 parentJob) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minState, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.f43400a = lifecycle;
        this.f43401b = minState;
        this.f43402c = dispatchQueue;
        ?? r32 = new G() { // from class: androidx.lifecycle.w
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                C5436x.a(C5436x.this, parentJob, j11, aVar);
            }
        };
        this.f43403d = r32;
        if (lifecycle.b() != AbstractC5434v.b.DESTROYED) {
            lifecycle.a(r32);
        } else {
            parentJob.j(null);
            b();
        }
    }

    public static void a(C5436x this$0, xe.B0 parentJob, J source, AbstractC5434v.a aVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentJob, "$parentJob");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
        if (source.getLifecycle().b() == AbstractC5434v.b.DESTROYED) {
            parentJob.j(null);
            this$0.b();
            return;
        }
        int compareTo = source.getLifecycle().b().compareTo(this$0.f43401b);
        C5425l c5425l = this$0.f43402c;
        if (compareTo < 0) {
            c5425l.f();
        } else {
            c5425l.g();
        }
    }

    public final void b() {
        this.f43400a.e(this.f43403d);
        this.f43402c.e();
    }
}
