package com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/NonRecoverableScreenActions;", "", "Lkotlin/Function0;", "", "onNonRecoverableOkClick", "onBackPressIntercept", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "copy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/NonRecoverableScreenActions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getOnNonRecoverableOkClick", "getOnBackPressIntercept"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NonRecoverableScreenActions {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressIntercept;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNonRecoverableOkClick;

    public NonRecoverableScreenActions(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.onNonRecoverableOkClick = function0;
        this.onBackPressIntercept = function02;
    }

    public /* synthetic */ NonRecoverableScreenActions(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 2) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function02);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNonRecoverableOkClick() {
        return this.onNonRecoverableOkClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackPressIntercept() {
        return this.onBackPressIntercept;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onNonRecoverableOkClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onBackPressIntercept;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NonRecoverableScreenActions(onNonRecoverableOkClick=");
        sb.append(function0);
        sb.append(", onBackPressIntercept=");
        sb.append(function02);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.onNonRecoverableOkClick.hashCode() * 31) + this.onBackPressIntercept.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions = (com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onNonRecoverableOkClick, nonRecoverableScreenActions.onNonRecoverableOkClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBackPressIntercept, nonRecoverableScreenActions.onBackPressIntercept);
    }

    public final com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions copy(kotlin.jvm.functions.Function0<kotlin.Unit> onNonRecoverableOkClick, kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressIntercept) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNonRecoverableOkClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressIntercept, "");
        return new com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions(onNonRecoverableOkClick, onBackPressIntercept);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onBackPressIntercept;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
        return this.onNonRecoverableOkClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions copy$default(com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = nonRecoverableScreenActions.onNonRecoverableOkClick;
        }
        if ((i & 2) != 0) {
            function02 = nonRecoverableScreenActions.onBackPressIntercept;
        }
        return nonRecoverableScreenActions.copy(function0, function02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NonRecoverableScreenActions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
