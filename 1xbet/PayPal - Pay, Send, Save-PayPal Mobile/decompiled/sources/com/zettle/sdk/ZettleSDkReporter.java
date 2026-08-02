package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/ZettleSDkReporter;", "", "Lcom/zettle/sdk/Configuration;", "config", "", "reportConfiguredFeatures", "(Lcom/zettle/sdk/Configuration;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ZettleSDkReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.ZettleSDkReporter.Companion INSTANCE = com.zettle.sdk.ZettleSDkReporter.Companion.getHighSpeedVideoSizes;
    public static final java.lang.String PREFS_KEY_FEATURES = "zettle-sdk-features";
    public static final java.lang.String PREFS_NAME = "zettle-sdk-reporter";
    public static final java.lang.String SCOPE_NAME = "sdkReporterScope";

    void reportConfiguredFeatures(com.zettle.sdk.Configuration config);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/ZettleSDkReporter$Companion;", "", "<init>", "()V", "", "PREFS_KEY_FEATURES", "Ljava/lang/String;", "PREFS_NAME", "SCOPE_NAME"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String PREFS_KEY_FEATURES = "zettle-sdk-features";
        public static final java.lang.String PREFS_NAME = "zettle-sdk-reporter";
        public static final java.lang.String SCOPE_NAME = "sdkReporterScope";
        static final /* synthetic */ com.zettle.sdk.ZettleSDkReporter.Companion getHighSpeedVideoSizes = new com.zettle.sdk.ZettleSDkReporter.Companion();

        private Companion() {
        }
    }
}
