package W;

import W.K;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import x2.InterfaceC10646a;

/* renamed from: W.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4840k extends K.i {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC4849u f33078h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f33079i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC10646a<t0> f33080j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f33081k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f33082l;

    /* renamed from: m, reason: collision with root package name */
    private final long f33083m;

    C4840k(AbstractC4849u abstractC4849u, Executor executor, InterfaceC10646a<t0> interfaceC10646a, boolean z11, boolean z12, long j11) {
        if (abstractC4849u == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f33078h = abstractC4849u;
        this.f33079i = executor;
        this.f33080j = interfaceC10646a;
        this.f33081k = z11;
        this.f33082l = z12;
        this.f33083m = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K.i)) {
            return false;
        }
        K.i iVar = (K.i) obj;
        if (!this.f33078h.equals(iVar.m())) {
            return false;
        }
        Executor executor = this.f33079i;
        if (executor == null) {
            if (iVar.j() != null) {
                return false;
            }
        } else if (!executor.equals(iVar.j())) {
            return false;
        }
        InterfaceC10646a<t0> interfaceC10646a = this.f33080j;
        if (interfaceC10646a == null) {
            if (iVar.k() != null) {
                return false;
            }
        } else if (!interfaceC10646a.equals(iVar.k())) {
            return false;
        }
        return this.f33081k == iVar.q() && this.f33082l == iVar.t() && this.f33083m == iVar.o();
    }

    public final int hashCode() {
        int hashCode = (this.f33078h.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f33079i;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        InterfaceC10646a<t0> interfaceC10646a = this.f33080j;
        int hashCode3 = (((hashCode2 ^ (interfaceC10646a != null ? interfaceC10646a.hashCode() : 0)) * 1000003) ^ (this.f33081k ? 1231 : 1237)) * 1000003;
        int i11 = this.f33082l ? 1231 : 1237;
        long j11 = this.f33083m;
        return ((hashCode3 ^ i11) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    @Override // W.K.i
    final Executor j() {
        return this.f33079i;
    }

    @Override // W.K.i
    final InterfaceC10646a<t0> k() {
        return this.f33080j;
    }

    @Override // W.K.i
    @NonNull
    final AbstractC4849u m() {
        return this.f33078h;
    }

    @Override // W.K.i
    final long o() {
        return this.f33083m;
    }

    @Override // W.K.i
    final boolean q() {
        return this.f33081k;
    }

    @Override // W.K.i
    final boolean t() {
        return this.f33082l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb2.append(this.f33078h);
        sb2.append(", getCallbackExecutor=");
        sb2.append(this.f33079i);
        sb2.append(", getEventListener=");
        sb2.append(this.f33080j);
        sb2.append(", hasAudioEnabled=");
        sb2.append(this.f33081k);
        sb2.append(", isPersistent=");
        sb2.append(this.f33082l);
        sb2.append(", getRecordingId=");
        return P4.f.a(this.f33083m, "}", sb2);
    }
}
