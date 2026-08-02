package com.adobe.marketing.mobile.services.ui.message;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/GestureTracker;", "", "Landroidx/compose/animation/ExitTransition;", "defaultExitTransition", "", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageGesture;", "acceptedGestures", "Lkotlin/Function1;", "", "onGestureDetected", "<init>", "(Landroidx/compose/animation/ExitTransition;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "getExitTransition$core_phoneRelease", "()Landroidx/compose/animation/ExitTransition;", "", "x", "y", "velocity", "onDragFinished$core_phoneRelease", "(FFF)V", "gesture", "onGesture$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageGesture;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/ExitTransition;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class GestureTracker {
    private androidx.compose.animation.ExitTransition getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public GestureTracker(androidx.compose.animation.ExitTransition exitTransition, java.util.Set<? extends com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture> set, kotlin.jvm.functions.Function1<? super com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exitTransition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = set;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = exitTransition;
    }

    public /* synthetic */ GestureTracker(androidx.compose.animation.ExitTransition exitTransition, java.util.Set set, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.animation.ExitTransition.INSTANCE.getNone() : exitTransition, (i & 2) != 0 ? kotlin.collections.SetsKt.emptySet() : set, function1);
    }

    public final void onDragFinished$core_phoneRelease(float x, float y, float velocity) {
        com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture messageGesture = null;
        if (java.lang.Math.abs(x) > java.lang.Math.abs(y)) {
            if (x > 0.0f && java.lang.Math.abs(velocity) > 300.0f && java.lang.Math.abs(x) > 400.0f) {
                messageGesture = com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.SWIPE_RIGHT;
            } else if (x < 0.0f && java.lang.Math.abs(velocity) > 300.0f && java.lang.Math.abs(x) > 400.0f) {
                messageGesture = com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.SWIPE_LEFT;
            }
        } else if (y > 0.0f && java.lang.Math.abs(velocity) > 300.0f && java.lang.Math.abs(y) > 400.0f) {
            messageGesture = com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.SWIPE_DOWN;
        } else if (y < 0.0f && java.lang.Math.abs(velocity) > 300.0f && java.lang.Math.abs(y) > 400.0f) {
            messageGesture = com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.SWIPE_UP;
        }
        if (messageGesture != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Gesture detected: ");
            sb.append(messageGesture);
            sb.append(" with ");
            sb.append(x);
            sb.append(", ");
            sb.append(y);
            sb.append(", ");
            sb.append(velocity);
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "GestureTracker", sb.toString(), new java.lang.Object[0]);
            onGesture$core_phoneRelease(messageGesture);
        }
    }

    public final void onGesture$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture gesture) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gesture, "");
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "GestureTracker", "Gesture detected: ".concat(java.lang.String.valueOf(gesture)), new java.lang.Object[0]);
        if (this.getHighSpeedVideoFpsRangesFor.contains(gesture)) {
            this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper.INSTANCE.getExitTransitionFor(gesture);
            this.getHighSpeedVideoFpsRanges.invoke(gesture);
        }
    }

    /* renamed from: getExitTransition$core_phoneRelease, reason: from getter */
    public final androidx.compose.animation.ExitTransition getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
