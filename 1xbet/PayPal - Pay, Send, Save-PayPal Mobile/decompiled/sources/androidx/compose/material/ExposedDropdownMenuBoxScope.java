package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&JU\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "<init>", "()V", "exposedDropdownSize", "Landroidx/compose/ui/Modifier;", "matchTextFieldWidth", "", "ExposedDropdownMenu", "", "expanded", "onDismissRequest", "Lkotlin/Function0;", "modifier", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    public abstract androidx.compose.ui.Modifier exposedDropdownSize(androidx.compose.ui.Modifier modifier, boolean z);

    public static /* synthetic */ androidx.compose.ui.Modifier exposedDropdownSize$default(androidx.compose.material.ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, androidx.compose.ui.Modifier modifier, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ExposedDropdownMenu(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.ScrollState scrollState2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.foundation.ScrollState rememberScrollState;
        java.lang.Object rememberedValue;
        final androidx.compose.animation.core.MutableTransitionState mutableTransitionState;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1576205770);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                scrollState2 = scrollState;
            }
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        modifier3 = companion;
                        rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1576205770, i3, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new androidx.compose.animation.core.MutableTransitionState(java.lang.Boolean.FALSE);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
                        mutableTransitionState.setTargetState$animation_core(java.lang.Boolean.valueOf(z));
                        if (!((java.lang.Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((java.lang.Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                            startRestartGroup.startReplaceGroup(132200795);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ()), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                            long m8672getZeroRKDOV3M = androidx.compose.ui.unit.DpOffset.INSTANCE.m8672getZeroRKDOV3M();
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return androidx.compose.material.ExposedDropdownMenuBoxScope.m2619$r8$lambda$wnVK1eudBOXb8hHu_GdJWKXJfM(androidx.compose.runtime.MutableState.this, (androidx.compose.ui.unit.IntRect) obj, (androidx.compose.ui.unit.IntRect) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            final androidx.compose.foundation.ScrollState scrollState3 = rememberScrollState;
                            final androidx.compose.ui.Modifier modifier4 = modifier3;
                            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(function0, new androidx.compose.material.DropdownMenuPositionProvider(m8672getZeroRKDOV3M, density, (kotlin.jvm.functions.Function2) rememberedValue3, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1604457564, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.compose.material.ExposedDropdownMenuBoxScope.$r8$lambda$EoGF2gdWs4RPj7GEb5onZ9uYNPw(androidx.compose.animation.core.MutableTransitionState.this, mutableState, scrollState3, this, modifier4, function3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                        } else {
                            startRestartGroup.startReplaceGroup(123836716);
                        }
                        startRestartGroup.endReplaceGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        scrollState2 = rememberScrollState;
                    } else {
                        modifier3 = companion;
                    }
                }
                rememberScrollState = scrollState2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
                mutableTransitionState.setTargetState$animation_core(java.lang.Boolean.valueOf(z));
                if (((java.lang.Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                }
                startRestartGroup.startReplaceGroup(132200795);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                long m8672getZeroRKDOV3M2 = androidx.compose.ui.unit.DpOffset.INSTANCE.m8672getZeroRKDOV3M();
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.compose.foundation.ScrollState scrollState32 = rememberScrollState;
                final androidx.compose.ui.Modifier modifier42 = modifier3;
                androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(function0, new androidx.compose.material.DropdownMenuPositionProvider(m8672getZeroRKDOV3M2, density2, (kotlin.jvm.functions.Function2) rememberedValue3, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1604457564, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.ExposedDropdownMenuBoxScope.$r8$lambda$EoGF2gdWs4RPj7GEb5onZ9uYNPw(androidx.compose.animation.core.MutableTransitionState.this, mutableState2, scrollState32, this, modifier42, function3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                scrollState2 = rememberScrollState;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.ExposedDropdownMenuBoxScope.$r8$lambda$1CFUVrM8FjE_DXUXalR1lz7aH1k(androidx.compose.material.ExposedDropdownMenuBoxScope.this, z, function0, modifier2, scrollState2, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1CFUVrM8FjE_DXUXalR1lz7aH1k(androidx.compose.material.ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        exposedDropdownMenuBoxScope.ExposedDropdownMenu(z, function0, modifier, scrollState, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EoGF2gdWs4RPj7GEb5onZ9uYNPw(androidx.compose.animation.core.MutableTransitionState mutableTransitionState, androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.ScrollState scrollState, androidx.compose.material.ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1604457564, i, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:211)");
            }
            androidx.compose.material.MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState, exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier, false, 1, null), function3, composer, androidx.compose.animation.core.MutableTransitionState.$stable | 48, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wnVK1eudBO-Xb8hHu_GdJWKXJfM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2619$r8$lambda$wnVK1eudBOXb8hHu_GdJWKXJfM(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.unit.IntRect intRect2) {
        mutableState.setValue(androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(androidx.compose.material.MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return kotlin.Unit.INSTANCE;
    }
}
