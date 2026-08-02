package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
/* renamed from: R2.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3923q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C3922p f24452d;

    /* renamed from: e, reason: collision with root package name */
    Je.d f24453e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24454f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24455g;

    /* renamed from: h, reason: collision with root package name */
    int f24456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3923q(C3922p c3922p, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24455g = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24454f = obj;
        this.f24456h |= LinearLayoutManager.INVALID_OFFSET;
        return C3922p.b(this.f24455g, this);
    }
}
