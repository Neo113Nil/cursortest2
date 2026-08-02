package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersRepositoryImpl", f = "ExtraHeadersRepositoryImpl.kt", l = {116}, m = "setCookie")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    h f32731d;

    /* renamed from: e, reason: collision with root package name */
    String f32732e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f32733f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h f32734g;

    /* renamed from: h, reason: collision with root package name */
    int f32735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32734g = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object l11;
        this.f32733f = obj;
        this.f32735h |= LinearLayoutManager.INVALID_OFFSET;
        l11 = this.f32734g.l(null, this);
        return l11;
    }
}
