package io.appmetrica.analytics.flutter.impl;

/* loaded from: classes.dex */
public class InitialDeepLinkHolderImpl implements io.appmetrica.analytics.flutter.pigeon.Pigeon.InitialDeepLinkHolderPigeon {
    public android.app.Activity activity = null;

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.InitialDeepLinkHolderPigeon
    public java.lang.String getInitialDeeplink() {
        android.content.Intent intent;
        android.app.Activity activity = this.activity;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getDataString();
    }
}
