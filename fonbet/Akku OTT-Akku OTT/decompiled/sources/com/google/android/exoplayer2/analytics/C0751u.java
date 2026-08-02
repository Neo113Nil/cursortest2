package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import kotlin.jvm.functions.Function1;

/* renamed from: com.google.android.exoplayer2.analytics.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0751u implements ListenerSet.Event, OnCompleteListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0751u(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.a, (Player.Commands) this.b);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAnalyticsPlugin.setUserProperty$lambda$0((FlutterFirebaseAnalyticsPlugin) this.a, (Function1) this.b, task);
    }
}
