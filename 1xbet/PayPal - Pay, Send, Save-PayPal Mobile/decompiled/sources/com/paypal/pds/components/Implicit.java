package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/pds/components/Implicit;", "Lcom/paypal/pds/components/LegalConsentItem;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/pds/core/RichText;", "richTextDescription", "Lcom/paypal/pds/core/AnalyticsScope;", "analyticsScope", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/AnalyticsScope;)V", "", "checked", "updateChecked", "(Z)Lcom/paypal/pds/components/LegalConsentItem;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/core/RichText;", "component3$pds_release", "()Lcom/paypal/pds/core/AnalyticsScope;", "copy", "(Ljava/lang/String;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/Implicit;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription", "Lcom/paypal/pds/core/RichText;", "getRichTextDescription", "Lcom/paypal/pds/core/AnalyticsScope;", "getAnalyticsScope$pds_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Implicit extends com.paypal.pds.components.LegalConsentItem {
    public static final int $stable = 0;
    private final com.paypal.pds.core.AnalyticsScope analyticsScope;
    private final java.lang.String description;
    private final com.paypal.pds.core.RichText richTextDescription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Implicit(java.lang.String str, com.paypal.pds.core.RichText richText, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        this.description = str;
        this.richTextDescription = richText;
        this.analyticsScope = analyticsScope;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.pds.core.RichText getRichTextDescription() {
        return this.richTextDescription;
    }

    public /* synthetic */ Implicit(java.lang.String str, com.paypal.pds.core.RichText richText, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : richText, (i & 4) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : analyticsScope);
    }

    @Override // com.paypal.pds.components.LegalConsentItem
    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope$pds_release() {
        return this.analyticsScope;
    }

    @Override // com.paypal.pds.components.LegalConsentItem
    public final com.paypal.pds.components.LegalConsentItem updateChecked(boolean checked) {
        return copy$default(this, null, null, null, 7, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.description;
        com.paypal.pds.core.RichText richText = this.richTextDescription;
        com.paypal.pds.core.AnalyticsScope analyticsScope = this.analyticsScope;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Implicit(description=");
        sb.append(str);
        sb.append(", richTextDescription=");
        sb.append(richText);
        sb.append(", analyticsScope=");
        sb.append(analyticsScope);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.description;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.pds.core.RichText richText = this.richTextDescription;
        return (((hashCode * 31) + (richText != null ? richText.hashCode() : 0)) * 31) + this.analyticsScope.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.Implicit)) {
            return false;
        }
        com.paypal.pds.components.Implicit implicit = (com.paypal.pds.components.Implicit) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.description, implicit.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.richTextDescription, implicit.richTextDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsScope, implicit.analyticsScope);
    }

    public final com.paypal.pds.components.Implicit copy(java.lang.String description, com.paypal.pds.core.RichText richTextDescription, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        return new com.paypal.pds.components.Implicit(description, richTextDescription, analyticsScope);
    }

    /* renamed from: component3$pds_release, reason: from getter */
    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.core.RichText getRichTextDescription() {
        return this.richTextDescription;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public static /* synthetic */ com.paypal.pds.components.Implicit copy$default(com.paypal.pds.components.Implicit implicit, java.lang.String str, com.paypal.pds.core.RichText richText, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = implicit.description;
        }
        if ((i & 2) != 0) {
            richText = implicit.richTextDescription;
        }
        if ((i & 4) != 0) {
            analyticsScope = implicit.analyticsScope;
        }
        return implicit.copy(str, richText, analyticsScope);
    }

    public Implicit() {
        this(null, null, null, 7, null);
    }
}
