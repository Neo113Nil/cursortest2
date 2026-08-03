package com.unity3d.ads.core.data.model.exception;

/* compiled from: NetworkTimeoutException.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/NetworkTimeoutException;", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "message", "", "type", "Lcom/unity3d/ads/core/data/model/OperationType;", "code", "", "url", "protocol", "cronetCode", "client", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/OperationType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkTimeoutException extends com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
    public /* synthetic */ NetworkTimeoutException(java.lang.String str, com.unity3d.ads.core.data.model.OperationType operationType, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.Integer num2, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.unity3d.ads.core.data.model.OperationType.UNKNOWN : operationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTimeoutException(java.lang.String message, com.unity3d.ads.core.data.model.OperationType type, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.String str3) {
        super(message, type, num, str, str2, num2, str3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
    }
}
