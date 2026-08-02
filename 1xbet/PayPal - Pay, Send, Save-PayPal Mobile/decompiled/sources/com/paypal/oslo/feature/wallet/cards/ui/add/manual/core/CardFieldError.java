package com.paypal.oslo.feature.wallet.cards.ui.add.manual.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/CardFieldError;", "", "<init>", "()V", "ResourceError", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/CardFieldError$None;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/CardFieldError$ResourceError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardFieldError {
    public static final int $stable = 0;

    private CardFieldError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/CardFieldError$ResourceError;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/CardFieldError;", "", "resourceId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/CardFieldError$ResourceError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getResourceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResourceError extends com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError {
        public static final int $stable = 0;
        private final int resourceId;

        public ResourceError(int i) {
            super(null);
            this.resourceId = i;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        public final java.lang.String toString() {
            int i = this.resourceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceError(resourceId=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.resourceId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError.ResourceError) && this.resourceId == ((com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError.ResourceError) other).resourceId;
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError.ResourceError copy(int resourceId) {
            return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError.ResourceError(resourceId);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError.ResourceError copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError.ResourceError resourceError, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = resourceError.resourceId;
            }
            return resourceError.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/CardFieldError$None;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/CardFieldError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class None extends com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError.None INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardFieldError.None();

        private None() {
            super(null);
        }
    }

    public /* synthetic */ CardFieldError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
