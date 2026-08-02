package org.betup.model.remote.entity.matches.stats.highlights;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class HighlightGroup {

    @SerializedName("events")
    private List<HighlightEvent> events;

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<HighlightEvent> getEvents() {
        return this.events;
    }

    public void setEvents(List<HighlightEvent> events) {
        this.events = events;
    }
}
