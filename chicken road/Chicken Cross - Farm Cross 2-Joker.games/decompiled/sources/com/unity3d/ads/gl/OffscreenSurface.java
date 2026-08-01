package com.unity3d.ads.gl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OffscreenSurface.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/gl/OffscreenSurface;", "Lcom/unity3d/ads/gl/EglSurfaceBase;", "eglCore", "Lcom/unity3d/ads/gl/EglCore;", "width", "", "height", "<init>", "(Lcom/unity3d/ads/gl/EglCore;II)V", "release", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(EglCore eglCore, int i, int i2) {
        super(eglCore);
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        createOffscreenSurface(i, i2);
    }

    public final void release() {
        releaseEglSurface();
    }
}
