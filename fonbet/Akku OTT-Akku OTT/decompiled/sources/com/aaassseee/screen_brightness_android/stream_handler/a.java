package com.aaassseee.screen_brightness_android.stream_handler;

import io.flutter.plugin.common.EventChannel;

/* loaded from: classes3.dex */
public class a implements EventChannel.StreamHandler {
    public EventChannel.EventSink a;

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.a = null;
    }
}
