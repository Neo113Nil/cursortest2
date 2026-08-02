package androidx.media3.common;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements com.google.common.util.concurrent.h, ListenerSet.Event, BreadcrumbSource {
    public final /* synthetic */ Object a;

    public /* synthetic */ n0(Object obj) {
        this.a = obj;
    }

    @Override // com.google.common.util.concurrent.h
    public com.google.common.util.concurrent.u apply(Object obj) {
        com.google.common.util.concurrent.u lambda$handleReplaceMediaItems$31;
        lambda$handleReplaceMediaItems$31 = SimpleBasePlayer.lambda$handleReplaceMediaItems$31((com.google.common.util.concurrent.u) this.a, obj);
        return lambda$handleReplaceMediaItems$31;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmKeysRemoved((AnalyticsListener.EventTime) this.a);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        ((AnalyticsDeferredProxy) this.a).lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
    }
}
