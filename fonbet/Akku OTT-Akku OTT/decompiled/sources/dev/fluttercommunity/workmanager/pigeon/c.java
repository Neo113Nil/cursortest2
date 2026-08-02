package dev.fluttercommunity.workmanager.pigeon;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class c {
    public static final a Companion = new a();
    public final h a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public static final class a {
    }

    public c() {
        this(null, null, null, null, null);
    }

    public final List<Object> a() {
        return CollectionsKt.listOf(this.a, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.a(a(), ((c) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "Constraints(networkType=" + this.a + ", requiresBatteryNotLow=" + this.b + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresStorageNotLow=" + this.e + ')';
    }

    public c(h hVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.a = hVar;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
    }
}
