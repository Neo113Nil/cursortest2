package com.paypal.oslo.core.security.clipboard;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J3\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/security/clipboard/SecureClipboardManager;", "", "", "label", "text", "", "isSensitive", "Lkotlin/time/Duration;", "clearAfter", "", "copyToClipboard-Wn2Vu4Y", "(Ljava/lang/String;Ljava/lang/String;ZJ)V", "copyToClipboard", "Landroid/content/ClipData;", "clipData", "copyToClipboard-SxA4cEA", "(Landroid/content/ClipData;ZJ)V", "clearSensitiveClipboard", "()V", "hasSensitiveClip", "()Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface SecureClipboardManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.security.clipboard.SecureClipboardManager.Companion INSTANCE = com.paypal.oslo.core.security.clipboard.SecureClipboardManager.Companion.getHighSpeedVideoFpsRanges;

    void clearSensitiveClipboard();

    /* renamed from: copyToClipboard-SxA4cEA, reason: not valid java name */
    void mo11684copyToClipboardSxA4cEA(android.content.ClipData clipData, boolean isSensitive, long clearAfter);

    /* renamed from: copyToClipboard-Wn2Vu4Y, reason: not valid java name */
    void mo11685copyToClipboardWn2Vu4Y(java.lang.String label, java.lang.String text, boolean isSensitive, long clearAfter);

    boolean hasSensitiveClip();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/security/clipboard/SecureClipboardManager$Companion;", "", "<init>", "()V", "Lkotlin/time/Duration;", "DEFAULT_CLEAR_TIMEOUT", "J", "getDEFAULT_CLEAR_TIMEOUT-UwyO8pc", "()J", "NO_AUTO_CLEAR", "getNO_AUTO_CLEAR-UwyO8pc"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private static final long DEFAULT_CLEAR_TIMEOUT;
        private static final long NO_AUTO_CLEAR;
        static final /* synthetic */ com.paypal.oslo.core.security.clipboard.SecureClipboardManager.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.security.clipboard.SecureClipboardManager.Companion();

        private Companion() {
        }

        static {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            DEFAULT_CLEAR_TIMEOUT = kotlin.time.DurationKt.toDuration(1, kotlin.time.DurationUnit.HOURS);
            NO_AUTO_CLEAR = kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc();
        }

        /* renamed from: getDEFAULT_CLEAR_TIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m11686getDEFAULT_CLEAR_TIMEOUTUwyO8pc() {
            return DEFAULT_CLEAR_TIMEOUT;
        }

        /* renamed from: getNO_AUTO_CLEAR-UwyO8pc, reason: not valid java name */
        public final long m11687getNO_AUTO_CLEARUwyO8pc() {
            return NO_AUTO_CLEAR;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: copyToClipboard-Wn2Vu4Y$default, reason: not valid java name */
    static /* synthetic */ void m11683copyToClipboardWn2Vu4Y$default(com.paypal.oslo.core.security.clipboard.SecureClipboardManager secureClipboardManager, java.lang.String str, java.lang.String str2, boolean z, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyToClipboard-Wn2Vu4Y");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = INSTANCE.m11686getDEFAULT_CLEAR_TIMEOUTUwyO8pc();
        }
        secureClipboardManager.mo11685copyToClipboardWn2Vu4Y(str, str2, z2, j);
    }

    /* renamed from: copyToClipboard-SxA4cEA$default, reason: not valid java name */
    static /* synthetic */ void m11682copyToClipboardSxA4cEA$default(com.paypal.oslo.core.security.clipboard.SecureClipboardManager secureClipboardManager, android.content.ClipData clipData, boolean z, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyToClipboard-SxA4cEA");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = INSTANCE.m11686getDEFAULT_CLEAR_TIMEOUTUwyO8pc();
        }
        secureClipboardManager.mo11684copyToClipboardSxA4cEA(clipData, z, j);
    }
}
