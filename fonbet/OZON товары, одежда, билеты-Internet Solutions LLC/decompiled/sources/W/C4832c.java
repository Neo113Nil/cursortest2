package W;

import W.AbstractC4830a;
import android.util.Range;
import androidx.annotation.NonNull;

/* renamed from: W.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4832c extends AbstractC4830a {

    /* renamed from: c, reason: collision with root package name */
    private final Range<Integer> f33008c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33009d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33010e;

    /* renamed from: f, reason: collision with root package name */
    private final Range<Integer> f33011f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33012g;

    /* renamed from: W.c$a */
    static final class a extends AbstractC4830a.AbstractC0585a {

        /* renamed from: a, reason: collision with root package name */
        private Range<Integer> f33013a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f33014b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f33015c;

        /* renamed from: d, reason: collision with root package name */
        private Range<Integer> f33016d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f33017e;

        public final AbstractC4830a a() {
            String str = this.f33013a == null ? " bitrate" : "";
            if (this.f33014b == null) {
                str = str.concat(" sourceFormat");
            }
            if (this.f33015c == null) {
                str = U7.d.e(str, " source");
            }
            if (this.f33016d == null) {
                str = U7.d.e(str, " sampleRate");
            }
            if (this.f33017e == null) {
                str = U7.d.e(str, " channelCount");
            }
            if (str.isEmpty()) {
                return new C4832c(this.f33013a, this.f33014b.intValue(), this.f33015c.intValue(), this.f33016d, this.f33017e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final AbstractC4830a.AbstractC0585a b(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f33013a = range;
            return this;
        }

        public final AbstractC4830a.AbstractC0585a c(int i11) {
            this.f33017e = Integer.valueOf(i11);
            return this;
        }

        public final AbstractC4830a.AbstractC0585a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f33016d = range;
            return this;
        }

        public final AbstractC4830a.AbstractC0585a e() {
            this.f33015c = -1;
            return this;
        }

        public final void f() {
            this.f33014b = -1;
        }
    }

    C4832c(Range range, int i11, int i12, Range range2, int i13) {
        this.f33008c = range;
        this.f33009d = i11;
        this.f33010e = i12;
        this.f33011f = range2;
        this.f33012g = i13;
    }

    @Override // W.AbstractC4830a
    @NonNull
    public final Range<Integer> a() {
        return this.f33008c;
    }

    @Override // W.AbstractC4830a
    public final int b() {
        return this.f33012g;
    }

    @Override // W.AbstractC4830a
    @NonNull
    public final Range<Integer> c() {
        return this.f33011f;
    }

    @Override // W.AbstractC4830a
    public final int d() {
        return this.f33010e;
    }

    @Override // W.AbstractC4830a
    public final int e() {
        return this.f33009d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4830a)) {
            return false;
        }
        AbstractC4830a abstractC4830a = (AbstractC4830a) obj;
        return this.f33008c.equals(abstractC4830a.a()) && this.f33009d == abstractC4830a.e() && this.f33010e == abstractC4830a.d() && this.f33011f.equals(abstractC4830a.c()) && this.f33012g == abstractC4830a.b();
    }

    public final int hashCode() {
        return ((((((((this.f33008c.hashCode() ^ 1000003) * 1000003) ^ this.f33009d) * 1000003) ^ this.f33010e) * 1000003) ^ this.f33011f.hashCode()) * 1000003) ^ this.f33012g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpec{bitrate=");
        sb2.append(this.f33008c);
        sb2.append(", sourceFormat=");
        sb2.append(this.f33009d);
        sb2.append(", source=");
        sb2.append(this.f33010e);
        sb2.append(", sampleRate=");
        sb2.append(this.f33011f);
        sb2.append(", channelCount=");
        return K00.b.e(this.f33012g, "}", sb2);
    }
}
