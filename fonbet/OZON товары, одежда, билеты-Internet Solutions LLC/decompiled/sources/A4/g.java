package A4;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.media3.ui.compose.state.PresentationState", f = "PresentationState.kt", l = {105}, m = "observe")
/* loaded from: classes8.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    h f406d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f407e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f408f;

    /* renamed from: g, reason: collision with root package name */
    int f409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f408f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f407e = obj;
        this.f409g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f408f.f(null, this);
    }
}
