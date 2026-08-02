package com.datadog.android.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/core/internal/NoOpContextProvider;", "Lcom/datadog/android/core/internal/ContextProvider;", "<init>", "()V", "", "", "withFeatureContexts", "Lcom/datadog/android/api/context/DatadogContext;", "getContext", "(Ljava/util/Set;)Lcom/datadog/android/api/context/DatadogContext;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpContextProvider implements com.datadog.android.core.internal.ContextProvider {
    @Override // com.datadog.android.core.internal.ContextProvider
    public final com.datadog.android.api.context.DatadogContext getContext(java.util.Set<java.lang.String> withFeatureContexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withFeatureContexts, "");
        return new com.datadog.android.api.context.DatadogContext(com.datadog.android.DatadogSite.US1, "", "", "", "", 0, "", "", "", com.datadog.android.api.context.TimeInfo.INSTANCE.getEMPTY$dd_sdk_android_core_release(), new com.datadog.android.api.context.ProcessInfo(true), new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null), new com.datadog.android.api.context.DeviceInfo("", "", "", com.datadog.android.api.context.DeviceType.OTHER, "", "", "", "", "", null, new com.datadog.android.api.context.LocaleInfo(kotlin.collections.CollectionsKt.emptyList(), "", ""), 0, null, null), new com.datadog.android.api.context.UserInfo(null, null, null, null, kotlin.collections.MapsKt.emptyMap()), null, com.datadog.android.privacy.TrackingConsent.NOT_GRANTED, null, kotlin.collections.MapsKt.emptyMap());
    }
}
