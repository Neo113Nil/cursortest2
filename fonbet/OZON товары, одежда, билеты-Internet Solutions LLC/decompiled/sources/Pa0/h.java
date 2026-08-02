package Pa0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.host.config.debug.menu.domain.env.usecase.impl.GetIsNetworkProdUseCaseImpl", f = "GetIsNetworkProdUseCaseImpl.kt", l = {14}, m = "invoke")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f22132d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f22133e;

    /* renamed from: f, reason: collision with root package name */
    int f22134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f22133e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f22132d = obj;
        this.f22134f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f22133e.a(this);
    }
}
