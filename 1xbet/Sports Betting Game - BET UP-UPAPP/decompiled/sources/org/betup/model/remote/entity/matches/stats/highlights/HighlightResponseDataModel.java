package org.betup.model.remote.entity.matches.stats.highlights;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class HighlightResponseDataModel {

    @SerializedName("highlights")
    private List<HighlightGroup> groups = new ArrayList();

    public List<HighlightGroup> getGroups() {
        return this.groups;
    }

    public void setGroups(List<HighlightGroup> groups) {
        this.groups = groups;
    }
}
