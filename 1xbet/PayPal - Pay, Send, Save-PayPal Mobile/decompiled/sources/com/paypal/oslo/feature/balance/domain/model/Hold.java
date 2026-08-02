package com.paypal.oslo.feature.balance.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/Hold;", "", "", "id", "Lcom/paypal/oslo/feature/balance/domain/model/HoldType;", "type", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "amount", "reason", "Ljava/time/ZonedDateTime;", "estimatedReleaseDate", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/HoldType;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/time/ZonedDateTime;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/domain/model/HoldType;", "component3", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component4", "component5", "()Ljava/time/ZonedDateTime;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/HoldType;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/time/ZonedDateTime;)Lcom/paypal/oslo/feature/balance/domain/model/Hold;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/balance/domain/model/HoldType;", "getType", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAmount", "getReason", "Ljava/time/ZonedDateTime;", "getEstimatedReleaseDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Hold {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.balance.domain.model.Money amount;
    private final java.time.ZonedDateTime estimatedReleaseDate;
    private final java.lang.String id;
    private final java.lang.String reason;
    private final com.paypal.oslo.feature.balance.domain.model.HoldType type;

    public Hold(java.lang.String str, com.paypal.oslo.feature.balance.domain.model.HoldType holdType, com.paypal.oslo.feature.balance.domain.model.Money money, java.lang.String str2, java.time.ZonedDateTime zonedDateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.type = holdType;
        this.amount = money;
        this.reason = str2;
        this.estimatedReleaseDate = zonedDateTime;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.balance.domain.model.HoldType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
        return this.amount;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    public final java.time.ZonedDateTime getEstimatedReleaseDate() {
        return this.estimatedReleaseDate;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.balance.domain.model.HoldType holdType = this.type;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.amount;
        java.lang.String str2 = this.reason;
        java.time.ZonedDateTime zonedDateTime = this.estimatedReleaseDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hold(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(holdType);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", reason=");
        sb.append(str2);
        sb.append(", estimatedReleaseDate=");
        sb.append(zonedDateTime);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        int hashCode3 = this.amount.hashCode();
        int hashCode4 = this.reason.hashCode();
        java.time.ZonedDateTime zonedDateTime = this.estimatedReleaseDate;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.Hold)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.Hold hold = (com.paypal.oslo.feature.balance.domain.model.Hold) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, hold.id) && this.type == hold.type && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, hold.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, hold.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedReleaseDate, hold.estimatedReleaseDate);
    }

    public final com.paypal.oslo.feature.balance.domain.model.Hold copy(java.lang.String id, com.paypal.oslo.feature.balance.domain.model.HoldType type, com.paypal.oslo.feature.balance.domain.model.Money amount, java.lang.String reason, java.time.ZonedDateTime estimatedReleaseDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return new com.paypal.oslo.feature.balance.domain.model.Hold(id, type, amount, reason, estimatedReleaseDate);
    }

    /* renamed from: component5, reason: from getter */
    public final java.time.ZonedDateTime getEstimatedReleaseDate() {
        return this.estimatedReleaseDate;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.HoldType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.Hold copy$default(com.paypal.oslo.feature.balance.domain.model.Hold hold, java.lang.String str, com.paypal.oslo.feature.balance.domain.model.HoldType holdType, com.paypal.oslo.feature.balance.domain.model.Money money, java.lang.String str2, java.time.ZonedDateTime zonedDateTime, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = hold.id;
        }
        if ((i & 2) != 0) {
            holdType = hold.type;
        }
        com.paypal.oslo.feature.balance.domain.model.HoldType holdType2 = holdType;
        if ((i & 4) != 0) {
            money = hold.amount;
        }
        com.paypal.oslo.feature.balance.domain.model.Money money2 = money;
        if ((i & 8) != 0) {
            str2 = hold.reason;
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            zonedDateTime = hold.estimatedReleaseDate;
        }
        return hold.copy(str, holdType2, money2, str3, zonedDateTime);
    }
}
