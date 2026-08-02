package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {70}, m = "emitAbort$FlowKt__LimitKt")
/* loaded from: classes10.dex */
final class M<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f851d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f852e;

    /* renamed from: f, reason: collision with root package name */
    int f853f;

    M(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f852e = obj;
        this.f853f |= LinearLayoutManager.INVALID_OFFSET;
        return T.a(null, null, null, this);
    }
}
