package a3;

import A0.J0;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import c3.AbstractC0539a;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1281m8;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Qw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6482a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6483b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f6484c;

    /* renamed from: d, reason: collision with root package name */
    public final C1616tl f6485d;

    /* renamed from: e, reason: collision with root package name */
    public final Qw f6486e;

    public F(Context context, C1616tl c1616tl, Qw qw) {
        this.f6484c = context;
        this.f6485d = c1616tl;
        this.f6486e = qw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r10.f6492a == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(final boolean z3, H h3) {
        try {
            HashMap hashMap = this.f6482a;
            Boolean valueOf = Boolean.valueOf(z3);
            H h4 = (H) hashMap.get(valueOf);
            final boolean z5 = true;
            if (h4 != null) {
                P2.o.f4767B.f4776j.getClass();
                if (!(h4.f6494c <= System.currentTimeMillis())) {
                    if (h4.f6492a != null) {
                    }
                }
            }
            this.f6482a.put(valueOf, h3);
            long longValue = (h3.f6492a != null ? (Long) AbstractC1281m8.f14477d.s() : (Long) AbstractC1281m8.f14478e.s()).longValue();
            if (h3.f6492a != null) {
                z5 = false;
            }
            AbstractC0613Id.f9542d.schedule(new Runnable() { // from class: a3.E
                @Override // java.lang.Runnable
                public final void run() {
                    F.this.e(z3, z5);
                }
            }, longValue, TimeUnit.SECONDS);
            List list = (List) this.f6483b.get(valueOf);
            this.f6483b.put(valueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d(h3, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final synchronized void b(Object obj, AbstractC0539a abstractC0539a) {
        P2.o.f4767B.f4776j.getClass();
        AbstractC0613Id.f.execute(new S2.q(this, obj, new Pair(abstractC0539a, Long.valueOf(System.currentTimeMillis())), 2));
    }

    public final void c(boolean z3) {
        HashMap hashMap = this.f6483b;
        Boolean valueOf = Boolean.valueOf(z3);
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, new ArrayList());
        ((C0606Hd) this.f6486e).submit(new P2.f(1, this, z3));
    }

    public final void d(H h3, Pair pair, boolean z3) {
        h3.f6496e.set(true);
        J0 j02 = h3.f6492a;
        if (j02 != null) {
            ((AbstractC0539a) pair.first).b(j02);
        } else {
            ((AbstractC0539a) pair.first).a(h3.f6493b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        P2.o.f4767B.f4776j.getClass();
        G4.d.R(this.f6485d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z3)), new Pair("sgpc_rs", Boolean.toString(j02 != null)));
    }

    public final synchronized void e(boolean z3, boolean z5) {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z3);
                HashMap hashMap = this.f6482a;
                Boolean valueOf = Boolean.valueOf(z3);
                H h3 = (H) hashMap.get(valueOf);
                int i = 0;
                if (z5 && h3 != null) {
                    try {
                        i = h3.f6495d + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                int i5 = i;
                H h4 = (H) this.f6482a.get(valueOf);
                G g5 = new G(this, z3, i5, h4 == null ? null : Boolean.valueOf(h4.f6496e.get()), this.f6485d);
                J2.h hVar = new J2.h((J2.g) new J2.g(0).a(bundle));
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Ga)).booleanValue()) {
                    ((C0606Hd) this.f6486e).submit(new CallableC0460d(this, hVar, g5, 2));
                } else {
                    J0.p(this.f6484c, hVar, g5);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
