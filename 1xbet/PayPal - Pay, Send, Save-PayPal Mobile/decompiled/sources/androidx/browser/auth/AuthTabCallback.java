package androidx.browser.auth;

/* loaded from: classes5.dex */
public interface AuthTabCallback {
    void onExtraCallback(java.lang.String str, android.os.Bundle bundle);

    android.os.Bundle onExtraCallbackWithResult(java.lang.String str, android.os.Bundle bundle);

    void onNavigationEvent(int i, android.os.Bundle bundle);

    void onWarmupCompleted(android.os.Bundle bundle);
}
