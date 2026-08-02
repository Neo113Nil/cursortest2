package org.betup.model.remote.entity.user.homescreen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* loaded from: classes2.dex */
public class Slide {

    @SerializedName("type")
    @Expose
    private Action action;

    @SerializedName("id")
    @Expose
    private long id;

    @SerializedName("info_json")
    @Expose
    Map<String, String> infoJson;

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    @SerializedName("show_label")
    @Expose
    private boolean showLabel;

    @SerializedName("created_at")
    @Expose
    private String startDate;

    public enum Action {
        OPEN_MATCH,
        OPEN_TOTO,
        OPEN_LEAGUE,
        OPEN_TOUR,
        OPEN_SETTINGS,
        NONE,
        OPEN_SHOP,
        OPEN_PURCHASE
    }

    public Slide() {
    }

    public Slide(long id, String photoUrl, Action action) {
        this.id = id;
        this.photoUrl = photoUrl;
        this.action = action;
    }

    public Map<String, String> getInfoJson() {
        return this.infoJson;
    }

    public void setInfoJson(Map<String, String> infoJson) {
        this.infoJson = infoJson;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public boolean isShowLabel() {
        return this.showLabel;
    }

    public void setShowLabel(boolean showLabel) {
        this.showLabel = showLabel;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Action getAction() {
        return this.action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
