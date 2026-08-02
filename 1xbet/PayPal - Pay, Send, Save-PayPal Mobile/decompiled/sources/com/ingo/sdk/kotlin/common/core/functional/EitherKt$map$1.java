package com.ingo.sdk.kotlin.common.core.functional;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class EitherKt$map$1<T> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<T, com.ingo.sdk.kotlin.common.core.functional.Either.Right<? extends T>> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final com.ingo.sdk.kotlin.common.core.functional.Either.Right<T> invoke(T t) {
        return ((com.ingo.sdk.kotlin.common.core.functional.Either) this.receiver).right(t);
    }

    EitherKt$map$1(java.lang.Object obj) {
        super(1, obj, com.ingo.sdk.kotlin.common.core.functional.Either.class, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "right(Ljava/lang/Object;)Lcom/ingo/sdk/kotlin/common/core/functional/Either$Right;", 0);
    }
}
