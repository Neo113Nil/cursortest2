package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0014\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0014\u001e\u001f !\"#$%&'()*+,-./01"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LaunchPhoneDialer", "ShowUserInfoBottomSheet", "NavigateToContactUsScreen", "StartPaperlessDeliveryBottomSheet", "StopPaperlessDeliveryBottomSheet", "ShowStatementDeliveryDetailsBottomSheet", "ShowLockCardErrorBottomSheet", "ShowStatementDeliverySuccessToast", "ReportLostOrStolenBottomSheet", "NavigateToAutopay", "NavigateToSetAsPreferred", "NavigateToCreditLimitHub", "NavigateBack", "NavigateToWebView", "NavigateToManagePin", "ShowCardDetailsBottomSheet", "ShowCardDetailsErrorBottomSheet", "CopyCardNumber", "NavigateToPushToWallet", "ViewCardInWallet", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$CopyCardNumber;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$LaunchPhoneDialer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToAutopay;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToContactUsScreen;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToCreditLimitHub;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToManagePin;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToPushToWallet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToSetAsPreferred;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToWebView;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ReportLostOrStolenBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowCardDetailsBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowCardDetailsErrorBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowLockCardErrorBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowStatementDeliveryDetailsBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowStatementDeliverySuccessToast;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowUserInfoBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$StartPaperlessDeliveryBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$StopPaperlessDeliveryBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ViewCardInWallet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ManageCardUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ManageCardUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$LaunchPhoneDialer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$LaunchPhoneDialer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchPhoneDialer extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchPhoneDialer(java.lang.String str) {
            super("LaunchPhoneDialer", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchPhoneDialer(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer launchPhoneDialer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = launchPhoneDialer.phoneNumber;
            }
            return launchPhoneDialer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowUserInfoBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowUserInfoBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowUserInfoBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUserInfoBottomSheet(java.lang.String str) {
            super("ShowUserInfoBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowUserInfoBottomSheet(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet showUserInfoBottomSheet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showUserInfoBottomSheet.phoneNumber;
            }
            return showUserInfoBottomSheet.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToContactUsScreen;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "phoneNumber", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToContactUsScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToContactUsScreen extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToContactUsScreen(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber) {
            super("NavigateToContactUsScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            this.phoneNumber = phoneNumber;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToContactUsScreen(phoneNumber=");
            sb.append(phoneNumber);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen navigateToContactUsScreen, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                phoneNumber = navigateToContactUsScreen.phoneNumber;
            }
            return navigateToContactUsScreen.copy(phoneNumber);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$StartPaperlessDeliveryBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartPaperlessDeliveryBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StartPaperlessDeliveryBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StartPaperlessDeliveryBottomSheet();

        public final int hashCode() {
            return -1604744286;
        }

        private StartPaperlessDeliveryBottomSheet() {
            super("StartPaperlessDeliveryBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "StartPaperlessDeliveryBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StartPaperlessDeliveryBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$StopPaperlessDeliveryBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StopPaperlessDeliveryBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StopPaperlessDeliveryBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StopPaperlessDeliveryBottomSheet();

        public final int hashCode() {
            return -1810234792;
        }

        private StopPaperlessDeliveryBottomSheet() {
            super("StopPaperlessDeliveryBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "StopPaperlessDeliveryBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StopPaperlessDeliveryBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowStatementDeliveryDetailsBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowStatementDeliveryDetailsBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliveryDetailsBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliveryDetailsBottomSheet();

        public final int hashCode() {
            return -1565904803;
        }

        private ShowStatementDeliveryDetailsBottomSheet() {
            super("ShowStatementDeliveryDetailsBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowStatementDeliveryDetailsBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliveryDetailsBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowLockCardErrorBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "", "isLocking", "", "phoneNumber", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowLockCardErrorBottomSheet;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowLockCardErrorBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final boolean isLocking;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowLockCardErrorBottomSheet(boolean z, java.lang.String str) {
            super("ShowLockCardErrorBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.isLocking = z;
            this.phoneNumber = str;
        }

        public final boolean isLocking() {
            return this.isLocking;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            boolean z = this.isLocking;
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowLockCardErrorBottomSheet(isLocking=");
            sb.append(z);
            sb.append(", phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.isLocking) * 31) + this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet showLockCardErrorBottomSheet = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet) other;
            return this.isLocking == showLockCardErrorBottomSheet.isLocking && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, showLockCardErrorBottomSheet.phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet copy(boolean isLocking, java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet(isLocking, phoneNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLocking() {
            return this.isLocking;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet showLockCardErrorBottomSheet, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = showLockCardErrorBottomSheet.isLocking;
            }
            if ((i & 2) != 0) {
                str = showLockCardErrorBottomSheet.phoneNumber;
            }
            return showLockCardErrorBottomSheet.copy(z, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowStatementDeliverySuccessToast;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "message", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowStatementDeliverySuccessToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowStatementDeliverySuccessToast extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowStatementDeliverySuccessToast(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
            super("ShowStatementDeliverySuccessToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            this.message = uiString;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowStatementDeliverySuccessToast(message=");
            sb.append(uiString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast) other).message);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast showStatementDeliverySuccessToast, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = showStatementDeliverySuccessToast.message;
            }
            return showStatementDeliverySuccessToast.copy(uiString);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ReportLostOrStolenBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ReportLostOrStolenBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportLostOrStolenBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportLostOrStolenBottomSheet(java.lang.String str) {
            super("ReportLostOrStolenBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportLostOrStolenBottomSheet(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet reportLostOrStolenBottomSheet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reportLostOrStolenBottomSheet.phoneNumber;
            }
            return reportLostOrStolenBottomSheet.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToAutopay;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAutopay extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToAutopay INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToAutopay();

        public final int hashCode() {
            return 1056149330;
        }

        private NavigateToAutopay() {
            super("NavigateToAutopay", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAutopay";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToAutopay)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToSetAsPreferred;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSetAsPreferred extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToSetAsPreferred INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToSetAsPreferred();

        public final int hashCode() {
            return -1610690092;
        }

        private NavigateToSetAsPreferred() {
            super("NavigateToSetAsPreferred", null);
        }

        public final java.lang.String toString() {
            return "NavigateToSetAsPreferred";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToSetAsPreferred)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToCreditLimitHub;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCreditLimitHub extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToCreditLimitHub INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToCreditLimitHub();

        public final int hashCode() {
            return 1237145722;
        }

        private NavigateToCreditLimitHub() {
            super("NavigateToCreditLimitHub", null);
        }

        public final java.lang.String toString() {
            return "NavigateToCreditLimitHub";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToCreditLimitHub)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateBack();

        public final int hashCode() {
            return -650883405;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToWebView;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "", "url", "", "isAuthRequired", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToWebView;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToWebView extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final boolean isAuthRequired;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToWebView(java.lang.String str, boolean z) {
            super("NavigateToWebView", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.isAuthRequired = z;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final boolean isAuthRequired() {
            return this.isAuthRequired;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            boolean z = this.isAuthRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToWebView(url=");
            sb.append(str);
            sb.append(", isAuthRequired=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.url.hashCode() * 31) + java.lang.Boolean.hashCode(this.isAuthRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView navigateToWebView = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, navigateToWebView.url) && this.isAuthRequired == navigateToWebView.isAuthRequired;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView copy(java.lang.String url, boolean isAuthRequired) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView(url, isAuthRequired);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAuthRequired() {
            return this.isAuthRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView navigateToWebView, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToWebView.url;
            }
            if ((i & 2) != 0) {
                z = navigateToWebView.isAuthRequired;
            }
            return navigateToWebView.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToManagePin;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "cardArtUrl", "lastDigits", "", "hasPhysicalCard", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToManagePin;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCardArtUrl", "getLastDigits", "Z", "getHasPhysicalCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToManagePin extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final java.lang.String cardArtUrl;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final boolean hasPhysicalCard;
        private final java.lang.String lastDigits;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToManagePin(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2, boolean z) {
            super("NavigateToManagePin", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.creditProductIdentifier = creditProductIdentifier;
            this.cardArtUrl = str;
            this.lastDigits = str2;
            this.hasPhysicalCard = z;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        public final boolean getHasPhysicalCard() {
            return this.hasPhysicalCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str = this.cardArtUrl;
            java.lang.String str2 = this.lastDigits;
            boolean z = this.hasPhysicalCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToManagePin(creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", cardArtUrl=");
            sb.append(str);
            sb.append(", lastDigits=");
            sb.append(str2);
            sb.append(", hasPhysicalCard=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.creditProductIdentifier.hashCode() * 31) + this.cardArtUrl.hashCode()) * 31) + this.lastDigits.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasPhysicalCard);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin navigateToManagePin = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin) other;
            return this.creditProductIdentifier == navigateToManagePin.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtUrl, navigateToManagePin.cardArtUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, navigateToManagePin.lastDigits) && this.hasPhysicalCard == navigateToManagePin.hasPhysicalCard;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String cardArtUrl, java.lang.String lastDigits, boolean hasPhysicalCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastDigits, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin(creditProductIdentifier, cardArtUrl, lastDigits, hasPhysicalCard);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasPhysicalCard() {
            return this.hasPhysicalCard;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin navigateToManagePin, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = navigateToManagePin.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                str = navigateToManagePin.cardArtUrl;
            }
            if ((i & 4) != 0) {
                str2 = navigateToManagePin.lastDigits;
            }
            if ((i & 8) != 0) {
                z = navigateToManagePin.hasPhysicalCard;
            }
            return navigateToManagePin.copy(creditProductIdentifier, str, str2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowCardDetailsBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "cardDetails", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowCardDetailsBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "getCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardDetailsBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCardDetailsBottomSheet(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel) {
            super("ShowCardDetailsBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailsUiModel, "");
            this.cardDetails = cardDetailsUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel getCardDetails() {
            return this.cardDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel = this.cardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowCardDetailsBottomSheet(cardDetails=");
            sb.append(cardDetailsUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetails, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet) other).cardDetails);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet(cardDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel getCardDetails() {
            return this.cardDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet showCardDetailsBottomSheet, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardDetailsUiModel = showCardDetailsBottomSheet.cardDetails;
            }
            return showCardDetailsBottomSheet.copy(cardDetailsUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ShowCardDetailsErrorBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardDetailsErrorBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsErrorBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsErrorBottomSheet();

        public final int hashCode() {
            return 867291686;
        }

        private ShowCardDetailsErrorBottomSheet() {
            super("ShowCardDetailsErrorBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowCardDetailsErrorBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsErrorBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$CopyCardNumber;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$CopyCardNumber;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyCardNumber extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        private final java.lang.String cardNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyCardNumber(java.lang.String str) {
            super("CopyCardNumber", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardNumber = str;
        }

        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CopyCardNumber(cardNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber) other).cardNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber copy(java.lang.String cardNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber(cardNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber copyCardNumber, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = copyCardNumber.cardNumber;
            }
            return copyCardNumber.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$NavigateToPushToWallet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPushToWallet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToPushToWallet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToPushToWallet();

        public final int hashCode() {
            return 1989581941;
        }

        private NavigateToPushToWallet() {
            super("NavigateToPushToWallet", null);
        }

        public final java.lang.String toString() {
            return "NavigateToPushToWallet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToPushToWallet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect$ViewCardInWallet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ViewCardInWallet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ViewCardInWallet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ViewCardInWallet();

        public final int hashCode() {
            return 994330414;
        }

        private ViewCardInWallet() {
            super("ViewCardInWallet", null);
        }

        public final java.lang.String toString() {
            return "ViewCardInWallet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ViewCardInWallet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ManageCardUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
