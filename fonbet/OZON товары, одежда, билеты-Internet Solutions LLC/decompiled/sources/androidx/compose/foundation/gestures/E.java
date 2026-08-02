package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC5172o;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import t0.C9713b;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {548, 551}, m = "processDragStart")
/* loaded from: classes.dex */
final class E extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    B f38995d;

    /* renamed from: e, reason: collision with root package name */
    AbstractC5172o.c f38996e;

    /* renamed from: f, reason: collision with root package name */
    C9713b f38997f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f38998g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ B f38999h;

    /* renamed from: i, reason: collision with root package name */
    int f39000i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(B b11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f38999h = b11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f38998g = obj;
        this.f39000i |= LinearLayoutManager.INVALID_OFFSET;
        return B.R1(this.f38999h, null, this);
    }
}
