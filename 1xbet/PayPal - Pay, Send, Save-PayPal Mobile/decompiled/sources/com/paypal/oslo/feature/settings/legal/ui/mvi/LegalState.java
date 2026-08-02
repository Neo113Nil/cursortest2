package com.paypal.oslo.feature.settings.legal.ui.mvi;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010R\u0014\u0010$\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState;", "screenState", "", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "items", "", "showFooter", "<init>", "(Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState;Ljava/util/List;Z)V", "component1", "()Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState;", "component2", "()Ljava/util/List;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState;Ljava/util/List;Z)Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState;", "getScreenState", "Ljava/util/List;", "getItems", "Z", "getShowFooter", "getName", "name", "ScreenState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LegalState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> items;
    private final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState screenState;
    private final boolean showFooter;

    public LegalState(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState screenState, java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.screenState = screenState;
        this.items = list;
        this.showFooter = z;
    }

    public /* synthetic */ LegalState(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Loading loading, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Loading.INSTANCE : loading, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z);
    }

    public final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState getScreenState() {
        return this.screenState;
    }

    public final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> getItems() {
        return this.items;
    }

    public final boolean getShowFooter() {
        return this.showFooter;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState;", "", "<init>", "()V", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState$Loading;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ScreenState {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState$Loading;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Loading INSTANCE = new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Loading();

            public final int hashCode() {
                return 221498998;
            }

            private Loading() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Loading";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Loading)) {
                    return false;
                }
                return true;
            }
        }

        private ScreenState() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState$Ready;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState$ScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ready extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Ready INSTANCE = new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Ready();

            public final int hashCode() {
                return 537316701;
            }

            private Ready() {
                super(null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Ready)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ ScreenState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.LEGAL_STATE;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState screenState = this.screenState;
        java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> list = this.items;
        boolean z = this.showFooter;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalState(screenState=");
        sb.append(screenState);
        sb.append(", items=");
        sb.append(list);
        sb.append(", showFooter=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.screenState.hashCode() * 31) + this.items.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showFooter);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState)) {
            return false;
        }
        com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState legalState = (com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.screenState, legalState.screenState) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, legalState.items) && this.showFooter == legalState.showFooter;
    }

    public final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState copy(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState screenState, java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> items, boolean showFooter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState(screenState, items, showFooter);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowFooter() {
        return this.showFooter;
    }

    public final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> component2() {
        return this.items;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState getScreenState() {
        return this.screenState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState copy$default(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState legalState, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState screenState, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            screenState = legalState.screenState;
        }
        if ((i & 2) != 0) {
            list = legalState.items;
        }
        if ((i & 4) != 0) {
            z = legalState.showFooter;
        }
        return legalState.copy(screenState, list, z);
    }

    public LegalState() {
        this(null, null, false, 7, null);
    }
}
