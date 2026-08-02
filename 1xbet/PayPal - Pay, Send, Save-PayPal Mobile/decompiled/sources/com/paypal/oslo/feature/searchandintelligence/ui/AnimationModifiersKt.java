package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aQ\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aQ\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u0017\u0010\u0012\u001a[\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"initialScaleAnimation", "Landroidx/compose/ui/Modifier;", "duration", "Lkotlin/time/Duration;", "from", "", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "initialScaleAnimation-nRVORKE", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "initialOffsetYAnimation", "Landroidx/compose/ui/unit/Dp;", "isVisible", "", "hasAnimated", "onAnimate", "Lkotlin/Function0;", "", "initialOffsetYAnimation-arrUXIw", "(Landroidx/compose/ui/Modifier;JFFZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "initialAlphaAnimation", "initialAlphaAnimation-5fuBHu4", "(Landroidx/compose/ui/Modifier;JZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "initialRotationAnimation", "initialRotationAnimation-k5Tw5DY", "staggeredOffsetYAnimation", "index", "", "staggerDelay", "staggeredOffsetYAnimation-j5PcJmA", "(Landroidx/compose/ui/Modifier;IFFJZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "search-and-intelligence_prodRelease", "targetScale", "scale"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AnimationModifiersKt {
    /* renamed from: initialScaleAnimation-nRVORKE, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m19125initialScaleAnimationnRVORKE(androidx.compose.ui.Modifier modifier, long j, float f, float f2, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        float f3 = (i2 & 4) != 0 ? 1.0f : f2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-995520639, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.initialScaleAnimation (AnimationModifiers.kt:47)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        boolean z = (((i & 7168) ^ 3072) > 2048 && composer.changed(f3)) || (i & 3072) == 2048;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialScaleAnimation$1$1(f3, mutableFloatState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, 6);
        final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(mutableFloatState.getFloatValue(), androidx.compose.animation.core.AnimationSpecKt.tween$default((int) kotlin.time.Duration.m23953getInWholeMillisecondsimpl(j), 0, androidx.compose.animation.core.EasingFunctionsKt.getEaseIn(), 2, null), 0.0f, "initialScale", null, composer, 3072, 20);
        boolean changed = composer.changed(animateFloatAsState);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.m19119$r8$lambda$8b8okO62RTRUbtxZqcFB2j2WQE(androidx.compose.runtime.State.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, (kotlin.jvm.functions.Function1) rememberedValue3);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return graphicsLayer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
    
        if (r26.changed(r19) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* renamed from: initialOffsetYAnimation-arrUXIw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.Modifier m19123initialOffsetYAnimationarrUXIw(androidx.compose.ui.Modifier modifier, long j, float f, float f2, boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        boolean z3;
        boolean z4;
        boolean changed;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        java.lang.Object rememberedValue2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        float m8601constructorimpl = (i2 & 4) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
        boolean z5 = (i2 & 8) != 0 ? true : z;
        boolean z6 = (i2 & 16) != 0 ? false : z2;
        if ((i2 & 32) != 0) {
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
        } else {
            function02 = function0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1636901697, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.initialOffsetYAnimation (AnimationModifiers.kt:92)");
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        boolean z7 = (((i & 896) ^ 384) > 256 && composer.changed(f)) || (i & 384) == 256;
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (z7 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = java.lang.Float.valueOf(density.mo1418toPx0680j_4(f));
            composer.updateRememberedValue(rememberedValue4);
        }
        float floatValue = ((java.lang.Number) rememberedValue4).floatValue();
        boolean z8 = (((i & 7168) ^ 3072) > 2048 && composer.changed(m8601constructorimpl)) || (i & 3072) == 2048;
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if (z8 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = java.lang.Float.valueOf(density.mo1418toPx0680j_4(m8601constructorimpl));
            composer.updateRememberedValue(rememberedValue5);
        }
        float floatValue2 = ((java.lang.Number) rememberedValue5).floatValue();
        float f3 = z6 ? floatValue2 : floatValue;
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = androidx.compose.animation.core.AnimatableKt.Animatable$default(f3, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue6);
        }
        final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue6;
        boolean z9 = (((57344 & i) ^ 24576) > 16384 && composer.changed(z5)) || (i & 24576) == 16384;
        boolean z10 = (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(z6)) || (i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
        boolean changedInstance2 = composer.changedInstance(animatable);
        boolean changed2 = composer.changed(floatValue2);
        if (((i & 112) ^ 48) <= 32) {
        }
        if ((i & 48) != 32) {
            z3 = false;
            z4 = (((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(function02)) || (1572864 & i) == 1048576;
            changed = composer.changed(floatValue);
            rememberedValue = composer.rememberedValue();
            if (!(z9 | z10 | changedInstance2 | changed2 | z3 | z4 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialOffsetYAnimation$2$1(z5, z6, animatable, floatValue2, j, function02, floatValue, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z5), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, (i >> 12) & 14);
            changedInstance = composer.changedInstance(animatable);
            rememberedValue2 = composer.rememberedValue();
            if (!changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.$r8$lambda$zEgmHYL_WgzSGsKKbmhDBvZyONo(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, (kotlin.jvm.functions.Function1) rememberedValue2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return graphicsLayer;
        }
        z3 = true;
        if (((3670016 & i) ^ 1572864) <= 1048576) {
        }
        changed = composer.changed(floatValue);
        rememberedValue = composer.rememberedValue();
        if (!(z9 | z10 | changedInstance2 | changed2 | z3 | z4 | changed)) {
        }
        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialOffsetYAnimation$2$1(z5, z6, animatable, floatValue2, j, function02, floatValue, null);
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z5), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, (i >> 12) & 14);
        changedInstance = composer.changedInstance(animatable);
        rememberedValue2 = composer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.$r8$lambda$zEgmHYL_WgzSGsKKbmhDBvZyONo(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
            }
        };
        composer.updateRememberedValue(rememberedValue2);
        androidx.compose.ui.Modifier graphicsLayer2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, (kotlin.jvm.functions.Function1) rememberedValue2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return graphicsLayer2;
    }

    /* renamed from: initialAlphaAnimation-5fuBHu4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m19122initialAlphaAnimation5fuBHu4(androidx.compose.ui.Modifier modifier, long j, boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        boolean z3 = (i2 & 4) != 0 ? false : z2;
        if ((i2 & 8) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function02 = (kotlin.jvm.functions.Function0) rememberedValue;
        } else {
            function02 = function0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1365360503, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.initialAlphaAnimation (AnimationModifiers.kt:140)");
        }
        float f = z3 ? 1.0f : 0.0f;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.animation.core.AnimatableKt.Animatable$default(f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue2;
        boolean z4 = (((i & 896) ^ 384) > 256 && composer.changed(z)) || (i & 384) == 256;
        boolean z5 = (((i & 7168) ^ 3072) > 2048 && composer.changed(z3)) || (i & 3072) == 2048;
        boolean changedInstance = composer.changedInstance(animatable);
        boolean z6 = (((i & 112) ^ 48) > 32 && composer.changed(j)) || (i & 48) == 32;
        boolean z7 = (((57344 & i) ^ 24576) > 16384 && composer.changed(function02)) || (i & 24576) == 16384;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((z7 | z4 | z5 | changedInstance | z6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialAlphaAnimation$2$1(z, z3, animatable, j, function02, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer, (i >> 6) & 14);
        boolean changedInstance2 = composer.changedInstance(animatable);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.m19120$r8$lambda$UejtWvbCNl8JDIiLhl2RZcuNFE(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, (kotlin.jvm.functions.Function1) rememberedValue4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return graphicsLayer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r26.changed(r19) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        if (r26.changed(r21) == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* renamed from: initialRotationAnimation-k5Tw5DY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.Modifier m19124initialRotationAnimationk5Tw5DY(androidx.compose.ui.Modifier modifier, long j, float f, float f2, boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        boolean z3;
        boolean z4;
        boolean z5;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        java.lang.Object rememberedValue2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        float f3 = (i2 & 4) != 0 ? 0.0f : f2;
        boolean z6 = (i2 & 8) != 0 ? true : z;
        boolean z7 = (i2 & 16) != 0 ? false : z2;
        if ((i2 & 32) != 0) {
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
        } else {
            function02 = function0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2001481331, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.initialRotationAnimation (AnimationModifiers.kt:187)");
        }
        float f4 = z7 ? f3 : f;
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = androidx.compose.animation.core.AnimatableKt.Animatable$default(f4, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue4;
        boolean z8 = (((57344 & i) ^ 24576) > 16384 && composer.changed(z6)) || (i & 24576) == 16384;
        boolean z9 = (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(z7)) || (i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
        boolean changedInstance2 = composer.changedInstance(animatable);
        boolean z10 = (((i & 7168) ^ 3072) > 2048 && composer.changed(f3)) || (i & 3072) == 2048;
        if (((i & 112) ^ 48) <= 32) {
        }
        if ((i & 48) != 32) {
            z3 = false;
            z4 = (((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(function02)) || (i & 1572864) == 1048576;
            if (((i & 896) ^ 384) <= 256) {
            }
            if ((i & 384) != 256) {
                z5 = false;
                rememberedValue = composer.rememberedValue();
                if (!(z3 | z8 | z9 | changedInstance2 | z10 | z4 | z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialRotationAnimation$2$1(z6, z7, animatable, f3, j, function02, f, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z6), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, (i >> 12) & 14);
                changedInstance = composer.changedInstance(animatable);
                rememberedValue2 = composer.rememberedValue();
                if (!changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.$r8$lambda$fZ_05Zh3wJlxv503kRB4QRmUdcE(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, (kotlin.jvm.functions.Function1) rememberedValue2);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return graphicsLayer;
            }
            z5 = true;
            rememberedValue = composer.rememberedValue();
            if (!(z3 | z8 | z9 | changedInstance2 | z10 | z4 | z5)) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialRotationAnimation$2$1(z6, z7, animatable, f3, j, function02, f, null);
            composer.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z6), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, (i >> 12) & 14);
            changedInstance = composer.changedInstance(animatable);
            rememberedValue2 = composer.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.$r8$lambda$fZ_05Zh3wJlxv503kRB4QRmUdcE(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
            androidx.compose.ui.Modifier graphicsLayer2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, (kotlin.jvm.functions.Function1) rememberedValue2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return graphicsLayer2;
        }
        z3 = true;
        if (((3670016 & i) ^ 1572864) <= 1048576) {
        }
        if (((i & 896) ^ 384) <= 256) {
        }
        if ((i & 384) != 256) {
        }
        z5 = true;
        rememberedValue = composer.rememberedValue();
        if (!(z3 | z8 | z9 | changedInstance2 | z10 | z4 | z5)) {
        }
        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialRotationAnimation$2$1(z6, z7, animatable, f3, j, function02, f, null);
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z6), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, (i >> 12) & 14);
        changedInstance = composer.changedInstance(animatable);
        rememberedValue2 = composer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.$r8$lambda$fZ_05Zh3wJlxv503kRB4QRmUdcE(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
            }
        };
        composer.updateRememberedValue(rememberedValue2);
        androidx.compose.ui.Modifier graphicsLayer22 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, (kotlin.jvm.functions.Function1) rememberedValue2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return graphicsLayer22;
    }

    /* renamed from: staggeredOffsetYAnimation-j5PcJmA, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m19126staggeredOffsetYAnimationj5PcJmA(androidx.compose.ui.Modifier modifier, int i, float f, float f2, long j, boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i2, int i3) {
        long j2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        float m8601constructorimpl = (i3 & 4) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
        if ((i3 & 8) != 0) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            j2 = kotlin.time.DurationKt.toDuration(100, kotlin.time.DurationUnit.MILLISECONDS);
        } else {
            j2 = j;
        }
        boolean z3 = (i3 & 16) != 0 ? true : z;
        boolean z4 = (i3 & 32) != 0 ? false : z2;
        if ((i3 & 64) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function02 = (kotlin.jvm.functions.Function0) rememberedValue;
        } else {
            function02 = function0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1509189588, i2, -1, "com.paypal.oslo.feature.searchandintelligence.ui.staggeredOffsetYAnimation (AnimationModifiers.kt:240)");
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        boolean z5 = (((i2 & 896) ^ 384) > 256 && composer.changed(f)) || (i2 & 384) == 256;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z5 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = java.lang.Float.valueOf(density.mo1418toPx0680j_4(f));
            composer.updateRememberedValue(rememberedValue2);
        }
        float floatValue = ((java.lang.Number) rememberedValue2).floatValue();
        boolean z6 = (((i2 & 7168) ^ 3072) > 2048 && composer.changed(m8601constructorimpl)) || (i2 & 3072) == 2048;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (z6 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = java.lang.Float.valueOf(density.mo1418toPx0680j_4(m8601constructorimpl));
            composer.updateRememberedValue(rememberedValue3);
        }
        float floatValue2 = ((java.lang.Number) rememberedValue3).floatValue();
        float f3 = z4 ? floatValue2 : floatValue;
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = androidx.compose.animation.core.AnimatableKt.Animatable$default(f3, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue4;
        boolean z7 = ((((3670016 & i2) ^ 1572864) > 1048576 && composer.changed(z4)) || (i2 & 1572864) == 1048576) | ((((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(z3)) || (i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
        boolean z8 = (((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32;
        boolean z9 = (((57344 & i2) ^ 24576) > 16384 && composer.changed(j2)) || (i2 & 24576) == 16384;
        boolean changedInstance = composer.changedInstance(animatable);
        boolean changed = composer.changed(floatValue2);
        boolean z10 = (((i2 & 29360128) ^ 12582912) > 8388608 && composer.changed(function02)) || (i2 & 12582912) == 8388608;
        boolean changed2 = composer.changed(floatValue);
        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((z10 | z7 | z8 | z9 | changedInstance | changed | changed2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$staggeredOffsetYAnimation$2$1(z3, z4, i, j2, animatable, floatValue2, function03, floatValue, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z3), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, composer, (i2 >> 15) & 14);
        boolean changedInstance2 = composer.changedInstance(animatable);
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.m19118$r8$lambda$0vmS_z81B50c4t0VdagmNHDi7I(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, (kotlin.jvm.functions.Function1) rememberedValue6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return graphicsLayer;
    }

    /* renamed from: $r8$lambda$0vmS_z81B50c4t0VdagmNHDi7-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19118$r8$lambda$0vmS_z81B50c4t0VdagmNHDi7I(androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setTranslationY(((java.lang.Number) animatable.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8-b8okO62RTRUbtxZqcFB2j2WQE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19119$r8$lambda$8b8okO62RTRUbtxZqcFB2j2WQE(androidx.compose.runtime.State state, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setScaleX(((java.lang.Number) state.getValue()).floatValue());
        graphicsLayerScope.setScaleY(((java.lang.Number) state.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UejtWvbCNl8JDIiLhl2RZc-uNFE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19120$r8$lambda$UejtWvbCNl8JDIiLhl2RZcuNFE(androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setAlpha(((java.lang.Number) animatable.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fZ_05Zh3wJlxv503kRB4QRmUdcE(androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setRotationZ(((java.lang.Number) animatable.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zEgmHYL_WgzSGsKKbmhDBvZyONo(androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setTranslationY(((java.lang.Number) animatable.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }
}
