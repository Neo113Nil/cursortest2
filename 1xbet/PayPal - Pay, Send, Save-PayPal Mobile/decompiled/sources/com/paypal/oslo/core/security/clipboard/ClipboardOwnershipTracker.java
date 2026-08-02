package com.paypal.oslo.core.security.clipboard;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/security/clipboard/ClipboardOwnershipTracker;", "", "<init>", "()V", "", "markOwnedAndGenerateToken", "()Ljava/lang/String;", "", "markCleared", "", "isOwned", "()Z", "getToken", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "verifyToken", "(Ljava/lang/String;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ClipboardOwnershipTracker {
    public static final java.lang.String OWNERSHIP_TOKEN_KEY = "oslo_clip_owner_token";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public ClipboardOwnershipTracker() {
    }

    public final java.lang.String markOwnedAndGenerateToken() {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.getHighSpeedVideoFpsRangesFor.set(obj);
        return obj;
    }

    public final void markCleared() {
        this.getHighSpeedVideoFpsRangesFor.set(null);
    }

    public final boolean isOwned() {
        return this.getHighSpeedVideoFpsRangesFor.get() != null;
    }

    public final java.lang.String getToken() {
        return this.getHighSpeedVideoFpsRangesFor.get();
    }

    public final boolean verifyToken(java.lang.String token) {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor.get();
        return str != null && kotlin.jvm.internal.Intrinsics.areEqual(str, token);
    }
}
