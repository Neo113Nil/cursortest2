package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.t.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import x0.C10584M;
import x0.b0;
import x0.d0;
import x0.e0;
import x0.f0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f39663a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7737t f39664b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d0 f39665c;

    /* renamed from: d, reason: collision with root package name */
    private t f39666d;

    private final class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f39667a = new ArrayList();

        public a() {
        }

        @Override // x0.b0
        public final void a(int i11) {
            long j11;
            j11 = C10584M.f104687a;
            o oVar = o.this;
            t c11 = oVar.c();
            if (c11 == null) {
                return;
            }
            this.f39667a.add(c11.new a(i11, j11, oVar.f39665c));
        }

        @NotNull
        public final ArrayList b() {
            return this.f39667a;
        }
    }

    public interface b {
        void a();

        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(f0 f0Var, Function1<? super b0, Unit> function1) {
        this.f39663a = f0Var;
        this.f39664b = (AbstractC7737t) function1;
        this.f39665c = new d0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @NotNull
    public final List<e0> b() {
        ?? r02 = this.f39664b;
        if (r02 == 0) {
            return K.f71697a;
        }
        a aVar = new a();
        r02.invoke(aVar);
        return aVar.b();
    }

    public final t c() {
        return this.f39666d;
    }

    public final f0 d() {
        return this.f39663a;
    }

    @NotNull
    public final b e(int i11, long j11) {
        t tVar = this.f39666d;
        return tVar != null ? tVar.c(i11, j11, this.f39665c) : androidx.compose.foundation.lazy.layout.a.f39605a;
    }

    public final void f(t tVar) {
        this.f39666d = tVar;
    }

    public o() {
        this(null, null);
    }
}
