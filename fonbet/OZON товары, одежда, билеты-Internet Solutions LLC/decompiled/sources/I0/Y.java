package I0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {158, 181}, m = "mouseSelection")
/* loaded from: classes8.dex */
final class Y extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f11428d;

    /* renamed from: e, reason: collision with root package name */
    r f11429e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f11430f;

    /* renamed from: g, reason: collision with root package name */
    int f11431g;

    Y(kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f11430f = obj;
        this.f11431g |= LinearLayoutManager.INVALID_OFFSET;
        return C3176c0.c(null, null, null, null, this);
    }
}
