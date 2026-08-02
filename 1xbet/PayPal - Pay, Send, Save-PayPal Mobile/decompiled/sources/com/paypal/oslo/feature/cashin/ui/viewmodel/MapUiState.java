package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010#J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010#J\u0010\u0010-\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b0\u00101JÂ\u0001\u00102\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b7\u0010/J\u0010\u00108\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b8\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b=\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010!R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\b\n\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010%R\u001a\u0010\r\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\b\r\u0010#R\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\b\u000e\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bC\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bD\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bE\u0010%R\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\b\u0012\u0010#R\u001a\u0010\u0013\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bF\u0010#R\u001a\u0010\u0014\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bG\u0010#R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bI\u0010/R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bK\u00101"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapUiState;", "", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "locations", "userLocation", "selectedLocation", "Lcom/google/android/gms/maps/model/LatLng;", "initialCameraPosition", "", "isLoading", "", "error", "isSheetVisible", "isSheetExpanded", "selectedStore", "searchResult", "searchError", "isSearching", "showNothingNearbyDialog", "showErrorHalfSheet", "", "errorRetryCount", "", "errorEventId", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lcom/google/android/gms/maps/model/LatLng;ZLjava/lang/String;ZZLcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;ZZZIJ)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "component3", "component4", "()Lcom/google/android/gms/maps/model/LatLng;", "component5", "()Z", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()I", "component16", "()J", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lcom/google/android/gms/maps/model/LatLng;ZLjava/lang/String;ZZLcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;ZZZIJ)Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/util/List;", "getLocations", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "getUserLocation", "getSelectedLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getInitialCameraPosition", "Z", "Ljava/lang/String;", "getError", "getSelectedStore", "getSearchResult", "getSearchError", "getShowNothingNearbyDialog", "getShowErrorHalfSheet", com.visa.cbp.getEncExpo.warmup, "getErrorRetryCount", "J", "getErrorEventId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MapUiState {
    public static final int $stable = 8;
    private final java.lang.String error;
    private final long errorEventId;
    private final int errorRetryCount;
    private final com.google.android.gms.maps.model.LatLng initialCameraPosition;
    private final boolean isLoading;
    private final boolean isSearching;
    private final boolean isSheetExpanded;
    private final boolean isSheetVisible;
    private final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> locations;
    private final java.lang.String searchError;
    private final com.google.android.gms.maps.model.LatLng searchResult;
    private final com.paypal.oslo.feature.cashin.domain.model.CashInStore selectedLocation;
    private final com.paypal.oslo.feature.cashin.domain.model.CashInStore selectedStore;
    private final boolean showErrorHalfSheet;
    private final boolean showNothingNearbyDialog;
    private final com.paypal.oslo.feature.cashin.domain.model.CashInStore userLocation;

    public MapUiState(java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> list, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore2, com.google.android.gms.maps.model.LatLng latLng, boolean z, java.lang.String str, boolean z2, boolean z3, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore3, com.google.android.gms.maps.model.LatLng latLng2, java.lang.String str2, boolean z4, boolean z5, boolean z6, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        this.locations = list;
        this.userLocation = cashInStore;
        this.selectedLocation = cashInStore2;
        this.initialCameraPosition = latLng;
        this.isLoading = z;
        this.error = str;
        this.isSheetVisible = z2;
        this.isSheetExpanded = z3;
        this.selectedStore = cashInStore3;
        this.searchResult = latLng2;
        this.searchError = str2;
        this.isSearching = z4;
        this.showNothingNearbyDialog = z5;
        this.showErrorHalfSheet = z6;
        this.errorRetryCount = i;
        this.errorEventId = j;
    }

    public /* synthetic */ MapUiState(java.util.List list, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore2, com.google.android.gms.maps.model.LatLng latLng, boolean z, java.lang.String str, boolean z2, boolean z3, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore3, com.google.android.gms.maps.model.LatLng latLng2, java.lang.String str2, boolean z4, boolean z5, boolean z6, int i, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? null : cashInStore, (i2 & 4) != 0 ? null : cashInStore2, (i2 & 8) != 0 ? new com.google.android.gms.maps.model.LatLng(30.3515d, -97.7553d) : latLng, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? null : str, (i2 & 64) == 0 ? z2 : true, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? null : cashInStore3, (i2 & 512) != 0 ? null : latLng2, (i2 & 1024) == 0 ? str2 : null, (i2 & 2048) != 0 ? false : z4, (i2 & 4096) != 0 ? false : z5, (i2 & 8192) != 0 ? false : z6, (i2 & 16384) != 0 ? 0 : i, (i2 & 32768) != 0 ? 0L : j);
    }

    public final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> getLocations() {
        return this.locations;
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInStore getUserLocation() {
        return this.userLocation;
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInStore getSelectedLocation() {
        return this.selectedLocation;
    }

    public final com.google.android.gms.maps.model.LatLng getInitialCameraPosition() {
        return this.initialCameraPosition;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final boolean isSheetVisible() {
        return this.isSheetVisible;
    }

    public final boolean isSheetExpanded() {
        return this.isSheetExpanded;
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInStore getSelectedStore() {
        return this.selectedStore;
    }

    public final com.google.android.gms.maps.model.LatLng getSearchResult() {
        return this.searchResult;
    }

    public final java.lang.String getSearchError() {
        return this.searchError;
    }

    public final boolean isSearching() {
        return this.isSearching;
    }

    public final boolean getShowNothingNearbyDialog() {
        return this.showNothingNearbyDialog;
    }

    public final boolean getShowErrorHalfSheet() {
        return this.showErrorHalfSheet;
    }

    public final int getErrorRetryCount() {
        return this.errorRetryCount;
    }

    public final long getErrorEventId() {
        return this.errorEventId;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> list = this.locations;
        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore = this.userLocation;
        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore2 = this.selectedLocation;
        com.google.android.gms.maps.model.LatLng latLng = this.initialCameraPosition;
        boolean z = this.isLoading;
        java.lang.String str = this.error;
        boolean z2 = this.isSheetVisible;
        boolean z3 = this.isSheetExpanded;
        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore3 = this.selectedStore;
        com.google.android.gms.maps.model.LatLng latLng2 = this.searchResult;
        java.lang.String str2 = this.searchError;
        boolean z4 = this.isSearching;
        boolean z5 = this.showNothingNearbyDialog;
        boolean z6 = this.showErrorHalfSheet;
        int i = this.errorRetryCount;
        long j = this.errorEventId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapUiState(locations=");
        sb.append(list);
        sb.append(", userLocation=");
        sb.append(cashInStore);
        sb.append(", selectedLocation=");
        sb.append(cashInStore2);
        sb.append(", initialCameraPosition=");
        sb.append(latLng);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", error=");
        sb.append(str);
        sb.append(", isSheetVisible=");
        sb.append(z2);
        sb.append(", isSheetExpanded=");
        sb.append(z3);
        sb.append(", selectedStore=");
        sb.append(cashInStore3);
        sb.append(", searchResult=");
        sb.append(latLng2);
        sb.append(", searchError=");
        sb.append(str2);
        sb.append(", isSearching=");
        sb.append(z4);
        sb.append(", showNothingNearbyDialog=");
        sb.append(z5);
        sb.append(", showErrorHalfSheet=");
        sb.append(z6);
        sb.append(", errorRetryCount=");
        sb.append(i);
        sb.append(", errorEventId=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.locations.hashCode();
        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore = this.userLocation;
        int hashCode2 = cashInStore == null ? 0 : cashInStore.hashCode();
        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore2 = this.selectedLocation;
        int hashCode3 = cashInStore2 == null ? 0 : cashInStore2.hashCode();
        int hashCode4 = this.initialCameraPosition.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isLoading);
        java.lang.String str = this.error;
        int hashCode6 = str == null ? 0 : str.hashCode();
        int hashCode7 = java.lang.Boolean.hashCode(this.isSheetVisible);
        int hashCode8 = java.lang.Boolean.hashCode(this.isSheetExpanded);
        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore3 = this.selectedStore;
        int hashCode9 = cashInStore3 == null ? 0 : cashInStore3.hashCode();
        com.google.android.gms.maps.model.LatLng latLng = this.searchResult;
        int hashCode10 = latLng == null ? 0 : latLng.hashCode();
        java.lang.String str2 = this.searchError;
        return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isSearching)) * 31) + java.lang.Boolean.hashCode(this.showNothingNearbyDialog)) * 31) + java.lang.Boolean.hashCode(this.showErrorHalfSheet)) * 31) + java.lang.Integer.hashCode(this.errorRetryCount)) * 31) + java.lang.Long.hashCode(this.errorEventId);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState mapUiState = (com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.locations, mapUiState.locations) && kotlin.jvm.internal.Intrinsics.areEqual(this.userLocation, mapUiState.userLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedLocation, mapUiState.selectedLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialCameraPosition, mapUiState.initialCameraPosition) && this.isLoading == mapUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.error, mapUiState.error) && this.isSheetVisible == mapUiState.isSheetVisible && this.isSheetExpanded == mapUiState.isSheetExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedStore, mapUiState.selectedStore) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchResult, mapUiState.searchResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchError, mapUiState.searchError) && this.isSearching == mapUiState.isSearching && this.showNothingNearbyDialog == mapUiState.showNothingNearbyDialog && this.showErrorHalfSheet == mapUiState.showErrorHalfSheet && this.errorRetryCount == mapUiState.errorRetryCount && this.errorEventId == mapUiState.errorEventId;
    }

    public final com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy(java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> locations, com.paypal.oslo.feature.cashin.domain.model.CashInStore userLocation, com.paypal.oslo.feature.cashin.domain.model.CashInStore selectedLocation, com.google.android.gms.maps.model.LatLng initialCameraPosition, boolean isLoading, java.lang.String error, boolean isSheetVisible, boolean isSheetExpanded, com.paypal.oslo.feature.cashin.domain.model.CashInStore selectedStore, com.google.android.gms.maps.model.LatLng searchResult, java.lang.String searchError, boolean isSearching, boolean showNothingNearbyDialog, boolean showErrorHalfSheet, int errorRetryCount, long errorEventId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialCameraPosition, "");
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState(locations, userLocation, selectedLocation, initialCameraPosition, isLoading, error, isSheetVisible, isSheetExpanded, selectedStore, searchResult, searchError, isSearching, showNothingNearbyDialog, showErrorHalfSheet, errorRetryCount, errorEventId);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.cashin.domain.model.CashInStore getSelectedStore() {
        return this.selectedStore;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSheetExpanded() {
        return this.isSheetExpanded;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSheetVisible() {
        return this.isSheetVisible;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final com.google.android.gms.maps.model.LatLng getInitialCameraPosition() {
        return this.initialCameraPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cashin.domain.model.CashInStore getSelectedLocation() {
        return this.selectedLocation;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cashin.domain.model.CashInStore getUserLocation() {
        return this.userLocation;
    }

    /* renamed from: component16, reason: from getter */
    public final long getErrorEventId() {
        return this.errorEventId;
    }

    /* renamed from: component15, reason: from getter */
    public final int getErrorRetryCount() {
        return this.errorRetryCount;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowErrorHalfSheet() {
        return this.showErrorHalfSheet;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowNothingNearbyDialog() {
        return this.showNothingNearbyDialog;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSearching() {
        return this.isSearching;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getSearchError() {
        return this.searchError;
    }

    /* renamed from: component10, reason: from getter */
    public final com.google.android.gms.maps.model.LatLng getSearchResult() {
        return this.searchResult;
    }

    public final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> component1() {
        return this.locations;
    }

    public MapUiState() {
        this(null, null, null, null, false, null, false, false, null, null, null, false, false, false, 0, 0L, 65535, null);
    }
}
