package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsClient;", "", "", "Lorg/json/JSONObject;", "events", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", com.sun.jna.Callback.METHOD_NAME, "", "request", "(Ljava/util/List;Lcom/zettle/sdk/commons/network/NetworkClient$Callback;)V", "", "getMaxBatchSize", "()I", "maxBatchSize", "", "getTag", "()Ljava/lang/String;", "tag"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AnalyticsClient {
    int getMaxBatchSize();

    java.lang.String getTag();

    void request(java.util.List<? extends org.json.JSONObject> events, com.zettle.sdk.commons.network.NetworkClient.Callback callback);
}
