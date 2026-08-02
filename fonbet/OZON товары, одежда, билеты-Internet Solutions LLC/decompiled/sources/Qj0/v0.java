package Qj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.UserDataController", f = "UserDataController.kt", l = {91}, m = "getUserData")
/* loaded from: classes7.dex */
final class v0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    u0 f23731d;

    /* renamed from: e, reason: collision with root package name */
    Je.d f23732e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f23733f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ u0 f23734g;

    /* renamed from: h, reason: collision with root package name */
    int f23735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v0(u0 u0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f23734g = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23733f = obj;
        this.f23735h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f23734g.e(this);
    }
}
