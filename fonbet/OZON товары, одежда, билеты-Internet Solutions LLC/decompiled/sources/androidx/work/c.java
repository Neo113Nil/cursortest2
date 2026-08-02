package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.impl.C5475c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final ExecutorService f45260a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final ExecutorService f45261b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    final z f45262c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    final He.g f45263d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    final C5475c f45264e;

    /* renamed from: f, reason: collision with root package name */
    final int f45265f;

    /* renamed from: g, reason: collision with root package name */
    final int f45266g;

    /* renamed from: h, reason: collision with root package name */
    final int f45267h;

    public static final class a {
        @NonNull
        public final c a() {
            return new c(this);
        }
    }

    public interface b {
        @NonNull
        c getWorkManagerConfiguration();
    }

    c(@NonNull a aVar) {
        aVar.getClass();
        this.f45260a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new androidx.work.b(false));
        this.f45261b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new androidx.work.b(true));
        int i11 = z.f45567b;
        this.f45262c = new y();
        this.f45263d = new k();
        this.f45264e = new C5475c();
        this.f45265f = 4;
        this.f45266g = Integer.MAX_VALUE;
        this.f45267h = 20;
    }

    @NonNull
    public final ExecutorService a() {
        return this.f45260a;
    }

    @NonNull
    public final He.g b() {
        return this.f45263d;
    }

    public final int c() {
        return this.f45266g;
    }

    public final int d() {
        return this.f45267h;
    }

    public final int e() {
        return this.f45265f;
    }

    @NonNull
    public final C5475c f() {
        return this.f45264e;
    }

    @NonNull
    public final ExecutorService g() {
        return this.f45261b;
    }

    @NonNull
    public final z h() {
        return this.f45262c;
    }
}
