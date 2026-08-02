package dev.fluttercommunity.workmanager.pigeon;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final Map<String, Object> e;
    public final Long f;
    public final c g;
    public final C0981b h;
    public final String i;
    public final d j;

    public static final class a {
    }

    public k(String uniqueName, String taskName, long j, Long l, Map<String, ? extends Object> map, Long l2, c cVar, C0981b c0981b, String str, d dVar) {
        Intrinsics.checkNotNullParameter(uniqueName, "uniqueName");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        this.a = uniqueName;
        this.b = taskName;
        this.c = j;
        this.d = l;
        this.e = map;
        this.f = l2;
        this.g = cVar;
        this.h = c0981b;
        this.i = str;
        this.j = dVar;
    }

    public final List<Object> a() {
        return CollectionsKt.listOf(this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.a(a(), ((k) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "PeriodicTaskRequest(uniqueName=" + this.a + ", taskName=" + this.b + ", frequencySeconds=" + this.c + ", flexIntervalSeconds=" + this.d + ", inputData=" + this.e + ", initialDelaySeconds=" + this.f + ", constraints=" + this.g + ", backoffPolicy=" + this.h + ", tag=" + this.i + ", existingWorkPolicy=" + this.j + ')';
    }
}
