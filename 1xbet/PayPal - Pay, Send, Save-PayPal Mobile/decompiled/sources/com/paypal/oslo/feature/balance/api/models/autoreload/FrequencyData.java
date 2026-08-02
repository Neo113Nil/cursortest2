package com.paypal.oslo.feature.balance.api.models.autoreload;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013Jd\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0013J'\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;", "", "", "startDate", "startDay", "recurrence", "financialInstrumentId", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/ReloadAmount;", "reloadAmount", "balanceId", "formattedReloadAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/api/models/autoreload/ReloadAmount;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/api/models/autoreload/ReloadAmount;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/ReloadAmount;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/api/models/autoreload/ReloadAmount;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_api_prodRelease", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getStartDate", "getStartDay", "getRecurrence", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/ReloadAmount;", "getReloadAmount", "getBalanceId", "getFormattedReloadAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FrequencyData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData.Companion INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData.Companion(null);
    private final java.lang.String balanceId;
    private final java.lang.String financialInstrumentId;
    private final java.lang.String formattedReloadAmount;
    private final java.lang.String recurrence;
    private final com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount;
    private final java.lang.String startDate;
    private final java.lang.String startDay;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData> serializer() {
            return com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FrequencyData(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount, java.lang.String str5, java.lang.String str6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.startDate = null;
        } else {
            this.startDate = str;
        }
        if ((i & 2) == 0) {
            this.startDay = null;
        } else {
            this.startDay = str2;
        }
        if ((i & 4) == 0) {
            this.recurrence = null;
        } else {
            this.recurrence = str3;
        }
        if ((i & 8) == 0) {
            this.financialInstrumentId = null;
        } else {
            this.financialInstrumentId = str4;
        }
        if ((i & 16) == 0) {
            this.reloadAmount = null;
        } else {
            this.reloadAmount = reloadAmount;
        }
        if ((i & 32) == 0) {
            this.balanceId = null;
        } else {
            this.balanceId = str5;
        }
        if ((i & 64) == 0) {
            this.formattedReloadAmount = null;
        } else {
            this.formattedReloadAmount = str6;
        }
    }

    public FrequencyData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount, java.lang.String str5, java.lang.String str6) {
        this.startDate = str;
        this.startDay = str2;
        this.recurrence = str3;
        this.financialInstrumentId = str4;
        this.reloadAmount = reloadAmount;
        this.balanceId = str5;
        this.formattedReloadAmount = str6;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$balance_api_prodRelease(com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.startDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.startDate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.startDay != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.startDay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.recurrence != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.recurrence);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.financialInstrumentId != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.financialInstrumentId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.reloadAmount != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount$$serializer.INSTANCE, self.reloadAmount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.balanceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.balanceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.formattedReloadAmount != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.formattedReloadAmount);
        }
    }

    public /* synthetic */ FrequencyData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : reloadAmount, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String getStartDay() {
        return this.startDay;
    }

    public final java.lang.String getRecurrence() {
        return this.recurrence;
    }

    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    public final com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount getReloadAmount() {
        return this.reloadAmount;
    }

    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public final java.lang.String getFormattedReloadAmount() {
        return this.formattedReloadAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.startDate;
        java.lang.String str2 = this.startDay;
        java.lang.String str3 = this.recurrence;
        java.lang.String str4 = this.financialInstrumentId;
        com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount = this.reloadAmount;
        java.lang.String str5 = this.balanceId;
        java.lang.String str6 = this.formattedReloadAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrequencyData(startDate=");
        sb.append(str);
        sb.append(", startDay=");
        sb.append(str2);
        sb.append(", recurrence=");
        sb.append(str3);
        sb.append(", financialInstrumentId=");
        sb.append(str4);
        sb.append(", reloadAmount=");
        sb.append(reloadAmount);
        sb.append(", balanceId=");
        sb.append(str5);
        sb.append(", formattedReloadAmount=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.startDate;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.startDay;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.recurrence;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.financialInstrumentId;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount = this.reloadAmount;
        int hashCode5 = reloadAmount == null ? 0 : reloadAmount.hashCode();
        java.lang.String str5 = this.balanceId;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.formattedReloadAmount;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData)) {
            return false;
        }
        com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData frequencyData = (com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, frequencyData.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDay, frequencyData.startDay) && kotlin.jvm.internal.Intrinsics.areEqual(this.recurrence, frequencyData.recurrence) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, frequencyData.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, frequencyData.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, frequencyData.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedReloadAmount, frequencyData.formattedReloadAmount);
    }

    public final com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData copy(java.lang.String startDate, java.lang.String startDay, java.lang.String recurrence, java.lang.String financialInstrumentId, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount, java.lang.String balanceId, java.lang.String formattedReloadAmount) {
        return new com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData(startDate, startDay, recurrence, financialInstrumentId, reloadAmount, balanceId, formattedReloadAmount);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getFormattedReloadAmount() {
        return this.formattedReloadAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount getReloadAmount() {
        return this.reloadAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRecurrence() {
        return this.recurrence;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStartDay() {
        return this.startDay;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData copy$default(com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData frequencyData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = frequencyData.startDate;
        }
        if ((i & 2) != 0) {
            str2 = frequencyData.startDay;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = frequencyData.recurrence;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = frequencyData.financialInstrumentId;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            reloadAmount = frequencyData.reloadAmount;
        }
        com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount2 = reloadAmount;
        if ((i & 32) != 0) {
            str5 = frequencyData.balanceId;
        }
        java.lang.String str10 = str5;
        if ((i & 64) != 0) {
            str6 = frequencyData.formattedReloadAmount;
        }
        return frequencyData.copy(str, str7, str8, str9, reloadAmount2, str10, str6);
    }

    public FrequencyData() {
        this((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount) null, (java.lang.String) null, (java.lang.String) null, 127, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
