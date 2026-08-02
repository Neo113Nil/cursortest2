package R6;

import R6.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f24726a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24727b;

    /* renamed from: c, reason: collision with root package name */
    private final k f24728c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f24729d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24730e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f24731f;

    /* renamed from: g, reason: collision with root package name */
    private final p f24732g;

    static final class a extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f24733a;

        /* renamed from: b, reason: collision with root package name */
        private Long f24734b;

        /* renamed from: c, reason: collision with root package name */
        private k f24735c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f24736d;

        /* renamed from: e, reason: collision with root package name */
        private String f24737e;

        /* renamed from: f, reason: collision with root package name */
        private ArrayList f24738f;

        /* renamed from: g, reason: collision with root package name */
        private p f24739g;

        @Override // R6.m.a
        public final m a() {
            String str = this.f24733a == null ? " requestTimeMs" : "";
            if (this.f24734b == null) {
                str = str.concat(" requestUptimeMs");
            }
            if (str.isEmpty()) {
                return new g(this.f24733a.longValue(), this.f24734b.longValue(), this.f24735c, this.f24736d, this.f24737e, this.f24738f, this.f24739g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // R6.m.a
        public final m.a b(k kVar) {
            this.f24735c = kVar;
            return this;
        }

        @Override // R6.m.a
        public final m.a c(ArrayList arrayList) {
            this.f24738f = arrayList;
            return this;
        }

        @Override // R6.m.a
        final m.a d(Integer num) {
            this.f24736d = num;
            return this;
        }

        @Override // R6.m.a
        final m.a e(String str) {
            this.f24737e = str;
            return this;
        }

        @Override // R6.m.a
        public final m.a f(p pVar) {
            this.f24739g = pVar;
            return this;
        }

        @Override // R6.m.a
        public final m.a g(long j11) {
            this.f24733a = Long.valueOf(j11);
            return this;
        }

        @Override // R6.m.a
        public final m.a h(long j11) {
            this.f24734b = Long.valueOf(j11);
            return this;
        }
    }

    private g() {
        throw null;
    }

    g(long j11, long j12, k kVar, Integer num, String str, ArrayList arrayList, p pVar) {
        this.f24726a = j11;
        this.f24727b = j12;
        this.f24728c = kVar;
        this.f24729d = num;
        this.f24730e = str;
        this.f24731f = arrayList;
        this.f24732g = pVar;
    }

    @Override // R6.m
    public final k b() {
        return this.f24728c;
    }

    @Override // R6.m
    public final List<l> c() {
        return this.f24731f;
    }

    @Override // R6.m
    public final Integer d() {
        return this.f24729d;
    }

    @Override // R6.m
    public final String e() {
        return this.f24730e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f24726a != mVar.g() || this.f24727b != mVar.h()) {
            return false;
        }
        k kVar = this.f24728c;
        if (kVar == null) {
            if (mVar.b() != null) {
                return false;
            }
        } else if (!kVar.equals(mVar.b())) {
            return false;
        }
        Integer num = this.f24729d;
        if (num == null) {
            if (mVar.d() != null) {
                return false;
            }
        } else if (!num.equals(mVar.d())) {
            return false;
        }
        String str = this.f24730e;
        if (str == null) {
            if (mVar.e() != null) {
                return false;
            }
        } else if (!str.equals(mVar.e())) {
            return false;
        }
        ArrayList arrayList = this.f24731f;
        if (arrayList == null) {
            if (mVar.c() != null) {
                return false;
            }
        } else if (!arrayList.equals(mVar.c())) {
            return false;
        }
        p pVar = this.f24732g;
        return pVar == null ? mVar.f() == null : pVar.equals(mVar.f());
    }

    @Override // R6.m
    public final p f() {
        return this.f24732g;
    }

    @Override // R6.m
    public final long g() {
        return this.f24726a;
    }

    @Override // R6.m
    public final long h() {
        return this.f24727b;
    }

    public final int hashCode() {
        long j11 = this.f24726a;
        long j12 = this.f24727b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        k kVar = this.f24728c;
        int hashCode = (i11 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f24729d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f24730e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f24731f;
        int hashCode4 = (hashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        p pVar = this.f24732g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f24726a + ", requestUptimeMs=" + this.f24727b + ", clientInfo=" + this.f24728c + ", logSource=" + this.f24729d + ", logSourceName=" + this.f24730e + ", logEvents=" + this.f24731f + ", qosTier=" + this.f24732g + "}";
    }
}
