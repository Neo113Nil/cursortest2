package com.paypal.oslo.feature.p2p.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pEntityRowItemStyle;", "", "<init>", "()V", "Lcom/paypal/pds/components/ShimmerStyle;", "getShimmerStyle$p2p_prodRelease", "()Lcom/paypal/pds/components/ShimmerStyle;", "shimmerStyle", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Rounded", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pEntityRowItemStyle$Card;", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pEntityRowItemStyle$Rounded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class P2pEntityRowItemStyle {
    public static final int $stable = 0;

    private P2pEntityRowItemStyle() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pEntityRowItemStyle$Card;", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pEntityRowItemStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Card extends com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle.Card INSTANCE = new com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle.Card();

        private Card() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pEntityRowItemStyle$Rounded;", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pEntityRowItemStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Rounded extends com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle.Rounded INSTANCE = new com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle.Rounded();

        private Rounded() {
            super(null);
        }
    }

    public final com.paypal.pds.components.ShimmerStyle getShimmerStyle$p2p_prodRelease() {
        if (this instanceof com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle.Rounded) {
            return com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE;
        }
        if (this instanceof com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle.Card) {
            return com.paypal.pds.components.ShimmerStyle.Container.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ P2pEntityRowItemStyle(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
