package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class S2 {
    private static final int p = 0;

    /* renamed from: a, reason: collision with root package name */
    private H1 f7881a;
    private int b;
    private long c;
    private boolean d;
    private ArrayList<C4347c3> e;
    private C4347c3 f;
    private int g;
    private int h;
    private C4597q2 i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;

    public S2() {
        this.f7881a = new H1();
        this.e = new ArrayList<>();
    }

    public int a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public C4597q2 d() {
        return this.i;
    }

    public long e() {
        return this.k;
    }

    public int f() {
        return this.h;
    }

    public H1 g() {
        return this.f7881a;
    }

    public int h() {
        return this.g;
    }

    public C4347c3 i() {
        Iterator<C4347c3> it = this.e.iterator();
        while (it.hasNext()) {
            C4347c3 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        C4347c3 c4347c3 = this.f;
        return c4347c3 != null ? c4347c3 : new C4439h5();
    }

    public long j() {
        return this.o;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.b + ", bidderExclusive=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public void a(C4347c3 c4347c3) {
        if (c4347c3 != null) {
            this.e.add(c4347c3);
            if (this.f == null) {
                this.f = c4347c3;
            } else if (c4347c3.a(0)) {
                this.f = c4347c3;
            }
        }
    }

    public S2(int i, long j, boolean z, H1 h1, int i2, C4597q2 c4597q2, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.e = new ArrayList<>();
        this.b = i;
        this.c = j;
        this.d = z;
        this.f7881a = h1;
        this.g = i2;
        this.h = i3;
        this.i = c4597q2;
        this.j = z2;
        this.k = j2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = j3;
    }

    public C4347c3 a(String str) {
        Iterator<C4347c3> it = this.e.iterator();
        while (it.hasNext()) {
            C4347c3 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
