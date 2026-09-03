package defpackage;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class hRNgd2zGCE5kj implements Function0 {
    public final /* synthetic */ AbstractClickableNode b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ hRNgd2zGCE5kj(AbstractClickableNode abstractClickableNode, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = abstractClickableNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        DelegatableNode delegatableNode;
        int i = this.oyjLVtGms9eZwJ0;
        AbstractClickableNode abstractClickableNode = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Indication indication = (Indication) CompositionLocalConsumerModifierNodeKt.yzPsTade5rL7D3(abstractClickableNode, IndicationKt.yzPsTade5rL7D3);
                if (!(indication instanceof IndicationNodeFactory)) {
                    InlineClassHelperKt.yzPsTade5rL7D3("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + indication);
                }
                IndicationNodeFactory indicationNodeFactory = abstractClickableNode.jJwKDtysO3vm5E;
                IndicationNodeFactory indicationNodeFactory2 = (IndicationNodeFactory) indication;
                abstractClickableNode.jJwKDtysO3vm5E = indicationNodeFactory2;
                if (indicationNodeFactory != null && !Intrinsics.yzPsTade5rL7D3(indicationNodeFactory2, indicationNodeFactory) && ((delegatableNode = abstractClickableNode.Yey4RyhSyBRHub) != null || !abstractClickableNode.Rp7eugjcSpMRpm)) {
                    if (delegatableNode != null) {
                        abstractClickableNode.r0(delegatableNode);
                    }
                    abstractClickableNode.Yey4RyhSyBRHub = null;
                    abstractClickableNode.A0();
                }
                return Unit.yzPsTade5rL7D3;
            default:
                abstractClickableNode.uY26rxeEAFnDq.hRNgd2zGCE5kj();
                return Boolean.TRUE;
        }
    }
}
