package com.datadog.android.core.internal.system;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/core/internal/system/AppVersionProvider;", "", "", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "version", "", "getVersionCode", "()I", "versionCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AppVersionProvider {
    java.lang.String getVersion();

    int getVersionCode();

    void setVersion(java.lang.String str);
}
