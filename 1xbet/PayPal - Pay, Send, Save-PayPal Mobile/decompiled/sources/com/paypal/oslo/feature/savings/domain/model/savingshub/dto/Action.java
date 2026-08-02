package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "", "Destination", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action$Destination;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action$Dismiss;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface Action {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action$Destination;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "", "request", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action$Destination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequest"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Destination implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action {
        public static final int $stable = 0;
        private final java.lang.String request;

        public Destination(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.request = str;
        }

        public final java.lang.String getRequest() {
            return this.request;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.request;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Destination(request=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.request.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.request, ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination) other).request);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination copy(java.lang.String request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination(request);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequest() {
            return this.request;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination destination, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = destination.request;
            }
            return destination.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action$Dismiss;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "", "dismissContext", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action$Dismiss;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDismissContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dismiss implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action {
        public static final int $stable = 0;
        private final java.lang.String dismissContext;

        public Dismiss(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.dismissContext = str;
        }

        public final java.lang.String getDismissContext() {
            return this.dismissContext;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.dismissContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dismiss(dismissContext=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.dismissContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss) && kotlin.jvm.internal.Intrinsics.areEqual(this.dismissContext, ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss) other).dismissContext);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss copy(java.lang.String dismissContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissContext, "");
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss(dismissContext);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDismissContext() {
            return this.dismissContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss dismiss, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dismiss.dismissContext;
            }
            return dismiss.copy(str);
        }
    }
}
