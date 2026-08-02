package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1049}, m = "animateToWithDecay")
/* renamed from: androidx.compose.foundation.gestures.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5161d<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    float f39120d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.J f39121e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f39122f;

    /* renamed from: g, reason: collision with root package name */
    int f39123g;

    C5161d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39122f = obj;
        this.f39123g |= LinearLayoutManager.INVALID_OFFSET;
        return C5158a.g(null, null, 0.0f, this);
    }
}
