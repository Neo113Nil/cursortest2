package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes5.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f4504a = new LinkedList();
    private final Object b = new Object();

    r() {
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            if (b() <= 25) {
                this.f4504a.offer(appLovinAdImpl);
            } else {
                p.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    int b() {
        int size;
        synchronized (this.b) {
            size = this.f4504a.size();
        }
        return size;
    }

    boolean c() {
        boolean z;
        synchronized (this.b) {
            z = b() == 0;
        }
        return z;
    }

    AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f4504a.peek();
        }
        return appLovinAdImpl;
    }

    void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            this.f4504a.remove(appLovinAdImpl);
        }
    }

    AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f4504a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
