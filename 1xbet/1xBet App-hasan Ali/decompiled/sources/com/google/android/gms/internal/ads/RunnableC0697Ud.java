package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.widget.ImageView;

/* renamed from: com.google.android.gms.internal.ads.Ud, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0697Ud implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11771k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0711Wd f11772l;

    public /* synthetic */ RunnableC0697Ud(C0711Wd c0711Wd, int i) {
        this.f11771k = i;
        this.f11772l = c0711Wd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11771k) {
            case 0:
                this.f11772l.c("firstFrameRendered", new String[0]);
                break;
            case 1:
                this.f11772l.c("surfaceCreated", new String[0]);
                break;
            case 2:
                this.f11772l.c("surfaceDestroyed", new String[0]);
                break;
            default:
                C0711Wd c0711Wd = this.f11772l;
                if (c0711Wd.f12051r) {
                    ImageView imageView = c0711Wd.f12042A;
                    if (imageView.getParent() != null) {
                        c0711Wd.f12045l.removeView(imageView);
                    }
                }
                AbstractC0690Td abstractC0690Td = c0711Wd.f12050q;
                if (abstractC0690Td != null && c0711Wd.f12059z != null) {
                    P2.o oVar = P2.o.f4767B;
                    oVar.f4776j.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (abstractC0690Td.getBitmap(c0711Wd.f12059z) != null) {
                        c0711Wd.f12043B = true;
                    }
                    oVar.f4776j.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (T2.G.o()) {
                        T2.G.m("Spinner frame grab took " + elapsedRealtime2 + "ms");
                    }
                    if (elapsedRealtime2 > c0711Wd.f12049p) {
                        U2.j.i("Spinner frame grab crossed jank threshold! Suspending spinner.");
                        c0711Wd.f12054u = false;
                        c0711Wd.f12059z = null;
                        L7 l7 = c0711Wd.f12047n;
                        if (l7 != null) {
                            l7.b("spinner_jank", Long.toString(elapsedRealtime2));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
