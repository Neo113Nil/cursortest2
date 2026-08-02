package H1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {306}, m = "scrollBy")
/* loaded from: classes8.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f10487d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f10488e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f10489f;

    /* renamed from: g, reason: collision with root package name */
    int f10490g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f10489f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object e11;
        this.f10488e = obj;
        this.f10490g |= LinearLayoutManager.INVALID_OFFSET;
        e11 = this.f10489f.e(0.0f, this);
        return e11;
    }
}
