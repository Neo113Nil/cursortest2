package H1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {129, 132}, m = "onScrollCaptureImageRequest")
/* loaded from: classes8.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f10471d;

    /* renamed from: e, reason: collision with root package name */
    Object f10472e;

    /* renamed from: f, reason: collision with root package name */
    Z1.o f10473f;

    /* renamed from: g, reason: collision with root package name */
    int f10474g;

    /* renamed from: h, reason: collision with root package name */
    int f10475h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f10476i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ d f10477j;

    /* renamed from: k, reason: collision with root package name */
    int f10478k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f10477j = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f10476i = obj;
        this.f10478k |= LinearLayoutManager.INVALID_OFFSET;
        return d.d(this.f10477j, null, null, this);
    }
}
