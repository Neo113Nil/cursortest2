package org.betup.model.remote.entity.challenge;

/* loaded from: classes2.dex */
public enum ChallengeCategory {
    ALL("all"),
    PUBLIC("public"),
    INVITES("invites"),
    WON("won"),
    LOST("lost"),
    PENDING("pending"),
    REJECTED("rejected"),
    CANCELED("return");

    private String paramValue;

    ChallengeCategory(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamValue() {
        return this.paramValue;
    }
}
