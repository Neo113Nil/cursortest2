package com.moloco.sdk.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f10581a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.p$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.a();
        }
    });
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.p$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.c();
        }
    });

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o a(boolean z) {
        if (z) {
            return null;
        }
        return g();
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o c() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o(new Function0() { // from class: com.moloco.sdk.internal.p$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.d();
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.p$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.e();
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.p$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.f();
            }
        });
    }

    public static final Unit d() {
        return Unit.INSTANCE;
    }

    public static final Unit e() {
        return Unit.INSTANCE;
    }

    public static final Unit f() {
        return Unit.INSTANCE;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o g() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o) f10581a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o h() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o) b.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o a() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o(new Function0() { // from class: com.moloco.sdk.internal.p$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.b();
            }
        }, null, null, 6, null);
    }
}
