package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4253a;
    private final com.applovin.impl.sdk.p b;
    private final long c;
    private final long d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private int k;
    private int l;
    private Integer m;
    private volatile boolean n;
    private volatile boolean o;
    private Handler p;
    private HandlerThread q;
    private c s;
    private WeakReference j = new WeakReference(null);
    private final Runnable r = new Runnable() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            j0.this.a();
        }
    };

    class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f4255a;
        final /* synthetic */ Bitmap b;

        b(d dVar, Bitmap bitmap) {
            this.f4255a = dVar;
            this.b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.f4255a.a(this.b);
                return;
            }
            com.applovin.impl.sdk.p unused = j0.this.b;
            if (com.applovin.impl.sdk.p.a()) {
                j0.this.b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
            }
            this.f4255a.a(true);
        }
    }

    public interface c {
        void a(int i, int i2);

        void a(int i, int i2, int i3);
    }

    private interface d {
        void a(Bitmap bitmap);

        void a(boolean z);
    }

    public j0(com.applovin.impl.sdk.l lVar) {
        this.f4253a = lVar;
        this.b = lVar.Q();
        this.c = ((Long) lVar.a(c5.s6)).longValue();
        this.d = ((Long) lVar.a(c5.r6)).longValue();
        this.g = ((Integer) lVar.a(c5.t6)).intValue();
        this.h = ((Integer) lVar.a(c5.u6)).intValue();
        this.i = ((Integer) lVar.a(c5.v6)).intValue();
        this.e = ((Integer) lVar.a(c5.B6)).intValue();
        this.f = ((Integer) lVar.a(c5.C6)).intValue();
    }

    static /* synthetic */ int a(j0 j0Var) {
        int i = j0Var.l;
        j0Var.l = i + 1;
        return i;
    }

    static /* synthetic */ int f(j0 j0Var) {
        int i = j0Var.k;
        j0Var.k = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.k = 0;
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.j.get() != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.a("BlackViewDetector", "Stopped monitoring view: " + this.j.get());
            }
            this.j.clear();
        }
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacks(this.r);
            this.p = null;
        }
        if (this.s != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    j0.this.f();
                }
            });
        }
    }

    private void c() {
        if (this.k >= this.f && !this.o) {
            this.o = true;
            h();
        }
        if (this.k < this.e || this.n) {
            return;
        }
        this.n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.s;
        if (cVar != null) {
            cVar.a(this.e, this.k, this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.s;
        if (cVar != null) {
            cVar.a(this.k, this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.c <= 0) {
            if (this.k == 1) {
                if (!this.o) {
                    this.o = true;
                    h();
                }
                if (!this.n) {
                    this.n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.p == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.n && this.o) {
            k();
        } else {
            this.p.postDelayed(this.r, this.c);
        }
    }

    private void h() {
        View view = (View) this.j.get();
        if (com.applovin.impl.sdk.p.a()) {
            this.b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.d();
            }
        });
    }

    private void i() {
        View view = (View) this.j.get();
        if (com.applovin.impl.sdk.p.a()) {
            this.b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.e();
            }
        });
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f4253a.a(c5.q6)).booleanValue()) {
            View view2 = (View) this.j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f4253a.E().a(h2.X0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.s = cVar;
                this.j = new WeakReference(view);
                j();
                this.n = false;
                this.o = false;
                Handler handler = new Handler(this.q.getLooper());
                this.p = handler;
                handler.postDelayed(this.r, this.d);
            } catch (Throwable th) {
                k();
                this.f4253a.E().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    class a implements d {
        a() {
        }

        @Override // com.applovin.impl.j0.d
        public void a(Bitmap bitmap) {
            try {
                j0.a(j0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = width / j0.this.g;
                int i2 = height / j0.this.g;
                int i3 = i / 2;
                for (int i4 = i2 / 2; i4 < height; i4 += i2) {
                    for (int i5 = i3; i5 < width; i5 += i) {
                        int pixel = bitmap.getPixel(i5, i4);
                        if (j0.this.a(pixel)) {
                            bitmap.recycle();
                            j0.this.j();
                            j0.this.g();
                            return;
                        }
                        if (j0.this.m == null) {
                            j0.this.m = Integer.valueOf(pixel);
                        }
                    }
                }
                j0.f(j0.this);
                bitmap.recycle();
                j0.this.g();
            } catch (Exception e) {
                j0.this.f4253a.E().a("BlackViewDetector", "onScreenshotCaptured", e);
                j0.this.k();
            }
        }

        @Override // com.applovin.impl.j0.d
        public void a(boolean z) {
            if (z) {
                j0.this.k();
            } else {
                j0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo a2;
        View view = (View) this.j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l = (Long) this.f4253a.a(c5.z6);
        if (l.longValue() > 0 && (a2 = t7.a((ActivityManager) com.applovin.impl.sdk.l.p().getSystemService("activity"))) != null && a2.availMem < l.longValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f4253a.o0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        boolean z;
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        Integer num = this.m;
        if (num != null) {
            int red2 = Color.red(num.intValue());
            int green2 = Color.green(this.m.intValue());
            int blue2 = Color.blue(this.m.intValue());
            if (Math.abs(red - red2) > this.i || Math.abs(green - green2) > this.i || Math.abs(blue - blue2) > this.i) {
                z = true;
                int i2 = this.h;
                return red <= i2 ? true : true;
            }
        }
        z = false;
        int i22 = this.h;
        return red <= i22 ? true : true;
    }

    private void a(View view, d dVar) {
        if (p0.d()) {
            Activity a2 = this.f4253a.e().a();
            if (a2 == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, i + measuredWidth, i2 + measuredHeight);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(a2.getWindow(), rect, createBitmap, new b(dVar, createBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
