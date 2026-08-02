package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
public interface Pagination {
    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.SearchResponse> fetchNextPage();

    java.lang.Integer getPageSize();

    boolean hasNextPage();

    void setPageSize(java.lang.Integer num);
}
