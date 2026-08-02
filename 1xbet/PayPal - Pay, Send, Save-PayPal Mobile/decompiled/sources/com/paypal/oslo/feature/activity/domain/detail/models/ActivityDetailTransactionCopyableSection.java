package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSection;", "", "", "sectionNameResId", "", "transactionId", "copyToastMessageResId", "sectionNamePlaceholder", "<init>", "(ILjava/lang/String;ILjava/lang/Object;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Object;", "copy", "(ILjava/lang/String;ILjava/lang/Object;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getSectionNameResId", "Ljava/lang/String;", "getTransactionId", "getCopyToastMessageResId", "Ljava/lang/Object;", "getSectionNamePlaceholder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailTransactionCopyableSection {
    public static final int $stable = 8;
    private final int copyToastMessageResId;
    private final java.lang.Object sectionNamePlaceholder;
    private final int sectionNameResId;
    private final java.lang.String transactionId;

    public ActivityDetailTransactionCopyableSection(int i, java.lang.String str, int i2, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.sectionNameResId = i;
        this.transactionId = str;
        this.copyToastMessageResId = i2;
        this.sectionNamePlaceholder = obj;
    }

    public /* synthetic */ ActivityDetailTransactionCopyableSection(int i, java.lang.String str, int i2, java.lang.Object obj, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, (i3 & 8) != 0 ? null : obj);
    }

    public final int getSectionNameResId() {
        return this.sectionNameResId;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    public final int getCopyToastMessageResId() {
        return this.copyToastMessageResId;
    }

    public final java.lang.Object getSectionNamePlaceholder() {
        return this.sectionNamePlaceholder;
    }

    public final java.lang.String toString() {
        int i = this.sectionNameResId;
        java.lang.String str = this.transactionId;
        int i2 = this.copyToastMessageResId;
        java.lang.Object obj = this.sectionNamePlaceholder;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailTransactionCopyableSection(sectionNameResId=");
        sb.append(i);
        sb.append(", transactionId=");
        sb.append(str);
        sb.append(", copyToastMessageResId=");
        sb.append(i2);
        sb.append(", sectionNamePlaceholder=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.sectionNameResId);
        int hashCode2 = this.transactionId.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.copyToastMessageResId);
        java.lang.Object obj = this.sectionNamePlaceholder;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection) other;
        return this.sectionNameResId == activityDetailTransactionCopyableSection.sectionNameResId && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, activityDetailTransactionCopyableSection.transactionId) && this.copyToastMessageResId == activityDetailTransactionCopyableSection.copyToastMessageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.sectionNamePlaceholder, activityDetailTransactionCopyableSection.sectionNamePlaceholder);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection copy(int sectionNameResId, java.lang.String transactionId, int copyToastMessageResId, java.lang.Object sectionNamePlaceholder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection(sectionNameResId, transactionId, copyToastMessageResId, sectionNamePlaceholder);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Object getSectionNamePlaceholder() {
        return this.sectionNamePlaceholder;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCopyToastMessageResId() {
        return this.copyToastMessageResId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component1, reason: from getter */
    public final int getSectionNameResId() {
        return this.sectionNameResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection, int i, java.lang.String str, int i2, java.lang.Object obj, int i3, java.lang.Object obj2) {
        if ((i3 & 1) != 0) {
            i = activityDetailTransactionCopyableSection.sectionNameResId;
        }
        if ((i3 & 2) != 0) {
            str = activityDetailTransactionCopyableSection.transactionId;
        }
        if ((i3 & 4) != 0) {
            i2 = activityDetailTransactionCopyableSection.copyToastMessageResId;
        }
        if ((i3 & 8) != 0) {
            obj = activityDetailTransactionCopyableSection.sectionNamePlaceholder;
        }
        return activityDetailTransactionCopyableSection.copy(i, str, i2, obj);
    }
}
