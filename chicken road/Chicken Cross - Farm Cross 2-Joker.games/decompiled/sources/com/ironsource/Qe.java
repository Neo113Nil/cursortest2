package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Qe {

    /* renamed from: a, reason: collision with root package name */
    private final M3 f7862a;
    private final Fd b;
    private final Map<String, C4568o9> c;

    public Qe(M3 configurations, Fd providerOrder, Map<String, C4568o9> providerSettings) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f7862a = configurations;
        this.b = providerOrder;
        this.c = providerSettings;
    }

    public final M3 a() {
        return this.f7862a;
    }

    public final Fd b() {
        return this.b;
    }

    public final Map<String, C4568o9> c() {
        return this.c;
    }

    public final M3 d() {
        return this.f7862a;
    }

    public final Fd e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qe)) {
            return false;
        }
        Qe qe = (Qe) obj;
        return Intrinsics.areEqual(this.f7862a, qe.f7862a) && Intrinsics.areEqual(this.b, qe.b) && Intrinsics.areEqual(this.c, qe.c);
    }

    public final Map<String, C4568o9> f() {
        return this.c;
    }

    public int hashCode() {
        return (((this.f7862a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ServerResponse2(configurations=" + this.f7862a + ", providerOrder=" + this.b + ", providerSettings=" + this.c + ")";
    }

    public final Qe a(M3 configurations, Fd providerOrder, Map<String, C4568o9> providerSettings) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        return new Qe(configurations, providerOrder, providerSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Qe a(Qe qe, M3 m3, Fd fd, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            m3 = qe.f7862a;
        }
        if ((i & 2) != 0) {
            fd = qe.b;
        }
        if ((i & 4) != 0) {
            map = qe.c;
        }
        return qe.a(m3, fd, map);
    }
}
