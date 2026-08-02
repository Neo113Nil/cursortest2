package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
/* loaded from: classes.dex */
final class d0<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f24347d;

    /* renamed from: e, reason: collision with root package name */
    Je.d f24348e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24349f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f0 f24350g;

    /* renamed from: h, reason: collision with root package name */
    int f24351h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(f0 f0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24350g = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24349f = obj;
        this.f24351h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24350g.b(null, this);
    }
}
