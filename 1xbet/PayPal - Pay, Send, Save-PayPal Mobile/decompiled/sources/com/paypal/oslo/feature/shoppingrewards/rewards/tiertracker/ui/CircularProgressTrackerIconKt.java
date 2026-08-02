package com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u0011"}, d2 = {"CircularProgressTrackerIcon", "", "accentColor", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "progress", "", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/Dp;", "CircularProgressTrackerIcon-CqoSGlc", "(JLandroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V", "CircularProgressTrackerIcon0Preview", "(Landroidx/compose/runtime/Composer;I)V", "CircularProgressTrackerIcon50Preview", "CircularProgressTrackerIcon100Preview", "CircularProgressTrackerIconSizesPreview", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CircularProgressTrackerIconKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0040  */
    /* renamed from: CircularProgressTrackerIcon-CqoSGlc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19583CircularProgressTrackerIconCqoSGlc(final long j, androidx.compose.ui.Modifier modifier, int i, float f, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        int i7;
        float f2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(754746676);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : 128;
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    f2 = f;
                    i4 |= startRestartGroup.changed(f2) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                    } else {
                        if (i8 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            i6 = 10;
                        }
                        if (i7 != 0) {
                            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(50.0f);
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(754746676, i4, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIcon (CircularProgressTrackerIcon.kt:45)");
                        }
                        if (i6 < 0 || i6 >= 101) {
                            throw new java.lang.IllegalArgumentException("progress must be between 0 and 100".toString());
                        }
                        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                        final float calculateIconNormalizedProgress = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateIconNormalizedProgress(i6, 0.04f);
                        androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(modifier2, f2);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1740size3ABfNKs);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        boolean changed = startRestartGroup.changed(density);
                        boolean changed2 = startRestartGroup.changed(calculateIconNormalizedProgress);
                        boolean z = (i4 & 14) == 4;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changed | changed2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt.m19581$r8$lambda$FyOjWwFr_j0hEA9JCkf3FSpZd4(androidx.compose.ui.unit.Density.this, calculateIconNormalizedProgress, j, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 6);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    final int i9 = i6;
                    final float f3 = f2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt.m19579$r8$lambda$1ewLVpR_llLXVuNZ82JRlb3Mmo(j, modifier3, i9, f3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                f2 = f;
                if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                }
                final int i92 = i6;
                final float f32 = f2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i;
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            f2 = f;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
            }
            final int i922 = i6;
            final float f322 = f2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        f2 = f;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        final int i9222 = i6;
        final float f3222 = f2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$1ewLVpR_llLXVuNZ82JRlb3-Mmo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19579$r8$lambda$1ewLVpR_llLXVuNZ82JRlb3Mmo(long j, androidx.compose.ui.Modifier modifier, int i, float f, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m19583CircularProgressTrackerIconCqoSGlc(j, modifier, i, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2D4IW04b-nmb0qag1RoklWwJsO4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19580$r8$lambda$2D4IW04bnmb0qag1RoklWwJsO4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1278994274);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1278994274, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIcon50Preview (CircularProgressTrackerIcon.kt:85)");
            }
            m19583CircularProgressTrackerIconCqoSGlc(androidx.compose.ui.graphics.ColorKt.Color(4278218938L), null, 50, 0.0f, startRestartGroup, 390, 10);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt.m19580$r8$lambda$2D4IW04bnmb0qag1RoklWwJsO4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FyO-jWwFr_j0hEA9JCkf3FSpZd4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19581$r8$lambda$FyOjWwFr_j0hEA9JCkf3FSpZd4(androidx.compose.ui.unit.Density density, float f, long j, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconDrawingKt.m19574drawCircularProgressTrackerIconContentg2O1Hgs(drawScope, density, f, j);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HhaeGUlOCBK05GWNhGCxizYSkIY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1043226325);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1043226325, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconSizesPreview (CircularProgressTrackerIcon.kt:105)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f));
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            m19583CircularProgressTrackerIconCqoSGlc(androidx.compose.ui.graphics.ColorKt.Color(4278218938L), null, 60, androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), startRestartGroup, 3462, 2);
            m19583CircularProgressTrackerIconCqoSGlc(androidx.compose.ui.graphics.ColorKt.Color(4278218938L), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), 60, androidx.compose.ui.unit.Dp.m8601constructorimpl(50.0f), startRestartGroup, 3510, 0);
            m19583CircularProgressTrackerIconCqoSGlc(androidx.compose.ui.graphics.ColorKt.Color(4278218938L), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), 60, androidx.compose.ui.unit.Dp.m8601constructorimpl(80.0f), startRestartGroup, 3510, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt.$r8$lambda$HhaeGUlOCBK05GWNhGCxizYSkIY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YrtIwSUJP2EaFISKWDh8W090qqA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-363746711);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-363746711, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIcon0Preview (CircularProgressTrackerIcon.kt:75)");
            }
            m19583CircularProgressTrackerIconCqoSGlc(androidx.compose.ui.graphics.ColorKt.Color(4278218938L), null, 0, 0.0f, startRestartGroup, 390, 10);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt.$r8$lambda$YrtIwSUJP2EaFISKWDh8W090qqA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z6XoZPoPO-kA61n6FW-B7y1cGxo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19582$r8$lambda$z6XoZPoPOkA61n6FWB7y1cGxo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1392440170);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1392440170, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIcon100Preview (CircularProgressTrackerIcon.kt:95)");
            }
            m19583CircularProgressTrackerIconCqoSGlc(androidx.compose.ui.graphics.ColorKt.Color(4278218938L), null, 100, 0.0f, startRestartGroup, 390, 10);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconKt.m19582$r8$lambda$z6XoZPoPOkA61n6FWB7y1cGxo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
