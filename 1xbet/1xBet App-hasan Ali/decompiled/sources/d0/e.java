package d0;

import e2.C1930k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f16847a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16848b;

    /* renamed from: c, reason: collision with root package name */
    public final f f16849c;

    /* renamed from: d, reason: collision with root package name */
    public final C1930k f16850d;

    public e(int i, long j5, f fVar, C1930k c1930k) {
        this.f16847a = i;
        this.f16848b = j5;
        this.f16849c = fVar;
        this.f16850d = c1930k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16847a == eVar.f16847a && this.f16848b == eVar.f16848b && this.f16849c == eVar.f16849c && l.a(this.f16850d, eVar.f16850d);
    }

    public final int hashCode() {
        int i = this.f16847a * 31;
        long j5 = this.f16848b;
        int hashCode = (this.f16849c.hashCode() + ((i + ((int) (j5 ^ (j5 >>> 32)))) * 31)) * 31;
        C1930k c1930k = this.f16850d;
        return hashCode + (c1930k == null ? 0 : c1930k.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f16847a + ", timestamp=" + this.f16848b + ", type=" + this.f16849c + ", structureCompat=" + this.f16850d + ')';
    }
}
