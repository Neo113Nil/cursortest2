package Qj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceRepositoryImpl", f = "TraceRepository.kt", l = {61}, m = "getLocalPerfEvents")
/* loaded from: classes3.dex */
final class n0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    p0 f23687d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f23688e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p0 f23689f;

    /* renamed from: g, reason: collision with root package name */
    int f23690g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(p0 p0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f23689f = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23688e = obj;
        this.f23690g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f23689f.f(null, this);
    }
}
