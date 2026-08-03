package com.ironsource.mediationsdk.adapter;

/* loaded from: classes5.dex */
public abstract class AbstractAdUnitAdapter<AdNetworkAdapter> implements com.ironsource.mediationsdk.INetworkInitCallbackListener {
    private final AdNetworkAdapter adapter;

    public AbstractAdUnitAdapter(AdNetworkAdapter adnetworkadapter) {
        this.adapter = adnetworkadapter;
    }

    protected final java.lang.String getAdUnitIdMissingErrorString(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return "Missing params - " + key;
    }

    public final AdNetworkAdapter getAdapter() {
        return this.adapter;
    }

    protected final java.lang.String getConfigStringValueFromKey(org.json.JSONObject config, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.lang.String optString = config.optString(key);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "config.optString(key)");
        return optString;
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(java.lang.String str) {
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
    }

    public final void postBackgroundThread(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.ironsource.environment.thread.IronSourceThreadManager.postAdapterBackgroundTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void postOnUIThread(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }
}
