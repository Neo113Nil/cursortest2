package org.betup.model.remote.entity.search;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class Suggestion {

    @SerializedName("id")
    private long id;

    @SerializedName(FirebaseAnalytics.Param.SEARCH_TERM)
    private String searchTerm;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSearchTerm() {
        return this.searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
