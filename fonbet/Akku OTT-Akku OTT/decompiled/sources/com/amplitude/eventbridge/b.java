package com.amplitude.eventbridge;

import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEventBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventBridge.kt\ncom/amplitude/eventbridge/EventBridgeChannel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 EventBridge.kt\ncom/amplitude/eventbridge/EventBridgeChannel\n*L\n95#1:101,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    public static final a Companion = new a();
    public final e a;
    public final Object b;
    public final ArrayBlockingQueue<com.amplitude.eventbridge.a> c;

    public static final class a {
    }

    public b(e channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.a = channel;
        this.b = new Object();
        this.c = new ArrayBlockingQueue<>(512);
    }
}
