package F8;

import u8.InterfaceC9984c;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f9119a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9120b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9121c;

    /* renamed from: d, reason: collision with root package name */
    private final c f9122d;

    /* renamed from: e, reason: collision with root package name */
    private final d f9123e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9124f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9125g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9126h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9127i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9128j;

    /* renamed from: k, reason: collision with root package name */
    private final b f9129k;

    /* renamed from: l, reason: collision with root package name */
    private final String f9130l;

    /* renamed from: m, reason: collision with root package name */
    private final String f9131m;

    /* renamed from: F8.a$a, reason: collision with other inner class name */
    public static final class C0192a {

        /* renamed from: a, reason: collision with root package name */
        private long f9132a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f9133b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f9134c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f9135d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f9136e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f9137f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f9138g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f9139h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f9140i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f9141j = "";

        /* renamed from: k, reason: collision with root package name */
        private b f9142k = b.UNKNOWN_EVENT;

        /* renamed from: l, reason: collision with root package name */
        private String f9143l = "";

        /* renamed from: m, reason: collision with root package name */
        private String f9144m = "";

        C0192a() {
        }

        public final a a() {
            return new a(this.f9132a, this.f9133b, this.f9134c, this.f9135d, this.f9136e, this.f9137f, this.f9138g, this.f9139h, this.f9140i, this.f9141j, this.f9142k, this.f9143l, this.f9144m);
        }

        public final void b(String str) {
            this.f9143l = str;
        }

        public final void c(String str) {
            this.f9138g = str;
        }

        public final void d(String str) {
            this.f9144m = str;
        }

        public final void e(b bVar) {
            this.f9142k = bVar;
        }

        public final void f(String str) {
            this.f9134c = str;
        }

        public final void g(String str) {
            this.f9133b = str;
        }

        public final void h(c cVar) {
            this.f9135d = cVar;
        }

        public final void i(String str) {
            this.f9137f = str;
        }

        public final void j(int i11) {
            this.f9139h = i11;
        }

        public final void k(long j11) {
            this.f9132a = j11;
        }

        public final void l(d dVar) {
            this.f9136e = dVar;
        }

        public final void m(String str) {
            this.f9141j = str;
        }

        public final void n(int i11) {
            this.f9140i = i11;
        }
    }

    public enum b implements InterfaceC9984c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i11) {
            this.number_ = i11;
        }

        @Override // u8.InterfaceC9984c
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum c implements InterfaceC9984c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i11) {
            this.number_ = i11;
        }

        @Override // u8.InterfaceC9984c
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum d implements InterfaceC9984c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i11) {
            this.number_ = i11;
        }

        @Override // u8.InterfaceC9984c
        public final int getNumber() {
            return this.number_;
        }
    }

    static {
        new C0192a().a();
    }

    a(long j11, String str, String str2, c cVar, d dVar, String str3, String str4, int i11, int i12, String str5, b bVar, String str6, String str7) {
        this.f9119a = j11;
        this.f9120b = str;
        this.f9121c = str2;
        this.f9122d = cVar;
        this.f9123e = dVar;
        this.f9124f = str3;
        this.f9125g = str4;
        this.f9126h = i11;
        this.f9127i = i12;
        this.f9128j = str5;
        this.f9129k = bVar;
        this.f9130l = str6;
        this.f9131m = str7;
    }

    public static C0192a n() {
        return new C0192a();
    }

    @u8.d
    public final String a() {
        return this.f9130l;
    }

    @u8.d
    public final String b() {
        return this.f9125g;
    }

    @u8.d
    public final String c() {
        return this.f9131m;
    }

    @u8.d
    public final b d() {
        return this.f9129k;
    }

    @u8.d
    public final String e() {
        return this.f9121c;
    }

    @u8.d
    public final String f() {
        return this.f9120b;
    }

    @u8.d
    public final c g() {
        return this.f9122d;
    }

    @u8.d
    public final String h() {
        return this.f9124f;
    }

    @u8.d
    public final int i() {
        return this.f9126h;
    }

    @u8.d
    public final long j() {
        return this.f9119a;
    }

    @u8.d
    public final d k() {
        return this.f9123e;
    }

    @u8.d
    public final String l() {
        return this.f9128j;
    }

    @u8.d
    public final int m() {
        return this.f9127i;
    }
}
