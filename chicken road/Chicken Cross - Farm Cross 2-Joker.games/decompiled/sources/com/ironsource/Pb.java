package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Pb {
    public static final a m = new a(null);
    private static final int n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7849a;
    private H1 b;
    private int c;
    private long d;
    private boolean e;
    private final ArrayList<C4295ac> f;
    private C4295ac g;
    private int h;
    private C4597q2 i;
    private long j;
    private boolean k;
    private boolean l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Pb(int i, long j, boolean z, H1 events, C4597q2 auctionSettings, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.f7849a = z4;
        this.f = new ArrayList<>();
        this.c = i;
        this.d = j;
        this.e = z;
        this.b = events;
        this.h = i2;
        this.i = auctionSettings;
        this.j = j2;
        this.k = z2;
        this.l = z3;
    }

    public final void a(H1 h1) {
        Intrinsics.checkNotNullParameter(h1, "<set-?>");
        this.b = h1;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final C4597q2 d() {
        return this.i;
    }

    public final C4295ac e() {
        Iterator<C4295ac> it = this.f.iterator();
        while (it.hasNext()) {
            C4295ac next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.g;
    }

    public final int f() {
        return this.h;
    }

    public final H1 g() {
        return this.b;
    }

    public final long h() {
        return this.j;
    }

    public final boolean i() {
        return this.k;
    }

    public final boolean j() {
        return this.f7849a;
    }

    public final boolean k() {
        return this.l;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.e + "}";
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final boolean a() {
        return this.e;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(C4597q2 c4597q2) {
        Intrinsics.checkNotNullParameter(c4597q2, "<set-?>");
        this.i = c4597q2;
    }

    public final void a(C4295ac c4295ac) {
        if (c4295ac != null) {
            this.f.add(c4295ac);
            if (this.g == null) {
                this.g = c4295ac;
            } else if (c4295ac.b() == 0) {
                this.g = c4295ac;
            }
        }
    }

    public final C4295ac a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Iterator<C4295ac> it = this.f.iterator();
        while (it.hasNext()) {
            C4295ac next = it.next();
            if (Intrinsics.areEqual(next.c(), placementName)) {
                return next;
            }
        }
        return null;
    }
}
