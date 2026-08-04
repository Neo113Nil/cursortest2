package U5;

import io.sentry.SentryLogEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0435b f6431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6432c;

    public K(List list, C0435b c0435b, Object obj) {
        p113p3.f.k(list, "addresses");
        this.f6430a = Collections.unmodifiableList(new ArrayList(list));
        p113p3.f.k(c0435b, SentryLogEvent.JsonKeys.ATTRIBUTES);
        this.f6431b = c0435b;
        this.f6432c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K)) {
            return false;
        }
        K k7 = (K) obj;
        return p097n3.a.t(this.f6430a, k7.f6430a) && p097n3.a.t(this.f6431b, k7.f6431b) && p097n3.a.t(this.f6432c, k7.f6432c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6430a, this.f6431b, this.f6432c});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f6430a, "addresses");
        jVarU0.a(this.f6431b, SentryLogEvent.JsonKeys.ATTRIBUTES);
        jVarU0.a(this.f6432c, "loadBalancingPolicyConfig");
        return jVarU0.toString();
    }
}
