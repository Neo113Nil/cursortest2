package com.ingo.sdk.kotlin.common.core.http.response;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002:;BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBo\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014Jh\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0014J'\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u0014R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b9\u0010\u0014"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/ImageValidationFailureResponse;", "Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;", "", "errorCode", "title", "", "status", "detail", "traceId", "type", "", "invalidImages", "transactionReferenceNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/core/http/response/ImageValidationFailureResponse;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/core/http/response/ImageValidationFailureResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorCode", "getTitle", com.visa.cbp.getEncExpo.warmup, "getStatus", "getDetail", "getTraceId", "getType", "Ljava/util/List;", "getInvalidImages", "getTransactionReferenceNumber", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class ImageValidationFailureResponse extends com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse {
    public static final java.lang.String BACK = "BACK";
    public static final java.lang.String FRONT = "FRONT";
    private final java.lang.String detail;
    private final java.lang.String errorCode;
    private final java.util.List<java.lang.String> invalidImages;
    private final int status;
    private final java.lang.String title;
    private final java.lang.String traceId;
    private final java.lang.String transactionReferenceNumber;
    private final java.lang.String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.Companion INSTANCE = new com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.$r8$lambda$NEvwjWRhBs6oNKY0tqYbn0_Fae0();
        }
    }), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageValidationFailureResponse(int i, java.lang.String str, java.lang.String str2, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, java.lang.String str6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (239 != (i & 239)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 239, com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.errorCode = str;
        this.title = str2;
        this.status = i2;
        this.detail = str3;
        if ((i & 16) == 0) {
            this.traceId = null;
        } else {
            this.traceId = str4;
        }
        this.type = str5;
        this.invalidImages = list;
        this.transactionReferenceNumber = str6;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.write$Self(self, output, serialDesc);
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getErrorCode());
        output.encodeStringElement(serialDesc, 1, self.getTitle());
        output.encodeIntElement(serialDesc, 2, self.getStatus());
        output.encodeStringElement(serialDesc, 3, self.getDetail());
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getTraceId() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getTraceId());
        }
        output.encodeStringElement(serialDesc, 5, self.getType());
        output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.invalidImages);
        output.encodeStringElement(serialDesc, 7, self.transactionReferenceNumber);
    }

    public /* synthetic */ ImageValidationFailureResponse(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, java.lang.String str6, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? null : str4, str5, list, str6);
    }

    @Override // com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse
    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    @Override // com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse
    public final java.lang.String getTitle() {
        return this.title;
    }

    @Override // com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse
    public final int getStatus() {
        return this.status;
    }

    @Override // com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse
    public final java.lang.String getDetail() {
        return this.detail;
    }

    @Override // com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse
    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    @Override // com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse
    public final java.lang.String getType() {
        return this.type;
    }

    public final java.util.List<java.lang.String> getInvalidImages() {
        return this.invalidImages;
    }

    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageValidationFailureResponse(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list, java.lang.String str6) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.errorCode = str;
        this.title = str2;
        this.status = i;
        this.detail = str3;
        this.traceId = str4;
        this.type = str5;
        this.invalidImages = list;
        this.transactionReferenceNumber = str6;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/ImageValidationFailureResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/core/http/response/ImageValidationFailureResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, "Ljava/lang/String;", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse> serializer() {
            return com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$NEvwjWRhBs6oNKY0tqYbn0_Fae0() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.errorCode;
        java.lang.String str2 = this.title;
        int i = this.status;
        java.lang.String str3 = this.detail;
        java.lang.String str4 = this.traceId;
        java.lang.String str5 = this.type;
        java.util.List<java.lang.String> list = this.invalidImages;
        java.lang.String str6 = this.transactionReferenceNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageValidationFailureResponse(errorCode=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(i);
        sb.append(", detail=");
        sb.append(str3);
        sb.append(", traceId=");
        sb.append(str4);
        sb.append(", type=");
        sb.append(str5);
        sb.append(", invalidImages=");
        sb.append(list);
        sb.append(", transactionReferenceNumber=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.errorCode.hashCode();
        int hashCode2 = this.title.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.status);
        int hashCode4 = this.detail.hashCode();
        java.lang.String str = this.traceId;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.invalidImages.hashCode()) * 31) + this.transactionReferenceNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse imageValidationFailureResponse = (com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, imageValidationFailureResponse.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, imageValidationFailureResponse.title) && this.status == imageValidationFailureResponse.status && kotlin.jvm.internal.Intrinsics.areEqual(this.detail, imageValidationFailureResponse.detail) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, imageValidationFailureResponse.traceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, imageValidationFailureResponse.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.invalidImages, imageValidationFailureResponse.invalidImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionReferenceNumber, imageValidationFailureResponse.transactionReferenceNumber);
    }

    public final com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse copy(java.lang.String errorCode, java.lang.String title, int status, java.lang.String detail, java.lang.String traceId, java.lang.String type, java.util.List<java.lang.String> invalidImages, java.lang.String transactionReferenceNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidImages, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        return new com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse(errorCode, title, status, detail, traceId, type, invalidImages, transactionReferenceNumber);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public final java.util.List<java.lang.String> component7() {
        return this.invalidImages;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDetail() {
        return this.detail;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }
}
