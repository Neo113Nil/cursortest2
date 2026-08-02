package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.preview;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/preview/CloseAccountItemsPersonalUserProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseYourAccountStepContent;", "<init>", "()V", "", "index", "", "getDisplayName", "(I)Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountPersonalUserContentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountPersonalUserContentProvider;", "Camera2StreamConfigurationMap", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountItemsPersonalUserProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider Camera2StreamConfigurationMap;
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent> values;
    private static final com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.preview.CloseAccountItemsPersonalUserProvider.Companion Companion = new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.preview.CloseAccountItemsPersonalUserProvider.Companion(null);
    public static final int $stable = 8;
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"US with email", "US without email", com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider.COUNTRY_BR, "Default (rest of world)"});

    public CloseAccountItemsPersonalUserProvider() {
        com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider closeAccountPersonalUserContentProvider = new com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.preview.PreviewCloseAccountStrings.INSTANCE);
        this.Camera2StreamConfigurationMap = closeAccountPersonalUserContentProvider;
        this.values = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent[]{closeAccountPersonalUserContentProvider.getContent("user@example.com", "US"), closeAccountPersonalUserContentProvider.getContent(null, "US"), closeAccountPersonalUserContentProvider.getContent(null, com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider.COUNTRY_BR), closeAccountPersonalUserContentProvider.getContent(null, "UK")});
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent> getValues() {
        return this.values;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final java.lang.String getDisplayName(int index) {
        return getHighSpeedVideoFpsRangesFor.get(index);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/preview/CloseAccountItemsPersonalUserProvider$Companion;", "", "<init>", "()V", "", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
