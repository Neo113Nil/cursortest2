package com.paypal.oslo.feature.qrc.domain.model.review;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bi\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J'\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b\u000e\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "", "", "id", "Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "type", "formattedName", "typeLabel", "imageUrl", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "amount", "Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;", "balance", "", "isSelected", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "component7", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;", "component8", "()Z", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;Z)Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "getType", "getFormattedName", "getTypeLabel", "getImageUrl", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "getAmount", "Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;", "getBalance", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FundingSource {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amount;
    private final com.paypal.oslo.feature.qrc.domain.model.review.Balance balance;
    private final java.lang.String formattedName;
    private final java.lang.String id;
    private final java.lang.String imageUrl;
    private final boolean isSelected;
    private final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType type;
    private final java.lang.String typeLabel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.review.FundingSource.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.review.FundingSource> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FundingSource(int i, java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.type = instrumentType;
        this.formattedName = str2;
        this.typeLabel = str3;
        this.imageUrl = str4;
        this.amount = qrcMoney;
        if ((i & 64) == 0) {
            this.balance = null;
        } else {
            this.balance = balance;
        }
        if ((i & 128) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
    }

    public FundingSource(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
        this.id = str;
        this.type = instrumentType;
        this.formattedName = str2;
        this.typeLabel = str3;
        this.imageUrl = str4;
        this.amount = qrcMoney;
        this.balance = balance;
        this.isSelected = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.type);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.formattedName);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.typeLabel);
        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 5, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, self.amount);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.balance != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, com.paypal.oslo.feature.qrc.domain.model.review.Balance$$serializer.INSTANCE, self.balance);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.isSelected) {
            output.encodeBooleanElement(serialDesc, 7, self.isSelected);
        }
    }

    public /* synthetic */ FundingSource(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, instrumentType, str2, str3, str4, qrcMoney, (i & 64) != 0 ? null : balance, (i & 128) != 0 ? false : z);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType getType() {
        return this.type;
    }

    public final java.lang.String getFormattedName() {
        return this.formattedName;
    }

    public final java.lang.String getTypeLabel() {
        return this.typeLabel;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.Balance getBalance() {
        return this.balance;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType = this.type;
        java.lang.String str2 = this.formattedName;
        java.lang.String str3 = this.typeLabel;
        java.lang.String str4 = this.imageUrl;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = this.amount;
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance = this.balance;
        boolean z = this.isSelected;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(instrumentType);
        sb.append(", formattedName=");
        sb.append(str2);
        sb.append(", typeLabel=");
        sb.append(str3);
        sb.append(", imageUrl=");
        sb.append(str4);
        sb.append(", amount=");
        sb.append(qrcMoney);
        sb.append(", balance=");
        sb.append(balance);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        java.lang.String str = this.formattedName;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.typeLabel;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.imageUrl;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = this.amount;
        int hashCode6 = qrcMoney == null ? 0 : qrcMoney.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance = this.balance;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (balance != null ? balance.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isSelected);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.review.FundingSource)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingSource.id) && this.type == fundingSource.type && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedName, fundingSource.formattedName) && kotlin.jvm.internal.Intrinsics.areEqual(this.typeLabel, fundingSource.typeLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, fundingSource.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, fundingSource.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, fundingSource.balance) && this.isSelected == fundingSource.isSelected;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource copy(java.lang.String id, com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType type, java.lang.String formattedName, java.lang.String typeLabel, java.lang.String imageUrl, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amount, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance, boolean isSelected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.qrc.domain.model.review.FundingSource(id, type, formattedName, typeLabel, imageUrl, amount, balance, isSelected);
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.Balance getBalance() {
        return this.balance;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTypeLabel() {
        return this.typeLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFormattedName() {
        return this.formattedName;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
