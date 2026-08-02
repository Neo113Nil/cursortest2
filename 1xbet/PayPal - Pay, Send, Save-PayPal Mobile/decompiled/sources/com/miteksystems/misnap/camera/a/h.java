package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0011\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/miteksystems/misnap/camera/a/h;", "", "Lcom/miteksystems/misnap/camera/a/i;", "eglWrapper", "Landroid/opengl/EGLSurface;", "eglSurface", "<init>", "(Lcom/miteksystems/misnap/camera/a/i;Landroid/opengl/EGLSurface;)V", "Landroid/view/Surface;", "androidSurface", "(Lcom/miteksystems/misnap/camera/a/i;Landroid/view/Surface;)V", "Landroid/graphics/SurfaceTexture;", "androidTexture", "(Lcom/miteksystems/misnap/camera/a/i;Landroid/graphics/SurfaceTexture;)V", "", util.h.xy.cb.b.f1091, "()I", "a", "", "e", "()Z", "", "nanoSeconds", "", "(J)V", "c", "()V", "d", "getHighSpeedVideoFpsRangesFor", "Lcom/miteksystems/misnap/camera/a/i;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/opengl/EGLSurface;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class h {
    private final android.opengl.EGLSurface getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.miteksystems.misnap.camera.a.i getHighSpeedVideoSizes;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(com.miteksystems.misnap.camera.a.i iVar, android.graphics.SurfaceTexture surfaceTexture) {
        this(iVar, iVar.a(surfaceTexture));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceTexture, "");
    }

    public final /* synthetic */ int a() {
        return this.getHighSpeedVideoSizes.a(this.getHighResolutionOutputSizeshNQ4ISI, 12374);
    }

    public h(com.miteksystems.misnap.camera.a.i iVar, android.opengl.EGLSurface eGLSurface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eGLSurface, "");
        this.getHighSpeedVideoSizes = iVar;
        this.getHighResolutionOutputSizeshNQ4ISI = eGLSurface;
    }

    public final /* synthetic */ void a(long nanoSeconds) {
        this.getHighSpeedVideoSizes.a(this.getHighResolutionOutputSizeshNQ4ISI, nanoSeconds);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(com.miteksystems.misnap.camera.a.i iVar, android.view.Surface surface) {
        this(iVar, iVar.a(surface));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
    }

    public final /* synthetic */ boolean e() {
        return this.getHighSpeedVideoSizes.d(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final /* synthetic */ void d() {
        this.getHighSpeedVideoSizes.c(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final /* synthetic */ void c() {
        if (this.getHighSpeedVideoSizes.a(this.getHighResolutionOutputSizeshNQ4ISI)) {
            return;
        }
        this.getHighSpeedVideoSizes.b(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final /* synthetic */ int b() {
        return this.getHighSpeedVideoSizes.a(this.getHighResolutionOutputSizeshNQ4ISI, 12375);
    }
}
