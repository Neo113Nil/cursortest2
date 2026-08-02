package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "InitialLoading", "Content", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState$Content;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState$InitialLoading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PayLaterHubUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PayLaterHubUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState$InitialLoading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitialLoading extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.InitialLoading INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.InitialLoading();

        public final int hashCode() {
            return -2107975432;
        }

        private InitialLoading() {
            super("InitialLoading", null);
        }

        public final java.lang.String toString() {
            return "InitialLoading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.InitialLoading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0011R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState$Content;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "model", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/SectionState;", "sectionStates", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;Ljava/util/Map;)V", "section", "getSectionState", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/SectionState;", "state", "updateSectionState", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/SectionState;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState$Content;", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "component2", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;Ljava/util/Map;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "getModel", "Ljava/util/Map;", "getSectionStates"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model;
        private final java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> sectionStates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel, java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, ? extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> map) {
            super("Content", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.model = payLaterHubUiModel;
            this.sectionStates = map;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        public /* synthetic */ Content(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(payLaterHubUiModel, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> getSectionStates() {
            return this.sectionStates;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState getSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection section) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState sectionState = this.sectionStates.get(section);
            return sectionState == null ? com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Success.INSTANCE : sectionState;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection section, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return copy$default(this, null, kotlin.collections.MapsKt.plus(this.sectionStates, kotlin.TuplesKt.to(section, state)), 1, null);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel = this.model;
            java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> map = this.sectionStates;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(model=");
            sb.append(payLaterHubUiModel);
            sb.append(", sectionStates=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.model.hashCode() * 31) + this.sectionStates.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content content = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.model, content.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.sectionStates, content.sectionStates);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content copy(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model, java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, ? extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> sectionStates) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionStates, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content(model, sectionStates);
        }

        public final java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> component2() {
            return this.sectionStates;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content content, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payLaterHubUiModel = content.model;
            }
            if ((i & 2) != 0) {
                map = content.sectionStates;
            }
            return content.copy(payLaterHubUiModel, map);
        }
    }

    public /* synthetic */ PayLaterHubUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
