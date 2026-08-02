package org.betup.model.remote.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tiktok.appevents.edp.TTEDPEventConstants;

/* loaded from: classes2.dex */
public class MetaModel {

    @SerializedName(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE)
    @Expose
    private Integer code;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
