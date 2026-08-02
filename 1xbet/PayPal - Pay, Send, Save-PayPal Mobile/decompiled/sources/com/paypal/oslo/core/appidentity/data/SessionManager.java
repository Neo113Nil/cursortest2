package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/SessionManager;", "Lcom/paypal/oslo/core/appidentity/data/SessionReader;", "Lcom/paypal/oslo/core/appidentity/data/SessionEditor;", "<init>", "()V", "", "rotateSession", "", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getSessionId", "()Ljava/lang/String;", "sessionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionManager implements com.paypal.oslo.core.appidentity.data.SessionReader, com.paypal.oslo.core.appidentity.data.SessionEditor {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile java.lang.String getHighSpeedVideoFpsRangesFor;

    public SessionManager() {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.getHighSpeedVideoFpsRangesFor = obj;
    }

    @Override // com.paypal.oslo.core.appidentity.data.SessionReader
    /* renamed from: getSessionId, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.paypal.oslo.core.appidentity.data.SessionEditor
    public final void rotateSession() {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.getHighSpeedVideoFpsRangesFor = obj;
    }
}
