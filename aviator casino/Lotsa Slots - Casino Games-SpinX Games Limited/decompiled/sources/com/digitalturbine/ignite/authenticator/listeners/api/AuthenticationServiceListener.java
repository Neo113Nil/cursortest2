package com.digitalturbine.ignite.authenticator.listeners.api;

/* loaded from: classes2.dex */
public interface AuthenticationServiceListener {
    void onIgniteServiceAuthenticated(java.lang.String str);

    void onIgniteServiceAuthenticationFailed(java.lang.String str);

    void onIgniteServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder);

    void onIgniteServiceConnectionFailed(java.lang.String str);

    void onOdtUnsupported();
}
