package F0;

import B0.EnumC2526y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {980}, m = "detectSelectionHandleDragGestures")
/* loaded from: classes8.dex */
final class q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C2990k f8334d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.L f8335e;

    /* renamed from: f, reason: collision with root package name */
    kotlin.jvm.internal.L f8336f;

    /* renamed from: g, reason: collision with root package name */
    EnumC2526y0 f8337g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f8338h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C2990k f8339i;

    /* renamed from: j, reason: collision with root package name */
    int f8340j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(C2990k c2990k, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8339i = c2990k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8338h = obj;
        this.f8340j |= LinearLayoutManager.INVALID_OFFSET;
        return C2990k.c(this.f8339i, null, false, this);
    }
}
