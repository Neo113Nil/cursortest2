package P0;

import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {446, 449}, m = "showSnackbar")
/* loaded from: classes8.dex */
final class O1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    N1 f20740d;

    /* renamed from: e, reason: collision with root package name */
    d2 f20741e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC3394a f20742f;

    /* renamed from: g, reason: collision with root package name */
    Object f20743g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f20744h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ N1 f20745i;

    /* renamed from: j, reason: collision with root package name */
    int f20746j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O1(N1 n12, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20745i = n12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20744h = obj;
        this.f20746j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f20745i.b(null, this);
    }
}
