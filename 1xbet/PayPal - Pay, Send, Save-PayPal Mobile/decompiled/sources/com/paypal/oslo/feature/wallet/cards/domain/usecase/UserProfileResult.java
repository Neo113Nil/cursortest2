package com.paypal.oslo.feature.wallet.cards.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UserProfileResult;", "", "<init>", "()V", "Error", "Success", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UserProfileResult$Error;", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UserProfileResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class UserProfileResult {
    public static final int $stable = 0;

    private UserProfileResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UserProfileResult$Error;", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UserProfileResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Error INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Error();

        public final int hashCode() {
            return 530258243;
        }

        private Error() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UserProfileResult$Success;", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UserProfileResult;", "Lcom/paypal/oslo/core/userstore/model/User;", "user", "<init>", "(Lcom/paypal/oslo/core/userstore/model/User;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/User;", "copy", "(Lcom/paypal/oslo/core/userstore/model/User;)Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UserProfileResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/model/User;", "getUser"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.userstore.model.User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.core.userstore.model.User user) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
            this.user = user;
        }

        public final com.paypal.oslo.core.userstore.model.User getUser() {
            return this.user;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.model.User user = this.user;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(user=");
            sb.append(user);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.user.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.user, ((com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success) other).user);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success copy(com.paypal.oslo.core.userstore.model.User user) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
            return new com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success(user);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.model.User getUser() {
            return this.user;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success copy$default(com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success success, com.paypal.oslo.core.userstore.model.User user, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                user = success.user;
            }
            return success.copy(user);
        }
    }

    public /* synthetic */ UserProfileResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
