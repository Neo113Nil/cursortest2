package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public enum m {
    BANNER_WIDTH(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE),
    BANNER_HEIGHT(50),
    BANNER_TABLET_HEIGHT(90),
    BANNER_TABLET_WIDTH(728),
    RECTANGLE_HEIGHT(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION),
    RECTANGLE_WIDTH(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis);

    final int value;

    m(int i) {
        this.value = i;
    }
}
