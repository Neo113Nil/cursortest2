package com.vungle.ads.internal.ui.view;

import android.app.Activity;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class l extends com.vungle.ads.internal.util.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12172a;

    public l(m mVar) {
        this.f12172a = mVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a(Activity activity) {
        WeakReference weakReference;
        Intrinsics.checkNotNullParameter(activity, "activity");
        weakReference = this.f12172a.f;
        if (Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            boolean z = u.f12190a;
            t.a("NativeAd-VideoContentView", "onActivityPaused and pause video");
            d videoView = this.f12172a.getVideoView();
            if (videoView != null) {
                videoView.h();
            }
        }
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b(Activity activity) {
        WeakReference weakReference;
        Intrinsics.checkNotNullParameter(activity, "activity");
        weakReference = this.f12172a.f;
        if (Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            boolean z = u.f12190a;
            t.a("NativeAd-VideoContentView", "onActivityResumed and try to play video");
            d videoView = this.f12172a.getVideoView();
            if (videoView != null) {
                videoView.j();
            }
        }
    }
}
