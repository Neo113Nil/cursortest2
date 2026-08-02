package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/datadog/android/compose/InteractionType;", "", "<init>", "()V", "Scroll", "Swipe", "Lcom/datadog/android/compose/InteractionType$Scroll;", "Lcom/datadog/android/compose/InteractionType$Swipe;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class InteractionType {
    public static final int $stable = 0;

    private InteractionType() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00028\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00028\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/datadog/android/compose/InteractionType$Swipe;", "", "T", "Lcom/datadog/android/compose/InteractionType;", "Landroidx/compose/material/SwipeableState;", "swipeableState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "<init>", "(Landroidx/compose/material/SwipeableState;Landroidx/compose/foundation/gestures/Orientation;Z)V", "getCurrentValue$dd_sdk_android_compose_release", "()Ljava/lang/Object;", "currentValue", "", "getOffset$dd_sdk_android_compose_release", "()F", "offset", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation$dd_sdk_android_compose_release", "()Landroidx/compose/foundation/gestures/Orientation;", "Z", "getReverseDirection$dd_sdk_android_compose_release", "()Z", "Landroidx/compose/material/SwipeableState;", "getSwipeableState$dd_sdk_android_compose_release", "()Landroidx/compose/material/SwipeableState;", "getTargetValue$dd_sdk_android_compose_release", "targetValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Swipe<T> extends com.datadog.android.compose.InteractionType {
        public static final int $stable = 0;
        private final androidx.compose.foundation.gestures.Orientation orientation;
        private final boolean reverseDirection;
        private final androidx.compose.material.SwipeableState<T> swipeableState;

        public /* synthetic */ Swipe(androidx.compose.material.SwipeableState swipeableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(swipeableState, orientation, (i & 4) != 0 ? false : z);
        }

        public final androidx.compose.material.SwipeableState<T> getSwipeableState$dd_sdk_android_compose_release() {
            return this.swipeableState;
        }

        /* renamed from: getOrientation$dd_sdk_android_compose_release, reason: from getter */
        public final androidx.compose.foundation.gestures.Orientation getOrientation() {
            return this.orientation;
        }

        /* renamed from: getReverseDirection$dd_sdk_android_compose_release, reason: from getter */
        public final boolean getReverseDirection() {
            return this.reverseDirection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Swipe(androidx.compose.material.SwipeableState<T> swipeableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swipeableState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "");
            this.swipeableState = swipeableState;
            this.orientation = orientation;
            this.reverseDirection = z;
        }

        public final T getCurrentValue$dd_sdk_android_compose_release() {
            return this.swipeableState.getCurrentValue();
        }

        public final T getTargetValue$dd_sdk_android_compose_release() {
            return this.swipeableState.getTargetValue();
        }

        public final float getOffset$dd_sdk_android_compose_release() {
            return this.swipeableState.getOffset().getValue().floatValue();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/compose/InteractionType$Scroll;", "Lcom/datadog/android/compose/InteractionType;", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Z)V", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation$dd_sdk_android_compose_release", "()Landroidx/compose/foundation/gestures/Orientation;", "Z", "getReverseDirection$dd_sdk_android_compose_release", "()Z", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState$dd_sdk_android_compose_release", "()Landroidx/compose/foundation/gestures/ScrollableState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Scroll extends com.datadog.android.compose.InteractionType {
        public static final int $stable = 8;
        private final androidx.compose.foundation.gestures.Orientation orientation;
        private final boolean reverseDirection;
        private final androidx.compose.foundation.gestures.ScrollableState scrollableState;

        public /* synthetic */ Scroll(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(scrollableState, orientation, (i & 4) != 0 ? false : z);
        }

        /* renamed from: getScrollableState$dd_sdk_android_compose_release, reason: from getter */
        public final androidx.compose.foundation.gestures.ScrollableState getScrollableState() {
            return this.scrollableState;
        }

        /* renamed from: getOrientation$dd_sdk_android_compose_release, reason: from getter */
        public final androidx.compose.foundation.gestures.Orientation getOrientation() {
            return this.orientation;
        }

        /* renamed from: getReverseDirection$dd_sdk_android_compose_release, reason: from getter */
        public final boolean getReverseDirection() {
            return this.reverseDirection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Scroll(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollableState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "");
            this.scrollableState = scrollableState;
            this.orientation = orientation;
            this.reverseDirection = z;
        }
    }

    public /* synthetic */ InteractionType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
