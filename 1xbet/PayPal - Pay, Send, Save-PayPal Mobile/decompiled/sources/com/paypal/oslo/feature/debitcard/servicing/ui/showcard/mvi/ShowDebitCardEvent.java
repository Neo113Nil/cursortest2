package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadShowCardDetails", "ShowCardDetailsLoaded", "ShowCardDetailsLoadFailed", "ErrorStateCtaClicked", "CopyButtonClicked", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$CopyButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$ErrorStateCtaClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$LoadShowCardDetails;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$ShowCardDetailsLoadFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$ShowCardDetailsLoaded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ShowDebitCardEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ShowDebitCardEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$LoadShowCardDetails;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$LoadShowCardDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadShowCardDetails extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadShowCardDetails(java.lang.String str) {
            super("LoadShowCardDetails", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadShowCardDetails(cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails loadShowCardDetails, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loadShowCardDetails.cardId;
            }
            return loadShowCardDetails.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$ShowCardDetailsLoaded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;", "cardDetails", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$ShowCardDetailsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;", "getCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardDetailsLoaded extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails cardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCardDetailsLoaded(com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails debitCardDetails) {
            super("ShowCardDetailsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardDetails, "");
            this.cardDetails = debitCardDetails;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails getCardDetails() {
            return this.cardDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails debitCardDetails = this.cardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowCardDetailsLoaded(cardDetails=");
            sb.append(debitCardDetails);
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetails, ((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded) other).cardDetails);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded copy(com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails cardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded(cardDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails getCardDetails() {
            return this.cardDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded showCardDetailsLoaded, com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails debitCardDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardDetails = showCardDetailsLoaded.cardDetails;
            }
            return showCardDetailsLoaded.copy(debitCardDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$ShowCardDetailsLoadFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "", "errorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component3", "()I", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$ShowCardDetailsLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardDetailsLoadFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCardDetailsLoadFailed(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i) {
            super("ShowCardDetailsLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorCode = str;
            this.errorType = debitErrorType;
            this.retryCount = i;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowCardDetailsLoadFailed(errorCode=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorCode.hashCode() * 31) + this.errorType.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed showCardDetailsLoadFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, showCardDetailsLoadFailed.errorCode) && this.errorType == showCardDetailsLoadFailed.errorType && this.retryCount == showCardDetailsLoadFailed.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed copy(java.lang.String errorCode, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed(errorCode, errorType, retryCount);
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed showCardDetailsLoadFailed, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = showCardDetailsLoadFailed.errorCode;
            }
            if ((i2 & 2) != 0) {
                debitErrorType = showCardDetailsLoadFailed.errorType;
            }
            if ((i2 & 4) != 0) {
                i = showCardDetailsLoadFailed.retryCount;
            }
            return showCardDetailsLoadFailed.copy(str, debitErrorType, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$ErrorStateCtaClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorStateCtaClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ErrorStateCtaClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ErrorStateCtaClicked();

        public final int hashCode() {
            return -1661297089;
        }

        private ErrorStateCtaClicked() {
            super("ErrorStateCtaClicked", null);
        }

        public final java.lang.String toString() {
            return "ErrorStateCtaClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ErrorStateCtaClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent$CopyButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyButtonClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.CopyButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.CopyButtonClicked();

        public final int hashCode() {
            return 33541505;
        }

        private CopyButtonClicked() {
            super("CopyButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "CopyButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.CopyButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ShowDebitCardEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
