package org.betup.model.remote.entity.matches.stats.lineups;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class LineupsResponseDataModel {

    @SerializedName("away")
    private List<LineupsResponsePlayerModel> away;

    @SerializedName("displayField")
    private boolean displayField;

    @SerializedName("fieldPhotoUrl")
    private String fieldPhotoUrl;

    @SerializedName("home")
    private List<LineupsResponsePlayerModel> home;

    public boolean getDisplayField() {
        return this.displayField;
    }

    public void setDisplayField(boolean displayField) {
        this.displayField = displayField;
    }

    public List<LineupsResponsePlayerModel> getHome() {
        return this.home;
    }

    public void setHome(List<LineupsResponsePlayerModel> home) {
        this.home = home;
    }

    public List<LineupsResponsePlayerModel> getAway() {
        return this.away;
    }

    public void setAway(List<LineupsResponsePlayerModel> away) {
        this.away = away;
    }

    public String getFieldPhotoUrl() {
        return this.fieldPhotoUrl;
    }

    public void setFieldPhotoUrl(String fieldPhotoUrl) {
        this.fieldPhotoUrl = fieldPhotoUrl;
    }
}
