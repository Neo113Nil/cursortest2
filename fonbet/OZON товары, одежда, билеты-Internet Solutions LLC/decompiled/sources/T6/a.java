package T6;

import T6.f;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes9.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f26672a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26673b;

    /* renamed from: T6.a$a, reason: collision with other inner class name */
    static final class C0532a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList f26674a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f26675b;

        @Override // T6.f.a
        public final f a() {
            String str = this.f26674a == null ? " events" : "";
            if (str.isEmpty()) {
                return new a(this.f26674a, this.f26675b);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // T6.f.a
        public final f.a b(ArrayList arrayList) {
            this.f26674a = arrayList;
            return this;
        }

        @Override // T6.f.a
        public final f.a c(byte[] bArr) {
            this.f26675b = bArr;
            return this;
        }
    }

    private a() {
        throw null;
    }

    a(ArrayList arrayList, byte[] bArr) {
        this.f26672a = arrayList;
        this.f26673b = bArr;
    }

    @Override // T6.f
    public final Iterable<S6.m> b() {
        return this.f26672a;
    }

    @Override // T6.f
    public final byte[] c() {
        return this.f26673b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f26672a.equals(fVar.b())) {
            return Arrays.equals(this.f26673b, fVar instanceof a ? ((a) fVar).f26673b : fVar.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f26672a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26673b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f26672a + ", extras=" + Arrays.toString(this.f26673b) + "}";
    }
}
