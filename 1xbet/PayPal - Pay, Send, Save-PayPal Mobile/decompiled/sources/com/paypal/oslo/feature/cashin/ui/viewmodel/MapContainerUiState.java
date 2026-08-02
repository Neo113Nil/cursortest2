package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapContainerUiState;", "", "", "selectedTab", "", "isSearchActive", "", "searchQuery", "<init>", "(IZLjava/lang/String;)V", "component1", "()I", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(IZLjava/lang/String;)Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapContainerUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getSelectedTab", "Z", "Ljava/lang/String;", "getSearchQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MapContainerUiState {
    public static final int $stable = 0;
    private final boolean isSearchActive;
    private final java.lang.String searchQuery;
    private final int selectedTab;

    public MapContainerUiState(int i, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.selectedTab = i;
        this.isSearchActive = z;
        this.searchQuery = str;
    }

    public final int getSelectedTab() {
        return this.selectedTab;
    }

    public final boolean isSearchActive() {
        return this.isSearchActive;
    }

    public /* synthetic */ MapContainerUiState(int i, boolean z, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str);
    }

    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public final java.lang.String toString() {
        int i = this.selectedTab;
        boolean z = this.isSearchActive;
        java.lang.String str = this.searchQuery;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapContainerUiState(selectedTab=");
        sb.append(i);
        sb.append(", isSearchActive=");
        sb.append(z);
        sb.append(", searchQuery=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.selectedTab) * 31) + java.lang.Boolean.hashCode(this.isSearchActive)) * 31) + this.searchQuery.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState mapContainerUiState = (com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState) other;
        return this.selectedTab == mapContainerUiState.selectedTab && this.isSearchActive == mapContainerUiState.isSearchActive && kotlin.jvm.internal.Intrinsics.areEqual(this.searchQuery, mapContainerUiState.searchQuery);
    }

    public final com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState copy(int selectedTab, boolean isSearchActive, java.lang.String searchQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQuery, "");
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState(selectedTab, isSearchActive, searchQuery);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    /* renamed from: component1, reason: from getter */
    public final int getSelectedTab() {
        return this.selectedTab;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState copy$default(com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState mapContainerUiState, int i, boolean z, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = mapContainerUiState.selectedTab;
        }
        if ((i2 & 2) != 0) {
            z = mapContainerUiState.isSearchActive;
        }
        if ((i2 & 4) != 0) {
            str = mapContainerUiState.searchQuery;
        }
        return mapContainerUiState.copy(i, z, str);
    }

    public MapContainerUiState() {
        this(0, false, null, 7, null);
    }
}
