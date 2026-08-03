package androidx.compose.foundation;

/* compiled from: AndroidOverscroll.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidOverscroll_androidKt {
    private static final androidx.compose.ui.Modifier StretchOverscrollNonClippingLayer;

    public static final androidx.compose.foundation.OverscrollEffect rememberOverscrollEffect(androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.foundation.NoOpOverscrollEffect noOpOverscrollEffect;
        composer.startReplaceableGroup(-1476348564);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberOverscrollEffect)65@2883L7,66@2937L7,68@2986L80:AndroidOverscroll.android.kt#71ulvw");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1476348564, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:64)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        android.content.Context context = (android.content.Context) consume;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.OverscrollConfiguration> localOverscrollConfiguration = androidx.compose.foundation.OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2 = composer.consume(localOverscrollConfiguration);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.foundation.OverscrollConfiguration overscrollConfiguration = (androidx.compose.foundation.OverscrollConfiguration) consume2;
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(context) | composer.changed(overscrollConfiguration);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            noOpOverscrollEffect = (androidx.compose.foundation.OverscrollEffect) rememberedValue;
        } else {
            noOpOverscrollEffect = androidx.compose.foundation.NoOpOverscrollEffect.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return noOpOverscrollEffect;
    }

    static {
        androidx.compose.ui.Modifier.Companion companion;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            companion = androidx.compose.ui.layout.LayoutModifierKt.layout(androidx.compose.ui.layout.LayoutModifierKt.layout(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
                    return m209invoke3p2s80s(measureScope, measurable, constraints.getValue());
                }

                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final androidx.compose.ui.layout.MeasureResult m209invoke3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                    final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
                    final int i = measureScope.mo309roundToPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.foundation.ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                    return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, kotlin.ranges.RangesKt.coerceAtLeast(mo3402measureBRTryo0.getMeasuredWidth() - i, 0), kotlin.ranges.RangesKt.coerceAtLeast(mo3402measureBRTryo0.getMeasuredHeight() - i, 0), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            androidx.compose.ui.layout.Placeable placeable = androidx.compose.ui.layout.Placeable.this;
                            androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, ((-i) / 2) - ((placeable.getWidth() - androidx.compose.ui.layout.Placeable.this.getMeasuredWidth()) / 2), ((-i) / 2) - ((androidx.compose.ui.layout.Placeable.this.getHeight() - androidx.compose.ui.layout.Placeable.this.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
                        }
                    }, 4, null);
                }
            }), new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
                    return m210invoke3p2s80s(measureScope, measurable, constraints.getValue());
                }

                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final androidx.compose.ui.layout.MeasureResult m210invoke3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                    final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
                    final int i = measureScope.mo309roundToPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.foundation.ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                    return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, mo3402measureBRTryo0.getWidth() + i, mo3402measureBRTryo0.getHeight() + i, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            androidx.compose.ui.layout.Placeable placeable = androidx.compose.ui.layout.Placeable.this;
                            int i2 = i;
                            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, i2 / 2, i2 / 2, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            });
        } else {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        StretchOverscrollNonClippingLayer = companion;
    }
}
