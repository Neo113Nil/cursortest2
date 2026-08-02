package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u007f\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0086\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0016J'\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b<\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b=\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;", "", "", "id", "startDate", "nextReloadDate", "recurrence", "financialInstrumentId", "financialInstrumentName", "lastFourChars", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "reloadAmount", "status", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getStartDate", "getNextReloadDate", "getRecurrence", "getFinancialInstrumentId", "getFinancialInstrumentName", "getLastFourChars", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "getReloadAmount", "getStatus", "getType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class TransferSettingsData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.TransferSettingsData.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.TransferSettingsData.Companion(null);
    private final java.lang.String financialInstrumentId;
    private final java.lang.String financialInstrumentName;
    private final java.lang.String id;
    private final java.lang.String lastFourChars;
    private final java.lang.String nextReloadDate;
    private final java.lang.String recurrence;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData reloadAmount;
    private final java.lang.String startDate;
    private final java.lang.String status;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.TransferSettingsData> serializer() {
            return com.paypal.oslo.feature.savings.domain.model.TransferSettingsData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TransferSettingsData(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData, java.lang.String str8, java.lang.String str9, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1023, com.paypal.oslo.feature.savings.domain.model.TransferSettingsData$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.startDate = str2;
        this.nextReloadDate = str3;
        this.recurrence = str4;
        this.financialInstrumentId = str5;
        this.financialInstrumentName = str6;
        this.lastFourChars = str7;
        this.reloadAmount = moneyData;
        this.status = str8;
        this.type = str9;
    }

    public TransferSettingsData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData, java.lang.String str8, java.lang.String str9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.startDate = str2;
        this.nextReloadDate = str3;
        this.recurrence = str4;
        this.financialInstrumentId = str5;
        this.financialInstrumentName = str6;
        this.lastFourChars = str7;
        this.reloadAmount = moneyData;
        this.status = str8;
        this.type = str9;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.TransferSettingsData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.startDate);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.nextReloadDate);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.recurrence);
        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.financialInstrumentId);
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.financialInstrumentName);
        output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastFourChars);
        output.encodeNullableSerializableElement(serialDesc, 7, com.paypal.oslo.feature.savings.domain.model.MoneyData$$serializer.INSTANCE, self.reloadAmount);
        output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.status);
        output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.type);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String getNextReloadDate() {
        return this.nextReloadDate;
    }

    public final java.lang.String getRecurrence() {
        return this.recurrence;
    }

    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    public final java.lang.String getFinancialInstrumentName() {
        return this.financialInstrumentName;
    }

    public final java.lang.String getLastFourChars() {
        return this.lastFourChars;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getReloadAmount() {
        return this.reloadAmount;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.startDate;
        java.lang.String str3 = this.nextReloadDate;
        java.lang.String str4 = this.recurrence;
        java.lang.String str5 = this.financialInstrumentId;
        java.lang.String str6 = this.financialInstrumentName;
        java.lang.String str7 = this.lastFourChars;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.reloadAmount;
        java.lang.String str8 = this.status;
        java.lang.String str9 = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferSettingsData(id=");
        sb.append(str);
        sb.append(", startDate=");
        sb.append(str2);
        sb.append(", nextReloadDate=");
        sb.append(str3);
        sb.append(", recurrence=");
        sb.append(str4);
        sb.append(", financialInstrumentId=");
        sb.append(str5);
        sb.append(", financialInstrumentName=");
        sb.append(str6);
        sb.append(", lastFourChars=");
        sb.append(str7);
        sb.append(", reloadAmount=");
        sb.append(moneyData);
        sb.append(", status=");
        sb.append(str8);
        sb.append(", type=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.startDate;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.nextReloadDate;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.recurrence;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.financialInstrumentId;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.financialInstrumentName;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.lastFourChars;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.reloadAmount;
        int hashCode8 = moneyData == null ? 0 : moneyData.hashCode();
        java.lang.String str7 = this.status;
        int hashCode9 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.type;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.TransferSettingsData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData = (com.paypal.oslo.feature.savings.domain.model.TransferSettingsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, transferSettingsData.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, transferSettingsData.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextReloadDate, transferSettingsData.nextReloadDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.recurrence, transferSettingsData.recurrence) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, transferSettingsData.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentName, transferSettingsData.financialInstrumentName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourChars, transferSettingsData.lastFourChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, transferSettingsData.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, transferSettingsData.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, transferSettingsData.type);
    }

    public final com.paypal.oslo.feature.savings.domain.model.TransferSettingsData copy(java.lang.String id, java.lang.String startDate, java.lang.String nextReloadDate, java.lang.String recurrence, java.lang.String financialInstrumentId, java.lang.String financialInstrumentName, java.lang.String lastFourChars, com.paypal.oslo.feature.savings.domain.model.MoneyData reloadAmount, java.lang.String status, java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.savings.domain.model.TransferSettingsData(id, startDate, nextReloadDate, recurrence, financialInstrumentId, financialInstrumentName, lastFourChars, reloadAmount, status, type);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getReloadAmount() {
        return this.reloadAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getLastFourChars() {
        return this.lastFourChars;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getFinancialInstrumentName() {
        return this.financialInstrumentName;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getRecurrence() {
        return this.recurrence;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getNextReloadDate() {
        return this.nextReloadDate;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
