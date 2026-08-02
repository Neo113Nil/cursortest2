package org.betup.model.remote.entity.challenge;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.unified.UnifiedMediationParams;

/* loaded from: classes2.dex */
public class ChallengeTourInfo {

    @SerializedName(UnifiedMediationParams.KEY_ICON_URL)
    private String iconUrl;

    @SerializedName("subtitle")
    private String subtitle;

    @SerializedName("title")
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
