package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\r\u0010\f\u0082\u0001\u0004\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "isAPILoadingComplete", "()Z", "isAPILoading", "Initial", "CameraPermissionRequired", "Content", "LocationPermissionRequired", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$CameraPermissionRequired;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$Content;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$Initial;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$LocationPermissionRequired;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ScannerUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$Initial;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Initial INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Initial();

        public final int hashCode() {
            return -1915991230;
        }

        private Initial() {
            super("ScannerUiState.Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private ScannerUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$CameraPermissionRequired;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CameraPermissionRequired extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.CameraPermissionRequired INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.CameraPermissionRequired();

        public final int hashCode() {
            return 1767685717;
        }

        private CameraPermissionRequired() {
            super("ScannerUiState.CameraPermissionRequired", null);
        }

        public final java.lang.String toString() {
            return "CameraPermissionRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.CameraPermissionRequired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$Content;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel scannerUiModel) {
            super("ScannerUiState.Content", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scannerUiModel, "");
            this.uiModel = scannerUiModel;
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel scannerUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(uiModel=");
            sb.append(scannerUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content) other).uiModel);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content copy(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content content, com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel scannerUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                scannerUiModel = content.uiModel;
            }
            return content.copy(scannerUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$LocationPermissionRequired;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState$LocationPermissionRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LocationPermissionRequired extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationPermissionRequired(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel scannerUiModel) {
            super("ScannerUiState.LocationPermissionRequired", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scannerUiModel, "");
            this.uiModel = scannerUiModel;
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel scannerUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationPermissionRequired(uiModel=");
            sb.append(scannerUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired) other).uiModel);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired copy(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired locationPermissionRequired, com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel scannerUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                scannerUiModel = locationPermissionRequired.uiModel;
            }
            return locationPermissionRequired.copy(scannerUiModel);
        }
    }

    public final boolean isAPILoadingComplete() {
        return (this instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content) && !((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content) this).getUiModel().isApiLoading();
    }

    public final boolean isAPILoading() {
        return (this instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content) && ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content) this).getUiModel().isApiLoading();
    }

    public /* synthetic */ ScannerUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
