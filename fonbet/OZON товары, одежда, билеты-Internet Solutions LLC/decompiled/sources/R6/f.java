package R6;

import R6.l;
import java.util.Arrays;

/* loaded from: classes9.dex */
final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f24712a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f24713b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24714c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f24715d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24716e;

    /* renamed from: f, reason: collision with root package name */
    private final long f24717f;

    /* renamed from: g, reason: collision with root package name */
    private final o f24718g;

    static final class a extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f24719a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f24720b;

        /* renamed from: c, reason: collision with root package name */
        private Long f24721c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f24722d;

        /* renamed from: e, reason: collision with root package name */
        private String f24723e;

        /* renamed from: f, reason: collision with root package name */
        private Long f24724f;

        /* renamed from: g, reason: collision with root package name */
        private o f24725g;

        @Override // R6.l.a
        public final l a() {
            String str = this.f24719a == null ? " eventTimeMs" : "";
            if (this.f24721c == null) {
                str = str.concat(" eventUptimeMs");
            }
            if (this.f24724f == null) {
                str = U7.d.e(str, " timezoneOffsetSeconds");
            }
            if (str.isEmpty()) {
                return new f(this.f24719a.longValue(), this.f24720b, this.f24721c.longValue(), this.f24722d, this.f24723e, this.f24724f.longValue(), this.f24725g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // R6.l.a
        public final l.a b(Integer num) {
            this.f24720b = num;
            return this;
        }

        @Override // R6.l.a
        public final l.a c(long j11) {
            this.f24719a = Long.valueOf(j11);
            return this;
        }

        @Override // R6.l.a
        public final l.a d(long j11) {
            this.f24721c = Long.valueOf(j11);
            return this;
        }

        @Override // R6.l.a
        public final l.a e(o oVar) {
            this.f24725g = oVar;
            return this;
        }

        @Override // R6.l.a
        public final l.a f(long j11) {
            this.f24724f = Long.valueOf(j11);
            return this;
        }

        final l.a g(byte[] bArr) {
            this.f24722d = bArr;
            return this;
        }

        final l.a h(String str) {
            this.f24723e = str;
            return this;
        }
    }

    f(long j11, Integer num, long j12, byte[] bArr, String str, long j13, o oVar) {
        this.f24712a = j11;
        this.f24713b = num;
        this.f24714c = j12;
        this.f24715d = bArr;
        this.f24716e = str;
        this.f24717f = j13;
        this.f24718g = oVar;
    }

    @Override // R6.l
    public final Integer a() {
        return this.f24713b;
    }

    @Override // R6.l
    public final long b() {
        return this.f24712a;
    }

    @Override // R6.l
    public final long c() {
        return this.f24714c;
    }

    @Override // R6.l
    public final o d() {
        return this.f24718g;
    }

    @Override // R6.l
    public final byte[] e() {
        return this.f24715d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f24712a != lVar.b()) {
            return false;
        }
        Integer num = this.f24713b;
        if (num == null) {
            if (lVar.a() != null) {
                return false;
            }
        } else if (!num.equals(lVar.a())) {
            return false;
        }
        if (this.f24714c != lVar.c()) {
            return false;
        }
        if (!Arrays.equals(this.f24715d, lVar instanceof f ? ((f) lVar).f24715d : lVar.e())) {
            return false;
        }
        String str = this.f24716e;
        if (str == null) {
            if (lVar.f() != null) {
                return false;
            }
        } else if (!str.equals(lVar.f())) {
            return false;
        }
        if (this.f24717f != lVar.g()) {
            return false;
        }
        o oVar = this.f24718g;
        return oVar == null ? lVar.d() == null : oVar.equals(lVar.d());
    }

    @Override // R6.l
    public final String f() {
        return this.f24716e;
    }

    @Override // R6.l
    public final long g() {
        return this.f24717f;
    }

    public final int hashCode() {
        long j11 = this.f24712a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f24713b;
        int hashCode = (i11 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j12 = this.f24714c;
        int hashCode2 = (((hashCode ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f24715d)) * 1000003;
        String str = this.f24716e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j13 = this.f24717f;
        int i12 = (hashCode3 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        o oVar = this.f24718g;
        return i12 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f24712a + ", eventCode=" + this.f24713b + ", eventUptimeMs=" + this.f24714c + ", sourceExtension=" + Arrays.toString(this.f24715d) + ", sourceExtensionJsonProto3=" + this.f24716e + ", timezoneOffsetSeconds=" + this.f24717f + ", networkConnectionInfo=" + this.f24718g + "}";
    }
}
