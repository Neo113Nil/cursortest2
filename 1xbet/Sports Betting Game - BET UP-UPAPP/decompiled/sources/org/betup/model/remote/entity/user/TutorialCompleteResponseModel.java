package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class TutorialCompleteResponseModel {

    @SerializedName("betcoinsCredited")
    private long betcoinsCredited;

    @SerializedName("updated")
    private boolean updated;

    public boolean isUpdated() {
        return this.updated;
    }

    public long getBetcoinsCredited() {
        return this.betcoinsCredited;
    }
}
