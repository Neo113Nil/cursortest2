package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {566}, m = "processDragCancel")
/* loaded from: classes8.dex */
final class D extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    B f38981d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f38982e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ B f38983f;

    /* renamed from: g, reason: collision with root package name */
    int f38984g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(B b11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f38983f = b11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f38982e = obj;
        this.f38984g |= LinearLayoutManager.INVALID_OFFSET;
        return B.Q1(this.f38983f, this);
    }
}
