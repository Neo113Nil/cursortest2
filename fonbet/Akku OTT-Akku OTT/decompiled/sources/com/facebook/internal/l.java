package com.facebook.internal;

import android.content.Context;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(Context context, String str, String str2) {
        this.b = str;
        this.d = context;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String applicationId = (String) this.b;
                Context context = (Context) this.d;
                String gateKeepersKey = (String) this.c;
                Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
                m mVar = m.a;
                JSONObject a = m.a();
                if (a.length() != 0) {
                    m.e(applicationId, a);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, a.toString()).apply();
                    m.e = Long.valueOf(System.currentTimeMillis());
                }
                m.f();
                m.b.set(false);
                break;
            default:
                ((ServerSideAdInsertionMediaSource) this.b).lambda$setAdPlaybackStates$0((com.google.common.collect.I) this.c, (Timeline) this.d);
                break;
        }
    }

    public /* synthetic */ l(ServerSideAdInsertionMediaSource serverSideAdInsertionMediaSource, com.google.common.collect.I i, Timeline timeline) {
        this.b = serverSideAdInsertionMediaSource;
        this.c = i;
        this.d = timeline;
    }
}
