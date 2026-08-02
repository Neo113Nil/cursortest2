package com.paypal.oslo.feature.settings.closeaccount.ui.provider;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountIneligibleUserContentProvider;", "", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "strings", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;)V", "", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/IneligibilityReason;", "reasons", "", "userCountry", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseYourAccountStepContent;", "getContent", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseYourAccountStepContent;", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiItem$OpenItem;", "p0", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiItem;", "getHighSpeedVideoSizes", "(Lkotlin/jvm/functions/Function0;)Ljava/util/List;", "()Ljava/util/List;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountIneligibleUserContentProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.Companion Companion = new com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter getHighSpeedVideoSizes = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter(false, false, null, null, null, 28, null);
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"US", "FR", "GB", "AU"});

    public CloseAccountIneligibleUserContentProvider(com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings closeAccountStrings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountStrings, "");
        this.getHighSpeedVideoFpsRangesFor = closeAccountStrings;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent getContent(java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> reasons, java.lang.String userCountry) {
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> highSpeedVideoSizes;
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> list = reasons;
        if (list == null || list.isEmpty()) {
            highSpeedVideoSizes = getHighSpeedVideoSizes();
        } else {
            switch (com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason) kotlin.collections.CollectionsKt.first((java.util.List) reasons)).getReasonCode().ordinal()]) {
                case 1:
                    if (kotlin.jvm.internal.Intrinsics.areEqual(userCountry, "DE")) {
                        highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.m19238$r8$lambda$kcZPsfS_XOOwfi2iqNE_9UHh9M(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                            }
                        });
                        break;
                    } else {
                        highSpeedVideoSizes = getHighSpeedVideoSizes();
                        break;
                    }
                case 2:
                    highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.$r8$lambda$ADczsMj3fdkw_TQQWirP4ANDOBk(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                        }
                    });
                    break;
                case 3:
                    if (kotlin.collections.CollectionsKt.contains(getHighSpeedVideoFpsRanges, userCountry)) {
                        highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.$r8$lambda$HdhSfCAtpBlb7jXzmDEMjS36dpk(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                            }
                        });
                        break;
                    } else {
                        highSpeedVideoSizes = getHighSpeedVideoSizes();
                        break;
                    }
                case 4:
                    highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.$r8$lambda$FMsrajUFsNsumaHV754k3cwOsOE(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                        }
                    });
                    break;
                case 5:
                    highSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleBeforeYouCloseYourAccount(), null, null, 6, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2EligibleChangeEmail(), this.getHighSpeedVideoFpsRangesFor.getLinkSettings(), null, null, null, 28, null))), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleSomeoneSentYouPayment(), null, null, null, null, 30, null)))});
                    break;
                case 6:
                    highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.m19240$r8$lambda$t3Fwy4FXDZm47ybEtpYwjIjbiw(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                        }
                    });
                    break;
                case 7:
                    highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.m19236$r8$lambda$TmqgAN6uu_AfOhjc07SizhLjTA(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                        }
                    });
                    break;
                case 8:
                    highSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleAreYouSureClose(), null, null, 6, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Label(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleOnceYouClosePaypal()), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.BulletList(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleShopPayOrReceive(), null, 2, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleTakeAdvantage(), null, 2, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleViewYourTransaction(), null, 2, null)})), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Label(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleIfYouHaveScheduledIncomplete()), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleIfYouLikeCloseAccountContact(), this.getHighSpeedVideoFpsRangesFor.getLinkContactUs(), null, null, null, 28, null)))});
                    break;
                case 9:
                    highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.$r8$lambda$4hb82SLM41ZJz3BMEUAluq5lSWI(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                        }
                    });
                    break;
                case 10:
                    if (kotlin.jvm.internal.Intrinsics.areEqual(userCountry, "US")) {
                        highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.m19237$r8$lambda$bqxDwR4DbmeDPDKVcTlNqhHXSs(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                            }
                        });
                        break;
                    } else {
                        highSpeedVideoSizes = getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.m19239$r8$lambda$sPWY9jKBGWx4n0ihYgE_oVz8Z0(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider.this);
                            }
                        });
                        break;
                    }
                case 11:
                case 12:
                    highSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleBeforeYouCloseYourAccount(), null, null, 6, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2EligibleChangeEmail(), this.getHighSpeedVideoFpsRangesFor.getLinkSettings(), null, null, null, 28, null))), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Label(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleSorryYouCannotCloseAccountRecurringSub())});
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    highSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleBeforeYouCloseYourAccount(), null, null, 6, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2EligibleChangeEmail(), this.getHighSpeedVideoFpsRangesFor.getLinkSettings(), null, null, null, 28, null))), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getSomethingThatNeedsToBeResolved(), this.getHighSpeedVideoFpsRangesFor.getLinkCustomerService(), null, null, null, 28, null)))});
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    highSpeedVideoSizes = getHighSpeedVideoSizes();
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent(highSpeedVideoSizes, getHighSpeedVideoSizes);
    }

    private final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> getHighSpeedVideoSizes(kotlin.jvm.functions.Function0<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem> p0) {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleTitle(), this.getHighSpeedVideoFpsRangesFor.getL2IneligibleDescription(), null, 4, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), p0.invoke(), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(8), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleIfYouNeedHelp(), this.getHighSpeedVideoFpsRangesFor.getLinkLetUsKnow(), null, null, null, 28, null)))});
    }

    private final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> getHighSpeedVideoSizes() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleWeWereUnableToClose(), null, null, 6, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleGenericErrorDesc(), null, null, null, null, 30, null))), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.BulletList(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem(this.getHighSpeedVideoFpsRangesFor.getL2IneligiblePendingTransactionSubscription(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{this.getHighSpeedVideoFpsRangesFor.getLinkTransactions(), this.getHighSpeedVideoFpsRangesFor.getLinkSubscriptions()})), new com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleUnresolvedActions(), kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRangesFor.getLinkResolutionCenter()))})), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleIfYouLikeCloseAccountContact(), this.getHighSpeedVideoFpsRangesFor.getLinkCloseYourAccount(), null, null, null, 28, null))), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleIfYouNeedHelp(), this.getHighSpeedVideoFpsRangesFor.getLinkContactUs(), null, null, null, 28, null)))});
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountIneligibleUserContentProvider$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "getHighSpeedVideoFpsRanges", "", "", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem $r8$lambda$4hb82SLM41ZJz3BMEUAluq5lSWI(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleResolveAccountLimitation(), null, com.paypal.pds.core.Icon.WarningCircle.INSTANCE, false, null, 48, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem $r8$lambda$ADczsMj3fdkw_TQQWirP4ANDOBk(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleResolveAccountLimitation(), null, com.paypal.pds.core.Icon.WarningCircle.INSTANCE, false, null, 48, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem $r8$lambda$FMsrajUFsNsumaHV754k3cwOsOE(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleWaitPendingTransactions(), null, com.paypal.pds.core.Icon.Hourglass.INSTANCE, false, null, 48, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem $r8$lambda$HdhSfCAtpBlb7jXzmDEMjS36dpk(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligiblePayOutstandingBalances(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligiblePayOffAnyOpenPaymentPlans(), com.paypal.pds.core.Icon.Hand.INSTANCE, false, null, 48, null);
    }

    /* renamed from: $r8$lambda$TmqgA-N6uu_AfOhjc07SizhLjTA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem m19236$r8$lambda$TmqgAN6uu_AfOhjc07SizhLjTA(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleTransferRemainingBalance(), null, com.paypal.pds.core.Icon.User.INSTANCE, false, null, 48, null);
    }

    /* renamed from: $r8$lambda$bqxDwR4DbmeDPDKVcTlN-qhHXSs, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem m19237$r8$lambda$bqxDwR4DbmeDPDKVcTlNqhHXSs(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligiblePayOutstandingBalances(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligiblePayOffAnyOpenPaymentPlans(), com.paypal.pds.core.Icon.Hand.INSTANCE, false, null, 48, null);
    }

    /* renamed from: $r8$lambda$kcZPsfS_XOOwfi2iqNE_9UHh-9M, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem m19238$r8$lambda$kcZPsfS_XOOwfi2iqNE_9UHh9M(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getRedeemYourPayPalRewardsPoints(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getRedeemYourPayPalRewardsPointsDescription(), com.paypal.pds.core.Icon.Trophy.INSTANCE, false, null, 48, null);
    }

    /* renamed from: $r8$lambda$sPWY9jKBGWx4n0ihYgE_o-Vz8Z0, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem m19239$r8$lambda$sPWY9jKBGWx4n0ihYgE_oVz8Z0(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligiblePayOutstandingAmount(), null, com.paypal.pds.core.Icon.Hand.INSTANCE, false, null, 48, null);
    }

    /* renamed from: $r8$lambda$t3Fwy4FXDZm47ybEtpYwjIjbi-w, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem m19240$r8$lambda$t3Fwy4FXDZm47ybEtpYwjIjbiw(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.OpenItem(closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleThingsToDo(), closeAccountIneligibleUserContentProvider.getHighSpeedVideoFpsRangesFor.getL2IneligibleCloseAnyOpenPools(), null, com.paypal.pds.core.Icon.User.INSTANCE, false, null, 48, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.HONEY_GOLD_REDEEMABLE_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.ACCOUNT_RESTRICTIONS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.PENDING_SETTLEMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.PENDING_TRANSACTIONS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.UNCONFIRMED_EMAIL_WITH_PAYMENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.HAS_OPEN_GROUP_MONEY_POOL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.HAS_GROUP_MONEY_POOL_WITH_BALANCE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.HAS_APPROVED_BANKING_PRODUCT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.OPEN_DISPUTES.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.NEGATIVE_BALANCE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.ACTIVE_RECURRING_CONSUMER_PROFILES.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.ACTIVE_RECURRING_MERCHANT_PROFILES.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.ACCOUNT_HAS_INVALID_DATA.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.RISK_RESTRICTED_CLOSE_ACCOUNT.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.BALANCE_LESS_THAN_WITHDRAWAL_FEE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.HAS_CRYPTO_CURRENCY_HOLDING.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.WITHDRAWAL_LIMITS.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.FDIC_FREEZE.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.RISK_DECLINE.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.HAS_ACTIVE_SAVINGS_ACCOUNT.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.WITHDRAW_NOT_PERMITTED.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.UNKNOWN.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.DOWNSTREAM_FAILURE.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.CC_NOT_VERIFIED.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.NONZERO_COLLATERAL.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
