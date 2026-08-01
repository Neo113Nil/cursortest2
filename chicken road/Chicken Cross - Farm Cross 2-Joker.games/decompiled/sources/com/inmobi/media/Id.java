package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Id {

    /* renamed from: a, reason: collision with root package name */
    public final C4227y f6626a;
    public final Lazy b;

    public Id(C4227y adComponent) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f6626a = adComponent;
        this.b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Id$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Id.a(Id.this);
            }
        });
    }

    public static final Dd a(Id id) {
        C4227y c4227y = id.f6626a;
        return new Dd(c4227y.b, c4227y.f7489a.d);
    }
}
