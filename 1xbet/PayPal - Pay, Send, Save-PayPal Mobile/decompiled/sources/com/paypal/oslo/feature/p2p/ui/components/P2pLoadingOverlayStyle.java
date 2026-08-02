package com.paypal.oslo.feature.p2p.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pLoadingOverlayStyle;", "", "<init>", "()V", "Lcom/paypal/pds/core/Color;", "getBackgroundColor$p2p_prodRelease", "()Lcom/paypal/pds/core/Color;", "backgroundColor", com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayKt.SemiTransparent, com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayKt.Opaque, "Lcom/paypal/oslo/feature/p2p/ui/components/P2pLoadingOverlayStyle$Opaque;", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pLoadingOverlayStyle$SemiTransparent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class P2pLoadingOverlayStyle {
    public static final int $stable = 0;

    private P2pLoadingOverlayStyle() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pLoadingOverlayStyle$SemiTransparent;", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pLoadingOverlayStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SemiTransparent extends com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle.SemiTransparent INSTANCE = new com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle.SemiTransparent();

        private SemiTransparent() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pLoadingOverlayStyle$Opaque;", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pLoadingOverlayStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Opaque extends com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle.Opaque INSTANCE = new com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle.Opaque();

        private Opaque() {
            super(null);
        }
    }

    public final com.paypal.pds.core.Color getBackgroundColor$p2p_prodRelease() {
        if (this instanceof com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle.SemiTransparent) {
            return com.paypal.pds.core.Color.BackgroundOverlayCard.INSTANCE;
        }
        if (this instanceof com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle.Opaque) {
            return com.paypal.pds.core.Color.BackgroundMuted.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ P2pLoadingOverlayStyle(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
