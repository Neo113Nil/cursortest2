package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0003\u0010\t\u001a\u0017\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0003\u0010\r"}, d2 = {"", "enableRecording", "Landroid/opengl/EGLConfig;", "a", "(Z)Landroid/opengl/EGLConfig;", "Landroid/opengl/EGLDisplay;", util.h.xy.cb.b.f1091, "()Landroid/opengl/EGLDisplay;", "Landroid/opengl/EGLContext;", "()Landroid/opengl/EGLContext;", "", "baseMessage", "", "(Ljava/lang/String;)V"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class j {
    public static final /* synthetic */ void a(java.lang.String str) {
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": EGL error: 0x");
        sb.append(java.lang.Integer.toHexString(eglGetError));
        sb.append(' ');
        switch (eglGetError) {
            case 12288:
                str2 = "EGL_SUCCESS";
                break;
            case 12289:
                str2 = "EGL_NOT_INITIALIZED";
                break;
            case 12290:
                str2 = "EGL_BAD_ACCESS";
                break;
            case 12291:
                str2 = "EGL_BAD_ALLOC";
                break;
            case 12292:
                str2 = "EGL_BAD_ATTRIBUTE";
                break;
            case 12293:
                str2 = "EGL_BAD_CONFIG";
                break;
            case 12294:
                str2 = "EGL_BAD_CONTEXT";
                break;
            case 12295:
                str2 = "EGL_BAD_CURRENT_SURFACE";
                break;
            case 12296:
                str2 = "EGL_BAD_DISPLAY";
                break;
            case 12297:
                str2 = "EGL_BAD_MATCH";
                break;
            case 12298:
                str2 = "EGL_BAD_NATIVE_PIXMAP";
                break;
            case 12299:
                str2 = "EGL_BAD_NATIVE_WINDOW";
                break;
            case 12300:
                str2 = "EGL_BAD_PARAMETER";
                break;
            case 12301:
                str2 = "EGL_BAD_SURFACE";
                break;
            case 12302:
                str2 = "EGL_CONTEXT_LOST";
                break;
        }
        sb.append(str2);
        throw new java.lang.RuntimeException(sb.toString());
    }

    public static final /* synthetic */ android.opengl.EGLConfig a(boolean z) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
        if (z) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (android.opengl.EGL14.eglChooseConfig(b(), iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public static final /* synthetic */ android.opengl.EGLContext a() {
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(b(), a(true), android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (eglCreateContext == null) {
            a("EGL Thread Create Context");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eglCreateContext, "");
        return eglCreateContext;
    }

    public static final /* synthetic */ android.opengl.EGLDisplay b() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (kotlin.jvm.internal.Intrinsics.areEqual(eglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            throw new java.lang.RuntimeException("Unable to get EGL Display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new java.lang.RuntimeException("Unable to initialize EGL14");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eglGetDisplay, "");
        return eglGetDisplay;
    }
}
