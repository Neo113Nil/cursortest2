package I0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {351, 377}, m = "mouseSelectionBtf2")
/* renamed from: I0.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3172a0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f11442d;

    /* renamed from: e, reason: collision with root package name */
    r f11443e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f11444f;

    /* renamed from: g, reason: collision with root package name */
    int f11445g;

    C3172a0(kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f11444f = obj;
        this.f11445g |= LinearLayoutManager.INVALID_OFFSET;
        return C3176c0.d(null, null, null, null, this);
    }
}
