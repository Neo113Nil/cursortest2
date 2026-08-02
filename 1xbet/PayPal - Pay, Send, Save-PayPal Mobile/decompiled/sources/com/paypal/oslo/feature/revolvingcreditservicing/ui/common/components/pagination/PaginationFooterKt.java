package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aK\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0002\u0010\f\u001a3\u0010\r\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u000e\u001a\u0002H\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"PaginationFooter", "", "T", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/pagination/PaginationStateUiModel;", "uiState", "modifier", "Landroidx/compose/ui/Modifier;", "animated", "", "loadingTestTag", "", "errorTestTag", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/pagination/PaginationStateUiModel;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "PaginationContent", "state", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/pagination/PaginationStateUiModel;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaginationFooterKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel> void PaginationFooter(final T t, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        final java.lang.String str3;
        int i6;
        final java.lang.String str4;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        final java.lang.String str5;
        final java.lang.String str6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str7;
        java.lang.String str8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(331540020);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str3 = str;
                    i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str4 = str2;
                        i3 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            str5 = str3;
                            str6 = str4;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            boolean z4 = i4 != 0 ? true : z2;
                            if (i5 != 0) {
                                str3 = null;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(331540020, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooter (PaginationFooter.kt:50)");
                            }
                            if (z4) {
                                startRestartGroup.startReplaceGroup(-1515803209);
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooterKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooterKt.m18403$r8$lambda$c52bVtFOdG8dfQ49fWPf1Cqbn0((androidx.compose.animation.AnimatedContentTransitionScope) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                str7 = str4;
                                androidx.compose.animation.AnimatedContentKt.AnimatedContent(t, modifier4, (kotlin.jvm.functions.Function1) rememberedValue, null, "PaginationFeedback", null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-162318966, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooterKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function4
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooterKt.$r8$lambda$pswQG6ZlQqXKbVVZ_SbBSLmRZBo(str3, str4, i3, (androidx.compose.animation.AnimatedContentScope) obj, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, 1597824 | (i3 & 8) | (i3 & 14) | (i3 & 112), 40);
                                startRestartGroup.endReplaceGroup();
                                str8 = str3;
                            } else {
                                java.lang.String str9 = str3;
                                str7 = str4;
                                startRestartGroup.startReplaceGroup(-1515396551);
                                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                                int i8 = i3 >> 6;
                                str8 = str9;
                                getHighResolutionOutputSizeshNQ4ISI(t, str8, str7, startRestartGroup, (i8 & 112) | (i3 & 14) | (i8 & 896));
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceGroup();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            str5 = str8;
                            str6 = str7;
                            modifier3 = modifier4;
                            z3 = z4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooterKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooterKt.m18402$r8$lambda$9j8u09oes37Dk5PoQZ8Rl4GEo(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel.this, modifier3, z3, str5, str6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str4 = str2;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str3 = str;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str4 = str2;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str3 = str;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str4 = str2;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str3 = str;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str4 = str2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final <T extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel> void getHighResolutionOutputSizeshNQ4ISI(final T t, final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1602348601);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1602348601, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationContent (PaginationFooter.kt:94)");
            }
            if (t.isLoadingMore()) {
                startRestartGroup.startReplaceGroup(-1300468751);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                if (str != null) {
                    companion = androidx.compose.ui.platform.TestTagKt.testTag(companion, str);
                }
                com.paypal.pds.components.LoaderKt.Loader(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(companion, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null), com.paypal.pds.core.ConstantsKt.getSize24()), null, null, null, startRestartGroup, 0, 14);
                startRestartGroup.endReplaceGroup();
            } else if (t.isError()) {
                startRestartGroup.startReplaceGroup(-1300098580);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                if (str2 != null) {
                    companion2 = androidx.compose.ui.platform.TestTagKt.testTag(companion2, str2);
                }
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_something_went_wrong_try_again_later, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(companion2, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1299668517);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooterKt.$r8$lambda$eP22L3Wfw02fkZtHOAX25IweRic(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel.this, str, str2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$9j8u09oes37Dk5PoQZ8Rl4G--Eo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18402$r8$lambda$9j8u09oes37Dk5PoQZ8Rl4GEo(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel paginationStateUiModel, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaginationFooter(paginationStateUiModel, modifier, z, str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c52bVtFOdG8dfQ49fWPf1Cqb-n0, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.ContentTransform m18403$r8$lambda$c52bVtFOdG8dfQ49fWPf1Cqbn0(androidx.compose.animation.AnimatedContentTransitionScope animatedContentTransitionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "");
        return androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eP22L3Wfw02fkZtHOAX25IweRic(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel paginationStateUiModel, java.lang.String str, java.lang.String str2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(paginationStateUiModel, str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pswQG6ZlQqXKbVVZ_SbBSLmRZBo(java.lang.String str, java.lang.String str2, int i, androidx.compose.animation.AnimatedContentScope animatedContentScope, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel paginationStateUiModel, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paginationStateUiModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-162318966, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationFooter.<anonymous> (PaginationFooter.kt:58)");
        }
        getHighResolutionOutputSizeshNQ4ISI(paginationStateUiModel, str, str2, composer, (i & 8) | ((i2 >> 3) & 14));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
