package com.kurenai7968.volume_controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.bumptech.glide.load.engine.q;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends BroadcastReceiver {
    public final EventChannel.EventSink a;
    public final AudioManager b;

    public a(EventChannel.EventSink eventSink, AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.a = eventSink;
        this.b = audioManager;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        EventChannel.EventSink eventSink = this.a;
        if (eventSink != null) {
            eventSink.success(Double.valueOf(q.a(this.b)));
        }
    }
}
