package com.datadog.android.core.internal.system;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/core/internal/system/NoOpAppVersionProvider;", "Lcom/datadog/android/core/internal/system/AppVersionProvider;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "getVersion$annotations", "version", "", "getVersionCode", "()I", "versionCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpAppVersionProvider implements com.datadog.android.core.internal.system.AppVersionProvider {
    public static /* synthetic */ void getVersion$annotations() {
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public final int getVersionCode() {
        return 0;
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public final java.lang.String getVersion() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public final void setVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
