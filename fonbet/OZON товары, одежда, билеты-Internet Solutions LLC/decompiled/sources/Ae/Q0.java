package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {418, 422}, m = "onSubscription")
/* loaded from: classes10.dex */
final class Q0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    R0 f893d;

    /* renamed from: e, reason: collision with root package name */
    Be.B f894e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f895f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ R0<Object> f896g;

    /* renamed from: h, reason: collision with root package name */
    int f897h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(R0 r02, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f896g = r02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f895f = obj;
        this.f897h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f896g.a(this);
    }
}
