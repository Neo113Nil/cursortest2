package V6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final f f28325a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f28326b;

    /* renamed from: c, reason: collision with root package name */
    private final b f28327c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28328d;

    /* renamed from: V6.a$a, reason: collision with other inner class name */
    public static final class C0577a {

        /* renamed from: a, reason: collision with root package name */
        private f f28329a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f28330b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f28331c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f28332d = "";

        C0577a() {
        }

        public final void a(d dVar) {
            this.f28330b.add(dVar);
        }

        public final a b() {
            return new a(this.f28329a, Collections.unmodifiableList(this.f28330b), this.f28331c, this.f28332d);
        }

        public final void c(String str) {
            this.f28332d = str;
        }

        public final void d(b bVar) {
            this.f28331c = bVar;
        }

        public final void e(f fVar) {
            this.f28329a = fVar;
        }
    }

    static {
        new C0577a().b();
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f28325a = fVar;
        this.f28326b = list;
        this.f28327c = bVar;
        this.f28328d = str;
    }

    public static C0577a e() {
        return new C0577a();
    }

    @u8.d
    public final String a() {
        return this.f28328d;
    }

    @u8.d
    public final b b() {
        return this.f28327c;
    }

    @u8.d
    public final List<d> c() {
        return this.f28326b;
    }

    @u8.d
    public final f d() {
        return this.f28325a;
    }
}
