package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
/* loaded from: classes.dex */
final class D0<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C0 f784d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC2397i f785e;

    /* renamed from: f, reason: collision with root package name */
    F0 f786f;

    /* renamed from: g, reason: collision with root package name */
    xe.B0 f787g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f788h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C0<T> f789i;

    /* renamed from: j, reason: collision with root package name */
    int f790j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D0(C0<T> c02, kotlin.coroutines.d<? super D0> dVar) {
        super(dVar);
        this.f789i = c02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f788h = obj;
        this.f790j |= LinearLayoutManager.INVALID_OFFSET;
        return C0.n(this.f789i, null, this);
    }
}
