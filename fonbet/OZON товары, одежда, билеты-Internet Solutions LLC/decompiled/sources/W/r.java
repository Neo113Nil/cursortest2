package W;

import W.AbstractC4849u;
import W.C4835f;
import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes8.dex */
public final class r extends AbstractC4849u {

    /* renamed from: b, reason: collision with root package name */
    private final b f33117b;

    public static final class a extends AbstractC4849u.a<r, a> {

        /* renamed from: a, reason: collision with root package name */
        private final b.a f33118a;

        public a(@NonNull File file) {
            C4835f.a aVar = new C4835f.a();
            aVar.d();
            aVar.c();
            x2.i.e(file, "File can't be null.");
            this.f33118a = aVar;
            aVar.b(file);
        }

        @NonNull
        public final r a() {
            return new r(this.f33118a.a());
        }
    }

    static abstract class b extends AbstractC4849u.b {

        static abstract class a extends AbstractC4849u.b.a<a> {
            @NonNull
            abstract C4835f a();

            @NonNull
            abstract C4835f.a b(@NonNull File file);
        }

        b() {
        }

        @NonNull
        abstract File d();
    }

    r(@NonNull b bVar) {
        super(bVar);
        this.f33117b = bVar;
    }

    @NonNull
    public final File d() {
        return this.f33117b.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f33117b.equals(((r) obj).f33117b);
    }

    public final int hashCode() {
        return this.f33117b.hashCode();
    }

    @NonNull
    public final String toString() {
        return this.f33117b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
