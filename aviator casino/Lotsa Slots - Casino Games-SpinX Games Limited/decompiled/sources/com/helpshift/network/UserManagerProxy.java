package com.helpshift.network;

/* loaded from: classes2.dex */
public interface UserManagerProxy {
    com.helpshift.network.HSRequest getRequestBodyForRotatingToken(java.lang.String str);

    void logoutUserForNetworkException(com.helpshift.network.exception.HSRootApiException.ExceptionType exceptionType);

    void updateNewTokensInStorage(java.lang.String str, java.lang.String str2, long j);
}
