package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge;", "", "", "payload", "", "sendToWebView", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult;", com.sun.jna.Callback.METHOD_NAME, "registerScanResultBlobCallback", "(Lkotlin/jvm/functions/Function1;)V", "result", "deliverScanResult", "(Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult;)V", "ScanResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FaceTecWebViewBridge {
    void deliverScanResult(com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult result);

    void registerScanResultBlobCallback(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult, kotlin.Unit> callback);

    void sendToWebView(java.lang.String payload);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult;", "", "Blob", "Error", "Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult$Blob;", "Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface ScanResult {

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult$Blob;", "Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult;", "", "blob", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult$Blob;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBlob"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Blob implements com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult {
            public static final int $stable = 0;
            private final java.lang.String blob;

            public Blob(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.blob = str;
            }

            public final java.lang.String getBlob() {
                return this.blob;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.blob;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Blob(blob=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.blob.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Blob) && kotlin.jvm.internal.Intrinsics.areEqual(this.blob, ((com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Blob) other).blob);
            }

            public final com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Blob copy(java.lang.String blob) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blob, "");
                return new com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Blob(blob);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getBlob() {
                return this.blob;
            }

            public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Blob copy$default(com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Blob blob, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = blob.blob;
                }
                return blob.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult;", "", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge$ScanResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Error implements com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult {
            public static final int $stable = 0;
            private final java.lang.String errorCode;
            private final java.lang.String errorMessage;

            public Error(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.errorCode = str;
                this.errorMessage = str2;
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.String str2 = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
                sb.append(str);
                sb.append(", errorMessage=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.errorCode.hashCode() * 31) + this.errorMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error error = (com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage);
            }

            public final com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error copy(java.lang.String errorCode, java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
                return new com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error(errorCode, errorMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error copy$default(com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorCode;
                }
                if ((i & 2) != 0) {
                    str2 = error.errorMessage;
                }
                return error.copy(str, str2);
            }
        }
    }
}
