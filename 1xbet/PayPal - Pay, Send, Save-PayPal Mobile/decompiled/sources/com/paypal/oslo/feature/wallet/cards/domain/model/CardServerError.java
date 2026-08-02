package com.paypal.oslo.feature.wallet.cards.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError;", "", "<init>", "()V", "InvalidRequest", "UnprocessableEntity", "UnknownCode", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnknownCode;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardServerError {
    public static final int $stable = 0;

    private CardServerError() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError;", "<init>", "()V", "FieldValidation", "Unknown", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest$FieldValidation;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class InvalidRequest extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError {
        public static final int $stable = 0;

        private InvalidRequest() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest$FieldValidation;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest;", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "field", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardField;", "cardField", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardField;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardField;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardField;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest$FieldValidation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssue", "getField", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardField;", "getCardField"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FieldValidation extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField;
            private final java.lang.String field;
            private final java.lang.String issue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FieldValidation(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.issue = str;
                this.field = str2;
                this.cardField = cardField;
            }

            public final java.lang.String getIssue() {
                return this.issue;
            }

            public final java.lang.String getField() {
                return this.field;
            }

            public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField getCardField() {
                return this.cardField;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.issue;
                java.lang.String str2 = this.field;
                com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField = this.cardField;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldValidation(issue=");
                sb.append(str);
                sb.append(", field=");
                sb.append(str2);
                sb.append(", cardField=");
                sb.append(cardField);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.issue.hashCode();
                java.lang.String str = this.field;
                int hashCode2 = str == null ? 0 : str.hashCode();
                com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField = this.cardField;
                return (((hashCode * 31) + hashCode2) * 31) + (cardField != null ? cardField.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.FieldValidation)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.FieldValidation fieldValidation = (com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.FieldValidation) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.issue, fieldValidation.issue) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, fieldValidation.field) && this.cardField == fieldValidation.cardField;
            }

            public final com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.FieldValidation copy(java.lang.String issue, java.lang.String field, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issue, "");
                return new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.FieldValidation(issue, field, cardField);
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField getCardField() {
                return this.cardField;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getField() {
                return this.field;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getIssue() {
                return this.issue;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.FieldValidation copy$default(com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.FieldValidation fieldValidation, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = fieldValidation.issue;
                }
                if ((i & 2) != 0) {
                    str2 = fieldValidation.field;
                }
                if ((i & 4) != 0) {
                    cardField = fieldValidation.cardField;
                }
                return fieldValidation.copy(str, str2, cardField);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest$Unknown;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest;", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "field", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssue", "getField"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Unknown extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest {
            public static final int $stable = 0;
            private final java.lang.String field;
            private final java.lang.String issue;

            public Unknown(java.lang.String str, java.lang.String str2) {
                super(null);
                this.issue = str;
                this.field = str2;
            }

            public final java.lang.String getField() {
                return this.field;
            }

            public final java.lang.String getIssue() {
                return this.issue;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.issue;
                java.lang.String str2 = this.field;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(issue=");
                sb.append(str);
                sb.append(", field=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.issue;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.field;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.Unknown)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.Unknown unknown = (com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.Unknown) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.issue, unknown.issue) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, unknown.field);
            }

            public final com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.Unknown copy(java.lang.String issue, java.lang.String field) {
                return new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.Unknown(issue, field);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getField() {
                return this.field;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getIssue() {
                return this.issue;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.Unknown copy$default(com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.Unknown unknown, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknown.issue;
                }
                if ((i & 2) != 0) {
                    str2 = unknown.field;
                }
                return unknown.copy(str, str2);
            }
        }

        public /* synthetic */ InvalidRequest(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError;", "<init>", "()V", "SharedInstrumentConsentRequired", "RiskDeclined", "MaxCardAdded", "Unknown", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$MaxCardAdded;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$RiskDeclined;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$SharedInstrumentConsentRequired;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UnprocessableEntity extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError {
        public static final int $stable = 0;

        private UnprocessableEntity() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$SharedInstrumentConsentRequired;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SharedInstrumentConsentRequired extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.SharedInstrumentConsentRequired INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.SharedInstrumentConsentRequired();

            private SharedInstrumentConsentRequired() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$RiskDeclined;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class RiskDeclined extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.RiskDeclined INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.RiskDeclined();

            private RiskDeclined() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$MaxCardAdded;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class MaxCardAdded extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.MaxCardAdded INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.MaxCardAdded();

            private MaxCardAdded() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$Unknown;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity;", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssue", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Unknown extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity {
            public static final int $stable = 0;
            private final java.lang.String description;
            private final java.lang.String issue;

            public Unknown(java.lang.String str, java.lang.String str2) {
                super(null);
                this.issue = str;
                this.description = str2;
            }

            public final java.lang.String getDescription() {
                return this.description;
            }

            public final java.lang.String getIssue() {
                return this.issue;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.issue;
                java.lang.String str2 = this.description;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(issue=");
                sb.append(str);
                sb.append(", description=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.issue;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.description;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.Unknown)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.Unknown unknown = (com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.Unknown) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.issue, unknown.issue) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, unknown.description);
            }

            public final com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.Unknown copy(java.lang.String issue, java.lang.String description) {
                return new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.Unknown(issue, description);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDescription() {
                return this.description;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getIssue() {
                return this.issue;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.Unknown copy$default(com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.Unknown unknown, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknown.issue;
                }
                if ((i & 2) != 0) {
                    str2 = unknown.description;
                }
                return unknown.copy(str, str2);
            }
        }

        public /* synthetic */ UnprocessableEntity(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnknownCode;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError;", "", "code", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnknownCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownCode extends com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError {
        public static final int $stable = 0;
        private final java.lang.String code;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownCode(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.code = str;
            this.message = str2;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.code;
            java.lang.String str2 = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownCode(code=");
            sb.append(str);
            sb.append(", message=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.code;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode unknownCode = (com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.code, unknownCode.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, unknownCode.message);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode copy(java.lang.String code, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode(code, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode copy$default(com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode unknownCode, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownCode.code;
            }
            if ((i & 2) != 0) {
                str2 = unknownCode.message;
            }
            return unknownCode.copy(str, str2);
        }
    }

    public /* synthetic */ CardServerError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
