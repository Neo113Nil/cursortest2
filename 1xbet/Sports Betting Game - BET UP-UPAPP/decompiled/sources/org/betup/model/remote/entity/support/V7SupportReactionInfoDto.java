package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.unified.UnifiedMediationParams;

/* loaded from: classes2.dex */
public class V7SupportReactionInfoDto {

    @SerializedName(UnifiedMediationParams.KEY_ICON_URL)
    private String iconUrl;

    @SerializedName("id")
    private Long id;

    @SerializedName("name")
    private String name;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
