package com.startapp.sdk.ads.video;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3044a;

    public a(c cVar) {
        this.f3044a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f3044a;
        if (cVar.L == null) {
            return;
        }
        ProgressBar progressBar = cVar.f3051P;
        if (progressBar != null && progressBar.isShown()) {
            cVar.I();
        }
        cVar.a(VideoMode$VideoFinishedReason.SKIPPED);
        ActionTrackingLink[] p3 = cVar.x().getVideoTrackingDetails().p();
        cVar.a(cVar.f3067g0, new VideoTrackingParams(cVar.a(cVar.f3067g0), cVar.f4585A, cVar.f4435n, cVar.f3069i0), "skipped", p3);
    }
}
