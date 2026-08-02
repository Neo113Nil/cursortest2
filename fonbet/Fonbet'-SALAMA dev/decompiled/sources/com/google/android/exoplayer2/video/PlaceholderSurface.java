package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import v2.AbstractC1664a;
import v2.c;
import v2.t;
import w2.i;

/* loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f10701d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f10702e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10703a;

    /* renamed from: b, reason: collision with root package name */
    public final i f10704b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10705c;

    public PlaceholderSurface(i iVar, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f10704b = iVar;
        this.f10703a = z4;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i7 = t.f17153a;
        if (i7 >= 24 && ((i7 >= 26 || !("samsung".equals(t.f17155c) || "XT1650".equals(t.f17156d))) && ((i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i7 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z4;
        synchronized (PlaceholderSurface.class) {
            try {
                if (!f10702e) {
                    f10701d = a(context);
                    f10702e = true;
                }
                z4 = f10701d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public static PlaceholderSurface c(Context context, boolean z4) {
        boolean z7 = false;
        AbstractC1664a.h(!z4 || b(context));
        i iVar = new i("ExoPlayer:PlaceholderSurface");
        int i7 = z4 ? f10701d : 0;
        iVar.start();
        Handler handler = new Handler(iVar.getLooper(), iVar);
        iVar.f18015b = handler;
        iVar.f18014a = new c(handler);
        synchronized (iVar) {
            iVar.f18015b.obtainMessage(1, i7, 0).sendToTarget();
            while (iVar.f18018e == null && iVar.f18017d == null && iVar.f18016c == null) {
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
        RuntimeException runtimeException = iVar.f18017d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = iVar.f18016c;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = iVar.f18018e;
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
                    iVar.f18015b.getClass();
                    iVar.f18015b.sendEmptyMessage(2);
                    this.f10705c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
