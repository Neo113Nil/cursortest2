package F0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {614}, m = "detectCursorHandleDragGestures")
/* renamed from: F0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2991l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C2990k f8316d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.L f8317e;

    /* renamed from: f, reason: collision with root package name */
    kotlin.jvm.internal.L f8318f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f8319g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2990k f8320h;

    /* renamed from: i, reason: collision with root package name */
    int f8321i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2991l(C2990k c2990k, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8320h = c2990k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8319g = obj;
        this.f8321i |= LinearLayoutManager.INVALID_OFFSET;
        return C2990k.a(this.f8320h, null, this);
    }
}
