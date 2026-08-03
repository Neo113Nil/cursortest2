package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public enum k {
    CLOSE("close"),
    EXPAND(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e),
    USECUSTOMCLOSE("usecustomclose"),
    OPEN("open"),
    RESIZE(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g),
    GET_RESIZE_PROPERTIES("getResizeProperties"),
    SET_RESIZE_PROPERTIES("setResizeProperties"),
    SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
    PLAY_VIDEO("playVideo"),
    STORE_PICTURE("storePicture"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    CREATE_CALENDAR_EVENT("createCalendarEvent"),
    UNSPECIFIED("");

    private java.lang.String mCommand;

    k(java.lang.String str) {
        this.mCommand = str;
    }

    public static com.fyber.inneractive.sdk.mraid.k a(java.lang.String str) {
        for (com.fyber.inneractive.sdk.mraid.k kVar : values()) {
            if (kVar.mCommand.equals(str)) {
                return kVar;
            }
        }
        return UNSPECIFIED;
    }

    public final java.lang.String a() {
        return this.mCommand;
    }
}
