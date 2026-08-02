package com.datadog.android.core.internal.account;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/core/internal/account/NoOpMutableAccountInfoProvider;", "Lcom/datadog/android/core/internal/account/MutableAccountInfoProvider;", "<init>", "()V", "", "", "", "extraInfo", "", "addExtraInfo", "(Ljava/util/Map;)V", "clearAccountInfo", "Lcom/datadog/android/api/context/AccountInfo;", "getAccountInfo", "()Lcom/datadog/android/api/context/AccountInfo;", "id", "name", "setAccountInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpMutableAccountInfoProvider implements com.datadog.android.core.internal.account.MutableAccountInfoProvider {
    @Override // com.datadog.android.core.internal.account.MutableAccountInfoProvider
    public final void clearAccountInfo() {
    }

    @Override // com.datadog.android.core.internal.account.AccountInfoProvider
    public final com.datadog.android.api.context.AccountInfo getAccountInfo() {
        return null;
    }

    @Override // com.datadog.android.core.internal.account.MutableAccountInfoProvider
    public final void setAccountInfo(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
    }

    @Override // com.datadog.android.core.internal.account.MutableAccountInfoProvider
    public final void addExtraInfo(java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
    }
}
