package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0005R/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/TaxOptionState;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "taxOption", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)V", "newTaxOption", "", "updateTaxOption", "<set-?>", "taxOption$delegate", "Landroidx/compose/runtime/MutableState;", "getTaxOption", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "setTaxOption", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TaxOptionState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState, ?> Saver = androidx.compose.runtime.saveable.MapSaverKt.mapSaver(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState.m13048$r8$lambda$ePHwx_9pvrlZcLvwrolssudeYQ((androidx.compose.runtime.saveable.SaverScope) obj, (com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState) obj2);
        }
    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState.$r8$lambda$IQCAppFzUFABJCuo7eCq9ITHeYc((java.util.Map) obj);
        }
    });

    /* renamed from: taxOption$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState taxOption;

    public TaxOptionState(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        this.taxOption = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(taxOption, null, 2, null);
    }

    private final void setTaxOption(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        this.taxOption.setValue(taxOption);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTaxOption() {
        return (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) this.taxOption.getValue();
    }

    public final void updateTaxOption(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption newTaxOption) {
        setTaxOption(newTaxOption);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/TaxOptionState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/TaxOptionState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState, ?> getSaver() {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState $r8$lambda$IQCAppFzUFABJCuo7eCq9ITHeYc(java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        if (map.isEmpty()) {
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState(null);
        }
        java.lang.Object obj = map.get("id");
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object obj2 = map.get("label");
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        java.lang.Object obj3 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState(new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption((java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Double) obj3).doubleValue()));
    }

    /* renamed from: $r8$lambda$ePHwx_9pvrlZcLvwrolssu-deYQ, reason: not valid java name */
    public static /* synthetic */ java.util.Map m13048$r8$lambda$ePHwx_9pvrlZcLvwrolssudeYQ(androidx.compose.runtime.saveable.SaverScope saverScope, com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState taxOptionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saverScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOptionState, "");
        com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = taxOptionState.getTaxOption();
        java.util.Map mapOf = taxOption != null ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", taxOption.getId()), kotlin.TuplesKt.to("label", taxOption.getLabel()), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Double.valueOf(taxOption.getValue()))) : null;
        return mapOf == null ? kotlin.collections.MapsKt.emptyMap() : mapOf;
    }
}
