package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
public enum AuthenticatedState {
    AMBIGUOUS("ambiguous"),
    AUTHENTICATED("authenticated"),
    LOGGED_OUT("loggedOut");

    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    AuthenticatedState(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public final java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static com.adobe.marketing.mobile.edge.identity.AuthenticatedState fromString(java.lang.String str) {
        com.adobe.marketing.mobile.edge.identity.AuthenticatedState authenticatedState = AUTHENTICATED;
        if (authenticatedState.getName().equalsIgnoreCase(str)) {
            return authenticatedState;
        }
        com.adobe.marketing.mobile.edge.identity.AuthenticatedState authenticatedState2 = LOGGED_OUT;
        return authenticatedState2.getName().equalsIgnoreCase(str) ? authenticatedState2 : AMBIGUOUS;
    }
}
