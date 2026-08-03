package com.vungle.ads;

/* compiled from: VungleError.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/MraidTemplateError;", "Lcom/vungle/ads/VungleError;", "loggableReason", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "message", "", "(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class MraidTemplateError extends com.vungle.ads.VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason loggableReason, java.lang.String message) {
        super(loggableReason, message, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggableReason, "loggableReason");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
    }
}
