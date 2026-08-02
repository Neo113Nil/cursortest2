package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012Jn\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR(\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0012R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/composables/AddNoteAndMediaCallbacks;", "", "Lkotlin/Function1;", "", "", "onMemoChange", "Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "onThemeSelect", "Lkotlin/Function0;", "onDone", "onGifClick", "onBackClick", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "component3", "()Lkotlin/jvm/functions/Function0;", "component4", "component5", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/p2p/ui/review/composables/AddNoteAndMediaCallbacks;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnMemoChange", "getOnThemeSelect", "Lkotlin/jvm/functions/Function0;", "getOnDone", "getOnGifClick", "getOnBackClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddNoteAndMediaCallbacks {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDone;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onGifClick;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onMemoChange;
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.MediaItem, kotlin.Unit> onThemeSelect;

    /* JADX WARN: Multi-variable type inference failed */
    public AddNoteAndMediaCallbacks(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.MediaItem, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        this.onMemoChange = function1;
        this.onThemeSelect = function12;
        this.onDone = function0;
        this.onGifClick = function02;
        this.onBackClick = function03;
    }

    public /* synthetic */ AddNoteAndMediaCallbacks(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks.$r8$lambda$rY2fDAz7FIt_nsWzFqWvWiAGEZI((java.lang.String) obj);
            }
        } : function1, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function12, (i & 4) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function02, (i & 16) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function03);
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnMemoChange() {
        return this.onMemoChange;
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.MediaItem, kotlin.Unit> getOnThemeSelect() {
        return this.onThemeSelect;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDone() {
        return this.onDone;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnGifClick() {
        return this.onGifClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackClick() {
        return this.onBackClick;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rY2fDAz7FIt_nsWzFqWvWiAGEZI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onMemoChange;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.MediaItem, kotlin.Unit> function12 = this.onThemeSelect;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onDone;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onGifClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = this.onBackClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddNoteAndMediaCallbacks(onMemoChange=");
        sb.append(function1);
        sb.append(", onThemeSelect=");
        sb.append(function12);
        sb.append(", onDone=");
        sb.append(function0);
        sb.append(", onGifClick=");
        sb.append(function02);
        sb.append(", onBackClick=");
        sb.append(function03);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.onMemoChange.hashCode() * 31) + this.onThemeSelect.hashCode()) * 31) + this.onDone.hashCode()) * 31) + this.onGifClick.hashCode()) * 31) + this.onBackClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks addNoteAndMediaCallbacks = (com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onMemoChange, addNoteAndMediaCallbacks.onMemoChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onThemeSelect, addNoteAndMediaCallbacks.onThemeSelect) && kotlin.jvm.internal.Intrinsics.areEqual(this.onDone, addNoteAndMediaCallbacks.onDone) && kotlin.jvm.internal.Intrinsics.areEqual(this.onGifClick, addNoteAndMediaCallbacks.onGifClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBackClick, addNoteAndMediaCallbacks.onBackClick);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks copy(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onMemoChange, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.MediaItem, kotlin.Unit> onThemeSelect, kotlin.jvm.functions.Function0<kotlin.Unit> onDone, kotlin.jvm.functions.Function0<kotlin.Unit> onGifClick, kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onMemoChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onThemeSelect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onGifClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackClick, "");
        return new com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks(onMemoChange, onThemeSelect, onDone, onGifClick, onBackClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
        return this.onBackClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
        return this.onGifClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onDone;
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.MediaItem, kotlin.Unit> component2() {
        return this.onThemeSelect;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component1() {
        return this.onMemoChange;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks copy$default(com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaCallbacks addNoteAndMediaCallbacks, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = addNoteAndMediaCallbacks.onMemoChange;
        }
        if ((i & 2) != 0) {
            function12 = addNoteAndMediaCallbacks.onThemeSelect;
        }
        kotlin.jvm.functions.Function1 function13 = function12;
        if ((i & 4) != 0) {
            function0 = addNoteAndMediaCallbacks.onDone;
        }
        kotlin.jvm.functions.Function0 function04 = function0;
        if ((i & 8) != 0) {
            function02 = addNoteAndMediaCallbacks.onGifClick;
        }
        kotlin.jvm.functions.Function0 function05 = function02;
        if ((i & 16) != 0) {
            function03 = addNoteAndMediaCallbacks.onBackClick;
        }
        return addNoteAndMediaCallbacks.copy(function1, function13, function04, function05, function03);
    }

    public AddNoteAndMediaCallbacks() {
        this(null, null, null, null, null, 31, null);
    }
}
