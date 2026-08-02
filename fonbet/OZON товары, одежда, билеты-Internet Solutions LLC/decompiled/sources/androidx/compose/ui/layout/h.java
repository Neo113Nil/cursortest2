package androidx.compose.ui.layout;

import D1.B;
import Z1.q;
import Z1.r;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class h extends e.c implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super q, Unit> f40486a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40487b = true;

    /* renamed from: c, reason: collision with root package name */
    private long f40488c = r.a(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);

    public h(@NotNull Function1<? super q, Unit> function1) {
        this.f40486a = function1;
    }

    @Override // D1.B
    public final void E(long j11) {
        if (q.c(this.f40488c, j11)) {
            return;
        }
        this.f40486a.invoke(q.a(j11));
        this.f40488c = j11;
    }

    public final void I1(@NotNull Function1<? super q, Unit> function1) {
        this.f40486a = function1;
        this.f40488c = r.a(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return this.f40487b;
    }
}
