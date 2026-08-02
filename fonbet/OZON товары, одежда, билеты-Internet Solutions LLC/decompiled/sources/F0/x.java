package F0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {423}, m = "observeChanges")
/* loaded from: classes8.dex */
final class x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C2990k f8362d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f8363e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2990k f8364f;

    /* renamed from: g, reason: collision with root package name */
    int f8365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(C2990k c2990k, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8364f = c2990k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8363e = obj;
        this.f8365g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8364f.V(this);
    }
}
