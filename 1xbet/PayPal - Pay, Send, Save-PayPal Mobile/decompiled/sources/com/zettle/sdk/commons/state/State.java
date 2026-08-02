package com.zettle.sdk.commons.state;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u000b\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/commons/state/State;", "T", "", "Lcom/zettle/sdk/commons/state/StateObserver;", "observer", "", "addObserver", "(Lcom/zettle/sdk/commons/state/StateObserver;)V", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "(Lcom/zettle/sdk/commons/state/StateObserver;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "removeObserver"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface State<T> {
    void addObserver(com.zettle.sdk.commons.state.StateObserver<T> observer);

    void addObserver(com.zettle.sdk.commons.state.StateObserver<T> observer, com.zettle.sdk.commons.thread.EventsLoop eventsLoop);

    void removeObserver(com.zettle.sdk.commons.state.StateObserver<T> observer);
}
