package dev.fluttercommunity.workmanager.pigeon;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final Map<String, Object> c;
    public final Long d;
    public final h e;
    public final Boolean f;

    public static final class a {
    }

    public l(String uniqueName, String taskName, Map<String, ? extends Object> map, Long l, h hVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(uniqueName, "uniqueName");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        this.a = uniqueName;
        this.b = taskName;
        this.c = map;
        this.d = l;
        this.e = hVar;
        this.f = bool;
    }

    public final List<Object> a() {
        return CollectionsKt.listOf(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.a(a(), ((l) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "ProcessingTaskRequest(uniqueName=" + this.a + ", taskName=" + this.b + ", inputData=" + this.c + ", initialDelaySeconds=" + this.d + ", networkType=" + this.e + ", requiresCharging=" + this.f + ')';
    }
}
