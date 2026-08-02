package org.betup.services.offer;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ConsentResponse {

    @SerializedName("is_request_in_eea_or_unknown")
    private boolean isEu;

    public boolean isEu() {
        return this.isEu;
    }

    public void setEu(boolean eu) {
        this.isEu = eu;
    }
}
