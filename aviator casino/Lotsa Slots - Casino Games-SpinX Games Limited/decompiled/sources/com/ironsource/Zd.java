package com.ironsource;

/* loaded from: classes5.dex */
public final class Zd implements com.ironsource.InterfaceC3299tg {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Bb f6119a;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.logger.IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Zd.a f6120a = new com.ironsource.Zd.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.logger.IronSourceError invoke() {
            return com.ironsource.C3306u5.f6757a.d("Load task config is null");
        }
    }

    public Zd(com.ironsource.Bb bb) {
        this.f6119a = bb;
    }

    @Override // com.ironsource.InterfaceC3299tg
    public void a() {
        a(this.f6119a != null, com.ironsource.Zd.a.f6120a);
    }

    @Override // com.ironsource.InterfaceC3299tg
    public /* synthetic */ void a(boolean z, kotlin.jvm.functions.Function0 function0) {
        com.ironsource.InterfaceC3299tg.CC.$default$a(this, z, function0);
    }
}
