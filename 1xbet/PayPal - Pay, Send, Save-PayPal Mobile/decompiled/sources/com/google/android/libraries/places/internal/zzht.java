package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzht {
    ROUTING_SUMMARIES,
    NEXT_PAGE_TOKEN,
    SEARCH_URI;

    @Override // java.lang.Enum
    public final /* synthetic */ java.lang.String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? super.toString() : "searchUri" : "nextPageToken" : "routing_summaries";
    }
}
