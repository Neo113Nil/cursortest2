package org.betup.ui.splash.init;

/* loaded from: classes4.dex */
public interface InitializationListener {
    void initForceUpdate();

    void initInetError();

    void initPlayServicesError();

    void initSuccess(boolean isAuthenticated, boolean requestedConfirmation);
}
