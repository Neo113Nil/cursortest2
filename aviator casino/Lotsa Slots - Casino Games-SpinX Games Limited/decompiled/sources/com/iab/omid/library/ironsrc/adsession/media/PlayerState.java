package com.iab.omid.library.ironsrc.adsession.media;

/* loaded from: classes5.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(com.adjust.sdk.Constants.NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN(com.vungle.ads.internal.Constants.TEMPLATE_TYPE_FULLSCREEN);

    private final java.lang.String playerState;

    PlayerState(java.lang.String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.playerState;
    }
}
