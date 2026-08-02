package com.adobe.marketing.mobile.services.ui.message.mapping;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/mapping/MessageAnimationMapper;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAnimation;", "animation", "Landroidx/compose/animation/EnterTransition;", "getEnterTransitionFor", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAnimation;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "getExitTransitionFor", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAnimation;)Landroidx/compose/animation/ExitTransition;", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageGesture;", "gesture", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageGesture;)Landroidx/compose/animation/ExitTransition;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageAnimationMapper {
    public static final com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper INSTANCE = new com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.Map<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation, androidx.compose.animation.EnterTransition> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.LEFT, androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$enterAnimationMap$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoFpsRangesFor(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoFpsRangesFor(int i) {
            return java.lang.Integer.valueOf(-i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.RIGHT, androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$enterAnimationMap$2
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoFpsRangesFor(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoFpsRangesFor(int i) {
            return java.lang.Integer.valueOf(i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.TOP, androidx.compose.animation.EnterExitTransitionKt.slideInVertically(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$enterAnimationMap$3
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoFpsRanges(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoFpsRanges(int i) {
            return java.lang.Integer.valueOf(-i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.BOTTOM, androidx.compose.animation.EnterExitTransitionKt.slideInVertically(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$enterAnimationMap$4
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoFpsRanges(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoFpsRanges(int i) {
            return java.lang.Integer.valueOf(i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.FADE, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null)));

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation, androidx.compose.animation.ExitTransition> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.LEFT, androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$exitAnimationMap$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoSizes(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoSizes(int i) {
            return java.lang.Integer.valueOf(-i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.RIGHT, androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$exitAnimationMap$2
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoSizes(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoSizes(int i) {
            return java.lang.Integer.valueOf(i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.TOP, androidx.compose.animation.EnterExitTransitionKt.slideOutVertically(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$exitAnimationMap$3
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoFpsRanges(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoFpsRanges(int i) {
            return java.lang.Integer.valueOf(-i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.BOTTOM, androidx.compose.animation.EnterExitTransitionKt.slideOutVertically(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$exitAnimationMap$4
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoFpsRangesFor(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoFpsRangesFor(int i) {
            return java.lang.Integer.valueOf(i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.FADE, androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null)));

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.Map<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture, androidx.compose.animation.ExitTransition> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.SWIPE_UP, androidx.compose.animation.EnterExitTransitionKt.slideOutVertically(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$gestureAnimationMap$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoSizes(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoSizes(int i) {
            return java.lang.Integer.valueOf(-i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.SWIPE_DOWN, androidx.compose.animation.EnterExitTransitionKt.slideOutVertically(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$gestureAnimationMap$2
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoSizes(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoSizes(int i) {
            return java.lang.Integer.valueOf(i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.SWIPE_LEFT, androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$gestureAnimationMap$3
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighResolutionOutputSizeshNQ4ISI(num.intValue());
        }

        public final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI(int i) {
            return java.lang.Integer.valueOf(-i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.SWIPE_RIGHT, androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper$gestureAnimationMap$4
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
            return getHighSpeedVideoSizes(num.intValue());
        }

        public final java.lang.Integer getHighSpeedVideoSizes(int i) {
            return java.lang.Integer.valueOf(i);
        }
    })), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.TAP_BACKGROUND, androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null)));

    private MessageAnimationMapper() {
    }

    public final androidx.compose.animation.EnterTransition getEnterTransitionFor(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation animation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "");
        androidx.compose.animation.EnterTransition enterTransition = getHighSpeedVideoFpsRanges.get(animation);
        return enterTransition == null ? androidx.compose.animation.EnterTransition.INSTANCE.getNone() : enterTransition;
    }

    public final androidx.compose.animation.ExitTransition getExitTransitionFor(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation animation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "");
        androidx.compose.animation.ExitTransition exitTransition = getHighResolutionOutputSizeshNQ4ISI.get(animation);
        return exitTransition == null ? androidx.compose.animation.ExitTransition.INSTANCE.getNone() : exitTransition;
    }

    public final androidx.compose.animation.ExitTransition getExitTransitionFor(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture gesture) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gesture, "");
        androidx.compose.animation.ExitTransition exitTransition = getHighSpeedVideoSizes.get(gesture);
        return exitTransition == null ? androidx.compose.animation.ExitTransition.INSTANCE.getNone() : exitTransition;
    }
}
