package com.paypal.oslo.feature.settings.legal.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalScreenUiEvent;", "", "<init>", "()V", "OnBackClicked", "OnLinkClicked", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalScreenUiEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalScreenUiEvent$OnLinkClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class LegalScreenUiEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalScreenUiEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalScreenUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnBackClicked();

        public final int hashCode() {
            return 479364457;
        }

        private OnBackClicked() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    private LegalScreenUiEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalScreenUiEvent$OnLinkClicked;", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalScreenUiEvent;", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "item", "<init>", "(Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;)V", "component1", "()Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "copy", "(Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;)Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalScreenUiEvent$OnLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLinkClicked extends com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLinkClicked(com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData legalItemUiData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalItemUiData, "");
            this.item = legalItemUiData;
        }

        public final com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData getItem() {
            return this.item;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData legalItemUiData = this.item;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLinkClicked(item=");
            sb.append(legalItemUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnLinkClicked) other).item);
        }

        public final com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnLinkClicked copy(com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnLinkClicked(item);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnLinkClicked copy$default(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalScreenUiEvent.OnLinkClicked onLinkClicked, com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData legalItemUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                legalItemUiData = onLinkClicked.item;
            }
            return onLinkClicked.copy(legalItemUiData);
        }
    }

    public /* synthetic */ LegalScreenUiEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
