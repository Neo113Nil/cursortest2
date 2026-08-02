package com.paypal.oslo.feature.helpcenter.domain.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/models/AnchorAttribute;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmAttribute;", "", "href", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/domain/models/AnchorAttribute;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getHref", "getTarget", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AnchorAttribute implements com.paypal.oslo.feature.helpcenter.domain.models.EcmAttribute {
    public static final int $stable = 0;
    private final java.lang.String href;
    private final java.lang.String source;
    private final java.lang.String target;

    public AnchorAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.href = str;
        this.target = str2;
        this.source = str3;
    }

    public final java.lang.String getHref() {
        return this.href;
    }

    public final java.lang.String getTarget() {
        return this.target;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.href;
        java.lang.String str2 = this.target;
        java.lang.String str3 = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnchorAttribute(href=");
        sb.append(str);
        sb.append(", target=");
        sb.append(str2);
        sb.append(", source=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.href;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.target;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.source;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute)) {
            return false;
        }
        com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute anchorAttribute = (com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.href, anchorAttribute.href) && kotlin.jvm.internal.Intrinsics.areEqual(this.target, anchorAttribute.target) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, anchorAttribute.source);
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute copy(java.lang.String href, java.lang.String target, java.lang.String source) {
        return new com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute(href, target, source);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTarget() {
        return this.target;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHref() {
        return this.href;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute copy$default(com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute anchorAttribute, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = anchorAttribute.href;
        }
        if ((i & 2) != 0) {
            str2 = anchorAttribute.target;
        }
        if ((i & 4) != 0) {
            str3 = anchorAttribute.source;
        }
        return anchorAttribute.copy(str, str2, str3);
    }
}
