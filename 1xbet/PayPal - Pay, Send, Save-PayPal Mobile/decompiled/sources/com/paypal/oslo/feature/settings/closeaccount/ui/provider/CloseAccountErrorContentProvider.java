package com.paypal.oslo.feature.settings.closeaccount.ui.provider;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountErrorContentProvider;", "", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "strings", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;)V", "", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiItem;", "getContent", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "getFooter", "()Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountErrorContentProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings getHighSpeedVideoFpsRangesFor;

    public CloseAccountErrorContentProvider(com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings closeAccountStrings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountStrings, "");
        this.getHighSpeedVideoFpsRangesFor = closeAccountStrings;
    }

    public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> getContent() {
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighSpeedVideoFpsRangesFor.getL2IneligibleSorry(), this.getHighSpeedVideoFpsRangesFor.getL2IneligibleTryAgainLater(), null, 4, null));
    }

    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter getFooter() {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter(false, false, null, null, null, 28, null);
    }
}
