package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u0005J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H&¢\u0006\u0004\b\u0018\u0010\u0005J:\u0010\u001d\u001a\u00020\u00032\u001f\u0010\u001b\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0019¢\u0006\u0002\b\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010\u0005R\u0014\u0010\"\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "", "onBeginChanges", "()V", "onEndChanges", "node", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "(Ljava/lang/Object;)V", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP, "", "index", "instance", "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "remove", "(II)V", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "move", "(III)V", "clear", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "reuse", "getCurrent", "()Ljava/lang/Object;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Applier<N> {
    void clear();

    void down(N node);

    N getCurrent();

    void insertBottomUp(int index, N instance);

    void insertTopDown(int index, N instance);

    void move(int from, int to, int count);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int index, int count);

    void up();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <N> void onBeginChanges(androidx.compose.runtime.Applier<N> applier) {
            androidx.compose.runtime.Applier.super.onBeginChanges();
        }

        @java.lang.Deprecated
        public static <N> void onEndChanges(androidx.compose.runtime.Applier<N> applier) {
            androidx.compose.runtime.Applier.super.onEndChanges();
        }

        @java.lang.Deprecated
        public static <N> void apply(androidx.compose.runtime.Applier<N> applier, kotlin.jvm.functions.Function2<? super N, java.lang.Object, kotlin.Unit> function2, java.lang.Object obj) {
            androidx.compose.runtime.Applier.super.apply(function2, obj);
        }

        @java.lang.Deprecated
        public static <N> void reuse(androidx.compose.runtime.Applier<N> applier) {
            androidx.compose.runtime.Applier.super.reuse();
        }
    }

    default void apply(kotlin.jvm.functions.Function2<? super N, java.lang.Object, kotlin.Unit> block, java.lang.Object value) {
        block.invoke(getCurrent(), value);
    }

    default void reuse() {
        N current = getCurrent();
        androidx.compose.runtime.ComposeNodeLifecycleCallback composeNodeLifecycleCallback = current instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback ? (androidx.compose.runtime.ComposeNodeLifecycleCallback) current : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.onReuse();
        }
    }
}
