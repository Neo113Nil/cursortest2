package W;

import W.r;
import android.location.Location;
import androidx.annotation.NonNull;
import java.io.File;

/* renamed from: W.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4835f extends r.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f33029a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33030b;

    /* renamed from: c, reason: collision with root package name */
    private final File f33031c;

    /* renamed from: W.f$a */
    static final class a extends r.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f33032a;

        /* renamed from: b, reason: collision with root package name */
        private Long f33033b;

        /* renamed from: c, reason: collision with root package name */
        private File f33034c;

        @Override // W.r.b.a
        final C4835f a() {
            String str = this.f33032a == null ? " fileSizeLimit" : "";
            if (this.f33033b == null) {
                str = str.concat(" durationLimitMillis");
            }
            if (this.f33034c == null) {
                str = U7.d.e(str, " file");
            }
            if (str.isEmpty()) {
                return new C4835f(this.f33032a.longValue(), this.f33033b.longValue(), this.f33034c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // W.r.b.a
        final a b(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f33034c = file;
            return this;
        }

        final Object c() {
            this.f33033b = 0L;
            return this;
        }

        final Object d() {
            this.f33032a = 0L;
            return this;
        }
    }

    C4835f(long j11, long j12, File file) {
        this.f33029a = j11;
        this.f33030b = j12;
        this.f33031c = file;
    }

    @Override // W.AbstractC4849u.b
    final long a() {
        return this.f33030b;
    }

    @Override // W.AbstractC4849u.b
    final long b() {
        return this.f33029a;
    }

    @Override // W.AbstractC4849u.b
    final Location c() {
        return null;
    }

    @Override // W.r.b
    @NonNull
    final File d() {
        return this.f33031c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.b)) {
            return false;
        }
        r.b bVar = (r.b) obj;
        return this.f33029a == bVar.b() && this.f33030b == bVar.a() && bVar.c() == null && this.f33031c.equals(bVar.d());
    }

    public final int hashCode() {
        long j11 = this.f33029a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.f33030b;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * (-721379959)) ^ this.f33031c.hashCode();
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f33029a + ", durationLimitMillis=" + this.f33030b + ", location=null, file=" + this.f33031c + "}";
    }
}
