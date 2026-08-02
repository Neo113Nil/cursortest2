package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {108}, m = "drag-jO51t88")
/* loaded from: classes8.dex */
final class z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f39278d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f39279e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f39280f;

    /* renamed from: g, reason: collision with root package name */
    int f39281g;

    z(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39280f = obj;
        this.f39281g |= LinearLayoutManager.INVALID_OFFSET;
        return C5177u.i(null, 0L, null, this);
    }
}
