package com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "T", "", "input", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "ValidationResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Rule<T> {
    com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(T input);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "", "Success", "Error", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface ValidationResult {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Success;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Success implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success();

            private Success() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error$Type;", "type", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error$Type;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error$Type;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error$Type;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error$Type;", "getType", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type;

            public Error(com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                this.type = type;
            }

            public final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type getType() {
                return this.type;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult$Error$Type;", "", "<init>", "(Ljava/lang/String;I)V", "FIELD_DATE_IN_THE_PAST", "FIELD_EMPTY", "FIELD_TOO_SHORT", "FIELD_TOO_LONG", "FIELD_INVALID_FORMAT"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Type {
                public static final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type FIELD_DATE_IN_THE_PAST;
                public static final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type FIELD_EMPTY;
                public static final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type FIELD_INVALID_FORMAT;
                public static final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type FIELD_TOO_LONG;
                public static final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type FIELD_TOO_SHORT;
                private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
                private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type[] getHighSpeedVideoFpsRangesFor;

                private Type(java.lang.String str, int i) {
                }

                static {
                    com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type("FIELD_DATE_IN_THE_PAST", 0);
                    FIELD_DATE_IN_THE_PAST = type;
                    com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type2 = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type("FIELD_EMPTY", 1);
                    FIELD_EMPTY = type2;
                    com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type3 = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type("FIELD_TOO_SHORT", 2);
                    FIELD_TOO_SHORT = type3;
                    com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type4 = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type("FIELD_TOO_LONG", 3);
                    FIELD_TOO_LONG = type4;
                    com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type5 = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type("FIELD_INVALID_FORMAT", 4);
                    FIELD_INVALID_FORMAT = type5;
                    com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type[] typeArr = {type, type2, type3, type4, type5};
                    getHighSpeedVideoFpsRangesFor = typeArr;
                    getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
                }

                public static com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type[] values() {
                    return (com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type[]) getHighSpeedVideoFpsRangesFor.clone();
                }

                public static com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type valueOf(java.lang.String str) {
                    return (com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type.class, str);
                }

                public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type> getEntries() {
                    return getHighSpeedVideoFpsRanges;
                }
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type = this.type;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(type=");
                sb.append(type);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.type.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error) && this.type == ((com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error) other).type;
            }

            public final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error copy(com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                return new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error(type);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type getType() {
                return this.type;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error error, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type type, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    type = error.type;
                }
                return error.copy(type);
            }
        }
    }
}
