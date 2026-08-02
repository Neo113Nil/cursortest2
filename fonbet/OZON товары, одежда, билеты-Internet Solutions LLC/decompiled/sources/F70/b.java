package F70;

import Jb.e;
import android.content.Context;
import ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.j;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;
import ru.ozon.fintech.features.operations.network.OperationsApi;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9110a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f9111b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f9112c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f9113d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a f9114e;

    public b(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f9111b = aVar;
        this.f9112c = aVar2;
        this.f9113d = aVar3;
        this.f9114e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f9110a) {
            case 0:
                return new ru.ozon.fintech.features.operations.presentation.a((Context) this.f9111b.get(), (S80.b) this.f9112c.get(), (ru.ozon.fintech.settings.domain.a) this.f9113d.get(), (OperationsApi) this.f9114e.get());
            default:
                return new k((ru.ozon.android.messenger.framework.domain.repository.d) this.f9111b.get(), (x0) this.f9112c.get(), (j) ((ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.k) this.f9114e).get(), (ru.ozon.android.messenger.framework.domain.repository.b) this.f9113d.get());
        }
    }

    public b(Pc.a aVar, Pc.a aVar2, ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.k kVar, Pc.a aVar3) {
        this.f9111b = aVar;
        this.f9112c = aVar2;
        this.f9114e = kVar;
        this.f9113d = aVar3;
    }
}
