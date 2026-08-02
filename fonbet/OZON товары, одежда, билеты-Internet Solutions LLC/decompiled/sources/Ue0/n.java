package Ue0;

import De.C2862e;
import ce0.InterfaceC5817a;
import com.yandex.mapkit.mapview.MapView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ze0.InterfaceC11117a;

/* loaded from: classes3.dex */
final class n extends AbstractC7737t implements Function0<g> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(h hVar) {
        super(0);
        this.f27701b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final g invoke() {
        Ve0.a aVar;
        C2862e i11;
        h hVar = this.f27701b;
        MapView contentView = hVar.getContentView();
        aVar = hVar.f27680d;
        InterfaceC5817a g10 = hVar.g();
        InterfaceC11117a r11 = hVar.r();
        i11 = hVar.i();
        return new g(contentView, aVar, r11, g10, i11);
    }
}
