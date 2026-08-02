package com.paypal.oslo.feature.wallet.cards.ui.edit;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState;", "", "<init>", "()V", "Loading", "FormReady", "Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState$FormReady;", "Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class UpdateCardScreenState {
    public static final int $stable = 0;

    private UpdateCardScreenState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState$Loading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Loading extends com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.Loading();

        private Loading() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0013R\u0011\u0010'\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState$FormReady;", "Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState;", "Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardFormState;", "formState", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "billingAddresses", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardFormState;Ljava/util/List;)V", "Lcom/paypal/pds/components/BannerStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "withError", "(Lcom/paypal/pds/components/BannerStyle;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState$FormReady;", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardFormState;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardFormState;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState$FormReady;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardFormState;", "getFormState", "Ljava/util/List;", "getBillingAddresses", "getHasError", "()Z", "hasError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FormReady extends com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> billingAddresses;
        private final com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState formState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormReady(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState updateCardFormState, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardFormState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.formState = updateCardFormState;
            this.billingAddresses = list;
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState getFormState() {
            return this.formState;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> getBillingAddresses() {
            return this.billingAddresses;
        }

        public final boolean getHasError() {
            return this.formState.getBannerState() instanceof com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady withError$default(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady formReady, com.paypal.pds.components.BannerStyle bannerStyle, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                refText = null;
            }
            if ((i & 4) != 0) {
                refText2 = null;
            }
            return formReady.withError(bannerStyle, refText, refText2);
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady withError(com.paypal.pds.components.BannerStyle style, com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
            return copy$default(this, com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState.copy$default(this.formState, null, null, null, null, null, false, new com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible(style, title, description, null, null, null, 56, null), 63, null), null, 2, null);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState updateCardFormState = this.formState;
            java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> list = this.billingAddresses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FormReady(formState=");
            sb.append(updateCardFormState);
            sb.append(", billingAddresses=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.formState.hashCode() * 31) + this.billingAddresses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady formReady = (com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formState, formReady.formState) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddresses, formReady.billingAddresses);
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady copy(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState formState, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> billingAddresses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddresses, "");
            return new com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady(formState, billingAddresses);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> component2() {
            return this.billingAddresses;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState getFormState() {
            return this.formState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady copy$default(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady formReady, com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState updateCardFormState, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateCardFormState = formReady.formState;
            }
            if ((i & 2) != 0) {
                list = formReady.billingAddresses;
            }
            return formReady.copy(updateCardFormState, list);
        }
    }

    public /* synthetic */ UpdateCardScreenState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
