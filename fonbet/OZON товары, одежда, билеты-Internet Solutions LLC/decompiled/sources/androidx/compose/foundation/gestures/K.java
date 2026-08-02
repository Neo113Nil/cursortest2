package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import r0.C9113N;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {966}, m = "semanticsScrollBy-d-4ec7I")
/* loaded from: classes8.dex */
final class K extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9113N f39042d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.J f39043e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f39044f;

    /* renamed from: g, reason: collision with root package name */
    int f39045g;

    K(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39044f = obj;
        this.f39045g |= LinearLayoutManager.INVALID_OFFSET;
        return J.d(null, 0L, this);
    }
}
