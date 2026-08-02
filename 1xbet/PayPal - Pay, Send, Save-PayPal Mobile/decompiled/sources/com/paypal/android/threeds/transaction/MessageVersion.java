package com.paypal.android.threeds.transaction;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/android/threeds/transaction/MessageVersion;", "", "<init>", "()V", "", "messageVersion", "", "isSupportedMessageVersion", "(Ljava/lang/String;)Z", "CURRENT", "Ljava/lang/String;", "getCURRENT", "()Ljava/lang/String;", "setCURRENT", "(Ljava/lang/String;)V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessageVersion {
    public static final com.paypal.android.threeds.transaction.MessageVersion INSTANCE = new com.paypal.android.threeds.transaction.MessageVersion();
    private static java.lang.String CURRENT = "2.2.013";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"2.2.013", "2.2.0", "2.1.0"});
    public static final int $stable = 8;

    private MessageVersion() {
    }

    public final java.lang.String getCURRENT() {
        return CURRENT;
    }

    public final void setCURRENT(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        CURRENT = str;
    }

    public final boolean isSupportedMessageVersion(java.lang.String messageVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageVersion, "");
        return getHighSpeedVideoSizes.contains(messageVersion);
    }
}
