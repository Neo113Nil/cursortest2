package com.paypal.oslo.feature.consumerprivacy.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState;", "", "Loading", "Content", "Error", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ConnectedAppsAndSitesUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Loading;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Loading INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Loading();

        public final int hashCode() {
            return 197241861;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0013R\u0011\u0010&\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState;", "", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;", "usingPayPalInfoApps", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", "sharingInfoWithPayPalApps", "", "isRemoving", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "banner", "<init>", "(Ljava/util/List;Ljava/util/List;ZLcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "copy", "(Ljava/util/List;Ljava/util/List;ZLcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Content;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getUsingPayPalInfoApps", "getSharingInfoWithPayPalApps", "Z", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "getBanner", "isEmpty"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult banner;
        private final boolean isRemoving;
        private final java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem> sharingInfoWithPayPalApps;
        private final java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem> usingPayPalInfoApps;

        public Content(java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem> list, java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem> list2, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult connectedAppsOperationResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.usingPayPalInfoApps = list;
            this.sharingInfoWithPayPalApps = list2;
            this.isRemoving = z;
            this.banner = connectedAppsOperationResult;
        }

        public /* synthetic */ Content(java.util.List list, java.util.List list2, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult connectedAppsOperationResult, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : connectedAppsOperationResult);
        }

        public final java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem> getUsingPayPalInfoApps() {
            return this.usingPayPalInfoApps;
        }

        public final java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem> getSharingInfoWithPayPalApps() {
            return this.sharingInfoWithPayPalApps;
        }

        public final boolean isRemoving() {
            return this.isRemoving;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult getBanner() {
            return this.banner;
        }

        public final boolean isEmpty() {
            return this.usingPayPalInfoApps.isEmpty() && this.sharingInfoWithPayPalApps.isEmpty();
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem> list = this.usingPayPalInfoApps;
            java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem> list2 = this.sharingInfoWithPayPalApps;
            boolean z = this.isRemoving;
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult connectedAppsOperationResult = this.banner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(usingPayPalInfoApps=");
            sb.append(list);
            sb.append(", sharingInfoWithPayPalApps=");
            sb.append(list2);
            sb.append(", isRemoving=");
            sb.append(z);
            sb.append(", banner=");
            sb.append(connectedAppsOperationResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.usingPayPalInfoApps.hashCode();
            int hashCode2 = this.sharingInfoWithPayPalApps.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.isRemoving);
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult connectedAppsOperationResult = this.banner;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (connectedAppsOperationResult == null ? 0 : connectedAppsOperationResult.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content = (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.usingPayPalInfoApps, content.usingPayPalInfoApps) && kotlin.jvm.internal.Intrinsics.areEqual(this.sharingInfoWithPayPalApps, content.sharingInfoWithPayPalApps) && this.isRemoving == content.isRemoving && kotlin.jvm.internal.Intrinsics.areEqual(this.banner, content.banner);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy(java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem> usingPayPalInfoApps, java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem> sharingInfoWithPayPalApps, boolean isRemoving, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult banner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usingPayPalInfoApps, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoWithPayPalApps, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(usingPayPalInfoApps, sharingInfoWithPayPalApps, isRemoving, banner);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult getBanner() {
            return this.banner;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRemoving() {
            return this.isRemoving;
        }

        public final java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem> component2() {
            return this.sharingInfoWithPayPalApps;
        }

        public final java.util.List<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem> component1() {
            return this.usingPayPalInfoApps;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content, java.util.List list, java.util.List list2, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult connectedAppsOperationResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = content.usingPayPalInfoApps;
            }
            if ((i & 2) != 0) {
                list2 = content.sharingInfoWithPayPalApps;
            }
            if ((i & 4) != 0) {
                z = content.isRemoving;
            }
            if ((i & 8) != 0) {
                connectedAppsOperationResult = content.banner;
            }
            return content.copy(list, list2, z, connectedAppsOperationResult);
        }

        public Content() {
            this(null, null, false, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Error(java.lang.String str) {
            this.message = str;
        }

        public /* synthetic */ Error(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error copy(java.lang.String message) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
