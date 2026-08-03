package androidx.compose.material;

/* compiled from: Switch.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a?\u0010!\u001a\u00020\u0014*\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010\u001c\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a1\u0010'\u001a\u00020\u0014*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\t\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\n\u0010\u000b\"\u0013\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u000f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0010\u0010\u000b\"\u0019\u0010\u0011\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final androidx.compose.animation.core.TweenSpec<java.lang.Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.SwitchColors switchColors, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.material.SwitchColors switchColors2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        int i6;
        androidx.compose.ui.Modifier modifier3;
        boolean z4;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.material.SwitchColors switchColors3;
        androidx.compose.runtime.Composer composer2;
        boolean z5;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
        final boolean z6;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        final androidx.compose.material.SwitchColors switchColors4;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(25866825);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Switch)P(!1,5,4,2,3)94@4383L39,95@4466L8,*98@4538L7,99@4599L72,100@4709L7,115@5150L1024:Switch.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            if (startRestartGroup.changed(switchColors2)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            switchColors2 = switchColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion2 = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            boolean z7 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) == 0) {
                                i3 &= -458753;
                                modifier3 = companion2;
                                z4 = z7;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColors3 = androidx.compose.material.SwitchDefaults.INSTANCE.m1523colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                            } else {
                                i6 = i3;
                                modifier3 = companion2;
                                z4 = z7;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColors3 = switchColors2;
                                startRestartGroup.endDefaults();
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume = startRestartGroup.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                float mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume).mo315toPx0680j_4(ThumbPathLength);
                                androidx.compose.material.SwipeableState rememberSwipeableStateFor = androidx.compose.material.SwipeableKt.rememberSwipeableStateFor(java.lang.Boolean.valueOf(z), function1 != null ? new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                                    public final void invoke(boolean z8) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } : function1, AnimationSpec, startRestartGroup, (i6 & 14) | 384, 0);
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                boolean z8 = consume2 != androidx.compose.ui.unit.LayoutDirection.Rtl;
                                if (function1 == null) {
                                    composer2 = startRestartGroup;
                                    z5 = false;
                                    companion = androidx.compose.foundation.selection.ToggleableKt.m821toggleableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c()), function1);
                                } else {
                                    composer2 = startRestartGroup;
                                    z5 = false;
                                    companion = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                if (function1 != null) {
                                    companion3 = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(companion3);
                                }
                                m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(modifier3.then(companion3).then(companion), rememberSwipeableStateFor, r20, androidx.compose.foundation.gestures.Orientation.Horizontal, (r26 & 8) != 0 ? true : (z4 || function1 == null) ? false : true, (r26 & 16) != 0 ? false : z8, (r26 & 32) != 0 ? null : mutableInteractionSource4, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                        return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                    }
                                } : new kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, androidx.compose.material.ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt$Switch$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ androidx.compose.material.ThresholdConfig invoke(java.lang.Boolean bool, java.lang.Boolean bool2) {
                                        return invoke(bool.booleanValue(), bool2.booleanValue());
                                    }

                                    public final androidx.compose.material.ThresholdConfig invoke(boolean z9, boolean z10) {
                                        return new androidx.compose.material.FractionalThreshold(0.5f);
                                    }
                                }, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(0.0f), java.lang.Boolean.valueOf(z5)), kotlin.TuplesKt.to(java.lang.Float.valueOf(mo315toPx0680j_4), true)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                androidx.compose.ui.Modifier m611requiredSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m611requiredSizeVpY3zN4(androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(m1521swipeablepPrIpRY, androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                                composer2.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = composer2.consume(localDensity2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer2.consume(localLayoutDirection2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = composer2.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m611requiredSizeVpY3zN4);
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-2137368960);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(1571176015);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C135@5958L210:Switch.kt#jmzs0o");
                                int i9 = i6 << 3;
                                startRestartGroup = composer2;
                                SwitchImpl(boxScopeInstance, z, z4, switchColors3, rememberSwipeableStateFor.getOffset(), mutableInteractionSource4, startRestartGroup, (i9 & 112) | 6 | ((i6 >> 3) & 896) | ((i6 >> 6) & 7168) | (i9 & 458752));
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                modifier2 = modifier3;
                                z6 = z4;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                switchColors4 = switchColors3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColors3 = switchColors2;
                        }
                        i6 = i3;
                        startRestartGroup.endDefaults();
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume6 = startRestartGroup.consume(localDensity3);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float mo315toPx0680j_42 = ((androidx.compose.ui.unit.Density) consume6).mo315toPx0680j_4(ThumbPathLength);
                        androidx.compose.material.SwipeableState rememberSwipeableStateFor2 = androidx.compose.material.SwipeableKt.rememberSwipeableStateFor(java.lang.Boolean.valueOf(z), function1 != null ? new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z82) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                                invoke(bool.booleanValue());
                                return kotlin.Unit.INSTANCE;
                            }
                        } : function1, AnimationSpec, startRestartGroup, (i6 & 14) | 384, 0);
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume22 = startRestartGroup.consume(localLayoutDirection3);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (consume22 != androidx.compose.ui.unit.LayoutDirection.Rtl) {
                        }
                        if (function1 == null) {
                        }
                        androidx.compose.ui.Modifier.Companion companion32 = androidx.compose.ui.Modifier.INSTANCE;
                        if (function1 != null) {
                        }
                        m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(modifier3.then(companion32).then(companion), rememberSwipeableStateFor2, r20, androidx.compose.foundation.gestures.Orientation.Horizontal, (r26 & 8) != 0 ? true : (z4 || function1 == null) ? false : true, (r26 & 16) != 0 ? false : z8, (r26 & 32) != 0 ? null : mutableInteractionSource4, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                            }
                        } : new kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, androidx.compose.material.ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt$Switch$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ androidx.compose.material.ThresholdConfig invoke(java.lang.Boolean bool, java.lang.Boolean bool2) {
                                return invoke(bool.booleanValue(), bool2.booleanValue());
                            }

                            public final androidx.compose.material.ThresholdConfig invoke(boolean z9, boolean z10) {
                                return new androidx.compose.material.FractionalThreshold(0.5f);
                            }
                        }, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(0.0f), java.lang.Boolean.valueOf(z5)), kotlin.TuplesKt.to(java.lang.Float.valueOf(mo315toPx0680j_42), true)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                        androidx.compose.ui.Modifier m611requiredSizeVpY3zN42 = androidx.compose.foundation.layout.SizeKt.m611requiredSizeVpY3zN4(androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(m1521swipeablepPrIpRY, androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        composer2.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume32 = composer2.consume(localDensity22);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume32;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume42 = composer2.consume(localLayoutDirection22);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume42;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume52 = composer2.consume(localViewConfiguration2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume52;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(m611requiredSizeVpY3zN42);
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        composer2.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1571176015);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C135@5958L210:Switch.kt#jmzs0o");
                        int i92 = i6 << 3;
                        startRestartGroup = composer2;
                        SwitchImpl(boxScopeInstance2, z, z4, switchColors3, rememberSwipeableStateFor2.getOffset(), mutableInteractionSource4, startRestartGroup, (i92 & 112) | 6 | ((i6 >> 3) & 896) | ((i6 >> 6) & 7168) | (i92 & 458752));
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        modifier2 = modifier3;
                        z6 = z4;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        switchColors4 = switchColors3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        switchColors4 = switchColors2;
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i10) {
                            androidx.compose.material.SwitchKt.Switch(z, function1, modifier2, z6, mutableInteractionSource5, switchColors4, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 458752) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchImpl(final androidx.compose.foundation.layout.BoxScope boxScope, final boolean z, final boolean z2, final androidx.compose.material.SwitchColors switchColors, final androidx.compose.runtime.State<java.lang.Float> state, final androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        float f;
        java.lang.String str;
        int i3;
        long m1525SwitchImpl$lambda7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1834839253);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SwitchImpl)P(!1,2!1,4)181@7257L46,183@7343L614,183@7309L648,202@8160L28,203@8248L81,203@8193L136,206@8359L28,207@8437L7,*208@8496L7,210@8585L6,218@8838L47,221@8995L59,215@8751L479:Switch.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
            int i4 = (i2 >> 15) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.material.SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i4);
            if (!snapshotStateList.isEmpty()) {
                f = ThumbPressedElevation;
            } else {
                f = ThumbDefaultElevation;
            }
            float f2 = f;
            int i5 = ((i2 >> 3) & 896) | ((i2 >> 6) & 14) | (i2 & 112);
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trackColor = switchColors.trackColor(z2, z, startRestartGroup, i5);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(boxScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(trackColor);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                        invoke2(drawScope);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope Canvas) {
                        long m1524SwitchImpl$lambda5;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        m1524SwitchImpl$lambda5 = androidx.compose.material.SwitchKt.m1524SwitchImpl$lambda5(trackColor);
                        androidx.compose.material.SwitchKt.m1528drawTrackRPmYEkk(Canvas, m1524SwitchImpl$lambda5, Canvas.mo315toPx0680j_4(androidx.compose.material.SwitchKt.getTrackWidth()), Canvas.mo315toPx0680j_4(androidx.compose.material.SwitchKt.getTrackStrokeWidth()));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
            androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> thumbColor = switchColors.thumbColor(z2, z, startRestartGroup, i5);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localElevationOverlay);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.material.ElevationOverlay elevationOverlay = (androidx.compose.material.ElevationOverlay) consume;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localAbsoluteElevation);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2).m4492unboximpl() + f2);
            startRestartGroup.startReplaceableGroup(-539245361);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "211@8660L36");
            if (androidx.compose.ui.graphics.Color.m2114equalsimpl0(m1525SwitchImpl$lambda7(thumbColor), androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU()) && elevationOverlay != null) {
                i3 = 0;
                str = "C(remember)P(1):Composables.kt#9igjgp";
                m1525SwitchImpl$lambda7 = elevationOverlay.mo1349apply7g2Lkgo(m1525SwitchImpl$lambda7(thumbColor), m4478constructorimpl, startRestartGroup, 0);
            } else {
                str = "C(remember)P(1):Composables.kt#9igjgp";
                i3 = 0;
                m1525SwitchImpl$lambda7 = m1525SwitchImpl$lambda7(thumbColor);
            }
            long j = m1525SwitchImpl$lambda7;
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier align = boxScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart());
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, str);
            boolean changed3 = startRestartGroup.changed(state);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density) {
                        return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1529invokeBjo55l4(density));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m1529invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(state.getValue().floatValue()), 0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ShadowKt.m1784shadows4CzXII$default(androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.foundation.IndicationKt.indication(androidx.compose.foundation.layout.OffsetKt.offset(align, (kotlin.jvm.functions.Function1) rememberedValue4), interactionSource, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), ThumbDiameter), f2, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), j, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), startRestartGroup, i3);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                androidx.compose.material.SwitchKt.SwitchImpl(androidx.compose.foundation.layout.BoxScope.this, z, z2, switchColors, state, interactionSource, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1528drawTrackRPmYEkk(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2664drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f3, androidx.compose.ui.geometry.Offset.m1872getYimpl(drawScope.mo2591getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f3, androidx.compose.ui.geometry.Offset.m1872getYimpl(drawScope.mo2591getCenterF1C5BW0())), f2, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2475getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchImpl$lambda-5, reason: not valid java name */
    public static final long m1524SwitchImpl$lambda5(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m2123unboximpl();
    }

    /* renamed from: SwitchImpl$lambda-7, reason: not valid java name */
    private static final long m1525SwitchImpl$lambda7(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m2123unboximpl();
    }

    static {
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(34);
        TrackWidth = m4478constructorimpl;
        TrackStrokeWidth = androidx.compose.ui.unit.Dp.m4478constructorimpl(14);
        float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(20);
        ThumbDiameter = m4478constructorimpl2;
        ThumbRippleRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(24);
        DefaultSwitchPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(2);
        SwitchWidth = m4478constructorimpl;
        SwitchHeight = m4478constructorimpl2;
        ThumbPathLength = androidx.compose.ui.unit.Dp.m4478constructorimpl(m4478constructorimpl - m4478constructorimpl2);
        AnimationSpec = new androidx.compose.animation.core.TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = androidx.compose.ui.unit.Dp.m4478constructorimpl(1);
        ThumbPressedElevation = androidx.compose.ui.unit.Dp.m4478constructorimpl(6);
    }
}
