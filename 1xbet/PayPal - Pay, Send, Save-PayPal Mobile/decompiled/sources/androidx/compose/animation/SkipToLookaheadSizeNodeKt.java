package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "scaleToBounds", "Lkotlin/Function0;", "", "isEnabled", "createContentScaleModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/ScaleToBoundsImpl;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SkipToLookaheadSizeNodeKt {
    private static final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.animation.SkipToLookaheadSizeNodeKt$DefaultEnabled$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.TRUE;
        }
    };

    public static final androidx.compose.ui.Modifier createContentScaleModifier(androidx.compose.ui.Modifier modifier, androidx.compose.animation.ScaleToBoundsImpl scaleToBoundsImpl, final kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        androidx.compose.ui.Modifier.Companion companion;
        if (kotlin.jvm.internal.Intrinsics.areEqual(scaleToBoundsImpl.getContentScale(), androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop())) {
            companion = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.animation.SkipToLookaheadSizeNodeKt$createContentScaleModifier$1
                public final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setClip(function0.invoke().booleanValue());
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                    Camera2StreamConfigurationMap(graphicsLayerScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        } else {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        return modifier.then(companion).then(new androidx.compose.animation.SkipToLookaheadSizeElement(scaleToBoundsImpl, function0));
    }
}
