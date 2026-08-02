package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaSourceEventListener.EventDispatcher) this.b).lambda$loadCanceled$2((MediaSourceEventListener) this.c, (LoadEventInfo) this.d, (MediaLoadData) this.e);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.handleSetUserProperty$lambda$0((FlutterFirebaseAnalyticsPlugin) this.b, (String) this.c, (String) this.d, (TaskCompletionSource) this.e);
                break;
        }
    }
}
