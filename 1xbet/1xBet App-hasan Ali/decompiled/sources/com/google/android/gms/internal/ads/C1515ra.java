package com.google.android.gms.internal.ads;

import A0.AbstractC0015c;

/* renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515ra extends AbstractC0015c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f15305c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15306d;

    /* renamed from: e, reason: collision with root package name */
    public int f15307e;

    public C1515ra() {
        super(1);
        this.f15305c = new Object();
        this.f15306d = false;
        this.f15307e = 0;
    }

    public final C1471qa q() {
        C1471qa c1471qa = new C1471qa(this);
        T2.G.m("createNewReference: Trying to acquire lock");
        synchronized (this.f15305c) {
            T2.G.m("createNewReference: Lock acquired");
            p(new C1529ro(8, c1471qa), new Mt(8, c1471qa));
            int i = this.f15307e;
            if (i < 0) {
                throw new IllegalStateException();
            }
            this.f15307e = i + 1;
        }
        T2.G.m("createNewReference: Lock released");
        return c1471qa;
    }

    public final void r() {
        T2.G.m("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f15305c) {
            T2.G.m("markAsDestroyable: Lock acquired");
            if (this.f15307e < 0) {
                throw new IllegalStateException();
            }
            T2.G.m("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f15306d = true;
            s();
        }
        T2.G.m("markAsDestroyable: Lock released");
    }

    public final void s() {
        T2.G.m("maybeDestroy: Trying to acquire lock");
        synchronized (this.f15305c) {
            try {
                T2.G.m("maybeDestroy: Lock acquired");
                int i = this.f15307e;
                if (i < 0) {
                    throw new IllegalStateException();
                }
                if (this.f15306d && i == 0) {
                    T2.G.m("No reference is left (including root). Cleaning up engine.");
                    p(new V9(4), new V9(18));
                } else {
                    T2.G.m("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        T2.G.m("maybeDestroy: Lock released");
    }

    public final void t() {
        T2.G.m("releaseOneReference: Trying to acquire lock");
        synchronized (this.f15305c) {
            T2.G.m("releaseOneReference: Lock acquired");
            if (this.f15307e <= 0) {
                throw new IllegalStateException();
            }
            T2.G.m("Releasing 1 reference for JS Engine");
            this.f15307e--;
            s();
        }
        T2.G.m("releaseOneReference: Lock released");
    }
}
