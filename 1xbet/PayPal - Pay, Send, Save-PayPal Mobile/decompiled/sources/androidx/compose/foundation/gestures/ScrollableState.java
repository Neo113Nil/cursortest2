package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableState;", "", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", "", "isScrollInProgress", "()Z", "getCanScrollForward", "canScrollForward", "getCanScrollBackward", "canScrollBackward", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "Landroidx/compose/foundation/ScrollIndicatorState;", "getScrollIndicatorState", "()Landroidx/compose/foundation/ScrollIndicatorState;", "scrollIndicatorState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ScrollableState {
    float dispatchRawDelta(float delta);

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getCanScrollForward() {
        return true;
    }

    default boolean getLastScrolledBackward() {
        return false;
    }

    default boolean getLastScrolledForward() {
        return false;
    }

    default androidx.compose.foundation.ScrollIndicatorState getScrollIndicatorState() {
        return null;
    }

    boolean isScrollInProgress();

    java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean getCanScrollForward(androidx.compose.foundation.gestures.ScrollableState scrollableState) {
            return androidx.compose.foundation.gestures.ScrollableState.super.getCanScrollForward();
        }

        @java.lang.Deprecated
        public static boolean getCanScrollBackward(androidx.compose.foundation.gestures.ScrollableState scrollableState) {
            return androidx.compose.foundation.gestures.ScrollableState.super.getCanScrollBackward();
        }

        @java.lang.Deprecated
        public static boolean getLastScrolledForward(androidx.compose.foundation.gestures.ScrollableState scrollableState) {
            return androidx.compose.foundation.gestures.ScrollableState.super.getLastScrolledForward();
        }

        @java.lang.Deprecated
        public static boolean getLastScrolledBackward(androidx.compose.foundation.gestures.ScrollableState scrollableState) {
            return androidx.compose.foundation.gestures.ScrollableState.super.getLastScrolledBackward();
        }

        @java.lang.Deprecated
        public static androidx.compose.foundation.ScrollIndicatorState getScrollIndicatorState(androidx.compose.foundation.gestures.ScrollableState scrollableState) {
            return androidx.compose.foundation.gestures.ScrollableState.super.getScrollIndicatorState();
        }
    }

    static /* synthetic */ java.lang.Object scroll$default(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return scrollableState.scroll(mutatePriority, function2, continuation);
    }
}
