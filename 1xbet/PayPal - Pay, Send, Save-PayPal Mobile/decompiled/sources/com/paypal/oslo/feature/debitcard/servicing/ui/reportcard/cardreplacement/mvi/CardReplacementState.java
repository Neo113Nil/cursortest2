package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Processing", "Success", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Processing;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CardReplacementState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CardReplacementState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJj\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b/\u0010\u0011R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "", "displayAddress", "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "cardArtUrl", "cardLastFourDigits", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "ctaText", "", "primary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Initial;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDisplayAddress", "getDebitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "getCardArtUrl", "getCardLastFourDigits", "getTitle", "getDescription", "getCtaText", "Z", "getPrimary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState {
        public static final int $stable = 0;
        private final java.lang.String cardArtUrl;
        private final java.lang.String cardLastFourDigits;
        private final java.lang.String ctaText;
        private final java.lang.String debitInstrumentId;
        private final java.lang.String description;
        private final java.lang.String displayAddress;
        private final boolean primary;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z) {
            super("Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            this.displayAddress = str;
            this.debitInstrumentId = str2;
            this.productName = debitCardProductName;
            this.cardArtUrl = str3;
            this.cardLastFourDigits = str4;
            this.title = str5;
            this.description = str6;
            this.ctaText = str7;
            this.primary = z;
        }

        public /* synthetic */ Initial(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, debitCardProductName, str3, str4, str5, str6, str7, (i & 256) != 0 ? true : z);
        }

        public final java.lang.String getDisplayAddress() {
            return this.displayAddress;
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        public final java.lang.String getCardLastFourDigits() {
            return this.cardLastFourDigits;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String getCtaText() {
            return this.ctaText;
        }

        public final boolean getPrimary() {
            return this.primary;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.displayAddress;
            java.lang.String str2 = this.debitInstrumentId;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str3 = this.cardArtUrl;
            java.lang.String str4 = this.cardLastFourDigits;
            java.lang.String str5 = this.title;
            java.lang.String str6 = this.description;
            java.lang.String str7 = this.ctaText;
            boolean z = this.primary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(displayAddress=");
            sb.append(str);
            sb.append(", debitInstrumentId=");
            sb.append(str2);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(", cardArtUrl=");
            sb.append(str3);
            sb.append(", cardLastFourDigits=");
            sb.append(str4);
            sb.append(", title=");
            sb.append(str5);
            sb.append(", description=");
            sb.append(str6);
            sb.append(", ctaText=");
            sb.append(str7);
            sb.append(", primary=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((this.displayAddress.hashCode() * 31) + this.debitInstrumentId.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.cardArtUrl.hashCode()) * 31) + this.cardLastFourDigits.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial initial = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.displayAddress, initial.displayAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, initial.debitInstrumentId) && this.productName == initial.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtUrl, initial.cardArtUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardLastFourDigits, initial.cardLastFourDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, initial.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, initial.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaText, initial.ctaText) && this.primary == initial.primary;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial copy(java.lang.String displayAddress, java.lang.String debitInstrumentId, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardArtUrl, java.lang.String cardLastFourDigits, java.lang.String title, java.lang.String description, java.lang.String ctaText, boolean primary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardLastFourDigits, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctaText, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial(displayAddress, debitInstrumentId, productName, cardArtUrl, cardLastFourDigits, title, description, ctaText, primary);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCardLastFourDigits() {
            return this.cardLastFourDigits;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDisplayAddress() {
            return this.displayAddress;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Processing;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "", "cardArtUrl", "", "retryCount", "", "primary", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Ljava/lang/String;IZLcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Ljava/lang/String;IZLcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Processing;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCardArtUrl", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Z", "getPrimary", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState {
        public static final int $stable = 0;
        private final java.lang.String cardArtUrl;
        private final boolean primary;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(java.lang.String str, int i, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("Processing", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.cardArtUrl = str;
            this.retryCount = i;
            this.primary = z;
            this.productName = debitCardProductName;
        }

        public /* synthetic */ Processing(java.lang.String str, int i, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i, z, debitCardProductName);
        }

        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final boolean getPrimary() {
            return this.primary;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardArtUrl;
            int i = this.retryCount;
            boolean z = this.primary;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing(cardArtUrl=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", primary=");
            sb.append(z);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.cardArtUrl.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount)) * 31) + java.lang.Boolean.hashCode(this.primary)) * 31) + this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing processing = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtUrl, processing.cardArtUrl) && this.retryCount == processing.retryCount && this.primary == processing.primary && this.productName == processing.productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing copy(java.lang.String cardArtUrl, int retryCount, boolean primary, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing(cardArtUrl, retryCount, primary, productName);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing processing, java.lang.String str, int i, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = processing.cardArtUrl;
            }
            if ((i2 & 2) != 0) {
                i = processing.retryCount;
            }
            if ((i2 & 4) != 0) {
                z = processing.primary;
            }
            if ((i2 & 8) != 0) {
                debitCardProductName = processing.productName;
            }
            return processing.copy(str, i, z, debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "cardArtUrl", "", "primary", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "getCardArtUrl", "Z", "getPrimary", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState {
        public static final int $stable = 0;
        private final java.lang.String cardArtUrl;
        private final java.lang.String description;
        private final boolean primary;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.title = str;
            this.description = str2;
            this.cardArtUrl = str3;
            this.primary = z;
            this.productName = debitCardProductName;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        public final boolean getPrimary() {
            return this.primary;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.description;
            java.lang.String str3 = this.cardArtUrl;
            boolean z = this.primary;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(title=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(", cardArtUrl=");
            sb.append(str3);
            sb.append(", primary=");
            sb.append(z);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode();
            java.lang.String str = this.description;
            return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.cardArtUrl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary)) * 31) + this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, success.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, success.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtUrl, success.cardArtUrl) && this.primary == success.primary && this.productName == success.productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success copy(java.lang.String title, java.lang.String description, java.lang.String cardArtUrl, boolean primary, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success(title, description, cardArtUrl, primary, productName);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success success, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.title;
            }
            if ((i & 2) != 0) {
                str2 = success.description;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = success.cardArtUrl;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                z = success.primary;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                debitCardProductName = success.productName;
            }
            return success.copy(str, str4, str5, z2, debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b(\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorCode", "", "retryCount", "cardArtUrl", "", "primary", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;ILjava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "component5", "()Z", "component6", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;ILjava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorCode", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "getCardArtUrl", "Z", "getPrimary", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState {
        public static final int $stable = 0;
        private final java.lang.String cardArtUrl;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final boolean primary;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.String str2, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.errorType = debitErrorType;
            this.errorCode = str;
            this.retryCount = i;
            this.cardArtUrl = str2;
            this.primary = z;
            this.productName = debitCardProductName;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.String str2, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2, z, debitCardProductName);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        public final boolean getPrimary() {
            return this.primary;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorCode;
            int i = this.retryCount;
            java.lang.String str2 = this.cardArtUrl;
            boolean z = this.primary;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorCode=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", cardArtUrl=");
            sb.append(str2);
            sb.append(", primary=");
            sb.append(z);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.errorType.hashCode() * 31) + this.errorCode.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount)) * 31) + this.cardArtUrl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary)) * 31) + this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error) other;
            return this.errorType == error.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && this.retryCount == error.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtUrl, error.cardArtUrl) && this.primary == error.primary && this.productName == error.productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorCode, int retryCount, java.lang.String cardArtUrl, boolean primary, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error(errorType, errorCode, retryCount, cardArtUrl, primary, productName);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error error, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.String str2, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                debitErrorType = error.errorType;
            }
            if ((i2 & 2) != 0) {
                str = error.errorCode;
            }
            java.lang.String str3 = str;
            if ((i2 & 4) != 0) {
                i = error.retryCount;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                str2 = error.cardArtUrl;
            }
            java.lang.String str4 = str2;
            if ((i2 & 16) != 0) {
                z = error.primary;
            }
            boolean z2 = z;
            if ((i2 & 32) != 0) {
                debitCardProductName = error.productName;
            }
            return error.copy(debitErrorType, str3, i3, str4, z2, debitCardProductName);
        }
    }

    public /* synthetic */ CardReplacementState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
