package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0012\u001c\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadScreen", "RequestCameraPermission", "CameraPermissionGranted", "CameraPermissionDenied", "LocationPermissionGranted", "LocationPermissionDenied", "LocationPermissionDialogDismissed", "LocationProcessed", "FlashPressed", "GalleryPressed", "QRCodeScanned", "PollForQrcSession", "QrCodeValidForPayment", "EnrollmentRequired", "EnrollmentCompleted", "ShowValidationError", "ShowCountryCodeMismatch", "ClearError", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$CameraPermissionDenied;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$CameraPermissionGranted;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$ClearError;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$EnrollmentCompleted;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$EnrollmentRequired;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$FlashPressed;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$GalleryPressed;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationPermissionDenied;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationPermissionDialogDismissed;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationPermissionGranted;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationProcessed;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$PollForQrcSession;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$QRCodeScanned;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$QrCodeValidForPayment;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$RequestCameraPermission;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$ShowCountryCodeMismatch;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$ShowValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ScannerEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ScannerEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadScreen extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LoadScreen INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LoadScreen();

        public final int hashCode() {
            return 416026647;
        }

        private LoadScreen() {
            super("ScannerEvent.LoadScreen", null);
        }

        public final java.lang.String toString() {
            return "LoadScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LoadScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$RequestCameraPermission;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestCameraPermission extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.RequestCameraPermission INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.RequestCameraPermission();

        public final int hashCode() {
            return -861383554;
        }

        private RequestCameraPermission() {
            super("ScannerEvent.RequestCameraPermission", null);
        }

        public final java.lang.String toString() {
            return "RequestCameraPermission";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.RequestCameraPermission)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$CameraPermissionGranted;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CameraPermissionGranted extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionGranted INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionGranted();

        public final int hashCode() {
            return 1441832514;
        }

        private CameraPermissionGranted() {
            super("ScannerEvent.CameraPermissionGranted", null);
        }

        public final java.lang.String toString() {
            return "CameraPermissionGranted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionGranted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$CameraPermissionDenied;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CameraPermissionDenied extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionDenied INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionDenied();

        public final int hashCode() {
            return -1159379148;
        }

        private CameraPermissionDenied() {
            super("ScannerEvent.CameraPermissionDenied", null);
        }

        public final java.lang.String toString() {
            return "CameraPermissionDenied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionDenied)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationPermissionGranted;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "", "latitude", "longitude", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "component1", "()Ljava/lang/Double;", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationPermissionGranted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Double;", "getLatitude", "getLongitude"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LocationPermissionGranted extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        private final java.lang.Double latitude;
        private final java.lang.Double longitude;

        public LocationPermissionGranted(java.lang.Double d, java.lang.Double d2) {
            super("ScannerEvent.LocationPermissionGranted", null);
            this.latitude = d;
            this.longitude = d2;
        }

        public final java.lang.Double getLatitude() {
            return this.latitude;
        }

        public final java.lang.Double getLongitude() {
            return this.longitude;
        }

        public final java.lang.String toString() {
            java.lang.Double d = this.latitude;
            java.lang.Double d2 = this.longitude;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationPermissionGranted(latitude=");
            sb.append(d);
            sb.append(", longitude=");
            sb.append(d2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Double d = this.latitude;
            int hashCode = d == null ? 0 : d.hashCode();
            java.lang.Double d2 = this.longitude;
            return (hashCode * 31) + (d2 != null ? d2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted locationPermissionGranted = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.latitude, (java.lang.Object) locationPermissionGranted.latitude) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.longitude, (java.lang.Object) locationPermissionGranted.longitude);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted copy(java.lang.Double latitude, java.lang.Double longitude) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted(latitude, longitude);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Double getLongitude() {
            return this.longitude;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Double getLatitude() {
            return this.latitude;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted locationPermissionGranted, java.lang.Double d, java.lang.Double d2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = locationPermissionGranted.latitude;
            }
            if ((i & 2) != 0) {
                d2 = locationPermissionGranted.longitude;
            }
            return locationPermissionGranted.copy(d, d2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationPermissionDenied;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LocationPermissionDenied extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionDenied INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionDenied();

        public final int hashCode() {
            return -93737340;
        }

        private LocationPermissionDenied() {
            super("ScannerEvent.LocationPermissionDenied", null);
        }

        public final java.lang.String toString() {
            return "LocationPermissionDenied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionDenied)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationPermissionDialogDismissed;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LocationPermissionDialogDismissed extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionDialogDismissed INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionDialogDismissed();

        public final int hashCode() {
            return 1025235832;
        }

        private LocationPermissionDialogDismissed() {
            super("ScannerEvent.LocationPermissionDialogDismissed", null);
        }

        public final java.lang.String toString() {
            return "LocationPermissionDialogDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionDialogDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationProcessed;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "", "isMatched", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$LocationProcessed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LocationProcessed extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        private final boolean isMatched;

        public LocationProcessed(boolean z) {
            super("ScannerEvent.LocationProcessed", null);
            this.isMatched = z;
        }

        public final boolean isMatched() {
            return this.isMatched;
        }

        public final java.lang.String toString() {
            boolean z = this.isMatched;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationProcessed(isMatched=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isMatched);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed) && this.isMatched == ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed) other).isMatched;
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed copy(boolean isMatched) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed(isMatched);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsMatched() {
            return this.isMatched;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed locationProcessed, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = locationProcessed.isMatched;
            }
            return locationProcessed.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$FlashPressed;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FlashPressed extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.FlashPressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.FlashPressed();

        public final int hashCode() {
            return 1906029559;
        }

        private FlashPressed() {
            super("ScannerEvent.FlashPressed", null);
        }

        public final java.lang.String toString() {
            return "FlashPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.FlashPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$GalleryPressed;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GalleryPressed extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.GalleryPressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.GalleryPressed();

        public final int hashCode() {
            return -1339517675;
        }

        private GalleryPressed() {
            super("ScannerEvent.GalleryPressed", null);
        }

        public final java.lang.String toString() {
            return "GalleryPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.GalleryPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$QRCodeScanned;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "", "qrCode", "", "latitude", "longitude", "Landroid/net/Uri;", "imageUri", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Landroid/net/Uri;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "component4", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Landroid/net/Uri;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$QRCodeScanned;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQrCode", "Ljava/lang/Double;", "getLatitude", "getLongitude", "Landroid/net/Uri;", "getImageUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QRCodeScanned extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 8;
        private final android.net.Uri imageUri;
        private final java.lang.Double latitude;
        private final java.lang.Double longitude;
        private final java.lang.String qrCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QRCodeScanned(java.lang.String str, java.lang.Double d, java.lang.Double d2, android.net.Uri uri) {
            super("ScannerEvent.QRCodeScanned", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.qrCode = str;
            this.latitude = d;
            this.longitude = d2;
            this.imageUri = uri;
        }

        public /* synthetic */ QRCodeScanned(java.lang.String str, java.lang.Double d, java.lang.Double d2, android.net.Uri uri, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : uri);
        }

        public final java.lang.String getQrCode() {
            return this.qrCode;
        }

        public final java.lang.Double getLatitude() {
            return this.latitude;
        }

        public final java.lang.Double getLongitude() {
            return this.longitude;
        }

        public final android.net.Uri getImageUri() {
            return this.imageUri;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.qrCode;
            java.lang.Double d = this.latitude;
            java.lang.Double d2 = this.longitude;
            android.net.Uri uri = this.imageUri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QRCodeScanned(qrCode=");
            sb.append(str);
            sb.append(", latitude=");
            sb.append(d);
            sb.append(", longitude=");
            sb.append(d2);
            sb.append(", imageUri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.qrCode.hashCode();
            java.lang.Double d = this.latitude;
            int hashCode2 = d == null ? 0 : d.hashCode();
            java.lang.Double d2 = this.longitude;
            int hashCode3 = d2 == null ? 0 : d2.hashCode();
            android.net.Uri uri = this.imageUri;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (uri != null ? uri.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned qRCodeScanned = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.qrCode, qRCodeScanned.qrCode) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.latitude, (java.lang.Object) qRCodeScanned.latitude) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.longitude, (java.lang.Object) qRCodeScanned.longitude) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUri, qRCodeScanned.imageUri);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned copy(java.lang.String qrCode, java.lang.Double latitude, java.lang.Double longitude, android.net.Uri imageUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCode, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned(qrCode, latitude, longitude, imageUri);
        }

        /* renamed from: component4, reason: from getter */
        public final android.net.Uri getImageUri() {
            return this.imageUri;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Double getLongitude() {
            return this.longitude;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQrCode() {
            return this.qrCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned qRCodeScanned, java.lang.String str, java.lang.Double d, java.lang.Double d2, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = qRCodeScanned.qrCode;
            }
            if ((i & 2) != 0) {
                d = qRCodeScanned.latitude;
            }
            if ((i & 4) != 0) {
                d2 = qRCodeScanned.longitude;
            }
            if ((i & 8) != 0) {
                uri = qRCodeScanned.imageUri;
            }
            return qRCodeScanned.copy(str, d, d2, uri);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$PollForQrcSession;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "pollingSessionInfo", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$PollForQrcSession;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "getPollingSessionInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PollForQrcSession extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollForQrcSession(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo) {
            super("ScannerEvent.PollForQrcSession", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollingSessionInfo, "");
            this.pollingSessionInfo = pollingSessionInfo;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo getPollingSessionInfo() {
            return this.pollingSessionInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo = this.pollingSessionInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PollForQrcSession(pollingSessionInfo=");
            sb.append(pollingSessionInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pollingSessionInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession) && kotlin.jvm.internal.Intrinsics.areEqual(this.pollingSessionInfo, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession) other).pollingSessionInfo);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession copy(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollingSessionInfo, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession(pollingSessionInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo getPollingSessionInfo() {
            return this.pollingSessionInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession pollForQrcSession, com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pollingSessionInfo = pollForQrcSession.pollingSessionInfo;
            }
            return pollForQrcSession.copy(pollingSessionInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$QrCodeValidForPayment;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$QrCodeValidForPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QrCodeValidForPayment extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QrCodeValidForPayment(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("ScannerEvent.QrCodeValidForPayment", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            this.navArgs = qrcSessionNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QrCodeValidForPayment(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment qrCodeValidForPayment, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = qrCodeValidForPayment.navArgs;
            }
            return qrCodeValidForPayment.copy(qrcSessionNavArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$EnrollmentRequired;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$EnrollmentRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollmentRequired extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnrollmentRequired(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("ScannerEvent.EnrollmentRequired", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            this.navArgs = qrcSessionNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollmentRequired(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired enrollmentRequired, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = enrollmentRequired.navArgs;
            }
            return enrollmentRequired.copy(qrcSessionNavArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$EnrollmentCompleted;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollmentCompleted extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentCompleted INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentCompleted();

        public final int hashCode() {
            return 1727082018;
        }

        private EnrollmentCompleted() {
            super("ScannerEvent.EnrollmentCompleted", null);
        }

        public final java.lang.String toString() {
            return "EnrollmentCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$ShowValidationError;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$ShowValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowValidationError extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public ShowValidationError(java.lang.String str) {
            super("ScannerEvent.ShowValidationError", null);
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowValidationError(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError) other).reason);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError showValidationError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showValidationError.reason;
            }
            return showValidationError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$ShowCountryCodeMismatch;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCountryCodeMismatch extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowCountryCodeMismatch INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowCountryCodeMismatch();

        public final int hashCode() {
            return -221672369;
        }

        private ShowCountryCodeMismatch() {
            super("ScannerEvent.ShowCountryCodeMismatch", null);
        }

        public final java.lang.String toString() {
            return "ShowCountryCodeMismatch";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowCountryCodeMismatch)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent$ClearError;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearError extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ClearError INSTANCE = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ClearError();

        public final int hashCode() {
            return -109349152;
        }

        private ClearError() {
            super("ScannerEvent.ClearError", null);
        }

        public final java.lang.String toString() {
            return "ClearError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ClearError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ScannerEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
