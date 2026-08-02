package com.paypal.android.taptopay.domain.di;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000b\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getSelectedVendor", "()Ljava/lang/String;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)V", "usePayairImplementation", "()V", "useThalesImplementation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "Landroid/content/SharedPreferences;", "Lkotlin/Lazy;", "Lkotlinx/coroutines/flow/StateFlow;", "vendorFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getVendorFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImplementationSelector {
    public static final java.lang.String DEFAULT_VENDOR = "thales";
    public static final java.lang.String KEY_SELECTED_VENDOR = "selected_vendor";
    public static final java.lang.String PREFS_NAME = "tap_to_pay_prefs";
    public static final java.lang.String VENDOR_PAYAIR = "payair";
    public static final java.lang.String VENDOR_THALES = "thales";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> vendorFlow;

    @javax.inject.Inject
    public ImplementationSelector(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.content.SharedPreferences>() { // from class: com.paypal.android.taptopay.domain.di.ImplementationSelector$prefs$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final android.content.SharedPreferences invoke() {
                android.content.Context context2;
                context2 = com.paypal.android.taptopay.domain.di.ImplementationSelector.this.getHighSpeedVideoFpsRanges;
                return context2.getSharedPreferences(com.paypal.android.taptopay.domain.di.ImplementationSelector.PREFS_NAME, 0);
            }

            {
                super(0);
            }
        });
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(getSelectedVendor());
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.vendorFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getVendorFlow() {
        return this.vendorFlow;
    }

    public final void useThalesImplementation() {
        getHighSpeedVideoFpsRangesFor("thales");
    }

    public final void usePayairImplementation() {
        getHighSpeedVideoFpsRangesFor("payair");
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.Object value = this.getHighSpeedVideoFpsRangesFor.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        android.content.SharedPreferences.Editor edit = ((android.content.SharedPreferences) value).edit();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(edit, "");
        edit.putString(KEY_SELECTED_VENDOR, p0);
        edit.apply();
        this.Camera2StreamConfigurationMap.setValue(p0);
    }

    public final java.lang.String getSelectedVendor() {
        java.lang.Object value = this.getHighSpeedVideoFpsRangesFor.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        java.lang.String string = ((android.content.SharedPreferences) value).getString(KEY_SELECTED_VENDOR, "thales");
        if (string == null) {
            string = "thales";
        }
        return (kotlin.jvm.internal.Intrinsics.areEqual(string, "thales") || kotlin.jvm.internal.Intrinsics.areEqual(string, "payair")) ? string : "thales";
    }
}
