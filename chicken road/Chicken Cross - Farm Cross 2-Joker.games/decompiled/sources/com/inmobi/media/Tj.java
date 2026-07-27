package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Tj extends AbstractC4254z implements Ok, InterfaceC3722g {
    public final Fd b;
    public final C4227y c;
    public final PublisherCallbacks d;
    public final Rk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tj(Fd adUnit, C4227y adComponent, PublisherCallbacks publisherCallbacks, Rk stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adUnit;
        this.c = adComponent;
        this.d = publisherCallbacks;
        this.e = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-RenderedState", "Initialize Called");
        }
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-RenderedState", "onDestroy");
        }
        this.e.a(new S5(this.b, null, this.c), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(H h) {
        boolean z;
        Y9 l;
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        if (((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getNative().getInteraction().getBlockCallbackOnExpiry()) {
            C4036r1 c4036r1 = h.f6590a;
            if (Intrinsics.areEqual("native", "native")) {
                Intrinsics.checkNotNullParameter(h, "<this>");
                Intrinsics.checkNotNullParameter(h, "<this>");
                long timeToLive = h.f6590a.b.getCacheConfig("native").getTimeToLive();
                long j = h.k;
                if (j == -1) {
                    j = h.j + TimeUnit.SECONDS.toMillis(timeToLive);
                }
                if (j - System.currentTimeMillis() < 0) {
                    z = true;
                    l = l();
                    if (l != null) {
                        ((Z9) l).b("AUM-RenderedState", "shouldBlockCallback - " + z);
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
