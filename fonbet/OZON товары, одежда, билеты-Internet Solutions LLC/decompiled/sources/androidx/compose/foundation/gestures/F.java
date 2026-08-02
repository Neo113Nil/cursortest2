package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC5172o;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {558}, m = "processDragStop")
/* loaded from: classes.dex */
final class F extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    B f39001d;

    /* renamed from: e, reason: collision with root package name */
    AbstractC5172o.d f39002e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f39003f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ B f39004g;

    /* renamed from: h, reason: collision with root package name */
    int f39005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(B b11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f39004g = b11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39003f = obj;
        this.f39005h |= LinearLayoutManager.INVALID_OFFSET;
        return B.S1(this.f39004g, null, this);
    }
}
