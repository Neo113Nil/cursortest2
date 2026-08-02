package com.ingo.sdk.kotlin.common.core.http.response;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u001a"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionDeclinedErrorResponse;", "Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;", "", "errorCode", "title", "", "status", "detail", "traceId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionDeclinedErrorResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "getTitle", com.visa.cbp.getEncExpo.warmup, "getStatus", "()I", "getDetail", "getTraceId", "getType", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final class TransactionDeclinedErrorResponse extends com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse.Companion INSTANCE = new com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse.Companion(null);
    private final java.lang.String detail;
    private final java.lang.String errorCode;
    private final int status;
    private final java.lang.String title;
    private final java.lang.String traceId;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionDeclinedErrorResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionDeclinedErrorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse> serializer() {
            return com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransactionDeclinedErrorResponse(int i, java.lang.String str, java.lang.String str2, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (47 != (i & 47)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 47, com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse$$serializer.INSTANCE.getDescriptor());
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
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.write$Self(self, output, serialDesc);
        output.encodeStringElement(serialDesc, 0, self.getErrorCode());
        output.encodeStringElement(serialDesc, 1, self.getTitle());
        output.encodeIntElement(serialDesc, 2, self.getStatus());
        output.encodeStringElement(serialDesc, 3, self.getDetail());
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getTraceId() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getTraceId());
        }
        output.encodeStringElement(serialDesc, 5, self.getType());
    }

    public /* synthetic */ TransactionDeclinedErrorResponse(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? null : str4, str5);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionDeclinedErrorResponse(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.errorCode = str;
        this.title = str2;
        this.status = i;
        this.detail = str3;
        this.traceId = str4;
        this.type = str5;
    }
}
