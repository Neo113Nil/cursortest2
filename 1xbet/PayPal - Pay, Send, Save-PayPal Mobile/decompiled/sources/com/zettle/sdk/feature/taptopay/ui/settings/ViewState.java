package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewState;", "", "Lkotlin/Pair;", "", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisite;", "interactedWith", "<init>", "(Lkotlin/Pair;)V", "component1", "()Lkotlin/Pair;", "copy", "(Lkotlin/Pair;)Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/Pair;", "getInteractedWith"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ViewState {
    public static final int $stable = 0;
    private final kotlin.Pair<java.lang.Boolean, com.zettle.sdk.feature.taptopay.ui.settings.Prerequisite> interactedWith;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewState(kotlin.Pair<java.lang.Boolean, ? extends com.zettle.sdk.feature.taptopay.ui.settings.Prerequisite> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        this.interactedWith = pair;
    }

    public final kotlin.Pair<java.lang.Boolean, com.zettle.sdk.feature.taptopay.ui.settings.Prerequisite> getInteractedWith() {
        return this.interactedWith;
    }

    public final java.lang.String toString() {
        kotlin.Pair<java.lang.Boolean, com.zettle.sdk.feature.taptopay.ui.settings.Prerequisite> pair = this.interactedWith;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewState(interactedWith=");
        sb.append(pair);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.interactedWith.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.feature.taptopay.ui.settings.ViewState) && kotlin.jvm.internal.Intrinsics.areEqual(this.interactedWith, ((com.zettle.sdk.feature.taptopay.ui.settings.ViewState) other).interactedWith);
    }

    public final com.zettle.sdk.feature.taptopay.ui.settings.ViewState copy(kotlin.Pair<java.lang.Boolean, ? extends com.zettle.sdk.feature.taptopay.ui.settings.Prerequisite> interactedWith) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactedWith, "");
        return new com.zettle.sdk.feature.taptopay.ui.settings.ViewState(interactedWith);
    }

    public final kotlin.Pair<java.lang.Boolean, com.zettle.sdk.feature.taptopay.ui.settings.Prerequisite> component1() {
        return this.interactedWith;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.settings.ViewState copy$default(com.zettle.sdk.feature.taptopay.ui.settings.ViewState viewState, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = viewState.interactedWith;
        }
        return viewState.copy(pair);
    }
}
