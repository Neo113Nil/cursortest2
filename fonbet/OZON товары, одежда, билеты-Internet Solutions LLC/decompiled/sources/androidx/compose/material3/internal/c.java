package androidx.compose.material3.internal;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {713}, m = "restartable")
/* loaded from: classes8.dex */
final class c<I> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f40228d;

    /* renamed from: e, reason: collision with root package name */
    int f40229e;

    c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40228d = obj;
        this.f40229e |= LinearLayoutManager.INVALID_OFFSET;
        return e.b(null, null, this);
    }
}
