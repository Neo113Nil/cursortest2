package org.betup.model.remote.entity;

import java.util.List;

/* loaded from: classes2.dex */
public class PageModel<T> {
    private List<T> content;
    private int numberOfElements;
    private PageOptions pageOptions;

    public String getContinuationToken() {
        PageOptions pageOptions = this.pageOptions;
        if (pageOptions != null) {
            return pageOptions.getContinuationToken();
        }
        return null;
    }

    public PageOptions getPageOptions() {
        return this.pageOptions;
    }

    public void setPageOptions(PageOptions pageOptions) {
        this.pageOptions = pageOptions;
    }

    public int getNumberOfElements() {
        return this.numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public List<T> getContent() {
        return this.content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
