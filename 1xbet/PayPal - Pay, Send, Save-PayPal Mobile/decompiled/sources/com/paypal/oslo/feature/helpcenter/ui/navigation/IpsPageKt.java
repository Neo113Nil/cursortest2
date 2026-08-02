package com.paypal.oslo.feature.helpcenter.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/BottomSheetStackState;", "stackState", "", "IpsPage", "(Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackEntry;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/helpcenter/ui/navigation/BottomSheetStackState;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IpsPageKt {
    public static final void IpsPage(final com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetStackState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1181384042);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(stackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(bottomSheetStackState) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1181384042, i2, -1, "com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPage (IpsPage.kt:27)");
            }
            com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage page = stackEntry.getPage();
            java.lang.String simpleName = page.getClass().getSimpleName();
            int id = stackEntry.getId();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(simpleName);
            sb.append("_");
            sb.append(id);
            java.lang.String obj = sb.toString();
            if (page instanceof com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail) {
                startRestartGroup.startReplaceGroup(-1649701197);
                java.lang.String articleId = ((com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail) page).getArticleId();
                boolean z2 = (i2 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt.$r8$lambda$dr5OSTKPGSJS50Tjwt1AbihFiHw(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                boolean z3 = (i2 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt.$r8$lambda$mHOVXdW7vBAVQlSafDOFBnchM4s(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.this, (com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                z = (i2 & 14) == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt.$r8$lambda$DRQdJJpEMVult0c7ozzWFZvzZKQ(com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt.ArticleBottomSheetContent(articleId, function1, function12, (kotlin.jvm.functions.Function0) rememberedValue3, obj, null, startRestartGroup, 0, 32);
                startRestartGroup.endReplaceGroup();
            } else if (page instanceof com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList) {
                startRestartGroup.startReplaceGroup(-1649106214);
                com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList articleList = (com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList) page;
                java.lang.String productRefId = articleList.getProductRefId();
                java.lang.String pageRefId = articleList.getPageRefId();
                java.lang.String fieldRefId = articleList.getFieldRefId();
                z = (i2 & 896) == 256;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt.m14814$r8$lambda$sUZEGh7PggfcsrzKoFo0u0dHZo(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.this, (com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.helpcenter.ui.screens.IpsArticleListKt.IpsArticleListContent(productRefId, pageRefId, fieldRefId, (kotlin.jvm.functions.Function1) rememberedValue4, null, null, startRestartGroup, 0, 48);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1438690688);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt.$r8$lambda$Xy8MUCIqd5FSULursruiJfsje4s(com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry.this, appNavigator, bottomSheetStackState, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DRQdJJpEMVult0c7ozzWFZvzZKQ(com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry) {
        stackEntry.setReady(true);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xy8MUCIqd5FSULursruiJfsje4s(com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, int i, androidx.compose.runtime.Composer composer, int i2) {
        IpsPage(stackEntry, appNavigator, bottomSheetStackState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dr5OSTKPGSJS50Tjwt1AbihFiHw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt.$r8$lambda$iNWi155hlPCdADIPxiPpwmZZcZM(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iNWi155hlPCdADIPxiPpwmZZcZM(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mHOVXdW7vBAVQlSafDOFBnchM4s(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedArticleUiData, "");
        bottomSheetStackState.push(new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail(recommendedArticleUiData.getId()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sUZEGh7Pg-gfcsrzKoFo0u0dHZo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14814$r8$lambda$sUZEGh7PggfcsrzKoFo0u0dHZo(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData ipsArticleData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ipsArticleData, "");
        bottomSheetStackState.push(new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail(ipsArticleData.getArticlePreview().getId()));
        return kotlin.Unit.INSTANCE;
    }
}
