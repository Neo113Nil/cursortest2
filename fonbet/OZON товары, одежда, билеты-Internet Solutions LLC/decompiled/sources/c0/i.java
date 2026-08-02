package c0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import c0.n;

/* loaded from: classes8.dex */
final class i extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f56151a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56152b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5086c0.c f56153c;

    static final class a extends n.a {

        /* renamed from: a, reason: collision with root package name */
        private String f56154a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f56155b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC5086c0.c f56156c;

        public final n a() {
            String str = this.f56154a == null ? " mimeType" : "";
            if (this.f56155b == null) {
                str = str.concat(" profile");
            }
            if (str.isEmpty()) {
                return new i(this.f56154a, this.f56155b.intValue(), this.f56156c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final n.a b(InterfaceC5086c0.c cVar) {
            this.f56156c = cVar;
            return this;
        }

        protected final void c(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f56154a = str;
        }

        public final Object d(int i11) {
            this.f56155b = -1;
            return this;
        }
    }

    i(String str, int i11, InterfaceC5086c0.c cVar) {
        this.f56151a = str;
        this.f56152b = i11;
        this.f56153c = cVar;
    }

    @Override // c0.j
    @NonNull
    public final String a() {
        return this.f56151a;
    }

    @Override // c0.j
    public final int b() {
        return this.f56152b;
    }

    @Override // c0.n
    public final InterfaceC5086c0.c c() {
        return this.f56153c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f56151a.equals(nVar.a()) || this.f56152b != nVar.b()) {
            return false;
        }
        InterfaceC5086c0.c cVar = this.f56153c;
        return cVar == null ? nVar.c() == null : cVar.equals(nVar.c());
    }

    public final int hashCode() {
        int hashCode = (((this.f56151a.hashCode() ^ 1000003) * 1000003) ^ this.f56152b) * 1000003;
        InterfaceC5086c0.c cVar = this.f56153c;
        return hashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f56151a + ", profile=" + this.f56152b + ", compatibleVideoProfile=" + this.f56153c + "}";
    }
}
