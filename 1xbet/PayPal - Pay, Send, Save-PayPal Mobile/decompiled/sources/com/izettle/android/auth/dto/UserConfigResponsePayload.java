package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/izettle/android/auth/dto/UserConfigResponsePayload;", "", "", "operationResultCode", "", "responseMessage", "Lcom/izettle/android/auth/dto/UserConfigDto;", "payload", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/izettle/android/auth/dto/UserConfigDto;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/Integer;", "getOperationResultCode", "()Ljava/lang/Integer;", "Lcom/izettle/android/auth/dto/UserConfigDto;", "getPayload", "()Lcom/izettle/android/auth/dto/UserConfigDto;", "Ljava/lang/String;", "getResponseMessage", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserConfigResponsePayload {
    private final java.lang.Integer operationResultCode;
    private final com.izettle.android.auth.dto.UserConfigDto payload;
    private final java.lang.String responseMessage;

    public UserConfigResponsePayload(@com.izettle.android.serialization.annotations.JsonDeserialize("RESPONSE_CODE") java.lang.Integer num, @com.izettle.android.serialization.annotations.JsonDeserialize("RESPONSE_MESSAGE") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("PAYLOAD") com.izettle.android.auth.dto.UserConfigDto userConfigDto) {
        this.operationResultCode = num;
        this.responseMessage = str;
        this.payload = userConfigDto;
    }

    public final java.lang.Integer getOperationResultCode() {
        return this.operationResultCode;
    }

    public final java.lang.String getResponseMessage() {
        return this.responseMessage;
    }

    public final com.izettle.android.auth.dto.UserConfigDto getPayload() {
        return this.payload;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.UserConfigResponsePayload)) {
            return false;
        }
        com.izettle.android.auth.dto.UserConfigResponsePayload userConfigResponsePayload = (com.izettle.android.auth.dto.UserConfigResponsePayload) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(userConfigResponsePayload.operationResultCode, this.operationResultCode) && kotlin.jvm.internal.Intrinsics.areEqual(userConfigResponsePayload.responseMessage, this.responseMessage) && kotlin.jvm.internal.Intrinsics.areEqual(userConfigResponsePayload.payload, this.payload);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.operationResultCode, this.responseMessage, this.payload);
    }
}
