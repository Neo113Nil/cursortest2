package A4;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.media3.ui.compose.state.PlayPauseButtonState", f = "PlayPauseButtonState.kt", l = {87}, m = "observe")
/* loaded from: classes8.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f396d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f397e;

    /* renamed from: f, reason: collision with root package name */
    int f398f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f397e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f396d = obj;
        this.f398f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f397e.d(this);
    }
}
