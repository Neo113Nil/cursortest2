package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MatchDetailsMetaModel {

    @SerializedName(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE)
    @Expose
    private Integer code;

    @SerializedName("flush")
    @Expose
    private List<Object> flush = new ArrayList();

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Object> getFlush() {
        return this.flush;
    }

    public void setFlush(List<Object> flush) {
        this.flush = flush;
    }
}
