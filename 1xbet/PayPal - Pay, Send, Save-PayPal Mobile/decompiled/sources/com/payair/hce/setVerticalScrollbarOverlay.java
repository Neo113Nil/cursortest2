package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\tB\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/hce/setVerticalScrollbarOverlay;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "AlternateContactlessPaymentDataJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setVerticalScrollbarOverlay extends java.lang.RuntimeException {

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    public static final com.payair.hce.setVerticalScrollbarOverlay.Companion INSTANCE = new com.payair.hce.setVerticalScrollbarOverlay.Companion(null);
    private static int valueOf = 0;
    private static int values = 1;

    public /* synthetic */ setVerticalScrollbarOverlay(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public setVerticalScrollbarOverlay(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/hce/setVerticalScrollbarOverlay$AlternateContactlessPaymentDataJson;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setVerticalScrollbarOverlay$AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = values;
        int i2 = i & 49;
        int i3 = -(-((i ^ 49) | i2));
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setVerticalScrollbarOverlay() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
