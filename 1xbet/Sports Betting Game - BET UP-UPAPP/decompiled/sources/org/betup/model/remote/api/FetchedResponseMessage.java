package org.betup.model.remote.api;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class FetchedResponseMessage<T, S> {
    private Bundle args;
    private S id;
    private T model;
    private FetchStat stat;

    public FetchedResponseMessage(T model, FetchStat stat, S id, Bundle args) {
        this.model = model;
        this.stat = stat;
        this.id = id;
        this.args = args;
    }

    public Bundle getArgs() {
        return this.args;
    }

    public T getModel() {
        return this.model;
    }

    public FetchStat getStat() {
        return this.stat;
    }

    public S getId() {
        return this.id;
    }
}
