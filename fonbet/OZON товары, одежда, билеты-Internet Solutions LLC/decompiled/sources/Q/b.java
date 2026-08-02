package Q;

import B90.C;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Q.a f22725a;

    /* renamed from: b, reason: collision with root package name */
    private final c f22726b;

    /* renamed from: c, reason: collision with root package name */
    private final C f22727c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22728d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Q.a f22729a = Q.a.f22724a;

        /* renamed from: b, reason: collision with root package name */
        private c f22730b = null;

        /* renamed from: c, reason: collision with root package name */
        private C f22731c = null;

        /* renamed from: d, reason: collision with root package name */
        private int f22732d = 0;

        @NonNull
        public static a b(@NonNull b bVar) {
            a aVar = new a();
            aVar.f22729a = Q.a.f22724a;
            aVar.f22730b = null;
            aVar.f22731c = null;
            aVar.f22732d = 0;
            aVar.f22729a = bVar.b();
            aVar.f22730b = bVar.d();
            aVar.f22731c = bVar.c();
            aVar.f22732d = bVar.a();
            return aVar;
        }

        @NonNull
        public final b a() {
            return new b(this.f22729a, this.f22730b, this.f22731c, this.f22732d);
        }

        @NonNull
        public final void c(int i11) {
            this.f22732d = i11;
        }

        @NonNull
        public final void d(@NonNull Q.a aVar) {
            this.f22729a = aVar;
        }

        @NonNull
        public final void e(@NonNull C c11) {
            this.f22731c = c11;
        }

        @NonNull
        public final void f(@NonNull c cVar) {
            this.f22730b = cVar;
        }
    }

    b(@NonNull Q.a aVar, c cVar, C c11, int i11) {
        this.f22725a = aVar;
        this.f22726b = cVar;
        this.f22727c = c11;
        this.f22728d = i11;
    }

    public final int a() {
        return this.f22728d;
    }

    @NonNull
    public final Q.a b() {
        return this.f22725a;
    }

    public final C c() {
        return this.f22727c;
    }

    public final c d() {
        return this.f22726b;
    }
}
