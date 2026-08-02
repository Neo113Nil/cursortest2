package J00;

import A00.a;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl", f = "Middleware.kt", l = {592}, m = "fetch-BWLJW6A")
/* loaded from: classes7.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f13570d;

    /* renamed from: e, reason: collision with root package name */
    a.InterfaceC0008a f13571e;

    /* renamed from: f, reason: collision with root package name */
    L00.g f13572f;

    /* renamed from: g, reason: collision with root package name */
    L00.c f13573g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f13574h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13575i;

    /* renamed from: j, reason: collision with root package name */
    int f13576j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f13575i = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object n11;
        this.f13574h = obj;
        this.f13576j |= LinearLayoutManager.INVALID_OFFSET;
        n11 = this.f13575i.n(null, null, null, this);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : r.a(n11);
    }
}
