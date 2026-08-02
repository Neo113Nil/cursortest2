package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0010\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0010\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnBackPress", "OnMakePhoneCall", "OnLoadingStarted", "OnLoadingFinished", "OnLoadFailed", "OnDownloadRequested", "OnDownloadFailed", "OnDownloadCompleted", "OnDownloadCancelled", "OnPrintRequested", "OnFileChooserRequested", "OnFileSelectionCompleted", "OnWebViewEvent", "OnParserError", "OnNavigateBack", "OnNavigateForward", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnBackPress;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadCancelled;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadRequested;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnFileChooserRequested;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnFileSelectionCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadingFinished;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadingStarted;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnMakePhoneCall;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnNavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnNavigateForward;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnParserError;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnPrintRequested;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnWebViewEvent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AcquisitionWebViewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnBackPress;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackPress extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnBackPress INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnBackPress();

        public final int hashCode() {
            return 2132068473;
        }

        private OnBackPress() {
            super("OnBackPress", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String toString() {
            return "OnBackPress";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnBackPress)) {
                return false;
            }
            return true;
        }
    }

    private AcquisitionWebViewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnMakePhoneCall;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnMakePhoneCall;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMakePhoneCall extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMakePhoneCall(java.lang.String str) {
            super("OnMakePhoneCall", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneNumber", this.phoneNumber));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMakePhoneCall(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnMakePhoneCall) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnMakePhoneCall) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnMakePhoneCall copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnMakePhoneCall(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnMakePhoneCall copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnMakePhoneCall onMakePhoneCall, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMakePhoneCall.phoneNumber;
            }
            return onMakePhoneCall.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadingStarted;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadingStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadingStarted extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadingStarted(java.lang.String str) {
            super("OnLoadingStarted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", this.url));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadingStarted(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingStarted) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingStarted copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingStarted(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingStarted copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingStarted onLoadingStarted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoadingStarted.url;
            }
            return onLoadingStarted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadingFinished;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadingFinished;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadingFinished extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadingFinished(java.lang.String str) {
            super("OnLoadingFinished", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", this.url));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadingFinished(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingFinished) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingFinished) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingFinished copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingFinished(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingFinished copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingFinished onLoadingFinished, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoadingFinished.url;
            }
            return onLoadingFinished.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "error", "<init>", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;)V", "component1", "()Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "copy", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "getError", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadFailed extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.$stable;
        private final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError) {
            super("OnLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewError, "");
            this.error = secureWebViewError;
        }

        public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError getError() {
            return this.error;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", this.error.toString()));
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadFailed(error=");
            sb.append(secureWebViewError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadFailed) other).error);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadFailed copy(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadFailed copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadFailed onLoadFailed, com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                secureWebViewError = onLoadFailed.error;
            }
            return onLoadFailed.copy(secureWebViewError);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\tR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadRequested;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "url", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getMimeType", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadRequested extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        private final java.lang.String mimeType;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDownloadRequested(java.lang.String str, java.lang.String str2) {
            super("OnDownloadRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.mimeType = str2;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("url", this.url);
            java.lang.String str = this.mimeType;
            if (str == null) {
                str = "";
            }
            pairArr[1] = kotlin.TuplesKt.to(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, str);
            return kotlin.collections.MapsKt.mapOf(pairArr);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDownloadRequested(url=");
            sb.append(str);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.String str = this.mimeType;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested onDownloadRequested = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, onDownloadRequested.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, onDownloadRequested.mimeType);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested copy(java.lang.String url, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested(url, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested onDownloadRequested, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDownloadRequested.url;
            }
            if ((i & 2) != 0) {
                str2 = onDownloadRequested.mimeType;
            }
            return onDownloadRequested.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadFailed extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        public OnDownloadFailed(java.lang.String str) {
            super("OnDownloadFailed", null);
            this.errorMessage = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            java.lang.String str = this.errorMessage;
            if (str == null) {
                str = "";
            }
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", str));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDownloadFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadFailed copy(java.lang.String errorMessage) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadFailed copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadFailed onDownloadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDownloadFailed.errorMessage;
            }
            return onDownloadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFilePath"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadCompleted extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        private final java.lang.String filePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDownloadCompleted(java.lang.String str) {
            super("OnDownloadCompleted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filePath = str;
        }

        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filePath;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDownloadCompleted(filePath=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filePath.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.filePath, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCompleted) other).filePath);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCompleted copy(java.lang.String filePath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCompleted(filePath);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCompleted copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCompleted onDownloadCompleted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDownloadCompleted.filePath;
            }
            return onDownloadCompleted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnDownloadCancelled;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadCancelled extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCancelled INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCancelled();

        public final int hashCode() {
            return -1397977722;
        }

        private OnDownloadCancelled() {
            super("OnDownloadCancelled", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String toString() {
            return "OnDownloadCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnPrintRequested;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "jobName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnPrintRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getJobName", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPrintRequested extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        private final java.lang.String jobName;

        public OnPrintRequested(java.lang.String str) {
            super("OnPrintRequested", null);
            this.jobName = str;
        }

        public /* synthetic */ OnPrintRequested(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getJobName() {
            return this.jobName;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            java.lang.String str = this.jobName;
            if (str == null) {
                str = "";
            }
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("jobName", str));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.jobName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPrintRequested(jobName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.jobName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnPrintRequested) && kotlin.jvm.internal.Intrinsics.areEqual(this.jobName, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnPrintRequested) other).jobName);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnPrintRequested copy(java.lang.String jobName) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnPrintRequested(jobName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getJobName() {
            return this.jobName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnPrintRequested copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnPrintRequested onPrintRequested, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPrintRequested.jobName;
            }
            return onPrintRequested.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnPrintRequested() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\rR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnFileChooserRequested;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "", "acceptTypes", "", "allowMultiple", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnFileChooserRequested;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAcceptTypes", "Z", "getAllowMultiple", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFileChooserRequested extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> acceptTypes;
        private final boolean allowMultiple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFileChooserRequested(java.util.List<java.lang.String> list, boolean z) {
            super("OnFileChooserRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.acceptTypes = list;
            this.allowMultiple = z;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.util.List<java.lang.String> getAcceptTypes() {
            return this.acceptTypes;
        }

        public final boolean getAllowMultiple() {
            return this.allowMultiple;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("acceptTypes", this.acceptTypes.toString()), kotlin.TuplesKt.to("allowMultiple", java.lang.String.valueOf(this.allowMultiple)));
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.acceptTypes;
            boolean z = this.allowMultiple;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFileChooserRequested(acceptTypes=");
            sb.append(list);
            sb.append(", allowMultiple=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.acceptTypes.hashCode() * 31) + java.lang.Boolean.hashCode(this.allowMultiple);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileChooserRequested)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileChooserRequested onFileChooserRequested = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileChooserRequested) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.acceptTypes, onFileChooserRequested.acceptTypes) && this.allowMultiple == onFileChooserRequested.allowMultiple;
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileChooserRequested copy(java.util.List<java.lang.String> acceptTypes, boolean allowMultiple) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptTypes, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileChooserRequested(acceptTypes, allowMultiple);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAllowMultiple() {
            return this.allowMultiple;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.acceptTypes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileChooserRequested copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileChooserRequested onFileChooserRequested, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onFileChooserRequested.acceptTypes;
            }
            if ((i & 2) != 0) {
                z = onFileChooserRequested.allowMultiple;
            }
            return onFileChooserRequested.copy(list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnFileSelectionCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFileSelectionCompleted extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileSelectionCompleted INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileSelectionCompleted();

        public final int hashCode() {
            return -1202562306;
        }

        private OnFileSelectionCompleted() {
            super("OnFileSelectionCompleted", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String toString() {
            return "OnFileSelectionCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileSelectionCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/CreditWebViewResult;", "webViewResult", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/CreditWebViewResult;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/CreditWebViewResult;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/CreditWebViewResult;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnWebViewEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/CreditWebViewResult;", "getWebViewResult", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnWebViewEvent extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult webViewResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnWebViewEvent(com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult creditWebViewResult) {
            super("OnWebViewEvent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditWebViewResult, "");
            this.webViewResult = creditWebViewResult;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult getWebViewResult() {
            return this.webViewResult;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", this.webViewResult.getEvent().toString()), kotlin.TuplesKt.to("additionalData", java.lang.String.valueOf(this.webViewResult.getAdditionalData())));
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult creditWebViewResult = this.webViewResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnWebViewEvent(webViewResult=");
            sb.append(creditWebViewResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.webViewResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnWebViewEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewResult, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnWebViewEvent) other).webViewResult);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnWebViewEvent copy(com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult webViewResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewResult, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnWebViewEvent(webViewResult);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult getWebViewResult() {
            return this.webViewResult;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnWebViewEvent copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnWebViewEvent onWebViewEvent, com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult creditWebViewResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditWebViewResult = onWebViewEvent.webViewResult;
            }
            return onWebViewEvent.copy(creditWebViewResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnParserError;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "Lkotlinx/serialization/SerializationException;", "exception", "", "attemptedParseContent", "<init>", "(Lkotlinx/serialization/SerializationException;Ljava/lang/String;)V", "component1", "()Lkotlinx/serialization/SerializationException;", "component2", "()Ljava/lang/String;", "copy", "(Lkotlinx/serialization/SerializationException;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnParserError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lkotlinx/serialization/SerializationException;", "getException", "Ljava/lang/String;", "getAttemptedParseContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnParserError extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 8;
        private final java.lang.String attemptedParseContent;
        private final kotlinx.serialization.SerializationException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnParserError(kotlinx.serialization.SerializationException serializationException, java.lang.String str) {
            super("OnParserError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationException, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.exception = serializationException;
            this.attemptedParseContent = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final kotlinx.serialization.SerializationException getException() {
            return this.exception;
        }

        public final java.lang.String getAttemptedParseContent() {
            return this.attemptedParseContent;
        }

        public final java.lang.String toString() {
            kotlinx.serialization.SerializationException serializationException = this.exception;
            java.lang.String str = this.attemptedParseContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnParserError(exception=");
            sb.append(serializationException);
            sb.append(", attemptedParseContent=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.exception.hashCode() * 31) + this.attemptedParseContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError onParserError = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.exception, onParserError.exception) && kotlin.jvm.internal.Intrinsics.areEqual(this.attemptedParseContent, onParserError.attemptedParseContent);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError copy(kotlinx.serialization.SerializationException exception, java.lang.String attemptedParseContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attemptedParseContent, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError(exception, attemptedParseContent);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAttemptedParseContent() {
            return this.attemptedParseContent;
        }

        /* renamed from: component1, reason: from getter */
        public final kotlinx.serialization.SerializationException getException() {
            return this.exception;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError onParserError, kotlinx.serialization.SerializationException serializationException, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                serializationException = onParserError.exception;
            }
            if ((i & 2) != 0) {
                str = onParserError.attemptedParseContent;
            }
            return onParserError.copy(serializationException, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnNavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigateBack extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnNavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnNavigateBack();

        public final int hashCode() {
            return -746900485;
        }

        private OnNavigateBack() {
            super("OnNavigateBack", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String toString() {
            return "OnNavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnNavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent$OnNavigateForward;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigateForward extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnNavigateForward INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnNavigateForward();

        public final int hashCode() {
            return 983374641;
        }

        private OnNavigateForward() {
            super("OnNavigateForward", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final java.lang.String toString() {
            return "OnNavigateForward";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnNavigateForward)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AcquisitionWebViewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
