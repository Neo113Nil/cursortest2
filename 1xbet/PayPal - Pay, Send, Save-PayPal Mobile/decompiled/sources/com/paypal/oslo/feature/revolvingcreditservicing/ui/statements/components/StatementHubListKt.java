package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"StatementHubList", "", "items", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel;", "onItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatementHubListPreview", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementHubListKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StatementHubList(final java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1054625184);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1054625184, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubList (StatementHubList.kt:32)");
                }
                androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt.$r8$lambda$BdkSre3J6ibB3WviEhW6yXBU0z4(list, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(modifier3, null, m1703PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (i3 >> 6) & 14, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt.$r8$lambda$R6aUNakIJAIL42LPGF5_VdgU7V4(list, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$51TF5KRPeWZIerIb4BbX5Yrw_WQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel statementHubItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubItemUiModel, "");
        return statementHubItemUiModel.getId();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BdkSre3J6ibB3WviEhW6yXBU0z4(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt.$r8$lambda$51TF5KRPeWZIerIb4BbX5Yrw_WQ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel) obj);
            }
        };
        final kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt.$r8$lambda$EQlznEJJD7q7dThWLASS2jSyTr0((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel) obj);
            }
        };
        lazyListScope.items(list.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$StatementHubList$lambda$0$0$$inlined$items$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$StatementHubList$lambda$0$0$$inlined$items$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$StatementHubList$lambda$0$0$$inlined$items$3
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel statementHubItemUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel) list.get(i);
                composer.startReplaceGroup(84976405);
                if (statementHubItemUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header) {
                    composer.startReplaceGroup(-274351610);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListItemKt.StatementHubHeaderItem(((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header) statementHubItemUiModel).getTitle(), null, composer, 0, 2);
                    composer.endReplaceGroup();
                } else {
                    if (!(statementHubItemUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content)) {
                        composer.startReplaceGroup(-274353490);
                        composer.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-274347211);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content content = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content) statementHubItemUiModel;
                    boolean changed = composer.changed(function1);
                    boolean changed2 = composer.changed(statementHubItemUiModel);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final kotlin.jvm.functions.Function1 function14 = function1;
                        rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$StatementHubList$1$1$3$1$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                function14.invoke(statementHubItemUiModel);
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListItemKt.StatementHubContentItem(content, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 4);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$EQlznEJJD7q7dThWLASS2jSyTr0(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel statementHubItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubItemUiModel, "");
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(statementHubItemUiModel.getClass());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J8I8pf4uNbVBMsSsCpba1qcvdUs(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R6aUNakIJAIL42LPGF5_VdgU7V4(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StatementHubList(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gvMPWWih1e-O1Jcyh1CQfNVqEOk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18646$r8$lambda$gvMPWWih1eO1Jcyh1CQfNVqEOk(final java.util.List list, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-588345522);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-588345522, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListPreview (StatementHubList.kt:98)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt.$r8$lambda$J8I8pf4uNbVBMsSsCpba1qcvdUs((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            StatementHubList(list, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, (i3 & 14) | 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components.StatementHubListKt.m18646$r8$lambda$gvMPWWih1eO1Jcyh1CQfNVqEOk(list, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
