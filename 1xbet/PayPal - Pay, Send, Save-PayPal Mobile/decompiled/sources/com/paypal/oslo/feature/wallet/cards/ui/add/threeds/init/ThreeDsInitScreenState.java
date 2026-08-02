package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState;", "", "ShowLoading", "ShowThreeDsLoading", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState$ShowLoading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState$ShowThreeDsLoading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ThreeDsInitScreenState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState$ShowLoading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowLoading implements com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowLoading INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowLoading();

        public final int hashCode() {
            return -1074243842;
        }

        private ShowLoading() {
        }

        public final java.lang.String toString() {
            return "ShowLoading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowLoading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState$ShowThreeDsLoading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState;", "", "cardLogoUrl", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "headerTitle", "reassuranceLabel", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState$ShowThreeDsLoading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardLogoUrl", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getHeaderTitle", "getReassuranceLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowThreeDsLoading implements com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState {
        public static final int $stable;
        private final java.lang.String cardLogoUrl;
        private final com.paypal.oslo.core.commonui.utils.RefText headerTitle;
        private final com.paypal.oslo.core.commonui.utils.RefText reassuranceLabel;

        public ShowThreeDsLoading(java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            this.cardLogoUrl = str;
            this.headerTitle = refText;
            this.reassuranceLabel = refText2;
        }

        public final java.lang.String getCardLogoUrl() {
            return this.cardLogoUrl;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getHeaderTitle() {
            return this.headerTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getReassuranceLabel() {
            return this.reassuranceLabel;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardLogoUrl;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.headerTitle;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.reassuranceLabel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowThreeDsLoading(cardLogoUrl=");
            sb.append(str);
            sb.append(", headerTitle=");
            sb.append(refText);
            sb.append(", reassuranceLabel=");
            sb.append(refText2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.cardLogoUrl;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.headerTitle.hashCode()) * 31) + this.reassuranceLabel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading showThreeDsLoading = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardLogoUrl, showThreeDsLoading.cardLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.headerTitle, showThreeDsLoading.headerTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.reassuranceLabel, showThreeDsLoading.reassuranceLabel);
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading copy(java.lang.String cardLogoUrl, com.paypal.oslo.core.commonui.utils.RefText headerTitle, com.paypal.oslo.core.commonui.utils.RefText reassuranceLabel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reassuranceLabel, "");
            return new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading(cardLogoUrl, headerTitle, reassuranceLabel);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getReassuranceLabel() {
            return this.reassuranceLabel;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getHeaderTitle() {
            return this.headerTitle;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardLogoUrl() {
            return this.cardLogoUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading showThreeDsLoading, java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showThreeDsLoading.cardLogoUrl;
            }
            if ((i & 2) != 0) {
                refText = showThreeDsLoading.headerTitle;
            }
            if ((i & 4) != 0) {
                refText2 = showThreeDsLoading.reassuranceLabel;
            }
            return showThreeDsLoading.copy(str, refText, refText2);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i;
        }
    }
}
