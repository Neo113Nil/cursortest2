package com.paypal.oslo.feature.wallet.me.ui.product;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001f\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/ui/product/ProductCardStyle;", "", "Lcom/paypal/pds/core/Color;", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "<init>", "(Lcom/paypal/pds/core/Color;Landroidx/compose/ui/unit/Dp;)V", "backgroundColor", "Lcom/paypal/pds/core/Color;", "getBackgroundColor", "()Lcom/paypal/pds/core/Color;", "minimumHeight", "Landroidx/compose/ui/unit/Dp;", "getMinimumHeight-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "Default", "Hero", "Lcom/paypal/oslo/feature/wallet/me/ui/product/ProductCardStyle$Default;", "Lcom/paypal/oslo/feature/wallet/me/ui/product/ProductCardStyle$Hero;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ProductCardStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color backgroundColor;
    private final androidx.compose.ui.unit.Dp minimumHeight;

    private ProductCardStyle(com.paypal.pds.core.Color color, androidx.compose.ui.unit.Dp dp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        this.backgroundColor = color;
        this.minimumHeight = dp;
    }

    public /* synthetic */ ProductCardStyle(com.paypal.pds.core.Color.BackgroundContainerFilled backgroundContainerFilled, androidx.compose.ui.unit.Dp dp, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.pds.core.Color.BackgroundContainerFilled.INSTANCE : backgroundContainerFilled, (i & 2) != 0 ? null : dp, null);
    }

    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getMinimumHeight-lTKBWiU, reason: not valid java name and from getter */
    public final androidx.compose.ui.unit.Dp getMinimumHeight() {
        return this.minimumHeight;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/ui/product/ProductCardStyle$Default;", "Lcom/paypal/oslo/feature/wallet/me/ui/product/ProductCardStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Default extends com.paypal.oslo.feature.wallet.me.ui.product.ProductCardStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.me.ui.product.ProductCardStyle.Default INSTANCE = new com.paypal.oslo.feature.wallet.me.ui.product.ProductCardStyle.Default();

        /* JADX WARN: Multi-variable type inference failed */
        private Default() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/ui/product/ProductCardStyle$Hero;", "Lcom/paypal/oslo/feature/wallet/me/ui/product/ProductCardStyle;", "Lcom/paypal/pds/core/Color;", "backgroundColor", "<init>", "(Lcom/paypal/pds/core/Color;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Hero extends com.paypal.oslo.feature.wallet.me.ui.product.ProductCardStyle {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Hero(com.paypal.pds.core.Color color) {
            super(color, androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(214.0f)), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        }
    }

    public /* synthetic */ ProductCardStyle(com.paypal.pds.core.Color color, androidx.compose.ui.unit.Dp dp, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, dp);
    }
}
