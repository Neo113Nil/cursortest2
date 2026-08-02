package com.datadog.android.core.internal.user;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/core/internal/user/DatadogUserInfoProvider;", "Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "<init>", "()V", "", "", "", "properties", "", "addUserProperties", "(Ljava/util/Map;)V", "clearUserInfo", "Lcom/datadog/android/api/context/UserInfo;", "getUserInfo", "()Lcom/datadog/android/api/context/UserInfo;", "id", "setAnonymousId", "(Ljava/lang/String;)V", "name", "email", "extraInfo", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/context/UserInfo;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogUserInfoProvider implements com.datadog.android.core.internal.user.MutableUserInfoProvider {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile com.datadog.android.api.context.UserInfo getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.api.context.UserInfo(null, null, null, null, null, 31, null);

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void setUserInfo(java.lang.String id, java.lang.String name2, java.lang.String email, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
        this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.android.api.context.UserInfo.copy$default(this.getHighResolutionOutputSizeshNQ4ISI, null, id, name2, email, kotlin.collections.MapsKt.toMap(extraInfo), 1, null);
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void setAnonymousId(java.lang.String id) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.android.api.context.UserInfo.copy$default(this.getHighResolutionOutputSizeshNQ4ISI, id, null, null, null, null, 30, null);
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void addUserProperties(java.util.Map<java.lang.String, ? extends java.lang.Object> properties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(properties, "");
        this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.android.api.context.UserInfo.copy$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, kotlin.collections.MapsKt.plus(this.getHighResolutionOutputSizeshNQ4ISI.getAdditionalProperties(), properties), 15, null);
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void clearUserInfo() {
        this.getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.api.context.UserInfo(this.getHighResolutionOutputSizeshNQ4ISI.getAnonymousId(), null, null, null, null, 30, null);
    }

    @Override // com.datadog.android.core.internal.user.UserInfoProvider
    /* renamed from: getUserInfo, reason: from getter */
    public final com.datadog.android.api.context.UserInfo getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
