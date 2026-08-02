package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a_\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0016\u0010\u0011\u001a\u00020\t*\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"AvatarButton", "", "onClick", "Lkotlin/Function0;", "text", "", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/ButtonSize;", "enabled", "", "isLoading", "contentDescription", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/ButtonSize;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "avatarButtonSemantics", "AvatarButtonSizePreview", "(Lcom/paypal/pds/components/ButtonSize;Landroidx/compose/runtime/Composer;I)V", "AvatarButtonLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "AvatarButtonDisabledPreview", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AvatarButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AvatarButton(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, final androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonSize buttonSize, boolean z, boolean z2, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.pds.components.ButtonSize buttonSize2;
        final boolean z4;
        final java.lang.String str3;
        final boolean z5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(123622032);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(buttonSize) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        z3 = z2;
                        i3 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(str2) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            buttonSize2 = buttonSize;
                            z4 = z;
                            str3 = str2;
                            z5 = z3;
                        } else {
                            androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            final com.paypal.pds.components.ButtonSize buttonSize3 = i4 != 0 ? com.paypal.pds.components.ButtonSize.Medium.INSTANCE : buttonSize;
                            boolean z6 = i5 != 0 ? true : z;
                            boolean z7 = i6 == 0 ? z3 : false;
                            final java.lang.String str4 = i7 != 0 ? null : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(123622032, i3, -1, "com.paypal.pds.components.AvatarButton (AvatarButton.kt:68)");
                            }
                            int i9 = i3 >> 3;
                            com.paypal.pds.components.ButtonSize buttonSize4 = buttonSize3;
                            androidx.compose.ui.Modifier modifier4 = modifier3;
                            java.lang.String str5 = str4;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.semantics.SemanticsModifierKt.semantics(modifier3, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.AvatarButtonKt.$r8$lambda$5tokUV04K82aPV01kBx_c7SjueE(str4, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            }), com.paypal.pds.components.AvatarButtonStyle.INSTANCE, buttonSize3, z6, z7, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-247386870, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.AvatarButtonKt.$r8$lambda$x40m01FQOKUnwuwqw0GKVlSGwfI(com.paypal.pds.components.ButtonSize.this, painter, str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 12583296 | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 64);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z5 = z7;
                            z4 = z6;
                            buttonSize2 = buttonSize4;
                            modifier2 = modifier4;
                            str3 = str5;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.AvatarButtonKt.m21570$r8$lambda$7IKVzzjGxW9FnFAgrbsRfNmNp8(kotlin.jvm.functions.Function0.this, str, painter, modifier2, buttonSize2, z4, z5, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z3 = z2;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z3 = z2;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z3 = z2;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z3 = z2;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4HBhsE0DiKR6Bx58CT_ae9UiDws(final com.paypal.pds.components.ButtonSize buttonSize, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-511657177);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(buttonSize) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-511657177, i3, -1, "com.paypal.pds.components.AvatarButtonSizePreview (AvatarButton.kt:141)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AvatarButton((kotlin.jvm.functions.Function0) rememberedValue, "Label", androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().image128x128(), startRestartGroup, 0), null, buttonSize, false, false, null, startRestartGroup, (androidx.compose.ui.graphics.painter.Painter.$stable << 6) | 54 | ((i3 << 12) & 57344), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.AvatarButtonKt.$r8$lambda$4HBhsE0DiKR6Bx58CT_ae9UiDws(com.paypal.pds.components.ButtonSize.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5tokUV04K82aPV01kBx_c7SjueE(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7801getDropdownListo7Vup1c());
        if (str != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7IKVzzjGxW9FnFAgrbsR-fNmNp8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21570$r8$lambda$7IKVzzjGxW9FnFAgrbsRfNmNp8(kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonSize buttonSize, boolean z, boolean z2, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AvatarButton(function0, str, painter, modifier, buttonSize, z, z2, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9AZrwrPDsu0VOhypyAIY6blMjY8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(967909423);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(967909423, updateChangedFlags, -1, "com.paypal.pds.components.AvatarButtonDisabledPreview (AvatarButton.kt:165)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AvatarButton((kotlin.jvm.functions.Function0) rememberedValue, "Disabled State", androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().image128x128(), startRestartGroup, 0), null, null, false, false, null, startRestartGroup, (androidx.compose.ui.graphics.painter.Painter.$stable << 6) | 196662, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.AvatarButtonKt.$r8$lambda$9AZrwrPDsu0VOhypyAIY6blMjY8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WXo2-pmfx-hJtCxaOOHLrpn-Nqw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21573$r8$lambda$WXo2pmfxhJtCxaOOHLrpnNqw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(670934621);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(670934621, updateChangedFlags, -1, "com.paypal.pds.components.AvatarButtonLoadingPreview (AvatarButton.kt:153)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AvatarButton((kotlin.jvm.functions.Function0) rememberedValue, "Loading State", androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().image128x128(), startRestartGroup, 0), null, null, false, true, null, startRestartGroup, (androidx.compose.ui.graphics.painter.Painter.$stable << 6) | 1572918, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarButtonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.AvatarButtonKt.m21573$r8$lambda$WXo2pmfxhJtCxaOOHLrpnNqw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x40m01FQOKUnwuwqw0GKVlSGwfI(com.paypal.pds.components.ButtonSize buttonSize, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-247386870, i, -1, "com.paypal.pds.components.AvatarButton.<anonymous> (AvatarButton.kt:77)");
            }
            androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, buttonSize.getAvatarStartPadding(), buttonSize.getContentPadding().getTop(), androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(buttonSize.getContentPadding(), (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection())), buttonSize.getContentPadding().getBottom());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1709paddingqDBjuR0);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.ImageKt.Image(painter, "", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, buttonSize.getAvatarSize()), "AvatarButtonImage"), androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), com.paypal.pds.components.ImageCornerRadius.RadiusFull, null, null, composer, androidx.compose.ui.graphics.painter.Painter.$stable | 27696, 96);
            com.paypal.pds.core.Color.ContentRoleBaseNeutral contentRoleBaseNeutral = com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE;
            int m8504getVisiblegIe3tQ8 = androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8();
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, rowScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false), contentRoleBaseNeutral, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(m8504getVisiblegIe3tQ8), false, 0, 0, null, buttonSize.getTypography(), composer, 196992, 0, 968);
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronDown.INSTANCE, null, androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, buttonSize.getIconSize().getValue()), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 24630, 8);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
