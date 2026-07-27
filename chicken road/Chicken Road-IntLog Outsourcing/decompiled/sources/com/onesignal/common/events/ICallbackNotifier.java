package com.onesignal.common.events;

/* loaded from: classes.dex */
public interface ICallbackNotifier<THandler> {
    boolean getHasCallback();

    void set(THandler thandler);
}
