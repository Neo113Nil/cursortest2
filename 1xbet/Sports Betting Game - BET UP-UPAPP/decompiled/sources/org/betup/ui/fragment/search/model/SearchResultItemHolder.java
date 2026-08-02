package org.betup.ui.fragment.search.model;

/* loaded from: classes4.dex */
public class SearchResultItemHolder<T> implements SearchItemHolder {
    private T content;
    private SearchResultItemType type;

    public SearchResultItemHolder() {
    }

    public SearchResultItemHolder(T content, SearchResultItemType type) {
        this.content = content;
        this.type = type;
    }

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override // org.betup.ui.fragment.search.model.SearchItemHolder
    public SearchResultItemType getType() {
        return this.type;
    }

    public void setType(SearchResultItemType type) {
        this.type = type;
    }
}
