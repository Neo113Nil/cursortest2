package org.betup.model.remote.api.rest.base;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class Request<S> {
    private int hash;
    private S id;
    private Bundle parameters;

    public Request() {
    }

    public Request(S id, Bundle parameters, int hash) {
        this.id = id;
        this.parameters = parameters;
        this.hash = hash;
    }

    public S getId() {
        return this.id;
    }

    public void setId(S id) {
        this.id = id;
    }

    public Bundle getParameters() {
        return this.parameters;
    }

    public void setParameters(Bundle parameters) {
        this.parameters = parameters;
    }

    public int getHash() {
        return this.hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }
}
