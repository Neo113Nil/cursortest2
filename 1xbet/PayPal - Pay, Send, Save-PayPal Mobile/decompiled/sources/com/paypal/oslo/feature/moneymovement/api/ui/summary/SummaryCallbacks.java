package com.paypal.oslo.feature.moneymovement.api.ui.summary;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R%\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R%\u0010\u0011\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryCallbacks;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "getOnLinkClicked", "()Lkotlin/jvm/functions/Function1;", "onLinkClicked", "Lkotlin/Function0;", "getOnFeeInfoIconClick", "()Lkotlin/jvm/functions/Function0;", "onFeeInfoIconClick", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;", "getOnConversionMethodLinkClick", "onConversionMethodLinkClick", "getOnDisclosureLinkClick", "onDisclosureLinkClick", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SummaryCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks.Companion.getHighSpeedVideoSizes;

    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod, kotlin.Unit> getOnConversionMethodLinkClick();

    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnDisclosureLinkClick();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnFeeInfoIconClick();

    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnLinkClicked();

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "", "", "onLinkClicked", "Lkotlin/Function0;", "onFeeInfoIconClick", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;", "onConversionMethodLinkClick", "onDisclosureLinkClick", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryCallbacks;", "invoke", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks.Companion companion, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks.Companion.$r8$lambda$5lbkiSyLrylFPbzXwcZ4dldXEU8((java.lang.String) obj2);
                    }
                };
            }
            if ((i & 2) != 0) {
                function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 4) != 0) {
                function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks.Companion.m15626$r8$lambda$EB4jz_kP_MnHNCuXa4j1J8H5qY((com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod) obj2);
                    }
                };
            }
            if ((i & 8) != 0) {
                function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks.Companion.$r8$lambda$mgmiNZScuqzOd7sQ_3eOnziY1CQ((java.lang.String) obj2);
                    }
                };
            }
            return companion.invoke(function1, function0, function12, function13);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks invoke(final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onLinkClicked, final kotlin.jvm.functions.Function0<kotlin.Unit> onFeeInfoIconClick, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod, kotlin.Unit> onConversionMethodLinkClick, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDisclosureLinkClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLinkClicked, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFeeInfoIconClick, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConversionMethodLinkClick, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDisclosureLinkClick, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks(onLinkClicked, onFeeInfoIconClick, onConversionMethodLinkClick, onDisclosureLinkClick) { // from class: com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks$Companion$invoke$5
                private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod, kotlin.Unit> onConversionMethodLinkClick;
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onDisclosureLinkClick;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onFeeInfoIconClick;
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onLinkClicked;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.onLinkClicked = onLinkClicked;
                    this.onFeeInfoIconClick = onFeeInfoIconClick;
                    this.onConversionMethodLinkClick = onConversionMethodLinkClick;
                    this.onDisclosureLinkClick = onDisclosureLinkClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnLinkClicked() {
                    return this.onLinkClicked;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFeeInfoIconClick() {
                    return this.onFeeInfoIconClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks
                public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod, kotlin.Unit> getOnConversionMethodLinkClick() {
                    return this.onConversionMethodLinkClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnDisclosureLinkClick() {
                    return this.onDisclosureLinkClick;
                }
            };
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$5lbkiSyLrylFPbzXwcZ4dldXEU8(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$EB4jz_kP_MnHNCuXa4j1J8-H5qY, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m15626$r8$lambda$EB4jz_kP_MnHNCuXa4j1J8H5qY(com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionMethod, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$mgmiNZScuqzOd7sQ_3eOnziY1CQ(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
