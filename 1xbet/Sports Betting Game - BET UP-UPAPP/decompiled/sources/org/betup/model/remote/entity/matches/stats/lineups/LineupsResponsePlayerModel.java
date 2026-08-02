package org.betup.model.remote.entity.matches.stats.lineups;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.List;
import org.betup.model.remote.entity.matches.stats.highlights.HighlightEvent;

/* loaded from: classes2.dex */
public class LineupsResponsePlayerModel {

    @SerializedName("events")
    private List<HighlightEvent> events;

    @SerializedName(UnifiedMediationParams.KEY_ICON_URL)
    private String iconUrl;

    @SerializedName("line")
    private int line;

    @SerializedName("name")
    private String name;

    @SerializedName("number")
    private int number;

    @SerializedName("photoUrl")
    private String photoUrl;

    @SerializedName("position")
    private int position;

    @SerializedName("short_Name")
    private String shortName;

    @SerializedName("type")
    private int type;

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public LineupState getLineupState() {
        return LineupState.fromInt(this.type);
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getLine() {
        return this.line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<HighlightEvent> getEvents() {
        return this.events;
    }

    public void setEvents(List<HighlightEvent> events) {
        this.events = events;
    }
}
