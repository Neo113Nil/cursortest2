package com.paypal.oslo.feature.wallet.wallet.ui;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u001f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001f#$%&'()*+,-./0123456789:;<=>?@A"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Landroidx/navigation3/runtime/NavKey;", "<init>", "()V", "ScanCard", "EnterCardManually", "AddCardSuccess", "LoginToBankFromCard", "LoginToBankFromBank", "InStoreConfirmation", "EnterBankManually", "SearchInstitutions", "OpenAmexAccount", "AddMoneyReviewDestination", "AddMoneySuccessDestination", "WithdrawMoneySuccessDestination", "TransferAmountEntry", "AddBankManual", "ManualAddBankRouter", "AddBankManualConfirmation", "RandomDepositInstructions", "RandomDepositsBankConfirmation", "NoAuthSecureWebViewDestination", "AddBankSummaryScreen", "AddBankPlaid", "OBConsentScreen", "WithdrawMoneyReview", "WithdrawMoneySuccess", "IneligibleFI", "AddBankFinicity", "AutoLink", "ChooseAccounts", "SharedCardConsent", "SelectCurrencyDestination", "ProvisionInstrumentsDestination", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankManual;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankManualConfirmation;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankPlaid;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankSummaryScreen;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddCardSuccess;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneyReviewDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneySuccessDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ChooseAccounts;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$EnterBankManually;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$EnterCardManually;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$InStoreConfirmation;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$IneligibleFI;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$LoginToBankFromBank;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$LoginToBankFromCard;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ManualAddBankRouter;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$NoAuthSecureWebViewDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OpenAmexAccount;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ProvisionInstrumentsDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositInstructions;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositsBankConfirmation;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ScanCard;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SearchInstitutions;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SelectCurrencyDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SharedCardConsent;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$TransferAmountEntry;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneyReview;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneySuccess;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneySuccessDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Destination implements androidx.navigation3.runtime.NavKey {
    public static final int $stable = 0;

    private Destination() {
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ScanCard;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "navigateBackIfDenied", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ScanCard;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ScanCard;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getNavigateBackIfDenied", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ScanCard extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard.Companion(null);
        private final boolean navigateBackIfDenied;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ScanCard$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ScanCard;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$ScanCard$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ScanCard(int i, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i & 1) == 0) {
                this.navigateBackIfDenied = false;
            } else {
                this.navigateBackIfDenied = z;
            }
        }

        public ScanCard(boolean z) {
            super(null);
            this.navigateBackIfDenied = z;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.navigateBackIfDenied) {
                output.encodeBooleanElement(serialDesc, 0, self.navigateBackIfDenied);
            }
        }

        public /* synthetic */ ScanCard(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getNavigateBackIfDenied() {
            return this.navigateBackIfDenied;
        }

        public final java.lang.String toString() {
            boolean z = this.navigateBackIfDenied;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScanCard(navigateBackIfDenied=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.navigateBackIfDenied);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard) && this.navigateBackIfDenied == ((com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard) other).navigateBackIfDenied;
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard copy(boolean navigateBackIfDenied) {
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard(navigateBackIfDenied);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getNavigateBackIfDenied() {
            return this.navigateBackIfDenied;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard scanCard, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = scanCard.navigateBackIfDenied;
            }
            return scanCard.copy(z);
        }

        public ScanCard() {
            this(false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$EnterCardManually;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "screenArgs", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$EnterCardManually;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$EnterCardManually;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "getScreenArgs", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class EnterCardManually extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs screenArgs;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually.Companion(null);
        public static final int $stable = ((com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options.$stable | com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config.$stable) | com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.$stable) | com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.$stable;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$EnterCardManually$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$EnterCardManually;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$EnterCardManually$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ EnterCardManually(int i, com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.wallet.ui.Destination$EnterCardManually$$serializer.INSTANCE.getDescriptor());
            }
            this.screenArgs = addCardScreenArgs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterCardManually(com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardScreenArgs, "");
            this.screenArgs = addCardScreenArgs;
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs getScreenArgs() {
            return this.screenArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs = this.screenArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnterCardManually(screenArgs=");
            sb.append(addCardScreenArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.screenArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually) && kotlin.jvm.internal.Intrinsics.areEqual(this.screenArgs, ((com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually) other).screenArgs);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually copy(com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs screenArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenArgs, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually(screenArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs getScreenArgs() {
            return this.screenArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually enterCardManually, com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addCardScreenArgs = enterCardManually.screenArgs;
            }
            return enterCardManually.copy(addCardScreenArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddCardSuccess;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class AddCardSuccess extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddCardSuccess INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddCardSuccess();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddCardSuccess$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddCardSuccess.m21508$r8$lambda$ELjN_EsT5AG0XET0O5s1rsUmkU();
            }
        });

        public final int hashCode() {
            return -585551877;
        }

        private AddCardSuccess() {
            super(null);
        }

        /* renamed from: $r8$lambda$E-LjN_EsT5AG0XET0O5s1rsUmkU, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m21508$r8$lambda$ELjN_EsT5AG0XET0O5s1rsUmkU() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddCardSuccess", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddCardSuccess> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "AddCardSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddCardSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$LoginToBankFromCard;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class LoginToBankFromCard extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromCard INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromCard();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$LoginToBankFromCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromCard.m21510$r8$lambda$FfUk3wXew84o6VNHOgjjL3NwEE();
            }
        });

        public final int hashCode() {
            return -1956422863;
        }

        private LoginToBankFromCard() {
            super(null);
        }

        /* renamed from: $r8$lambda$FfUk3w-Xew84o6VNHOgjjL3NwEE, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m21510$r8$lambda$FfUk3wXew84o6VNHOgjjL3NwEE() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromCard", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromCard> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "LoginToBankFromCard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromCard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$LoginToBankFromBank;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class LoginToBankFromBank extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromBank INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromBank();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$LoginToBankFromBank$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromBank.$r8$lambda$WLYG0Oj9zX0R7wRTFrEeB7TB1VY();
            }
        });

        public final int hashCode() {
            return -1956452771;
        }

        private LoginToBankFromBank() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$WLYG0Oj9zX0R7wRTFrEeB7TB1VY() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromBank", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromBank> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "LoginToBankFromBank";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromBank)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$InStoreConfirmation;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class InStoreConfirmation extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$InStoreConfirmation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation.$r8$lambda$51f0mrLMCBT4hTbWkhplR94Pc3w();
            }
        });

        public final int hashCode() {
            return -1187624408;
        }

        private InStoreConfirmation() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$51f0mrLMCBT4hTbWkhplR94Pc3w() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "InStoreConfirmation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$EnterBankManually;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class EnterBankManually extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterBankManually INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterBankManually();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$EnterBankManually$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterBankManually.$r8$lambda$ghGYrgwaJvDnOGib8ko7eaTUjFQ();
            }
        });

        public final int hashCode() {
            return 2108683262;
        }

        private EnterBankManually() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ghGYrgwaJvDnOGib8ko7eaTUjFQ() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterBankManually", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterBankManually> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "EnterBankManually";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterBankManually)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SearchInstitutions;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class SearchInstitutions extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$SearchInstitutions$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions.m21512$r8$lambda$Qzs2F6D_j7Pg4LJ1e5BTt2mKbI();
            }
        });

        public final int hashCode() {
            return 496981900;
        }

        private SearchInstitutions() {
            super(null);
        }

        /* renamed from: $r8$lambda$Qzs2F6D_j7Pg4LJ1e5BTt2-mKbI, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m21512$r8$lambda$Qzs2F6D_j7Pg4LJ1e5BTt2mKbI() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "SearchInstitutions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OpenAmexAccount;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class OpenAmexAccount extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.OpenAmexAccount INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.OpenAmexAccount();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$OpenAmexAccount$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.OpenAmexAccount.$r8$lambda$kKwvMEn1YhURHu2Ftyc5U0aC9YQ();
            }
        });

        public final int hashCode() {
            return -153696453;
        }

        private OpenAmexAccount() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$kKwvMEn1YhURHu2Ftyc5U0aC9YQ() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.OpenAmexAccount", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.OpenAmexAccount> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "OpenAmexAccount";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.OpenAmexAccount)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000232B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b1\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneyReviewDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/AddMoneyFlow;", "", "amount", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "addMoneyConfig", "", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrument;", "fundingInstruments", "inEligibleFundingInstruments", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneyReviewDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneyReviewDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "getAddMoneyConfig", "Ljava/util/List;", "getFundingInstruments", "getInEligibleFundingInstruments", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AddMoneyReviewDestination extends com.paypal.oslo.feature.wallet.wallet.ui.Destination implements com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyFlow {
        private final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig;
        private final java.lang.String amount;
        private final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> fundingInstruments;
        private final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> inEligibleFundingInstruments;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddMoneyReviewDestination$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination.$r8$lambda$jjlZRHGILaCkal4BTOVvZ_MH02g();
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddMoneyReviewDestination$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination.$r8$lambda$FiJiLQmaJcBot9zgv5akmtsY9vI();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneyReviewDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneyReviewDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddMoneyReviewDestination$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AddMoneyReviewDestination(int i, java.lang.String str, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, java.util.List list, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddMoneyReviewDestination$$serializer.INSTANCE.getDescriptor());
            }
            this.amount = str;
            this.addMoneyConfig = addMoneyConfig;
            if ((i & 4) == 0) {
                this.fundingInstruments = kotlin.collections.CollectionsKt.emptyList();
            } else {
                this.fundingInstruments = list;
            }
            if ((i & 8) == 0) {
                this.inEligibleFundingInstruments = kotlin.collections.CollectionsKt.emptyList();
            } else {
                this.inEligibleFundingInstruments = list2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddMoneyReviewDestination(java.lang.String str, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> list, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> list2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.amount = str;
            this.addMoneyConfig = addMoneyConfig;
            this.fundingInstruments = list;
            this.inEligibleFundingInstruments = list2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.amount);
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$serializer.INSTANCE, self.addMoneyConfig);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.fundingInstruments, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.fundingInstruments);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.inEligibleFundingInstruments, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.inEligibleFundingInstruments);
            }
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig getAddMoneyConfig() {
            return this.addMoneyConfig;
        }

        public /* synthetic */ AddMoneyReviewDestination(java.lang.String str, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, addMoneyConfig, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> getInEligibleFundingInstruments() {
            return this.inEligibleFundingInstruments;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$FiJiLQmaJcBot9zgv5akmtsY9vI() {
            return new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument.class), new java.lang.annotation.Annotation[0]));
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$jjlZRHGILaCkal4BTOVvZ_MH02g() {
            return new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument.class), new java.lang.annotation.Annotation[0]));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig = this.addMoneyConfig;
            java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> list = this.fundingInstruments;
            java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> list2 = this.inEligibleFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddMoneyReviewDestination(amount=");
            sb.append(str);
            sb.append(", addMoneyConfig=");
            sb.append(addMoneyConfig);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(", inEligibleFundingInstruments=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.amount.hashCode() * 31) + this.addMoneyConfig.hashCode()) * 31) + this.fundingInstruments.hashCode()) * 31) + this.inEligibleFundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination addMoneyReviewDestination = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, addMoneyReviewDestination.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.addMoneyConfig, addMoneyReviewDestination.addMoneyConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, addMoneyReviewDestination.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.inEligibleFundingInstruments, addMoneyReviewDestination.inEligibleFundingInstruments);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination copy(java.lang.String amount, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> fundingInstruments, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> inEligibleFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inEligibleFundingInstruments, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination(amount, addMoneyConfig, fundingInstruments, inEligibleFundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> component4() {
            return this.inEligibleFundingInstruments;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument> component3() {
            return this.fundingInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig getAddMoneyConfig() {
            return this.addMoneyConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination addMoneyReviewDestination, java.lang.String str, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addMoneyReviewDestination.amount;
            }
            if ((i & 2) != 0) {
                addMoneyConfig = addMoneyReviewDestination.addMoneyConfig;
            }
            if ((i & 4) != 0) {
                list = addMoneyReviewDestination.fundingInstruments;
            }
            if ((i & 8) != 0) {
                list2 = addMoneyReviewDestination.inEligibleFundingInstruments;
            }
            return addMoneyReviewDestination.copy(str, addMoneyConfig, list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneySuccessDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "amount", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "addMoneyConfig", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "addFundType", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "component3", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneySuccessDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneySuccessDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAmount", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "getAddMoneyConfig", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "getAddFundType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AddMoneySuccessDestination extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType;
        private final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money amount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination.Companion(null);
        public static final int $stable = com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.$stable;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddMoneySuccessDestination$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType", com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType.values());
                return createSimpleEnumSerializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneySuccessDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddMoneySuccessDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddMoneySuccessDestination$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AddMoneySuccessDestination(int i, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddMoneySuccessDestination$$serializer.INSTANCE.getDescriptor());
            }
            this.amount = money;
            this.addMoneyConfig = addMoneyConfig;
            this.addFundType = addFundType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMoneySuccessDestination(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundType, "");
            this.amount = money;
            this.addMoneyConfig = addMoneyConfig;
            this.addFundType = addFundType;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.wallet.common.domain.model.Money$$serializer.INSTANCE, self.amount);
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$serializer.INSTANCE, self.addMoneyConfig);
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.addFundType);
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig getAddMoneyConfig() {
            return this.addMoneyConfig;
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType getAddFundType() {
            return this.addFundType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.amount;
            com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig = this.addMoneyConfig;
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType = this.addFundType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddMoneySuccessDestination(amount=");
            sb.append(money);
            sb.append(", addMoneyConfig=");
            sb.append(addMoneyConfig);
            sb.append(", addFundType=");
            sb.append(addFundType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.amount.hashCode() * 31) + this.addMoneyConfig.hashCode()) * 31) + this.addFundType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination addMoneySuccessDestination = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, addMoneySuccessDestination.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.addMoneyConfig, addMoneySuccessDestination.addMoneyConfig) && this.addFundType == addMoneySuccessDestination.addFundType;
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination copy(com.paypal.oslo.feature.wallet.common.domain.model.Money amount, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundType, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination(amount, addMoneyConfig, addFundType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType getAddFundType() {
            return this.addFundType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig getAddMoneyConfig() {
            return this.addMoneyConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination addMoneySuccessDestination, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                money = addMoneySuccessDestination.amount;
            }
            if ((i & 2) != 0) {
                addMoneyConfig = addMoneySuccessDestination.addMoneyConfig;
            }
            if ((i & 4) != 0) {
                addFundType = addMoneySuccessDestination.addFundType;
            }
            return addMoneySuccessDestination.copy(money, addMoneyConfig, addFundType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneySuccessDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "amount", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneySuccessDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneySuccessDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes3.dex */
    public static final /* data */ class WithdrawMoneySuccessDestination extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination.Companion(null);
        private final java.lang.String amount;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneySuccessDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneySuccessDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$WithdrawMoneySuccessDestination$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WithdrawMoneySuccessDestination(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.wallet.ui.Destination$WithdrawMoneySuccessDestination$$serializer.INSTANCE.getDescriptor());
            }
            this.amount = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawMoneySuccessDestination(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawMoneySuccessDestination(amount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination) other).amount);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination withdrawMoneySuccessDestination, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = withdrawMoneySuccessDestination.amount;
            }
            return withdrawMoneySuccessDestination.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$TransferAmountEntry;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class TransferAmountEntry extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$TransferAmountEntry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry.$r8$lambda$7gsRDqXEzjOjbesHd34eUn0vOFQ();
            }
        });

        public final int hashCode() {
            return -1833642202;
        }

        private TransferAmountEntry() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$7gsRDqXEzjOjbesHd34eUn0vOFQ() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "TransferAmountEntry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankManual;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class AddBankManual extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankManual$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual.m21506$r8$lambda$Ah456Yo8J_vrqiTO2fZWgHnjgo();
            }
        });

        public final int hashCode() {
            return 1307218682;
        }

        private AddBankManual() {
            super(null);
        }

        /* renamed from: $r8$lambda$Ah456Yo8J_vrqi-TO2fZWgHnjgo, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m21506$r8$lambda$Ah456Yo8J_vrqiTO2fZWgHnjgo() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "AddBankManual";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ManualAddBankRouter;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class ManualAddBankRouter extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$ManualAddBankRouter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter.$r8$lambda$ued5xP7KEnEA97fsX19pnO3p4Qw();
            }
        });

        public final int hashCode() {
            return -1237418217;
        }

        private ManualAddBankRouter() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ued5xP7KEnEA97fsX19pnO3p4Qw() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "ManualAddBankRouter";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankManualConfirmation;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "bankAccountId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "initialDetails", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankManualConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankManualConfirmation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getBankAccountId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "getInitialDetails", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AddBankManualConfirmation extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final java.lang.String bankAccountId;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails initialDetails;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankManualConfirmation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankManualConfirmation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankManualConfirmation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AddBankManualConfirmation(int i, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankManualConfirmation$$serializer.INSTANCE.getDescriptor());
            }
            this.bankAccountId = str;
            if ((i & 2) == 0) {
                this.initialDetails = null;
            } else {
                this.initialDetails = bankAccountDetails;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBankManualConfirmation(java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.bankAccountId = str;
            this.initialDetails = bankAccountDetails;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.bankAccountId);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.initialDetails != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$serializer.INSTANCE, self.initialDetails);
            }
        }

        public /* synthetic */ AddBankManualConfirmation(java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bankAccountDetails);
        }

        public final java.lang.String getBankAccountId() {
            return this.bankAccountId;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getInitialDetails() {
            return this.initialDetails;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankAccountId;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.initialDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankManualConfirmation(bankAccountId=");
            sb.append(str);
            sb.append(", initialDetails=");
            sb.append(bankAccountDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bankAccountId.hashCode();
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.initialDetails;
            return (hashCode * 31) + (bankAccountDetails == null ? 0 : bankAccountDetails.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation addBankManualConfirmation = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountId, addBankManualConfirmation.bankAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialDetails, addBankManualConfirmation.initialDetails);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation copy(java.lang.String bankAccountId, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails initialDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation(bankAccountId, initialDetails);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getInitialDetails() {
            return this.initialDetails;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankAccountId() {
            return this.bankAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation addBankManualConfirmation, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addBankManualConfirmation.bankAccountId;
            }
            if ((i & 2) != 0) {
                bankAccountDetails = addBankManualConfirmation.initialDetails;
            }
            return addBankManualConfirmation.copy(str, bankAccountDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J'\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositInstructions;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "bankAccountId", "", "showInstantConfirmation", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "bankAccountDetails", "<init>", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "copy", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositInstructions;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositInstructions;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getBankAccountId", "Z", "getShowInstantConfirmation", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "getBankAccountDetails", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class RandomDepositInstructions extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails;
        private final java.lang.String bankAccountId;
        private final boolean showInstantConfirmation;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositInstructions$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositInstructions;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$RandomDepositInstructions$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RandomDepositInstructions(int i, java.lang.String str, boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.wallet.ui.Destination$RandomDepositInstructions$$serializer.INSTANCE.getDescriptor());
            }
            this.bankAccountId = str;
            if ((i & 2) == 0) {
                this.showInstantConfirmation = false;
            } else {
                this.showInstantConfirmation = z;
            }
            if ((i & 4) == 0) {
                this.bankAccountDetails = null;
            } else {
                this.bankAccountDetails = bankAccountDetails;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RandomDepositInstructions(java.lang.String str, boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.bankAccountId = str;
            this.showInstantConfirmation = z;
            this.bankAccountDetails = bankAccountDetails;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.bankAccountId);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.showInstantConfirmation) {
                output.encodeBooleanElement(serialDesc, 1, self.showInstantConfirmation);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.bankAccountDetails != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$serializer.INSTANCE, self.bankAccountDetails);
            }
        }

        public /* synthetic */ RandomDepositInstructions(java.lang.String str, boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bankAccountDetails);
        }

        public final java.lang.String getBankAccountId() {
            return this.bankAccountId;
        }

        public final boolean getShowInstantConfirmation() {
            return this.showInstantConfirmation;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getBankAccountDetails() {
            return this.bankAccountDetails;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankAccountId;
            boolean z = this.showInstantConfirmation;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.bankAccountDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RandomDepositInstructions(bankAccountId=");
            sb.append(str);
            sb.append(", showInstantConfirmation=");
            sb.append(z);
            sb.append(", bankAccountDetails=");
            sb.append(bankAccountDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bankAccountId.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.showInstantConfirmation);
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.bankAccountDetails;
            return (((hashCode * 31) + hashCode2) * 31) + (bankAccountDetails == null ? 0 : bankAccountDetails.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions randomDepositInstructions = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountId, randomDepositInstructions.bankAccountId) && this.showInstantConfirmation == randomDepositInstructions.showInstantConfirmation && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountDetails, randomDepositInstructions.bankAccountDetails);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions copy(java.lang.String bankAccountId, boolean showInstantConfirmation, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions(bankAccountId, showInstantConfirmation, bankAccountDetails);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getBankAccountDetails() {
            return this.bankAccountDetails;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowInstantConfirmation() {
            return this.showInstantConfirmation;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankAccountId() {
            return this.bankAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions randomDepositInstructions, java.lang.String str, boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = randomDepositInstructions.bankAccountId;
            }
            if ((i & 2) != 0) {
                z = randomDepositInstructions.showInstantConfirmation;
            }
            if ((i & 4) != 0) {
                bankAccountDetails = randomDepositInstructions.bankAccountDetails;
            }
            return randomDepositInstructions.copy(str, z, bankAccountDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositsBankConfirmation;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "bankAccountDetails", "", "shouldShowBack", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;Z)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositsBankConfirmation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositsBankConfirmation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "getBankAccountDetails", "Z", "getShouldShowBack", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class RandomDepositsBankConfirmation extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails;
        private final boolean shouldShowBack;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositsBankConfirmation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$RandomDepositsBankConfirmation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$RandomDepositsBankConfirmation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RandomDepositsBankConfirmation(int i, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.wallet.ui.Destination$RandomDepositsBankConfirmation$$serializer.INSTANCE.getDescriptor());
            }
            this.bankAccountDetails = bankAccountDetails;
            if ((i & 2) == 0) {
                this.shouldShowBack = false;
            } else {
                this.shouldShowBack = z;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RandomDepositsBankConfirmation(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetails, "");
            this.bankAccountDetails = bankAccountDetails;
            this.shouldShowBack = z;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$serializer.INSTANCE, self.bankAccountDetails);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.shouldShowBack) {
                output.encodeBooleanElement(serialDesc, 1, self.shouldShowBack);
            }
        }

        public /* synthetic */ RandomDepositsBankConfirmation(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bankAccountDetails, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getBankAccountDetails() {
            return this.bankAccountDetails;
        }

        public final boolean getShouldShowBack() {
            return this.shouldShowBack;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.bankAccountDetails;
            boolean z = this.shouldShowBack;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RandomDepositsBankConfirmation(bankAccountDetails=");
            sb.append(bankAccountDetails);
            sb.append(", shouldShowBack=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.bankAccountDetails.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldShowBack);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation randomDepositsBankConfirmation = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountDetails, randomDepositsBankConfirmation.bankAccountDetails) && this.shouldShowBack == randomDepositsBankConfirmation.shouldShowBack;
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation copy(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, boolean shouldShowBack) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetails, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation(bankAccountDetails, shouldShowBack);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldShowBack() {
            return this.shouldShowBack;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getBankAccountDetails() {
            return this.bankAccountDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation randomDepositsBankConfirmation, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAccountDetails = randomDepositsBankConfirmation.bankAccountDetails;
            }
            if ((i & 2) != 0) {
                z = randomDepositsBankConfirmation.shouldShowBack;
            }
            return randomDepositsBankConfirmation.copy(bankAccountDetails, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$NoAuthSecureWebViewDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "urlResId", "", "url", "<init>", "(ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$NoAuthSecureWebViewDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$NoAuthSecureWebViewDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getUrlResId", "Ljava/lang/String;", "getUrl", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class NoAuthSecureWebViewDestination extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination.Companion(null);
        private final java.lang.String url;
        private final int urlResId;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$NoAuthSecureWebViewDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$NoAuthSecureWebViewDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$NoAuthSecureWebViewDestination$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ NoAuthSecureWebViewDestination(int i, int i2, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            i2 = (i & 1) == 0 ? 0 : i2;
            this.urlResId = i2;
            if ((i & 2) == 0) {
                this.url = "";
            } else {
                this.url = str;
            }
            if (i2 == 0 && kotlin.text.StringsKt.isBlank(this.url)) {
                throw new java.lang.IllegalArgumentException("NoAuthSecureWebViewDestination requires either a valid urlResId or a non-empty url".toString());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoAuthSecureWebViewDestination(int i, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.urlResId = i;
            this.url = str;
            if (i == 0 && kotlin.text.StringsKt.isBlank(str)) {
                throw new java.lang.IllegalArgumentException("NoAuthSecureWebViewDestination requires either a valid urlResId or a non-empty url".toString());
            }
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.urlResId != 0) {
                output.encodeIntElement(serialDesc, 0, self.urlResId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 1, self.url);
            }
        }

        public final int getUrlResId() {
            return this.urlResId;
        }

        public /* synthetic */ NoAuthSecureWebViewDestination(int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            int i = this.urlResId;
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoAuthSecureWebViewDestination(urlResId=");
            sb.append(i);
            sb.append(", url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.urlResId) * 31) + this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination noAuthSecureWebViewDestination = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination) other;
            return this.urlResId == noAuthSecureWebViewDestination.urlResId && kotlin.jvm.internal.Intrinsics.areEqual(this.url, noAuthSecureWebViewDestination.url);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination copy(int urlResId, java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination(urlResId, url);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final int getUrlResId() {
            return this.urlResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination noAuthSecureWebViewDestination, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = noAuthSecureWebViewDestination.urlResId;
            }
            if ((i2 & 2) != 0) {
                str = noAuthSecureWebViewDestination.url;
            }
            return noAuthSecureWebViewDestination.copy(i, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoAuthSecureWebViewDestination() {
            this(0, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015JD\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0015J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankSummaryScreen;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;", "linkedAccounts", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "nonLinkedAccounts", "", "bankName", "bankLogoBase64", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankSummaryScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankSummaryScreen;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getLinkedAccounts", "getNonLinkedAccounts", "Ljava/lang/String;", "getBankName", "getBankLogoBase64", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AddBankSummaryScreen extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final java.lang.String bankLogoBase64;
        private final java.lang.String bankName;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> linkedAccounts;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> nonLinkedAccounts;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankSummaryScreen$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen.$r8$lambda$SopVyQYCqbNV4Nk9eOQqpbNslWw();
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankSummaryScreen$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen.$r8$lambda$FadwVoe1G4aZzUcboIzxE2zZJtc();
            }
        }), null, null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankSummaryScreen$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankSummaryScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankSummaryScreen$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AddBankSummaryScreen(int i, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (15 != (i & 15)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankSummaryScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.linkedAccounts = list;
            this.nonLinkedAccounts = list2;
            this.bankName = str;
            this.bankLogoBase64 = str2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBankSummaryScreen(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2, java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.linkedAccounts = list;
            this.nonLinkedAccounts = list2;
            this.bankName = str;
            this.bankLogoBase64 = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.linkedAccounts);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.nonLinkedAccounts);
            output.encodeStringElement(serialDesc, 2, self.bankName);
            output.encodeStringElement(serialDesc, 3, self.bankLogoBase64);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> getLinkedAccounts() {
            return this.linkedAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> getNonLinkedAccounts() {
            return this.nonLinkedAccounts;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String getBankLogoBase64() {
            return this.bankLogoBase64;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$FadwVoe1G4aZzUcboIzxE2zZJtc() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult$$serializer.INSTANCE);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$SopVyQYCqbNV4Nk9eOQqpbNslWw() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list = this.linkedAccounts;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2 = this.nonLinkedAccounts;
            java.lang.String str = this.bankName;
            java.lang.String str2 = this.bankLogoBase64;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankSummaryScreen(linkedAccounts=");
            sb.append(list);
            sb.append(", nonLinkedAccounts=");
            sb.append(list2);
            sb.append(", bankName=");
            sb.append(str);
            sb.append(", bankLogoBase64=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.linkedAccounts.hashCode() * 31) + this.nonLinkedAccounts.hashCode()) * 31) + this.bankName.hashCode()) * 31) + this.bankLogoBase64.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen addBankSummaryScreen = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedAccounts, addBankSummaryScreen.linkedAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonLinkedAccounts, addBankSummaryScreen.nonLinkedAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, addBankSummaryScreen.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoBase64, addBankSummaryScreen.bankLogoBase64);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen copy(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> linkedAccounts, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> nonLinkedAccounts, java.lang.String bankName, java.lang.String bankLogoBase64) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAccounts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonLinkedAccounts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankLogoBase64, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen(linkedAccounts, nonLinkedAccounts, bankName, bankLogoBase64);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBankLogoBase64() {
            return this.bankLogoBase64;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> component2() {
            return this.nonLinkedAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> component1() {
            return this.linkedAccounts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen addBankSummaryScreen, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = addBankSummaryScreen.linkedAccounts;
            }
            if ((i & 2) != 0) {
                list2 = addBankSummaryScreen.nonLinkedAccounts;
            }
            if ((i & 4) != 0) {
                str = addBankSummaryScreen.bankName;
            }
            if ((i & 8) != 0) {
                str2 = addBankSummaryScreen.bankLogoBase64;
            }
            return addBankSummaryScreen.copy(list, list2, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankPlaid;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "action", "", "instrumentId", "countryCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "bank", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component2", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankPlaid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankPlaid;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getFlow", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "getAction", "Ljava/lang/String;", "getInstrumentId", "getCountryCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getBank", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AddBankPlaid extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank;
        private final java.lang.String countryCode;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow;
        private final java.lang.String instrumentId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankPlaid$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.INSTANCE.serializer();
                return serializer;
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankPlaid$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction", com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.values());
                return createSimpleEnumSerializer;
            }
        }), null, null, null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankPlaid$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankPlaid;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankPlaid$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AddBankPlaid(int i, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            this.flow = (i & 1) == 0 ? com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET : addFIFlow;
            if ((i & 2) == 0) {
                this.action = com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD;
            } else {
                this.action = externalBankAccessAction;
            }
            if ((i & 4) == 0) {
                this.instrumentId = null;
            } else {
                this.instrumentId = str;
            }
            if ((i & 8) == 0) {
                this.countryCode = "US";
            } else {
                this.countryCode = str2;
            }
            if ((i & 16) == 0) {
                this.bank = null;
            } else {
                this.bank = instantBankConfirmationBankDetails;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBankPlaid(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.flow = addFIFlow;
            this.action = externalBankAccessAction;
            this.instrumentId = str;
            this.countryCode = str2;
            this.bank = instantBankConfirmationBankDetails;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.flow != com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.flow);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.action != com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.action);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.instrumentId != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.instrumentId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.countryCode, "US")) {
                output.encodeStringElement(serialDesc, 3, self.countryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.bank != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE, self.bank);
            }
        }

        public /* synthetic */ AddBankPlaid(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET : addFIFlow, (i & 2) != 0 ? com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD : externalBankAccessAction, (i & 4) != 0 ? null : str, (i & 8) != 0 ? "US" : str2, (i & 16) == 0 ? instantBankConfirmationBankDetails : null);
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getFlow() {
            return this.flow;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
            return this.action;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
            return this.bank;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.flow;
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction = this.action;
            java.lang.String str = this.instrumentId;
            java.lang.String str2 = this.countryCode;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankPlaid(flow=");
            sb.append(addFIFlow);
            sb.append(", action=");
            sb.append(externalBankAccessAction);
            sb.append(", instrumentId=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(", bank=");
            sb.append(instantBankConfirmationBankDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.flow.hashCode();
            int hashCode2 = this.action.hashCode();
            java.lang.String str = this.instrumentId;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.countryCode.hashCode();
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (instantBankConfirmationBankDetails != null ? instantBankConfirmationBankDetails.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid addBankPlaid = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid) other;
            return this.flow == addBankPlaid.flow && this.action == addBankPlaid.action && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, addBankPlaid.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, addBankPlaid.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.bank, addBankPlaid.bank);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid copy(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action, java.lang.String instrumentId, java.lang.String countryCode, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid(flow, action, instrumentId, countryCode, bank);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
            return this.bank;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
            return this.action;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getFlow() {
            return this.flow;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid addBankPlaid, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFIFlow = addBankPlaid.flow;
            }
            if ((i & 2) != 0) {
                externalBankAccessAction = addBankPlaid.action;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction2 = externalBankAccessAction;
            if ((i & 4) != 0) {
                str = addBankPlaid.instrumentId;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                str2 = addBankPlaid.countryCode;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                instantBankConfirmationBankDetails = addBankPlaid.bank;
            }
            return addBankPlaid.copy(addFIFlow, externalBankAccessAction2, str3, str4, instantBankConfirmationBankDetails);
        }

        public AddBankPlaid() {
            this((com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow) null, (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) null, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J'\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/AddBankConsentFlowContentId;", "addBankConsentFlowContentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "config", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "bankAccount", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "instantBankConfirmationAggregatorParams", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/AddBankConsentFlowContentId;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/banks/ui/consent/model/AddBankConsentFlowContentId;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/AddBankConsentFlowContentId;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "component3", "()Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "component4", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "component5", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/AddBankConsentFlowContentId;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/AddBankConsentFlowContentId;", "getAddBankConsentFlowContentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "getAnalyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "getConfig", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "getBankAccount", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "getInstantBankConfirmationAggregatorParams", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class OBConsentScreen extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount;
        private final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig config;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen.Companion(null);
        public static final int $stable = com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig.$stable | com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.$stable;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$OBConsentScreen$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.INSTANCE.serializer();
                return serializer;
            }
        }), null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$OBConsentScreen$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$OBConsentScreen$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OBConsentScreen(int i, com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (6 != (i & 6)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 6, com.paypal.oslo.feature.wallet.wallet.ui.Destination$OBConsentScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.addBankConsentFlowContentId = (i & 1) == 0 ? com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.DEFAULT_FAB : addBankConsentFlowContentId;
            this.analyticsContext = addFIAnalyticsContext;
            this.config = addBankConfig;
            if ((i & 8) == 0) {
                this.bankAccount = null;
            } else {
                this.bankAccount = bankAccount;
            }
            if ((i & 16) == 0) {
                this.instantBankConfirmationAggregatorParams = null;
            } else {
                this.instantBankConfirmationAggregatorParams = instantBankConfirmationAggregatorParams;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OBConsentScreen(com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConsentFlowContentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIAnalyticsContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConfig, "");
            this.addBankConsentFlowContentId = addBankConsentFlowContentId;
            this.analyticsContext = addFIAnalyticsContext;
            this.config = addBankConfig;
            this.bankAccount = bankAccount;
            this.instantBankConfirmationAggregatorParams = instantBankConfirmationAggregatorParams;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.addBankConsentFlowContentId != com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.DEFAULT_FAB) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.addBankConsentFlowContentId);
            }
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, self.analyticsContext);
            output.encodeSerializableElement(serialDesc, 2, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig$$serializer.INSTANCE, self.config);
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.bankAccount != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount$$serializer.INSTANCE, self.bankAccount);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.instantBankConfirmationAggregatorParams != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.instantBankConfirmationAggregatorParams);
            }
        }

        public /* synthetic */ OBConsentScreen(com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.DEFAULT_FAB : addBankConsentFlowContentId, addFIAnalyticsContext, addBankConfig, (i & 8) != 0 ? null : bankAccount, (i & 16) != 0 ? null : instantBankConfirmationAggregatorParams);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId getAddBankConsentFlowContentId() {
            return this.addBankConsentFlowContentId;
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getAnalyticsContext() {
            return this.analyticsContext;
        }

        public final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig getConfig() {
            return this.config;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount getBankAccount() {
            return this.bankAccount;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams getInstantBankConfirmationAggregatorParams() {
            return this.instantBankConfirmationAggregatorParams;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId = this.addBankConsentFlowContentId;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext = this.analyticsContext;
            com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig = this.config;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount = this.bankAccount;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams = this.instantBankConfirmationAggregatorParams;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OBConsentScreen(addBankConsentFlowContentId=");
            sb.append(addBankConsentFlowContentId);
            sb.append(", analyticsContext=");
            sb.append(addFIAnalyticsContext);
            sb.append(", config=");
            sb.append(addBankConfig);
            sb.append(", bankAccount=");
            sb.append(bankAccount);
            sb.append(", instantBankConfirmationAggregatorParams=");
            sb.append(instantBankConfirmationAggregatorParams);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.addBankConsentFlowContentId.hashCode();
            int hashCode2 = this.analyticsContext.hashCode();
            int hashCode3 = this.config.hashCode();
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount = this.bankAccount;
            int hashCode4 = bankAccount == null ? 0 : bankAccount.hashCode();
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams = this.instantBankConfirmationAggregatorParams;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (instantBankConfirmationAggregatorParams != null ? instantBankConfirmationAggregatorParams.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen oBConsentScreen = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen) other;
            return this.addBankConsentFlowContentId == oBConsentScreen.addBankConsentFlowContentId && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsContext, oBConsentScreen.analyticsContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, oBConsentScreen.config) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccount, oBConsentScreen.bankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.instantBankConfirmationAggregatorParams, oBConsentScreen.instantBankConfirmationAggregatorParams);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen copy(com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig config, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConsentFlowContentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen(addBankConsentFlowContentId, analyticsContext, config, bankAccount, instantBankConfirmationAggregatorParams);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams getInstantBankConfirmationAggregatorParams() {
            return this.instantBankConfirmationAggregatorParams;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount getBankAccount() {
            return this.bankAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig getConfig() {
            return this.config;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getAnalyticsContext() {
            return this.analyticsContext;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId getAddBankConsentFlowContentId() {
            return this.addBankConsentFlowContentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen oBConsentScreen, com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addBankConsentFlowContentId = oBConsentScreen.addBankConsentFlowContentId;
            }
            if ((i & 2) != 0) {
                addFIAnalyticsContext = oBConsentScreen.analyticsContext;
            }
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext2 = addFIAnalyticsContext;
            if ((i & 4) != 0) {
                addBankConfig = oBConsentScreen.config;
            }
            com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig2 = addBankConfig;
            if ((i & 8) != 0) {
                bankAccount = oBConsentScreen.bankAccount;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount2 = bankAccount;
            if ((i & 16) != 0) {
                instantBankConfirmationAggregatorParams = oBConsentScreen.instantBankConfirmationAggregatorParams;
            }
            return oBConsentScreen.copy(addBankConsentFlowContentId, addFIAnalyticsContext2, addBankConfig2, bankAccount2, instantBankConfirmationAggregatorParams);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneyReview;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneyReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneyReview;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;", "getConfig", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes3.dex */
    public static final /* data */ class WithdrawMoneyReview extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview.Companion(null);
        private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig config;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneyReview$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneyReview;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$WithdrawMoneyReview$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WithdrawMoneyReview(int i, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.wallet.ui.Destination$WithdrawMoneyReview$$serializer.INSTANCE.getDescriptor());
            }
            this.config = withdrawMoneyReviewConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawMoneyReview(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyReviewConfig, "");
            this.config = withdrawMoneyReviewConfig;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig getConfig() {
            return this.config;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig = this.config;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawMoneyReview(config=");
            sb.append(withdrawMoneyReviewConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, ((com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview) other).config);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview copy(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview(config);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig getConfig() {
            return this.config;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview withdrawMoneyReview, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                withdrawMoneyReviewConfig = withdrawMoneyReview.config;
            }
            return withdrawMoneyReview.copy(withdrawMoneyReviewConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$WithdrawMoneySuccess;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class WithdrawMoneySuccess extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccess INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccess();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$WithdrawMoneySuccess$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccess.m21513$r8$lambda$4vxAsgRsNYjDmi6ZiqOb8v9qmc();
            }
        });

        public final int hashCode() {
            return 1447913750;
        }

        private WithdrawMoneySuccess() {
            super(null);
        }

        /* renamed from: $r8$lambda$4vxAsgR-sNYjDmi6ZiqOb8v9qmc, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m21513$r8$lambda$4vxAsgRsNYjDmi6ZiqOb8v9qmc() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccess", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccess> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "WithdrawMoneySuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$IneligibleFI;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes16.dex */
    public static final /* data */ class IneligibleFI extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.IneligibleFI INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.IneligibleFI();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$IneligibleFI$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination.IneligibleFI.$r8$lambda$D_53ZyFeH8AdtCj4QtDLntKlh6Q();
            }
        });

        public final int hashCode() {
            return 1557302920;
        }

        private IneligibleFI() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$D_53ZyFeH8AdtCj4QtDLntKlh6Q() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.wallet.ui.Destination.IneligibleFI", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.IneligibleFI> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "IneligibleFI";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.IneligibleFI)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u007f\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&Jz\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u0019J'\u00107\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "aggregatorName", "externalBankId", "bankName", "countryCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "bankLogoUrl", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "action", "instrumentId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "bank", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component8", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "component9", "component10", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAggregatorName", "getExternalBankId", "getBankName", "getCountryCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "getIntegrationType", "getBankLogoUrl", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getFlow", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "getAction", "getInstrumentId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getBank", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AddBankFinicity extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action;
        private final java.lang.String aggregatorName;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank;
        private final java.lang.String bankLogoUrl;
        private final java.lang.String bankName;
        private final java.lang.String countryCode;
        private final java.lang.String externalBankId;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow;
        private final java.lang.String instrumentId;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankFinicity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType", com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.values());
                return createSimpleEnumSerializer;
            }
        }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankFinicity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.INSTANCE.serializer();
                return serializer;
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankFinicity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction", com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.values());
                return createSimpleEnumSerializer;
            }
        }), null, null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankFinicity$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AddBankFinicity(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str5, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (903 != (i & androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING, com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankFinicity$$serializer.INSTANCE.getDescriptor());
            }
            this.aggregatorName = str;
            this.externalBankId = str2;
            this.bankName = str3;
            if ((i & 8) == 0) {
                this.countryCode = "US";
            } else {
                this.countryCode = str4;
            }
            if ((i & 16) == 0) {
                this.integrationType = com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2;
            } else {
                this.integrationType = integrationType;
            }
            if ((i & 32) == 0) {
                this.bankLogoUrl = null;
            } else {
                this.bankLogoUrl = str5;
            }
            if ((i & 64) == 0) {
                this.flow = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET;
            } else {
                this.flow = addFIFlow;
            }
            this.action = externalBankAccessAction;
            this.instrumentId = str6;
            this.bank = instantBankConfirmationBankDetails;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBankFinicity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str5, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessAction, "");
            this.aggregatorName = str;
            this.externalBankId = str2;
            this.bankName = str3;
            this.countryCode = str4;
            this.integrationType = integrationType;
            this.bankLogoUrl = str5;
            this.flow = addFIFlow;
            this.action = externalBankAccessAction;
            this.instrumentId = str6;
            this.bank = instantBankConfirmationBankDetails;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.aggregatorName);
            output.encodeStringElement(serialDesc, 1, self.externalBankId);
            output.encodeStringElement(serialDesc, 2, self.bankName);
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.countryCode, "US")) {
                output.encodeStringElement(serialDesc, 3, self.countryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.integrationType != com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.integrationType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.bankLogoUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.bankLogoUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.flow != com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.flow);
            }
            output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.action);
            output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.instrumentId);
            output.encodeNullableSerializableElement(serialDesc, 9, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE, self.bank);
        }

        public final java.lang.String getAggregatorName() {
            return this.aggregatorName;
        }

        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public /* synthetic */ AddBankFinicity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str5, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? "US" : str4, (i & 16) != 0 ? com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2 : integrationType, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET : addFIFlow, externalBankAccessAction, str6, instantBankConfirmationBankDetails);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
            return this.integrationType;
        }

        public final java.lang.String getBankLogoUrl() {
            return this.bankLogoUrl;
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getFlow() {
            return this.flow;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
            return this.action;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
            return this.bank;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.aggregatorName;
            java.lang.String str2 = this.externalBankId;
            java.lang.String str3 = this.bankName;
            java.lang.String str4 = this.countryCode;
            com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
            java.lang.String str5 = this.bankLogoUrl;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.flow;
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction = this.action;
            java.lang.String str6 = this.instrumentId;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankFinicity(aggregatorName=");
            sb.append(str);
            sb.append(", externalBankId=");
            sb.append(str2);
            sb.append(", bankName=");
            sb.append(str3);
            sb.append(", countryCode=");
            sb.append(str4);
            sb.append(", integrationType=");
            sb.append(integrationType);
            sb.append(", bankLogoUrl=");
            sb.append(str5);
            sb.append(", flow=");
            sb.append(addFIFlow);
            sb.append(", action=");
            sb.append(externalBankAccessAction);
            sb.append(", instrumentId=");
            sb.append(str6);
            sb.append(", bank=");
            sb.append(instantBankConfirmationBankDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.aggregatorName.hashCode();
            int hashCode2 = this.externalBankId.hashCode();
            int hashCode3 = this.bankName.hashCode();
            int hashCode4 = this.countryCode.hashCode();
            int hashCode5 = this.integrationType.hashCode();
            java.lang.String str = this.bankLogoUrl;
            int hashCode6 = str == null ? 0 : str.hashCode();
            int hashCode7 = this.flow.hashCode();
            int hashCode8 = this.action.hashCode();
            java.lang.String str2 = this.instrumentId;
            int hashCode9 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (instantBankConfirmationBankDetails != null ? instantBankConfirmationBankDetails.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity addBankFinicity = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.aggregatorName, addBankFinicity.aggregatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, addBankFinicity.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, addBankFinicity.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, addBankFinicity.countryCode) && this.integrationType == addBankFinicity.integrationType && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoUrl, addBankFinicity.bankLogoUrl) && this.flow == addBankFinicity.flow && this.action == addBankFinicity.action && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, addBankFinicity.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bank, addBankFinicity.bank);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity copy(java.lang.String aggregatorName, java.lang.String externalBankId, java.lang.String bankName, java.lang.String countryCode, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String bankLogoUrl, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action, java.lang.String instrumentId, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatorName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity(aggregatorName, externalBankId, bankName, countryCode, integrationType, bankLogoUrl, flow, action, instrumentId, bank);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
            return this.action;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getFlow() {
            return this.flow;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getBankLogoUrl() {
            return this.bankLogoUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
            return this.integrationType;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
            return this.bank;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAggregatorName() {
            return this.aggregatorName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0088\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u0019J'\u00107\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "aggregatorName", "externalBankId", "countryCode", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "bankName", "bankLogoUrl", "credentialToken", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "action", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "bank", "instrumentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "component9", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "component10", "component11", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAggregatorName", "getExternalBankId", "getCountryCode", "getIntegrationType", "getBankName", "getBankLogoUrl", "getCredentialToken", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "getAction", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getBank", "getInstrumentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getFlow", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AutoLink extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action;
        private final java.lang.String aggregatorName;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank;
        private final java.lang.String bankLogoUrl;
        private final java.lang.String bankName;
        private final java.lang.String countryCode;
        private final java.lang.String credentialToken;
        private final java.lang.String externalBankId;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow;
        private final java.lang.String instrumentId;
        private final java.lang.String integrationType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AutoLink$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction", com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.values());
                return createSimpleEnumSerializer;
            }
        }), null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$AutoLink$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$AutoLink$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AutoLink(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str8, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1667 != (i & 1667)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1667, com.paypal.oslo.feature.wallet.wallet.ui.Destination$AutoLink$$serializer.INSTANCE.getDescriptor());
            }
            this.aggregatorName = str;
            this.externalBankId = str2;
            if ((i & 4) == 0) {
                this.countryCode = "US";
            } else {
                this.countryCode = str3;
            }
            if ((i & 8) == 0) {
                this.integrationType = "OAUTH2";
            } else {
                this.integrationType = str4;
            }
            if ((i & 16) == 0) {
                this.bankName = null;
            } else {
                this.bankName = str5;
            }
            if ((i & 32) == 0) {
                this.bankLogoUrl = null;
            } else {
                this.bankLogoUrl = str6;
            }
            if ((i & 64) == 0) {
                this.credentialToken = null;
            } else {
                this.credentialToken = str7;
            }
            this.action = externalBankAccessAction;
            if ((i & 256) == 0) {
                this.bank = null;
            } else {
                this.bank = instantBankConfirmationBankDetails;
            }
            this.instrumentId = str8;
            this.flow = addFIFlow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoLink(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str8, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
            this.aggregatorName = str;
            this.externalBankId = str2;
            this.countryCode = str3;
            this.integrationType = str4;
            this.bankName = str5;
            this.bankLogoUrl = str6;
            this.credentialToken = str7;
            this.action = externalBankAccessAction;
            this.bank = instantBankConfirmationBankDetails;
            this.instrumentId = str8;
            this.flow = addFIFlow;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.aggregatorName);
            output.encodeStringElement(serialDesc, 1, self.externalBankId);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.countryCode, "US")) {
                output.encodeStringElement(serialDesc, 2, self.countryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.integrationType, "OAUTH2")) {
                output.encodeStringElement(serialDesc, 3, self.integrationType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.bankName != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.bankName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.bankLogoUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.bankLogoUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.credentialToken != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.credentialToken);
            }
            output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.action);
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.bank != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE, self.bank);
            }
            output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.instrumentId);
            output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.flow);
        }

        public final java.lang.String getAggregatorName() {
            return this.aggregatorName;
        }

        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        public /* synthetic */ AutoLink(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str8, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "US" : str3, (i & 8) != 0 ? "OAUTH2" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, externalBankAccessAction, (i & 256) != 0 ? null : instantBankConfirmationBankDetails, str8, addFIFlow);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getIntegrationType() {
            return this.integrationType;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String getBankLogoUrl() {
            return this.bankLogoUrl;
        }

        public final java.lang.String getCredentialToken() {
            return this.credentialToken;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
            return this.action;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
            return this.bank;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getFlow() {
            return this.flow;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.aggregatorName;
            java.lang.String str2 = this.externalBankId;
            java.lang.String str3 = this.countryCode;
            java.lang.String str4 = this.integrationType;
            java.lang.String str5 = this.bankName;
            java.lang.String str6 = this.bankLogoUrl;
            java.lang.String str7 = this.credentialToken;
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction = this.action;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
            java.lang.String str8 = this.instrumentId;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.flow;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoLink(aggregatorName=");
            sb.append(str);
            sb.append(", externalBankId=");
            sb.append(str2);
            sb.append(", countryCode=");
            sb.append(str3);
            sb.append(", integrationType=");
            sb.append(str4);
            sb.append(", bankName=");
            sb.append(str5);
            sb.append(", bankLogoUrl=");
            sb.append(str6);
            sb.append(", credentialToken=");
            sb.append(str7);
            sb.append(", action=");
            sb.append(externalBankAccessAction);
            sb.append(", bank=");
            sb.append(instantBankConfirmationBankDetails);
            sb.append(", instrumentId=");
            sb.append(str8);
            sb.append(", flow=");
            sb.append(addFIFlow);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.aggregatorName.hashCode();
            int hashCode2 = this.externalBankId.hashCode();
            int hashCode3 = this.countryCode.hashCode();
            int hashCode4 = this.integrationType.hashCode();
            java.lang.String str = this.bankName;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.bankLogoUrl;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.credentialToken;
            int hashCode7 = str3 == null ? 0 : str3.hashCode();
            int hashCode8 = this.action.hashCode();
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
            int hashCode9 = instantBankConfirmationBankDetails == null ? 0 : instantBankConfirmationBankDetails.hashCode();
            java.lang.String str4 = this.instrumentId;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.flow.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink autoLink = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.aggregatorName, autoLink.aggregatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, autoLink.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, autoLink.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.integrationType, autoLink.integrationType) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, autoLink.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoUrl, autoLink.bankLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialToken, autoLink.credentialToken) && this.action == autoLink.action && kotlin.jvm.internal.Intrinsics.areEqual(this.bank, autoLink.bank) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, autoLink.instrumentId) && this.flow == autoLink.flow;
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink copy(java.lang.String aggregatorName, java.lang.String externalBankId, java.lang.String countryCode, java.lang.String integrationType, java.lang.String bankName, java.lang.String bankLogoUrl, java.lang.String credentialToken, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank, java.lang.String instrumentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatorName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink(aggregatorName, externalBankId, countryCode, integrationType, bankName, bankLogoUrl, credentialToken, action, bank, instrumentId, flow);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
            return this.bank;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
            return this.action;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getCredentialToken() {
            return this.credentialToken;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getBankLogoUrl() {
            return this.bankLogoUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIntegrationType() {
            return this.integrationType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getFlow() {
            return this.flow;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAggregatorName() {
            return this.aggregatorName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012JZ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0012J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ChooseAccounts;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "", "aggregatorName", "credentialToken", "externalBankId", "countryCode", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "bankName", "bankLogoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ChooseAccounts;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ChooseAccounts;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAggregatorName", "getCredentialToken", "getExternalBankId", "getCountryCode", "getIntegrationType", "getBankName", "getBankLogoUrl", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ChooseAccounts extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts.Companion(null);
        private final java.lang.String aggregatorName;
        private final java.lang.String bankLogoUrl;
        private final java.lang.String bankName;
        private final java.lang.String countryCode;
        private final java.lang.String credentialToken;
        private final java.lang.String externalBankId;
        private final java.lang.String integrationType;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ChooseAccounts$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ChooseAccounts;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$ChooseAccounts$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ChooseAccounts(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.wallet.wallet.ui.Destination$ChooseAccounts$$serializer.INSTANCE.getDescriptor());
            }
            this.aggregatorName = str;
            this.credentialToken = str2;
            this.externalBankId = str3;
            if ((i & 8) == 0) {
                this.countryCode = "US";
            } else {
                this.countryCode = str4;
            }
            if ((i & 16) == 0) {
                this.integrationType = "HOSTED_URL";
            } else {
                this.integrationType = str5;
            }
            if ((i & 32) == 0) {
                this.bankName = null;
            } else {
                this.bankName = str6;
            }
            if ((i & 64) == 0) {
                this.bankLogoUrl = null;
            } else {
                this.bankLogoUrl = str7;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChooseAccounts(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.aggregatorName = str;
            this.credentialToken = str2;
            this.externalBankId = str3;
            this.countryCode = str4;
            this.integrationType = str5;
            this.bankName = str6;
            this.bankLogoUrl = str7;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.aggregatorName);
            output.encodeStringElement(serialDesc, 1, self.credentialToken);
            output.encodeStringElement(serialDesc, 2, self.externalBankId);
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.countryCode, "US")) {
                output.encodeStringElement(serialDesc, 3, self.countryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || !kotlin.jvm.internal.Intrinsics.areEqual(self.integrationType, "HOSTED_URL")) {
                output.encodeStringElement(serialDesc, 4, self.integrationType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.bankName != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.bankName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.bankLogoUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.bankLogoUrl);
            }
        }

        public final java.lang.String getAggregatorName() {
            return this.aggregatorName;
        }

        public final java.lang.String getCredentialToken() {
            return this.credentialToken;
        }

        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        public /* synthetic */ ChooseAccounts(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? "US" : str4, (i & 16) != 0 ? "HOSTED_URL" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getIntegrationType() {
            return this.integrationType;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String getBankLogoUrl() {
            return this.bankLogoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.aggregatorName;
            java.lang.String str2 = this.credentialToken;
            java.lang.String str3 = this.externalBankId;
            java.lang.String str4 = this.countryCode;
            java.lang.String str5 = this.integrationType;
            java.lang.String str6 = this.bankName;
            java.lang.String str7 = this.bankLogoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChooseAccounts(aggregatorName=");
            sb.append(str);
            sb.append(", credentialToken=");
            sb.append(str2);
            sb.append(", externalBankId=");
            sb.append(str3);
            sb.append(", countryCode=");
            sb.append(str4);
            sb.append(", integrationType=");
            sb.append(str5);
            sb.append(", bankName=");
            sb.append(str6);
            sb.append(", bankLogoUrl=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.aggregatorName.hashCode();
            int hashCode2 = this.credentialToken.hashCode();
            int hashCode3 = this.externalBankId.hashCode();
            int hashCode4 = this.countryCode.hashCode();
            int hashCode5 = this.integrationType.hashCode();
            java.lang.String str = this.bankName;
            int hashCode6 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.bankLogoUrl;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts chooseAccounts = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.aggregatorName, chooseAccounts.aggregatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialToken, chooseAccounts.credentialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, chooseAccounts.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, chooseAccounts.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.integrationType, chooseAccounts.integrationType) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, chooseAccounts.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoUrl, chooseAccounts.bankLogoUrl);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts copy(java.lang.String aggregatorName, java.lang.String credentialToken, java.lang.String externalBankId, java.lang.String countryCode, java.lang.String integrationType, java.lang.String bankName, java.lang.String bankLogoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatorName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts(aggregatorName, credentialToken, externalBankId, countryCode, integrationType, bankName, bankLogoUrl);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getBankLogoUrl() {
            return this.bankLogoUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getIntegrationType() {
            return this.integrationType;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCredentialToken() {
            return this.credentialToken;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAggregatorName() {
            return this.aggregatorName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts chooseAccounts, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = chooseAccounts.aggregatorName;
            }
            if ((i & 2) != 0) {
                str2 = chooseAccounts.credentialToken;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = chooseAccounts.externalBankId;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = chooseAccounts.countryCode;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = chooseAccounts.integrationType;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = chooseAccounts.bankName;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = chooseAccounts.bankLogoUrl;
            }
            return chooseAccounts.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SharedCardConsent;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "sharedCardInfo", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "component3", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SharedCardConsent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SharedCardConsent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "getAnalyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "getHeader", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "getSharedCardInfo", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class SharedCardConsent extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext;
        private final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header;
        private final com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent.Companion(null);
        public static final int $stable = com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.$stable | com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.$stable;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$SharedCardConsent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.INSTANCE.serializer();
                return serializer;
            }
        }), null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SharedCardConsent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SharedCardConsent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$SharedCardConsent$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SharedCardConsent(int i, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (5 != (i & 5)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 5, com.paypal.oslo.feature.wallet.wallet.ui.Destination$SharedCardConsent$$serializer.INSTANCE.getDescriptor());
            }
            this.analyticsContext = addFIAnalyticsContext;
            if ((i & 2) == 0) {
                this.header = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar("", (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else {
                this.header = header;
            }
            this.sharedCardInfo = sharedCardInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedCardConsent(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIAnalyticsContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedCardInfo, "");
            this.analyticsContext = addFIAnalyticsContext;
            this.header = header;
            this.sharedCardInfo = sharedCardInfo;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, self.analyticsContext);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.header, new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar("", (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.header);
            }
            output.encodeSerializableElement(serialDesc, 2, com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo$$serializer.INSTANCE, self.sharedCardInfo);
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getAnalyticsContext() {
            return this.analyticsContext;
        }

        public /* synthetic */ SharedCardConsent(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar topBar, com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(addFIAnalyticsContext, (i & 2) != 0 ? new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar("", (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : topBar, sharedCardInfo);
        }

        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header getHeader() {
            return this.header;
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo getSharedCardInfo() {
            return this.sharedCardInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext = this.analyticsContext;
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header = this.header;
            com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo = this.sharedCardInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SharedCardConsent(analyticsContext=");
            sb.append(addFIAnalyticsContext);
            sb.append(", header=");
            sb.append(header);
            sb.append(", sharedCardInfo=");
            sb.append(sharedCardInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.analyticsContext.hashCode() * 31) + this.header.hashCode()) * 31) + this.sharedCardInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent sharedCardConsent = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsContext, sharedCardConsent.analyticsContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.header, sharedCardConsent.header) && kotlin.jvm.internal.Intrinsics.areEqual(this.sharedCardInfo, sharedCardConsent.sharedCardInfo);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent copy(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedCardInfo, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent(analyticsContext, header, sharedCardInfo);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo getSharedCardInfo() {
            return this.sharedCardInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header getHeader() {
            return this.header;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getAnalyticsContext() {
            return this.analyticsContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent sharedCardConsent, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFIAnalyticsContext = sharedCardConsent.analyticsContext;
            }
            if ((i & 2) != 0) {
                header = sharedCardConsent.header;
            }
            if ((i & 4) != 0) {
                sharedCardInfo = sharedCardConsent.sharedCardInfo;
            }
            return sharedCardConsent.copy(addFIAnalyticsContext, header, sharedCardInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SelectCurrencyDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "currencySelectorConfig", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SelectCurrencyDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SelectCurrencyDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "getCurrencySelectorConfig", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class SelectCurrencyDestination extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SelectCurrencyDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$SelectCurrencyDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$SelectCurrencyDestination$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SelectCurrencyDestination(int i, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.wallet.ui.Destination$SelectCurrencyDestination$$serializer.INSTANCE.getDescriptor());
            }
            this.currencySelectorConfig = currencySelectorConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectCurrencyDestination(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySelectorConfig, "");
            this.currencySelectorConfig = currencySelectorConfig;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig getCurrencySelectorConfig() {
            return this.currencySelectorConfig;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig = this.currencySelectorConfig;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectCurrencyDestination(currencySelectorConfig=");
            sb.append(currencySelectorConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.currencySelectorConfig.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencySelectorConfig, ((com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination) other).currencySelectorConfig);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination copy(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySelectorConfig, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination(currencySelectorConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig getCurrencySelectorConfig() {
            return this.currencySelectorConfig;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination selectCurrencyDestination, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currencySelectorConfig = selectCurrencyDestination.currencySelectorConfig;
            }
            return selectCurrencyDestination.copy(currencySelectorConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ProvisionInstrumentsDestination;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "request", "", "requestId", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ProvisionInstrumentsDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ProvisionInstrumentsDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "getRequest", "Ljava/lang/String;", "getRequestId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ProvisionInstrumentsDestination extends com.paypal.oslo.feature.wallet.wallet.ui.Destination {
        private final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest request;
        private final java.lang.String requestId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.Destination$ProvisionInstrumentsDestination$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.INSTANCE.serializer();
                return serializer;
            }
        }), null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ProvisionInstrumentsDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$ProvisionInstrumentsDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination> serializer() {
                return com.paypal.oslo.feature.wallet.wallet.ui.Destination$ProvisionInstrumentsDestination$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ProvisionInstrumentsDestination(int i, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.wallet.ui.Destination$ProvisionInstrumentsDestination$$serializer.INSTANCE.getDescriptor());
            }
            this.request = partnerLinkingRequest;
            this.requestId = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProvisionInstrumentsDestination(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.request = partnerLinkingRequest;
            this.requestId = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.request);
            output.encodeStringElement(serialDesc, 1, self.requestId);
        }

        public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest getRequest() {
            return this.request;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest = this.request;
            java.lang.String str = this.requestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionInstrumentsDestination(request=");
            sb.append(partnerLinkingRequest);
            sb.append(", requestId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.request.hashCode() * 31) + this.requestId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination provisionInstrumentsDestination = (com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.request, provisionInstrumentsDestination.request) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, provisionInstrumentsDestination.requestId);
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination copy(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest request, java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination(request, requestId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest getRequest() {
            return this.request;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination copy$default(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination provisionInstrumentsDestination, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                partnerLinkingRequest = provisionInstrumentsDestination.request;
            }
            if ((i & 2) != 0) {
                str = provisionInstrumentsDestination.requestId;
            }
            return provisionInstrumentsDestination.copy(partnerLinkingRequest, str);
        }
    }

    public /* synthetic */ Destination(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
