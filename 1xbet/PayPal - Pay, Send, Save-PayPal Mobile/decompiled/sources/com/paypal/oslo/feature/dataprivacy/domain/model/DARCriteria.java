package com.paypal.oslo.feature.dataprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJH\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARCriteria;", "", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARItem;", "items", "", "formats", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARCriteria;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getItems", "getFormats", "Ljava/lang/String;", "getStartTime", "getEndTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DARCriteria {
    public static final int $stable = 8;
    private final java.lang.String endTime;
    private final java.util.List<java.lang.String> formats;
    private final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARItem> items;
    private final java.lang.String startTime;

    public DARCriteria(java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARItem> list, java.util.List<java.lang.String> list2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.items = list;
        this.formats = list2;
        this.startTime = str;
        this.endTime = str2;
    }

    public /* synthetic */ DARCriteria(java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARItem> getItems() {
        return this.items;
    }

    public final java.util.List<java.lang.String> getFormats() {
        return this.formats;
    }

    public final java.lang.String getStartTime() {
        return this.startTime;
    }

    public final java.lang.String getEndTime() {
        return this.endTime;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARItem> list = this.items;
        java.util.List<java.lang.String> list2 = this.formats;
        java.lang.String str = this.startTime;
        java.lang.String str2 = this.endTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DARCriteria(items=");
        sb.append(list);
        sb.append(", formats=");
        sb.append(list2);
        sb.append(", startTime=");
        sb.append(str);
        sb.append(", endTime=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode();
        int hashCode2 = this.formats.hashCode();
        java.lang.String str = this.startTime;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.endTime;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.dataprivacy.domain.model.DARCriteria)) {
            return false;
        }
        com.paypal.oslo.feature.dataprivacy.domain.model.DARCriteria dARCriteria = (com.paypal.oslo.feature.dataprivacy.domain.model.DARCriteria) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.items, dARCriteria.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.formats, dARCriteria.formats) && kotlin.jvm.internal.Intrinsics.areEqual(this.startTime, dARCriteria.startTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.endTime, dARCriteria.endTime);
    }

    public final com.paypal.oslo.feature.dataprivacy.domain.model.DARCriteria copy(java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARItem> items, java.util.List<java.lang.String> formats, java.lang.String startTime, java.lang.String endTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formats, "");
        return new com.paypal.oslo.feature.dataprivacy.domain.model.DARCriteria(items, formats, startTime, endTime);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEndTime() {
        return this.endTime;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStartTime() {
        return this.startTime;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.formats;
    }

    public final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARItem> component1() {
        return this.items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.DARCriteria copy$default(com.paypal.oslo.feature.dataprivacy.domain.model.DARCriteria dARCriteria, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = dARCriteria.items;
        }
        if ((i & 2) != 0) {
            list2 = dARCriteria.formats;
        }
        if ((i & 4) != 0) {
            str = dARCriteria.startTime;
        }
        if ((i & 8) != 0) {
            str2 = dARCriteria.endTime;
        }
        return dARCriteria.copy(list, list2, str, str2);
    }

    public DARCriteria() {
        this(null, null, null, null, 15, null);
    }
}
