package com.paypal.oslo.feature.identity.sna.ui.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/components/AutomaticMobileVerificationBottomSheetCallbacks;", "", "Lkotlin/Function0;", "", "onConfirm", "onCancel", "onDismiss", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "component3", "copy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/identity/sna/ui/components/AutomaticMobileVerificationBottomSheetCallbacks;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getOnConfirm", "getOnCancel", "getOnDismiss"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AutomaticMobileVerificationBottomSheetCallbacks {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onCancel;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss;

    public AutomaticMobileVerificationBottomSheetCallbacks(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        this.onConfirm = function0;
        this.onCancel = function02;
        this.onDismiss = function03;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnConfirm() {
        return this.onConfirm;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCancel() {
        return this.onCancel;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismiss() {
        return this.onDismiss;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onConfirm;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onCancel;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = this.onDismiss;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutomaticMobileVerificationBottomSheetCallbacks(onConfirm=");
        sb.append(function0);
        sb.append(", onCancel=");
        sb.append(function02);
        sb.append(", onDismiss=");
        sb.append(function03);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.onConfirm.hashCode() * 31) + this.onCancel.hashCode()) * 31) + this.onDismiss.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.components.AutomaticMobileVerificationBottomSheetCallbacks)) {
            return false;
        }
        com.paypal.oslo.feature.identity.sna.ui.components.AutomaticMobileVerificationBottomSheetCallbacks automaticMobileVerificationBottomSheetCallbacks = (com.paypal.oslo.feature.identity.sna.ui.components.AutomaticMobileVerificationBottomSheetCallbacks) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onConfirm, automaticMobileVerificationBottomSheetCallbacks.onConfirm) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCancel, automaticMobileVerificationBottomSheetCallbacks.onCancel) && kotlin.jvm.internal.Intrinsics.areEqual(this.onDismiss, automaticMobileVerificationBottomSheetCallbacks.onDismiss);
    }

    public final com.paypal.oslo.feature.identity.sna.ui.components.AutomaticMobileVerificationBottomSheetCallbacks copy(kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm, kotlin.jvm.functions.Function0<kotlin.Unit> onCancel, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConfirm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCancel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDismiss, "");
        return new com.paypal.oslo.feature.identity.sna.ui.components.AutomaticMobileVerificationBottomSheetCallbacks(onConfirm, onCancel, onDismiss);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onDismiss;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onCancel;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
        return this.onConfirm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.components.AutomaticMobileVerificationBottomSheetCallbacks copy$default(com.paypal.oslo.feature.identity.sna.ui.components.AutomaticMobileVerificationBottomSheetCallbacks automaticMobileVerificationBottomSheetCallbacks, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = automaticMobileVerificationBottomSheetCallbacks.onConfirm;
        }
        if ((i & 2) != 0) {
            function02 = automaticMobileVerificationBottomSheetCallbacks.onCancel;
        }
        if ((i & 4) != 0) {
            function03 = automaticMobileVerificationBottomSheetCallbacks.onDismiss;
        }
        return automaticMobileVerificationBottomSheetCallbacks.copy(function0, function02, function03);
    }
}
