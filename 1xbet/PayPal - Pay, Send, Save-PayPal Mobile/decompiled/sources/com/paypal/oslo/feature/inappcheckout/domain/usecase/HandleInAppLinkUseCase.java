package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatLocalizedUrlUseCase;", "formatLocalizedUrlUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "stringsProvider", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatLocalizedUrlUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "link", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatLocalizedUrlUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HandleInAppLinkUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public HandleInAppLinkUseCase(com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase formatLocalizedUrlUseCase, com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatLocalizedUrlUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutStringsProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = formatLocalizedUrlUseCase;
        this.Camera2StreamConfigurationMap = inAppCheckoutStringsProvider;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData invoke(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData(this.getHighResolutionOutputSizeshNQ4ISI.invoke(link.getUrlTemplate()), this.Camera2StreamConfigurationMap.stringValue(link.getTitleResId()), link.getSource(), false);
    }
}
