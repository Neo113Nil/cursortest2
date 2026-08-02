package Qj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceRepositoryImpl", f = "TraceRepository.kt", l = {56}, m = "getLocalPerfEvents")
/* loaded from: classes7.dex */
final class m0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    p0 f23682d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f23683e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p0 f23684f;

    /* renamed from: g, reason: collision with root package name */
    int f23685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m0(p0 p0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f23684f = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23683e = obj;
        this.f23685g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f23684f.g(this);
    }
}
