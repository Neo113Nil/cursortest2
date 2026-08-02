package Bf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import vf0.C10315a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl", f = "WhitelistingStatusProviderImpl.kt", l = {138, 139}, m = "handleConfigurationUpdate")
/* loaded from: classes7.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    o f3728d;

    /* renamed from: e, reason: collision with root package name */
    C10315a f3729e;

    /* renamed from: f, reason: collision with root package name */
    e f3730f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f3731g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ o f3732h;

    /* renamed from: i, reason: collision with root package name */
    int f3733i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f3732h = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f3731g = obj;
        this.f3733i |= LinearLayoutManager.INVALID_OFFSET;
        return o.h(this.f3732h, null, this);
    }
}
