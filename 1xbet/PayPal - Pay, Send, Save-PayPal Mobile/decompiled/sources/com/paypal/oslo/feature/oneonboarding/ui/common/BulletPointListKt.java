package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001aS\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"BulletPointList", "", "bulletTexts", "", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BulletPoint", "text", "bulletSize", "Landroidx/compose/ui/unit/Dp;", "bulletColor", "Lcom/paypal/pds/core/Color;", "bulletOffset", "textTypography", "Lcom/paypal/pds/core/Typography;", "textColor", "BulletPoint-_X57SAw", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;FLcom/paypal/pds/core/Color;FLcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BulletPointListKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BulletPointList(final java.util.List<java.lang.String> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1758420266);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1758420266, i4, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.BulletPointList (BulletPointList.kt:43)");
                }
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    m17136BulletPoint_X57SAw((java.lang.String) it.next(), modifier3, 0.0f, null, 0.0f, null, null, startRestartGroup, i4 & 112, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.BulletPointListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.ui.common.BulletPointListKt.m17133$r8$lambda$0lYL3srwbDR9G4kWVVbRX3hK8(list, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d4  */
    /* renamed from: BulletPoint-_X57SAw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17136BulletPoint_X57SAw(final java.lang.String str, androidx.compose.ui.Modifier modifier, float f, com.paypal.pds.core.Color color, float f2, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        com.paypal.pds.core.Color color3;
        float f4;
        int i5;
        com.paypal.pds.core.Typography typography2;
        int i6;
        com.paypal.pds.core.Color color4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final float f5;
        final com.paypal.pds.core.Color color5;
        final float f6;
        final com.paypal.pds.core.Typography typography3;
        final com.paypal.pds.core.Color color6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float f7;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.pds.core.Color color7;
        com.paypal.pds.core.Typography typography4;
        com.paypal.pds.core.Color color8;
        float f8;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2015929042);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    f3 = f;
                    if (startRestartGroup.changed(f3)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    f3 = f;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                f3 = f;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                color3 = color;
                i3 |= startRestartGroup.changed(color3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        f4 = f2;
                        if (startRestartGroup.changed(f4)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        f4 = f2;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    f4 = f2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    typography2 = typography;
                    i3 |= startRestartGroup.changed(typography2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        color4 = color2;
                        i3 |= startRestartGroup.changed(color4) ? 1048576 : 524288;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                modifier3 = modifier;
                                color7 = color3;
                                typography4 = typography2;
                                color8 = color4;
                                f8 = f3;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    f7 = com.paypal.pds.core.ConstantsKt.getSpacing4();
                                    i3 &= -897;
                                } else {
                                    f7 = f3;
                                }
                                if (i4 != 0) {
                                    color3 = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    f4 = com.paypal.pds.core.ConstantsKt.getSpacing8();
                                }
                                if (i5 != 0) {
                                    typography2 = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                                }
                                if (i6 != 0) {
                                    modifier3 = companion;
                                    f8 = f7;
                                    color8 = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                                    color7 = color3;
                                    typography4 = typography2;
                                } else {
                                    modifier3 = companion;
                                    color7 = color3;
                                    typography4 = typography2;
                                    color8 = color4;
                                    f8 = f7;
                                }
                            }
                            float f9 = f4;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(2015929042, i3, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.BulletPoint (BulletPointList.kt:70)");
                            }
                            final long value = color7.getValue(startRestartGroup, (i3 >> 9) & 14);
                            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                            androidx.compose.ui.Modifier m1679offsetVpY3zN4$default = androidx.compose.foundation.layout.OffsetKt.m1679offsetVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, f8), 0.0f, f9, 1, null);
                            boolean changed = startRestartGroup.changed(value);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.BulletPointListKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.oneonboarding.ui.common.BulletPointListKt.m17135$r8$lambda$xf1Y6wNB45E4sol554lxo7zkMY(value, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.foundation.CanvasKt.Canvas(m1679offsetVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                            com.paypal.pds.core.Color color9 = color7;
                            float f10 = f8;
                            androidx.compose.ui.Modifier modifier4 = modifier3;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), color8, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, typography4, startRestartGroup, (i3 & 14) | ((i3 >> 12) & 896), (i3 >> 15) & 14, 1000);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            color5 = color9;
                            typography3 = typography4;
                            color6 = color8;
                            f6 = f9;
                            f5 = f10;
                            modifier2 = modifier4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            f5 = f3;
                            color5 = color3;
                            f6 = f4;
                            typography3 = typography2;
                            color6 = color4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.BulletPointListKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.oneonboarding.ui.common.BulletPointListKt.m17134$r8$lambda$ZriTWZBXKQiZzagr55_lFMpnxY(str, modifier2, f5, color5, f6, typography3, color6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    color4 = color2;
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                typography2 = typography;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                color4 = color2;
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            color3 = color;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            typography2 = typography;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            color4 = color2;
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        color3 = color;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        typography2 = typography;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        color4 = color2;
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$0lYL3srwbDR9G4kW-VVbRX-3hK8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17133$r8$lambda$0lYL3srwbDR9G4kWVVbRX3hK8(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BulletPointList(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZriTWZBXKQiZzagr55_l-FMpnxY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17134$r8$lambda$ZriTWZBXKQiZzagr55_lFMpnxY(java.lang.String str, androidx.compose.ui.Modifier modifier, float f, com.paypal.pds.core.Color color, float f2, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m17136BulletPoint_X57SAw(str, modifier, f, color, f2, typography, color2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xf1Y6wNB45E4-sol554lxo7zkMY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17135$r8$lambda$xf1Y6wNB45E4sol554lxo7zkMY(long j, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6513drawCircleVaOC9Bg$default(drawScope, j, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        return kotlin.Unit.INSTANCE;
    }
}
