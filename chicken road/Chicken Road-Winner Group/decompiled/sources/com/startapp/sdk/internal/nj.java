package com.startapp.sdk.internal;

import android.view.View;
import android.widget.VideoView;

/* loaded from: classes.dex */
public final class nj implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4116a;

    public nj(com.startapp.sdk.ads.video.c cVar) {
        this.f4116a = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        VideoView videoView;
        com.startapp.sdk.ads.video.c cVar = this.f4116a;
        cVar.f3055T = true;
        if (cVar.f3054S && cVar.C()) {
            com.startapp.sdk.ads.video.c cVar2 = this.f4116a;
            if (!cVar2.f3062a0 || (videoView = cVar2.f3048M) == null) {
                return;
            }
            cVar2.a(videoView);
        }
    }
}
