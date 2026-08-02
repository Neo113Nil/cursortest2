package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\b\u001a\u00020\rH\u0000¢\u0006\u0004\b\b\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\fJ\u001f\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\b\u0010\u0014J\u001f\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\b\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/miteksystems/misnap/camera/a/i;", "", "Landroid/opengl/EGLContext;", "eglContext", "<init>", "(Landroid/opengl/EGLContext;)V", "surface", "Landroid/opengl/EGLSurface;", "a", "(Ljava/lang/Object;)Landroid/opengl/EGLSurface;", "eglSurface", "", "(Landroid/opengl/EGLSurface;)Z", "", util.h.xy.cb.b.f1091, "(Landroid/opengl/EGLSurface;)V", "()V", "d", "", "nanoTime", "(Landroid/opengl/EGLSurface;J)V", "", "attributeCode", "(Landroid/opengl/EGLSurface;I)I", "c", "getHighSpeedVideoFpsRangesFor", "Landroid/opengl/EGLContext;", "Landroid/opengl/EGLDisplay;", "getHighSpeedVideoSizes", "Landroid/opengl/EGLDisplay;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class i {
    private final android.opengl.EGLContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.opengl.EGLDisplay getHighSpeedVideoFpsRanges;

    public final /* synthetic */ android.opengl.EGLSurface a(java.lang.Object surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        if (!(surface instanceof android.view.Surface) && !(surface instanceof android.graphics.SurfaceTexture)) {
            throw new java.lang.RuntimeException("Invalid surface: ".concat(java.lang.String.valueOf(surface)));
        }
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(this.getHighSpeedVideoFpsRanges, com.miteksystems.misnap.camera.a.j.a(true), surface, new int[]{12344}, 0);
        com.miteksystems.misnap.camera.a.j.a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new java.lang.RuntimeException("EGL Surface was null");
    }

    public final /* synthetic */ void b(android.opengl.EGLSurface eglSurface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eglSurface, "");
        if (android.opengl.EGL14.eglMakeCurrent(this.getHighSpeedVideoFpsRanges, eglSurface, eglSurface, this.getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        com.miteksystems.misnap.camera.a.j.a("eglMakeCurrent failed");
    }

    public final /* synthetic */ boolean a(android.opengl.EGLSurface eglSurface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eglSurface, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, android.opengl.EGL14.eglGetCurrentContext()) && kotlin.jvm.internal.Intrinsics.areEqual(eglSurface, android.opengl.EGL14.eglGetCurrentSurface(12377));
    }

    public final /* synthetic */ void b() {
        android.opengl.EGL14.eglDestroyContext(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }

    public final /* synthetic */ void a() {
        android.opengl.EGLDisplay eGLDisplay = this.getHighSpeedVideoFpsRanges;
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    public final /* synthetic */ int a(android.opengl.EGLSurface eglSurface, int attributeCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eglSurface, "");
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.getHighSpeedVideoFpsRanges, eglSurface, attributeCode, iArr, 0);
        return iArr[0];
    }

    public final /* synthetic */ void a(android.opengl.EGLSurface eglSurface, long nanoTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eglSurface, "");
        android.opengl.EGLExt.eglPresentationTimeANDROID(this.getHighSpeedVideoFpsRanges, eglSurface, nanoTime);
    }

    public final /* synthetic */ boolean d(android.opengl.EGLSurface eglSurface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eglSurface, "");
        return android.opengl.EGL14.eglSwapBuffers(this.getHighSpeedVideoFpsRanges, eglSurface);
    }

    public final /* synthetic */ void c(android.opengl.EGLSurface eglSurface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eglSurface, "");
        android.opengl.EGL14.eglDestroySurface(this.getHighSpeedVideoFpsRanges, eglSurface);
    }

    public i(android.opengl.EGLContext eGLContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eGLContext, "");
        this.getHighSpeedVideoFpsRangesFor = eGLContext;
        this.getHighSpeedVideoFpsRanges = com.miteksystems.misnap.camera.a.j.b();
    }
}
