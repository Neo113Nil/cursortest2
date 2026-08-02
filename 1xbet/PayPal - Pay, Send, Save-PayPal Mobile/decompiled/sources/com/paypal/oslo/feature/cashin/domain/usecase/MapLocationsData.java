package com.paypal.oslo.feature.cashin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJF\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u001e\b\u0002\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR0\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/usecase/MapLocationsData;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "locationsFlow", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "getUserLocation", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlinx/coroutines/flow/Flow;", "component2", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/cashin/domain/usecase/MapLocationsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/Flow;", "getLocationsFlow", "Lkotlin/jvm/functions/Function1;", "getGetUserLocation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MapLocationsData {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore>, java.lang.Object> getUserLocation;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> locationsFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public MapLocationsData(kotlinx.coroutines.flow.Flow<? extends java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> flow, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore>, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.locationsFlow = flow;
        this.getUserLocation = function1;
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> getLocationsFlow() {
        return this.locationsFlow;
    }

    public final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore>, java.lang.Object> getGetUserLocation() {
        return this.getUserLocation;
    }

    public final java.lang.String toString() {
        kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> flow = this.locationsFlow;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore>, java.lang.Object> function1 = this.getUserLocation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapLocationsData(locationsFlow=");
        sb.append(flow);
        sb.append(", getUserLocation=");
        sb.append(function1);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.locationsFlow.hashCode() * 31) + this.getUserLocation.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData mapLocationsData = (com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.locationsFlow, mapLocationsData.locationsFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.getUserLocation, mapLocationsData.getUserLocation);
    }

    public final com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData copy(kotlinx.coroutines.flow.Flow<? extends java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> locationsFlow, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore>, ? extends java.lang.Object> getUserLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationsFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserLocation, "");
        return new com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData(locationsFlow, getUserLocation);
    }

    public final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore>, java.lang.Object> component2() {
        return this.getUserLocation;
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> component1() {
        return this.locationsFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData copy$default(com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData mapLocationsData, kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            flow = mapLocationsData.locationsFlow;
        }
        if ((i & 2) != 0) {
            function1 = mapLocationsData.getUserLocation;
        }
        return mapLocationsData.copy(flow, function1);
    }
}
