package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {972, 1014}, m = "awaitTouchSlopOrCancellation-jO51t88")
/* renamed from: androidx.compose.foundation.gestures.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5176t extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Function2 f39237d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC10628c f39238e;

    /* renamed from: f, reason: collision with root package name */
    kotlin.jvm.internal.L f39239f;

    /* renamed from: g, reason: collision with root package name */
    Object f39240g;

    /* renamed from: h, reason: collision with root package name */
    x1.x f39241h;

    /* renamed from: i, reason: collision with root package name */
    float f39242i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f39243j;

    /* renamed from: k, reason: collision with root package name */
    int f39244k;

    C5176t(kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39243j = obj;
        this.f39244k |= LinearLayoutManager.INVALID_OFFSET;
        return C5177u.e(null, 0L, null, this);
    }
}
