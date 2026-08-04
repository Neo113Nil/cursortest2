package androidx.work.impl;

import D0.e;
import D3.j;
import J0.b;
import J0.c;
import android.content.Context;
import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import java.util.HashMap;
import p019c5.a;
import p028d6.k;
import p033e3.h;
import p072k1.g;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f9870s = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile a f9871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile k f9872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile w f9873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile t f9874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile k f9875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile g f9876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile w f9877r;

    @Override // D0.j
    public final e d() {
        return new e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // D0.j
    public final c e(D0.a aVar) {
        P2 p5 = new P2(5, aVar, new h(this), false);
        Context context = (Context) aVar.f1620d;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return ((b) aVar.f1619c).i(new j(context, (String) aVar.f1621e, p5, false, 3));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k i() {
        k kVar;
        if (this.f9872m != null) {
            return this.f9872m;
        }
        synchronized (this) {
            try {
                if (this.f9872m == null) {
                    this.f9872m = new k(this, 7);
                }
                kVar = this.f9872m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
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
    public final k l() {
        k kVar;
        if (this.f9875p != null) {
            return this.f9875p;
        }
        synchronized (this) {
            try {
                if (this.f9875p == null) {
                    this.f9875p = new k(this, 8);
                }
                kVar = this.f9875p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
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
                    gVar2.f14680a = this;
                    gVar2.f14681b = new p088m1.b(this, 4);
                    gVar2.f14682c = new p088m1.e(this, 1);
                    gVar2.f14683d = new p088m1.e(this, 2);
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
    public final a n() {
        a aVar;
        if (this.f9871l != null) {
            return this.f9871l;
        }
        synchronized (this) {
            try {
                if (this.f9871l == null) {
                    this.f9871l = new a(this);
                }
                aVar = this.f9871l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
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
