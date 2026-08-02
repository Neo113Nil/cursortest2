package org.betup.model.remote.entity.user.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.SentryBaseEvent;

/* loaded from: classes2.dex */
public class UserDetailsResponseModel {

    @SerializedName(SentryBaseEvent.JsonKeys.USER)
    @Expose
    private UserDetailsDataModel user;

    public UserDetailsDataModel getUser() {
        return this.user;
    }

    public void setUser(UserDetailsDataModel user) {
        this.user = user;
    }
}
