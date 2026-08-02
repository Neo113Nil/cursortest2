package Bf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import qf0.d;
import rf0.AbstractC9267a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl", f = "WhitelistingStatusProviderImpl.kt", l = {336}, m = "startDomainPing")
/* loaded from: classes7.dex */
final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    o f3750d;

    /* renamed from: e, reason: collision with root package name */
    String f3751e;

    /* renamed from: f, reason: collision with root package name */
    d.b f3752f;

    /* renamed from: g, reason: collision with root package name */
    AbstractC9267a f3753g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f3754h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ o f3755i;

    /* renamed from: j, reason: collision with root package name */
    int f3756j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f3755i = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object u11;
        this.f3754h = obj;
        this.f3756j |= LinearLayoutManager.INVALID_OFFSET;
        u11 = this.f3755i.u(null, null, null, this);
        return u11;
    }
}
