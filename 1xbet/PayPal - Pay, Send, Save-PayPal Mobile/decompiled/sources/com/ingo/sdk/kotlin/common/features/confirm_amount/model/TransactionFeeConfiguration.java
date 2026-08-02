package com.ingo.sdk.kotlin.common.features.confirm_amount.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eBm\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017Jf\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J'\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b6\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b7\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b:\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/TransactionFeeConfiguration;", "", "", "feeAmountInCents", "", "formattedFeeAmount", "formattedFeeTitle", "totalAmountMinusFeesInCents", "fundsTimingTitle", "fundsTimingDescription", "", "fundsTimingDisclaimers", "formattedExpectedFundDate", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "copy", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/TransactionFeeConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/TransactionFeeConfiguration;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "J", "getFeeAmountInCents", "Ljava/lang/String;", "getFormattedFeeAmount", "getFormattedFeeTitle", "getTotalAmountMinusFeesInCents", "getFundsTimingTitle", "getFundsTimingDescription", "Ljava/util/List;", "getFundsTimingDisclaimers", "getFormattedExpectedFundDate", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class TransactionFeeConfiguration {
    private final long feeAmountInCents;
    private final java.lang.String formattedExpectedFundDate;
    private final java.lang.String formattedFeeAmount;
    private final java.lang.String formattedFeeTitle;
    private final java.lang.String fundsTimingDescription;
    private final java.util.List<java.lang.String> fundsTimingDisclaimers;
    private final java.lang.String fundsTimingTitle;
    private final long totalAmountMinusFeesInCents;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration.m10771$r8$lambda$cbOHYe63Rke6VbdoErAjIErA2s();
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/TransactionFeeConfiguration$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/TransactionFeeConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration> serializer() {
            return com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TransactionFeeConfiguration(int i, long j, java.lang.String str, java.lang.String str2, long j2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 255, com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.feeAmountInCents = j;
        this.formattedFeeAmount = str;
        this.formattedFeeTitle = str2;
        this.totalAmountMinusFeesInCents = j2;
        this.fundsTimingTitle = str3;
        this.fundsTimingDescription = str4;
        this.fundsTimingDisclaimers = list;
        this.formattedExpectedFundDate = str5;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeLongElement(serialDesc, 0, self.feeAmountInCents);
        output.encodeStringElement(serialDesc, 1, self.formattedFeeAmount);
        output.encodeStringElement(serialDesc, 2, self.formattedFeeTitle);
        output.encodeLongElement(serialDesc, 3, self.totalAmountMinusFeesInCents);
        output.encodeStringElement(serialDesc, 4, self.fundsTimingTitle);
        output.encodeStringElement(serialDesc, 5, self.fundsTimingDescription);
        output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.fundsTimingDisclaimers);
        output.encodeStringElement(serialDesc, 7, self.formattedExpectedFundDate);
    }

    public TransactionFeeConfiguration(long j, java.lang.String str, java.lang.String str2, long j2, java.lang.String str3, java.lang.String str4, java.util.List<java.lang.String> list, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.feeAmountInCents = j;
        this.formattedFeeAmount = str;
        this.formattedFeeTitle = str2;
        this.totalAmountMinusFeesInCents = j2;
        this.fundsTimingTitle = str3;
        this.fundsTimingDescription = str4;
        this.fundsTimingDisclaimers = list;
        this.formattedExpectedFundDate = str5;
    }

    public final long getFeeAmountInCents() {
        return this.feeAmountInCents;
    }

    public final java.lang.String getFormattedFeeAmount() {
        return this.formattedFeeAmount;
    }

    public final java.lang.String getFormattedFeeTitle() {
        return this.formattedFeeTitle;
    }

    public final long getTotalAmountMinusFeesInCents() {
        return this.totalAmountMinusFeesInCents;
    }

    public final java.lang.String getFundsTimingTitle() {
        return this.fundsTimingTitle;
    }

    public final java.lang.String getFundsTimingDescription() {
        return this.fundsTimingDescription;
    }

    public final java.util.List<java.lang.String> getFundsTimingDisclaimers() {
        return this.fundsTimingDisclaimers;
    }

    public final java.lang.String getFormattedExpectedFundDate() {
        return this.formattedExpectedFundDate;
    }

    /* renamed from: $r8$lambda$cbOHYe63Rke6VbdoErAjIErA2-s, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m10771$r8$lambda$cbOHYe63Rke6VbdoErAjIErA2s() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    public final java.lang.String toString() {
        long j = this.feeAmountInCents;
        java.lang.String str = this.formattedFeeAmount;
        java.lang.String str2 = this.formattedFeeTitle;
        long j2 = this.totalAmountMinusFeesInCents;
        java.lang.String str3 = this.fundsTimingTitle;
        java.lang.String str4 = this.fundsTimingDescription;
        java.util.List<java.lang.String> list = this.fundsTimingDisclaimers;
        java.lang.String str5 = this.formattedExpectedFundDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionFeeConfiguration(feeAmountInCents=");
        sb.append(j);
        sb.append(", formattedFeeAmount=");
        sb.append(str);
        sb.append(", formattedFeeTitle=");
        sb.append(str2);
        sb.append(", totalAmountMinusFeesInCents=");
        sb.append(j2);
        sb.append(", fundsTimingTitle=");
        sb.append(str3);
        sb.append(", fundsTimingDescription=");
        sb.append(str4);
        sb.append(", fundsTimingDisclaimers=");
        sb.append(list);
        sb.append(", formattedExpectedFundDate=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((java.lang.Long.hashCode(this.feeAmountInCents) * 31) + this.formattedFeeAmount.hashCode()) * 31) + this.formattedFeeTitle.hashCode()) * 31) + java.lang.Long.hashCode(this.totalAmountMinusFeesInCents)) * 31) + this.fundsTimingTitle.hashCode()) * 31) + this.fundsTimingDescription.hashCode()) * 31) + this.fundsTimingDisclaimers.hashCode()) * 31) + this.formattedExpectedFundDate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration transactionFeeConfiguration = (com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration) other;
        return this.feeAmountInCents == transactionFeeConfiguration.feeAmountInCents && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedFeeAmount, transactionFeeConfiguration.formattedFeeAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedFeeTitle, transactionFeeConfiguration.formattedFeeTitle) && this.totalAmountMinusFeesInCents == transactionFeeConfiguration.totalAmountMinusFeesInCents && kotlin.jvm.internal.Intrinsics.areEqual(this.fundsTimingTitle, transactionFeeConfiguration.fundsTimingTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundsTimingDescription, transactionFeeConfiguration.fundsTimingDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundsTimingDisclaimers, transactionFeeConfiguration.fundsTimingDisclaimers) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedExpectedFundDate, transactionFeeConfiguration.formattedExpectedFundDate);
    }

    public final com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration copy(long feeAmountInCents, java.lang.String formattedFeeAmount, java.lang.String formattedFeeTitle, long totalAmountMinusFeesInCents, java.lang.String fundsTimingTitle, java.lang.String fundsTimingDescription, java.util.List<java.lang.String> fundsTimingDisclaimers, java.lang.String formattedExpectedFundDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedFeeAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedFeeTitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTimingTitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTimingDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTimingDisclaimers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedExpectedFundDate, "");
        return new com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration(feeAmountInCents, formattedFeeAmount, formattedFeeTitle, totalAmountMinusFeesInCents, fundsTimingTitle, fundsTimingDescription, fundsTimingDisclaimers, formattedExpectedFundDate);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getFormattedExpectedFundDate() {
        return this.formattedExpectedFundDate;
    }

    public final java.util.List<java.lang.String> component7() {
        return this.fundsTimingDisclaimers;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getFundsTimingDescription() {
        return this.fundsTimingDescription;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFundsTimingTitle() {
        return this.fundsTimingTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTotalAmountMinusFeesInCents() {
        return this.totalAmountMinusFeesInCents;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFormattedFeeTitle() {
        return this.formattedFeeTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormattedFeeAmount() {
        return this.formattedFeeAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final long getFeeAmountInCents() {
        return this.feeAmountInCents;
    }
}
