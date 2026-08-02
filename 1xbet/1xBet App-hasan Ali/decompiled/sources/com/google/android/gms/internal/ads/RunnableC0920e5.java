package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import k4.AbstractC2036a;

/* renamed from: com.google.android.gms.internal.ads.e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0920e5 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13234k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13235l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f13236m;

    public /* synthetic */ RunnableC0920e5(int i, int i5, Object obj) {
        this.f13234k = i5;
        this.f13235l = i;
        this.f13236m = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1367o4 c1367o4;
        switch (this.f13234k) {
            case 0:
                int i = this.f13235l;
                C0965f5 c0965f5 = (C0965f5) this.f13236m;
                if (i > 0) {
                    try {
                        Thread.sleep(i * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    PackageInfo packageInfo = c0965f5.f13438a.getPackageManager().getPackageInfo(c0965f5.f13438a.getPackageName(), 0);
                    Context context = c0965f5.f13438a;
                    c1367o4 = AbstractC1803xs.g(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
                } catch (Throwable unused2) {
                    c1367o4 = null;
                }
                ((C0965f5) this.f13236m).f13445j = c1367o4;
                if (this.f13235l < 4) {
                    if (c1367o4 == null || !c1367o4.g0() || c1367o4.u0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !c1367o4.h0() || !c1367o4.s0().A() || c1367o4.s0().w() == -2) {
                        C0965f5 c0965f52 = (C0965f5) this.f13236m;
                        int i5 = this.f13235l + 1;
                        if (c0965f52.f13450o) {
                            Future<?> submit = c0965f52.f13439b.submit(new RunnableC0920e5(i5, 0, c0965f52));
                            if (i5 == 0) {
                                c0965f52.f13446k = submit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                C1482ql c1482ql = ((P7) this.f13236m).f11068d;
                if (c1482ql != null) {
                    C1390oj a5 = c1482ql.a();
                    a5.k("action", "cct_nav");
                    a5.k("cct_navs", String.valueOf(this.f13235l));
                    a5.q();
                    break;
                }
                break;
            case 2:
                C0711Wd c0711Wd = ((TextureViewSurfaceTextureListenerC0683Sd) this.f13236m).f11553z;
                if (c0711Wd != null) {
                    c0711Wd.onWindowVisibilityChanged(this.f13235l);
                    break;
                }
                break;
            case 3:
                C0711Wd c0711Wd2 = ((TextureViewSurfaceTextureListenerC1117ie) this.f13236m).f13947p;
                if (c0711Wd2 != null) {
                    c0711Wd2.onWindowVisibilityChanged(this.f13235l);
                    break;
                }
                break;
            case 4:
                RD rd = ((QD) this.f13236m).f11192b;
                int i6 = this.f13235l;
                if (i6 != -3 && i6 != -2) {
                    if (i6 == -1) {
                        SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE = rd.f11344c;
                        if (surfaceHolderCallbackC0974fE != null) {
                            C1109iE c1109iE = surfaceHolderCallbackC0974fE.f13463k;
                            c1109iE.B1(-1, 2, c1109iE.G1());
                        }
                        rd.a();
                        rd.b(1);
                        break;
                    } else if (i6 == 1) {
                        rd.b(2);
                        SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE2 = rd.f11344c;
                        if (surfaceHolderCallbackC0974fE2 != null) {
                            C1109iE c1109iE2 = surfaceHolderCallbackC0974fE2.f13463k;
                            c1109iE2.B1(1, 1, c1109iE2.G1());
                            break;
                        }
                    } else {
                        AbstractC0467k.y(i6, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i6 == -2) {
                    SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE3 = rd.f11344c;
                    if (surfaceHolderCallbackC0974fE3 != null) {
                        C1109iE c1109iE3 = surfaceHolderCallbackC0974fE3.f13463k;
                        c1109iE3.B1(0, 1, c1109iE3.G1());
                    }
                    rd.b(3);
                    break;
                } else {
                    rd.b(4);
                    break;
                }
                break;
            case 5:
                C1332nE c1332nE = (C1332nE) this.f13236m;
                int i7 = ((RF) c1332nE.f14629k[this.f13235l].f33c).f11390l;
                SE se = c1332nE.f14606E;
                se.i(se.l(), 1033, new QE(22));
                break;
            case 6:
                ((l3.m) this.f13236m).f(this.f13235l);
                break;
            case 7:
                ((SystemForegroundService) this.f13236m).f7121o.cancel(this.f13235l);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f13236m;
                int size = arrayList.size();
                int i8 = 0;
                if (this.f13235l == 1) {
                    while (i8 < size) {
                        ((v1.h) arrayList.get(i8)).b();
                        i8++;
                    }
                    break;
                } else {
                    while (i8 < size) {
                        ((v1.h) arrayList.get(i8)).a();
                        i8++;
                    }
                    break;
                }
        }
    }

    public /* synthetic */ RunnableC0920e5(C1332nE c1332nE, int i, boolean z3) {
        this.f13234k = 5;
        this.f13236m = c1332nE;
        this.f13235l = i;
    }

    public RunnableC0920e5(List list, int i, Throwable th) {
        this.f13234k = 8;
        AbstractC2036a.o("initCallbacks cannot be null", list);
        this.f13236m = new ArrayList(list);
        this.f13235l = i;
    }
}
