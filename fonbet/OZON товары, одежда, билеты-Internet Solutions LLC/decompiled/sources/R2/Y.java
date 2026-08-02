package R2;

import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
/* loaded from: classes.dex */
final class Y extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Z f24329d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3394a f24330e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24331f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Z f24332g;

    /* renamed from: h, reason: collision with root package name */
    int f24333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(Z z11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24332g = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24331f = obj;
        this.f24333h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24332g.c(this);
    }
}
