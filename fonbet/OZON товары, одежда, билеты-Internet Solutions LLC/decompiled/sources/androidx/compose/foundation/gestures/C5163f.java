package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1111}, m = "restartable")
/* renamed from: androidx.compose.foundation.gestures.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5163f<I> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f39135d;

    /* renamed from: e, reason: collision with root package name */
    int f39136e;

    C5163f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39135d = obj;
        this.f39136e |= LinearLayoutManager.INVALID_OFFSET;
        return C5158a.d(null, null, this);
    }
}
