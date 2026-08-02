package C;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final List<U> f4084a;

    /* renamed from: b, reason: collision with root package name */
    private final List<U> f4085b;

    /* renamed from: c, reason: collision with root package name */
    private final List<U> f4086c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4087d;

    C(a aVar) {
        this.f4084a = Collections.unmodifiableList(aVar.f4088a);
        this.f4085b = Collections.unmodifiableList(aVar.f4089b);
        this.f4086c = Collections.unmodifiableList(aVar.f4090c);
        this.f4087d = aVar.f4091d;
    }

    public final long a() {
        return this.f4087d;
    }

    @NonNull
    public final List<U> b() {
        return this.f4085b;
    }

    @NonNull
    public final List<U> c() {
        return this.f4084a;
    }

    @NonNull
    public final List<U> d() {
        return this.f4086c;
    }

    public final boolean e() {
        return this.f4087d > 0;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f4088a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f4089b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f4090c;

        /* renamed from: d, reason: collision with root package name */
        long f4091d;

        public a(@NonNull U u11) {
            ArrayList arrayList = new ArrayList();
            this.f4088a = arrayList;
            this.f4089b = new ArrayList();
            this.f4090c = new ArrayList();
            this.f4091d = 5000L;
            arrayList.add(u11);
        }

        @NonNull
        public final C a() {
            return new C(this);
        }

        @NonNull
        public final void b() {
            this.f4091d = 0L;
        }

        @NonNull
        public final void c(int i11) {
            if ((i11 & 1) != 0) {
                this.f4088a.clear();
            }
            if ((i11 & 2) != 0) {
                this.f4089b.clear();
            }
            if ((i11 & 4) != 0) {
                this.f4090c.clear();
            }
        }

        @NonNull
        public final void d() {
            this.f4091d = TimeUnit.MILLISECONDS.toMillis(2000L);
        }

        public a(@NonNull C c11) {
            ArrayList arrayList = new ArrayList();
            this.f4088a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f4089b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f4090c = arrayList3;
            this.f4091d = 5000L;
            arrayList.addAll(c11.c());
            arrayList2.addAll(c11.b());
            arrayList3.addAll(c11.d());
            this.f4091d = c11.a();
        }
    }
}
