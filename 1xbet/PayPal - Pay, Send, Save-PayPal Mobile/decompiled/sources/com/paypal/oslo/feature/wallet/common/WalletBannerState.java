package com.paypal.oslo.feature.wallet.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/WalletBannerState;", "", "Hidden", com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, "Lcom/paypal/oslo/feature/wallet/common/WalletBannerState$Hidden;", "Lcom/paypal/oslo/feature/wallet/common/WalletBannerState$Visible;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface WalletBannerState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/WalletBannerState$Hidden;", "Lcom/paypal/oslo/feature/wallet/common/WalletBannerState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hidden implements com.paypal.oslo.feature.wallet.common.WalletBannerState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.common.WalletBannerState.Hidden INSTANCE = new com.paypal.oslo.feature.wallet.common.WalletBannerState.Hidden();

        public final int hashCode() {
            return -947222229;
        }

        private Hidden() {
        }

        public final java.lang.String toString() {
            return "Hidden";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.common.WalletBannerState.Hidden)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J^\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b/\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/WalletBannerState$Visible;", "Lcom/paypal/oslo/feature/wallet/common/WalletBannerState;", "Lcom/paypal/pds/components/BannerStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/pds/components/BannerTrailingElement;", "trailingElement", "Lkotlin/Function0;", "", "onClick", "onDismiss", "<init>", "(Lcom/paypal/pds/components/BannerStyle;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/pds/components/BannerTrailingElement;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/paypal/pds/components/BannerStyle;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component3", "component4", "()Lcom/paypal/pds/components/BannerTrailingElement;", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "copy", "(Lcom/paypal/pds/components/BannerStyle;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/pds/components/BannerTrailingElement;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/wallet/common/WalletBannerState$Visible;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/components/BannerStyle;", "getStyle", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getDescription", "Lcom/paypal/pds/components/BannerTrailingElement;", "getTrailingElement", "Lkotlin/jvm/functions/Function0;", "getOnClick", "getOnDismiss"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Visible implements com.paypal.oslo.feature.wallet.common.WalletBannerState {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText description;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss;
        private final com.paypal.pds.components.BannerStyle style;
        private final com.paypal.oslo.core.commonui.utils.RefText title;
        private final com.paypal.pds.components.BannerTrailingElement trailingElement;

        public Visible(com.paypal.pds.components.BannerStyle bannerStyle, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.pds.components.BannerTrailingElement bannerTrailingElement, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerStyle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerTrailingElement, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
            this.style = bannerStyle;
            this.title = refText;
            this.description = refText2;
            this.trailingElement = bannerTrailingElement;
            this.onClick = function0;
            this.onDismiss = function02;
        }

        public final com.paypal.pds.components.BannerStyle getStyle() {
            return this.style;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        public /* synthetic */ Visible(com.paypal.pds.components.BannerStyle bannerStyle, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.pds.components.BannerTrailingElement bannerTrailingElement, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bannerStyle, (i & 2) != 0 ? null : refText, (i & 4) != 0 ? null : refText2, (i & 8) != 0 ? com.paypal.pds.components.BannerTrailingElement.None : bannerTrailingElement, (i & 16) == 0 ? function0 : null, (i & 32) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.WalletBannerState$Visible$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            } : function02);
        }

        public final com.paypal.pds.components.BannerTrailingElement getTrailingElement() {
            return this.trailingElement;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
            return this.onClick;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismiss() {
            return this.onDismiss;
        }

        public final java.lang.String toString() {
            com.paypal.pds.components.BannerStyle bannerStyle = this.style;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.description;
            com.paypal.pds.components.BannerTrailingElement bannerTrailingElement = this.trailingElement;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onClick;
            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onDismiss;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Visible(style=");
            sb.append(bannerStyle);
            sb.append(", title=");
            sb.append(refText);
            sb.append(", description=");
            sb.append(refText2);
            sb.append(", trailingElement=");
            sb.append(bannerTrailingElement);
            sb.append(", onClick=");
            sb.append(function0);
            sb.append(", onDismiss=");
            sb.append(function02);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.style.hashCode();
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            int hashCode2 = refText == null ? 0 : refText.hashCode();
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.description;
            int hashCode3 = refText2 == null ? 0 : refText2.hashCode();
            int hashCode4 = this.trailingElement.hashCode();
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onClick;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (function0 != null ? function0.hashCode() : 0)) * 31) + this.onDismiss.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible visible = (com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.style, visible.style) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, visible.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, visible.description) && this.trailingElement == visible.trailingElement && kotlin.jvm.internal.Intrinsics.areEqual(this.onClick, visible.onClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onDismiss, visible.onDismiss);
        }

        public final com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible copy(com.paypal.pds.components.BannerStyle style, com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText description, com.paypal.pds.components.BannerTrailingElement trailingElement, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trailingElement, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDismiss, "");
            return new com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible(style, title, description, trailingElement, onClick, onDismiss);
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component6() {
            return this.onDismiss;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
            return this.onClick;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.pds.components.BannerTrailingElement getTrailingElement() {
            return this.trailingElement;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.components.BannerStyle getStyle() {
            return this.style;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible copy$default(com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible visible, com.paypal.pds.components.BannerStyle bannerStyle, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.pds.components.BannerTrailingElement bannerTrailingElement, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bannerStyle = visible.style;
            }
            if ((i & 2) != 0) {
                refText = visible.title;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText3 = refText;
            if ((i & 4) != 0) {
                refText2 = visible.description;
            }
            com.paypal.oslo.core.commonui.utils.RefText refText4 = refText2;
            if ((i & 8) != 0) {
                bannerTrailingElement = visible.trailingElement;
            }
            com.paypal.pds.components.BannerTrailingElement bannerTrailingElement2 = bannerTrailingElement;
            if ((i & 16) != 0) {
                function0 = visible.onClick;
            }
            kotlin.jvm.functions.Function0 function03 = function0;
            if ((i & 32) != 0) {
                function02 = visible.onDismiss;
            }
            return visible.copy(bannerStyle, refText3, refText4, bannerTrailingElement2, function03, function02);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i;
        }
    }
}
