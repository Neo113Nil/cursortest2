package dev.fluttercommunity.workmanager.pigeon;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final Map<String, Object> c;
    public final Long d;
    public final c e;
    public final C0981b f;
    public final String g;
    public final e h;
    public final j i;

    public static final class a {
    }

    public i(String uniqueName, String taskName, Map<String, ? extends Object> map, Long l, c cVar, C0981b c0981b, String str, e eVar, j jVar) {
        Intrinsics.checkNotNullParameter(uniqueName, "uniqueName");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        this.a = uniqueName;
        this.b = taskName;
        this.c = map;
        this.d = l;
        this.e = cVar;
        this.f = c0981b;
        this.g = str;
        this.h = eVar;
        this.i = jVar;
    }

    public final List<Object> a() {
        return CollectionsKt.listOf(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.a(a(), ((i) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "OneOffTaskRequest(uniqueName=" + this.a + ", taskName=" + this.b + ", inputData=" + this.c + ", initialDelaySeconds=" + this.d + ", constraints=" + this.e + ", backoffPolicy=" + this.f + ", tag=" + this.g + ", existingWorkPolicy=" + this.h + ", outOfQuotaPolicy=" + this.i + ')';
    }
}
