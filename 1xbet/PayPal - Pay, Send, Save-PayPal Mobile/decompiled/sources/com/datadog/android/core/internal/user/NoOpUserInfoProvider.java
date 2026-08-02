package com.datadog.android.core.internal.user;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/internal/user/NoOpUserInfoProvider;", "Lcom/datadog/android/core/internal/user/UserInfoProvider;", "<init>", "()V", "Lcom/datadog/android/api/context/UserInfo;", "getUserInfo", "()Lcom/datadog/android/api/context/UserInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpUserInfoProvider implements com.datadog.android.core.internal.user.UserInfoProvider {
    @Override // com.datadog.android.core.internal.user.UserInfoProvider
    public final com.datadog.android.api.context.UserInfo getUserInfo() {
        return new com.datadog.android.api.context.UserInfo(null, null, null, null, null, 31, null);
    }
}
