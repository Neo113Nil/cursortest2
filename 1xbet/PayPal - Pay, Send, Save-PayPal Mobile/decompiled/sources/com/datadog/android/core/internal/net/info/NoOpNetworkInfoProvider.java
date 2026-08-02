package com.datadog.android.core.internal.net.info;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/datadog/android/core/internal/net/info/NoOpNetworkInfoProvider;", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "<init>", "()V", "Lcom/datadog/android/api/context/NetworkInfo;", "getLatestNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "Landroid/content/Context;", "context", "", "register", "(Landroid/content/Context;)V", "unregister"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpNetworkInfoProvider implements com.datadog.android.core.internal.net.info.NetworkInfoProvider {
    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final com.datadog.android.api.context.NetworkInfo getLatestNetworkInfo() {
        return new com.datadog.android.api.context.NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void unregister(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void register(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
