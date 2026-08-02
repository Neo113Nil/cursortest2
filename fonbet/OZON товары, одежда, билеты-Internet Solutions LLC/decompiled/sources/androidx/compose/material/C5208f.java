package androidx.compose.material;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {539}, m = "anchoredDrag")
/* renamed from: androidx.compose.material.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5208f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C5210h f40030d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f40031e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5210h<Object> f40032f;

    /* renamed from: g, reason: collision with root package name */
    int f40033g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5208f(C5210h c5210h, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f40032f = c5210h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40031e = obj;
        this.f40033g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f40032f.i(null, null, this);
    }
}
