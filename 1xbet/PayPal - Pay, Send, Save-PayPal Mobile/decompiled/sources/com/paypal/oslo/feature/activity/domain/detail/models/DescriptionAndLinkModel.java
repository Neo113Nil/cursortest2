package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR,\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;", "", "", "descriptionText", "", "Lkotlin/Pair;", "linksMap", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescriptionText", "Ljava/util/List;", "getLinksMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DescriptionAndLinkModel {
    public static final int $stable = 8;
    private final java.lang.String descriptionText;
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> linksMap;

    public DescriptionAndLinkModel(java.lang.String str, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.descriptionText = str;
        this.linksMap = list;
    }

    public /* synthetic */ DescriptionAndLinkModel(java.lang.String str, java.util.ArrayList arrayList, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new java.util.ArrayList() : arrayList);
    }

    public final java.lang.String getDescriptionText() {
        return this.descriptionText;
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getLinksMap() {
        return this.linksMap;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.descriptionText;
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list = this.linksMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DescriptionAndLinkModel(descriptionText=");
        sb.append(str);
        sb.append(", linksMap=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.descriptionText.hashCode() * 31) + this.linksMap.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel = (com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionText, descriptionAndLinkModel.descriptionText) && kotlin.jvm.internal.Intrinsics.areEqual(this.linksMap, descriptionAndLinkModel.linksMap);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel copy(java.lang.String descriptionText, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> linksMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptionText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linksMap, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel(descriptionText, linksMap);
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> component2() {
        return this.linksMap;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDescriptionText() {
        return this.descriptionText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = descriptionAndLinkModel.descriptionText;
        }
        if ((i & 2) != 0) {
            list = descriptionAndLinkModel.linksMap;
        }
        return descriptionAndLinkModel.copy(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptionAndLinkModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
