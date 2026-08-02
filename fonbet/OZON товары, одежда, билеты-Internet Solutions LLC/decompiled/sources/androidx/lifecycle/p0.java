package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f43371a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f43372b;

    /* renamed from: c, reason: collision with root package name */
    private a f43373c;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final L f43374a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractC5434v.a f43375b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f43376c;

        public a(@NotNull L registry, @NotNull AbstractC5434v.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f43374a = registry;
            this.f43375b = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f43376c) {
                return;
            }
            this.f43374a.h(this.f43375b);
            this.f43376c = true;
        }
    }

    public p0(@NotNull N provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f43371a = new L(provider);
        this.f43372b = new Handler();
    }

    private final void f(AbstractC5434v.a aVar) {
        a aVar2 = this.f43373c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f43371a, aVar);
        this.f43373c = aVar3;
        this.f43372b.postAtFrontOfQueue(aVar3);
    }

    @NotNull
    public final L a() {
        return this.f43371a;
    }

    public final void b() {
        f(AbstractC5434v.a.ON_START);
    }

    public final void c() {
        f(AbstractC5434v.a.ON_CREATE);
    }

    public final void d() {
        f(AbstractC5434v.a.ON_STOP);
        f(AbstractC5434v.a.ON_DESTROY);
    }

    public final void e() {
        f(AbstractC5434v.a.ON_START);
    }
}
