package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/composables/AddNoteCallbacks;", "", "Lkotlin/Function1;", "", "", "onMemoChange", "Lkotlin/Function0;", "onAddNoteCtaClick", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/p2p/ui/review/composables/AddNoteCallbacks;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnMemoChange", "Lkotlin/jvm/functions/Function0;", "getOnAddNoteCtaClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddNoteCallbacks {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onAddNoteCtaClick;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onMemoChange;

    /* JADX WARN: Multi-variable type inference failed */
    public AddNoteCallbacks(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.onMemoChange = function1;
        this.onAddNoteCtaClick = function0;
    }

    public /* synthetic */ AddNoteCallbacks(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks.$r8$lambda$Lj5awmjhMHMl9sSIpiyvAzfrtEM((java.lang.String) obj);
            }
        } : function1, (i & 2) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0);
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnMemoChange() {
        return this.onMemoChange;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAddNoteCtaClick() {
        return this.onAddNoteCtaClick;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Lj5awmjhMHMl9sSIpiyvAzfrtEM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onMemoChange;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onAddNoteCtaClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddNoteCallbacks(onMemoChange=");
        sb.append(function1);
        sb.append(", onAddNoteCtaClick=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.onMemoChange.hashCode() * 31) + this.onAddNoteCtaClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks addNoteCallbacks = (com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onMemoChange, addNoteCallbacks.onMemoChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAddNoteCtaClick, addNoteCallbacks.onAddNoteCtaClick);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks copy(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onMemoChange, kotlin.jvm.functions.Function0<kotlin.Unit> onAddNoteCtaClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onMemoChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAddNoteCtaClick, "");
        return new com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks(onMemoChange, onAddNoteCtaClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onAddNoteCtaClick;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component1() {
        return this.onMemoChange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks copy$default(com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteCallbacks addNoteCallbacks, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = addNoteCallbacks.onMemoChange;
        }
        if ((i & 2) != 0) {
            function0 = addNoteCallbacks.onAddNoteCtaClick;
        }
        return addNoteCallbacks.copy(function1, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddNoteCallbacks() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
