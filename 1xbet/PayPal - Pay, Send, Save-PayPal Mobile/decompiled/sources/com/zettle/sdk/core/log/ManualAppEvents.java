package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/log/ManualAppEvents;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ManualAppEvents {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.log.ManualAppEvents.Companion INSTANCE = com.zettle.sdk.core.log.ManualAppEvents.Companion.Camera2StreamConfigurationMap;

    void start();

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/log/ManualAppEvents$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "userConfig", "Lcom/zettle/sdk/core/log/HealthMonitor;", "healthMonitor", "Lcom/zettle/sdk/core/log/ManualAppEvents;", "create", "(Landroid/content/Context;Lcom/zettle/sdk/commons/state/State;Lcom/zettle/sdk/core/log/HealthMonitor;)Lcom/zettle/sdk/core/log/ManualAppEvents;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.log.ManualAppEvents.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.core.log.ManualAppEvents.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.core.log.ManualAppEvents create(android.content.Context context, com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> userConfig, com.zettle.sdk.core.log.HealthMonitor healthMonitor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthMonitor, "");
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("iZettle-SDK-Manual-App-Events", 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
            return new com.zettle.sdk.core.log.ManualAppEventsImpl(userConfig, healthMonitor, new com.zettle.sdk.core.log.ManualAppEventsRepositoryImpl(sharedPreferences), null, null, 24, null);
        }
    }
}
