package I0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {425}, m = "awaitDown")
/* loaded from: classes.dex */
final class X extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f11415d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f11416e;

    /* renamed from: f, reason: collision with root package name */
    int f11417f;

    X() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f11416e = obj;
        this.f11417f |= LinearLayoutManager.INVALID_OFFSET;
        return C3176c0.a(null, this);
    }
}
