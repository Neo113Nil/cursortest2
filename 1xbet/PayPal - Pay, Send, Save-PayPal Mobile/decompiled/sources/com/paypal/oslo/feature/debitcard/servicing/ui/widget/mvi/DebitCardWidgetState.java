package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Idle", "Loading", "Success", "EmptyState", "Error", "Hidden", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$EmptyState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Hidden;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Idle;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardWidgetState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardWidgetState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Idle;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle();

        public final int hashCode() {
            return 1502455572;
        }

        private Idle() {
            super("Idle", null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading();

        public final int hashCode() {
            return 472134140;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0096\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b4\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b=\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bB\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bC\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\bD\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\bE\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\bF\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\bG\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "displayState", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "lifecycleState", "", "lastFourDigits", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetUiModel;", "uiModel", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinStatus;", "pinStatus", "billingAddressId", "displayAddress", "smallCardArtUrl", "largeCardArtUrl", "displayProductName", "estimatedArrivalDate", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetUiModel;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component5", "component6", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetUiModel;", "component7", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinStatus;", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetUiModel;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "getDisplayState", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "getLifecycleState", "Ljava/lang/String;", "getLastFourDigits", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "getDebitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinStatus;", "getPinStatus", "getBillingAddressId", "getDisplayAddress", "getSmallCardArtUrl", "getLargeCardArtUrl", "getDisplayProductName", "getEstimatedArrivalDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState {
        public static final int $stable = 0;
        private final java.lang.String billingAddressId;
        private final java.lang.String debitInstrumentId;
        private final java.lang.String displayAddress;
        private final java.lang.String displayProductName;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState;
        private final java.lang.String estimatedArrivalDate;
        private final java.lang.String largeCardArtUrl;
        private final java.lang.String lastFourDigits;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final java.lang.String smallCardArtUrl;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel debitCardWidgetUiModel, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus debitInstrumentPinStatus, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentDisplayState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentLifecycleState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            this.displayState = debitInstrumentDisplayState;
            this.lifecycleState = debitInstrumentLifecycleState;
            this.lastFourDigits = str;
            this.productName = debitCardProductName;
            this.debitInstrumentId = str2;
            this.uiModel = debitCardWidgetUiModel;
            this.pinStatus = debitInstrumentPinStatus;
            this.billingAddressId = str3;
            this.displayAddress = str4;
            this.smallCardArtUrl = str5;
            this.largeCardArtUrl = str6;
            this.displayProductName = str7;
            this.estimatedArrivalDate = str8;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel debitCardWidgetUiModel, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus debitInstrumentPinStatus, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitInstrumentDisplayState, debitInstrumentLifecycleState, str, debitCardProductName, str2, debitCardWidgetUiModel, debitInstrumentPinStatus, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? null : str8);
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState getDisplayState() {
            return this.displayState;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getLifecycleState() {
            return this.lifecycleState;
        }

        public final java.lang.String getLastFourDigits() {
            return this.lastFourDigits;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus getPinStatus() {
            return this.pinStatus;
        }

        public final java.lang.String getBillingAddressId() {
            return this.billingAddressId;
        }

        public final java.lang.String getDisplayAddress() {
            return this.displayAddress;
        }

        public final java.lang.String getSmallCardArtUrl() {
            return this.smallCardArtUrl;
        }

        public final java.lang.String getLargeCardArtUrl() {
            return this.largeCardArtUrl;
        }

        public final java.lang.String getDisplayProductName() {
            return this.displayProductName;
        }

        public final java.lang.String getEstimatedArrivalDate() {
            return this.estimatedArrivalDate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState = this.displayState;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
            java.lang.String str = this.lastFourDigits;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str2 = this.debitInstrumentId;
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel debitCardWidgetUiModel = this.uiModel;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus debitInstrumentPinStatus = this.pinStatus;
            java.lang.String str3 = this.billingAddressId;
            java.lang.String str4 = this.displayAddress;
            java.lang.String str5 = this.smallCardArtUrl;
            java.lang.String str6 = this.largeCardArtUrl;
            java.lang.String str7 = this.displayProductName;
            java.lang.String str8 = this.estimatedArrivalDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(displayState=");
            sb.append(debitInstrumentDisplayState);
            sb.append(", lifecycleState=");
            sb.append(debitInstrumentLifecycleState);
            sb.append(", lastFourDigits=");
            sb.append(str);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(", debitInstrumentId=");
            sb.append(str2);
            sb.append(", uiModel=");
            sb.append(debitCardWidgetUiModel);
            sb.append(", pinStatus=");
            sb.append(debitInstrumentPinStatus);
            sb.append(", billingAddressId=");
            sb.append(str3);
            sb.append(", displayAddress=");
            sb.append(str4);
            sb.append(", smallCardArtUrl=");
            sb.append(str5);
            sb.append(", largeCardArtUrl=");
            sb.append(str6);
            sb.append(", displayProductName=");
            sb.append(str7);
            sb.append(", estimatedArrivalDate=");
            sb.append(str8);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.displayState.hashCode();
            int hashCode2 = this.lifecycleState.hashCode();
            int hashCode3 = this.lastFourDigits.hashCode();
            int hashCode4 = this.productName.hashCode();
            int hashCode5 = this.debitInstrumentId.hashCode();
            int hashCode6 = this.uiModel.hashCode();
            int hashCode7 = this.pinStatus.hashCode();
            java.lang.String str = this.billingAddressId;
            int hashCode8 = str == null ? 0 : str.hashCode();
            int hashCode9 = this.displayAddress.hashCode();
            int hashCode10 = this.smallCardArtUrl.hashCode();
            int hashCode11 = this.largeCardArtUrl.hashCode();
            int hashCode12 = this.displayProductName.hashCode();
            java.lang.String str2 = this.estimatedArrivalDate;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success) other;
            return this.displayState == success.displayState && this.lifecycleState == success.lifecycleState && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourDigits, success.lastFourDigits) && this.productName == success.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, success.debitInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, success.uiModel) && this.pinStatus == success.pinStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddressId, success.billingAddressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayAddress, success.displayAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.smallCardArtUrl, success.smallCardArtUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.largeCardArtUrl, success.largeCardArtUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayProductName, success.displayProductName) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedArrivalDate, success.estimatedArrivalDate);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState, java.lang.String lastFourDigits, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String debitInstrumentId, com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel uiModel, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus, java.lang.String billingAddressId, java.lang.String displayAddress, java.lang.String smallCardArtUrl, java.lang.String largeCardArtUrl, java.lang.String displayProductName, java.lang.String estimatedArrivalDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastFourDigits, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pinStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smallCardArtUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeCardArtUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayProductName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState, lifecycleState, lastFourDigits, productName, debitInstrumentId, uiModel, pinStatus, billingAddressId, displayAddress, smallCardArtUrl, largeCardArtUrl, displayProductName, estimatedArrivalDate);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getDisplayAddress() {
            return this.displayAddress;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getBillingAddressId() {
            return this.billingAddressId;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus getPinStatus() {
            return this.pinStatus;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastFourDigits() {
            return this.lastFourDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getLifecycleState() {
            return this.lifecycleState;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getEstimatedArrivalDate() {
            return this.estimatedArrivalDate;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getDisplayProductName() {
            return this.displayProductName;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getLargeCardArtUrl() {
            return this.largeCardArtUrl;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getSmallCardArtUrl() {
            return this.smallCardArtUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState getDisplayState() {
            return this.displayState;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$EmptyState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$EmptyState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyState extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyState(com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel debitCardWidgetEmptyStateUiModel) {
            super("EmptyState", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetEmptyStateUiModel, "");
            this.uiModel = debitCardWidgetEmptyStateUiModel;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel debitCardWidgetEmptyStateUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmptyState(uiModel=");
            sb.append(debitCardWidgetEmptyStateUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState) other).uiModel);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState copy(com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState emptyState, com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel debitCardWidgetEmptyStateUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardWidgetEmptyStateUiModel = emptyState.uiModel;
            }
            return emptyState.copy(debitCardWidgetEmptyStateUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error();

        public final int hashCode() {
            return -671788344;
        }

        private Error() {
            super("Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Hidden;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hidden extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden();

        public final int hashCode() {
            return 726545642;
        }

        private Hidden() {
            super("Hidden", null);
        }

        public final java.lang.String toString() {
            return "Hidden";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitCardWidgetState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
