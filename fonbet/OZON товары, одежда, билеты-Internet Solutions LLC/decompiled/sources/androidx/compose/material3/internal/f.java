package androidx.compose.material3.internal;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {520}, m = "anchoredDrag")
/* loaded from: classes8.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    p f40247d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f40248e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p<Object> f40249f;

    /* renamed from: g, reason: collision with root package name */
    int f40250g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f40249f = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40248e = obj;
        this.f40250g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f40249f.i(null, null, this);
    }
}
