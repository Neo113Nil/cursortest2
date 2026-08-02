package dev.fluttercommunity.workmanager;

import androidx.compose.runtime.t;
import androidx.media3.session.C0510i;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public final String a;
    public final String b;
    public final Map<String, Object> c;
    public final long d;
    public final Long e;
    public final String f;

    public f() {
        throw null;
    }

    public f(String taskName, String str, Map map, long j, Long l, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        l = (i & 16) != 0 ? null : l;
        str2 = (i & 32) != 0 ? null : str2;
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        this.a = taskName;
        this.b = str;
        this.c = map;
        this.d = j;
        this.e = l;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b) && Intrinsics.areEqual(this.c, fVar.c) && this.d == fVar.d && Intrinsics.areEqual(this.e, fVar.e) && Intrinsics.areEqual(this.f, fVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.c;
        int a = C0510i.a(this.d, (hashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31);
        Long l = this.e;
        int hashCode3 = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskDebugInfo(taskName=");
        sb.append(this.a);
        sb.append(", uniqueName=");
        sb.append(this.b);
        sb.append(", inputData=");
        sb.append(this.c);
        sb.append(", startTime=");
        sb.append(this.d);
        sb.append(", callbackHandle=");
        sb.append(this.e);
        sb.append(", callbackInfo=");
        return t.b(')', this.f, sb);
    }
}
