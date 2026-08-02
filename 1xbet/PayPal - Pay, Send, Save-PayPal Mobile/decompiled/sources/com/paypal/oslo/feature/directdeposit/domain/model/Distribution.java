package com.paypal.oslo.feature.directdeposit.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/domain/model/Distribution;", "", "", "method", "source", "", "Lcom/paypal/oslo/feature/directdeposit/domain/model/Target;", "targets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/directdeposit/domain/model/Distribution;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMethod", "getSource", "Ljava/util/List;", "getTargets"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Distribution {
    public static final int $stable = 8;
    private final java.lang.String method;
    private final java.lang.String source;
    private final java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> targets;

    public Distribution(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.method = str;
        this.source = str2;
        this.targets = list;
    }

    public final java.lang.String getMethod() {
        return this.method;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> getTargets() {
        return this.targets;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.method;
        java.lang.String str2 = this.source;
        java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> list = this.targets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Distribution(method=");
        sb.append(str);
        sb.append(", source=");
        sb.append(str2);
        sb.append(", targets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.method;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.source;
        return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.targets.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.domain.model.Distribution)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution = (com.paypal.oslo.feature.directdeposit.domain.model.Distribution) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.method, distribution.method) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, distribution.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.targets, distribution.targets);
    }

    public final com.paypal.oslo.feature.directdeposit.domain.model.Distribution copy(java.lang.String method, java.lang.String source, java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> targets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targets, "");
        return new com.paypal.oslo.feature.directdeposit.domain.model.Distribution(method, source, targets);
    }

    public final java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> component3() {
        return this.targets;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMethod() {
        return this.method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.domain.model.Distribution copy$default(com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = distribution.method;
        }
        if ((i & 2) != 0) {
            str2 = distribution.source;
        }
        if ((i & 4) != 0) {
            list = distribution.targets;
        }
        return distribution.copy(str, str2, list);
    }
}
