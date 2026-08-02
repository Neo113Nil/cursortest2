package androidx.work.impl;

import A0.J0;
import G.v;
import L4.n;
import P.W;
import R1.d;
import X1.a;
import X1.b;
import android.content.Context;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.G7;
import java.util.HashMap;
import v3.e;
import v3.g;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f7100s = 0;

    /* renamed from: l, reason: collision with root package name */
    public volatile G7 f7101l;

    /* renamed from: m, reason: collision with root package name */
    public volatile g f7102m;

    /* renamed from: n, reason: collision with root package name */
    public volatile v f7103n;

    /* renamed from: o, reason: collision with root package name */
    public volatile e f7104o;

    /* renamed from: p, reason: collision with root package name */
    public volatile g f7105p;

    /* renamed from: q, reason: collision with root package name */
    public volatile C1071hd f7106q;

    /* renamed from: r, reason: collision with root package name */
    public volatile v f7107r;

    @Override // R1.h
    public final d d() {
        return new d(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // R1.h
    public final b e(n nVar) {
        v vVar = new v(10, nVar, new J0(this));
        Context context = (Context) nVar.f3103e;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return ((a) nVar.f3102d).a(new W(context, nVar.f, (Object) vVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g i() {
        g gVar;
        if (this.f7102m != null) {
            return this.f7102m;
        }
        synchronized (this) {
            try {
                if (this.f7102m == null) {
                    this.f7102m = new g(this, 19);
                }
                gVar = this.f7102m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final v j() {
        v vVar;
        if (this.f7107r != null) {
            return this.f7107r;
        }
        synchronized (this) {
            try {
                if (this.f7107r == null) {
                    this.f7107r = new v(this, 19);
                }
                vVar = this.f7107r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e k() {
        e eVar;
        if (this.f7104o != null) {
            return this.f7104o;
        }
        synchronized (this) {
            try {
                if (this.f7104o == null) {
                    this.f7104o = new e(this);
                }
                eVar = this.f7104o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g l() {
        g gVar;
        if (this.f7105p != null) {
            return this.f7105p;
        }
        synchronized (this) {
            try {
                if (this.f7105p == null) {
                    this.f7105p = new g(this, 20);
                }
                gVar = this.f7105p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C1071hd m() {
        C1071hd c1071hd;
        if (this.f7106q != null) {
            return this.f7106q;
        }
        synchronized (this) {
            try {
                if (this.f7106q == null) {
                    this.f7106q = new C1071hd(this);
                }
                c1071hd = this.f7106q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1071hd;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final G7 n() {
        G7 g7;
        if (this.f7101l != null) {
            return this.f7101l;
        }
        synchronized (this) {
            try {
                if (this.f7101l == null) {
                    this.f7101l = new G7(this);
                }
                g7 = this.f7101l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g7;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final v o() {
        v vVar;
        if (this.f7103n != null) {
            return this.f7103n;
        }
        synchronized (this) {
            try {
                if (this.f7103n == null) {
                    this.f7103n = new v(this, 20);
                }
                vVar = this.f7103n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }
}
