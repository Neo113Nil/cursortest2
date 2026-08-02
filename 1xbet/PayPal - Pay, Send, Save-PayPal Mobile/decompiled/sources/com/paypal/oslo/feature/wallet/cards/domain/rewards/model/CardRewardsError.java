package com.paypal.oslo.feature.wallet.cards.domain.rewards.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError;", "", "<init>", "()V", "Network", com.google.common.net.HttpHeaders.SERVER, "DataNotFound", "InvalidCardId", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$DataNotFound;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$InvalidCardId;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$Network;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$Server;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardRewardsError {
    public static final int $stable = 0;

    private CardRewardsError() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$Network;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Network extends com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Network INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Network();

        private Network() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$Server;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError;", "Larrow/core/NonEmptyList;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "", "message", "<init>", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-1X0FA-Y", "()Ljava/util/List;", "component1", "component2", "()Ljava/lang/String;", "copy-ZALtuoE", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$Server;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getErrors-1X0FA-Y", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Server extends com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> errors;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Server(java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> list, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errors = list;
            this.message = str;
        }

        /* renamed from: getErrors-1X0FA-Y, reason: not valid java name */
        public final java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m20998getErrors1X0FAY() {
            return this.errors;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String m9607toStringimpl = arrow.core.NonEmptyList.m9607toStringimpl(this.errors);
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Server(errors=");
            sb.append(m9607toStringimpl);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (arrow.core.NonEmptyList.m9586hashCodeimpl(this.errors) * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Server)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Server server = (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Server) other;
            return arrow.core.NonEmptyList.m9576equalsimpl0(this.errors, server.errors) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, server.message);
        }

        /* renamed from: copy-ZALtuoE, reason: not valid java name */
        public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Server m20997copyZALtuoE(java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> errors, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Server(errors, message, null);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1-1X0FA-Y, reason: not valid java name */
        public final java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m20996component11X0FAY() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-ZALtuoE$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Server m20995copyZALtuoE$default(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Server server, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = server.errors;
            }
            if ((i & 2) != 0) {
                str = server.message;
            }
            return server.m20997copyZALtuoE(list, str);
        }

        public /* synthetic */ Server(java.util.List list, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$DataNotFound;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DataNotFound extends com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.DataNotFound INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.DataNotFound();

        private DataNotFound() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError$InvalidCardId;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvalidCardId extends com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.InvalidCardId INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.InvalidCardId();

        private InvalidCardId() {
            super(null);
        }
    }

    public /* synthetic */ CardRewardsError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
