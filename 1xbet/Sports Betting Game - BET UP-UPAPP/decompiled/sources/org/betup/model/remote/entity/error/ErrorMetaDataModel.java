package org.betup.model.remote.entity.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tiktok.appevents.edp.TTEDPEventConstants;

/* loaded from: classes2.dex */
public class ErrorMetaDataModel {

    @SerializedName(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE)
    @Expose
    private Integer code;

    @SerializedName("error_message")
    @Expose
    private String errorMessage;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
