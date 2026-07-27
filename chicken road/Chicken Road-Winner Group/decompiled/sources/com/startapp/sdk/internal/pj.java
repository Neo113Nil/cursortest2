package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* loaded from: classes.dex */
public final class pj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4229a;

    public pj(com.startapp.sdk.ads.video.c cVar) {
        this.f4229a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = this.f4229a.f3051P;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            this.f4229a.f3070j0.postDelayed(new oj(this), AdsCommonMetaData.k().F().d());
        } catch (Throwable th) {
            this.f4229a.I();
            d9.a(th);
        }
    }
}
