package com.kurenai7968.volume_controller;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bumptech.glide.load.engine.q;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements EventChannel.StreamHandler {
    public final Context a;
    public final AudioManager b;
    public a c;

    public c(Context context, AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.a = context;
        this.b = audioManager;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        a aVar = this.c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("volumeBroadcastReceiver");
            aVar = null;
        }
        this.a.unregisterReceiver(aVar);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("fetchInitialVolume") : null;
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        AudioManager audioManager = this.b;
        a aVar = new a(eventSink, audioManager);
        this.c = aVar;
        this.a.registerReceiver(aVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        if (!booleanValue || eventSink == null) {
            return;
        }
        eventSink.success(Double.valueOf(q.a(audioManager)));
    }
}
