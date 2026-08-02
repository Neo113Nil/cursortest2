package androidx.compose.ui.draw;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;

/* loaded from: classes8.dex */
final class g extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ShadowGraphicsLayerElement f40357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
        super(1);
        this.f40357b = shadowGraphicsLayerElement;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 interfaceC7825i02 = interfaceC7825i0;
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = this.f40357b;
        interfaceC7825i02.z(interfaceC7825i02.v1(shadowGraphicsLayerElement.getF40342a()));
        interfaceC7825i02.setShape(shadowGraphicsLayerElement.getF40343b());
        interfaceC7825i02.x(shadowGraphicsLayerElement.getF40344c());
        interfaceC7825i02.H(shadowGraphicsLayerElement.getF40345d());
        interfaceC7825i02.J(shadowGraphicsLayerElement.getF40346e());
        return Unit.f71690a;
    }
}
