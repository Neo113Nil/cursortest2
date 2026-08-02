package U5;

import a.AbstractC0603a;
import io.sentry.SentryLogEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final List f6430a;

    /* renamed from: b, reason: collision with root package name */
    public final C0435b f6431b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6432c;

    public K(List list, C0435b c0435b, Object obj) {
        p3.f.k(list, "addresses");
        this.f6430a = Collections.unmodifiableList(new ArrayList(list));
        p3.f.k(c0435b, SentryLogEvent.JsonKeys.ATTRIBUTES);
        this.f6431b = c0435b;
        this.f6432c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K)) {
            return false;
        }
        K k7 = (K) obj;
        return AbstractC1464a.t(this.f6430a, k7.f6430a) && AbstractC1464a.t(this.f6431b, k7.f6431b) && AbstractC1464a.t(this.f6432c, k7.f6432c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6430a, this.f6431b, this.f6432c});
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f6430a, "addresses");
        u02.a(this.f6431b, SentryLogEvent.JsonKeys.ATTRIBUTES);
        u02.a(this.f6432c, "loadBalancingPolicyConfig");
        return u02.toString();
    }
}
