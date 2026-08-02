package com.ingo.sdk.kotlin.common.core.http.response;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011JN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0011J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0011"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/UnsupportedApiVersionResponse;", "Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;", "", "errorCode", "title", "", "status", "detail", "traceId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/core/http/response/UnsupportedApiVersionResponse;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/core/http/response/UnsupportedApiVersionResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorCode", "getTitle", com.visa.cbp.getEncExpo.warmup, "getStatus", "getDetail", "getTraceId", "getType", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class UnsupportedApiVersionResponse extends com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse.Companion INSTANCE = new com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse.Companion(null);
    private final java.lang.String detail;
    private final java.lang.String errorCode;
    private final int status;
    private final java.lang.String title;
    private final java.lang.String traceId;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/UnsupportedApiVersionResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/core/http/response/UnsupportedApiVersionResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse> serializer() {
            return com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnsupportedApiVersionResponse(int i, java.lang.String str, java.lang.String str2, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (47 != (i & 47)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 47, com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse$$serializer.INSTANCE.getDescriptor());
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
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
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

    public /* synthetic */ UnsupportedApiVersionResponse(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
    public UnsupportedApiVersionResponse(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
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

    public final java.lang.String toString() {
        java.lang.String str = this.errorCode;
        java.lang.String str2 = this.title;
        int i = this.status;
        java.lang.String str3 = this.detail;
        java.lang.String str4 = this.traceId;
        java.lang.String str5 = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsupportedApiVersionResponse(errorCode=");
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
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.errorCode.hashCode();
        int hashCode2 = this.title.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.status);
        int hashCode4 = this.detail.hashCode();
        java.lang.String str = this.traceId;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse unsupportedApiVersionResponse = (com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, unsupportedApiVersionResponse.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, unsupportedApiVersionResponse.title) && this.status == unsupportedApiVersionResponse.status && kotlin.jvm.internal.Intrinsics.areEqual(this.detail, unsupportedApiVersionResponse.detail) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, unsupportedApiVersionResponse.traceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, unsupportedApiVersionResponse.type);
    }

    public final com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse copy(java.lang.String errorCode, java.lang.String title, int status, java.lang.String detail, java.lang.String traceId, java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse(errorCode, title, status, detail, traceId, type);
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

    public static /* synthetic */ com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse copy$default(com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse unsupportedApiVersionResponse, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = unsupportedApiVersionResponse.errorCode;
        }
        if ((i2 & 2) != 0) {
            str2 = unsupportedApiVersionResponse.title;
        }
        java.lang.String str6 = str2;
        if ((i2 & 4) != 0) {
            i = unsupportedApiVersionResponse.status;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = unsupportedApiVersionResponse.detail;
        }
        java.lang.String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = unsupportedApiVersionResponse.traceId;
        }
        java.lang.String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = unsupportedApiVersionResponse.type;
        }
        return unsupportedApiVersionResponse.copy(str, str6, i3, str7, str8, str5);
    }
}
