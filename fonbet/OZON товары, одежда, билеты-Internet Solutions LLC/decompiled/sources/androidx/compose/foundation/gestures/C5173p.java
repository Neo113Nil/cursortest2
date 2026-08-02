package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {967}, m = "awaitDragOrCancellation-rnUCldI")
/* renamed from: androidx.compose.foundation.gestures.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5173p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f39215d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.L f39216e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f39217f;

    /* renamed from: g, reason: collision with root package name */
    int f39218g;

    C5173p(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39217f = obj;
        this.f39218g |= LinearLayoutManager.INVALID_OFFSET;
        return C5177u.b(null, 0L, this);
    }
}
