package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB)\b\u0004\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tR2\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011"}, d2 = {"Lcom/paypal/pds/core/IndicationCreator;", "", "Lkotlin/Function3;", "Landroidx/compose/foundation/interaction/InteractionSource;", "Lcom/paypal/pds/tokens/PDSTokens;", "Lcom/paypal/pds/core/PDSIndication;", "Landroidx/compose/ui/node/DelegatableNode;", "p0", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "creator", "Lkotlin/jvm/functions/Function3;", "getCreator$pds_release", "()Lkotlin/jvm/functions/Function3;", "StaticOverlay", "Ripple", "Lcom/paypal/pds/core/IndicationCreator$Ripple;", "Lcom/paypal/pds/core/IndicationCreator$StaticOverlay;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class IndicationCreator {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function3<androidx.compose.foundation.interaction.InteractionSource, com.paypal.pds.tokens.PDSTokens, com.paypal.pds.core.PDSIndication, androidx.compose.ui.node.DelegatableNode> creator;

    /* JADX WARN: Multi-variable type inference failed */
    private IndicationCreator(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.interaction.InteractionSource, ? super com.paypal.pds.tokens.PDSTokens, ? super com.paypal.pds.core.PDSIndication, ? extends androidx.compose.ui.node.DelegatableNode> function3) {
        this.creator = function3;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/IndicationCreator$StaticOverlay;", "Lcom/paypal/pds/core/IndicationCreator;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StaticOverlay extends com.paypal.pds.core.IndicationCreator {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.IndicationCreator.StaticOverlay INSTANCE = new com.paypal.pds.core.IndicationCreator.StaticOverlay();

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.pds.core.IndicationCreator$StaticOverlay$1, reason: invalid class name */
        static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<androidx.compose.foundation.interaction.InteractionSource, com.paypal.pds.tokens.PDSTokens, com.paypal.pds.core.PDSIndication, com.paypal.pds.core.OverlayIndicationNode> {
            public static final com.paypal.pds.core.IndicationCreator.StaticOverlay.AnonymousClass1 getHighSpeedVideoSizes = new com.paypal.pds.core.IndicationCreator.StaticOverlay.AnonymousClass1();

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.paypal.pds.core.OverlayIndicationNode invoke(androidx.compose.foundation.interaction.InteractionSource interactionSource, com.paypal.pds.tokens.PDSTokens pDSTokens, com.paypal.pds.core.PDSIndication pDSIndication) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSIndication, "");
                return new com.paypal.pds.core.OverlayIndicationNode(interactionSource, pDSTokens, pDSIndication);
            }

            AnonymousClass1() {
                super(3, com.paypal.pds.core.OverlayIndicationNode.class, "<init>", "<init>(Landroidx/compose/foundation/interaction/InteractionSource;Lcom/paypal/pds/tokens/PDSTokens;Lcom/paypal/pds/core/PDSIndication;)V", 0);
            }
        }

        private StaticOverlay() {
            super(com.paypal.pds.core.IndicationCreator.StaticOverlay.AnonymousClass1.getHighSpeedVideoSizes, null);
        }
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.interaction.InteractionSource, com.paypal.pds.tokens.PDSTokens, com.paypal.pds.core.PDSIndication, androidx.compose.ui.node.DelegatableNode> getCreator$pds_release() {
        return this.creator;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/IndicationCreator$Ripple;", "Lcom/paypal/pds/core/IndicationCreator;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Ripple extends com.paypal.pds.core.IndicationCreator {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.IndicationCreator.Ripple INSTANCE = new com.paypal.pds.core.IndicationCreator.Ripple();

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.pds.core.IndicationCreator$Ripple$1, reason: invalid class name */
        static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<androidx.compose.foundation.interaction.InteractionSource, com.paypal.pds.tokens.PDSTokens, com.paypal.pds.core.PDSIndication, com.paypal.pds.core.RippleNode> {
            public static final com.paypal.pds.core.IndicationCreator.Ripple.AnonymousClass1 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.pds.core.IndicationCreator.Ripple.AnonymousClass1();

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.paypal.pds.core.RippleNode invoke(androidx.compose.foundation.interaction.InteractionSource interactionSource, com.paypal.pds.tokens.PDSTokens pDSTokens, com.paypal.pds.core.PDSIndication pDSIndication) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSIndication, "");
                return new com.paypal.pds.core.RippleNode(interactionSource, pDSTokens, pDSIndication);
            }

            AnonymousClass1() {
                super(3, com.paypal.pds.core.RippleNode.class, "<init>", "<init>(Landroidx/compose/foundation/interaction/InteractionSource;Lcom/paypal/pds/tokens/PDSTokens;Lcom/paypal/pds/core/PDSIndication;)V", 0);
            }
        }

        private Ripple() {
            super(com.paypal.pds.core.IndicationCreator.Ripple.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI, null);
        }
    }

    public /* synthetic */ IndicationCreator(kotlin.jvm.functions.Function3 function3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function3);
    }
}
