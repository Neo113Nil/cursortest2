package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b\u0006\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b\u0007\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "", "", "amount", "currencyCode", "", "isStrikeThroughAmount", "isAmountNeutral", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCryptoAssetQuantityInformation;", "cryptoAssetQuantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCryptoAssetQuantityInformation;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCryptoAssetQuantityInformation;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCryptoAssetQuantityInformation;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCryptoAssetQuantityInformation;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAmount", "setAmount", "(Ljava/lang/String;)V", "getCurrencyCode", "Z", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCryptoAssetQuantityInformation;", "getCryptoAssetQuantity", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActivityCounterPartyAmountInformation {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation.Companion(null);
    private java.lang.String amount;
    private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation cryptoAssetQuantity;
    private final java.lang.String currencyCode;
    private final boolean isAmountNeutral;
    private final boolean isStrikeThroughAmount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation> serializer() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityCounterPartyAmountInformation(int i, java.lang.String str, java.lang.String str2, boolean z, boolean z2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation activityCryptoAssetQuantityInformation, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.currencyCode = null;
        } else {
            this.currencyCode = str2;
        }
        if ((i & 4) == 0) {
            this.isStrikeThroughAmount = false;
        } else {
            this.isStrikeThroughAmount = z;
        }
        if ((i & 8) == 0) {
            this.isAmountNeutral = false;
        } else {
            this.isAmountNeutral = z2;
        }
        if ((i & 16) == 0) {
            this.cryptoAssetQuantity = null;
        } else {
            this.cryptoAssetQuantity = activityCryptoAssetQuantityInformation;
        }
    }

    public ActivityCounterPartyAmountInformation(java.lang.String str, java.lang.String str2, boolean z, boolean z2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation activityCryptoAssetQuantityInformation) {
        this.amount = str;
        this.currencyCode = str2;
        this.isStrikeThroughAmount = z;
        this.isAmountNeutral = z2;
        this.cryptoAssetQuantity = activityCryptoAssetQuantityInformation;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.amount != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.amount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.currencyCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.currencyCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isStrikeThroughAmount) {
            output.encodeBooleanElement(serialDesc, 2, self.isStrikeThroughAmount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isAmountNeutral) {
            output.encodeBooleanElement(serialDesc, 3, self.isAmountNeutral);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.cryptoAssetQuantity != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation$$serializer.INSTANCE, self.cryptoAssetQuantity);
        }
    }

    public /* synthetic */ ActivityCounterPartyAmountInformation(java.lang.String str, java.lang.String str2, boolean z, boolean z2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation activityCryptoAssetQuantityInformation, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : activityCryptoAssetQuantityInformation);
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final void setAmount(java.lang.String str) {
        this.amount = str;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final boolean isStrikeThroughAmount() {
        return this.isStrikeThroughAmount;
    }

    public final boolean isAmountNeutral() {
        return this.isAmountNeutral;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation getCryptoAssetQuantity() {
        return this.cryptoAssetQuantity;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        java.lang.String str2 = this.currencyCode;
        boolean z = this.isStrikeThroughAmount;
        boolean z2 = this.isAmountNeutral;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation activityCryptoAssetQuantityInformation = this.cryptoAssetQuantity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityCounterPartyAmountInformation(amount=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", isStrikeThroughAmount=");
        sb.append(z);
        sb.append(", isAmountNeutral=");
        sb.append(z2);
        sb.append(", cryptoAssetQuantity=");
        sb.append(activityCryptoAssetQuantityInformation);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.amount;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.currencyCode;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isStrikeThroughAmount);
        int hashCode4 = java.lang.Boolean.hashCode(this.isAmountNeutral);
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation activityCryptoAssetQuantityInformation = this.cryptoAssetQuantity;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (activityCryptoAssetQuantityInformation != null ? activityCryptoAssetQuantityInformation.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, activityCounterPartyAmountInformation.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, activityCounterPartyAmountInformation.currencyCode) && this.isStrikeThroughAmount == activityCounterPartyAmountInformation.isStrikeThroughAmount && this.isAmountNeutral == activityCounterPartyAmountInformation.isAmountNeutral && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoAssetQuantity, activityCounterPartyAmountInformation.cryptoAssetQuantity);
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation copy(java.lang.String amount, java.lang.String currencyCode, boolean isStrikeThroughAmount, boolean isAmountNeutral, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation cryptoAssetQuantity) {
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation(amount, currencyCode, isStrikeThroughAmount, isAmountNeutral, cryptoAssetQuantity);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation getCryptoAssetQuantity() {
        return this.cryptoAssetQuantity;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAmountNeutral() {
        return this.isAmountNeutral;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsStrikeThroughAmount() {
        return this.isStrikeThroughAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation, java.lang.String str, java.lang.String str2, boolean z, boolean z2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation activityCryptoAssetQuantityInformation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityCounterPartyAmountInformation.amount;
        }
        if ((i & 2) != 0) {
            str2 = activityCounterPartyAmountInformation.currencyCode;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = activityCounterPartyAmountInformation.isStrikeThroughAmount;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = activityCounterPartyAmountInformation.isAmountNeutral;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            activityCryptoAssetQuantityInformation = activityCounterPartyAmountInformation.cryptoAssetQuantity;
        }
        return activityCounterPartyAmountInformation.copy(str, str3, z3, z4, activityCryptoAssetQuantityInformation);
    }

    public ActivityCounterPartyAmountInformation() {
        this((java.lang.String) null, (java.lang.String) null, false, false, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation) null, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
