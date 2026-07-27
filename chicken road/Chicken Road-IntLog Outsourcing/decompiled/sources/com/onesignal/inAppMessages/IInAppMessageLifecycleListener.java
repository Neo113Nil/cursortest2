package com.onesignal.inAppMessages;

/* loaded from: classes.dex */
public interface IInAppMessageLifecycleListener {
    void onDidDismiss(IInAppMessageDidDismissEvent iInAppMessageDidDismissEvent);

    void onDidDisplay(IInAppMessageDidDisplayEvent iInAppMessageDidDisplayEvent);

    void onWillDismiss(IInAppMessageWillDismissEvent iInAppMessageWillDismissEvent);

    void onWillDisplay(IInAppMessageWillDisplayEvent iInAppMessageWillDisplayEvent);
}
