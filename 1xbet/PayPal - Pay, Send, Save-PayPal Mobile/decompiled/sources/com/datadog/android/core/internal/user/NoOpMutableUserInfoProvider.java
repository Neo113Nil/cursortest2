package com.datadog.android.core.internal.user;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/core/internal/user/NoOpMutableUserInfoProvider;", "Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "<init>", "()V", "", "", "", "properties", "", "addUserProperties", "(Ljava/util/Map;)V", "clearUserInfo", "Lcom/datadog/android/api/context/UserInfo;", "getUserInfo", "()Lcom/datadog/android/api/context/UserInfo;", "id", "setAnonymousId", "(Ljava/lang/String;)V", "name", "email", "extraInfo", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpMutableUserInfoProvider implements com.datadog.android.core.internal.user.MutableUserInfoProvider {
    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void clearUserInfo() {
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void setAnonymousId(java.lang.String id) {
    }

    @Override // com.datadog.android.core.internal.user.UserInfoProvider
    public final com.datadog.android.api.context.UserInfo getUserInfo() {
        return new com.datadog.android.api.context.UserInfo(null, null, null, null, null, 31, null);
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void setUserInfo(java.lang.String id, java.lang.String name2, java.lang.String email, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void addUserProperties(java.util.Map<java.lang.String, ? extends java.lang.Object> properties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(properties, "");
    }
}
