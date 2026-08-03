package androidx.compose.material;

/* compiled from: TextFieldImpl.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jµ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2e\u0010\u000f\u001aa\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldTransitionScope {
    public static final androidx.compose.material.TextFieldTransitionScope INSTANCE = new androidx.compose.material.TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material.InputPhase.values().length];
            iArr[androidx.compose.material.InputPhase.Focused.ordinal()] = 1;
            iArr[androidx.compose.material.InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[androidx.compose.material.InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d9, code lost:
    
        if (r32 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a9, code lost:
    
        if (r32 != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ad  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1580TransitionDTcfvLk(final androidx.compose.material.InputPhase inputState, final long j, final long j2, final kotlin.jvm.functions.Function3<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> contentColor, final boolean z, final kotlin.jvm.functions.Function6<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        boolean changed;
        java.lang.Object rememberedValue;
        boolean changed2;
        java.lang.Object rememberedValue2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputState, "inputState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1988729962);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Transition)P(3,2:c#ui.graphics.Color,5:c#ui.graphics.Color,1,4)276@11184L59,278@11285L325,289@11657L1101,317@12806L299,327@13151L186,333@13347L140:TextFieldImpl.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(inputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(contentColor) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(content) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(inputState, "TextFieldInputState", startRestartGroup, (i2 & 14) | 48, 0);
            androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateFloat, androidx.compose.runtime.Composer composer2, int i6) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-611722692);
                    androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(1847725064);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            androidx.compose.material.InputPhase inputPhase = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1158004136);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            int i6 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
            float f4 = 0.0f;
            if (i6 != 1) {
                if (i6 == 2) {
                    f = 0.0f;
                    startRestartGroup.endReplaceableGroup();
                    java.lang.Float valueOf = java.lang.Float.valueOf(f);
                    androidx.compose.material.InputPhase inputPhase2 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1158004136);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    i3 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f2 = 0.0f;
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf, java.lang.Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateFloat, androidx.compose.runtime.Composer composer2, int i7) {
                                    androidx.compose.animation.core.TweenSpec tween;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                                    composer2.startReplaceableGroup(-1079955085);
                                    if (animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.Focused, androidx.compose.material.InputPhase.UnfocusedEmpty)) {
                                        tween = androidx.compose.animation.core.AnimationSpecKt.tween$default(67, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
                                    } else if (animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.UnfocusedEmpty, androidx.compose.material.InputPhase.Focused) || animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.UnfocusedNotEmpty, androidx.compose.material.InputPhase.UnfocusedEmpty)) {
                                        tween = androidx.compose.animation.core.AnimationSpecKt.tween(83, 67, androidx.compose.animation.core.EasingKt.getLinearEasing());
                                    } else {
                                        tween = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                    }
                                    composer2.endReplaceableGroup();
                                    return tween;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(1399891485);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(1847725064);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                            androidx.compose.material.InputPhase inputPhase3 = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1376159017);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            i4 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase3.ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                }
                                f3 = 0.0f;
                                startRestartGroup.endReplaceableGroup();
                                java.lang.Float valueOf2 = java.lang.Float.valueOf(f3);
                                androidx.compose.material.InputPhase inputPhase4 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1376159017);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                i5 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase4.ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.runtime.State createTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf2, java.lang.Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i7) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                            composer2.startReplaceableGroup(-130058045);
                                            androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(-1462136984);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                    androidx.compose.material.InputPhase inputPhase5 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                    long j3 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase5.ordinal()] == 1 ? j : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j3);
                                    startRestartGroup.startReplaceableGroup(-3686930);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    changed = startRestartGroup.changed(m2117getColorSpaceimpl);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.animation.core.TwoWayConverter twoWayConverter = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                                    startRestartGroup.startReplaceableGroup(1847725064);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                    androidx.compose.material.InputPhase inputPhase6 = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                    long j4 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase6.ordinal()] == 1 ? j : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.ui.graphics.Color m2103boximpl = androidx.compose.ui.graphics.Color.m2103boximpl(j4);
                                    androidx.compose.material.InputPhase inputPhase7 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                    long j5 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase7.ordinal()] == 1 ? j : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.runtime.State createTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m2103boximpl, androidx.compose.ui.graphics.Color.m2103boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i7) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                            composer2.startReplaceableGroup(-32667848);
                                            androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    int i7 = (i2 & 7168) | 384;
                                    startRestartGroup.startReplaceableGroup(-1462136984);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                    androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl2 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf((i7 >> 6) & 112)).m2123unboximpl());
                                    startRestartGroup.startReplaceableGroup(-3686930);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(m2117getColorSpaceimpl2);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl2);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.startReplaceableGroup(1847725064);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                    int i8 = ((3136 | ((i7 << 3) & 57344)) >> 9) & 112;
                                    androidx.compose.runtime.State createTransitionAnimation4 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, java.lang.Integer.valueOf(i8)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf(i8)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), (androidx.compose.animation.core.TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    content.invoke(java.lang.Float.valueOf(m1576Transition_DTcfvLk$lambda1(createTransitionAnimation)), androidx.compose.ui.graphics.Color.m2103boximpl(m1578Transition_DTcfvLk$lambda5(createTransitionAnimation3)), androidx.compose.ui.graphics.Color.m2103boximpl(m1579Transition_DTcfvLk$lambda6(createTransitionAnimation4)), java.lang.Float.valueOf(m1577Transition_DTcfvLk$lambda3(createTransitionAnimation2)), startRestartGroup, java.lang.Integer.valueOf((i2 >> 3) & 57344));
                                }
                                f4 = 1.0f;
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.runtime.State createTransitionAnimation22 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf2, java.lang.Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        return invoke(segment, composer2, num.intValue());
                                    }

                                    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i72) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                        composer2.startReplaceableGroup(-130058045);
                                        androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                startRestartGroup.startReplaceableGroup(-1462136984);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                androidx.compose.material.InputPhase inputPhase52 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase52.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl3 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j3);
                                startRestartGroup.startReplaceableGroup(-3686930);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(m2117getColorSpaceimpl3);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl3);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.animation.core.TwoWayConverter twoWayConverter2 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                                startRestartGroup.startReplaceableGroup(1847725064);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                androidx.compose.material.InputPhase inputPhase62 = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase62.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.ui.graphics.Color m2103boximpl2 = androidx.compose.ui.graphics.Color.m2103boximpl(j4);
                                androidx.compose.material.InputPhase inputPhase72 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase72.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.runtime.State createTransitionAnimation32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m2103boximpl2, androidx.compose.ui.graphics.Color.m2103boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), twoWayConverter2, "LabelTextStyleColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        return invoke(segment, composer2, num.intValue());
                                    }

                                    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i72) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                        composer2.startReplaceableGroup(-32667848);
                                        androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                int i72 = (i2 & 7168) | 384;
                                startRestartGroup.startReplaceableGroup(-1462136984);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl22 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf((i72 >> 6) & 112)).m2123unboximpl());
                                startRestartGroup.startReplaceableGroup(-3686930);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(m2117getColorSpaceimpl22);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl22);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.startReplaceableGroup(1847725064);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                int i82 = ((3136 | ((i72 << 3) & 57344)) >> 9) & 112;
                                androidx.compose.runtime.State createTransitionAnimation42 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, java.lang.Integer.valueOf(i82)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf(i82)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), (androidx.compose.animation.core.TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                content.invoke(java.lang.Float.valueOf(m1576Transition_DTcfvLk$lambda1(createTransitionAnimation)), androidx.compose.ui.graphics.Color.m2103boximpl(m1578Transition_DTcfvLk$lambda5(createTransitionAnimation32)), androidx.compose.ui.graphics.Color.m2103boximpl(m1579Transition_DTcfvLk$lambda6(createTransitionAnimation42)), java.lang.Float.valueOf(m1577Transition_DTcfvLk$lambda3(createTransitionAnimation22)), startRestartGroup, java.lang.Integer.valueOf((i2 >> 3) & 57344));
                            }
                            f3 = 1.0f;
                            startRestartGroup.endReplaceableGroup();
                            java.lang.Float valueOf22 = java.lang.Float.valueOf(f3);
                            androidx.compose.material.InputPhase inputPhase42 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1376159017);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            i5 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase42.ordinal()];
                            if (i5 != 1) {
                            }
                            f4 = 1.0f;
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.State createTransitionAnimation222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf22, java.lang.Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i722) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                    composer2.startReplaceableGroup(-130058045);
                                    androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-1462136984);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                            androidx.compose.material.InputPhase inputPhase522 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase522.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl32 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j3);
                            startRestartGroup.startReplaceableGroup(-3686930);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(m2117getColorSpaceimpl32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl32);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.animation.core.TwoWayConverter twoWayConverter22 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                            startRestartGroup.startReplaceableGroup(1847725064);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                            androidx.compose.material.InputPhase inputPhase622 = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase622.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.graphics.Color m2103boximpl22 = androidx.compose.ui.graphics.Color.m2103boximpl(j4);
                            androidx.compose.material.InputPhase inputPhase722 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase722.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.State createTransitionAnimation322 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m2103boximpl22, androidx.compose.ui.graphics.Color.m2103boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$222.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), twoWayConverter22, "LabelTextStyleColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i722) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                    composer2.startReplaceableGroup(-32667848);
                                    androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            int i722 = (i2 & 7168) | 384;
                            startRestartGroup.startReplaceableGroup(-1462136984);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                            androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl222 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf((i722 >> 6) & 112)).m2123unboximpl());
                            startRestartGroup.startReplaceableGroup(-3686930);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(m2117getColorSpaceimpl222);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl222);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(1847725064);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                            int i822 = ((3136 | ((i722 << 3) & 57344)) >> 9) & 112;
                            androidx.compose.runtime.State createTransitionAnimation422 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, java.lang.Integer.valueOf(i822)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf(i822)), textFieldTransitionScope$Transition$labelContentColor$222.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), (androidx.compose.animation.core.TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            content.invoke(java.lang.Float.valueOf(m1576Transition_DTcfvLk$lambda1(createTransitionAnimation)), androidx.compose.ui.graphics.Color.m2103boximpl(m1578Transition_DTcfvLk$lambda5(createTransitionAnimation322)), androidx.compose.ui.graphics.Color.m2103boximpl(m1579Transition_DTcfvLk$lambda6(createTransitionAnimation422)), java.lang.Float.valueOf(m1577Transition_DTcfvLk$lambda3(createTransitionAnimation222)), startRestartGroup, java.lang.Integer.valueOf((i2 >> 3) & 57344));
                        } else if (i3 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.State createTransitionAnimation5 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf, java.lang.Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateFloat, androidx.compose.runtime.Composer composer2, int i73) {
                            androidx.compose.animation.core.TweenSpec tween;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer2.startReplaceableGroup(-1079955085);
                            if (animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.Focused, androidx.compose.material.InputPhase.UnfocusedEmpty)) {
                                tween = androidx.compose.animation.core.AnimationSpecKt.tween$default(67, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
                            } else if (animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.UnfocusedEmpty, androidx.compose.material.InputPhase.Focused) || animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.UnfocusedNotEmpty, androidx.compose.material.InputPhase.UnfocusedEmpty)) {
                                tween = androidx.compose.animation.core.AnimationSpecKt.tween(83, 67, androidx.compose.animation.core.EasingKt.getLinearEasing());
                            } else {
                                tween = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            }
                            composer2.endReplaceableGroup();
                            return tween;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(1399891485);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                    androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter22 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(1847725064);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    androidx.compose.material.InputPhase inputPhase32 = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1376159017);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    i4 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase32.ordinal()];
                    if (i4 != 1) {
                    }
                    f3 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    java.lang.Float valueOf222 = java.lang.Float.valueOf(f3);
                    androidx.compose.material.InputPhase inputPhase422 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1376159017);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    i5 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase422.ordinal()];
                    if (i5 != 1) {
                    }
                    f4 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.State createTransitionAnimation2222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf222, java.lang.Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$22.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i7222) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                            composer2.startReplaceableGroup(-130058045);
                            androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1462136984);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                    androidx.compose.material.InputPhase inputPhase5222 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase5222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl322 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j3);
                    startRestartGroup.startReplaceableGroup(-3686930);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m2117getColorSpaceimpl322);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl322);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.animation.core.TwoWayConverter twoWayConverter222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                    startRestartGroup.startReplaceableGroup(1847725064);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    androidx.compose.material.InputPhase inputPhase6222 = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase6222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.graphics.Color m2103boximpl222 = androidx.compose.ui.graphics.Color.m2103boximpl(j4);
                    androidx.compose.material.InputPhase inputPhase7222 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase7222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.State createTransitionAnimation3222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m2103boximpl222, androidx.compose.ui.graphics.Color.m2103boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2222.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), twoWayConverter222, "LabelTextStyleColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i7222) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                            composer2.startReplaceableGroup(-32667848);
                            androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    int i7222 = (i2 & 7168) | 384;
                    startRestartGroup.startReplaceableGroup(-1462136984);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                    androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl2222 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf((i7222 >> 6) & 112)).m2123unboximpl());
                    startRestartGroup.startReplaceableGroup(-3686930);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(m2117getColorSpaceimpl2222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl2222);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(1847725064);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    int i8222 = ((3136 | ((i7222 << 3) & 57344)) >> 9) & 112;
                    androidx.compose.runtime.State createTransitionAnimation4222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, java.lang.Integer.valueOf(i8222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf(i8222)), textFieldTransitionScope$Transition$labelContentColor$2222.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), (androidx.compose.animation.core.TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    content.invoke(java.lang.Float.valueOf(m1576Transition_DTcfvLk$lambda1(createTransitionAnimation5)), androidx.compose.ui.graphics.Color.m2103boximpl(m1578Transition_DTcfvLk$lambda5(createTransitionAnimation3222)), androidx.compose.ui.graphics.Color.m2103boximpl(m1579Transition_DTcfvLk$lambda6(createTransitionAnimation4222)), java.lang.Float.valueOf(m1577Transition_DTcfvLk$lambda3(createTransitionAnimation2222)), startRestartGroup, java.lang.Integer.valueOf((i2 >> 3) & 57344));
                } else if (i6 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            startRestartGroup.endReplaceableGroup();
            java.lang.Float valueOf3 = java.lang.Float.valueOf(f);
            androidx.compose.material.InputPhase inputPhase22 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1158004136);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            i3 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase22.ordinal()];
            if (i3 != 1) {
            }
            f2 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.State createTransitionAnimation52 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf3, java.lang.Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateFloat, androidx.compose.runtime.Composer composer2, int i73) {
                    androidx.compose.animation.core.TweenSpec tween;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-1079955085);
                    if (animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.Focused, androidx.compose.material.InputPhase.UnfocusedEmpty)) {
                        tween = androidx.compose.animation.core.AnimationSpecKt.tween$default(67, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
                    } else if (animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.UnfocusedEmpty, androidx.compose.material.InputPhase.Focused) || animateFloat.isTransitioningTo(androidx.compose.material.InputPhase.UnfocusedNotEmpty, androidx.compose.material.InputPhase.UnfocusedEmpty)) {
                        tween = androidx.compose.animation.core.AnimationSpecKt.tween(83, 67, androidx.compose.animation.core.EasingKt.getLinearEasing());
                    } else {
                        tween = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    composer2.endReplaceableGroup();
                    return tween;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter222 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(1847725064);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            androidx.compose.material.InputPhase inputPhase322 = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1376159017);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            i4 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase322.ordinal()];
            if (i4 != 1) {
            }
            f3 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            java.lang.Float valueOf2222 = java.lang.Float.valueOf(f3);
            androidx.compose.material.InputPhase inputPhase4222 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1376159017);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            i5 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase4222.ordinal()];
            if (i5 != 1) {
            }
            f4 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.State createTransitionAnimation22222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, java.lang.Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$222.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i72222) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-130058045);
                    androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1462136984);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
            androidx.compose.material.InputPhase inputPhase52222 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase52222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl3222 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(-3686930);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m2117getColorSpaceimpl3222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl3222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.animation.core.TwoWayConverter twoWayConverter2222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(1847725064);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            androidx.compose.material.InputPhase inputPhase62222 = (androidx.compose.material.InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase62222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.graphics.Color m2103boximpl2222 = androidx.compose.ui.graphics.Color.m2103boximpl(j4);
            androidx.compose.material.InputPhase inputPhase72222 = (androidx.compose.material.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            if (androidx.compose.material.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0[inputPhase72222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.State createTransitionAnimation32222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m2103boximpl2222, androidx.compose.ui.graphics.Color.m2103boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22222.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), twoWayConverter2222, "LabelTextStyleColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material.InputPhase> animateColor, androidx.compose.runtime.Composer composer2, int i72222) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-32667848);
                    androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            int i72222 = (i2 & 7168) | 384;
            startRestartGroup.startReplaceableGroup(-1462136984);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
            androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl22222 = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf((i72222 >> 6) & 112)).m2123unboximpl());
            startRestartGroup.startReplaceableGroup(-3686930);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(m2117getColorSpaceimpl22222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl22222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1847725064);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            int i82222 = ((3136 | ((i72222 << 3) & 57344)) >> 9) & 112;
            androidx.compose.runtime.State createTransitionAnimation42222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, java.lang.Integer.valueOf(i82222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, java.lang.Integer.valueOf(i82222)), textFieldTransitionScope$Transition$labelContentColor$22222.invoke((androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), (androidx.compose.animation.core.TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            content.invoke(java.lang.Float.valueOf(m1576Transition_DTcfvLk$lambda1(createTransitionAnimation52)), androidx.compose.ui.graphics.Color.m2103boximpl(m1578Transition_DTcfvLk$lambda5(createTransitionAnimation32222)), androidx.compose.ui.graphics.Color.m2103boximpl(m1579Transition_DTcfvLk$lambda6(createTransitionAnimation42222)), java.lang.Float.valueOf(m1577Transition_DTcfvLk$lambda3(createTransitionAnimation22222)), startRestartGroup, java.lang.Integer.valueOf((i2 >> 3) & 57344));
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i9) {
                androidx.compose.material.TextFieldTransitionScope.this.m1580TransitionDTcfvLk(inputState, j, j2, contentColor, z, content, composer2, i | 1);
            }
        });
    }

    /* renamed from: Transition_DTcfvLk$lambda-1, reason: not valid java name */
    private static final float m1576Transition_DTcfvLk$lambda1(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-3, reason: not valid java name */
    private static final float m1577Transition_DTcfvLk$lambda3(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-5, reason: not valid java name */
    private static final long m1578Transition_DTcfvLk$lambda5(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m2123unboximpl();
    }

    /* renamed from: Transition_DTcfvLk$lambda-6, reason: not valid java name */
    private static final long m1579Transition_DTcfvLk$lambda6(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m2123unboximpl();
    }
}
