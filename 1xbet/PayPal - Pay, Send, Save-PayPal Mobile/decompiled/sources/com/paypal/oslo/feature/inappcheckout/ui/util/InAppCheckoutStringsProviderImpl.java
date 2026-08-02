package com.paypal.oslo.feature.inappcheckout.ui.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/util/InAppCheckoutStringsProviderImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "<init>", "(Landroid/content/res/Resources;)V", "", "", "stringValue", "(I)Ljava/lang/String;", "", "", "args", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroid/content/res/Resources;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutStringsProviderImpl implements com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.res.Resources getHighResolutionOutputSizeshNQ4ISI;

    public InAppCheckoutStringsProviderImpl(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        this.getHighResolutionOutputSizeshNQ4ISI = resources;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider
    public final java.lang.String stringValue(int i) {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider
    public final java.lang.String stringValue(int i, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(i, java.util.Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
