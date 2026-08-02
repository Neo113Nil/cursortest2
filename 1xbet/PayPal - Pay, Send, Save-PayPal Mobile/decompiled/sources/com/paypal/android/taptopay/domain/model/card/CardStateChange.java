package com.paypal.android.taptopay.domain.model.card;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/CardStateChange;", "", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "digitizedCard", "Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;", "type", "<init>", "(Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;)V", "component1", "()Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "component2", "()Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;", "copy", "(Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;)Lcom/paypal/android/taptopay/domain/model/card/CardStateChange;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "getDigitizedCard", "Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;", "getType", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CardStateChange {
    private final com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard;
    private final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type;

    public CardStateChange(com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.digitizedCard = digitizedCard;
        this.type = type;
    }

    public final com.paypal.android.taptopay.domain.model.card.DigitizedCard getDigitizedCard() {
        return this.digitizedCard;
    }

    public final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;", "", "<init>", "(Ljava/lang/String;I)V", "PROVISIONED", com.payair.model.TokenStatusKt.TOKEN_DELETED, "SUSPENDED", "RESUMED", "UPDATED", "DEFAULT", "NOT_DEFAULT"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type DEFAULT;
        public static final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type DELETED;
        public static final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type NOT_DEFAULT;
        public static final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type PROVISIONED;
        public static final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type RESUMED;
        public static final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type SUSPENDED;
        public static final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type UPDATED;
        private static final /* synthetic */ com.paypal.android.taptopay.domain.model.card.CardStateChange.Type[] getHighSpeedVideoFpsRanges;

        private Type(java.lang.String str, int i) {
        }

        static {
            com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type = new com.paypal.android.taptopay.domain.model.card.CardStateChange.Type("PROVISIONED", 0);
            PROVISIONED = type;
            com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type2 = new com.paypal.android.taptopay.domain.model.card.CardStateChange.Type(com.payair.model.TokenStatusKt.TOKEN_DELETED, 1);
            DELETED = type2;
            com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type3 = new com.paypal.android.taptopay.domain.model.card.CardStateChange.Type("SUSPENDED", 2);
            SUSPENDED = type3;
            com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type4 = new com.paypal.android.taptopay.domain.model.card.CardStateChange.Type("RESUMED", 3);
            RESUMED = type4;
            com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type5 = new com.paypal.android.taptopay.domain.model.card.CardStateChange.Type("UPDATED", 4);
            UPDATED = type5;
            com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type6 = new com.paypal.android.taptopay.domain.model.card.CardStateChange.Type("DEFAULT", 5);
            DEFAULT = type6;
            com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type7 = new com.paypal.android.taptopay.domain.model.card.CardStateChange.Type("NOT_DEFAULT", 6);
            NOT_DEFAULT = type7;
            com.paypal.android.taptopay.domain.model.card.CardStateChange.Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            getHighSpeedVideoFpsRanges = typeArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
        }

        public static com.paypal.android.taptopay.domain.model.card.CardStateChange.Type[] values() {
            return (com.paypal.android.taptopay.domain.model.card.CardStateChange.Type[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.android.taptopay.domain.model.card.CardStateChange.Type valueOf(java.lang.String str) {
            return (com.paypal.android.taptopay.domain.model.card.CardStateChange.Type) java.lang.Enum.valueOf(com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.android.taptopay.domain.model.card.CardStateChange.Type> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public final java.lang.String toString() {
        com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard = this.digitizedCard;
        com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardStateChange(digitizedCard=");
        sb.append(digitizedCard);
        sb.append(", type=");
        sb.append(type);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.digitizedCard.hashCode() * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.domain.model.card.CardStateChange)) {
            return false;
        }
        com.paypal.android.taptopay.domain.model.card.CardStateChange cardStateChange = (com.paypal.android.taptopay.domain.model.card.CardStateChange) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.digitizedCard, cardStateChange.digitizedCard) && this.type == cardStateChange.type;
    }

    public final com.paypal.android.taptopay.domain.model.card.CardStateChange copy(com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.android.taptopay.domain.model.card.CardStateChange(digitizedCard, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.android.taptopay.domain.model.card.DigitizedCard getDigitizedCard() {
        return this.digitizedCard;
    }

    public static /* synthetic */ com.paypal.android.taptopay.domain.model.card.CardStateChange copy$default(com.paypal.android.taptopay.domain.model.card.CardStateChange cardStateChange, com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            digitizedCard = cardStateChange.digitizedCard;
        }
        if ((i & 2) != 0) {
            type = cardStateChange.type;
        }
        return cardStateChange.copy(digitizedCard, type);
    }
}
