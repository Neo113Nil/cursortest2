package com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0016J'\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "", "", "id", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;", "fundingSourceType", "issuerName", "lastNChars", "classification", "image", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;", "status", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;", "contingencyDetails", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;", "component8", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;", "getFundingSourceType", "getIssuerName", "getLastNChars", "getClassification", "getImage", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;", "getStatus", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;", "getContingencyDetails", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitCardFundingSource {
    public static final int $stable = 0;
    private final java.lang.String classification;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType contingencyDetails;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType;
    private final java.lang.String id;
    private final java.lang.String image;
    private final java.lang.String issuerName;
    private final java.lang.String lastNChars;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> serializer() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitCardFundingSource(int i, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus debitCardFundingSourceStatus, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 255, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.fundingSourceType = fundingSourceType;
        this.issuerName = str2;
        this.lastNChars = str3;
        this.classification = str4;
        this.image = str5;
        this.status = debitCardFundingSourceStatus;
        this.contingencyDetails = debitCardFundingSourceContingencyType;
    }

    public DebitCardFundingSource(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus debitCardFundingSourceStatus, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceType, "");
        this.id = str;
        this.fundingSourceType = fundingSourceType;
        this.issuerName = str2;
        this.lastNChars = str3;
        this.classification = str4;
        this.image = str5;
        this.status = debitCardFundingSourceStatus;
        this.contingencyDetails = debitCardFundingSourceContingencyType;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.fundingSourceType);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.issuerName);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastNChars);
        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.classification);
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.image);
        output.encodeNullableSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.status);
        output.encodeNullableSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.contingencyDetails);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType getFundingSourceType() {
        return this.fundingSourceType;
    }

    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final java.lang.String getClassification() {
        return this.classification;
    }

    public final java.lang.String getImage() {
        return this.image;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType getContingencyDetails() {
        return this.contingencyDetails;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType = this.fundingSourceType;
        java.lang.String str2 = this.issuerName;
        java.lang.String str3 = this.lastNChars;
        java.lang.String str4 = this.classification;
        java.lang.String str5 = this.image;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus debitCardFundingSourceStatus = this.status;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType = this.contingencyDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardFundingSource(id=");
        sb.append(str);
        sb.append(", fundingSourceType=");
        sb.append(fundingSourceType);
        sb.append(", issuerName=");
        sb.append(str2);
        sb.append(", lastNChars=");
        sb.append(str3);
        sb.append(", classification=");
        sb.append(str4);
        sb.append(", image=");
        sb.append(str5);
        sb.append(", status=");
        sb.append(debitCardFundingSourceStatus);
        sb.append(", contingencyDetails=");
        sb.append(debitCardFundingSourceContingencyType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.fundingSourceType.hashCode();
        java.lang.String str = this.issuerName;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.lastNChars;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.classification;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.image;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus debitCardFundingSourceStatus = this.status;
        int hashCode7 = debitCardFundingSourceStatus == null ? 0 : debitCardFundingSourceStatus.hashCode();
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType = this.contingencyDetails;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (debitCardFundingSourceContingencyType != null ? debitCardFundingSourceContingencyType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, debitCardFundingSource.id) && this.fundingSourceType == debitCardFundingSource.fundingSourceType && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, debitCardFundingSource.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, debitCardFundingSource.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.classification, debitCardFundingSource.classification) && kotlin.jvm.internal.Intrinsics.areEqual(this.image, debitCardFundingSource.image) && this.status == debitCardFundingSource.status && this.contingencyDetails == debitCardFundingSource.contingencyDetails;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource copy(java.lang.String id, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType, java.lang.String issuerName, java.lang.String lastNChars, java.lang.String classification, java.lang.String image, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus status, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType contingencyDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceType, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource(id, fundingSourceType, issuerName, lastNChars, classification, image, status, contingencyDetails);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType getContingencyDetails() {
        return this.contingencyDetails;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getClassification() {
        return this.classification;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType getFundingSourceType() {
        return this.fundingSourceType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
