package com.ironsource;

/* loaded from: classes5.dex */
public final class U implements com.ironsource.InterfaceC3299tg {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5988a;
    private final com.ironsource.InterfaceC3149l9 b;
    private final boolean c;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.U.a f5989a = new com.ironsource.U.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.r();
        }
    }

    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.U.b f5990a = new com.ironsource.U.b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.o();
        }
    }

    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.U.c f5991a = new com.ironsource.U.c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.n();
        }
    }

    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.U.d f5992a = new com.ironsource.U.d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.q();
        }
    }

    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.U.e f5993a = new com.ironsource.U.e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.o();
        }
    }

    static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.U.f f5994a = new com.ironsource.U.f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.g();
        }
    }

    public U(java.lang.String adm, com.ironsource.InterfaceC3149l9 interfaceC3149l9, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        this.f5988a = adm;
        this.b = interfaceC3149l9;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC3299tg
    public void a() throws com.ironsource.C3261re {
        a(this.c, com.ironsource.U.a.f5989a);
        a(this.b != null, com.ironsource.U.b.f5990a);
        com.ironsource.InterfaceC3149l9 interfaceC3149l9 = this.b;
        if (interfaceC3149l9 != null) {
            if (interfaceC3149l9.f() == com.ironsource.EnumC3203o9.NonBidder) {
                a(this.f5988a.length() == 0, com.ironsource.U.c.f5991a);
            }
            if (interfaceC3149l9.f() == com.ironsource.EnumC3203o9.Bidder) {
                a(this.f5988a.length() > 0, com.ironsource.U.d.f5992a);
            }
            a(interfaceC3149l9.f() != com.ironsource.EnumC3203o9.NotSupported, com.ironsource.U.e.f5993a);
            a(interfaceC3149l9.e().length() > 0, com.ironsource.U.f.f5994a);
        }
    }

    @Override // com.ironsource.InterfaceC3299tg
    public /* synthetic */ void a(boolean z, kotlin.jvm.functions.Function0 function0) {
        com.ironsource.InterfaceC3299tg.CC.$default$a(this, z, function0);
    }
}
