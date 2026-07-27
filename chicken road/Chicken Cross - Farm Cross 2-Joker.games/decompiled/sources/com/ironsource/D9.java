package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class D9 {
    private static final int n = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<H9> f7599a;
    private H1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private C4597q2 g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private H9 m;

    public D9() {
        this.f7599a = new ArrayList<>();
        this.b = new H1();
        this.g = new C4597q2();
    }

    public void a(H9 h9) {
        if (h9 != null) {
            this.f7599a.add(h9);
            if (this.m == null) {
                this.m = h9;
            } else if (h9.a(0)) {
                this.m = h9;
            }
        }
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean f() {
        return this.d;
    }

    public C4597q2 g() {
        return this.g;
    }

    public long h() {
        return this.i;
    }

    public H1 i() {
        return this.b;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public D9(int i, boolean z, int i2, H1 h1, C4597q2 c4597q2, int i3, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f7599a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = h1;
        this.g = c4597q2;
        this.j = z3;
        this.k = z4;
        this.f = i3;
        this.h = z2;
        this.i = j;
        this.l = z5;
    }

    public H9 a(String str) {
        Iterator<H9> it = this.f7599a.iterator();
        while (it.hasNext()) {
            H9 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public H9 a() {
        Iterator<H9> it = this.f7599a.iterator();
        while (it.hasNext()) {
            H9 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.m;
    }
}
