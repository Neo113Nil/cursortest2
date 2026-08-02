package com.paypal.android.taptopay.data.thales.fcm.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/model/CardPushNotification;", "", "Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;", "type", "", "digitizedCardId", "<init>", "(Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;Ljava/lang/String;)V", "component1", "()Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;Ljava/lang/String;)Lcom/paypal/android/taptopay/data/thales/fcm/model/CardPushNotification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDigitizedCardId", "Lcom/paypal/android/taptopay/domain/model/card/CardStateChange$Type;", "getType"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CardPushNotification {
    private final java.lang.String digitizedCardId;
    private final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type;

    public CardPushNotification(com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.type = type;
        this.digitizedCardId = str;
    }

    public /* synthetic */ CardPushNotification(com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type getType() {
        return this.type;
    }

    public final java.lang.String getDigitizedCardId() {
        return this.digitizedCardId;
    }

    public final java.lang.String toString() {
        com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type = this.type;
        java.lang.String str = this.digitizedCardId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardPushNotification(type=");
        sb.append(type);
        sb.append(", digitizedCardId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.digitizedCardId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification)) {
            return false;
        }
        com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification cardPushNotification = (com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification) other;
        return this.type == cardPushNotification.type && kotlin.jvm.internal.Intrinsics.areEqual(this.digitizedCardId, cardPushNotification.digitizedCardId);
    }

    public final com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification copy(com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type, java.lang.String digitizedCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification(type, digitizedCardId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDigitizedCardId() {
        return this.digitizedCardId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.android.taptopay.domain.model.card.CardStateChange.Type getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification copy$default(com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification cardPushNotification, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            type = cardPushNotification.type;
        }
        if ((i & 2) != 0) {
            str = cardPushNotification.digitizedCardId;
        }
        return cardPushNotification.copy(type, str);
    }
}
