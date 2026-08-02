package com.datadog.android.core.internal.account;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ7\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/core/internal/account/MutableAccountInfoProvider;", "Lcom/datadog/android/core/internal/account/AccountInfoProvider;", "", "", "", "extraInfo", "", "addExtraInfo", "(Ljava/util/Map;)V", "clearAccountInfo", "()V", "id", "name", "setAccountInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MutableAccountInfoProvider extends com.datadog.android.core.internal.account.AccountInfoProvider {
    void addExtraInfo(java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo);

    void clearAccountInfo();

    void setAccountInfo(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo);
}
