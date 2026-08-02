package com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;", "", "<init>", "()V", "Network", "DataNotFound", "InvalidInput", "ServerError", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$DataNotFound;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$InvalidInput;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$Network;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$ServerError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardDefinitionsError {
    public static final int $stable = 0;

    private CardDefinitionsError() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$Network;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Network extends com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.Network INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.Network();

        private Network() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$DataNotFound;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DataNotFound extends com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.DataNotFound INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.DataNotFound();

        private DataNotFound() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$InvalidInput;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvalidInput extends com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.InvalidInput INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.InvalidInput();

        private InvalidInput() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$ServerError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;", "Larrow/core/NonEmptyList;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError;", "details", "<init>", "(Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-1X0FA-Y", "()Ljava/util/List;", "component1", "copy-GZgkXh4", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError$ServerError;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDetails-1X0FA-Y"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError extends com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError> details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private ServerError(java.util.List<? extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.details = list;
        }

        /* renamed from: getDetails-1X0FA-Y, reason: not valid java name */
        public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError> m20985getDetails1X0FAY() {
            return this.details;
        }

        public final java.lang.String toString() {
            java.lang.String m9607toStringimpl = arrow.core.NonEmptyList.m9607toStringimpl(this.details);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(details=");
            sb.append(m9607toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return arrow.core.NonEmptyList.m9586hashCodeimpl(this.details);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.ServerError) && arrow.core.NonEmptyList.m9576equalsimpl0(this.details, ((com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.ServerError) other).details);
        }

        /* renamed from: copy-GZgkXh4, reason: not valid java name */
        public final com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.ServerError m20984copyGZgkXh4(java.util.List<? extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError> details) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
            return new com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.ServerError(details, null);
        }

        /* renamed from: component1-1X0FA-Y, reason: not valid java name */
        public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError> m20983component11X0FAY() {
            return this.details;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-GZgkXh4$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.ServerError m20982copyGZgkXh4$default(com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.ServerError serverError, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = serverError.details;
            }
            return serverError.m20984copyGZgkXh4(list);
        }

        public /* synthetic */ ServerError(java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list);
        }
    }

    public /* synthetic */ CardDefinitionsError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
