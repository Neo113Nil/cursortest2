package Y6;

import Y6.e;
import b7.InterfaceC5572a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5572a f34645a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f34646b;

    b(InterfaceC5572a interfaceC5572a, HashMap hashMap) {
        if (interfaceC5572a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f34645a = interfaceC5572a;
        if (hashMap == null) {
            throw new NullPointerException("Null values");
        }
        this.f34646b = hashMap;
    }

    @Override // Y6.e
    final InterfaceC5572a a() {
        return this.f34645a;
    }

    @Override // Y6.e
    final Map<Q6.e, e.b> c() {
        return this.f34646b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f34645a.equals(eVar.a()) && this.f34646b.equals(eVar.c());
    }

    public final int hashCode() {
        return ((this.f34645a.hashCode() ^ 1000003) * 1000003) ^ this.f34646b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f34645a + ", values=" + this.f34646b + "}";
    }
}
