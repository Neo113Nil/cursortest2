package com.onesignal.common.events;

/* loaded from: classes.dex */
public interface IEventNotifier<THandler> {
    boolean getHasSubscribers();

    void subscribe(THandler thandler);

    void unsubscribe(THandler thandler);
}
