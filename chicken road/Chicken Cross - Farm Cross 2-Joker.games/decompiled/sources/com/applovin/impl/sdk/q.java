package com.applovin.impl.sdk;

import com.applovin.impl.c3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final p f4502a;
    private final Map b = new HashMap(5);
    private final Object c = new Object();
    private final Map d = Collections.synchronizedMap(new HashMap(5));
    private final Map e = Collections.synchronizedMap(new HashMap(5));

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f4503a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            this.f4503a = str;
            this.b = str2;
            this.c = str3;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f4503a;
        }

        public String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String b = b();
            String b2 = aVar.b();
            if (b != null ? !b.equals(b2) : b2 != null) {
                return false;
            }
            String a2 = a();
            String a3 = aVar.a();
            if (a2 != null ? !a2.equals(a3) : a3 != null) {
                return false;
            }
            String c = c();
            String c2 = aVar.c();
            return c != null ? c.equals(c2) : c2 == null;
        }

        public int hashCode() {
            String b = b();
            int hashCode = b == null ? 43 : b.hashCode();
            String a2 = a();
            int hashCode2 = ((hashCode + 59) * 59) + (a2 == null ? 43 : a2.hashCode());
            String c = c();
            return (hashCode2 * 59) + (c != null ? c.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.b;
        }
    }

    q(l lVar) {
        this.f4502a = lVar.Q();
    }

    public String a(String str) {
        return (String) this.e.get(str);
    }

    public void b(c3 c3Var) {
        this.d.put(c3Var.getAdUnitId(), c3Var.T());
    }

    public void c(c3 c3Var) {
        synchronized (this.c) {
            if (p.a()) {
                this.f4502a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + c3Var);
            }
            this.b.put(c3Var.getAdUnitId(), new a(c3Var.C(), c3Var.c(), c3Var.getNetworkName()));
        }
        this.e.put(c3Var.getAdUnitId(), c3Var.T());
    }

    public void a(c3 c3Var) {
        synchronized (this.c) {
            String adUnitId = c3Var.getAdUnitId();
            a aVar = (a) this.b.get(adUnitId);
            if (aVar == null) {
                if (p.a()) {
                    this.f4502a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (c3Var.C().equals(aVar.b())) {
                if (p.a()) {
                    this.f4502a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.b.remove(adUnitId);
            } else if (p.a()) {
                this.f4502a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + c3Var + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }

    public String b(String str) {
        return (String) this.d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.c) {
            aVar = (a) this.b.get(str);
        }
        return aVar;
    }
}
