package org.betup.model.remote.entity.matches.stats.h2h;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.unified.UnifiedMediationParams;

/* loaded from: classes2.dex */
public class StatModel {

    @SerializedName(UnifiedMediationParams.KEY_ICON_URL)
    private String iconUrl;

    @SerializedName("value")
    private String value;

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
