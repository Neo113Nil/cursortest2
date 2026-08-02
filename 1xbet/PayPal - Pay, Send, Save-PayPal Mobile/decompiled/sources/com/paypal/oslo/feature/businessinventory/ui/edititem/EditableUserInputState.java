package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u000bR+\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u000bR+\u0010\u001b\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableUserInputState;", "", "", "label", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "prefix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "updateValue", "(Ljava/lang/String;)V", "<set-?>", "label$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "setLabel", "value$delegate", "getValue", "setValue", "", "modified$delegate", "getModified", "()Z", "setModified", "(Z)V", "modified", "prefix$delegate", "getPrefix", "setPrefix", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditableUserInputState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState.$r8$lambda$D5UhTiFkAp8B6FpzoluxeBCw81M((androidx.compose.runtime.saveable.SaverScope) obj, (com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState) obj2);
        }
    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState.$r8$lambda$Gy1KHDCH_Kp1nJUgmQkaUTZ9gYc((java.util.List) obj);
        }
    });

    /* renamed from: label$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState label;

    /* renamed from: modified$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState modified;

    /* renamed from: prefix$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState prefix;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;

    public EditableUserInputState(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.label = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
        this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
        this.modified = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.prefix = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str3, null, 2, null);
    }

    private final void setLabel(java.lang.String str) {
        this.label.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getLabel() {
        return (java.lang.String) this.label.getValue();
    }

    private final void setValue(java.lang.String str) {
        this.value.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getValue() {
        return (java.lang.String) this.value.getValue();
    }

    public final void updateValue(java.lang.String newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "");
        setValue(newValue);
        setModified(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getModified() {
        return ((java.lang.Boolean) this.modified.getValue()).booleanValue();
    }

    public final void setModified(boolean z) {
        this.modified.setValue(java.lang.Boolean.valueOf(z));
    }

    private final void setPrefix(java.lang.String str) {
        this.prefix.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getPrefix() {
        return (java.lang.String) this.prefix.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableUserInputState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableUserInputState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState, ?> getSaver() {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.util.List $r8$lambda$D5UhTiFkAp8B6FpzoluxeBCw81M(androidx.compose.runtime.saveable.SaverScope saverScope, com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState editableUserInputState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saverScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editableUserInputState, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{editableUserInputState.getLabel(), editableUserInputState.getValue(), editableUserInputState.getPrefix()});
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState $r8$lambda$Gy1KHDCH_Kp1nJUgmQkaUTZ9gYc(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.String str = (java.lang.String) list.get(0);
        java.lang.String str2 = (java.lang.String) list.get(1);
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState(str, str2 != null ? str2 : "", (java.lang.String) list.get(2));
    }
}
