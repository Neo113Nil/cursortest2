package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/izettle/android/auth/dto/RevisitResponsePayload;", "", "", "operationResultCode", "", "responseMessage", "Lcom/izettle/android/auth/dto/RevisitDto;", "payload", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/izettle/android/auth/dto/RevisitDto;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/izettle/android/auth/dto/RevisitDto;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/izettle/android/auth/dto/RevisitDto;)Lcom/izettle/android/auth/dto/RevisitResponsePayload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getOperationResultCode", "Lcom/izettle/android/auth/dto/RevisitDto;", "getPayload", "Ljava/lang/String;", "getResponseMessage"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RevisitResponsePayload {
    private final java.lang.Integer operationResultCode;
    private final com.izettle.android.auth.dto.RevisitDto payload;
    private final java.lang.String responseMessage;

    public RevisitResponsePayload(@com.izettle.android.serialization.annotations.JsonDeserialize("RESPONSE_CODE") java.lang.Integer num, @com.izettle.android.serialization.annotations.JsonDeserialize("RESPONSE_MESSAGE") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("PAYLOAD") com.izettle.android.auth.dto.RevisitDto revisitDto) {
        this.operationResultCode = num;
        this.responseMessage = str;
        this.payload = revisitDto;
    }

    public final java.lang.Integer getOperationResultCode() {
        return this.operationResultCode;
    }

    public final java.lang.String getResponseMessage() {
        return this.responseMessage;
    }

    public final com.izettle.android.auth.dto.RevisitDto getPayload() {
        return this.payload;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.operationResultCode;
        java.lang.String str = this.responseMessage;
        com.izettle.android.auth.dto.RevisitDto revisitDto = this.payload;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevisitResponsePayload(operationResultCode=");
        sb.append(num);
        sb.append(", responseMessage=");
        sb.append(str);
        sb.append(", payload=");
        sb.append(revisitDto);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.operationResultCode;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.responseMessage;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.izettle.android.auth.dto.RevisitDto revisitDto = this.payload;
        return (((hashCode * 31) + hashCode2) * 31) + (revisitDto != null ? revisitDto.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.izettle.android.auth.dto.RevisitResponsePayload)) {
            return false;
        }
        com.izettle.android.auth.dto.RevisitResponsePayload revisitResponsePayload = (com.izettle.android.auth.dto.RevisitResponsePayload) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.operationResultCode, revisitResponsePayload.operationResultCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.responseMessage, revisitResponsePayload.responseMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, revisitResponsePayload.payload);
    }

    public final com.izettle.android.auth.dto.RevisitResponsePayload copy(@com.izettle.android.serialization.annotations.JsonDeserialize("RESPONSE_CODE") java.lang.Integer operationResultCode, @com.izettle.android.serialization.annotations.JsonDeserialize("RESPONSE_MESSAGE") java.lang.String responseMessage, @com.izettle.android.serialization.annotations.JsonDeserialize("PAYLOAD") com.izettle.android.auth.dto.RevisitDto payload) {
        return new com.izettle.android.auth.dto.RevisitResponsePayload(operationResultCode, responseMessage, payload);
    }

    /* renamed from: component3, reason: from getter */
    public final com.izettle.android.auth.dto.RevisitDto getPayload() {
        return this.payload;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getResponseMessage() {
        return this.responseMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getOperationResultCode() {
        return this.operationResultCode;
    }

    public static /* synthetic */ com.izettle.android.auth.dto.RevisitResponsePayload copy$default(com.izettle.android.auth.dto.RevisitResponsePayload revisitResponsePayload, java.lang.Integer num, java.lang.String str, com.izettle.android.auth.dto.RevisitDto revisitDto, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = revisitResponsePayload.operationResultCode;
        }
        if ((i & 2) != 0) {
            str = revisitResponsePayload.responseMessage;
        }
        if ((i & 4) != 0) {
            revisitDto = revisitResponsePayload.payload;
        }
        return revisitResponsePayload.copy(num, str, revisitDto);
    }
}
