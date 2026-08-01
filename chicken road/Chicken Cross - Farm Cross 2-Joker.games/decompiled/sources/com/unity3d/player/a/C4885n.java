package com.unity3d.player.a;

import android.graphics.SurfaceTexture;
import com.unity3d.player.Camera2Wrapper;

/* renamed from: com.unity3d.player.a.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4885n implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4887p f11770a;

    public C4885n(C4887p c4887p) {
        this.f11770a = c4887p;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.f11770a.f11772a).a(surfaceTexture);
    }
}
