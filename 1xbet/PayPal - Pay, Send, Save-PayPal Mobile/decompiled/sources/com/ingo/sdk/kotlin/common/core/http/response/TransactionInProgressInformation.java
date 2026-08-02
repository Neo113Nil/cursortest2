package com.ingo.sdk.kotlin.common.core.http.response;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b2\u0010\u0012"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;", "", "", "transactionReferenceNumber", "", "transactionAmountInCents", "checkAmountInCents", "fundsTiming", "fundsTimingDescription", "frontImageThumbnailUrl", "checkSubmissionDateUTC", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTransactionReferenceNumber", com.visa.cbp.getEncExpo.warmup, "getTransactionAmountInCents", "getCheckAmountInCents", "getFundsTiming", "getFundsTimingDescription", "getFrontImageThumbnailUrl", "getCheckSubmissionDateUTC", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class TransactionInProgressInformation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation.Companion INSTANCE = new com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation.Companion(null);
    private final int checkAmountInCents;
    private final java.lang.String checkSubmissionDateUTC;
    private final java.lang.String frontImageThumbnailUrl;
    private final java.lang.String fundsTiming;
    private final java.lang.String fundsTimingDescription;
    private final int transactionAmountInCents;
    private final java.lang.String transactionReferenceNumber;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation> serializer() {
            return com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TransactionInProgressInformation(int i, java.lang.String str, int i2, int i3, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 127, com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation$$serializer.INSTANCE.getDescriptor());
        }
        this.transactionReferenceNumber = str;
        this.transactionAmountInCents = i2;
        this.checkAmountInCents = i3;
        this.fundsTiming = str2;
        this.fundsTimingDescription = str3;
        this.frontImageThumbnailUrl = str4;
        this.checkSubmissionDateUTC = str5;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.transactionReferenceNumber);
        output.encodeIntElement(serialDesc, 1, self.transactionAmountInCents);
        output.encodeIntElement(serialDesc, 2, self.checkAmountInCents);
        output.encodeStringElement(serialDesc, 3, self.fundsTiming);
        output.encodeStringElement(serialDesc, 4, self.fundsTimingDescription);
        output.encodeStringElement(serialDesc, 5, self.frontImageThumbnailUrl);
        output.encodeStringElement(serialDesc, 6, self.checkSubmissionDateUTC);
    }

    public TransactionInProgressInformation(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.transactionReferenceNumber = str;
        this.transactionAmountInCents = i;
        this.checkAmountInCents = i2;
        this.fundsTiming = str2;
        this.fundsTimingDescription = str3;
        this.frontImageThumbnailUrl = str4;
        this.checkSubmissionDateUTC = str5;
    }

    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public final int getTransactionAmountInCents() {
        return this.transactionAmountInCents;
    }

    public final int getCheckAmountInCents() {
        return this.checkAmountInCents;
    }

    public final java.lang.String getFundsTiming() {
        return this.fundsTiming;
    }

    public final java.lang.String getFundsTimingDescription() {
        return this.fundsTimingDescription;
    }

    public final java.lang.String getFrontImageThumbnailUrl() {
        return this.frontImageThumbnailUrl;
    }

    public final java.lang.String getCheckSubmissionDateUTC() {
        return this.checkSubmissionDateUTC;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionReferenceNumber;
        int i = this.transactionAmountInCents;
        int i2 = this.checkAmountInCents;
        java.lang.String str2 = this.fundsTiming;
        java.lang.String str3 = this.fundsTimingDescription;
        java.lang.String str4 = this.frontImageThumbnailUrl;
        java.lang.String str5 = this.checkSubmissionDateUTC;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionInProgressInformation(transactionReferenceNumber=");
        sb.append(str);
        sb.append(", transactionAmountInCents=");
        sb.append(i);
        sb.append(", checkAmountInCents=");
        sb.append(i2);
        sb.append(", fundsTiming=");
        sb.append(str2);
        sb.append(", fundsTimingDescription=");
        sb.append(str3);
        sb.append(", frontImageThumbnailUrl=");
        sb.append(str4);
        sb.append(", checkSubmissionDateUTC=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.transactionReferenceNumber.hashCode() * 31) + java.lang.Integer.hashCode(this.transactionAmountInCents)) * 31) + java.lang.Integer.hashCode(this.checkAmountInCents)) * 31) + this.fundsTiming.hashCode()) * 31) + this.fundsTimingDescription.hashCode()) * 31) + this.frontImageThumbnailUrl.hashCode()) * 31) + this.checkSubmissionDateUTC.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation transactionInProgressInformation = (com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionReferenceNumber, transactionInProgressInformation.transactionReferenceNumber) && this.transactionAmountInCents == transactionInProgressInformation.transactionAmountInCents && this.checkAmountInCents == transactionInProgressInformation.checkAmountInCents && kotlin.jvm.internal.Intrinsics.areEqual(this.fundsTiming, transactionInProgressInformation.fundsTiming) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundsTimingDescription, transactionInProgressInformation.fundsTimingDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.frontImageThumbnailUrl, transactionInProgressInformation.frontImageThumbnailUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkSubmissionDateUTC, transactionInProgressInformation.checkSubmissionDateUTC);
    }

    public final com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation copy(java.lang.String transactionReferenceNumber, int transactionAmountInCents, int checkAmountInCents, java.lang.String fundsTiming, java.lang.String fundsTimingDescription, java.lang.String frontImageThumbnailUrl, java.lang.String checkSubmissionDateUTC) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTiming, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTimingDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frontImageThumbnailUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkSubmissionDateUTC, "");
        return new com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation(transactionReferenceNumber, transactionAmountInCents, checkAmountInCents, fundsTiming, fundsTimingDescription, frontImageThumbnailUrl, checkSubmissionDateUTC);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCheckSubmissionDateUTC() {
        return this.checkSubmissionDateUTC;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getFrontImageThumbnailUrl() {
        return this.frontImageThumbnailUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFundsTimingDescription() {
        return this.fundsTimingDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFundsTiming() {
        return this.fundsTiming;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCheckAmountInCents() {
        return this.checkAmountInCents;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTransactionAmountInCents() {
        return this.transactionAmountInCents;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation copy$default(com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation transactionInProgressInformation, java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = transactionInProgressInformation.transactionReferenceNumber;
        }
        if ((i3 & 2) != 0) {
            i = transactionInProgressInformation.transactionAmountInCents;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = transactionInProgressInformation.checkAmountInCents;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = transactionInProgressInformation.fundsTiming;
        }
        java.lang.String str6 = str2;
        if ((i3 & 16) != 0) {
            str3 = transactionInProgressInformation.fundsTimingDescription;
        }
        java.lang.String str7 = str3;
        if ((i3 & 32) != 0) {
            str4 = transactionInProgressInformation.frontImageThumbnailUrl;
        }
        java.lang.String str8 = str4;
        if ((i3 & 64) != 0) {
            str5 = transactionInProgressInformation.checkSubmissionDateUTC;
        }
        return transactionInProgressInformation.copy(str, i4, i5, str6, str7, str8, str5);
    }
}
