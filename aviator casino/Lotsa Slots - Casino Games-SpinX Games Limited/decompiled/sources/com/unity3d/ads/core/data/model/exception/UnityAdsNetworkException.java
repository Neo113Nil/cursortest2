package com.unity3d.ads.core.data.model.exception;

/* compiled from: UnityAdsNetworkException.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\rR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "type", "Lcom/unity3d/ads/core/data/model/OperationType;", "code", "", "url", "protocol", "cronetCode", "client", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/OperationType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getClient", "()Ljava/lang/String;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCronetCode", "getMessage", "getProtocol", "getType", "()Lcom/unity3d/ads/core/data/model/OperationType;", "getUrl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public class UnityAdsNetworkException extends java.lang.Exception {
    private final java.lang.String client;
    private final java.lang.Integer code;
    private final java.lang.Integer cronetCode;
    private final java.lang.String message;
    private final java.lang.String protocol;
    private final com.unity3d.ads.core.data.model.OperationType type;
    private final java.lang.String url;

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }

    public /* synthetic */ UnityAdsNetworkException(java.lang.String str, com.unity3d.ads.core.data.model.OperationType operationType, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.Integer num2, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.unity3d.ads.core.data.model.OperationType.UNKNOWN : operationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? str4 : null);
    }

    public final com.unity3d.ads.core.data.model.OperationType getType() {
        return this.type;
    }

    public final java.lang.Integer getCode() {
        return this.code;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getProtocol() {
        return this.protocol;
    }

    public final java.lang.Integer getCronetCode() {
        return this.cronetCode;
    }

    public final java.lang.String getClient() {
        return this.client;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(java.lang.String message, com.unity3d.ads.core.data.model.OperationType type, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.String str3) {
        super(message);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this.message = message;
        this.type = type;
        this.code = num;
        this.url = str;
        this.protocol = str2;
        this.cronetCode = num2;
        this.client = str3;
    }
}
