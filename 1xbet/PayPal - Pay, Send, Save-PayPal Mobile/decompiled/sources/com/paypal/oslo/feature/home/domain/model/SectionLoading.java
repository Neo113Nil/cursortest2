package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/SectionLoading;", "", "", "placeholders", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/home/domain/model/SectionLoading;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPlaceholders"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SectionLoading {
    public static final int $stable = 8;
    private final java.util.List<?> placeholders;

    public SectionLoading(java.util.List<?> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.placeholders = list;
    }

    public final java.util.List<?> getPlaceholders() {
        return this.placeholders;
    }

    public final java.lang.String toString() {
        java.util.List<?> list = this.placeholders;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionLoading(placeholders=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.placeholders.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.home.domain.model.SectionLoading) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholders, ((com.paypal.oslo.feature.home.domain.model.SectionLoading) other).placeholders);
    }

    public final com.paypal.oslo.feature.home.domain.model.SectionLoading copy(java.util.List<?> placeholders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholders, "");
        return new com.paypal.oslo.feature.home.domain.model.SectionLoading(placeholders);
    }

    public final java.util.List<?> component1() {
        return this.placeholders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.SectionLoading copy$default(com.paypal.oslo.feature.home.domain.model.SectionLoading sectionLoading, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = sectionLoading.placeholders;
        }
        return sectionLoading.copy(list);
    }
}
