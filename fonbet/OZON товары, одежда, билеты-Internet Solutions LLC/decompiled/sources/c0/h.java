package c0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import c0.e;

/* loaded from: classes8.dex */
final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f56145a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56146b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5086c0.a f56147c;

    static final class a extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private String f56148a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f56149b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC5086c0.a f56150c;

        @Override // c0.e.a
        public final e a() {
            String str = this.f56148a == null ? " mimeType" : "";
            if (this.f56149b == null) {
                str = str.concat(" profile");
            }
            if (str.isEmpty()) {
                return new h(this.f56148a, this.f56149b.intValue(), this.f56150c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // c0.e.a
        public final e.a b(InterfaceC5086c0.a aVar) {
            this.f56150c = aVar;
            return this;
        }

        protected final void c(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f56148a = str;
        }

        public final Object d(int i11) {
            this.f56149b = Integer.valueOf(i11);
            return this;
        }
    }

    h(String str, int i11, InterfaceC5086c0.a aVar) {
        this.f56145a = str;
        this.f56146b = i11;
        this.f56147c = aVar;
    }

    @Override // c0.j
    @NonNull
    public final String a() {
        return this.f56145a;
    }

    @Override // c0.j
    public final int b() {
        return this.f56146b;
    }

    @Override // c0.e
    public final InterfaceC5086c0.a c() {
        return this.f56147c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f56145a.equals(eVar.a()) || this.f56146b != eVar.b()) {
            return false;
        }
        InterfaceC5086c0.a aVar = this.f56147c;
        return aVar == null ? eVar.c() == null : aVar.equals(eVar.c());
    }

    public final int hashCode() {
        int hashCode = (((this.f56145a.hashCode() ^ 1000003) * 1000003) ^ this.f56146b) * 1000003;
        InterfaceC5086c0.a aVar = this.f56147c;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + this.f56145a + ", profile=" + this.f56146b + ", compatibleAudioProfile=" + this.f56147c + "}";
    }
}
