package V6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f28339a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f28340b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f28341a = "";

        /* renamed from: b, reason: collision with root package name */
        private List<c> f28342b = new ArrayList();

        a() {
        }

        public final d a() {
            return new d(this.f28341a, Collections.unmodifiableList(this.f28342b));
        }

        public final void b(List list) {
            this.f28342b = list;
        }

        public final void c(String str) {
            this.f28341a = str;
        }
    }

    static {
        new a().a();
    }

    d(String str, List<c> list) {
        this.f28339a = str;
        this.f28340b = list;
    }

    public static a c() {
        return new a();
    }

    @u8.d
    public final List<c> a() {
        return this.f28340b;
    }

    @u8.d
    public final String b() {
        return this.f28339a;
    }
}
