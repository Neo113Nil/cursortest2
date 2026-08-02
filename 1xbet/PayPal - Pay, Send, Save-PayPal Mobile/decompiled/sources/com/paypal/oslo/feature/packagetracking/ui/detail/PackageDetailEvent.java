package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:%\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001)/0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVW"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadPackageDetail", "PackageDetailLoaded", "PackageDetailLoadFailed", "RetryLoadPackageDetail", "RefreshPackageDetail", "DismissBanner", "CopyTrackingNumberClicked", "CopyTrackingNumber", "TrackingUrlClicked", "OpenTrackingUrl", "OrderManagementUrlClicked", "OpenOrderManagementUrl", "RemoveSheet", "RemovePackageSuccess", "RemovePackageFailed", "GeoCoderSuccess", "GeoCoderFailure", "ShippingProgressUpdateExpansionClicked", "GoogleMapLoaded", "PackageDetailSettings", "RenamePackage", "MarkAsDelivered", "ErrorBannerShown", "CloseButtonClicked", "ClosePackageDetailScreen", "ManageAmazonButtonClicked", "AmazonTrackingPreferencesClicked", "AmazonTrackingPreferenceLoaded", "AmazonTrackingToggle", "AmazonTrackingToggleSuccess", "AmazonTrackingToggleFailed", "PackageOptionsClicked", "PackageSettingsClicked", "UnlinkBySystemBannerClicked", "NavigateToPackageSettings", "NavigateToPackageSettingsForRelink", "PayPalAccountEmailLoaded", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingPreferenceLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingPreferencesClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggle;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggleFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggleSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$CloseButtonClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$ClosePackageDetailScreen;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$CopyTrackingNumber;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$CopyTrackingNumberClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$DismissBanner;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$ErrorBannerShown;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$GeoCoderFailure;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$GeoCoderSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$GoogleMapLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$LoadPackageDetail;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$ManageAmazonButtonClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$NavigateToPackageSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$NavigateToPackageSettingsForRelink;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OpenOrderManagementUrl;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OpenTrackingUrl;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OrderManagementUrlClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailLoadFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$MarkAsDeliveredMenuOptionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$PackageSettingsMenuOptionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$RemovePackageMenuOptionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$RenamePackageMenuOptionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageOptionsClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageSettingsClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PayPalAccountEmailLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RefreshPackageDetail;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemovePackageFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemovePackageSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RetryLoadPackageDetail;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$ShippingProgressUpdateExpansionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$TrackingUrlClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$UnlinkBySystemBannerClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PackageDetailEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PackageDetailEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$LoadPackageDetail;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$LoadPackageDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadPackageDetail extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadPackageDetail(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination) {
            super("LoadPackageDetail", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageDetailDestination, "");
            this.destination = packageDetailDestination;
        }

        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadPackageDetail(destination=");
            sb.append(packageDetailDestination);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail) other).destination);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail copy(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail loadPackageDetail, com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageDetailDestination = loadPackageDetail.destination;
            }
            return loadPackageDetail.copy(packageDetailDestination);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "displayData", "", "source", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "getDisplayData", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageDetailLoaded extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData displayData;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageDetailLoaded(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData, java.lang.String str) {
            super("PackageDetailLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageDisplayData, "");
            this.displayData = packageDisplayData;
            this.source = str;
        }

        public /* synthetic */ PackageDetailLoaded(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(packageDisplayData, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData getDisplayData() {
            return this.displayData;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData = this.displayData;
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageDetailLoaded(displayData=");
            sb.append(packageDisplayData);
            sb.append(", source=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.displayData.hashCode();
            java.lang.String str = this.source;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoaded packageDetailLoaded = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.displayData, packageDetailLoaded.displayData) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, packageDetailLoaded.source);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoaded copy(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData displayData, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayData, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoaded(displayData, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData getDisplayData() {
            return this.displayData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoaded copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoaded packageDetailLoaded, com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageDisplayData = packageDetailLoaded.displayData;
            }
            if ((i & 2) != 0) {
                str = packageDetailLoaded.source;
            }
            return packageDetailLoaded.copy(packageDisplayData, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailLoadFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "errorTitle", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getErrorTitle", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageDetailLoadFailed extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageDetailLoadFailed(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2) {
            super("PackageDetailLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.errorTitle = uiString;
            this.errorMessage = uiString2;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.errorTitle;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageDetailLoadFailed(errorTitle=");
            sb.append(uiString);
            sb.append(", errorMessage=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorTitle.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed packageDetailLoadFailed = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorTitle, packageDetailLoadFailed.errorTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, packageDetailLoadFailed.errorMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed copy(com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle, com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed(errorTitle, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed packageDetailLoadFailed, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = packageDetailLoadFailed.errorTitle;
            }
            if ((i & 2) != 0) {
                uiString2 = packageDetailLoadFailed.errorMessage;
            }
            return packageDetailLoadFailed.copy(uiString, uiString2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RetryLoadPackageDetail;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryLoadPackageDetail extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RetryLoadPackageDetail INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RetryLoadPackageDetail();

        public final int hashCode() {
            return 1860912463;
        }

        private RetryLoadPackageDetail() {
            super("RetryLoadPackageDetail", null);
        }

        public final java.lang.String toString() {
            return "RetryLoadPackageDetail";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RetryLoadPackageDetail)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RefreshPackageDetail;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshPackageDetail extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RefreshPackageDetail INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RefreshPackageDetail();

        public final int hashCode() {
            return -597222206;
        }

        private RefreshPackageDetail() {
            super("RefreshPackageDetail", null);
        }

        public final java.lang.String toString() {
            return "RefreshPackageDetail";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RefreshPackageDetail)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$DismissBanner;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "", "bannerId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$DismissBanner;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBannerId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissBanner extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        private final java.lang.String bannerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissBanner(java.lang.String str) {
            super("DismissBanner", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.bannerId = str;
        }

        public final java.lang.String getBannerId() {
            return this.bannerId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bannerId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DismissBanner(bannerId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.bannerId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.DismissBanner) && kotlin.jvm.internal.Intrinsics.areEqual(this.bannerId, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.DismissBanner) other).bannerId);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.DismissBanner copy(java.lang.String bannerId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerId, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.DismissBanner(bannerId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBannerId() {
            return this.bannerId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.DismissBanner copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.DismissBanner dismissBanner, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dismissBanner.bannerId;
            }
            return dismissBanner.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$CopyTrackingNumberClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyTrackingNumberClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumberClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumberClicked();

        public final int hashCode() {
            return 462124748;
        }

        private CopyTrackingNumberClicked() {
            super("CopyTrackingNumberClicked", null);
        }

        public final java.lang.String toString() {
            return "CopyTrackingNumberClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumberClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$CopyTrackingNumber;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "", "trackingNumber", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "label", "confirmationMessage", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$CopyTrackingNumber;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTrackingNumber", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getLabel", "getConfirmationMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyTrackingNumber extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString confirmationMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString label;
        private final java.lang.String trackingNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyTrackingNumber(java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2) {
            super("CopyTrackingNumber", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.trackingNumber = str;
            this.label = uiString;
            this.confirmationMessage = uiString2;
        }

        public final java.lang.String getTrackingNumber() {
            return this.trackingNumber;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getLabel() {
            return this.label;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getConfirmationMessage() {
            return this.confirmationMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.trackingNumber;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.label;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.confirmationMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CopyTrackingNumber(trackingNumber=");
            sb.append(str);
            sb.append(", label=");
            sb.append(uiString);
            sb.append(", confirmationMessage=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.trackingNumber.hashCode() * 31) + this.label.hashCode()) * 31) + this.confirmationMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumber)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumber copyTrackingNumber = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumber) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.trackingNumber, copyTrackingNumber.trackingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, copyTrackingNumber.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationMessage, copyTrackingNumber.confirmationMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumber copy(java.lang.String trackingNumber, com.paypal.oslo.feature.packagetracking.domain.UiString label, com.paypal.oslo.feature.packagetracking.domain.UiString confirmationMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumber(trackingNumber, label, confirmationMessage);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getConfirmationMessage() {
            return this.confirmationMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getLabel() {
            return this.label;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTrackingNumber() {
            return this.trackingNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumber copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumber copyTrackingNumber, java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = copyTrackingNumber.trackingNumber;
            }
            if ((i & 2) != 0) {
                uiString = copyTrackingNumber.label;
            }
            if ((i & 4) != 0) {
                uiString2 = copyTrackingNumber.confirmationMessage;
            }
            return copyTrackingNumber.copy(str, uiString, uiString2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$TrackingUrlClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$TrackingUrlClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TrackingUrlClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public TrackingUrlClicked(java.lang.String str) {
            super("TrackingUrlClicked", null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TrackingUrlClicked(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.TrackingUrlClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.TrackingUrlClicked) other).url);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.TrackingUrlClicked copy(java.lang.String url) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.TrackingUrlClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.TrackingUrlClicked copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.TrackingUrlClicked trackingUrlClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = trackingUrlClicked.url;
            }
            return trackingUrlClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OpenTrackingUrl;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OpenTrackingUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenTrackingUrl extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public OpenTrackingUrl(java.lang.String str) {
            super("OpenTrackingUrl", null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenTrackingUrl(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenTrackingUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenTrackingUrl) other).url);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenTrackingUrl copy(java.lang.String url) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenTrackingUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenTrackingUrl copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenTrackingUrl openTrackingUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openTrackingUrl.url;
            }
            return openTrackingUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OrderManagementUrlClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OrderManagementUrlClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OrderManagementUrlClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public OrderManagementUrlClicked(java.lang.String str) {
            super("OrderManagementUrlClicked", null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OrderManagementUrlClicked(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OrderManagementUrlClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OrderManagementUrlClicked) other).url);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OrderManagementUrlClicked copy(java.lang.String url) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OrderManagementUrlClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OrderManagementUrlClicked copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OrderManagementUrlClicked orderManagementUrlClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = orderManagementUrlClicked.url;
            }
            return orderManagementUrlClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OpenOrderManagementUrl;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$OpenOrderManagementUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenOrderManagementUrl extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public OpenOrderManagementUrl(java.lang.String str) {
            super("OpenOrderManagementUrl", null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenOrderManagementUrl(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenOrderManagementUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenOrderManagementUrl) other).url);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenOrderManagementUrl copy(java.lang.String url) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenOrderManagementUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenOrderManagementUrl copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenOrderManagementUrl openOrderManagementUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openOrderManagementUrl.url;
            }
            return openOrderManagementUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Shown", "RemoveButtonClicked", "CancelClicked", "SheetClosed", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$CancelClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$RemoveButtonClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$SheetClosed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$Shown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class RemoveSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$Shown;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Shown extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.Shown INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.Shown();

            public final int hashCode() {
                return 1642285720;
            }

            private Shown() {
                super("RemoveSheet.RemoveSheetShown", null);
            }

            public final java.lang.String toString() {
                return "Shown";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.Shown)) {
                    return false;
                }
                return true;
            }
        }

        private RemoveSheet(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$RemoveButtonClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet;", "", "carrierId", "trackingNumber", "transactionNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$RemoveButtonClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCarrierId", "getTrackingNumber", "getTransactionNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RemoveButtonClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet {
            public static final int $stable = 0;
            private final java.lang.String carrierId;
            private final java.lang.String trackingNumber;
            private final java.lang.String transactionNumber;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoveButtonClicked(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                super("RemoveSheet.RemoveButtonClicked", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.carrierId = str;
                this.trackingNumber = str2;
                this.transactionNumber = str3;
            }

            public final java.lang.String getCarrierId() {
                return this.carrierId;
            }

            public final java.lang.String getTrackingNumber() {
                return this.trackingNumber;
            }

            public final java.lang.String getTransactionNumber() {
                return this.transactionNumber;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.carrierId;
                java.lang.String str2 = this.trackingNumber;
                java.lang.String str3 = this.transactionNumber;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveButtonClicked(carrierId=");
                sb.append(str);
                sb.append(", trackingNumber=");
                sb.append(str2);
                sb.append(", transactionNumber=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.carrierId.hashCode();
                int hashCode2 = this.trackingNumber.hashCode();
                java.lang.String str = this.transactionNumber;
                return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked)) {
                    return false;
                }
                com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked removeButtonClicked = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.carrierId, removeButtonClicked.carrierId) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingNumber, removeButtonClicked.trackingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionNumber, removeButtonClicked.transactionNumber);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked copy(java.lang.String carrierId, java.lang.String trackingNumber, java.lang.String transactionNumber) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrierId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingNumber, "");
                return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked(carrierId, trackingNumber, transactionNumber);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getTransactionNumber() {
                return this.transactionNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getTrackingNumber() {
                return this.trackingNumber;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCarrierId() {
                return this.carrierId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked removeButtonClicked, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = removeButtonClicked.carrierId;
                }
                if ((i & 2) != 0) {
                    str2 = removeButtonClicked.trackingNumber;
                }
                if ((i & 4) != 0) {
                    str3 = removeButtonClicked.transactionNumber;
                }
                return removeButtonClicked.copy(str, str2, str3);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$CancelClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CancelClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.CancelClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.CancelClicked();

            public final int hashCode() {
                return 168291028;
            }

            private CancelClicked() {
                super("RemoveSheet.CancelClicked", null);
            }

            public final java.lang.String toString() {
                return "CancelClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.CancelClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet$SheetClosed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemoveSheet;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SheetClosed extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.SheetClosed INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.SheetClosed();

            public final int hashCode() {
                return -1093293070;
            }

            private SheetClosed() {
                super("RemoveSheet.SheetClosed", null);
            }

            public final java.lang.String toString() {
                return "SheetClosed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.SheetClosed)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ RemoveSheet(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemovePackageSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemovePackageSuccess extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageSuccess();

        public final int hashCode() {
            return 1976258087;
        }

        private RemovePackageSuccess() {
            super("RemovePackageSuccess", null);
        }

        public final java.lang.String toString() {
            return "RemovePackageSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemovePackageFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "errorBanner", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RemovePackageFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "getErrorBanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemovePackageFailed extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner errorBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemovePackageFailed(com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner) {
            super("RemovePackageFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoBanner, "");
            this.errorBanner = infoBanner;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner getErrorBanner() {
            return this.errorBanner;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner = this.errorBanner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemovePackageFailed(errorBanner=");
            sb.append(infoBanner);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorBanner.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorBanner, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageFailed) other).errorBanner);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageFailed copy(com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner errorBanner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorBanner, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageFailed(errorBanner);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner getErrorBanner() {
            return this.errorBanner;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageFailed removePackageFailed, com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                infoBanner = removePackageFailed.errorBanner;
            }
            return removePackageFailed.copy(infoBanner);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$GeoCoderSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "address", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;)V", "component1", "()Lcom/google/android/gms/maps/model/LatLng;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$GeoCoderSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/google/android/gms/maps/model/LatLng;", "getLatLng", "Ljava/lang/String;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GeoCoderSuccess extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 8;
        private final java.lang.String address;
        private final com.google.android.gms.maps.model.LatLng latLng;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeoCoderSuccess(com.google.android.gms.maps.model.LatLng latLng, java.lang.String str) {
            super("GeoCoderSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.latLng = latLng;
            this.address = str;
        }

        public final com.google.android.gms.maps.model.LatLng getLatLng() {
            return this.latLng;
        }

        public final java.lang.String getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.google.android.gms.maps.model.LatLng latLng = this.latLng;
            java.lang.String str = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GeoCoderSuccess(latLng=");
            sb.append(latLng);
            sb.append(", address=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.latLng.hashCode() * 31) + this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderSuccess geoCoderSuccess = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.latLng, geoCoderSuccess.latLng) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, geoCoderSuccess.address);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderSuccess copy(com.google.android.gms.maps.model.LatLng latLng, java.lang.String address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderSuccess(latLng, address);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddress() {
            return this.address;
        }

        /* renamed from: component1, reason: from getter */
        public final com.google.android.gms.maps.model.LatLng getLatLng() {
            return this.latLng;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderSuccess copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderSuccess geoCoderSuccess, com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                latLng = geoCoderSuccess.latLng;
            }
            if ((i & 2) != 0) {
                str = geoCoderSuccess.address;
            }
            return geoCoderSuccess.copy(latLng, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$GeoCoderFailure;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GeoCoderFailure extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderFailure INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderFailure();

        public final int hashCode() {
            return 624926768;
        }

        private GeoCoderFailure() {
            super("GeoCoderFailure", null);
        }

        public final java.lang.String toString() {
            return "GeoCoderFailure";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderFailure)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$ShippingProgressUpdateExpansionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShippingProgressUpdateExpansionClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ShippingProgressUpdateExpansionClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ShippingProgressUpdateExpansionClicked();

        public final int hashCode() {
            return -2115911854;
        }

        private ShippingProgressUpdateExpansionClicked() {
            super("ShippingProgressUpdateExpansionClicked", null);
        }

        public final java.lang.String toString() {
            return "ShippingProgressUpdateExpansionClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ShippingProgressUpdateExpansionClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$GoogleMapLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoogleMapLoaded extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GoogleMapLoaded INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GoogleMapLoaded();

        public final int hashCode() {
            return 6354658;
        }

        private GoogleMapLoaded() {
            super("GoogleMapLoaded", null);
        }

        public final java.lang.String toString() {
            return "GoogleMapLoaded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GoogleMapLoaded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "PackageDetailSettingsClicked", "MarkAsDeliveredMenuOptionClicked", "RemovePackageMenuOptionClicked", "RenamePackageMenuOptionClicked", "PackageSettingsMenuOptionClicked", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$PackageDetailSettingsClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class PackageDetailSettings extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$PackageDetailSettingsClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PackageDetailSettingsClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.PackageDetailSettingsClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.PackageDetailSettingsClicked();

            public final int hashCode() {
                return 1352932999;
            }

            private PackageDetailSettingsClicked() {
                super("PackageDetailSettingsClicked", null);
            }

            public final java.lang.String toString() {
                return "PackageDetailSettingsClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.PackageDetailSettingsClicked)) {
                    return false;
                }
                return true;
            }
        }

        private PackageDetailSettings(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$MarkAsDeliveredMenuOptionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MarkAsDeliveredMenuOptionClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.MarkAsDeliveredMenuOptionClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.MarkAsDeliveredMenuOptionClicked();

            public final int hashCode() {
                return -534571480;
            }

            private MarkAsDeliveredMenuOptionClicked() {
                super("MarkAsDeliveredMenuOptionClicked", null);
            }

            public final java.lang.String toString() {
                return "MarkAsDeliveredMenuOptionClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.MarkAsDeliveredMenuOptionClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$RemovePackageMenuOptionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RemovePackageMenuOptionClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.RemovePackageMenuOptionClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.RemovePackageMenuOptionClicked();

            public final int hashCode() {
                return 1249481355;
            }

            private RemovePackageMenuOptionClicked() {
                super("RemovePackageMenuOptionClicked", null);
            }

            public final java.lang.String toString() {
                return "RemovePackageMenuOptionClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.RemovePackageMenuOptionClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$RenamePackageMenuOptionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RenamePackageMenuOptionClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.RenamePackageMenuOptionClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.RenamePackageMenuOptionClicked();

            public final int hashCode() {
                return 137872197;
            }

            private RenamePackageMenuOptionClicked() {
                super("RenamePackageMenuOptionClicked", null);
            }

            public final java.lang.String toString() {
                return "RenamePackageMenuOptionClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.RenamePackageMenuOptionClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageDetailSettings$PackageSettingsMenuOptionClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PackageSettingsMenuOptionClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.PackageSettingsMenuOptionClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.PackageSettingsMenuOptionClicked();

            public final int hashCode() {
                return -1118769276;
            }

            private PackageSettingsMenuOptionClicked() {
                super("PackageSettingsMenuOptionClicked", null);
            }

            public final java.lang.String toString() {
                return "PackageSettingsMenuOptionClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.PackageSettingsMenuOptionClicked)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ PackageDetailSettings(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "RenamePackageSheetShown", "RenamePackageSaveClicked", "RenamePackageSuccess", "RenamePackageFailed", "RenamePackageSheetDismissed", "RefreshPackageDetailAfterRename", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RefreshPackageDetailAfterRename;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSaveClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSheetDismissed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSheetShown;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class RenamePackage extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSheetShown;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RenamePackageSheetShown extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSheetShown INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSheetShown();

            public final int hashCode() {
                return 2006294638;
            }

            private RenamePackageSheetShown() {
                super("RenamePackageSheetShown", null);
            }

            public final java.lang.String toString() {
                return "RenamePackageSheetShown";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSheetShown)) {
                    return false;
                }
                return true;
            }
        }

        private RenamePackage(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSaveClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "", "nickname", "carrierId", "trackingNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSaveClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNickname", "getCarrierId", "getTrackingNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RenamePackageSaveClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
            public static final int $stable = 0;
            private final java.lang.String carrierId;
            private final java.lang.String nickname;
            private final java.lang.String trackingNumber;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RenamePackageSaveClicked(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                super("RenamePackageSaveClicked", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                this.nickname = str;
                this.carrierId = str2;
                this.trackingNumber = str3;
            }

            public final java.lang.String getNickname() {
                return this.nickname;
            }

            public final java.lang.String getCarrierId() {
                return this.carrierId;
            }

            public final java.lang.String getTrackingNumber() {
                return this.trackingNumber;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.nickname;
                java.lang.String str2 = this.carrierId;
                java.lang.String str3 = this.trackingNumber;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RenamePackageSaveClicked(nickname=");
                sb.append(str);
                sb.append(", carrierId=");
                sb.append(str2);
                sb.append(", trackingNumber=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.nickname.hashCode() * 31) + this.carrierId.hashCode()) * 31) + this.trackingNumber.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked)) {
                    return false;
                }
                com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked renamePackageSaveClicked = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, renamePackageSaveClicked.nickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.carrierId, renamePackageSaveClicked.carrierId) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingNumber, renamePackageSaveClicked.trackingNumber);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked copy(java.lang.String nickname, java.lang.String carrierId, java.lang.String trackingNumber) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nickname, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrierId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingNumber, "");
                return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked(nickname, carrierId, trackingNumber);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getTrackingNumber() {
                return this.trackingNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getCarrierId() {
                return this.carrierId;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getNickname() {
                return this.nickname;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked renamePackageSaveClicked, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = renamePackageSaveClicked.nickname;
                }
                if ((i & 2) != 0) {
                    str2 = renamePackageSaveClicked.carrierId;
                }
                if ((i & 4) != 0) {
                    str3 = renamePackageSaveClicked.trackingNumber;
                }
                return renamePackageSaveClicked.copy(str, str2, str3);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "", "nickname", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNickname"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RenamePackageSuccess extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            private final java.lang.String nickname;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RenamePackageSuccess(java.lang.String str) {
                super("RenamePackageSuccess", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.nickname = str;
            }

            public final java.lang.String getNickname() {
                return this.nickname;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.nickname;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RenamePackageSuccess(nickname=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.nickname.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSuccess) other).nickname);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSuccess copy(java.lang.String nickname) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nickname, "");
                return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSuccess(nickname);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getNickname() {
                return this.nickname;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSuccess copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSuccess renamePackageSuccess, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = renamePackageSuccess.nickname;
                }
                return renamePackageSuccess.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "error", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "errorBanner", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "component2", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "getError", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "getErrorBanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RenamePackageFailed extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError error;
            private final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner errorBanner;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RenamePackageFailed(com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner) {
                super("RenamePackageFailed", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoBanner, "");
                this.error = packageTrackingError;
                this.errorBanner = infoBanner;
            }

            public final com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError getError() {
                return this.error;
            }

            public final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner getErrorBanner() {
                return this.errorBanner;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError = this.error;
                com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner = this.errorBanner;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RenamePackageFailed(error=");
                sb.append(packageTrackingError);
                sb.append(", errorBanner=");
                sb.append(infoBanner);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError = this.error;
                return ((packageTrackingError == null ? 0 : packageTrackingError.hashCode()) * 31) + this.errorBanner.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageFailed renamePackageFailed = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.error, renamePackageFailed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorBanner, renamePackageFailed.errorBanner);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageFailed copy(com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError error, com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner errorBanner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorBanner, "");
                return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageFailed(error, errorBanner);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner getErrorBanner() {
                return this.errorBanner;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageFailed renamePackageFailed, com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    packageTrackingError = renamePackageFailed.error;
                }
                if ((i & 2) != 0) {
                    infoBanner = renamePackageFailed.errorBanner;
                }
                return renamePackageFailed.copy(packageTrackingError, infoBanner);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RenamePackageSheetDismissed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RenamePackageSheetDismissed extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSheetDismissed INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSheetDismissed();

            public final int hashCode() {
                return -198547066;
            }

            private RenamePackageSheetDismissed() {
                super("RenamePackageSheetDismissed", null);
            }

            public final java.lang.String toString() {
                return "RenamePackageSheetDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSheetDismissed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage$RefreshPackageDetailAfterRename;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$RenamePackage;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RefreshPackageDetailAfterRename extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RefreshPackageDetailAfterRename INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RefreshPackageDetailAfterRename();

            public final int hashCode() {
                return 1341456818;
            }

            private RefreshPackageDetailAfterRename() {
                super("RefreshPackageDetailAfterRename", null);
            }

            public final java.lang.String toString() {
                return "RefreshPackageDetailAfterRename";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RefreshPackageDetailAfterRename)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ RenamePackage(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "MarkAsDeliveredSheetShown", "MarkAsDeliveredButtonClicked", "MarkAsDeliveredSheetDismissed", "MarkAsDeliveredSuccess", "MarkAsDeliveredFailed", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredButtonClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredSheetDismissed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredSheetShown;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class MarkAsDelivered extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredSheetShown;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MarkAsDeliveredSheetShown extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSheetShown INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSheetShown();

            public final int hashCode() {
                return -1132115224;
            }

            private MarkAsDeliveredSheetShown() {
                super("MarkAsDeliveredSheetShown", null);
            }

            public final java.lang.String toString() {
                return "MarkAsDeliveredSheetShown";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSheetShown)) {
                    return false;
                }
                return true;
            }
        }

        private MarkAsDelivered(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredButtonClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MarkAsDeliveredButtonClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredButtonClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredButtonClicked();

            public final int hashCode() {
                return 1453967583;
            }

            private MarkAsDeliveredButtonClicked() {
                super("MarkAsDeliveredButtonClicked", null);
            }

            public final java.lang.String toString() {
                return "MarkAsDeliveredButtonClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredButtonClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredSheetDismissed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MarkAsDeliveredSheetDismissed extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSheetDismissed INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSheetDismissed();

            public final int hashCode() {
                return -1947449600;
            }

            private MarkAsDeliveredSheetDismissed() {
                super("MarkAsDeliveredSheetDismissed", null);
            }

            public final java.lang.String toString() {
                return "MarkAsDeliveredSheetDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSheetDismissed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "updatedDisplayData", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "getUpdatedDisplayData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MarkAsDeliveredSuccess extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData updatedDisplayData;

            public MarkAsDeliveredSuccess(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData) {
                super("MarkAsDeliveredSuccess", null);
                this.updatedDisplayData = packageDisplayData;
            }

            public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData getUpdatedDisplayData() {
                return this.updatedDisplayData;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData = this.updatedDisplayData;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkAsDeliveredSuccess(updatedDisplayData=");
                sb.append(packageDisplayData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData = this.updatedDisplayData;
                if (packageDisplayData == null) {
                    return 0;
                }
                return packageDisplayData.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatedDisplayData, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSuccess) other).updatedDisplayData);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSuccess copy(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData updatedDisplayData) {
                return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSuccess(updatedDisplayData);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData getUpdatedDisplayData() {
                return this.updatedDisplayData;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSuccess copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredSuccess markAsDeliveredSuccess, com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    packageDisplayData = markAsDeliveredSuccess.updatedDisplayData;
                }
                return markAsDeliveredSuccess.copy(packageDisplayData);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "errorBanner", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$MarkAsDelivered$MarkAsDeliveredFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "getErrorBanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MarkAsDeliveredFailed extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner errorBanner;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarkAsDeliveredFailed(com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner) {
                super("MarkAsDeliveredFailed", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoBanner, "");
                this.errorBanner = infoBanner;
            }

            public final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner getErrorBanner() {
                return this.errorBanner;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner = this.errorBanner;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkAsDeliveredFailed(errorBanner=");
                sb.append(infoBanner);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorBanner.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorBanner, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredFailed) other).errorBanner);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredFailed copy(com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner errorBanner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorBanner, "");
                return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredFailed(errorBanner);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner getErrorBanner() {
                return this.errorBanner;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredFailed markAsDeliveredFailed, com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    infoBanner = markAsDeliveredFailed.errorBanner;
                }
                return markAsDeliveredFailed.copy(infoBanner);
            }
        }

        public /* synthetic */ MarkAsDelivered(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$ErrorBannerShown;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBannerShown extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ErrorBannerShown INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ErrorBannerShown();

        public final int hashCode() {
            return 1057918147;
        }

        private ErrorBannerShown() {
            super("ErrorBannerShown", null);
        }

        public final java.lang.String toString() {
            return "ErrorBannerShown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ErrorBannerShown)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$CloseButtonClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseButtonClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CloseButtonClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CloseButtonClicked();

        public final int hashCode() {
            return 1193521827;
        }

        private CloseButtonClicked() {
            super("CloseButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "CloseButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CloseButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$ClosePackageDetailScreen;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePackageDetailScreen extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ClosePackageDetailScreen INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ClosePackageDetailScreen();

        public final int hashCode() {
            return -697802991;
        }

        private ClosePackageDetailScreen() {
            super("ClosePackageDetailScreen", null);
        }

        public final java.lang.String toString() {
            return "ClosePackageDetailScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ClosePackageDetailScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$ManageAmazonButtonClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ManageAmazonButtonClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ManageAmazonButtonClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ManageAmazonButtonClicked();

        public final int hashCode() {
            return 140252006;
        }

        private ManageAmazonButtonClicked() {
            super("ManageAmazonButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "ManageAmazonButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ManageAmazonButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingPreferencesClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingPreferencesClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferencesClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferencesClicked();

        public final int hashCode() {
            return -1646087952;
        }

        private AmazonTrackingPreferencesClicked() {
            super("AmazonTrackingPreferencesClicked", null);
        }

        public final java.lang.String toString() {
            return "AmazonTrackingPreferencesClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferencesClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingPreferenceLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "", "enabled", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingPreferenceLoaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingPreferenceLoaded extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final java.lang.Boolean enabled;

        public AmazonTrackingPreferenceLoaded(java.lang.Boolean bool) {
            super("AmazonTrackingPreferenceLoaded", null);
            this.enabled = bool;
        }

        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonTrackingPreferenceLoaded(enabled=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.enabled;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferenceLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.enabled, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferenceLoaded) other).enabled);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferenceLoaded copy(java.lang.Boolean enabled) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferenceLoaded(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferenceLoaded copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingPreferenceLoaded amazonTrackingPreferenceLoaded, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = amazonTrackingPreferenceLoaded.enabled;
            }
            return amazonTrackingPreferenceLoaded.copy(bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggle;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggle;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingToggle extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        private final boolean enabled;

        public AmazonTrackingToggle(boolean z) {
            super("AmazonTrackingToggle", null);
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonTrackingToggle(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggle) && this.enabled == ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggle) other).enabled;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggle copy(boolean enabled) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggle(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggle copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggle amazonTrackingToggle, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = amazonTrackingToggle.enabled;
            }
            return amazonTrackingToggle.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggleSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "", "confirmedValue", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggleSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getConfirmedValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingToggleSuccess extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final boolean confirmedValue;

        public AmazonTrackingToggleSuccess(boolean z) {
            super("AmazonTrackingToggleSuccess", null);
            this.confirmedValue = z;
        }

        public final boolean getConfirmedValue() {
            return this.confirmedValue;
        }

        public final java.lang.String toString() {
            boolean z = this.confirmedValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonTrackingToggleSuccess(confirmedValue=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.confirmedValue);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleSuccess) && this.confirmedValue == ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleSuccess) other).confirmedValue;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleSuccess copy(boolean confirmedValue) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleSuccess(confirmedValue);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getConfirmedValue() {
            return this.confirmedValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleSuccess copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleSuccess amazonTrackingToggleSuccess, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = amazonTrackingToggleSuccess.confirmedValue;
            }
            return amazonTrackingToggleSuccess.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggleFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "", "previousValue", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "errorBanner", "<init>", "(ZLcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "copy", "(ZLcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$AmazonTrackingToggleFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getPreviousValue", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/InfoBanner;", "getErrorBanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingToggleFailed extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner errorBanner;
        private final boolean previousValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmazonTrackingToggleFailed(boolean z, com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner) {
            super("AmazonTrackingToggleFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoBanner, "");
            this.previousValue = z;
            this.errorBanner = infoBanner;
        }

        public final boolean getPreviousValue() {
            return this.previousValue;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner getErrorBanner() {
            return this.errorBanner;
        }

        public final java.lang.String toString() {
            boolean z = this.previousValue;
            com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner = this.errorBanner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonTrackingToggleFailed(previousValue=");
            sb.append(z);
            sb.append(", errorBanner=");
            sb.append(infoBanner);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.previousValue) * 31) + this.errorBanner.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleFailed)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleFailed amazonTrackingToggleFailed = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleFailed) other;
            return this.previousValue == amazonTrackingToggleFailed.previousValue && kotlin.jvm.internal.Intrinsics.areEqual(this.errorBanner, amazonTrackingToggleFailed.errorBanner);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleFailed copy(boolean previousValue, com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner errorBanner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorBanner, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleFailed(previousValue, errorBanner);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner getErrorBanner() {
            return this.errorBanner;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPreviousValue() {
            return this.previousValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleFailed amazonTrackingToggleFailed, boolean z, com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = amazonTrackingToggleFailed.previousValue;
            }
            if ((i & 2) != 0) {
                infoBanner = amazonTrackingToggleFailed.errorBanner;
            }
            return amazonTrackingToggleFailed.copy(z, infoBanner);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageOptionsClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageOptionsClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageOptionsClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageOptionsClicked();

        public final int hashCode() {
            return -1406255447;
        }

        private PackageOptionsClicked() {
            super("PackageOptionsClicked", null);
        }

        public final java.lang.String toString() {
            return "PackageOptionsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageOptionsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PackageSettingsClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageSettingsClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageSettingsClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageSettingsClicked();

        public final int hashCode() {
            return 2002305924;
        }

        private PackageSettingsClicked() {
            super("PackageSettingsClicked", null);
        }

        public final java.lang.String toString() {
            return "PackageSettingsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageSettingsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$UnlinkBySystemBannerClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/ScreenEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$UnlinkBySystemBannerClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkBySystemBannerClicked extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.ScreenEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlinkBySystemBannerClicked(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super("UnlinkBySystemBannerClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnlinkBySystemBannerClicked(emailProvider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.UnlinkBySystemBannerClicked) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.UnlinkBySystemBannerClicked) other).emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.UnlinkBySystemBannerClicked copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.UnlinkBySystemBannerClicked(emailProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.UnlinkBySystemBannerClicked copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.UnlinkBySystemBannerClicked unlinkBySystemBannerClicked, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = unlinkBySystemBannerClicked.emailProvider;
            }
            return unlinkBySystemBannerClicked.copy(emailProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$NavigateToPackageSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPackageSettings extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettings INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettings();

        public final int hashCode() {
            return 1997790519;
        }

        private NavigateToPackageSettings() {
            super("NavigateToPackageSettings", null);
        }

        public final java.lang.String toString() {
            return "NavigateToPackageSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$NavigateToPackageSettingsForRelink;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$NavigateToPackageSettingsForRelink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPackageSettingsForRelink extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPackageSettingsForRelink(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super("NavigateToPackageSettingsForRelink", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPackageSettingsForRelink(emailProvider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettingsForRelink) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettingsForRelink) other).emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettingsForRelink copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettingsForRelink(emailProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettingsForRelink copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettingsForRelink navigateToPackageSettingsForRelink, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = navigateToPackageSettingsForRelink.emailProvider;
            }
            return navigateToPackageSettingsForRelink.copy(emailProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PayPalAccountEmailLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/InternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent$PayPalAccountEmailLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PayPalAccountEmailLoaded extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent implements com.paypal.oslo.feature.packagetracking.ui.detail.InternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

        public PayPalAccountEmailLoaded(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super("PayPalAccountEmailLoaded", null);
            this.emailProvider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalAccountEmailLoaded(emailProvider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            if (emailProvider == null) {
                return 0;
            }
            return emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PayPalAccountEmailLoaded) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PayPalAccountEmailLoaded) other).emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PayPalAccountEmailLoaded copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PayPalAccountEmailLoaded(emailProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PayPalAccountEmailLoaded copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PayPalAccountEmailLoaded payPalAccountEmailLoaded, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = payPalAccountEmailLoaded.emailProvider;
            }
            return payPalAccountEmailLoaded.copy(emailProvider);
        }
    }

    public /* synthetic */ PackageDetailEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
