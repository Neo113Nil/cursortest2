package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class x {
    public static final void a(final com.moloco.sdk.publisher.MolocoInitializationListener molocoInitializationListener, final com.moloco.sdk.publisher.MolocoInitStatus initStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoInitializationListener, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        com.moloco.sdk.internal.scheduling.d.a(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.x$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.x.b(com.moloco.sdk.publisher.MolocoInitializationListener.this, initStatus);
            }
        });
    }

    public static final kotlin.Unit b(com.moloco.sdk.publisher.MolocoInitializationListener molocoInitializationListener, com.moloco.sdk.publisher.MolocoInitStatus molocoInitStatus) {
        molocoInitializationListener.onMolocoInitializationStatus(molocoInitStatus);
        return kotlin.Unit.INSTANCE;
    }
}
