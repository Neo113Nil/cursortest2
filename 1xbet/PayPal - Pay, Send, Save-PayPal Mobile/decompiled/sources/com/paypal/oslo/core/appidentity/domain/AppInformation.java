package com.paypal.oslo.core.appidentity.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "", "", "appGuid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isFirstLaunch", "getAppName", "()Ljava/lang/String;", "appName", "getAppVersion", "appVersion", "getBuildNumber", "buildNumber", "getPackageName", com.visa.cbp.ConsumerInfo.setSignature, "getSessionID", "sessionID", "getVeniceSessionId", "veniceSessionId", "getAppGUID", "appGUID"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AppInformation {
    java.lang.Object appGuid(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.String getAppGUID();

    java.lang.String getAppName();

    java.lang.String getAppVersion();

    java.lang.String getBuildNumber();

    java.lang.String getPackageName();

    java.lang.String getSessionID();

    java.lang.String getVeniceSessionId();

    java.lang.Object isFirstLaunch(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}
