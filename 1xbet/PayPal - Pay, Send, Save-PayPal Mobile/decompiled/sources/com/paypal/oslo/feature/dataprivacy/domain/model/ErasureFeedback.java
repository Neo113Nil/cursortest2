package com.paypal.oslo.feature.dataprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureFeedback;", "", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureReason;", "reasons", "", "comments", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureFeedback;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getReasons", "Ljava/lang/String;", "getComments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ErasureFeedback {
    public static final int $stable = 8;
    private final java.lang.String comments;
    private final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> reasons;

    /* JADX WARN: Multi-variable type inference failed */
    public ErasureFeedback(java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.reasons = list;
        this.comments = str;
    }

    public /* synthetic */ ErasureFeedback(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }

    public final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> getReasons() {
        return this.reasons;
    }

    public final java.lang.String getComments() {
        return this.comments;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> list = this.reasons;
        java.lang.String str = this.comments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErasureFeedback(reasons=");
        sb.append(list);
        sb.append(", comments=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.reasons.hashCode();
        java.lang.String str = this.comments;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback)) {
            return false;
        }
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback erasureFeedback = (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.reasons, erasureFeedback.reasons) && kotlin.jvm.internal.Intrinsics.areEqual(this.comments, erasureFeedback.comments);
    }

    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback copy(java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> reasons, java.lang.String comments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reasons, "");
        return new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback(reasons, comments);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getComments() {
        return this.comments;
    }

    public final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> component1() {
        return this.reasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback copy$default(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback erasureFeedback, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = erasureFeedback.reasons;
        }
        if ((i & 2) != 0) {
            str = erasureFeedback.comments;
        }
        return erasureFeedback.copy(list, str);
    }
}
