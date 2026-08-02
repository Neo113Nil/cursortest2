package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
/* loaded from: classes8.dex */
final class e0<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Je.d f24354d;

    /* renamed from: e, reason: collision with root package name */
    boolean f24355e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24356f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f0 f24357g;

    /* renamed from: h, reason: collision with root package name */
    int f24358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(f0 f0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24357g = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24356f = obj;
        this.f24358h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24357g.c(null, this);
    }
}
