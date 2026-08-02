package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.media3.exoplayer.analytics.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0358h implements ListenerSet.Event, OnCompleteListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0358h(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.a, (Player.Commands) this.b);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAnalyticsPlugin.setUserId$lambda$0((FlutterFirebaseAnalyticsPlugin) this.a, (Function1) this.b, task);
    }
}
