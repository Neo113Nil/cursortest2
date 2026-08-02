package androidx.work.impl;

import D0.a;
import D0.e;
import D3.j;
import J0.b;
import J0.c;
import android.content.Context;
import android.support.v4.media.session.t;
import c5.C0820a;
import com.google.android.gms.common.internal.w;
import d6.C0977k;
import e3.C1023h;
import java.util.HashMap;
import k1.g;
import m1.C1427b;
import m1.C1430e;
import w1.P2;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f9870s = 0;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0820a f9871l;

    /* renamed from: m, reason: collision with root package name */
    public volatile C0977k f9872m;

    /* renamed from: n, reason: collision with root package name */
    public volatile w f9873n;

    /* renamed from: o, reason: collision with root package name */
    public volatile t f9874o;

    /* renamed from: p, reason: collision with root package name */
    public volatile C0977k f9875p;

    /* renamed from: q, reason: collision with root package name */
    public volatile g f9876q;

    /* renamed from: r, reason: collision with root package name */
    public volatile w f9877r;

    @Override // D0.j
    public final e d() {
        return new e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // D0.j
    public final c e(a aVar) {
        P2 p22 = new P2(5, aVar, new C1023h(this), false);
        Context context = (Context) aVar.f1620d;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return ((b) aVar.f1619c).i(new j(context, (String) aVar.f1621e, p22, false, 3));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0977k i() {
        C0977k c0977k;
        if (this.f9872m != null) {
            return this.f9872m;
        }
        synchronized (this) {
            try {
                if (this.f9872m == null) {
                    this.f9872m = new C0977k(this, 7);
                }
                c0977k = this.f9872m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0977k;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final w j() {
        w wVar;
        if (this.f9877r != null) {
            return this.f9877r;
        }
        synchronized (this) {
            try {
                if (this.f9877r == null) {
                    this.f9877r = new w(this, 10);
                }
                wVar = this.f9877r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t k() {
        t tVar;
        if (this.f9874o != null) {
            return this.f9874o;
        }
        synchronized (this) {
            try {
                if (this.f9874o == null) {
                    this.f9874o = new t(this);
                }
                tVar = this.f9874o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0977k l() {
        C0977k c0977k;
        if (this.f9875p != null) {
            return this.f9875p;
        }
        synchronized (this) {
            try {
                if (this.f9875p == null) {
                    this.f9875p = new C0977k(this, 8);
                }
                c0977k = this.f9875p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0977k;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g m() {
        g gVar;
        if (this.f9876q != null) {
            return this.f9876q;
        }
        synchronized (this) {
            try {
                if (this.f9876q == null) {
                    g gVar2 = new g();
                    gVar2.f14674a = this;
                    gVar2.f14675b = new C1427b(this, 4);
                    gVar2.f14676c = new C1430e(this, 1);
                    gVar2.f14677d = new C1430e(this, 2);
                    this.f9876q = gVar2;
                }
                gVar = this.f9876q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0820a n() {
        C0820a c0820a;
        if (this.f9871l != null) {
            return this.f9871l;
        }
        synchronized (this) {
            try {
                if (this.f9871l == null) {
                    this.f9871l = new C0820a(this);
                }
                c0820a = this.f9871l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0820a;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final w o() {
        w wVar;
        if (this.f9873n != null) {
            return this.f9873n;
        }
        synchronized (this) {
            try {
                if (this.f9873n == null) {
                    this.f9873n = new w(this, 11);
                }
                wVar = this.f9873n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }
}
