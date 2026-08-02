package org.betup.model.remote.entity.matches.stats.highlights;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.unified.UnifiedMediationParams;

/* loaded from: classes2.dex */
public class HighlightEvent {

    @SerializedName(UnifiedMediationParams.KEY_ICON_URL)
    private String iconUrl;

    @SerializedName("minute")
    private String minute;

    @SerializedName("subtitle")
    private String subtitle;

    @SerializedName("title")
    private String title;

    @SerializedName("whose")
    private int whose;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWhose() {
        return this.whose;
    }

    public void setWhose(int whose) {
        this.whose = whose;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMinute() {
        return this.minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
}
