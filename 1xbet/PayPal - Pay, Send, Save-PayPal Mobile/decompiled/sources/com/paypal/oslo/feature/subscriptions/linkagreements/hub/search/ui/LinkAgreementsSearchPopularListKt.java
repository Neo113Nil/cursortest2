package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"LinkAgreementsSearchPopularList", "", "popularAgreements", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "popularLabel", "", "onLinkClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LinkAgreementsSearchPopularListPreview", "(Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsSearchPopularListKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkAgreementsSearchPopularList(final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(631909936);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(631909936, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularList (LinkAgreementsSearchPopularList.kt:34)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                boolean z = (i3 & 112) == 32;
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean z2 = (i3 & 896) == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt.$r8$lambda$z7d2rEZJVLJhVgjuaArDadWfa40(list, str, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxWidth$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 510);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt.$r8$lambda$6oCxHRJLxKBIOXsS8oTx4RxuPjw(list, str, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-T8XGl5QKF1UDNXRX22JPchCPCc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19904$r8$lambda$T8XGl5QKF1UDNXRX22JPchCPCc(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3RMSt2u3FA-_QqF5lPC8naXFlvI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19905$r8$lambda$3RMSt2u3FA_QqF5lPC8naXFlvI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1914770803);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1914770803, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListPreview (LinkAgreementsSearchPopularList.kt:60)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant[]{new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("1", "Merchant One", "https://example.com/logo1.png", "test.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Merchant Two", "https://example.com/logo2.png", "test2.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Merchant Three", "https://example.com/logo3.png", "test3.com")});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt.m19904$r8$lambda$T8XGl5QKF1UDNXRX22JPchCPCc((com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LinkAgreementsSearchPopularList(listOf, "Popular Agreements", (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt.m19905$r8$lambda$3RMSt2u3FA_QqF5lPC8naXFlvI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6oCxHRJLxKBIOXsS8oTx4RxuPjw(java.util.List list, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkAgreementsSearchPopularList(list, str, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BNzM8J1bt7VXq60m61XElGYxA7c(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = (composer.changed(i) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(384021970, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularList.<anonymous>.<anonymous>.<anonymous> (LinkAgreementsSearchPopularList.kt:46)");
            }
            final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) list.get(i);
            boolean z = i < list.size() - 1;
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(consumerAgreementMerchant);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt.$r8$lambda$af6cqd9HPTDHmTfbsogjzvcfCYg(kotlin.jvm.functions.Function1.this, consumerAgreementMerchant);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkMerchantItemKt.LinkMerchantItem(consumerAgreementMerchant, z, (kotlin.jvm.functions.Function0) rememberedValue, i, null, composer, (i3 << 6) & 7168, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$af6cqd9HPTDHmTfbsogjzvcfCYg(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        function1.invoke(consumerAgreementMerchant);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iWp024hoyedQEkyRiafifuHW2Rk(java.lang.String str, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1280393979, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularList.<anonymous>.<anonymous>.<anonymous> (LinkAgreementsSearchPopularList.kt:39)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing20(), 5, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer, 0, 6, 1020);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z7d2rEZJVLJhVgjuaArDadWfa40(final java.util.List list, final java.lang.String str, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1280393979, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt.$r8$lambda$iWp024hoyedQEkyRiafifuHW2Rk(str, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, list.size(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(384021970, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt.$r8$lambda$BNzM8J1bt7VXq60m61XElGYxA7c(list, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 6, null);
        return kotlin.Unit.INSTANCE;
    }
}
