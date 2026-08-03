package com.ironsource;

/* renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3382y9 implements com.ironsource.InterfaceC3299tg {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Bb f6850a;

    /* renamed from: com.ironsource.y9$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3382y9.a f6851a = new com.ironsource.C3382y9.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.b("Load task config is null");
        }
    }

    public C3382y9(com.ironsource.Bb bb) {
        this.f6850a = bb;
    }

    @Override // com.ironsource.InterfaceC3299tg
    public void a() {
        a(this.f6850a != null, com.ironsource.C3382y9.a.f6851a);
    }

    @Override // com.ironsource.InterfaceC3299tg
    public /* synthetic */ void a(boolean z, kotlin.jvm.functions.Function0 function0) {
        com.ironsource.InterfaceC3299tg.CC.$default$a(this, z, function0);
    }
}
