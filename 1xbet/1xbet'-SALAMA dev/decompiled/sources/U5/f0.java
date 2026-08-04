package U5;

import io.sentry.SentryLogEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0435b f6495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f6496c;

    public f0(List list, C0435b c0435b, e0 e0Var) {
        this.f6494a = Collections.unmodifiableList(new ArrayList(list));
        p113p3.f.k(c0435b, SentryLogEvent.JsonKeys.ATTRIBUTES);
        this.f6495b = c0435b;
        this.f6496c = e0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p097n3.a.t(this.f6494a, f0Var.f6494a) && p097n3.a.t(this.f6495b, f0Var.f6495b) && p097n3.a.t(this.f6496c, f0Var.f6496c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6494a, this.f6495b, this.f6496c});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f6494a, "addresses");
        jVarU0.a(this.f6495b, SentryLogEvent.JsonKeys.ATTRIBUTES);
        jVarU0.a(this.f6496c, "serviceConfig");
        return jVarU0.toString();
    }
}
