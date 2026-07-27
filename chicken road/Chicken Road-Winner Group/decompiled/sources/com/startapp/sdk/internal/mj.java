package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* loaded from: classes.dex */
public final class mj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoListener f4068a;

    public mj(VideoListener videoListener, Context context) {
        this.f4068a = videoListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4068a.onVideoCompleted();
        } catch (Throwable th) {
            si.a((Object) this.f4068a, th);
        }
    }
}
