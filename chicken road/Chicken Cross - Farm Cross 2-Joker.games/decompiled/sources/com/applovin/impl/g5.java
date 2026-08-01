package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class g5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4217a;
    private final Map b = new HashMap();
    private final Object c = new Object();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4218a;

        static {
            int[] iArr = new int[b.values().length];
            f4218a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4218a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4218a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final h5 f4220a;
        private final long b;
        private final long c;

        /* synthetic */ c(h5 h5Var, long j, a aVar) {
            this(h5Var, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.c > this.b;
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public h5 c() {
            return this.f4220a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            h5 c = c();
            h5 c2 = cVar.c();
            return c != null ? c.equals(c2) : c2 == null;
        }

        public int hashCode() {
            long b = b();
            long a2 = a();
            h5 c = c();
            return ((((((int) (b ^ (b >>> 32))) + 59) * 59) + ((int) ((a2 >>> 32) ^ a2))) * 59) + (c == null ? 43 : c.hashCode());
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        private c(h5 h5Var, long j) {
            this.f4220a = h5Var;
            this.b = j;
            this.c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.b;
        }

        public long a() {
            return this.c;
        }
    }

    public g5(com.applovin.impl.sdk.l lVar) {
        this.f4217a = lVar;
    }

    public void a(h5 h5Var, i5 i5Var, String str, MaxAdFormat maxAdFormat) {
        if (h5Var == null) {
            return;
        }
        long v = i5Var.v();
        if (v <= 0) {
            return;
        }
        this.f4217a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4217a.Q().a("SignalCacheManager", "Caching signal for: " + i5Var);
        }
        String a2 = a(i5Var, str, maxAdFormat);
        c cVar = new c(h5Var, v, null);
        synchronized (this.c) {
            this.b.put(a2, cVar);
        }
    }

    public h5 b(i5 i5Var, String str, MaxAdFormat maxAdFormat) {
        String a2 = a(i5Var, str, maxAdFormat);
        synchronized (this.c) {
            c cVar = (c) this.b.get(a2);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.b.remove(a2);
                return null;
            }
            this.f4217a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4217a.Q().a("SignalCacheManager", "Returning cached signal for: " + i5Var);
            }
            return cVar.f4220a;
        }
    }

    private String a(i5 i5Var, String str, MaxAdFormat maxAdFormat) {
        String c2 = i5Var.c();
        int i = a.f4218a[i5Var.t().ordinal()];
        if (i != 1) {
            return i != 2 ? c2 : c2 + "_" + str;
        }
        return c2 + "_" + maxAdFormat.getLabel();
    }
}
