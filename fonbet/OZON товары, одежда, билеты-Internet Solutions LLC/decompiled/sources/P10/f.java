package P10;

import P10.c;
import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;
import m10.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f21643a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f21644b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f21645c;

    /* renamed from: d, reason: collision with root package name */
    private i.c f21646d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21647e;

    public static final class a implements j.a {
        a() {
        }

        @Override // m10.j.a
        public final void a() {
            f.this.f21647e = false;
        }

        @Override // m10.j.a
        public final void b() {
            f fVar = f.this;
            fVar.f21647e = true;
            f.c(fVar);
        }
    }

    public static final class b implements c.b {
        b() {
        }

        @Override // P10.c.b
        public final void a() {
            f.this.f21646d = null;
        }

        @Override // P10.c.b
        public final void b(i.c result) {
            Intrinsics.checkNotNullParameter(result, "result");
            f fVar = f.this;
            fVar.f21646d = result;
            f.c(fVar);
        }
    }

    public f(@NotNull e updateCallback) {
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        this.f21643a = updateCallback;
        this.f21644b = new a();
        this.f21645c = new b();
    }

    public static final void c(f fVar) {
        i.c cVar;
        if (fVar.f21647e && (cVar = fVar.f21646d) != null) {
            fVar.f21643a.f(cVar);
            fVar.f21646d = null;
            fVar.f21647e = false;
        }
    }

    @NotNull
    public final a d() {
        return this.f21644b;
    }

    @NotNull
    public final b e() {
        return this.f21645c;
    }
}
