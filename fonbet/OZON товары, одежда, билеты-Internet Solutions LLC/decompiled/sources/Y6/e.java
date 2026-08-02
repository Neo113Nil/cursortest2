package Y6;

import Y6.c;
import b7.InterfaceC5572a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public abstract class e {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC5572a f34656a;

        /* renamed from: b, reason: collision with root package name */
        private HashMap f34657b = new HashMap();

        public final void a(Q6.e eVar, b bVar) {
            this.f34657b.put(eVar, bVar);
        }

        public final e b() {
            if (this.f34656a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f34657b.keySet().size() < Q6.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            HashMap hashMap = this.f34657b;
            this.f34657b = new HashMap();
            return new Y6.b(this.f34656a, hashMap);
        }

        public final void c(InterfaceC5572a interfaceC5572a) {
            this.f34656a = interfaceC5572a;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j11);

            public abstract a c(Set<c> set);

            public abstract a d();
        }

        public static a a() {
            c.a aVar = new c.a();
            aVar.c(Collections.EMPTY_SET);
            return aVar;
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c DEVICE_CHARGING;
        public static final c DEVICE_IDLE;
        public static final c NETWORK_UNMETERED;

        static {
            c cVar = new c("NETWORK_UNMETERED", 0);
            NETWORK_UNMETERED = cVar;
            c cVar2 = new c("DEVICE_IDLE", 1);
            DEVICE_IDLE = cVar2;
            c cVar3 = new c("DEVICE_CHARGING", 2);
            DEVICE_CHARGING = cVar3;
            $VALUES = new c[]{cVar, cVar2, cVar3};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    abstract InterfaceC5572a a();

    public final long b(Q6.e eVar, long j11, int i11) {
        long t2 = j11 - a().t();
        b bVar = c().get(eVar);
        long b11 = bVar.b();
        return Math.min(Math.max((long) (Math.pow(3.0d, i11 - 1) * b11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((b11 > 1 ? b11 : 2L) * r12))), t2), bVar.d());
    }

    abstract Map<Q6.e, b> c();
}
