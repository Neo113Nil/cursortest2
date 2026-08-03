package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public enum x {
    EVENT_FINAL_RETURN("finalReturn"),
    EVENT_IMPRESSION("impression"),
    EVENT_START("start"),
    EVENT_FIRSTQ("firstQuartile"),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ("thirdQuartile"),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE("mute"),
    EVENT_UNMUTE("unmute"),
    EVENT_PAUSE("pause"),
    EVENT_RESUME("resume"),
    EVENT_FULLSCREEN(com.vungle.ads.internal.Constants.TEMPLATE_TYPE_FULLSCREEN),
    EVENT_EXIT_FULLSCREEN("exitFullscreen"),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK(com.ironsource.Y3.d),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_VERIFICATION_NOT_EXECUTED("verificationNotExecuted"),
    EVENT_EXPAND(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    EVENT_PROGRESS(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS),
    EVENT_SKIP("skip"),
    UNKNOWN("UnkownEvent");

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.model.vast.x> sEventsMap = new java.util.HashMap();
    private final java.lang.String mKey;

    static {
        for (com.fyber.inneractive.sdk.model.vast.x xVar : values()) {
            sEventsMap.put(xVar.mKey, xVar);
        }
    }

    x(java.lang.String str) {
        this.mKey = str;
    }

    public final java.lang.String a() {
        return this.mKey;
    }

    public static com.fyber.inneractive.sdk.model.vast.x a(java.lang.String str) {
        java.util.Map<java.lang.String, com.fyber.inneractive.sdk.model.vast.x> map = sEventsMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
