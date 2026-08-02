package com.datadog.android.core.internal.user;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\f\u0010\rJA\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "Lcom/datadog/android/core/internal/user/UserInfoProvider;", "", "", "", "properties", "", "addUserProperties", "(Ljava/util/Map;)V", "clearUserInfo", "()V", "id", "setAnonymousId", "(Ljava/lang/String;)V", "name", "email", "extraInfo", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MutableUserInfoProvider extends com.datadog.android.core.internal.user.UserInfoProvider {
    void addUserProperties(java.util.Map<java.lang.String, ? extends java.lang.Object> properties);

    void clearUserInfo();

    void setAnonymousId(java.lang.String id);

    void setUserInfo(java.lang.String id, java.lang.String name2, java.lang.String email, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo);
}
