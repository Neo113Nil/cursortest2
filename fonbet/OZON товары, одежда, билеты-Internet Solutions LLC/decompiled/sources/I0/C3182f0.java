package I0;

import B0.InterfaceC2477h1;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {238, 241}, m = "touchSelectionFirstPress")
/* renamed from: I0.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3182f0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f11509d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC2477h1 f11510e;

    /* renamed from: f, reason: collision with root package name */
    x1.x f11511f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f11512g;

    /* renamed from: h, reason: collision with root package name */
    int f11513h;

    C3182f0(kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f11512g = obj;
        this.f11513h |= LinearLayoutManager.INVALID_OFFSET;
        return C3176c0.f(null, null, null, this);
    }
}
