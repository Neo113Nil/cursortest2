package com.google.firebase.events;

/* loaded from: classes3.dex */
public interface Subscriber {
    <T> void subscribe(java.lang.Class<T> cls, com.google.firebase.events.EventHandler<? super T> eventHandler);

    <T> void subscribe(java.lang.Class<T> cls, java.util.concurrent.Executor executor, com.google.firebase.events.EventHandler<? super T> eventHandler);

    <T> void unsubscribe(java.lang.Class<T> cls, com.google.firebase.events.EventHandler<? super T> eventHandler);
}
