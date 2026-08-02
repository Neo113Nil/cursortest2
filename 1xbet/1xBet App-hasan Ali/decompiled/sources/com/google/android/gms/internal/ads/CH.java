package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class CH extends Surface {

    /* renamed from: n, reason: collision with root package name */
    public static int f7988n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f7989o;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7990k;

    /* renamed from: l, reason: collision with root package name */
    public final BH f7991l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7992m;

    public /* synthetic */ CH(BH bh, SurfaceTexture surfaceTexture, boolean z3) {
        super(surfaceTexture);
        this.f7991l = bh;
        this.f7990k = z3;
    }

    public static synchronized boolean a(Context context) {
        int i;
        String eglQueryString;
        int i5;
        synchronized (CH.class) {
            try {
                if (!f7989o) {
                    int i6 = AbstractC1260lo.f14419a;
                    if (i6 >= 24 && ((i6 >= 26 || (!"samsung".equals(AbstractC1260lo.f14421c) && !"XT1650".equals(AbstractC1260lo.f14422d))) && ((i6 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                        String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        i5 = eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                        f7988n = i5;
                        f7989o = true;
                    }
                    i5 = 0;
                    f7988n = i5;
                    f7989o = true;
                }
                i = f7988n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f7991l) {
            try {
                if (!this.f7992m) {
                    Handler handler = this.f7991l.f7809l;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f7992m = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
