package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\u001a\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/analytics/EventStorage;", "", "", "Lcom/zettle/sdk/analytics/Path;", "path", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;)V", "tag", "Lorg/json/JSONObject;", "json", "", "limit", "", "put", "(Ljava/lang/String;Lorg/json/JSONObject;I)Z", "Lkotlin/Pair;", "", "query", "(Ljava/lang/String;)Lkotlin/Pair;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface EventStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.analytics.EventStorage.Companion INSTANCE = com.zettle.sdk.analytics.EventStorage.Companion.Camera2StreamConfigurationMap;

    void delete(java.lang.String path);

    boolean put(java.lang.String tag, org.json.JSONObject json, int limit);

    kotlin.Pair<java.lang.String, java.util.List<org.json.JSONObject>> query(java.lang.String tag);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/EventStorage$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/analytics/EventStorage;", "create", "(Landroid/content/Context;)Lcom/zettle/sdk/analytics/EventStorage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.analytics.EventStorage.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.analytics.EventStorage.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.analytics.EventStorage create(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.zettle.sdk.analytics.EventStorageImpl(new java.io.File(context.getFilesDir(), "/events"), com.zettle.sdk.meta.Platform.INSTANCE.getClock());
        }
    }
}
