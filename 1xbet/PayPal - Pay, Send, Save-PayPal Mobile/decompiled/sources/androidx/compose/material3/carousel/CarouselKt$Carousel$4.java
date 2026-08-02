package androidx.compose.material3.carousel;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CarouselKt$Carousel$4 implements kotlin.jvm.functions.Function4<androidx.compose.foundation.pager.PagerScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function4<androidx.compose.material3.carousel.CarouselItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.carousel.CarouselPageSize getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.carousel.CarouselState getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.pager.PagerScope pagerScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
        int intValue = num.intValue();
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue2 = num2.intValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1042567175, intValue2, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:445)");
        }
        java.lang.Object rememberedValue = composer2.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material3.carousel.CarouselItemDrawInfoImpl();
            composer2.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.material3.carousel.CarouselItemDrawInfoImpl carouselItemDrawInfoImpl = (androidx.compose.material3.carousel.CarouselItemDrawInfoImpl) rememberedValue;
        java.lang.Object rememberedValue2 = composer2.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.material3.carousel.CarouselItemScopeImpl(carouselItemDrawInfoImpl);
            composer2.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.material3.carousel.CarouselItemScopeImpl carouselItemScopeImpl = (androidx.compose.material3.carousel.CarouselItemScopeImpl) rememberedValue2;
        java.lang.Object rememberedValue3 = composer2.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new androidx.compose.ui.graphics.Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1
                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
                    return new androidx.compose.ui.graphics.Outline.Rectangle(androidx.compose.material3.carousel.CarouselItemDrawInfoImpl.this.getMaskRect());
                }
            };
            composer2.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1 carouselKt$Carousel$4$clipShape$1$1 = (androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1) rememberedValue3;
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.material3.carousel.CarouselState carouselState = this.getHighSpeedVideoFpsRangesFor;
        boolean changed = composer2.changed(this.getHighSpeedVideoFpsRanges);
        final androidx.compose.material3.carousel.CarouselPageSize carouselPageSize = this.getHighSpeedVideoFpsRanges;
        java.lang.Object rememberedValue4 = composer2.rememberedValue();
        if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.material3.carousel.Strategy strategy;
                    strategy = androidx.compose.material3.carousel.CarouselPageSize.this.getStrategy();
                    return strategy;
                }
            };
            composer2.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.ui.Modifier carouselItem = androidx.compose.material3.carousel.CarouselKt.carouselItem(companion, intValue, carouselState, (kotlin.jvm.functions.Function0) rememberedValue4, carouselItemDrawInfoImpl, carouselKt$Carousel$4$clipShape$1$1);
        kotlin.jvm.functions.Function4<androidx.compose.material3.carousel.CarouselItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function4 = this.Camera2StreamConfigurationMap;
        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, carouselItem);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        function4.invoke(carouselItemScopeImpl, java.lang.Integer.valueOf(intValue), composer2, java.lang.Integer.valueOf(intValue2 & 112));
        composer2.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    CarouselKt$Carousel$4(androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.material3.carousel.CarouselPageSize carouselPageSize, kotlin.jvm.functions.Function4<? super androidx.compose.material3.carousel.CarouselItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        this.getHighSpeedVideoFpsRangesFor = carouselState;
        this.getHighSpeedVideoFpsRanges = carouselPageSize;
        this.Camera2StreamConfigurationMap = function4;
    }
}
