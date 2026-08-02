package Hj0;

import java.util.List;
import kotlin.collections.C7714v;
import pf0.AbstractC8919b;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* renamed from: Hj0.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3162t extends pf0.i {

    /* renamed from: a, reason: collision with root package name */
    private final a f11191a = new a();

    /* renamed from: Hj0.t$a */
    public static final class a extends AbstractC8919b.c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC8919b.AbstractC1361b.f f11192a = AbstractC8919b.AbstractC1361b.f.f80508b;

        /* renamed from: b, reason: collision with root package name */
        private final String f11193b = "9.1.4";

        a() {
        }

        @Override // pf0.AbstractC8919b.c
        public final AbstractC8919b.AbstractC1361b getName() {
            return this.f11192a;
        }

        @Override // pf0.AbstractC8919b.c
        public final String getVersion() {
            return this.f11193b;
        }
    }

    /* renamed from: Hj0.t$b */
    public static final class b extends AbstractC8922e {

        /* renamed from: a, reason: collision with root package name */
        private final Mj0.e f11194a = Mj0.e.f18152a;

        /* renamed from: b, reason: collision with root package name */
        private final pf0.j f11195b = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC8923f f11196c = EnumC8923f.AppInterceptor;

        /* renamed from: d, reason: collision with root package name */
        private final String f11197d = "TrackerSDKGzip";

        b() {
        }

        @Override // pf0.AbstractC8922e
        public final We.B getInterceptor() {
            return this.f11194a;
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f11197d;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f11195b;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f11196c;
        }
    }

    C3162t() {
    }

    @Override // pf0.i
    public final AbstractC8919b getConsumer() {
        return this.f11191a;
    }

    @Override // pf0.i
    public final List<AbstractC8922e> getInterceptors() {
        return C7714v.a0(new b());
    }
}
