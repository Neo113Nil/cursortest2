package androidx.compose.material;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {737}, m = "restartable")
/* renamed from: androidx.compose.material.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5205c<I> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f39990d;

    /* renamed from: e, reason: collision with root package name */
    int f39991e;

    C5205c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39990d = obj;
        this.f39991e |= LinearLayoutManager.INVALID_OFFSET;
        return C5204b.b(null, null, this);
    }
}
