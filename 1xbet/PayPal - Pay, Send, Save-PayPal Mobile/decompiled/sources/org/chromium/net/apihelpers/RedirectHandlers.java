package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public class RedirectHandlers {
    static /* synthetic */ boolean Camera2StreamConfigurationMap() throws java.lang.Exception {
        return false;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor() throws java.lang.Exception {
        return true;
    }

    public static org.chromium.net.apihelpers.RedirectHandler neverFollow() {
        return new org.chromium.net.apihelpers.RedirectHandler() { // from class: org.chromium.net.apihelpers.RedirectHandlers$$ExternalSyntheticLambda0
            @Override // org.chromium.net.apihelpers.RedirectHandler
            public final boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
                return org.chromium.net.apihelpers.RedirectHandlers.Camera2StreamConfigurationMap();
            }
        };
    }

    public static org.chromium.net.apihelpers.RedirectHandler alwaysFollow() {
        return new org.chromium.net.apihelpers.RedirectHandler() { // from class: org.chromium.net.apihelpers.RedirectHandlers$$ExternalSyntheticLambda1
            @Override // org.chromium.net.apihelpers.RedirectHandler
            public final boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
                return org.chromium.net.apihelpers.RedirectHandlers.getHighSpeedVideoFpsRangesFor();
            }
        };
    }

    private RedirectHandlers() {
    }
}
