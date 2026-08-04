package U5;

import W5.C0538s0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f6408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
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
        return p097n3.a.t(this.f6407a, b7.f6407a) && p097n3.a.t(this.f6408b, b7.f6408b) && this.f6409c == b7.f6409c && p097n3.a.t(null, null) && p097n3.a.t(this.f6410d, b7.f6410d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6407a, this.f6408b, Long.valueOf(this.f6409c), null, this.f6410d});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f6407a, "description");
        jVarU0.a(this.f6408b, "severity");
        jVarU0.b("timestampNanos", this.f6409c);
        jVarU0.a(null, "channelRef");
        jVarU0.a(this.f6410d, "subchannelRef");
        return jVarU0.toString();
    }
}
