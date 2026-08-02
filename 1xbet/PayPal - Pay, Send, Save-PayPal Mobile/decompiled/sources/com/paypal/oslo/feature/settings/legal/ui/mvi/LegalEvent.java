package com.paypal.oslo.feature.settings.legal.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "UserIntent", "SystemEvent", "DataEvent", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$SystemEvent;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class LegalEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;

    private LegalEvent() {
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.LEGAL_EVENT;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;", "<init>", "()V", "OnBackClicked", "OnLinkClicked", "OnLegalHubClicked", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent$OnBackClicked;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent$OnLegalHubClicked;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent$OnLinkClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UserIntent extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent$OnBackClicked;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnBackClicked();

            public final int hashCode() {
                return -113708146;
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
                if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnBackClicked)) {
                    return false;
                }
                return true;
            }
        }

        private UserIntent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent$OnLinkClicked;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent;", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "item", "<init>", "(Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;)V", "component1", "()Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "copy", "(Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;)Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent$OnLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnLinkClicked extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent {
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
                return (other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked) other).item);
            }

            public final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked copy(com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData item) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
                return new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked(item);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData getItem() {
                return this.item;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked copy$default(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked onLinkClicked, com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData legalItemUiData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    legalItemUiData = onLinkClicked.item;
                }
                return onLinkClicked.copy(legalItemUiData);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent$OnLegalHubClicked;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnLegalHubClicked extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLegalHubClicked INSTANCE = new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLegalHubClicked();

            public final int hashCode() {
                return 1317792857;
            }

            private OnLegalHubClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "OnLegalHubClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLegalHubClicked)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ UserIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$SystemEvent;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;", "<init>", "()V", "LoadLegalItems", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$SystemEvent$LoadLegalItems;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class SystemEvent extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$SystemEvent$LoadLegalItems;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LoadLegalItems extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.SystemEvent.LoadLegalItems INSTANCE = new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.SystemEvent.LoadLegalItems();

            public final int hashCode() {
                return 359111940;
            }

            private LoadLegalItems() {
                super(null);
            }

            public final java.lang.String toString() {
                return "LoadLegalItems";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.SystemEvent.LoadLegalItems)) {
                    return false;
                }
                return true;
            }
        }

        private SystemEvent() {
            super(null);
        }

        public /* synthetic */ SystemEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;", "<init>", "()V", "LegalItemsLoaded", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$DataEvent$LegalItemsLoaded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class DataEvent extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$DataEvent$LegalItemsLoaded;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$DataEvent;", "", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "items", "", "showFooter", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent$DataEvent$LegalItemsLoaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "Z", "getShowFooter"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LegalItemsLoaded extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> items;
            private final boolean showFooter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LegalItemsLoaded(java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> list, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.items = list;
                this.showFooter = z;
            }

            public final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> getItems() {
                return this.items;
            }

            public final boolean getShowFooter() {
                return this.showFooter;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> list = this.items;
                boolean z = this.showFooter;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalItemsLoaded(items=");
                sb.append(list);
                sb.append(", showFooter=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.items.hashCode() * 31) + java.lang.Boolean.hashCode(this.showFooter);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded legalItemsLoaded = (com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.items, legalItemsLoaded.items) && this.showFooter == legalItemsLoaded.showFooter;
            }

            public final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded copy(java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> items, boolean showFooter) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
                return new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded(items, showFooter);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowFooter() {
                return this.showFooter;
            }

            public final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> component1() {
                return this.items;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded copy$default(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded legalItemsLoaded, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = legalItemsLoaded.items;
                }
                if ((i & 2) != 0) {
                    z = legalItemsLoaded.showFooter;
                }
                return legalItemsLoaded.copy(list, z);
            }
        }

        private DataEvent() {
            super(null);
        }

        public /* synthetic */ DataEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LegalEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
