package org.betup.model.remote.entity.messaging;

/* loaded from: classes2.dex */
public class PagedResponseModel<T> {
    private T content;

    public PagedResponseModel() {
    }

    public PagedResponseModel(T content) {
        this.content = content;
    }

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
