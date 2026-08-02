package com.paypal.oslo.core.companion.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/NetworkLoggingLevel;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "getDescription", "shouldRedactSensitiveHeaders", "Z", "getShouldRedactSensitiveHeaders", "()Z", "Companion", "NONE", "BASIC", "HEADERS_REDACTED", "HEADERS_WITH_SENSITIVE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkLoggingLevel {
    public static final com.paypal.oslo.core.companion.domain.NetworkLoggingLevel BASIC;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.Companion INSTANCE;
    private static final com.paypal.oslo.core.companion.domain.NetworkLoggingLevel DEFAULT;
    public static final com.paypal.oslo.core.companion.domain.NetworkLoggingLevel HEADERS_REDACTED;
    public static final com.paypal.oslo.core.companion.domain.NetworkLoggingLevel HEADERS_WITH_SENSITIVE;
    public static final com.paypal.oslo.core.companion.domain.NetworkLoggingLevel NONE;
    private static final /* synthetic */ com.paypal.oslo.core.companion.domain.NetworkLoggingLevel[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String description;
    private final java.lang.String displayName;
    private final boolean shouldRedactSensitiveHeaders;

    private NetworkLoggingLevel(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, boolean z) {
        this.displayName = str2;
        this.description = str3;
        this.shouldRedactSensitiveHeaders = z;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final boolean getShouldRedactSensitiveHeaders() {
        return this.shouldRedactSensitiveHeaders;
    }

    static {
        com.paypal.oslo.core.companion.domain.NetworkLoggingLevel networkLoggingLevel = new com.paypal.oslo.core.companion.domain.NetworkLoggingLevel("NONE", 0, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "No logging", false);
        NONE = networkLoggingLevel;
        com.paypal.oslo.core.companion.domain.NetworkLoggingLevel networkLoggingLevel2 = new com.paypal.oslo.core.companion.domain.NetworkLoggingLevel("BASIC", 1, io.ktor.http.auth.AuthScheme.Basic, "Logs request and response lines (method, URL, status code, response time)", false);
        BASIC = networkLoggingLevel2;
        com.paypal.oslo.core.companion.domain.NetworkLoggingLevel networkLoggingLevel3 = new com.paypal.oslo.core.companion.domain.NetworkLoggingLevel("HEADERS_REDACTED", 2, "Headers (without sensitive headers)", "Logs request and response lines + headers (sensitive headers like Authorization, Cookie redacted)", true);
        HEADERS_REDACTED = networkLoggingLevel3;
        com.paypal.oslo.core.companion.domain.NetworkLoggingLevel networkLoggingLevel4 = new com.paypal.oslo.core.companion.domain.NetworkLoggingLevel("HEADERS_WITH_SENSITIVE", 3, "Headers (with sensitive headers)", "Logs request and response lines + all headers including sensitive ones", false);
        HEADERS_WITH_SENSITIVE = networkLoggingLevel4;
        com.paypal.oslo.core.companion.domain.NetworkLoggingLevel[] networkLoggingLevelArr = {networkLoggingLevel, networkLoggingLevel2, networkLoggingLevel3, networkLoggingLevel4};
        getHighResolutionOutputSizeshNQ4ISI = networkLoggingLevelArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(networkLoggingLevelArr);
        INSTANCE = new com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.Companion(null);
        DEFAULT = networkLoggingLevel3;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/NetworkLoggingLevel$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/core/companion/domain/NetworkLoggingLevel;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/core/companion/domain/NetworkLoggingLevel;", "DEFAULT", "Lcom/paypal/oslo/core/companion/domain/NetworkLoggingLevel;", "getDEFAULT", "()Lcom/paypal/oslo/core/companion/domain/NetworkLoggingLevel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.core.companion.domain.NetworkLoggingLevel getDEFAULT() {
            return com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.DEFAULT;
        }

        public final com.paypal.oslo.core.companion.domain.NetworkLoggingLevel fromString(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.core.companion.domain.NetworkLoggingLevel) obj).name(), value, true)) {
                    break;
                }
            }
            com.paypal.oslo.core.companion.domain.NetworkLoggingLevel networkLoggingLevel = (com.paypal.oslo.core.companion.domain.NetworkLoggingLevel) obj;
            return networkLoggingLevel == null ? getDEFAULT() : networkLoggingLevel;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.core.companion.domain.NetworkLoggingLevel[] values() {
        return (com.paypal.oslo.core.companion.domain.NetworkLoggingLevel[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.companion.domain.NetworkLoggingLevel valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.companion.domain.NetworkLoggingLevel) java.lang.Enum.valueOf(com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.companion.domain.NetworkLoggingLevel> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
