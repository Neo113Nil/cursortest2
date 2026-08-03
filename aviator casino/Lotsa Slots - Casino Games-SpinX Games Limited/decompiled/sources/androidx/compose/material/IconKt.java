package androidx.compose.material;

/* compiled from: Icon.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u000f\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C, "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconKt {
    private static final androidx.compose.ui.Modifier DefaultIconSizeModifier = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(24));

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1413Iconww6aTOc(androidx.compose.ui.graphics.vector.ImageVector imageVector, java.lang.String str, androidx.compose.ui.Modifier modifier, long j, androidx.compose.runtime.Composer composer, int i, int i2) {
        long j2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        composer.startReplaceableGroup(-800853103);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(Icon)P(1!,3:c#ui.graphics.Color)60@2613L7,60@2652L7,63@2693L34,62@2669L163:Icon.kt#jmzs0o");
        androidx.compose.ui.Modifier.Companion companion = (i2 & 4) != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
        if ((i2 & 8) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localContentColor);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            long m2123unboximpl = ((androidx.compose.ui.graphics.Color) consume).m2123unboximpl();
            androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> localContentAlpha = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = composer.consume(localContentAlpha);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            j2 = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2123unboximpl, ((java.lang.Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j2 = j;
        }
        m1412Iconww6aTOc(androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter(imageVector, composer, i & 14), str, companion, j2, composer, androidx.compose.ui.graphics.vector.VectorPainter.$stable | (i & 112) | (i & 896) | (i & 7168), 0);
        composer.endReplaceableGroup();
    }

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1411Iconww6aTOc(androidx.compose.ui.graphics.ImageBitmap bitmap, java.lang.String str, androidx.compose.ui.Modifier modifier, long j, androidx.compose.runtime.Composer composer, int i, int i2) {
        long j2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        composer.startReplaceableGroup(-554892675);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(Icon)P(!,3:c#ui.graphics.Color)89@3733L7,89@3772L7,91@3803L42,92@3850L136:Icon.kt#jmzs0o");
        androidx.compose.ui.Modifier modifier2 = (i2 & 4) != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
        if ((i2 & 8) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localContentColor);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            long m2123unboximpl = ((androidx.compose.ui.graphics.Color) consume).m2123unboximpl();
            androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> localContentAlpha = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = composer.consume(localContentAlpha);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            j2 = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2123unboximpl, ((java.lang.Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j2 = j;
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(bitmap);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.ui.graphics.painter.BitmapPainter bitmapPainter = new androidx.compose.ui.graphics.painter.BitmapPainter(bitmap, 0L, 0L, 6, null);
            composer.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        composer.endReplaceableGroup();
        m1412Iconww6aTOc((androidx.compose.ui.graphics.painter.BitmapPainter) rememberedValue, str, modifier2, j2, composer, (i & 112) | 8 | (i & 896) | (i & 7168), 0);
        composer.endReplaceableGroup();
    }

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1412Iconww6aTOc(final androidx.compose.ui.graphics.painter.Painter painter, final java.lang.String str, androidx.compose.ui.Modifier modifier, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        long j2;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "painter");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1142959010);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Icon)P(2!,3:c#ui.graphics.Color)118@4859L7,118@4898L7,130@5281L253:Icon.kt#jmzs0o");
        androidx.compose.ui.Modifier modifier2 = (i2 & 4) != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
        if ((i2 & 8) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localContentColor);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long m2123unboximpl = ((androidx.compose.ui.graphics.Color) consume).m2123unboximpl();
            androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> localContentAlpha = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localContentAlpha);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            j2 = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2123unboximpl, ((java.lang.Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j2 = j;
        }
        androidx.compose.ui.graphics.ColorFilter m2154tintxETnrds$default = androidx.compose.ui.graphics.Color.m2114equalsimpl0(j2, androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) ? null : androidx.compose.ui.graphics.ColorFilter.Companion.m2154tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, j2, 0, 2, null);
        startRestartGroup.startReplaceableGroup(1547385429);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "123@5137L103");
        if (str != null) {
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(str);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, str);
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.m3808setRolekuIjeqM(semantics, androidx.compose.ui.semantics.Role.INSTANCE.m3795getImageo7Vup1c());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            companion = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
        } else {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.PainterModifierKt.paint$default(defaultSizeFor(androidx.compose.ui.graphics.GraphicsLayerModifierKt.toolingGraphicsLayer(modifier2), painter), painter, false, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), 0.0f, m2154tintxETnrds$default, 22, null).then(companion), startRestartGroup, 0);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final androidx.compose.ui.Modifier modifier3 = modifier2;
        final long j3 = j2;
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.IconKt$Icon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                androidx.compose.material.IconKt.m1412Iconww6aTOc(androidx.compose.ui.graphics.painter.Painter.this, str, modifier3, j3, composer2, i | 1, i2);
            }
        });
    }

    private static final androidx.compose.ui.Modifier defaultSizeFor(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.painter.Painter painter) {
        androidx.compose.ui.Modifier.Companion companion;
        if (androidx.compose.ui.geometry.Size.m1936equalsimpl0(painter.getIntrinsicSize(), androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) || m1414isInfiniteuvyYCjk(painter.getIntrinsicSize())) {
            companion = DefaultIconSizeModifier;
        } else {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        return modifier.then(companion);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m1414isInfiniteuvyYCjk(long j) {
        return java.lang.Float.isInfinite(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j)) && java.lang.Float.isInfinite(androidx.compose.ui.geometry.Size.m1937getHeightimpl(j));
    }
}
