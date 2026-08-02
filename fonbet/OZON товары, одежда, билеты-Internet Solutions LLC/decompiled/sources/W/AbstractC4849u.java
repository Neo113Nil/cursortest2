package W;

import W.r;
import android.location.Location;
import androidx.annotation.NonNull;

/* renamed from: W.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4849u {

    /* renamed from: a, reason: collision with root package name */
    private final r.b f33136a;

    /* renamed from: W.u$a */
    static abstract class a<T extends AbstractC4849u, B> {
    }

    /* renamed from: W.u$b */
    static abstract class b {

        /* renamed from: W.u$b$a */
        static abstract class a<B> {
        }

        abstract long a();

        abstract long b();

        abstract Location c();
    }

    AbstractC4849u(@NonNull r.b bVar) {
        this.f33136a = bVar;
    }

    public final long a() {
        return this.f33136a.a();
    }

    public final long b() {
        return this.f33136a.b();
    }

    public final Location c() {
        return this.f33136a.c();
    }
}
