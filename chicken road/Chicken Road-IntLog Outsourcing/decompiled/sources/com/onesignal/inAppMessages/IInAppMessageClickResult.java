package com.onesignal.inAppMessages;

/* loaded from: classes.dex */
public interface IInAppMessageClickResult {
    String getActionId();

    boolean getClosingMessage();

    String getUrl();

    InAppMessageActionUrlType getUrlTarget();
}
