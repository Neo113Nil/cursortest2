package androidx.compose.material3.internal;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {567}, m = "anchoredDrag")
/* loaded from: classes8.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    p f40259d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f40260e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p<Object> f40261f;

    /* renamed from: g, reason: collision with root package name */
    int f40262g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f40261f = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40260e = obj;
        this.f40262g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f40261f.h(null, null, null, this);
    }
}
