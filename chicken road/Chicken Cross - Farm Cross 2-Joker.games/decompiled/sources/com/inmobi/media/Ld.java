package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ld {

    /* renamed from: a, reason: collision with root package name */
    public final Pd f6693a;
    public final Nk b;
    public final C2 c;
    public final Nk d;
    public final Nk e;
    public final Nk f;
    public final Nk g;

    public Ld(Md nativeBeaconMacroData, Pd trackerData) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(trackerData, "trackerData");
        this.f6693a = trackerData;
        this.b = new Nk(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Ld$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ld.c(Ld.this);
            }
        });
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.c = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getNative().getInteraction().getClickDedupingEnabled() ? new C4258z3(nativeBeaconMacroData) : new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Ld$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ld.a();
            }
        });
        this.d = new Nk(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Ld$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ld.e(Ld.this);
            }
        });
        this.e = new Nk(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Ld$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ld.b(Ld.this);
            }
        });
        this.f = new Nk(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Ld$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ld.a(Ld.this);
            }
        });
        this.g = new Nk(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Ld$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ld.d(Ld.this);
            }
        });
    }

    public static final List a() {
        return CollectionsKt.emptyList();
    }

    public static final List b(Ld ld) {
        return AbstractC3559a5.a("impression_shown", ld.f6693a.f6782a.f6976a);
    }

    public static final List c(Ld ld) {
        return AbstractC3559a5.a(U3.i.r, ld.f6693a.f6782a.f6976a);
    }

    public static final List d(Ld ld) {
        return AbstractC3559a5.a("mrc50", ld.f6693a.f6782a.f6976a);
    }

    public static final List e(Ld ld) {
        return AbstractC3559a5.a("start_tracking", ld.f6693a.f6782a.f6976a);
    }

    public static final List a(Ld ld) {
        return CollectionsKt.plus((Collection) AbstractC3559a5.a("impression", ld.f6693a.f6782a.f6976a), (Iterable) Vn.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n, ld.f6693a.b));
    }
}
