package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000f\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnClose", "OnDismiss", "OnLoadData", "OnDataLoaded", "OnLoadFiError", "OnAddFiClicked", "OnFiSelected", "OnConfirmClicked", "OnUpdateFiSuccess", "OnUpdateFiError", "OnAgreementLinkClicked", "ShowUpdatePaymentSuccess", "OnReset", "OnRefreshWithNewFi", "OnMissingFundingInstrument", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnAddFiClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnAgreementLinkClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnClose;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnConfirmClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnDismiss;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnFiSelected;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnLoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnLoadFiError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnMissingFundingInstrument;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnRefreshWithNewFi;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnReset;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnUpdateFiError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnUpdateFiSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$ShowUpdatePaymentSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ChangeFiEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnClose;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "newFiAdded", "paymentUpdated", "<init>", "(Ljava/lang/Boolean;Z)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Z", "copy", "(Ljava/lang/Boolean;Z)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnClose;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getNewFiAdded", "Z", "getPaymentUpdated"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnClose extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 0;
        private final java.lang.Boolean newFiAdded;
        private final boolean paymentUpdated;

        public OnClose(java.lang.Boolean bool, boolean z) {
            super("OnClose", null);
            this.newFiAdded = bool;
            this.paymentUpdated = z;
        }

        public /* synthetic */ OnClose(java.lang.Boolean bool, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? java.lang.Boolean.FALSE : bool, (i & 2) != 0 ? false : z);
        }

        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public final boolean getPaymentUpdated() {
            return this.paymentUpdated;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.newFiAdded;
            boolean z = this.paymentUpdated;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnClose(newFiAdded=");
            sb.append(bool);
            sb.append(", paymentUpdated=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.newFiAdded;
            return ((bool == null ? 0 : bool.hashCode()) * 31) + java.lang.Boolean.hashCode(this.paymentUpdated);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose onClose = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.newFiAdded, onClose.newFiAdded) && this.paymentUpdated == onClose.paymentUpdated;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose copy(java.lang.Boolean newFiAdded, boolean paymentUpdated) {
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose(newFiAdded, paymentUpdated);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPaymentUpdated() {
            return this.paymentUpdated;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose onClose, java.lang.Boolean bool, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = onClose.newFiAdded;
            }
            if ((i & 2) != 0) {
                z = onClose.paymentUpdated;
            }
            return onClose.copy(bool, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnClose() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    private ChangeFiEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnDismiss;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "newFiAdded", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnDismiss;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getNewFiAdded"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismiss extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 0;
        private final java.lang.Boolean newFiAdded;

        public OnDismiss(java.lang.Boolean bool) {
            super("OnDismiss", null);
            this.newFiAdded = bool;
        }

        public /* synthetic */ OnDismiss(java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? java.lang.Boolean.FALSE : bool);
        }

        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.newFiAdded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDismiss(newFiAdded=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.newFiAdded;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss) && kotlin.jvm.internal.Intrinsics.areEqual(this.newFiAdded, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss) other).newFiAdded);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss copy(java.lang.Boolean newFiAdded) {
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss(newFiAdded);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss onDismiss, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = onDismiss.newFiAdded;
            }
            return onDismiss.copy(bool);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnDismiss() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnLoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnLoadData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCpi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadData extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi;
        private final java.lang.String creditAccountId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadData(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
            super("OnLoadData", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.creditAccountId = str;
            this.cpi = creditProductIdentifier;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.cpi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadData(creditAccountId=");
            sb.append(str);
            sb.append(", cpi=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.creditAccountId.hashCode() * 31) + this.cpi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData onLoadData = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onLoadData.creditAccountId) && this.cpi == onLoadData.cpi;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData(creditAccountId, cpi);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData onLoadData, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoadData.creditAccountId;
            }
            if ((i & 2) != 0) {
                creditProductIdentifier = onLoadData.cpi;
            }
            return onLoadData.copy(str, creditProductIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnDataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoaded extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataLoaded(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel) {
            super("OnDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiHalfSheetUiModel, "");
            this.uiModel = changeFiHalfSheetUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataLoaded(uiModel=");
            sb.append(changeFiHalfSheetUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded onDataLoaded, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                changeFiHalfSheetUiModel = onDataLoaded.uiModel;
            }
            return onDataLoaded.copy(changeFiHalfSheetUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnLoadFiError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "correlationId", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnLoadFiError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadFiError extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 0;
        private final java.lang.String correlationId;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadFiError(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
            super("OnLoadFiError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.correlationId = str;
            this.creditAccountId = str2;
            this.creditProductIdentifier = creditProductIdentifier;
        }

        public /* synthetic */ OnLoadFiError(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, creditProductIdentifier);
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.String str2 = this.creditAccountId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadFiError(correlationId=");
            sb.append(str);
            sb.append(", creditAccountId=");
            sb.append(str2);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.creditAccountId.hashCode()) * 31) + this.creditProductIdentifier.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError onLoadFiError = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, onLoadFiError.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onLoadFiError.creditAccountId) && this.creditProductIdentifier == onLoadFiError.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError copy(java.lang.String correlationId, java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError(correlationId, creditAccountId, creditProductIdentifier);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError onLoadFiError, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoadFiError.correlationId;
            }
            if ((i & 2) != 0) {
                str2 = onLoadFiError.creditAccountId;
            }
            if ((i & 4) != 0) {
                creditProductIdentifier = onLoadFiError.creditProductIdentifier;
            }
            return onLoadFiError.copy(str, str2, creditProductIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnAddFiClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "type", "", "newFiAdded", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnAddFiClicked;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "getType", "Ljava/lang/Boolean;", "getNewFiAdded"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddFiClicked extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 0;
        private final java.lang.Boolean newFiAdded;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAddFiClicked(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType, java.lang.Boolean bool) {
            super("OnAddFiClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentType, "");
            this.type = addFundingInstrumentType;
            this.newFiAdded = bool;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType getType() {
            return this.type;
        }

        public /* synthetic */ OnAddFiClicked(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(addFundingInstrumentType, (i & 2) != 0 ? java.lang.Boolean.FALSE : bool);
        }

        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType = this.type;
            java.lang.Boolean bool = this.newFiAdded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAddFiClicked(type=");
            sb.append(addFundingInstrumentType);
            sb.append(", newFiAdded=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            java.lang.Boolean bool = this.newFiAdded;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked onAddFiClicked = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked) other;
            return this.type == onAddFiClicked.type && kotlin.jvm.internal.Intrinsics.areEqual(this.newFiAdded, onAddFiClicked.newFiAdded);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked copy(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType type, java.lang.Boolean newFiAdded) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked(type, newFiAdded);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked onAddFiClicked, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFundingInstrumentType = onAddFiClicked.type;
            }
            if ((i & 2) != 0) {
                bool = onAddFiClicked.newFiAdded;
            }
            return onAddFiClicked.copy(addFundingInstrumentType, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnFiSelected;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "newFiAdded", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstrument", "<init>", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "copy", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnFiSelected;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getNewFiAdded", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "getFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFiSelected extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;
        private final java.lang.Boolean newFiAdded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFiSelected(java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
            super("OnFiSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            this.newFiAdded = bool;
            this.fundingInstrument = fundingInstrument;
        }

        public /* synthetic */ OnFiSelected(java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? java.lang.Boolean.FALSE : bool, fundingInstrument);
        }

        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.newFiAdded;
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFiSelected(newFiAdded=");
            sb.append(bool);
            sb.append(", fundingInstrument=");
            sb.append(fundingInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.newFiAdded;
            return ((bool == null ? 0 : bool.hashCode()) * 31) + this.fundingInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected onFiSelected = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.newFiAdded, onFiSelected.newFiAdded) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, onFiSelected.fundingInstrument);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected copy(java.lang.Boolean newFiAdded, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected(newFiAdded, fundingInstrument);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected onFiSelected, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = onFiSelected.newFiAdded;
            }
            if ((i & 2) != 0) {
                fundingInstrument = onFiSelected.fundingInstrument;
            }
            return onFiSelected.copy(bool, fundingInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnConfirmClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstrument", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnConfirmClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "getFundingInstrument", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConfirmClicked extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnConfirmClicked(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType) {
            super("OnConfirmClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiFlowType, "");
            this.creditAccountId = str;
            this.cpi = creditProductIdentifier;
            this.fundingInstrument = fundingInstrument;
            this.flowType = changeFiFlowType;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType getFlowType() {
            return this.flowType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.cpi;
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType = this.flowType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnConfirmClicked(creditAccountId=");
            sb.append(str);
            sb.append(", cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", fundingInstrument=");
            sb.append(fundingInstrument);
            sb.append(", flowType=");
            sb.append(changeFiFlowType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.creditAccountId.hashCode() * 31) + this.cpi.hashCode()) * 31) + this.fundingInstrument.hashCode()) * 31) + this.flowType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked onConfirmClicked = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onConfirmClicked.creditAccountId) && this.cpi == onConfirmClicked.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, onConfirmClicked.fundingInstrument) && this.flowType == onConfirmClicked.flowType;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked(creditAccountId, cpi, fundingInstrument, flowType);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked onConfirmClicked, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onConfirmClicked.creditAccountId;
            }
            if ((i & 2) != 0) {
                creditProductIdentifier = onConfirmClicked.cpi;
            }
            if ((i & 4) != 0) {
                fundingInstrument = onConfirmClicked.fundingInstrument;
            }
            if ((i & 8) != 0) {
                changeFiFlowType = onConfirmClicked.flowType;
            }
            return onConfirmClicked.copy(str, creditProductIdentifier, fundingInstrument, changeFiFlowType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnUpdateFiSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "fundingInstrument", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnUpdateFiSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "getFundingInstrument", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateFiSuccess extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpdateFiSuccess(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType) {
            super("OnUpdateFiSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiFlowType, "");
            this.fundingInstrument = fundingInstrumentUiModel;
            this.flowType = changeFiFlowType;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType getFlowType() {
            return this.flowType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel = this.fundingInstrument;
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType = this.flowType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUpdateFiSuccess(fundingInstrument=");
            sb.append(fundingInstrumentUiModel);
            sb.append(", flowType=");
            sb.append(changeFiFlowType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fundingInstrument.hashCode() * 31) + this.flowType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess onUpdateFiSuccess = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, onUpdateFiSuccess.fundingInstrument) && this.flowType == onUpdateFiSuccess.flowType;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrument, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess(fundingInstrument, flowType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess onUpdateFiSuccess, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentUiModel = onUpdateFiSuccess.fundingInstrument;
            }
            if ((i & 2) != 0) {
                changeFiFlowType = onUpdateFiSuccess.flowType;
            }
            return onUpdateFiSuccess.copy(fundingInstrumentUiModel, changeFiFlowType);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnUpdateFiError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "correlationId", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstrument", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnUpdateFiError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "getFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateFiError extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpdateFiError(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
            super("OnUpdateFiError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            this.correlationId = str;
            this.creditAccountId = str2;
            this.creditProductIdentifier = creditProductIdentifier;
            this.fundingInstrument = fundingInstrument;
        }

        public /* synthetic */ OnUpdateFiError(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, creditProductIdentifier, fundingInstrument);
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.String str2 = this.creditAccountId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUpdateFiError(correlationId=");
            sb.append(str);
            sb.append(", creditAccountId=");
            sb.append(str2);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", fundingInstrument=");
            sb.append(fundingInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.creditAccountId.hashCode()) * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.fundingInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError onUpdateFiError = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, onUpdateFiError.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onUpdateFiError.creditAccountId) && this.creditProductIdentifier == onUpdateFiError.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, onUpdateFiError.fundingInstrument);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError copy(java.lang.String correlationId, java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError(correlationId, creditAccountId, creditProductIdentifier, fundingInstrument);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError onUpdateFiError, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onUpdateFiError.correlationId;
            }
            if ((i & 2) != 0) {
                str2 = onUpdateFiError.creditAccountId;
            }
            if ((i & 4) != 0) {
                creditProductIdentifier = onUpdateFiError.creditProductIdentifier;
            }
            if ((i & 8) != 0) {
                fundingInstrument = onUpdateFiError.fundingInstrument;
            }
            return onUpdateFiError.copy(str, str2, creditProductIdentifier, fundingInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnAgreementLinkClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnAgreementLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAgreementLinkClicked extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAgreementLinkClicked(java.lang.String str) {
            super("OnAgreementLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAgreementLinkClicked(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAgreementLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAgreementLinkClicked) other).url);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAgreementLinkClicked copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAgreementLinkClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAgreementLinkClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAgreementLinkClicked onAgreementLinkClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAgreementLinkClicked.url;
            }
            return onAgreementLinkClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$ShowUpdatePaymentSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$ShowUpdatePaymentSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowUpdatePaymentSuccess extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUpdatePaymentSuccess(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel) {
            super("ShowUpdatePaymentSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentSuccessUiModel, "");
            this.uiModel = updatePaymentSuccessUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowUpdatePaymentSuccess(uiModel=");
            sb.append(updatePaymentSuccessUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess showUpdatePaymentSuccess, com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updatePaymentSuccessUiModel = showUpdatePaymentSuccess.uiModel;
            }
            return showUpdatePaymentSuccess.copy(updatePaymentSuccessUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnReset;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReset extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnReset INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnReset();

        public final int hashCode() {
            return 2126510419;
        }

        private OnReset() {
            super("OnReset", null);
        }

        public final java.lang.String toString() {
            return "OnReset";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnReset)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnRefreshWithNewFi;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "", "newFiIds", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnRefreshWithNewFi;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCpi", "Ljava/util/List;", "getNewFiIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRefreshWithNewFi extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi;
        private final java.lang.String creditAccountId;
        private final java.util.List<java.lang.String> newFiIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRefreshWithNewFi(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.util.List<java.lang.String> list) {
            super("OnRefreshWithNewFi", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.creditAccountId = str;
            this.cpi = creditProductIdentifier;
            this.newFiIds = list;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final java.util.List<java.lang.String> getNewFiIds() {
            return this.newFiIds;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.cpi;
            java.util.List<java.lang.String> list = this.newFiIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRefreshWithNewFi(creditAccountId=");
            sb.append(str);
            sb.append(", cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", newFiIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.creditAccountId.hashCode() * 31) + this.cpi.hashCode()) * 31) + this.newFiIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi onRefreshWithNewFi = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onRefreshWithNewFi.creditAccountId) && this.cpi == onRefreshWithNewFi.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.newFiIds, onRefreshWithNewFi.newFiIds);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi, java.util.List<java.lang.String> newFiIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newFiIds, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi(creditAccountId, cpi, newFiIds);
        }

        public final java.util.List<java.lang.String> component3() {
            return this.newFiIds;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi onRefreshWithNewFi, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onRefreshWithNewFi.creditAccountId;
            }
            if ((i & 2) != 0) {
                creditProductIdentifier = onRefreshWithNewFi.cpi;
            }
            if ((i & 4) != 0) {
                list = onRefreshWithNewFi.newFiIds;
            }
            return onRefreshWithNewFi.copy(str, creditProductIdentifier, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent$OnMissingFundingInstrument;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMissingFundingInstrument extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnMissingFundingInstrument INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnMissingFundingInstrument();

        public final int hashCode() {
            return 1980309370;
        }

        private OnMissingFundingInstrument() {
            super("OnMissingFundingInstrument", null);
        }

        public final java.lang.String toString() {
            return "OnMissingFundingInstrument";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnMissingFundingInstrument)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ChangeFiEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
