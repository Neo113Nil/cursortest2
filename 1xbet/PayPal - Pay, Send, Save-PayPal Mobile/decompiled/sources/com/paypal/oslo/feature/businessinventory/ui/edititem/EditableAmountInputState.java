package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0003\u001a\u00020\u00028GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\fR/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00058G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010 \u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableAmountInputState;", "", "", "currencyCode", "label", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "updateValue", "(Ljava/lang/String;)V", "currencyCode$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrencyCode", "()Ljava/lang/String;", "<set-?>", "label$delegate", "getLabel", "setLabel", "value$delegate", "getValue", "()Ljava/lang/Long;", "setValue", "(Ljava/lang/Long;)V", "", "modified$delegate", "getModified", "()Z", "setModified", "(Z)V", "modified", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditableAmountInputState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState.$r8$lambda$2FmHmasE5rW1pY50xiQcpTknQ8Q((androidx.compose.runtime.saveable.SaverScope) obj, (com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState) obj2);
        }
    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState.$r8$lambda$_FNehnpOqDGHsdf8fdXjeKw_90E((java.util.List) obj);
        }
    });

    /* renamed from: currencyCode$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currencyCode;

    /* renamed from: label$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState label;

    /* renamed from: modified$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState modified;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;

    public EditableAmountInputState(java.lang.String str, java.lang.String str2, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.currencyCode = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
        this.label = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
        this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(l, null, 2, null);
        this.modified = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getCurrencyCode() {
        return (java.lang.String) this.currencyCode.getValue();
    }

    private final void setLabel(java.lang.String str) {
        this.label.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getLabel() {
        return (java.lang.String) this.label.getValue();
    }

    private final void setValue(java.lang.Long l) {
        this.value.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Long getValue() {
        return (java.lang.Long) this.value.getValue();
    }

    public final void updateValue(java.lang.String newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "");
        long longOrNull = kotlin.text.StringsKt.toLongOrNull(newValue);
        if (longOrNull == null) {
            longOrNull = 0L;
        }
        setValue(longOrNull);
        setModified(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getModified() {
        return ((java.lang.Boolean) this.modified.getValue()).booleanValue();
    }

    public final void setModified(boolean z) {
        this.modified.setValue(java.lang.Boolean.valueOf(z));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableAmountInputState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableAmountInputState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState, ?> getSaver() {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.util.List $r8$lambda$2FmHmasE5rW1pY50xiQcpTknQ8Q(androidx.compose.runtime.saveable.SaverScope saverScope, com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState editableAmountInputState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saverScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editableAmountInputState, "");
        return kotlin.collections.CollectionsKt.listOf(editableAmountInputState.getCurrencyCode(), editableAmountInputState.getLabel(), editableAmountInputState.getValue());
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState $r8$lambda$_FNehnpOqDGHsdf8fdXjeKw_90E(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object obj = list.get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState((java.lang.String) obj, (java.lang.String) list.get(1), (java.lang.Long) list.get(2));
    }
}
