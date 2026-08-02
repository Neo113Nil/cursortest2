package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems;", "", "FilterIcon", "SearchIcon", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems$FilterIcon;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems$SearchIcon;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ActivityActionItems {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems$FilterIcon;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems;", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Lcom/paypal/pds/core/Icon;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "copy", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems$FilterIcon;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FilterIcon implements com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Icon icon;

        public FilterIcon(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            this.icon = icon;
        }

        public /* synthetic */ FilterIcon(com.paypal.pds.core.Icon.Sliders sliders, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.pds.core.Icon.Sliders.INSTANCE : sliders);
        }

        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.icon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FilterIcon(icon=");
            sb.append(icon);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.icon.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.FilterIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.FilterIcon) other).icon);
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.FilterIcon copy(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.FilterIcon(icon);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.FilterIcon copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.FilterIcon filterIcon, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = filterIcon.icon;
            }
            return filterIcon.copy(icon);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FilterIcon() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems$SearchIcon;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems;", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Lcom/paypal/pds/core/Icon;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "copy", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems$SearchIcon;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchIcon implements com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Icon icon;

        public SearchIcon(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            this.icon = icon;
        }

        public /* synthetic */ SearchIcon(com.paypal.pds.core.Icon.MagnifyingGlass magnifyingGlass, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.pds.core.Icon.MagnifyingGlass.INSTANCE : magnifyingGlass);
        }

        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.icon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchIcon(icon=");
            sb.append(icon);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.icon.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.SearchIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.SearchIcon) other).icon);
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.SearchIcon copy(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.SearchIcon(icon);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.SearchIcon copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.SearchIcon searchIcon, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = searchIcon.icon;
            }
            return searchIcon.copy(icon);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SearchIcon() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
