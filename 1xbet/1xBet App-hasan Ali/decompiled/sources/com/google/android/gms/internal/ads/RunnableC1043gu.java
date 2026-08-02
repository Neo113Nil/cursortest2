package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.gu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1043gu implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13673k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802bc f13674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Runnable f13675m;

    public /* synthetic */ RunnableC1043gu(C0802bc c0802bc, Runnable runnable, int i) {
        this.f13673k = i;
        this.f13674l = c0802bc;
        this.f13675m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13673k) {
            case 0:
                Runnable runnable = this.f13675m;
                C0802bc c0802bc = this.f13674l;
                c0802bc.getClass();
                try {
                    runnable.run();
                    return;
                } catch (RuntimeException e3) {
                    ((C1091hx) c0802bc.f12825o).a("error caused by ", e3);
                    return;
                }
            default:
                C0802bc c0802bc2 = this.f13674l;
                Runnable runnable2 = this.f13675m;
                if (((Vt) c0802bc2.f12830t) != null || c0802bc2.f12823m) {
                    if (!c0802bc2.f12823m) {
                        runnable2.run();
                        return;
                    }
                    ((C1091hx) c0802bc2.f12825o).c("Waiting to bind to the service.", new Object[0]);
                    synchronized (((ArrayList) c0802bc2.f12826p)) {
                        ((ArrayList) c0802bc2.f12826p).add(runnable2);
                    }
                    return;
                }
                ((C1091hx) c0802bc2.f12825o).c("Initiate binding to the service.", new Object[0]);
                synchronized (((ArrayList) c0802bc2.f12826p)) {
                    ((ArrayList) c0802bc2.f12826p).add(runnable2);
                }
                ServiceConnectionC1088hu serviceConnectionC1088hu = new ServiceConnectionC1088hu(c0802bc2);
                c0802bc2.f12829s = serviceConnectionC1088hu;
                c0802bc2.f12823m = true;
                if (((Context) c0802bc2.f12821k).bindService((Intent) c0802bc2.f12822l, serviceConnectionC1088hu, 1)) {
                    return;
                }
                ((C1091hx) c0802bc2.f12825o).c("Failed to bind to the service.", new Object[0]);
                c0802bc2.f12823m = false;
                synchronized (((ArrayList) c0802bc2.f12826p)) {
                    ((ArrayList) c0802bc2.f12826p).clear();
                }
                return;
        }
    }
}
