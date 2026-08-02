package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJh\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b\t\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b,\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;", "", "", "id", "", "isFlashEnabled", "isApiLoading", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "pendingNavArgs", "isQRCodeDetected", "errorMessage", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ErrorType;", "errorType", "Landroid/net/Uri;", "scannedImageUri", "<init>", "(Ljava/lang/String;ZZLcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;ZLjava/lang/String;Lcom/paypal/oslo/feature/qrc/ui/scanner/ErrorType;Landroid/net/Uri;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/qrc/ui/scanner/ErrorType;", "component8", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;ZZLcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;ZLjava/lang/String;Lcom/paypal/oslo/feature/qrc/ui/scanner/ErrorType;Landroid/net/Uri;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Z", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getPendingNavArgs", "getErrorMessage", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ErrorType;", "getErrorType", "Landroid/net/Uri;", "getScannedImageUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ScannerUiModel {
    public static final int $stable = 8;
    private final java.lang.String errorMessage;
    private final com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType;
    private final java.lang.String id;
    private final boolean isApiLoading;
    private final boolean isFlashEnabled;
    private final boolean isQRCodeDetected;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs pendingNavArgs;
    private final android.net.Uri scannedImageUri;

    public ScannerUiModel(java.lang.String str, boolean z, boolean z2, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, boolean z3, java.lang.String str2, com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.isFlashEnabled = z;
        this.isApiLoading = z2;
        this.pendingNavArgs = qrcSessionNavArgs;
        this.isQRCodeDetected = z3;
        this.errorMessage = str2;
        this.errorType = errorType;
        this.scannedImageUri = uri;
    }

    public /* synthetic */ ScannerUiModel(java.lang.String str, boolean z, boolean z2, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, boolean z3, java.lang.String str2, com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType, android.net.Uri uri, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "dummy_id" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : qrcSessionNavArgs, (i & 16) == 0 ? z3 : false, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : errorType, (i & 128) == 0 ? uri : null);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final boolean isFlashEnabled() {
        return this.isFlashEnabled;
    }

    public final boolean isApiLoading() {
        return this.isApiLoading;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getPendingNavArgs() {
        return this.pendingNavArgs;
    }

    public final boolean isQRCodeDetected() {
        return this.isQRCodeDetected;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.ErrorType getErrorType() {
        return this.errorType;
    }

    public final android.net.Uri getScannedImageUri() {
        return this.scannedImageUri;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        boolean z = this.isFlashEnabled;
        boolean z2 = this.isApiLoading;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.pendingNavArgs;
        boolean z3 = this.isQRCodeDetected;
        java.lang.String str2 = this.errorMessage;
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType = this.errorType;
        android.net.Uri uri = this.scannedImageUri;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScannerUiModel(id=");
        sb.append(str);
        sb.append(", isFlashEnabled=");
        sb.append(z);
        sb.append(", isApiLoading=");
        sb.append(z2);
        sb.append(", pendingNavArgs=");
        sb.append(qrcSessionNavArgs);
        sb.append(", isQRCodeDetected=");
        sb.append(z3);
        sb.append(", errorMessage=");
        sb.append(str2);
        sb.append(", errorType=");
        sb.append(errorType);
        sb.append(", scannedImageUri=");
        sb.append(uri);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isFlashEnabled);
        int hashCode3 = java.lang.Boolean.hashCode(this.isApiLoading);
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.pendingNavArgs;
        int hashCode4 = qrcSessionNavArgs == null ? 0 : qrcSessionNavArgs.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isQRCodeDetected);
        java.lang.String str = this.errorMessage;
        int hashCode6 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType = this.errorType;
        int hashCode7 = errorType == null ? 0 : errorType.hashCode();
        android.net.Uri uri = this.scannedImageUri;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (uri != null ? uri.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel scannerUiModel = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, scannerUiModel.id) && this.isFlashEnabled == scannerUiModel.isFlashEnabled && this.isApiLoading == scannerUiModel.isApiLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingNavArgs, scannerUiModel.pendingNavArgs) && this.isQRCodeDetected == scannerUiModel.isQRCodeDetected && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, scannerUiModel.errorMessage) && this.errorType == scannerUiModel.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.scannedImageUri, scannerUiModel.scannedImageUri);
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy(java.lang.String id, boolean isFlashEnabled, boolean isApiLoading, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs pendingNavArgs, boolean isQRCodeDetected, java.lang.String errorMessage, com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType, android.net.Uri scannedImageUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel(id, isFlashEnabled, isApiLoading, pendingNavArgs, isQRCodeDetected, errorMessage, errorType, scannedImageUri);
    }

    /* renamed from: component8, reason: from getter */
    public final android.net.Uri getScannedImageUri() {
        return this.scannedImageUri;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.scanner.ErrorType getErrorType() {
        return this.errorType;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsQRCodeDetected() {
        return this.isQRCodeDetected;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getPendingNavArgs() {
        return this.pendingNavArgs;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsApiLoading() {
        return this.isApiLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFlashEnabled() {
        return this.isFlashEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public ScannerUiModel() {
        this(null, false, false, null, false, null, null, null, 255, null);
    }
}
