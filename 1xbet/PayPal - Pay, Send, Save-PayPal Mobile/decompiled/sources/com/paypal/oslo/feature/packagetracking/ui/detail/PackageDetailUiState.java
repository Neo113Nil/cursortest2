package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Error;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Initial;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Loading;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PackageDetailUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PackageDetailUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Initial;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Initial INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Initial();

        public final int hashCode() {
            return 425335585;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Loading;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Loading INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Loading();

        public final int hashCode() {
            return -1186355943;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014Jd\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b\b\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b\t\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b\n\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b\f\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Success;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "displayData", "", "source", "", "showRemovePackage", "isRenameLoading", "isReloadingAfterRename", "isMarkAsDeliveredLoading", "amazonTrackingEnabled", "isTogglingAmazonPreference", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;Ljava/lang/String;ZZZZLjava/lang/Boolean;Z)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;Ljava/lang/String;ZZZZLjava/lang/Boolean;Z)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "getDisplayData", "Ljava/lang/String;", "getSource", "Z", "getShowRemovePackage", "Ljava/lang/Boolean;", "getAmazonTrackingEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState {
        public static final int $stable = 8;
        private final java.lang.Boolean amazonTrackingEnabled;
        private final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData displayData;
        private final boolean isMarkAsDeliveredLoading;
        private final boolean isReloadingAfterRename;
        private final boolean isRenameLoading;
        private final boolean isTogglingAmazonPreference;
        private final boolean showRemovePackage;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Boolean bool, boolean z5) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageDisplayData, "");
            this.displayData = packageDisplayData;
            this.source = str;
            this.showRemovePackage = z;
            this.isRenameLoading = z2;
            this.isReloadingAfterRename = z3;
            this.isMarkAsDeliveredLoading = z4;
            this.amazonTrackingEnabled = bool;
            this.isTogglingAmazonPreference = z5;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Boolean bool, boolean z5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(packageDisplayData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) == 0 ? bool : null, (i & 128) == 0 ? z5 : false);
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData getDisplayData() {
            return this.displayData;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final boolean getShowRemovePackage() {
            return this.showRemovePackage;
        }

        public final boolean isRenameLoading() {
            return this.isRenameLoading;
        }

        public final boolean isReloadingAfterRename() {
            return this.isReloadingAfterRename;
        }

        public final boolean isMarkAsDeliveredLoading() {
            return this.isMarkAsDeliveredLoading;
        }

        public final java.lang.Boolean getAmazonTrackingEnabled() {
            return this.amazonTrackingEnabled;
        }

        public final boolean isTogglingAmazonPreference() {
            return this.isTogglingAmazonPreference;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData packageDisplayData = this.displayData;
            java.lang.String str = this.source;
            boolean z = this.showRemovePackage;
            boolean z2 = this.isRenameLoading;
            boolean z3 = this.isReloadingAfterRename;
            boolean z4 = this.isMarkAsDeliveredLoading;
            java.lang.Boolean bool = this.amazonTrackingEnabled;
            boolean z5 = this.isTogglingAmazonPreference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(displayData=");
            sb.append(packageDisplayData);
            sb.append(", source=");
            sb.append(str);
            sb.append(", showRemovePackage=");
            sb.append(z);
            sb.append(", isRenameLoading=");
            sb.append(z2);
            sb.append(", isReloadingAfterRename=");
            sb.append(z3);
            sb.append(", isMarkAsDeliveredLoading=");
            sb.append(z4);
            sb.append(", amazonTrackingEnabled=");
            sb.append(bool);
            sb.append(", isTogglingAmazonPreference=");
            sb.append(z5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.displayData.hashCode();
            java.lang.String str = this.source;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.showRemovePackage);
            int hashCode4 = java.lang.Boolean.hashCode(this.isRenameLoading);
            int hashCode5 = java.lang.Boolean.hashCode(this.isReloadingAfterRename);
            int hashCode6 = java.lang.Boolean.hashCode(this.isMarkAsDeliveredLoading);
            java.lang.Boolean bool = this.amazonTrackingEnabled;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isTogglingAmazonPreference);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success success = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.displayData, success.displayData) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, success.source) && this.showRemovePackage == success.showRemovePackage && this.isRenameLoading == success.isRenameLoading && this.isReloadingAfterRename == success.isReloadingAfterRename && this.isMarkAsDeliveredLoading == success.isMarkAsDeliveredLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.amazonTrackingEnabled, success.amazonTrackingEnabled) && this.isTogglingAmazonPreference == success.isTogglingAmazonPreference;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success copy(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData displayData, java.lang.String source, boolean showRemovePackage, boolean isRenameLoading, boolean isReloadingAfterRename, boolean isMarkAsDeliveredLoading, java.lang.Boolean amazonTrackingEnabled, boolean isTogglingAmazonPreference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayData, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success(displayData, source, showRemovePackage, isRenameLoading, isReloadingAfterRename, isMarkAsDeliveredLoading, amazonTrackingEnabled, isTogglingAmazonPreference);
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsTogglingAmazonPreference() {
            return this.isTogglingAmazonPreference;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Boolean getAmazonTrackingEnabled() {
            return this.amazonTrackingEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsMarkAsDeliveredLoading() {
            return this.isMarkAsDeliveredLoading;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsReloadingAfterRename() {
            return this.isReloadingAfterRename;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsRenameLoading() {
            return this.isRenameLoading;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowRemovePackage() {
            return this.showRemovePackage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData getDisplayData() {
            return this.displayData;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Error;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "errorTitle", "errorMessage", "", "canRetry", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Z)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Z)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getErrorTitle", "getErrorMessage", "Z", "getCanRetry"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState {
        public static final int $stable = 0;
        private final boolean canRetry;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, boolean z) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.errorTitle = uiString;
            this.errorMessage = uiString2;
            this.canRetry = z;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(uiString, uiString2, (i & 4) != 0 ? true : z);
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.errorTitle;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.errorMessage;
            boolean z = this.canRetry;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorTitle=");
            sb.append(uiString);
            sb.append(", errorMessage=");
            sb.append(uiString2);
            sb.append(", canRetry=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorTitle.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + java.lang.Boolean.hashCode(this.canRetry);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Error error = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorTitle, error.errorTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && this.canRetry == error.canRetry;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Error copy(com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle, com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage, boolean canRetry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Error(errorTitle, errorMessage, canRetry);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Error copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Error error, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = error.errorTitle;
            }
            if ((i & 2) != 0) {
                uiString2 = error.errorMessage;
            }
            if ((i & 4) != 0) {
                z = error.canRetry;
            }
            return error.copy(uiString, uiString2, z);
        }
    }

    public /* synthetic */ PackageDetailUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
