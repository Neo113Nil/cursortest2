package org.betup.model.remote.api;

/* loaded from: classes2.dex */
public class FetchedResponse<T> {
    private long lifeTime;
    private T model;
    private long timestamp = System.currentTimeMillis();

    public FetchedResponse(T model, long lifeTime) {
        this.model = model;
        this.lifeTime = lifeTime;
    }

    public T getModel() {
        return this.model;
    }

    public boolean isValid() {
        return System.currentTimeMillis() - this.timestamp <= this.lifeTime;
    }
}
