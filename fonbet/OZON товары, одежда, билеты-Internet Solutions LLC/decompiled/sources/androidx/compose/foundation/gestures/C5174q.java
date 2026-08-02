package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {972, 1014}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
/* renamed from: androidx.compose.foundation.gestures.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5174q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Function2 f39219d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC10628c f39220e;

    /* renamed from: f, reason: collision with root package name */
    kotlin.jvm.internal.L f39221f;

    /* renamed from: g, reason: collision with root package name */
    Object f39222g;

    /* renamed from: h, reason: collision with root package name */
    x1.x f39223h;

    /* renamed from: i, reason: collision with root package name */
    float f39224i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f39225j;

    /* renamed from: k, reason: collision with root package name */
    int f39226k;

    C5174q(kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39225j = obj;
        this.f39226k |= LinearLayoutManager.INVALID_OFFSET;
        return C5177u.c(null, 0L, 0, null, this);
    }
}
