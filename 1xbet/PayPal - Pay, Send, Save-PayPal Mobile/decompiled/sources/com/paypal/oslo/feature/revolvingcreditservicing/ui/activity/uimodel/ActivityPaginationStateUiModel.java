package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \r2\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/pagination/PaginationStateUiModel;", "<init>", "()V", "", "nextOffset", "Ljava/lang/Integer;", "getNextOffset", "()Ljava/lang/Integer;", "", "isLoadingMore", "()Z", "isError", "Companion", "CanLoadMore", "ShouldLoadMore", "LoadingMore", "Disabled", "Error", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$CanLoadMore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$Disabled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$LoadingMore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$ShouldLoadMore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ActivityPaginationStateUiModel implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Companion(null);
    private final java.lang.Integer nextOffset;

    private ActivityPaginationStateUiModel() {
    }

    public java.lang.Integer getNextOffset() {
        return this.nextOffset;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel
    public boolean isLoadingMore() {
        return this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.LoadingMore;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.pagination.PaginationStateUiModel
    public boolean isError() {
        return this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$CanLoadMore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;", "", "nextOffset", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$CanLoadMore;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getNextOffset", "()Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CanLoadMore extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel {
        public static final int $stable = 0;
        private final int nextOffset;

        public CanLoadMore(int i) {
            super(null);
            this.nextOffset = i;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel
        public final java.lang.Integer getNextOffset() {
            return java.lang.Integer.valueOf(this.nextOffset);
        }

        public final java.lang.String toString() {
            int i = this.nextOffset;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CanLoadMore(nextOffset=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.nextOffset);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore) && this.nextOffset == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore) other).nextOffset;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore copy(int nextOffset) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore(nextOffset);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNextOffset() {
            return this.nextOffset;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore canLoadMore, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = canLoadMore.nextOffset;
            }
            return canLoadMore.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$ShouldLoadMore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;", "", "nextOffset", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$ShouldLoadMore;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getNextOffset", "()Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShouldLoadMore extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel {
        public static final int $stable = 0;
        private final int nextOffset;

        public ShouldLoadMore(int i) {
            super(null);
            this.nextOffset = i;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel
        public final java.lang.Integer getNextOffset() {
            return java.lang.Integer.valueOf(this.nextOffset);
        }

        public final java.lang.String toString() {
            int i = this.nextOffset;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShouldLoadMore(nextOffset=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.nextOffset);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore) && this.nextOffset == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore) other).nextOffset;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore copy(int nextOffset) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore(nextOffset);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNextOffset() {
            return this.nextOffset;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore shouldLoadMore, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = shouldLoadMore.nextOffset;
            }
            return shouldLoadMore.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$LoadingMore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingMore extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.LoadingMore INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.LoadingMore();

        public final int hashCode() {
            return -1178448962;
        }

        private LoadingMore() {
            super(null);
        }

        public final java.lang.String toString() {
            return "LoadingMore";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.LoadingMore)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$Disabled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disabled extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Disabled INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Disabled();

        public final int hashCode() {
            return -86055793;
        }

        private Disabled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Disabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Disabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;", "", "nextOffset", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getNextOffset", "()Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel {
        public static final int $stable = 0;
        private final int nextOffset;

        public Error(int i) {
            super(null);
            this.nextOffset = i;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel
        public final java.lang.Integer getNextOffset() {
            return java.lang.Integer.valueOf(this.nextOffset);
        }

        public final java.lang.String toString() {
            int i = this.nextOffset;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(nextOffset=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.nextOffset);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error) && this.nextOffset == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error) other).nextOffset;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error copy(int nextOffset) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error(nextOffset);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNextOffset() {
            return this.nextOffset;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error error, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = error.nextOffset;
            }
            return error.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel$Companion;", "", "<init>", "()V", "", "hasNextPage", "", "nextOffset", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;", "create", "(ZLjava/lang/Integer;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel create(boolean hasNextPage, java.lang.Integer nextOffset) {
            return (!hasNextPage || nextOffset == null) ? com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Disabled.INSTANCE : new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore(nextOffset.intValue());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityPaginationStateUiModel(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
