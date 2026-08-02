package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldsScrollController;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "scrollKey", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldScrollRequesters;", "requesters", "", "register$bnpl_acquisition_prodRelease", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldScrollRequesters;)V", "unregister$bnpl_acquisition_prodRelease", "(Ljava/lang/String;)V", "scrollTo", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormFieldsScrollController {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    public FormFieldsScrollController(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    }

    public final void register$bnpl_acquisition_prodRelease(java.lang.String scrollKey, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters requesters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requesters, "");
        this.getHighSpeedVideoFpsRanges.put(scrollKey, requesters);
    }

    public final void unregister$bnpl_acquisition_prodRelease(java.lang.String scrollKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollKey, "");
        this.getHighSpeedVideoFpsRanges.remove(scrollKey);
    }

    public final void scrollTo(java.lang.String scrollKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollKey, "");
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters fieldScrollRequesters = this.getHighSpeedVideoFpsRanges.get(scrollKey);
        if (fieldScrollRequesters != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsScrollController$scrollTo$1$1(fieldScrollRequesters, null), 3, null);
        }
    }
}
