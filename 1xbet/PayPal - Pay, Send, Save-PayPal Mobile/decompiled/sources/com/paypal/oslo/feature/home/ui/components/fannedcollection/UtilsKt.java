package com.paypal.oslo.feature.home.ui.components.fannedcollection;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\f*\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aB\u0010\u001d\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\b2\u0017\u0010\u001b\u001a\u0013\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a0\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "dataItems", "Landroidx/compose/ui/unit/Density;", "density", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarousel;", "runCarouselInitializationTasks", "(Ljava/util/List;Landroidx/compose/ui/unit/Density;)Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarousel;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", "", "isDragging", "(Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;)Z", "T", "Lkotlin/Function0;", "", "durationCalculation", "Landroidx/compose/animation/core/TweenSpec;", "fannedCarouselAnimationSpec", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/animation/core/TweenSpec;", "draggableAnimationSpec", "(Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;)Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/ui/Modifier;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "onDrag", "onDragEnd", "draggable", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UtilsKt {
    /* renamed from: $r8$lambda$lbLy23C-fLJ6oXOpHml_6QqyBsM, reason: not valid java name */
    public static /* synthetic */ int m14947$r8$lambda$lbLy23CfLJ6oXOpHml_6QqyBsM() {
        return 500;
    }

    public static final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarousel runCarouselInitializationTasks(java.util.List<com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData> list, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.DensityDependentConstants.INSTANCE.initialize(density);
        return new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarousel(list);
    }

    public static final boolean isDragging(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fannedCarouselPosition, "");
        return (fannedCarouselPosition instanceof com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle) && ((com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle) fannedCarouselPosition).isDragging();
    }

    public static /* synthetic */ androidx.compose.animation.core.TweenSpec fannedCarouselAnimationSpec$default(kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt.m14947$r8$lambda$lbLy23CfLJ6oXOpHml_6QqyBsM());
                }
            };
        }
        return fannedCarouselAnimationSpec(function0);
    }

    public static final <T> androidx.compose.animation.core.TweenSpec<T> fannedCarouselAnimationSpec(kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return androidx.compose.animation.core.AnimationSpecKt.tween$default(function0.invoke().intValue(), 0, null, 6, null);
    }

    public static final <T> androidx.compose.animation.core.TweenSpec<T> draggableAnimationSpec(final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fannedCarouselPosition, "");
        return fannedCarouselAnimationSpec(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt.m14945$r8$lambda$ZEMKJa8Blj6vH3gTWBwZDW8dxg(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.this));
            }
        });
    }

    public static final androidx.compose.ui.Modifier draggable(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fannedCarouselPosition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1363320564, i, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.draggable (Utils.kt:54)");
        }
        if (fannedCarouselPosition instanceof com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle) {
            composer.startReplaceGroup(-1471953774);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean z = (((i & 896) ^ 384) > 256 && composer.changed(function1)) || (i & 384) == 256;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt.m14946$r8$lambda$_tW2bQlO4RdPqYhIkAAQkvueE(kotlin.jvm.functions.Function1.this, ((java.lang.Float) obj).floatValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.gestures.DraggableState rememberDraggableState = androidx.compose.foundation.gestures.DraggableKt.rememberDraggableState((kotlin.jvm.functions.Function1) rememberedValue, composer, 0);
            androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
            boolean z2 = (((i & 7168) ^ 3072) > 2048 && composer.changed(function0)) || (i & 3072) == 2048;
            com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt$draggable$2$1 rememberedValue2 = composer.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt$draggable$2$1(function0, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            companion = androidx.compose.foundation.gestures.DraggableKt.draggable(companion2, rememberDraggableState, orientation, (r20 & 4) != 0, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : null, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : (kotlin.jvm.functions.Function3) rememberedValue2, (r20 & 128) != 0 ? false : false);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1471727722);
            composer.endReplaceGroup();
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        androidx.compose.ui.Modifier then = modifier.then(companion);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then;
    }

    /* renamed from: $r8$lambda$ZEMKJa8Blj6vH3gTWBwZ-DW8dxg, reason: not valid java name */
    public static /* synthetic */ int m14945$r8$lambda$ZEMKJa8Blj6vH3gTWBwZDW8dxg(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition) {
        return isDragging(fannedCarouselPosition) ? 0 : 500;
    }

    /* renamed from: $r8$lambda$_tW-2b-QlO4RdPqYhIkAAQkvueE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14946$r8$lambda$_tW2bQlO4RdPqYhIkAAQkvueE(kotlin.jvm.functions.Function1 function1, float f) {
        function1.invoke(java.lang.Float.valueOf(f));
        return kotlin.Unit.INSTANCE;
    }
}
