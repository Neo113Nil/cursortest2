package V60;

import a70.InterfaceC4958a;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomData;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;

/* loaded from: classes3.dex */
public final class k implements Jb.e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC4958a> f28388a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Z60.a> f28389b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<K70.b> f28390c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<Y60.b<MainData>> f28391d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Y60.b<TransferData>> f28392e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<Y60.b<CbottomData>> f28393f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f28394g;

    public k(Pc.a<InterfaceC4958a> aVar, Pc.a<Z60.a> aVar2, Pc.a<K70.b> aVar3, Pc.a<Y60.b<MainData>> aVar4, Pc.a<Y60.b<TransferData>> aVar5, Pc.a<Y60.b<CbottomData>> aVar6, Pc.a<InterfaceC6618a> aVar7) {
        this.f28388a = aVar;
        this.f28389b = aVar2;
        this.f28390c = aVar3;
        this.f28391d = aVar4;
        this.f28392e = aVar5;
        this.f28393f = aVar6;
        this.f28394g = aVar7;
    }

    @Override // Pc.a
    public final Object get() {
        return new b(this.f28388a.get(), this.f28389b.get(), this.f28390c.get(), this.f28391d.get(), this.f28392e.get(), this.f28393f.get(), this.f28394g.get());
    }
}
