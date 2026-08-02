package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {898}, m = "awaitLongPressOrCancellation-rnUCldI")
/* loaded from: classes.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    x1.x f39227d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.M f39228e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f39229f;

    /* renamed from: g, reason: collision with root package name */
    int f39230g;

    r() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39229f = obj;
        this.f39230g |= LinearLayoutManager.INVALID_OFFSET;
        return C5177u.d(null, 0L, this);
    }
}
