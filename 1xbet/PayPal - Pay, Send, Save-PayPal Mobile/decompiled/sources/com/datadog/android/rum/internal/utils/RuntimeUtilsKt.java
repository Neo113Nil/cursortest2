package com.datadog.android.rum.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/api/context/UserInfo;", "", "hasUserData", "(Lcom/datadog/android/api/context/UserInfo;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RuntimeUtilsKt {
    public static final boolean hasUserData(com.datadog.android.api.context.UserInfo userInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfo, "");
        return (userInfo.getId() == null && userInfo.getAnonymousId() == null && userInfo.getName() == null && userInfo.getEmail() == null && userInfo.getAdditionalProperties().isEmpty()) ? false : true;
    }
}
