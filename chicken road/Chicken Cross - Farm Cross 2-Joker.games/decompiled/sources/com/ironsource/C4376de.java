package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.de, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4376de {
    private static final int o = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<C4411fd> f8144a;
    private H1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private C4411fd l;
    private C4597q2 m;
    private boolean n;

    public C4376de() {
        this.f8144a = new ArrayList<>();
        this.b = new H1();
    }

    public void a(C4411fd c4411fd) {
        if (c4411fd != null) {
            this.f8144a.add(c4411fd);
            if (this.l == null) {
                this.l = c4411fd;
            } else if (c4411fd.a(0)) {
                this.l = c4411fd;
            }
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.n;
    }

    public ArrayList<C4411fd> e() {
        return this.f8144a;
    }

    public boolean f() {
        return this.i;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public C4597q2 k() {
        return this.m;
    }

    public long l() {
        return this.h;
    }

    public H1 m() {
        return this.b;
    }

    public boolean n() {
        return this.k;
    }

    public boolean o() {
        return this.j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public C4376de(int i, boolean z, int i2, int i3, H1 h1, C4597q2 c4597q2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f8144a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = h1;
        this.f = i3;
        this.m = c4597q2;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public C4411fd a(String str) {
        Iterator<C4411fd> it = this.f8144a.iterator();
        while (it.hasNext()) {
            C4411fd next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public C4411fd a() {
        Iterator<C4411fd> it = this.f8144a.iterator();
        while (it.hasNext()) {
            C4411fd next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.l;
    }
}
