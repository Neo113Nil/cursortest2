package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ed {

    /* renamed from: a, reason: collision with root package name */
    public final C4227y f6535a;
    public final InMobiJsonResponse b;
    public final Ad c;
    public final Id d;
    public C4224xn e;
    public final Lazy f;
    public final Lazy g;

    public Ed(C4227y adComponent, InMobiJsonResponse inMobiJsonResponse, Ad adUnitCallback) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f6535a = adComponent;
        this.b = inMobiJsonResponse;
        this.c = adUnitCallback;
        this.d = new Id(adComponent);
        this.f = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ed$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ed.b(Ed.this);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ed$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ed.a(Ed.this);
            }
        });
    }

    public static final C3877ld a(Ed ed) {
        C4008q1 c4008q1 = ed.d.f6626a.f7489a;
        return new C3877ld(c4008q1.b, c4008q1.e, c4008q1.c);
    }

    public static final Dd b(Ed ed) {
        return (Dd) ed.d.b.getValue();
    }
}
