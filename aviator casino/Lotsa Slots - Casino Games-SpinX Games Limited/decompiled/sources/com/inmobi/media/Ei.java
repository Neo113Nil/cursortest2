package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Ei extends com.inmobi.media.AbstractC2892y implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.InterfaceC2419g {
    public final com.inmobi.media.Nc b;
    public final com.inmobi.media.C2867x c;
    public final com.inmobi.ads.controllers.PublisherCallbacks d;
    public final com.inmobi.media.AbstractC2861wj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ei(com.inmobi.media.Nc adUnit, com.inmobi.media.C2867x adComponent, com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks, com.inmobi.media.AbstractC2861wj stateMachine) {
        super(adComponent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adUnit;
        this.c = adComponent;
        this.d = publisherCallbacks;
        this.e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-RenderedState", "Initialize Called");
        }
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-RenderedState", "onDestroy");
        }
        this.e.a(new com.inmobi.media.C2821v5(this.b, null, this.c), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.inmobi.media.G g) {
        boolean z;
        com.inmobi.media.InterfaceC2772t9 l;
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        if (((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getNative().getInteraction().getBlockCallbackOnExpiry()) {
            com.inmobi.media.C2657p1 c2657p1 = g.f4714a;
            if (kotlin.jvm.internal.Intrinsics.areEqual("native", "native")) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "<this>");
                long timeToLive = g.f4714a.b.getCacheConfig("native").getTimeToLive();
                long j = g.k;
                if (j == -1) {
                    j = g.j + java.util.concurrent.TimeUnit.SECONDS.toMillis(timeToLive);
                }
                if (j - java.lang.System.currentTimeMillis() < 0) {
                    z = true;
                    l = l();
                    if (l != null) {
                        ((com.inmobi.media.C2799u9) l).b("AUM-RenderedState", "shouldBlockCallback - " + z);
                    }
                    return z;
                }
            }
        }
        z = false;
        l = l();
        if (l != null) {
        }
        return z;
    }
}
