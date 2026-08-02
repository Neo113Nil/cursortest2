package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
/* renamed from: R2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3925t extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C3922p f24465d;

    /* renamed from: e, reason: collision with root package name */
    Je.d f24466e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24467f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24468g;

    /* renamed from: h, reason: collision with root package name */
    int f24469h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3925t(C3922p c3922p, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24468g = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24467f = obj;
        this.f24469h |= LinearLayoutManager.INVALID_OFFSET;
        return C3922p.j(this.f24468g, this);
    }
}
