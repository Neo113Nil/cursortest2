package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import p151v2.a;
import p151v2.c;
import p151v2.t;
import p156w2.i;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f10701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f10702e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f10704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10705c;

    public PlaceholderSurface(i iVar, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f10704b = iVar;
        this.f10703a = z4;
    }

    public static int a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i7 = t.f17159a;
        if (i7 >= 24 && ((i7 >= 26 || !("samsung".equals(t.f17161c) || "XT1650".equals(t.f17162d))) && ((i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i7 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f10702e) {
                f10701d = a(context);
                f10702e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10701d != 0;
    }

    public static PlaceholderSurface c(Context context, boolean z4) {
        boolean z7 = false;
        a.h(!z4 || b(context));
        i iVar = new i("ExoPlayer:PlaceholderSurface");
        int i7 = z4 ? f10701d : 0;
        iVar.start();
        Handler handler = new Handler(iVar.getLooper(), iVar);
        iVar.f18021b = handler;
        iVar.f18020a = new c(handler);
        synchronized (iVar) {
            iVar.f18021b.obtainMessage(1, i7, 0).sendToTarget();
            while (iVar.f18024e == null && iVar.f18023d == null && iVar.f18022c == null) {
                try {
                    iVar.wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = iVar.f18023d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = iVar.f18022c;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = iVar.f18024e;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f10704b) {
            try {
                if (!this.f10705c) {
                    i iVar = this.f10704b;
                    iVar.f18021b.getClass();
                    iVar.f18021b.sendEmptyMessage(2);
                    this.f10705c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
