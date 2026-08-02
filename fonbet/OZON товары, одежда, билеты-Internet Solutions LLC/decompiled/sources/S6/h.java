package S6;

import S6.m;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
final class h extends m {

    /* renamed from: a, reason: collision with root package name */
    private final String f25893a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f25894b;

    /* renamed from: c, reason: collision with root package name */
    private final l f25895c;

    /* renamed from: d, reason: collision with root package name */
    private final long f25896d;

    /* renamed from: e, reason: collision with root package name */
    private final long f25897e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f25898f;

    static final class a extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private String f25899a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f25900b;

        /* renamed from: c, reason: collision with root package name */
        private l f25901c;

        /* renamed from: d, reason: collision with root package name */
        private Long f25902d;

        /* renamed from: e, reason: collision with root package name */
        private Long f25903e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap f25904f;

        @Override // S6.m.a
        public final m d() {
            String str = this.f25899a == null ? " transportName" : "";
            if (this.f25901c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.f25902d == null) {
                str = U7.d.e(str, " eventMillis");
            }
            if (this.f25903e == null) {
                str = U7.d.e(str, " uptimeMillis");
            }
            if (this.f25904f == null) {
                str = U7.d.e(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f25899a, this.f25900b, this.f25901c, this.f25902d.longValue(), this.f25903e.longValue(), this.f25904f);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // S6.m.a
        protected final Map<String, String> e() {
            HashMap hashMap = this.f25904f;
            if (hashMap != null) {
                return hashMap;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // S6.m.a
        public final m.a f(Integer num) {
            this.f25900b = num;
            return this;
        }

        @Override // S6.m.a
        public final m.a g(l lVar) {
            if (lVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f25901c = lVar;
            return this;
        }

        @Override // S6.m.a
        public final m.a h(long j11) {
            this.f25902d = Long.valueOf(j11);
            return this;
        }

        @Override // S6.m.a
        public final m.a i(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f25899a = str;
            return this;
        }

        @Override // S6.m.a
        public final m.a j(long j11) {
            this.f25903e = Long.valueOf(j11);
            return this;
        }

        protected final m.a k(HashMap hashMap) {
            this.f25904f = hashMap;
            return this;
        }
    }

    h(String str, Integer num, l lVar, long j11, long j12, HashMap hashMap) {
        this.f25893a = str;
        this.f25894b = num;
        this.f25895c = lVar;
        this.f25896d = j11;
        this.f25897e = j12;
        this.f25898f = hashMap;
    }

    @Override // S6.m
    protected final Map<String, String> c() {
        return this.f25898f;
    }

    @Override // S6.m
    public final Integer d() {
        return this.f25894b;
    }

    @Override // S6.m
    public final l e() {
        return this.f25895c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f25893a.equals(mVar.j())) {
            return false;
        }
        Integer num = this.f25894b;
        if (num == null) {
            if (mVar.d() != null) {
                return false;
            }
        } else if (!num.equals(mVar.d())) {
            return false;
        }
        return this.f25895c.equals(mVar.e()) && this.f25896d == mVar.f() && this.f25897e == mVar.k() && this.f25898f.equals(mVar.c());
    }

    @Override // S6.m
    public final long f() {
        return this.f25896d;
    }

    public final int hashCode() {
        int hashCode = (this.f25893a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f25894b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f25895c.hashCode()) * 1000003;
        long j11 = this.f25896d;
        int i11 = (hashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f25897e;
        return ((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ this.f25898f.hashCode();
    }

    @Override // S6.m
    public final String j() {
        return this.f25893a;
    }

    @Override // S6.m
    public final long k() {
        return this.f25897e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f25893a + ", code=" + this.f25894b + ", encodedPayload=" + this.f25895c + ", eventMillis=" + this.f25896d + ", uptimeMillis=" + this.f25897e + ", autoMetadata=" + this.f25898f + "}";
    }
}
