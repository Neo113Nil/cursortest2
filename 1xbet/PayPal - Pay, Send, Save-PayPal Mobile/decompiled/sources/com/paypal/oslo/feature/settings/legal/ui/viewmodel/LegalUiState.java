package com.paypal.oslo.feature.settings.legal.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState;", "", "Loading", "Success", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState$Loading;", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface LegalUiState {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState$Loading;", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Loading(java.lang.String str) {
            this.message = str;
        }

        public /* synthetic */ Loading(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(message=");
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
            return (other instanceof com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Loading) other).message);
        }

        public final com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Loading copy(java.lang.String message) {
            return new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Loading(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Loading copy$default(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Loading loading, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loading.message;
            }
            return loading.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState$Success;", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState;", "", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "items", "", "showFooter", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "Z", "getShowFooter"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> items;
        private final boolean showFooter;

        public Success(java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> list, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
            this.showFooter = z;
        }

        public /* synthetic */ Success(java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z);
        }

        public final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> getItems() {
            return this.items;
        }

        public final boolean getShowFooter() {
            return this.showFooter;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> list = this.items;
            boolean z = this.showFooter;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(items=");
            sb.append(list);
            sb.append(", showFooter=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.items.hashCode() * 31) + java.lang.Boolean.hashCode(this.showFooter);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Success success = (com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.items, success.items) && this.showFooter == success.showFooter;
        }

        public final com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Success copy(java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> items, boolean showFooter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Success(items, showFooter);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowFooter() {
            return this.showFooter;
        }

        public final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Success copy$default(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalUiState.Success success, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.items;
            }
            if ((i & 2) != 0) {
                z = success.showFooter;
            }
            return success.copy(list, z);
        }
    }
}
