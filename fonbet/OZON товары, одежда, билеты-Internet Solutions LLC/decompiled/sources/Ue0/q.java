package Ue0;

import De.C2862e;
import ce0.InterfaceC5817a;
import com.yandex.mapkit.map.RootMapObjectCollection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class q extends AbstractC7737t implements Function0<We0.g> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(h hVar) {
        super(0);
        this.f27704b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final We0.g invoke() {
        Ve0.a aVar;
        xe0.j jVar;
        C2862e i11;
        h hVar = this.f27704b;
        RootMapObjectCollection n11 = h.n(hVar);
        aVar = hVar.f27680d;
        jVar = hVar.f27681e;
        InterfaceC5817a g10 = hVar.g();
        i11 = hVar.i();
        return new We0.g(n11, aVar, g10, jVar, i11);
    }
}
