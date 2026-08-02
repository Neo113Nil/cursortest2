package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CancellationSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "logMessage", "Ljava/lang/String;", "getLogMessage$inappcheckout_prodRelease", "()Ljava/lang/String;", "BackPress", "ReturnButton"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CancellationSource {
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource BackPress;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource ReturnButton;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String logMessage;

    private CancellationSource(java.lang.String str, int i, java.lang.String str2) {
        this.logMessage = str2;
    }

    /* renamed from: getLogMessage$inappcheckout_prodRelease, reason: from getter */
    public final java.lang.String getLogMessage() {
        return this.logMessage;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource cancellationSource = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource("BackPress", 0, "back_press_intercepted");
        BackPress = cancellationSource;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource cancellationSource2 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource("ReturnButton", 1, "return_to_merchant_button_clicked");
        ReturnButton = cancellationSource2;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource[] cancellationSourceArr = {cancellationSource, cancellationSource2};
        getHighSpeedVideoFpsRangesFor = cancellationSourceArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cancellationSourceArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource[] values() {
        return (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
