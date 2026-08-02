package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {973}, m = "horizontalDrag-jO51t88")
/* loaded from: classes8.dex */
final class A extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Function1 f38939d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC10628c f38940e;

    /* renamed from: f, reason: collision with root package name */
    EnumC9142v f38941f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC10628c f38942g;

    /* renamed from: h, reason: collision with root package name */
    kotlin.jvm.internal.L f38943h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f38944i;

    /* renamed from: j, reason: collision with root package name */
    int f38945j;

    A(kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f38944i = obj;
        this.f38945j |= LinearLayoutManager.INVALID_OFFSET;
        return C5177u.j(null, 0L, null, this);
    }
}
