package androidx.compose.foundation.gestures;

/* compiled from: ScrollExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"animateScrollBy", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "value", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopScroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object animateScrollBy(androidx.compose.foundation.gestures.ScrollableState scrollableState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) continuation;
            if ((scrollExtensionsKt$animateScrollBy$1.label & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.label -= Integer.MIN_VALUE;
                androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$12 = scrollExtensionsKt$animateScrollBy$1;
                java.lang.Object obj = scrollExtensionsKt$animateScrollBy$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollExtensionsKt$animateScrollBy$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2(f, animationSpec, floatRef2, null);
                    scrollExtensionsKt$animateScrollBy$12.L$0 = floatRef2;
                    scrollExtensionsKt$animateScrollBy$12.label = 1;
                    if (androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(scrollableState, null, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) scrollExtensionsKt$animateScrollBy$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
            }
        }
        scrollExtensionsKt$animateScrollBy$1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1(continuation);
        androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$122 = scrollExtensionsKt$animateScrollBy$1;
        java.lang.Object obj2 = scrollExtensionsKt$animateScrollBy$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollExtensionsKt$animateScrollBy$122.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
    }

    public static /* synthetic */ java.lang.Object animateScrollBy$default(androidx.compose.foundation.gestures.ScrollableState scrollableState, float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f, animationSpec, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object scrollBy(androidx.compose.foundation.gestures.ScrollableState scrollableState, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) continuation;
            if ((scrollExtensionsKt$scrollBy$1.label & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.label -= Integer.MIN_VALUE;
                androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$12 = scrollExtensionsKt$scrollBy$1;
                java.lang.Object obj = scrollExtensionsKt$scrollBy$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollExtensionsKt$scrollBy$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2(floatRef2, f, null);
                    scrollExtensionsKt$scrollBy$12.L$0 = floatRef2;
                    scrollExtensionsKt$scrollBy$12.label = 1;
                    if (androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(scrollableState, null, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) scrollExtensionsKt$scrollBy$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
            }
        }
        scrollExtensionsKt$scrollBy$1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1(continuation);
        androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$122 = scrollExtensionsKt$scrollBy$1;
        java.lang.Object obj2 = scrollExtensionsKt$scrollBy$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollExtensionsKt$scrollBy$122.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
    }

    public static /* synthetic */ java.lang.Object stopScroll$default(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, continuation);
    }

    public static final java.lang.Object stopScroll(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll = scrollableState.scroll(mutatePriority, new androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2(null), continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }
}
