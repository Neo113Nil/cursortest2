package com.google.android.exoplayer2.drm;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.x;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((OfflineLicenseHelper) this.b).lambda$acquireFirstSessionOnHandlerThread$3((DrmSession) this.c, (x) this.d);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.handleSetConsent$lambda$0((Map) this.b, (FlutterFirebaseAnalyticsPlugin) this.c, (TaskCompletionSource) this.d);
                break;
        }
    }
}
