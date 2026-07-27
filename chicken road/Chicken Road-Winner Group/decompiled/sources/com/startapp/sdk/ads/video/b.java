package com.startapp.sdk.ads.video;

import com.startapp.sdk.internal.pd;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3045a;

    public b(c cVar) {
        this.f3045a = cVar;
    }

    public final void a() {
        c cVar = this.f3045a;
        if (!cVar.f0) {
            cVar.a(VideoMode$VideoFinishedReason.COMPLETE);
        }
        pd pdVar = this.f3045a.L;
        if (pdVar != null) {
            pdVar.f4214h.stopPlayback();
        }
    }
}
