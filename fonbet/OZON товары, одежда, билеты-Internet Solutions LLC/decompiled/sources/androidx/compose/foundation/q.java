package androidx.compose.foundation;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {111}, m = "emitEnter")
/* loaded from: classes8.dex */
final class q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f39724d;

    /* renamed from: e, reason: collision with root package name */
    t0.j f39725e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f39726f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ s f39727g;

    /* renamed from: h, reason: collision with root package name */
    int f39728h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(s sVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f39727g = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39726f = obj;
        this.f39728h |= LinearLayoutManager.INVALID_OFFSET;
        return s.I1(this.f39727g, this);
    }
}
