package P;

import C.o0;
import P.e;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f20553a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20554b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20555c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20556d;

    /* renamed from: P.a$a, reason: collision with other inner class name */
    static final class C0418a extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private String f20557a;

        /* renamed from: b, reason: collision with root package name */
        private String f20558b;

        /* renamed from: c, reason: collision with root package name */
        private String f20559c;

        /* renamed from: d, reason: collision with root package name */
        private String f20560d;

        @Override // P.e.a
        public final e a() {
            String str = this.f20557a == null ? " glVersion" : "";
            if (this.f20558b == null) {
                str = str.concat(" eglVersion");
            }
            if (this.f20559c == null) {
                str = U7.d.e(str, " glExtensions");
            }
            if (this.f20560d == null) {
                str = U7.d.e(str, " eglExtensions");
            }
            if (str.isEmpty()) {
                return new a(this.f20557a, this.f20558b, this.f20559c, this.f20560d);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // P.e.a
        public final e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f20560d = str;
            return this;
        }

        @Override // P.e.a
        public final e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f20558b = str;
            return this;
        }

        @Override // P.e.a
        public final e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f20559c = str;
            return this;
        }

        @Override // P.e.a
        public final e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f20557a = str;
            return this;
        }
    }

    a(String str, String str2, String str3, String str4) {
        this.f20553a = str;
        this.f20554b = str2;
        this.f20555c = str3;
        this.f20556d = str4;
    }

    @Override // P.e
    @NonNull
    public final String b() {
        return this.f20556d;
    }

    @Override // P.e
    @NonNull
    public final String c() {
        return this.f20554b;
    }

    @Override // P.e
    @NonNull
    public final String d() {
        return this.f20555c;
    }

    @Override // P.e
    @NonNull
    public final String e() {
        return this.f20553a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f20553a.equals(eVar.e()) && this.f20554b.equals(eVar.c()) && this.f20555c.equals(eVar.d()) && this.f20556d.equals(eVar.b());
    }

    public final int hashCode() {
        return ((((((this.f20553a.hashCode() ^ 1000003) * 1000003) ^ this.f20554b.hashCode()) * 1000003) ^ this.f20555c.hashCode()) * 1000003) ^ this.f20556d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.f20553a);
        sb2.append(", eglVersion=");
        sb2.append(this.f20554b);
        sb2.append(", glExtensions=");
        sb2.append(this.f20555c);
        sb2.append(", eglExtensions=");
        return o0.c(sb2, this.f20556d, "}");
    }
}
