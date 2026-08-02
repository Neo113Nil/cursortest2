package com.paypal.oslo.feature.home.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadContent", "RefreshContent", "SilentRefreshHomeFeedSections", "RetrySectionLoad", "CollectionItemClicked", "CollectionViewAllClicked", "SilentRefreshWalletSnapshot", "WalletSnapshotRefreshed", "ContentLoaded", "ContentLoadFailed", "ScrollPositionChanged", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$CollectionItemClicked;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$CollectionViewAllClicked;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ContentLoadFailed;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ContentLoaded;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$LoadContent;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$RefreshContent;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$RetrySectionLoad;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ScrollPositionChanged;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$SilentRefreshHomeFeedSections;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$SilentRefreshWalletSnapshot;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$WalletSnapshotRefreshed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class HomeEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private HomeEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$LoadContent;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadContent extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.LoadContent INSTANCE = new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.LoadContent();

        public final int hashCode() {
            return 1148919862;
        }

        private LoadContent() {
            super("LoadContent", null);
        }

        public final java.lang.String toString() {
            return "LoadContent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.LoadContent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$RefreshContent;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshContent extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RefreshContent INSTANCE = new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RefreshContent();

        public final int hashCode() {
            return -1109114181;
        }

        private RefreshContent() {
            super("RefreshContent", null);
        }

        public final java.lang.String toString() {
            return "RefreshContent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RefreshContent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$SilentRefreshHomeFeedSections;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SilentRefreshHomeFeedSections extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshHomeFeedSections INSTANCE = new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshHomeFeedSections();

        public final int hashCode() {
            return -1120231916;
        }

        private SilentRefreshHomeFeedSections() {
            super("SilentRefreshHomeFeedSections", null);
        }

        public final java.lang.String toString() {
            return "SilentRefreshHomeFeedSections";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshHomeFeedSections)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$RetrySectionLoad;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "", "sectionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$RetrySectionLoad;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSectionId", "getSectionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetrySectionLoad extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        private final java.lang.String sectionId;
        private final java.lang.String sectionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetrySectionLoad(java.lang.String str, java.lang.String str2) {
            super("RetrySectionLoad", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.sectionId = str;
            this.sectionType = str2;
        }

        public final java.lang.String getSectionId() {
            return this.sectionId;
        }

        public final java.lang.String getSectionType() {
            return this.sectionType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sectionId;
            java.lang.String str2 = this.sectionType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetrySectionLoad(sectionId=");
            sb.append(str);
            sb.append(", sectionType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.sectionId.hashCode() * 31) + this.sectionType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad retrySectionLoad = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sectionId, retrySectionLoad.sectionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sectionType, retrySectionLoad.sectionType);
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad copy(java.lang.String sectionId, java.lang.String sectionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionType, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad(sectionId, sectionType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSectionType() {
            return this.sectionType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSectionId() {
            return this.sectionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad retrySectionLoad, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = retrySectionLoad.sectionId;
            }
            if ((i & 2) != 0) {
                str2 = retrySectionLoad.sectionType;
            }
            return retrySectionLoad.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$CollectionItemClicked;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "params", "", "isNbaClick", "<init>", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;Z)V", "component1", "()Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;Z)Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$CollectionItemClicked;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "getParams", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CollectionItemClicked extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        private final boolean isNbaClick;
        private final com.paypal.oslo.feature.home.ui.navigation.NavigationParams params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionItemClicked(com.paypal.oslo.feature.home.ui.navigation.NavigationParams navigationParams, boolean z) {
            super("CollectionItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationParams, "");
            this.params = navigationParams;
            this.isNbaClick = z;
        }

        public /* synthetic */ CollectionItemClicked(com.paypal.oslo.feature.home.ui.navigation.NavigationParams navigationParams, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(navigationParams, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams getParams() {
            return this.params;
        }

        public final boolean isNbaClick() {
            return this.isNbaClick;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams navigationParams = this.params;
            boolean z = this.isNbaClick;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CollectionItemClicked(params=");
            sb.append(navigationParams);
            sb.append(", isNbaClick=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.params.hashCode() * 31) + java.lang.Boolean.hashCode(this.isNbaClick);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked collectionItemClicked = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.params, collectionItemClicked.params) && this.isNbaClick == collectionItemClicked.isNbaClick;
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked copy(com.paypal.oslo.feature.home.ui.navigation.NavigationParams params, boolean isNbaClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked(params, isNbaClick);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsNbaClick() {
            return this.isNbaClick;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams getParams() {
            return this.params;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked collectionItemClicked, com.paypal.oslo.feature.home.ui.navigation.NavigationParams navigationParams, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navigationParams = collectionItemClicked.params;
            }
            if ((i & 2) != 0) {
                z = collectionItemClicked.isNbaClick;
            }
            return collectionItemClicked.copy(navigationParams, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$CollectionViewAllClicked;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "collectionType", "", "sectionId", "ctaPrompt", "<init>", "(Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$CollectionViewAllClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "getCollectionType", "Ljava/lang/String;", "getSectionId", "getCtaPrompt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CollectionViewAllClicked extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType;
        private final java.lang.String ctaPrompt;
        private final java.lang.String sectionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionViewAllClicked(com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String str, java.lang.String str2) {
            super("CollectionViewAllClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.collectionType = collectionType;
            this.sectionId = str;
            this.ctaPrompt = str2;
        }

        public /* synthetic */ CollectionViewAllClicked(com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(collectionType, str, (i & 4) != 0 ? null : str2);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.CollectionType getCollectionType() {
            return this.collectionType;
        }

        public final java.lang.String getSectionId() {
            return this.sectionId;
        }

        public final java.lang.String getCtaPrompt() {
            return this.ctaPrompt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType = this.collectionType;
            java.lang.String str = this.sectionId;
            java.lang.String str2 = this.ctaPrompt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CollectionViewAllClicked(collectionType=");
            sb.append(collectionType);
            sb.append(", sectionId=");
            sb.append(str);
            sb.append(", ctaPrompt=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.collectionType.hashCode();
            int hashCode2 = this.sectionId.hashCode();
            java.lang.String str = this.ctaPrompt;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked collectionViewAllClicked = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked) other;
            return this.collectionType == collectionViewAllClicked.collectionType && kotlin.jvm.internal.Intrinsics.areEqual(this.sectionId, collectionViewAllClicked.sectionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaPrompt, collectionViewAllClicked.ctaPrompt);
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked copy(com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String sectionId, java.lang.String ctaPrompt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked(collectionType, sectionId, ctaPrompt);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCtaPrompt() {
            return this.ctaPrompt;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSectionId() {
            return this.sectionId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.home.ui.navigation.CollectionType getCollectionType() {
            return this.collectionType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked collectionViewAllClicked, com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                collectionType = collectionViewAllClicked.collectionType;
            }
            if ((i & 2) != 0) {
                str = collectionViewAllClicked.sectionId;
            }
            if ((i & 4) != 0) {
                str2 = collectionViewAllClicked.ctaPrompt;
            }
            return collectionViewAllClicked.copy(collectionType, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$SilentRefreshWalletSnapshot;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SilentRefreshWalletSnapshot extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshWalletSnapshot INSTANCE = new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshWalletSnapshot();

        public final int hashCode() {
            return 1407868102;
        }

        private SilentRefreshWalletSnapshot() {
            super("SilentRefreshWalletSnapshot", null);
        }

        public final java.lang.String toString() {
            return "SilentRefreshWalletSnapshot";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshWalletSnapshot)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$WalletSnapshotRefreshed;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "snapshotSection", "<init>", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)V", "component1", "()Lcom/paypal/oslo/feature/home/domain/model/Section;", "copy", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$WalletSnapshotRefreshed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "getSnapshotSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletSnapshotRefreshed extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.domain.model.Section<?> snapshotSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletSnapshotRefreshed(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            super("WalletSnapshotRefreshed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            this.snapshotSection = section;
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> getSnapshotSection() {
            return this.snapshotSection;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.domain.model.Section<?> section = this.snapshotSection;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletSnapshotRefreshed(snapshotSection=");
            sb.append(section);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.snapshotSection.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed) && kotlin.jvm.internal.Intrinsics.areEqual(this.snapshotSection, ((com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed) other).snapshotSection);
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed copy(com.paypal.oslo.feature.home.domain.model.Section<?> snapshotSection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snapshotSection, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed(snapshotSection);
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> component1() {
            return this.snapshotSection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed walletSnapshotRefreshed, com.paypal.oslo.feature.home.domain.model.Section section, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                section = walletSnapshotRefreshed.snapshotSection;
            }
            return walletSnapshotRefreshed.copy(section);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ContentLoaded;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "sections", "", "hapticFeedbackEnabled", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ContentLoaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSections", "Z", "getHapticFeedbackEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContentLoaded extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 8;
        private final boolean hapticFeedbackEnabled;
        private final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ContentLoaded(java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> list, boolean z) {
            super("ContentLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.sections = list;
            this.hapticFeedbackEnabled = z;
        }

        public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> getSections() {
            return this.sections;
        }

        public final boolean getHapticFeedbackEnabled() {
            return this.hapticFeedbackEnabled;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> list = this.sections;
            boolean z = this.hapticFeedbackEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentLoaded(sections=");
            sb.append(list);
            sb.append(", hapticFeedbackEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.sections.hashCode() * 31) + java.lang.Boolean.hashCode(this.hapticFeedbackEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded contentLoaded = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sections, contentLoaded.sections) && this.hapticFeedbackEnabled == contentLoaded.hapticFeedbackEnabled;
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded copy(java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> sections, boolean hapticFeedbackEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded(sections, hapticFeedbackEnabled);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHapticFeedbackEnabled() {
            return this.hapticFeedbackEnabled;
        }

        public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> component1() {
            return this.sections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded contentLoaded, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = contentLoaded.sections;
            }
            if ((i & 2) != 0) {
                z = contentLoaded.hapticFeedbackEnabled;
            }
            return contentLoaded.copy(list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ContentLoadFailed;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ContentLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContentLoadFailed extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentLoadFailed(java.lang.String str) {
            super("ContentLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentLoadFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed copy(java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed contentLoadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contentLoadFailed.errorMessage;
            }
            return contentLoadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ScrollPositionChanged;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "", "index", "offset", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent$ScrollPositionChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex", "getOffset"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScrollPositionChanged extends com.paypal.oslo.feature.home.ui.mvi.HomeEvent {
        public static final int $stable = 0;
        private final int index;
        private final int offset;

        public ScrollPositionChanged(int i, int i2) {
            super("ScrollPositionChanged", null);
            this.index = i;
            this.offset = i2;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final java.lang.String toString() {
            int i = this.index;
            int i2 = this.offset;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScrollPositionChanged(index=");
            sb.append(i);
            sb.append(", offset=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.index) * 31) + java.lang.Integer.hashCode(this.offset);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged scrollPositionChanged = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged) other;
            return this.index == scrollPositionChanged.index && this.offset == scrollPositionChanged.offset;
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged copy(int index, int offset) {
            return new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged(index, offset);
        }

        /* renamed from: component2, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged scrollPositionChanged, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = scrollPositionChanged.index;
            }
            if ((i3 & 2) != 0) {
                i2 = scrollPositionChanged.offset;
            }
            return scrollPositionChanged.copy(i, i2);
        }
    }

    public /* synthetic */ HomeEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
