package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class U5 extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public boolean f11723k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11724l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11725m;

    /* renamed from: n, reason: collision with root package name */
    public final G3 f11726n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11727o;

    /* renamed from: p, reason: collision with root package name */
    public final int f11728p;

    /* renamed from: q, reason: collision with root package name */
    public final int f11729q;

    /* renamed from: r, reason: collision with root package name */
    public final int f11730r;

    /* renamed from: s, reason: collision with root package name */
    public final int f11731s;

    /* renamed from: t, reason: collision with root package name */
    public final int f11732t;

    /* renamed from: u, reason: collision with root package name */
    public final int f11733u;

    /* renamed from: v, reason: collision with root package name */
    public final int f11734v;

    /* renamed from: w, reason: collision with root package name */
    public final String f11735w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11736x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f11737y;

    public U5() {
        G3 g32 = new G3(4, (byte) 0);
        this.f11723k = false;
        this.f11724l = false;
        this.f11726n = g32;
        this.f11725m = new Object();
        this.f11728p = ((Long) AbstractC0745a8.f12643d.s()).intValue();
        this.f11729q = ((Long) AbstractC0745a8.f12640a.s()).intValue();
        this.f11730r = ((Long) AbstractC0745a8.f12644e.s()).intValue();
        this.f11731s = ((Long) AbstractC0745a8.f12642c.s()).intValue();
        A7 a7 = F7.f8771V;
        Q2.r rVar = Q2.r.f5053d;
        this.f11732t = ((Integer) rVar.f5056c.a(a7)).intValue();
        A7 a72 = F7.f8776W;
        D7 d7 = rVar.f5056c;
        this.f11733u = ((Integer) d7.a(a72)).intValue();
        this.f11734v = ((Integer) d7.a(F7.f8781X)).intValue();
        this.f11727o = ((Long) AbstractC0745a8.f.s()).intValue();
        this.f11735w = (String) d7.a(F7.f8791Z);
        this.f11736x = ((Boolean) d7.a(F7.f8797a0)).booleanValue();
        this.f11737y = ((Boolean) d7.a(F7.f8803b0)).booleanValue();
        ((Boolean) d7.a(F7.f8808c0)).getClass();
        setName("ContentFetchTask");
    }

    public final E.H0 a(View view, Q5 q5) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    q5.e(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new E.H0(1, 0);
                }
            } else {
                if ((view instanceof WebView) && !(view instanceof InterfaceC0677Re)) {
                    WebView webView = (WebView) view;
                    synchronized (q5.f11173g) {
                        q5.f11178m++;
                    }
                    webView.post(new RunnableC1362o(this, q5, webView, globalVisibleRect));
                    return new E.H0(0, 1);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i = 0;
                    int i5 = 0;
                    for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                        E.H0 a5 = a(viewGroup.getChildAt(i6), q5);
                        i += a5.f1041a;
                        i5 += a5.f1042b;
                    }
                    return new E.H0(i, i5);
                }
            }
        }
        return new E.H0(0, 0);
    }

    public final void b() {
        synchronized (this.f11725m) {
            try {
                if (this.f11723k) {
                    U2.j.d("Content hash thread already started, quitting...");
                } else {
                    this.f11723k = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f11725m) {
            this.f11724l = true;
            U2.j.d("ContentFetchThread: paused, pause = true");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = P2.o.f4767B.f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        U2.j.d("ContentFetchThread: no activity. Sleeping.");
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0093, code lost:
    
        P2.o.f4767B.f4774g.i("ContentFetchTask.extractContent", r0);
        U2.j.d("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        U2.j.g("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c9, code lost:
    
        U2.j.g("Error in ContentFetchTask", r0);
        P2.o.f4767B.f4774g.i("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e0 A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00e0->B:16:0x00e0, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Application f = P2.o.f4767B.f.f();
                if (f != null) {
                    ActivityManager activityManager = (ActivityManager) f.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) f.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                P2.o.f4767B.f4774g.i("ContentFetchTask.isInForeground", th);
            }
            U2.j.d("ContentFetchTask: sleeping");
            c();
            Thread.sleep(this.f11727o * 1000);
            synchronized (this.f11725m) {
                while (this.f11724l) {
                    try {
                        U2.j.d("ContentFetchTask: waiting");
                        this.f11725m.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new Kw(4, this, view, false));
        }
        Thread.sleep(this.f11727o * 1000);
        synchronized (this.f11725m) {
        }
    }
}
