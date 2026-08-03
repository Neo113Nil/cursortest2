package com.ironsource;

/* renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2964b3 implements com.ironsource.InterfaceC3299tg {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Bb f6148a;
    private final com.unity3d.ironsourceads.AdSize b;

    /* renamed from: com.ironsource.b3$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C2964b3.a f6149a = new com.ironsource.C2964b3.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.a("Load task config is null");
        }
    }

    /* renamed from: com.ironsource.b3$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C2964b3.b f6150a = new com.ironsource.C2964b3.b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.l();
        }
    }

    public C2964b3(com.ironsource.Bb bb, com.unity3d.ironsourceads.AdSize adSize) {
        this.f6148a = bb;
        this.b = adSize;
    }

    @Override // com.ironsource.InterfaceC3299tg
    public void a() {
        a(this.f6148a != null, com.ironsource.C2964b3.a.f6149a);
        a(this.b != null, com.ironsource.C2964b3.b.f6150a);
    }

    @Override // com.ironsource.InterfaceC3299tg
    public /* synthetic */ void a(boolean z, kotlin.jvm.functions.Function0 function0) {
        com.ironsource.InterfaceC3299tg.CC.$default$a(this, z, function0);
    }
}
