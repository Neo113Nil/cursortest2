package U5;

import W5.C0538s0;
import a.AbstractC0603a;
import java.util.Arrays;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f6407a;

    /* renamed from: b, reason: collision with root package name */
    public final A f6408b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6409c;

    /* renamed from: d, reason: collision with root package name */
    public final C0538s0 f6410d;

    public B(String str, A a2, long j, C0538s0 c0538s0) {
        this.f6407a = str;
        this.f6408b = a2;
        this.f6409c = j;
        this.f6410d = c0538s0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return AbstractC1464a.t(this.f6407a, b7.f6407a) && AbstractC1464a.t(this.f6408b, b7.f6408b) && this.f6409c == b7.f6409c && AbstractC1464a.t(null, null) && AbstractC1464a.t(this.f6410d, b7.f6410d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6407a, this.f6408b, Long.valueOf(this.f6409c), null, this.f6410d});
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f6407a, "description");
        u02.a(this.f6408b, "severity");
        u02.b("timestampNanos", this.f6409c);
        u02.a(null, "channelRef");
        u02.a(this.f6410d, "subchannelRef");
        return u02.toString();
    }
}
