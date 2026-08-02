package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
public interface SearchResponse {
    com.google.android.libraries.places.api.net.Pagination getPagination();

    java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces();

    java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries();
}
